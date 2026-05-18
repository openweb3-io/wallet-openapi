import {
  ServerConfiguration,
  Configuration,
  createConfiguration,
  Middleware,
  RequestContext,
  ResponseContext,
  NetworksApi,
  Currency,
  CurrenciesApi,
  CursorPageCurrency,
  AddressesApi,
  TransactionsApi,
  WalletsApi,
  WebhookEndpointsApi,
  CreateEndpoint,
  Endpoint,
  UpdateEndpoint,
  WebhookEventsApi,
  WebhookEventTypesApi,
  CursorPageEndpoint,
  RatesApi,
  GetRatesRequest,
  GetRatesResponse,
  EstimateResponse,
  CursorPageChainNetwork,
  EventType,
  CursorPageWebhookEvent,
  ResendWebhookEventResponse,
  ResendWebhookEventRequest,
  CursorPageAddress,
  Address,
  CursorPageTransaction,
  CreateTransferRequest,
  CreateTransferResponse,
  Transaction,
  CreateWithdrawRequest,
  CreateWithdrawReply,
  CreateWalletRequest,
  Wallet,
  UpdateWalletRequest,
  CursorPageAccount,
  CursorPageWallet,
  EstimateFeeRequest,
  EstimateFeeResponse,
} from "./openapi/index";
export * from "./openapi/models/all";
export * from "./openapi/apis/exception";

import * as nacl from "tweetnacl";
import sha256 from "fast-sha256";
import { encode as encodeUTF8 } from "@stablelib/utf8";

const VERSION = "0.1.1";

class UserAgentMiddleware implements Middleware {
  public pre(context: RequestContext): Promise<RequestContext> {
    context.setHeaderParam("User-Agent", `walletpay-libs/${VERSION}/javascript`);
    return Promise.resolve(context);
  }

  public post(context: ResponseContext): Promise<ResponseContext> {
    return Promise.resolve(context);
  }
}

function hexToBytes(hex: string): Uint8Array {
  const bytes = new Uint8Array(hex.length / 2);
  for (let i = 0; i < hex.length; i += 2) {
    bytes[i / 2] = parseInt(hex.substring(i, i + 2), 16);
  }
  return bytes;
}

function bytesToHex(bytes: Uint8Array): string {
  return Array.from(bytes)
    .map((b) => b.toString(16).padStart(2, "0"))
    .join("");
}

function signEd25519(data: string, secret: string): string {
  const dataBytes = encodeUTF8(data);
  const hashBytes = sha256(dataBytes);
  const seed = hexToBytes(secret);
  const keyPair = nacl.sign.keyPair.fromSeed(seed);
  const signedData = nacl.sign.detached(hashBytes, keyPair.secretKey);
  return bytesToHex(signedData);
}

class SignatureMiddleware implements Middleware {
  public constructor(private readonly secret: string) { }

  public pre(context: RequestContext): Promise<RequestContext> {
    const timestamp = new Date().getTime().toString();
    context.setHeaderParam("x-request-time", timestamp);

    let source = "";
    const body = context.getBody();
    let bodyStr = "";
    if (body) {
      if (typeof body === "object") {
        bodyStr = JSON.stringify(body);
      } else {
        bodyStr = String(body);
      }
    }
    source += bodyStr;
    const url = new URL(context.getUrl());
    source += url.pathname + url.search;
    source += timestamp;

    const sign = signEd25519(source, this.secret);
    context.setHeaderParam("x-signature", sign);

    return Promise.resolve(context);
  }

  public post(context: ResponseContext): Promise<ResponseContext> {
    return Promise.resolve(context);
  }
}

export interface ApiClientOptions {
  debug?: boolean;
  serverUrl?: string;
}

export class ApiClient {
  public readonly _configuration: Configuration;
  public readonly chainNetworks: ChainNetworks;
  public readonly currencies: Currencies;
  public readonly rates: Rates;
  public readonly addresses: Addresses;
  public readonly transactions: Transactions;
  public readonly wallets: Wallets;
  public readonly webhookEndpoints: Endpoints;
  public readonly webhookEventTypes: WebhookEventTypes;
  public readonly webhookEvents: WebhookEvents;

