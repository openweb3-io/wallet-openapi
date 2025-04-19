import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import * as models from '../models/all';
import { Configuration} from '../configuration'

import { Account } from '../models/Account';
import { Address } from '../models/Address';
import { ChainNetwork } from '../models/ChainNetwork';
import { CreateEndpoint } from '../models/CreateEndpoint';
import { CreateExchange } from '../models/CreateExchange';
import { CreateTransferRequest } from '../models/CreateTransferRequest';
import { CreateTransferResponse } from '../models/CreateTransferResponse';
import { CreateWalletRequest } from '../models/CreateWalletRequest';
import { CreateWithdrawReply } from '../models/CreateWithdrawReply';
import { CreateWithdrawRequest } from '../models/CreateWithdrawRequest';
import { Currency } from '../models/Currency';
import { CurrencyNetwork } from '../models/CurrencyNetwork';
import { CurrencyPair } from '../models/CurrencyPair';
import { CursorPageAccount } from '../models/CursorPageAccount';
import { CursorPageAddress } from '../models/CursorPageAddress';
import { CursorPageChainNetwork } from '../models/CursorPageChainNetwork';
import { CursorPageCurrency } from '../models/CursorPageCurrency';
import { CursorPageEndpoint } from '../models/CursorPageEndpoint';
import { CursorPageExchange } from '../models/CursorPageExchange';
import { CursorPageTransaction } from '../models/CursorPageTransaction';
import { CursorPageWallet } from '../models/CursorPageWallet';
import { CursorPageWebhookEvent } from '../models/CursorPageWebhookEvent';
import { DeleteWebhookEndpointResponse } from '../models/DeleteWebhookEndpointResponse';
import { Endpoint } from '../models/Endpoint';
import { EstimateFeeRequest } from '../models/EstimateFeeRequest';
import { EstimateFeeResponse } from '../models/EstimateFeeResponse';
import { EstimateResponse } from '../models/EstimateResponse';
import { EventType } from '../models/EventType';
import { Exchange } from '../models/Exchange';
import { ExchangeCurrencyPairs } from '../models/ExchangeCurrencyPairs';
import { ExchangeSubmitResponse } from '../models/ExchangeSubmitResponse';
import { GetCurrencyPairQuotaResponse } from '../models/GetCurrencyPairQuotaResponse';
import { GetRatesRequest } from '../models/GetRatesRequest';
import { GetRatesResponse } from '../models/GetRatesResponse';
import { ListExchangeCurrencyPairsResponse } from '../models/ListExchangeCurrencyPairsResponse';
import { ModelError } from '../models/ModelError';
import { Rate } from '../models/Rate';
import { ResendWebhookEventRequest } from '../models/ResendWebhookEventRequest';
import { ResendWebhookEventResponse } from '../models/ResendWebhookEventResponse';
import { SweepAddressRequest } from '../models/SweepAddressRequest';
import { SweepAddressResponse } from '../models/SweepAddressResponse';
import { Transaction } from '../models/Transaction';
import { TransactionDirection } from '../models/TransactionDirection';
import { TransactionStatus } from '../models/TransactionStatus';
import { UpdateEndpoint } from '../models/UpdateEndpoint';
import { UpdateWalletRequest } from '../models/UpdateWalletRequest';
import { Wallet } from '../models/Wallet';
import { WebhookEvent } from '../models/WebhookEvent';
import { ObservableAddressesApi } from './ObservableAPI';

import { AddressesApiRequestFactory, AddressesApiResponseProcessor} from "../apis/AddressesApi";
export class PromiseAddressesApi {
    private api: ObservableAddressesApi

