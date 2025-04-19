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
  WebhookEventsApi,
  WebhookEventTypesApi,
  SweepFundsApi,
  ExchangesApi,
  CursorPageEndpoint,
  RatesApi,
  GetRatesRequest,
  GetRatesResponse,
  EstimateResponse,
  CursorPageChainNetwork,
  SweepAddressRequest,
  SweepAddressResponse,
  EventType,
  CursorPageWebhookEvent,
  ResendWebhookEventResponse,
  ResendWebhookEventRequest,
  CursorPageExchange,
  Exchange,
  CreateExchange,
  ExchangeSubmitResponse,
  ListExchangeCurrencyPairsResponse,
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
import { createHash, createVerify, constants } from "crypto";
import * as nacl from "tweetnacl";

const VERSION = "0.2.0";

class UserAgentMiddleware implements Middleware {
  public pre(context: RequestContext): Promise<RequestContext> {
    context.setHeaderParam("User-Agent", `walletpay-libs/${VERSION}/javascript`);
    return Promise.resolve(context);
  }

  public post(context: ResponseContext): Promise<ResponseContext> {
    return Promise.resolve(context);
  }
}

function signEd25519(data: string, secret: string): string {
  const hash = createHash("sha256");
  hash.update(Buffer.from(data, "utf-8"));
  const hashBuffer = hash.digest();
  const keyPair = nacl.sign.keyPair.fromSeed(Buffer.from(secret, "hex"));
  const signedData = nacl.sign.detached(hashBuffer, keyPair.secretKey);
  const sign = Buffer.from(signedData).toString("hex");
  return sign;
}

class SignatureMiddleware implements Middleware {
  public constructor(private readonly secret: string) {}

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
  public readonly ChainNetworks: ChainNetworks;
  public readonly Currencies: Currencies;
  public readonly Rates: Rates;
  public readonly Addresses: Addresses;
  public readonly Transactions: Transactions;
  public readonly Wallets: Wallets;
  public readonly WebhookEndpoints: Endpoints;
  public readonly WebhookEventTypes: WebhookEventTypes;
  public readonly WebhookEvents: WebhookEvents;
  public readonly Sweep: Sweeps;
  public readonly Exchanges: Exchanges;

  public constructor(apiKey: string, secret: string, options: ApiClientOptions) {
    const baseUrl: string = options.serverUrl ?? "https://api.wallet.openweb3.io";

    const baseServer = new ServerConfiguration<any>(baseUrl, {});

    const config = createConfiguration({
      baseServer,
      promiseMiddleware: [new UserAgentMiddleware(), new SignatureMiddleware(secret)],
      authMethods: {
        ApiKeyAuth: apiKey,
      },
    });

    this._configuration = config;
    this.ChainNetworks = new ChainNetworks(config);
    this.Currencies = new Currencies(config);
    this.Rates = new Rates(config);
    this.Addresses = new Addresses(config);
    this.Transactions = new Transactions(config);
    this.Wallets = new Wallets(config);
    this.WebhookEndpoints = new Endpoints(config);
    this.WebhookEventTypes = new WebhookEventTypes(config);
    this.WebhookEvents = new WebhookEvents(config);
    this.Sweep = new Sweeps(config);
    this.Exchanges = new Exchanges(config);
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

class Sweeps {
  private readonly api: SweepFundsApi;

  public constructor(config: Configuration) {
    this.api = new SweepFundsApi(config);
  }

  public async sweepAddress(
    address: string,
    sweepAddressRequest: SweepAddressRequest
  ): Promise<SweepAddressResponse> {
    return await this.api.v1SweepAddress({ address, request: sweepAddressRequest });
  }
}

export interface ExchangeListOptions extends CursorListOptions {
  walletId: string;
}

class Exchanges {
  private readonly api: ExchangesApi;

  public constructor(config: Configuration) {
    this.api = new ExchangesApi(config);
  }

  public async list(options: ExchangeListOptions): Promise<CursorPageExchange> {
    return await this.api.v1ExchangesList({ ...options });
  }

  public async retrieve(exchangeId: string): Promise<Exchange> {
    return await this.api.v1ExchangesRetrieve({ exchangeId });
  }

  public async create(createExchange: CreateExchange): Promise<Exchange> {
    return await this.api.v1ExchangesCreate({ request: createExchange });
  }

  public async submit(exchangeId: string): Promise<ExchangeSubmitResponse> {
    return await this.api.v1ExchangesSubmit({ exchangeId });
  }

  public async listCurrencyPairs(): Promise<ListExchangeCurrencyPairsResponse> {
    return await this.api.v1ExchangesCurrencyPairs({});
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
      // convert payload to buffer
      const payloadBuffer = Buffer.from(payload);
      // convert signature to buffer
      const signatureBuffer = Buffer.from(signature, "base64");
      // create verify object, using pkcs#1 format public key
      const verify = createVerify("sha256");
      verify.update(payloadBuffer);

      // verify signature
      const isValid = verify.verify(
        {
          key: this.publicKey,
          padding: constants.RSA_PKCS1_PADDING,
        },
        signatureBuffer
      );

      return isValid;
    } catch (error) {
      console.error("verify signature error:", error);
      return false;
    }
  }
}