  public constructor(apiKey: string, secret: string, options?: ApiClientOptions) {
    const baseUrl: string = options?.serverUrl ?? "https://api.wallet.openweb3.io";

    const baseServer = new ServerConfiguration<any>(baseUrl, {});

    const config = createConfiguration({
      baseServer,
      promiseMiddleware: [new UserAgentMiddleware(), new SignatureMiddleware(secret)],
      authMethods: {
        ApiKeyAuth: apiKey,
      },
    });

    this._configuration = config;
    this.chainNetworks = new ChainNetworks(config);
    this.currencies = new Currencies(config);
    this.rates = new Rates(config);
    this.addresses = new Addresses(config);
    this.transactions = new Transactions(config);
    this.wallets = new Wallets(config);
    this.webhookEndpoints = new Endpoints(config);
    this.webhookEventTypes = new WebhookEventTypes(config);
    this.webhookEvents = new WebhookEvents(config);
  }
}

export interface PostOptions {
  idempotencyKey?: string;
}

interface ListOptions {
  page: number;
  size: number;
}

interface CursorListOptions {
  cursor?: string;
  limit: number;
}

export interface CurrencyListOptions extends CursorListOptions {
  rated?: boolean;
}

class Currencies {
  private readonly api: CurrenciesApi;

  public constructor(config: Configuration) {
    this.api = new CurrenciesApi(config);
  }

  public async list(options: CurrencyListOptions): Promise<CursorPageCurrency> {
    return await this.api.v1CurrenciesList({ ...options });
  }

  public async findByCode(code: string): Promise<Currency> {
    return await this.api.v1CurrenciesRetrieve({ code });
  }
}

interface EstimateOptions {
  baseCurrency: string;
  toCurrency: string;
  baseAmount: string;
}

class Rates {
  private readonly api: RatesApi;

  public constructor(config: Configuration) {
    this.api = new RatesApi(config);
  }

  public async estimate(options: EstimateOptions): Promise<EstimateResponse> {
    return await this.api.v1RatesEstimate({ ...options });
  }

  public async getRates(getRatesRequest: GetRatesRequest): Promise<GetRatesResponse> {
    return await this.api.v1RatesList({ request: getRatesRequest });
  }
}

export type EndpointListOptions = CursorListOptions;

class Endpoints {
  private readonly api: WebhookEndpointsApi;

  public constructor(config: Configuration) {
    this.api = new WebhookEndpointsApi(config);
  }

  public async create(
    createEndpoint: CreateEndpoint,
    options?: PostOptions
  ): Promise<Endpoint> {
    return await this.api.v1WebhooksCreate({ request: createEndpoint, ...options });
  }

  public async delete(endpointId: string) {
    await this.api.v1WebhooksDelete({ endpointId });
  }

  public async retrieve(endpointId: string): Promise<Endpoint> {
    return await this.api.v1WebhooksRetrieve({ endpointId });
  }

  public async list(options: EndpointListOptions): Promise<CursorPageEndpoint> {
    return await this.api.v1WebhooksList({ ...options });
  }

  public async update(
    endpointId: string,
    updateEndpoint: UpdateEndpoint
  ): Promise<Endpoint> {
    return await this.api.v1WebhooksUpdate({ endpointId, request: updateEndpoint });
  }
}

export interface RefundListOptions extends ListOptions {
  orderId?: string;
}

export type ListChainNetworkOptions = CursorListOptions;

class ChainNetworks {
  private readonly api: NetworksApi;

  public constructor(config: Configuration) {
    this.api = new NetworksApi(config);
  }

  public async list(options: ListChainNetworkOptions): Promise<CursorPageChainNetwork> {
    return await this.api.v1NetworksList({ ...options });
  }
}

export type ListAccountsOptions = CursorListOptions;

export type ListWalletOptions = CursorListOptions;

class Wallets {
  private readonly api: WalletsApi;

  public constructor(config: Configuration) {
    this.api = new WalletsApi(config);
  }

  public async create(createWallet: CreateWalletRequest): Promise<Wallet> {
    return await this.api.v1WalletsCreate({ request: createWallet });
  }

  public async retrieve(walletId: string): Promise<Wallet> {
    return await this.api.v1WalletsRetrieve({ walletId });
  }

  public async update(
    walletId: string,
    updateWallet: UpdateWalletRequest
  ): Promise<Wallet> {
    return await this.api.v1WalletsUpdate({ walletId, request: updateWallet });
  }