    public constructor(
        configuration: Configuration,
        requestFactory?: AddressesApiRequestFactory,
        responseProcessor?: AddressesApiResponseProcessor
    ) {
        this.api = new ObservableAddressesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * List of all available addresses.
     * List all addresses
     * @param limit The number of items to return per page.
     * @param currency The code of currency used in the transaction (e.g., TON, USDT, USD, EUR, etc.).
     * @param cursor The cursor to use for pagination.
     * @param type The type of address to retrieve.
     * @param walletId Unique system generated identifier of the wallet
     */
    public v1AddressesList(limit: number, currency?: string, cursor?: string, type?: string, walletId?: string, _options?: Configuration): Promise<CursorPageAddress> {
        const result = this.api.v1AddressesList(limit, currency, cursor, type, walletId, _options);
        return result.toPromise();
    }

    /**
     * Get wallet's deposit address
     * Get deposit address
     * @param walletId Wallet ID
     * @param currency The code of currency used in the transaction (e.g., TON, USDT, USD, EUR, etc.).
     * @param network chain network, if not specified, the default network of the currency will be used.
     */
    public v1WalletsGetDepositAddress(walletId: string, currency: string, network: string, _options?: Configuration): Promise<Address> {
        const result = this.api.v1WalletsGetDepositAddress(walletId, currency, network, _options);
        return result.toPromise();
    }

    /**
     * List wallet's deposit addresses
     * List deposit addresses
     * @param walletId Wallet ID
     * @param limit The number of items to return per page.
     * @param currency The code of currency used in the transaction (e.g., TON, USDT, USD, EUR, etc.).
     * @param cursor The cursor to use for pagination.
     * @param network chain network, if not specified, the default network of the currency will be used.
     */
    public v1WalletsListDepositAddresses(walletId: string, limit: number, currency?: string, cursor?: string, network?: string, _options?: Configuration): Promise<CursorPageAddress> {
        const result = this.api.v1WalletsListDepositAddresses(walletId, limit, currency, cursor, network, _options);
        return result.toPromise();
    }


}



import { ObservableCurrenciesApi } from './ObservableAPI';

import { CurrenciesApiRequestFactory, CurrenciesApiResponseProcessor} from "../apis/CurrenciesApi";
export class PromiseCurrenciesApi {
    private api: ObservableCurrenciesApi

    public constructor(
        configuration: Configuration,
        requestFactory?: CurrenciesApiRequestFactory,
        responseProcessor?: CurrenciesApiResponseProcessor
    ) {
        this.api = new ObservableCurrenciesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Retrieve a list of all available currencies.
     * List currencies
     * @param limit The number of items to return per page.
     * @param cursor The cursor to use for pagination.
     * @param rated 
     */
    public v1CurrenciesList(limit: number, cursor?: string, rated?: boolean, _options?: Configuration): Promise<CursorPageCurrency> {
        const result = this.api.v1CurrenciesList(limit, cursor, rated, _options);
        return result.toPromise();
    }

    /**
     * Get currency info by currency code
     * Get Currency
     * @param code Currency code
     */
    public v1CurrenciesRetrieve(code: string, _options?: Configuration): Promise<Currency> {
        const result = this.api.v1CurrenciesRetrieve(code, _options);
        return result.toPromise();
    }


}



import { ObservableExchangesApi } from './ObservableAPI';

import { ExchangesApiRequestFactory, ExchangesApiResponseProcessor} from "../apis/ExchangesApi";
export class PromiseExchangesApi {
    private api: ObservableExchangesApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ExchangesApiRequestFactory,
        responseProcessor?: ExchangesApiResponseProcessor
    ) {
        this.api = new ObservableExchangesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create a new exchange
     * create exchange
     * @param request CreateExchange
     */
    public v1ExchangesCreate(request: CreateExchange, _options?: Configuration): Promise<Exchange> {
        const result = this.api.v1ExchangesCreate(request, _options);
        return result.toPromise();
    }

    /**
     * list currency pairs
     * list currency pairs
     */
    public v1ExchangesCurrencyPairs(_options?: Configuration): Promise<ListExchangeCurrencyPairsResponse> {
        const result = this.api.v1ExchangesCurrencyPairs(_options);
        return result.toPromise();
    }

    /**
     * get currency pair quota
     * currency pair quota
     * @param fromCurrency 
     * @param toCurrency 
     */
    public v1ExchangesCurrencyQuota(fromCurrency: string, toCurrency: string, _options?: Configuration): Promise<GetCurrencyPairQuotaResponse> {
        const result = this.api.v1ExchangesCurrencyQuota(fromCurrency, toCurrency, _options);
        return result.toPromise();
    }

    /**
     * list exchanges
     * list exchanges
     * @param limit The number of items to return per page.
     * @param walletId The wallet id
     * @param cursor The cursor to use for pagination.
     */
    public v1ExchangesList(limit: number, walletId: string, cursor?: string, _options?: Configuration): Promise<CursorPageExchange> {
        const result = this.api.v1ExchangesList(limit, walletId, cursor, _options);
        return result.toPromise();
    }

    /**
     * retrieve a specified exchange
     * retrieve exchange
     * @param exchangeId Exchange ID
     */
    public v1ExchangesRetrieve(exchangeId: string, _options?: Configuration): Promise<Exchange> {
        const result = this.api.v1ExchangesRetrieve(exchangeId, _options);
        return result.toPromise();
    }

    /**
     * submit a exchange
     * submit exchange
     * @param exchangeId Exchange ID
     */
    public v1ExchangesSubmit(exchangeId: string, _options?: Configuration): Promise<ExchangeSubmitResponse> {
        const result = this.api.v1ExchangesSubmit(exchangeId, _options);
        return result.toPromise();
    }


}



import { ObservableNetworksApi } from './ObservableAPI';

import { NetworksApiRequestFactory, NetworksApiResponseProcessor} from "../apis/NetworksApi";
export class PromiseNetworksApi {
    private api: ObservableNetworksApi

