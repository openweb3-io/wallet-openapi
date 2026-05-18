import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import * as models from '../models/all';
import { Configuration} from '../configuration'

import { Account } from '../models/Account';
import { Address } from '../models/Address';
import { ChainNetwork } from '../models/ChainNetwork';
import { CreateEndpoint } from '../models/CreateEndpoint';
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
import { CursorPageTransaction } from '../models/CursorPageTransaction';
import { CursorPageWallet } from '../models/CursorPageWallet';
import { CursorPageWebhookEvent } from '../models/CursorPageWebhookEvent';
import { DeleteWebhookEndpointResponse } from '../models/DeleteWebhookEndpointResponse';
import { Endpoint } from '../models/Endpoint';
import { EstimateFeeRequest } from '../models/EstimateFeeRequest';
import { EstimateFeeResponse } from '../models/EstimateFeeResponse';
import { EstimateResponse } from '../models/EstimateResponse';
import { EventType } from '../models/EventType';
import { GetRatesRequest } from '../models/GetRatesRequest';
import { GetRatesResponse } from '../models/GetRatesResponse';
import { ModelError } from '../models/ModelError';
import { Rate } from '../models/Rate';
import { ResendWebhookEventRequest } from '../models/ResendWebhookEventRequest';
import { ResendWebhookEventResponse } from '../models/ResendWebhookEventResponse';
import { Transaction } from '../models/Transaction';
import { TransactionDirection } from '../models/TransactionDirection';
import { TransactionStatus } from '../models/TransactionStatus';
import { UpdateEndpoint } from '../models/UpdateEndpoint';
import { UpdateWalletRequest } from '../models/UpdateWalletRequest';
import { Wallet } from '../models/Wallet';
import { WebhookEvent } from '../models/WebhookEvent';

import { ObservableAddressesApi } from "./ObservableAPI";
import { AddressesApiRequestFactory, AddressesApiResponseProcessor} from "../apis/AddressesApi";

export interface AddressesApiV1AddressesListRequest {
    /**
     * The number of items to return per page.
     * @type number
     * @memberof AddressesApiv1AddressesList
     */
    limit: number
    /**
     * The code of currency used in the transaction (e.g., TON, USDT, USD, EUR, etc.).
     * @type string
     * @memberof AddressesApiv1AddressesList
     */
    currency?: string
    /**
     * The cursor to use for pagination.
     * @type string
     * @memberof AddressesApiv1AddressesList
     */
    cursor?: string
    /**
     * The type of address to retrieve.
     * @type string
     * @memberof AddressesApiv1AddressesList
     */
    type?: string
    /**
     * Unique system generated identifier of the wallet
     * @type string
     * @memberof AddressesApiv1AddressesList
     */
    walletId?: string
}

export interface AddressesApiV1WalletsGetDepositAddressRequest {
    /**
     * Wallet ID
     * @type string
     * @memberof AddressesApiv1WalletsGetDepositAddress
     */
    walletId: string
    /**
     * The code of currency used in the transaction (e.g., TON, USDT, USD, EUR, etc.).
     * @type string
     * @memberof AddressesApiv1WalletsGetDepositAddress
     */
    currency: string
    /**
     * chain network, if not specified, the default network of the currency will be used.
     * @type string
     * @memberof AddressesApiv1WalletsGetDepositAddress
     */
    network: string
}

export interface AddressesApiV1WalletsListDepositAddressesRequest {
    /**
     * Wallet ID
     * @type string
     * @memberof AddressesApiv1WalletsListDepositAddresses
     */
    walletId: string
    /**
     * The number of items to return per page.
     * @type number
     * @memberof AddressesApiv1WalletsListDepositAddresses
     */
    limit: number
    /**
     * The code of currency used in the transaction (e.g., TON, USDT, USD, EUR, etc.).
     * @type string
     * @memberof AddressesApiv1WalletsListDepositAddresses
     */
    currency?: string
    /**
     * The cursor to use for pagination.
     * @type string
     * @memberof AddressesApiv1WalletsListDepositAddresses
     */
    cursor?: string
    /**
     * chain network, if not specified, the default network of the currency will be used.
     * @type string
     * @memberof AddressesApiv1WalletsListDepositAddresses
     */
    network?: string
}

export class ObjectAddressesApi {
    private api: ObservableAddressesApi