  public async listAccounts(
    walletId: string,
    options: ListAccountsOptions
  ): Promise<CursorPageAccount> {
    return await this.api.v1WalletsListAccounts({ walletId, ...options });
  }

  public async list(options: ListWalletOptions): Promise<CursorPageWallet> {
    return await this.api.v1WalletsList({ ...options });
  }
}

class WebhookEventTypes {
  private readonly api: WebhookEventTypesApi;

  public constructor(config: Configuration) {
    this.api = new WebhookEventTypesApi(config);
  }

  public async list(): Promise<Array<EventType>> {
    return await this.api.v1WebhooksEventtypesList({});
  }
}

export interface WebhookEventsListOptions extends CursorListOptions {
  eventTypes?: Array<string>;
}

class WebhookEvents {
  private readonly api: WebhookEventsApi;

  public constructor(config: Configuration) {
    this.api = new WebhookEventsApi(config);
  }

  public async list(options: WebhookEventsListOptions): Promise<CursorPageWebhookEvent> {
    return await this.api.v1WebhooksEventsList({ ...options });
  }

  public async resend(
    resendWebhookEventRequest: ResendWebhookEventRequest
  ): Promise<ResendWebhookEventResponse> {
    return await this.api.v1WebhooksEventsResend({ request: resendWebhookEventRequest });
  }
}

export interface AddressListOptions extends CursorListOptions {
  currency?: string;
  type?: string;
  walletId?: string;
}

export interface GetDepositAddressOptions {
  walletId: string;
  currency: string;
  network: string;
}

export interface ListDepositAddressesOptions extends CursorListOptions {
  walletId: string;
  currency?: string;
  network?: string;
}

class Addresses {
  private readonly api: AddressesApi;

  public constructor(config: Configuration) {
    this.api = new AddressesApi(config);
  }

  public async list(options: AddressListOptions): Promise<CursorPageAddress> {
    return await this.api.v1AddressesList({ ...options });
  }

  public async getDepositAddress(options: GetDepositAddressOptions): Promise<Address> {
    return await this.api.v1WalletsGetDepositAddress({ ...options });
  }

  public async listDepositAddresses(
    options: ListDepositAddressesOptions
  ): Promise<CursorPageAddress> {
    return await this.api.v1WalletsListDepositAddresses({ ...options });
  }
}

export interface TransactionListOptions extends CursorListOptions {
  walletId?: string;
  network?: string;
  currency?: string;
  direction?: "OUT" | "IN";
  gateway?: string;
  txhash?: string;
  status?: "PROCESSING" | "CANCELED" | "FAILED" | "SUCCEED";
}

class Transactions {
  private readonly api: TransactionsApi;

  public constructor(config: Configuration) {
    this.api = new TransactionsApi(config);
  }

  public async list(options: TransactionListOptions): Promise<CursorPageTransaction> {
    return await this.api.v1TransactionsList({ ...options });
  }

  public async retrieve(transactionId: string): Promise<Transaction> {
    return await this.api.v1TransactionsRetrieve({ transactionId });
  }

  public async transfer(
    transfer: CreateTransferRequest
  ): Promise<CreateTransferResponse> {
    return await this.api.v1TransactionsTransfer({ request: transfer });
  }

  public async withdraw(withdraw: CreateWithdrawRequest): Promise<CreateWithdrawReply> {
    return await this.api.v1TransactionsWithdraw({ request: withdraw });
  }

  public async estimateFee(
    estimateFee: EstimateFeeRequest
  ): Promise<EstimateFeeResponse> {
    return await this.api.v1TransactionsEstimateFee({ request: estimateFee });
  }
}

export class WebhookClient {
  private readonly publicKey: string;

  public constructor(publicKey: string) {
    this.publicKey = publicKey;
  }

  public async verify(payload: string, signature: string): Promise<boolean> {
    try {
      const crypto = require("crypto");
      const key = crypto.createPublicKey(this.publicKey);
      const verify = crypto.createVerify("SHA256");
      verify.update(payload);
      verify.end();
      return verify.verify(key, signature, "base64");
    } catch (error) {
      console.error("verify signature error:", error);
      return false;
    }
  }
}