    public constructor(
        configuration: Configuration,
        requestFactory?: NetworksApiRequestFactory,
        responseProcessor?: NetworksApiResponseProcessor
    ) {
        this.api = new ObservableNetworksApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * List networks
     * List Networks
     * @param limit The number of items to return per page.
     * @param cursor The cursor to use for pagination.
     */
    public v1NetworksList(limit: number, cursor?: string, _options?: Configuration): Promise<CursorPageChainNetwork> {
        const result = this.api.v1NetworksList(limit, cursor, _options);
        return result.toPromise();
    }


}



import { ObservableRatesApi } from './ObservableAPI';

import { RatesApiRequestFactory, RatesApiResponseProcessor} from "../apis/RatesApi";
export class PromiseRatesApi {
    private api: ObservableRatesApi

    public constructor(
        configuration: Configuration,
        requestFactory?: RatesApiRequestFactory,
        responseProcessor?: RatesApiResponseProcessor
    ) {
        this.api = new ObservableRatesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Estimates currency exchange amounts.
     * Estimates
     * @param baseAmount The amount of the base currency you want to convert
     * @param baseCurrency The currency code of the base currency that you want to convert from
     * @param toCurrency The currency code of the target currency that you want to convert to
     */
    public v1RatesEstimate(baseAmount: string, baseCurrency: string, toCurrency: string, _options?: Configuration): Promise<EstimateResponse> {
        const result = this.api.v1RatesEstimate(baseAmount, baseCurrency, toCurrency, _options);
        return result.toPromise();
    }

    /**
     * Query the latest exchange rates between different currencies.
     * List rates
     * @param request Request body
     */
    public v1RatesList(request: GetRatesRequest, _options?: Configuration): Promise<GetRatesResponse> {
        const result = this.api.v1RatesList(request, _options);
        return result.toPromise();
    }


}



import { ObservableSweepFundsApi } from './ObservableAPI';

import { SweepFundsApiRequestFactory, SweepFundsApiResponseProcessor} from "../apis/SweepFundsApi";
export class PromiseSweepFundsApi {
    private api: ObservableSweepFundsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: SweepFundsApiRequestFactory,
        responseProcessor?: SweepFundsApiResponseProcessor
    ) {
        this.api = new ObservableSweepFundsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Sweep funds from a single address
     * Sweep address
     * @param address Address that funds will be swept from
     * @param request Request
     */
    public v1SweepAddress(address: string, request: SweepAddressRequest, _options?: Configuration): Promise<SweepAddressResponse> {
        const result = this.api.v1SweepAddress(address, request, _options);
        return result.toPromise();
    }


}



import { ObservableTransactionsApi } from './ObservableAPI';

import { TransactionsApiRequestFactory, TransactionsApiResponseProcessor} from "../apis/TransactionsApi";
export class PromiseTransactionsApi {
    private api: ObservableTransactionsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: TransactionsApiRequestFactory,
        responseProcessor?: TransactionsApiResponseProcessor
    ) {
        this.api = new ObservableTransactionsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * estimate fee of the withdraw
     * EstimateFee
     * @param request estimate fee request
     */
    public v1TransactionsEstimateFee(request: EstimateFeeRequest, _options?: Configuration): Promise<EstimateFeeResponse> {
        const result = this.api.v1TransactionsEstimateFee(request, _options);
        return result.toPromise();
    }

    /**
     * List transactions
     * List transactions
     * @param limit The number of items to return per page.
     * @param currency The type of currency involved in the transaction.
     * @param cursor The cursor to use for pagination.
     * @param direction The direction of the transaction (e.g., incoming or outgoing).
     * @param gateway The payment gateway or platform used to process the transaction.
     * @param network The blockchain network on which the transaction takes place.
     * @param status The status of the transaction.
     * @param txhash The transaction hash, which uniquely identifies a transaction on the blockchain.
     * @param walletId Unique system generated identifier of the wallet
     */
    public v1TransactionsList(limit: number, currency?: string, cursor?: string, direction?: 'OUT' | 'IN', gateway?: string, network?: string, status?: 'PROCESSING' | 'CANCELED' | 'FAILED' | 'SUCCEED', txhash?: string, walletId?: string, _options?: Configuration): Promise<CursorPageTransaction> {
        const result = this.api.v1TransactionsList(limit, currency, cursor, direction, gateway, network, status, txhash, walletId, _options);
        return result.toPromise();
    }

    /**
     * Get a transaction by ID
     * Get transaction
     * @param transactionId Transaction ID
     */
    public v1TransactionsRetrieve(transactionId: string, _options?: Configuration): Promise<Transaction> {
        const result = this.api.v1TransactionsRetrieve(transactionId, _options);
        return result.toPromise();
    }

    /**
     * Create a transfer transaction
     * Transfer(internal)
     * @param request Request Body
     */
    public v1TransactionsTransfer(request: CreateTransferRequest, _options?: Configuration): Promise<CreateTransferResponse> {
        const result = this.api.v1TransactionsTransfer(request, _options);
        return result.toPromise();
    }

    /**
     * Create a new withdrawal request for a specified currency
     * Withdraw
     * @param request withdraw
     */
    public v1TransactionsWithdraw(request: CreateWithdrawRequest, _options?: Configuration): Promise<CreateWithdrawReply> {
        const result = this.api.v1TransactionsWithdraw(request, _options);
        return result.toPromise();
    }


}



import { ObservableWalletsApi } from './ObservableAPI';

import { WalletsApiRequestFactory, WalletsApiResponseProcessor} from "../apis/WalletsApi";
export class PromiseWalletsApi {
    private api: ObservableWalletsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: WalletsApiRequestFactory,
        responseProcessor?: WalletsApiResponseProcessor
    ) {
        this.api = new ObservableWalletsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create a Wallet
     * Create wallet
     * @param request Request body
     */
    public v1WalletsCreate(request: CreateWalletRequest, _options?: Configuration): Promise<Wallet> {
        const result = this.api.v1WalletsCreate(request, _options);
        return result.toPromise();
    }

    /**
     * List all wallets
     * List wallets
     * @param limit The number of items to return per page.
     * @param cursor The cursor to use for pagination.
     */
    public v1WalletsList(limit: number, cursor?: string, _options?: Configuration): Promise<CursorPageWallet> {
        const result = this.api.v1WalletsList(limit, cursor, _options);
        return result.toPromise();
    }

    /**
     * List wallet accounts
     * List wallet accounts
     * @param walletId Wallet ID
     * @param limit The number of items to return per page.
     * @param cursor The cursor to use for pagination.
     */
    public v1WalletsListAccounts(walletId: string, limit: number, cursor?: string, _options?: Configuration): Promise<CursorPageAccount> {
        const result = this.api.v1WalletsListAccounts(walletId, limit, cursor, _options);
        return result.toPromise();
    }

    /**
     * Get a wallet by ID
     * Get wallet
     * @param walletId Wallet ID
     */
    public v1WalletsRetrieve(walletId: string, _options?: Configuration): Promise<Wallet> {
        const result = this.api.v1WalletsRetrieve(walletId, _options);
        return result.toPromise();
    }

    /**
     * Update a Wallet
     * Update wallet
     * @param walletId Wallet ID
     * @param request Request body
     */
    public v1WalletsUpdate(walletId: string, request: UpdateWalletRequest, _options?: Configuration): Promise<Wallet> {
        const result = this.api.v1WalletsUpdate(walletId, request, _options);
        return result.toPromise();
    }


}



import { ObservableWebhookEndpointsApi } from './ObservableAPI';

import { WebhookEndpointsApiRequestFactory, WebhookEndpointsApiResponseProcessor} from "../apis/WebhookEndpointsApi";
export class PromiseWebhookEndpointsApi {
    private api: ObservableWebhookEndpointsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: WebhookEndpointsApiRequestFactory,
        responseProcessor?: WebhookEndpointsApiResponseProcessor
    ) {
        this.api = new ObservableWebhookEndpointsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create a webhook endpoint
     * Create webhook endpoint
     * @param request Request body
     */
    public v1WebhooksCreate(request: CreateEndpoint, _options?: Configuration): Promise<Endpoint> {
        const result = this.api.v1WebhooksCreate(request, _options);
        return result.toPromise();
    }

    /**
     * Delete specific webhook endpoint
     * Delete webhook endpoint
     * @param endpointId Endpoint ID
     */
    public v1WebhooksDelete(endpointId: string, _options?: Configuration): Promise<DeleteWebhookEndpointResponse> {
        const result = this.api.v1WebhooksDelete(endpointId, _options);
        return result.toPromise();
    }

    /**
     * List webhook endpoints
     * List webhook endpoints
     * @param limit The number of items to return per page.
     * @param cursor The cursor to use for pagination.
     */
    public v1WebhooksList(limit: number, cursor?: string, _options?: Configuration): Promise<CursorPageEndpoint> {
        const result = this.api.v1WebhooksList(limit, cursor, _options);
        return result.toPromise();
    }

    /**
     * Get specific webhook endpoint
     * Get webhook endpoint
     * @param endpointId Endpoint ID
     */
    public v1WebhooksRetrieve(endpointId: string, _options?: Configuration): Promise<Endpoint> {
        const result = this.api.v1WebhooksRetrieve(endpointId, _options);
        return result.toPromise();
    }

    /**
     * Update specific webhook endpoint
     * Update webhook endpoint
     * @param endpointId Endpoint ID
     * @param request Request body
     */
    public v1WebhooksUpdate(endpointId: string, request: UpdateEndpoint, _options?: Configuration): Promise<Endpoint> {
        const result = this.api.v1WebhooksUpdate(endpointId, request, _options);
        return result.toPromise();
    }


}



import { ObservableWebhookEventTypesApi } from './ObservableAPI';

import { WebhookEventTypesApiRequestFactory, WebhookEventTypesApiResponseProcessor} from "../apis/WebhookEventTypesApi";
export class PromiseWebhookEventTypesApi {
    private api: ObservableWebhookEventTypesApi