    public constructor(configuration: Configuration, requestFactory?: AddressesApiRequestFactory, responseProcessor?: AddressesApiResponseProcessor) {
        this.api = new ObservableAddressesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * List of all available addresses.
     * List all addresses
     * @param param the request object
     */
    public v1AddressesList(param: AddressesApiV1AddressesListRequest, options?: Configuration): Promise<CursorPageAddress> {
        return this.api.v1AddressesList(param.limit, param.currency, param.cursor, param.type, param.walletId,  options).toPromise();
    }

    /**
     * Get wallet's deposit address
     * Get deposit address
     * @param param the request object
     */
    public v1WalletsGetDepositAddress(param: AddressesApiV1WalletsGetDepositAddressRequest, options?: Configuration): Promise<Address> {
        return this.api.v1WalletsGetDepositAddress(param.walletId, param.currency, param.network,  options).toPromise();
    }

    /**
     * List wallet's deposit addresses
     * List deposit addresses
     * @param param the request object
     */
    public v1WalletsListDepositAddresses(param: AddressesApiV1WalletsListDepositAddressesRequest, options?: Configuration): Promise<CursorPageAddress> {
        return this.api.v1WalletsListDepositAddresses(param.walletId, param.limit, param.currency, param.cursor, param.network,  options).toPromise();
    }

}

import { ObservableCurrenciesApi } from "./ObservableAPI";
import { CurrenciesApiRequestFactory, CurrenciesApiResponseProcessor} from "../apis/CurrenciesApi";

export interface CurrenciesApiV1CurrenciesListRequest {
    /**
     * The number of items to return per page.
     * @type number
     * @memberof CurrenciesApiv1CurrenciesList
     */
    limit: number
    /**
     * The cursor to use for pagination.
     * @type string
     * @memberof CurrenciesApiv1CurrenciesList
     */
    cursor?: string
    /**
     * 
     * @type boolean
     * @memberof CurrenciesApiv1CurrenciesList
     */
    rated?: boolean
}

export interface CurrenciesApiV1CurrenciesRetrieveRequest {
    /**
     * Currency code
     * @type string
     * @memberof CurrenciesApiv1CurrenciesRetrieve
     */
    code: string
}

export class ObjectCurrenciesApi {
    private api: ObservableCurrenciesApi

    public constructor(configuration: Configuration, requestFactory?: CurrenciesApiRequestFactory, responseProcessor?: CurrenciesApiResponseProcessor) {
        this.api = new ObservableCurrenciesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Retrieve a list of all available currencies.
     * List currencies
     * @param param the request object
     */
    public v1CurrenciesList(param: CurrenciesApiV1CurrenciesListRequest, options?: Configuration): Promise<CursorPageCurrency> {
        return this.api.v1CurrenciesList(param.limit, param.cursor, param.rated,  options).toPromise();
    }

    /**
     * Get currency info by currency code
     * Get Currency
     * @param param the request object
     */
    public v1CurrenciesRetrieve(param: CurrenciesApiV1CurrenciesRetrieveRequest, options?: Configuration): Promise<Currency> {
        return this.api.v1CurrenciesRetrieve(param.code,  options).toPromise();
    }

}

import { ObservableNetworksApi } from "./ObservableAPI";
import { NetworksApiRequestFactory, NetworksApiResponseProcessor} from "../apis/NetworksApi";

export interface NetworksApiV1NetworksListRequest {
    /**
     * The number of items to return per page.
     * @type number
     * @memberof NetworksApiv1NetworksList
     */
    limit: number
    /**
     * The cursor to use for pagination.
     * @type string
     * @memberof NetworksApiv1NetworksList
     */
    cursor?: string
}

export class ObjectNetworksApi {
    private api: ObservableNetworksApi

    public constructor(configuration: Configuration, requestFactory?: NetworksApiRequestFactory, responseProcessor?: NetworksApiResponseProcessor) {
        this.api = new ObservableNetworksApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * List networks
     * List Networks
     * @param param the request object
     */
    public v1NetworksList(param: NetworksApiV1NetworksListRequest, options?: Configuration): Promise<CursorPageChainNetwork> {
        return this.api.v1NetworksList(param.limit, param.cursor,  options).toPromise();
    }

}

import { ObservableRatesApi } from "./ObservableAPI";
import { RatesApiRequestFactory, RatesApiResponseProcessor} from "../apis/RatesApi";

export interface RatesApiV1RatesEstimateRequest {
    /**
     * The amount of the base currency you want to convert in nano units (multiply by 10^decimals)
     * @type string
     * @memberof RatesApiv1RatesEstimate
     */
    baseAmount: string
    /**
     * The currency code of the base currency that you want to convert from
     * @type string
     * @memberof RatesApiv1RatesEstimate
     */
    baseCurrency: string
    /**
     * The currency code of the target currency that you want to convert to
     * @type string
     * @memberof RatesApiv1RatesEstimate
     */
    toCurrency: string
}

export interface RatesApiV1RatesListRequest {
    /**
     * Request body
     * @type GetRatesRequest
     * @memberof RatesApiv1RatesList
     */
    request: GetRatesRequest
}

export class ObjectRatesApi {
    private api: ObservableRatesApi

    public constructor(configuration: Configuration, requestFactory?: RatesApiRequestFactory, responseProcessor?: RatesApiResponseProcessor) {
        this.api = new ObservableRatesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Estimates currency exchange amounts.
     * Estimates
     * @param param the request object
     */
    public v1RatesEstimate(param: RatesApiV1RatesEstimateRequest, options?: Configuration): Promise<EstimateResponse> {
        return this.api.v1RatesEstimate(param.baseAmount, param.baseCurrency, param.toCurrency,  options).toPromise();
    }

    /**
     * Query the latest exchange rates between different currencies.
     * List rates
     * @param param the request object
     */
    public v1RatesList(param: RatesApiV1RatesListRequest, options?: Configuration): Promise<GetRatesResponse> {
        return this.api.v1RatesList(param.request,  options).toPromise();
    }

}

import { ObservableTransactionsApi } from "./ObservableAPI";
import { TransactionsApiRequestFactory, TransactionsApiResponseProcessor} from "../apis/TransactionsApi";

export interface TransactionsApiV1TransactionsEstimateFeeRequest {
    /**
     * estimate fee request
     * @type EstimateFeeRequest
     * @memberof TransactionsApiv1TransactionsEstimateFee
     */
    request: EstimateFeeRequest
}

export interface TransactionsApiV1TransactionsListRequest {
    /**
     * The number of items to return per page.
     * @type number
     * @memberof TransactionsApiv1TransactionsList
     */
    limit: number
    /**
     * The type of currency involved in the transaction.
     * @type string
     * @memberof TransactionsApiv1TransactionsList
     */
    currency?: string
    /**
     * The cursor to use for pagination.
     * @type string
     * @memberof TransactionsApiv1TransactionsList
     */
    cursor?: string
    /**
     * The direction of the transaction (e.g., incoming or outgoing).
     * @type &#39;OUT&#39; | &#39;IN&#39;
     * @memberof TransactionsApiv1TransactionsList
     */
    direction?: 'OUT' | 'IN'
    /**
     * The payment gateway or platform used to process the transaction.
     * @type string
     * @memberof TransactionsApiv1TransactionsList
     */
    gateway?: string
    /**
     * The blockchain network on which the transaction takes place.
     * @type string
     * @memberof TransactionsApiv1TransactionsList
     */
    network?: string
    /**
     * The status of the transaction.
     * @type &#39;PROCESSING&#39; | &#39;CANCELED&#39; | &#39;FAILED&#39; | &#39;SUCCEED&#39;
     * @memberof TransactionsApiv1TransactionsList
     */
    status?: 'PROCESSING' | 'CANCELED' | 'FAILED' | 'SUCCEED'
    /**
     * The transaction hash, which uniquely identifies a transaction on the blockchain.
     * @type string
     * @memberof TransactionsApiv1TransactionsList
     */
    txhash?: string
    /**
     * Unique system generated identifier of the wallet
     * @type string
     * @memberof TransactionsApiv1TransactionsList
     */
    walletId?: string
}

export interface TransactionsApiV1TransactionsRetrieveRequest {
    /**
     * Transaction ID
     * @type string
     * @memberof TransactionsApiv1TransactionsRetrieve
     */
    transactionId: string
}

export interface TransactionsApiV1TransactionsTransferRequest {
    /**
     * Request Body
     * @type CreateTransferRequest
     * @memberof TransactionsApiv1TransactionsTransfer
     */
    request: CreateTransferRequest
}

export interface TransactionsApiV1TransactionsWithdrawRequest {
    /**
     * withdraw
     * @type CreateWithdrawRequest
     * @memberof TransactionsApiv1TransactionsWithdraw
     */
    request: CreateWithdrawRequest
}

export class ObjectTransactionsApi {
    private api: ObservableTransactionsApi