    public constructor(
        configuration: Configuration,
        requestFactory?: WebhookEventTypesApiRequestFactory,
        responseProcessor?: WebhookEventTypesApiResponseProcessor
    ) {
        this.api = new ObservableWebhookEventTypesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * List all webhook event types
     * List webhook event types
     */
    public v1WebhooksEventtypesList(_options?: Configuration): Promise<Array<EventType>> {
        const result = this.api.v1WebhooksEventtypesList(_options);
        return result.toPromise();
    }


}



import { ObservableWebhookEventsApi } from './ObservableAPI';

import { WebhookEventsApiRequestFactory, WebhookEventsApiResponseProcessor} from "../apis/WebhookEventsApi";
export class PromiseWebhookEventsApi {
    private api: ObservableWebhookEventsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: WebhookEventsApiRequestFactory,
        responseProcessor?: WebhookEventsApiResponseProcessor
    ) {
        this.api = new ObservableWebhookEventsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * List webhook events
     * List webhook events
     * @param limit The number of items to return per page.
     * @param cursor The cursor to use for pagination.
     * @param eventTypes The type of the webhook event
     */
    public v1WebhooksEventsList(limit: number, cursor?: string, eventTypes?: Array<string>, _options?: Configuration): Promise<CursorPageWebhookEvent> {
        const result = this.api.v1WebhooksEventsList(limit, cursor, eventTypes, _options);
        return result.toPromise();
    }

    /**
     * Resend a webhook event to specific endpoint
     * Resend webhook event
     * @param request The request
     */
    public v1WebhooksEventsResend(request: ResendWebhookEventRequest, _options?: Configuration): Promise<ResendWebhookEventResponse> {
        const result = this.api.v1WebhooksEventsResend(request, _options);
        return result.toPromise();
    }


}