    public constructor(configuration: Configuration, requestFactory?: TransactionsApiRequestFactory, responseProcessor?: TransactionsApiResponseProcessor) {
        this.api = new ObservableTransactionsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * estimate fee of the withdraw
     * EstimateFee
     * @param param the request object
     */
    public v1TransactionsEstimateFee(param: TransactionsApiV1TransactionsEstimateFeeRequest, options?: Configuration): Promise<EstimateFeeResponse> {
        return this.api.v1TransactionsEstimateFee(param.request,  options).toPromise();
    }

    /**
     * List transactions
     * List transactions
     * @param param the request object
     */
    public v1TransactionsList(param: TransactionsApiV1TransactionsListRequest, options?: Configuration): Promise<CursorPageTransaction> {
        return this.api.v1TransactionsList(param.limit, param.currency, param.cursor, param.direction, param.gateway, param.network, param.status, param.txhash, param.walletId,  options).toPromise();
    }

    /**
     * Get a transaction by ID
     * Get transaction
     * @param param the request object
     */
    public v1TransactionsRetrieve(param: TransactionsApiV1TransactionsRetrieveRequest, options?: Configuration): Promise<Transaction> {
        return this.api.v1TransactionsRetrieve(param.transactionId,  options).toPromise();
    }

    /**
     * Create a transfer transaction
     * Transfer(internal)
     * @param param the request object
     */
    public v1TransactionsTransfer(param: TransactionsApiV1TransactionsTransferRequest, options?: Configuration): Promise<CreateTransferResponse> {
        return this.api.v1TransactionsTransfer(param.request,  options).toPromise();
    }

    /**
     * Create a new withdrawal request for a specified currency
     * Withdraw
     * @param param the request object
     */
    public v1TransactionsWithdraw(param: TransactionsApiV1TransactionsWithdrawRequest, options?: Configuration): Promise<CreateWithdrawReply> {
        return this.api.v1TransactionsWithdraw(param.request,  options).toPromise();
    }

}

import { ObservableWalletsApi } from "./ObservableAPI";
import { WalletsApiRequestFactory, WalletsApiResponseProcessor} from "../apis/WalletsApi";

export interface WalletsApiV1WalletsCreateRequest {
    /**
     * Request body
     * @type CreateWalletRequest
     * @memberof WalletsApiv1WalletsCreate
     */
    request: CreateWalletRequest
}

export interface WalletsApiV1WalletsListRequest {
    /**
     * The number of items to return per page.
     * @type number
     * @memberof WalletsApiv1WalletsList
     */
    limit: number
    /**
     * The cursor to use for pagination.
     * @type string
     * @memberof WalletsApiv1WalletsList
     */
    cursor?: string
}

export interface WalletsApiV1WalletsListAccountsRequest {
    /**
     * Wallet ID
     * @type string
     * @memberof WalletsApiv1WalletsListAccounts
     */
    walletId: string
    /**
     * The number of items to return per page.
     * @type number
     * @memberof WalletsApiv1WalletsListAccounts
     */
    limit: number
    /**
     * The cursor to use for pagination.
     * @type string
     * @memberof WalletsApiv1WalletsListAccounts
     */
    cursor?: string
}

export interface WalletsApiV1WalletsRetrieveRequest {
    /**
     * Wallet ID
     * @type string
     * @memberof WalletsApiv1WalletsRetrieve
     */
    walletId: string
}

export interface WalletsApiV1WalletsUpdateRequest {
    /**
     * Wallet ID
     * @type string
     * @memberof WalletsApiv1WalletsUpdate
     */
    walletId: string
    /**
     * Request body
     * @type UpdateWalletRequest
     * @memberof WalletsApiv1WalletsUpdate
     */
    request: UpdateWalletRequest
}

export class ObjectWalletsApi {
    private api: ObservableWalletsApi

    public constructor(configuration: Configuration, requestFactory?: WalletsApiRequestFactory, responseProcessor?: WalletsApiResponseProcessor) {
        this.api = new ObservableWalletsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create a Wallet
     * Create wallet
     * @param param the request object
     */
    public v1WalletsCreate(param: WalletsApiV1WalletsCreateRequest, options?: Configuration): Promise<Wallet> {
        return this.api.v1WalletsCreate(param.request,  options).toPromise();
    }

    /**
     * List all wallets
     * List wallets
     * @param param the request object
     */
    public v1WalletsList(param: WalletsApiV1WalletsListRequest, options?: Configuration): Promise<CursorPageWallet> {
        return this.api.v1WalletsList(param.limit, param.cursor,  options).toPromise();
    }

    /**
     * List wallet accounts
     * List wallet accounts
     * @param param the request object
     */
    public v1WalletsListAccounts(param: WalletsApiV1WalletsListAccountsRequest, options?: Configuration): Promise<CursorPageAccount> {
        return this.api.v1WalletsListAccounts(param.walletId, param.limit, param.cursor,  options).toPromise();
    }

    /**
     * Get a wallet by ID
     * Get wallet
     * @param param the request object
     */
    public v1WalletsRetrieve(param: WalletsApiV1WalletsRetrieveRequest, options?: Configuration): Promise<Wallet> {
        return this.api.v1WalletsRetrieve(param.walletId,  options).toPromise();
    }

    /**
     * Update a Wallet
     * Update wallet
     * @param param the request object
     */
    public v1WalletsUpdate(param: WalletsApiV1WalletsUpdateRequest, options?: Configuration): Promise<Wallet> {
        return this.api.v1WalletsUpdate(param.walletId, param.request,  options).toPromise();
    }

}

import { ObservableWebhookEndpointsApi } from "./ObservableAPI";
import { WebhookEndpointsApiRequestFactory, WebhookEndpointsApiResponseProcessor} from "../apis/WebhookEndpointsApi";

export interface WebhookEndpointsApiV1WebhooksCreateRequest {
    /**
     * Request body
     * @type CreateEndpoint
     * @memberof WebhookEndpointsApiv1WebhooksCreate
     */
    request: CreateEndpoint
}

export interface WebhookEndpointsApiV1WebhooksDeleteRequest {
    /**
     * Endpoint ID
     * @type string
     * @memberof WebhookEndpointsApiv1WebhooksDelete
     */
    endpointId: string
}

export interface WebhookEndpointsApiV1WebhooksListRequest {
    /**
     * The number of items to return per page.
     * @type number
     * @memberof WebhookEndpointsApiv1WebhooksList
     */
    limit: number
    /**
     * The cursor to use for pagination.
     * @type string
     * @memberof WebhookEndpointsApiv1WebhooksList
     */
    cursor?: string
}

export interface WebhookEndpointsApiV1WebhooksRetrieveRequest {
    /**
     * Endpoint ID
     * @type string
     * @memberof WebhookEndpointsApiv1WebhooksRetrieve
     */
    endpointId: string
}

export interface WebhookEndpointsApiV1WebhooksUpdateRequest {
    /**
     * Endpoint ID
     * @type string
     * @memberof WebhookEndpointsApiv1WebhooksUpdate
     */
    endpointId: string
    /**
     * Request body
     * @type UpdateEndpoint
     * @memberof WebhookEndpointsApiv1WebhooksUpdate
     */
    request: UpdateEndpoint
}

export class ObjectWebhookEndpointsApi {
    private api: ObservableWebhookEndpointsApi

    public constructor(configuration: Configuration, requestFactory?: WebhookEndpointsApiRequestFactory, responseProcessor?: WebhookEndpointsApiResponseProcessor) {
        this.api = new ObservableWebhookEndpointsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Create a webhook endpoint
     * Create webhook endpoint
     * @param param the request object
     */
    public v1WebhooksCreate(param: WebhookEndpointsApiV1WebhooksCreateRequest, options?: Configuration): Promise<Endpoint> {
        return this.api.v1WebhooksCreate(param.request,  options).toPromise();
    }

    /**
     * Delete specific webhook endpoint
     * Delete webhook endpoint
     * @param param the request object
     */
    public v1WebhooksDelete(param: WebhookEndpointsApiV1WebhooksDeleteRequest, options?: Configuration): Promise<DeleteWebhookEndpointResponse> {
        return this.api.v1WebhooksDelete(param.endpointId,  options).toPromise();
    }

    /**
     * List webhook endpoints
     * List webhook endpoints
     * @param param the request object
     */
    public v1WebhooksList(param: WebhookEndpointsApiV1WebhooksListRequest, options?: Configuration): Promise<CursorPageEndpoint> {
        return this.api.v1WebhooksList(param.limit, param.cursor,  options).toPromise();
    }

    /**
     * Get specific webhook endpoint
     * Get webhook endpoint
     * @param param the request object
     */
    public v1WebhooksRetrieve(param: WebhookEndpointsApiV1WebhooksRetrieveRequest, options?: Configuration): Promise<Endpoint> {
        return this.api.v1WebhooksRetrieve(param.endpointId,  options).toPromise();
    }

    /**
     * Update specific webhook endpoint
     * Update webhook endpoint
     * @param param the request object
     */
    public v1WebhooksUpdate(param: WebhookEndpointsApiV1WebhooksUpdateRequest, options?: Configuration): Promise<Endpoint> {
        return this.api.v1WebhooksUpdate(param.endpointId, param.request,  options).toPromise();
    }

}

import { ObservableWebhookEventTypesApi } from "./ObservableAPI";
import { WebhookEventTypesApiRequestFactory, WebhookEventTypesApiResponseProcessor} from "../apis/WebhookEventTypesApi";

export interface WebhookEventTypesApiV1WebhooksEventtypesListRequest {
}

export class ObjectWebhookEventTypesApi {
    private api: ObservableWebhookEventTypesApi

    public constructor(configuration: Configuration, requestFactory?: WebhookEventTypesApiRequestFactory, responseProcessor?: WebhookEventTypesApiResponseProcessor) {
        this.api = new ObservableWebhookEventTypesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * List all webhook event types
     * List webhook event types
     * @param param the request object
     */
    public v1WebhooksEventtypesList(param: WebhookEventTypesApiV1WebhooksEventtypesListRequest, options?: Configuration): Promise<Array<EventType>> {
        return this.api.v1WebhooksEventtypesList( options).toPromise();
    }

}

import { ObservableWebhookEventsApi } from "./ObservableAPI";
import { WebhookEventsApiRequestFactory, WebhookEventsApiResponseProcessor} from "../apis/WebhookEventsApi";

export interface WebhookEventsApiV1WebhooksEventsListRequest {
    /**
     * The number of items to return per page.
     * @type number
     * @memberof WebhookEventsApiv1WebhooksEventsList
     */
    limit: number
    /**
     * The cursor to use for pagination.
     * @type string
     * @memberof WebhookEventsApiv1WebhooksEventsList
     */
    cursor?: string
    /**
     * The type of the webhook event
     * @type Array&lt;string&gt;
     * @memberof WebhookEventsApiv1WebhooksEventsList
     */
    eventTypes?: Array<string>
}

export interface WebhookEventsApiV1WebhooksEventsResendRequest {
    /**
     * The request
     * @type ResendWebhookEventRequest
     * @memberof WebhookEventsApiv1WebhooksEventsResend
     */
    request: ResendWebhookEventRequest
}

export class ObjectWebhookEventsApi {
    private api: ObservableWebhookEventsApi

    public constructor(configuration: Configuration, requestFactory?: WebhookEventsApiRequestFactory, responseProcessor?: WebhookEventsApiResponseProcessor) {
        this.api = new ObservableWebhookEventsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * List webhook events
     * List webhook events
     * @param param the request object
     */
    public v1WebhooksEventsList(param: WebhookEventsApiV1WebhooksEventsListRequest, options?: Configuration): Promise<CursorPageWebhookEvent> {
        return this.api.v1WebhooksEventsList(param.limit, param.cursor, param.eventTypes,  options).toPromise();
    }

    /**
     * Resend a webhook event to specific endpoint
     * Resend webhook event
     * @param param the request object
     */
    public v1WebhooksEventsResend(param: WebhookEventsApiV1WebhooksEventsResendRequest, options?: Configuration): Promise<ResendWebhookEventResponse> {
        return this.api.v1WebhooksEventsResend(param.request,  options).toPromise();
    }

}
