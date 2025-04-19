import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import * as models from '../models/all';
import { Configuration} from '../configuration'
import { Observable, of, from } from '../rxjsStub';
import {mergeMap, map} from  '../rxjsStub';
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

import { AddressesApiRequestFactory, AddressesApiResponseProcessor} from "../apis/AddressesApi";
export class ObservableAddressesApi {
    private requestFactory: AddressesApiRequestFactory;
    private responseProcessor: AddressesApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: AddressesApiRequestFactory,
        responseProcessor?: AddressesApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new AddressesApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new AddressesApiResponseProcessor();
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
    public v1AddressesList(limit: number, currency?: string, cursor?: string, type?: string, walletId?: string, _options?: Configuration): Observable<CursorPageAddress> {
        const requestContextPromise = this.requestFactory.v1AddressesList(limit, currency, cursor, type, walletId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1AddressesList(rsp)));
            }));
    }
 
    /**
     * Get wallet's deposit address
     * Get deposit address
     * @param walletId Wallet ID
     * @param currency The code of currency used in the transaction (e.g., TON, USDT, USD, EUR, etc.).
     * @param network chain network, if not specified, the default network of the currency will be used.
     */
    public v1WalletsGetDepositAddress(walletId: string, currency: string, network: string, _options?: Configuration): Observable<Address> {
        const requestContextPromise = this.requestFactory.v1WalletsGetDepositAddress(walletId, currency, network, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1WalletsGetDepositAddress(rsp)));
            }));
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
    public v1WalletsListDepositAddresses(walletId: string, limit: number, currency?: string, cursor?: string, network?: string, _options?: Configuration): Observable<CursorPageAddress> {
        const requestContextPromise = this.requestFactory.v1WalletsListDepositAddresses(walletId, limit, currency, cursor, network, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1WalletsListDepositAddresses(rsp)));
            }));
    }
 
}

import { CurrenciesApiRequestFactory, CurrenciesApiResponseProcessor} from "../apis/CurrenciesApi";
export class ObservableCurrenciesApi {
    private requestFactory: CurrenciesApiRequestFactory;
    private responseProcessor: CurrenciesApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: CurrenciesApiRequestFactory,
        responseProcessor?: CurrenciesApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new CurrenciesApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new CurrenciesApiResponseProcessor();
    }

    /**
     * Retrieve a list of all available currencies.
     * List currencies
     * @param limit The number of items to return per page.
     * @param cursor The cursor to use for pagination.
     * @param rated 
     */
    public v1CurrenciesList(limit: number, cursor?: string, rated?: boolean, _options?: Configuration): Observable<CursorPageCurrency> {
        const requestContextPromise = this.requestFactory.v1CurrenciesList(limit, cursor, rated, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1CurrenciesList(rsp)));
            }));
    }
 
    /**
     * Get currency info by currency code
     * Get Currency
     * @param code Currency code
     */
    public v1CurrenciesRetrieve(code: string, _options?: Configuration): Observable<Currency> {
        const requestContextPromise = this.requestFactory.v1CurrenciesRetrieve(code, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1CurrenciesRetrieve(rsp)));
            }));
    }
 
}

import { ExchangesApiRequestFactory, ExchangesApiResponseProcessor} from "../apis/ExchangesApi";
export class ObservableExchangesApi {
    private requestFactory: ExchangesApiRequestFactory;
    private responseProcessor: ExchangesApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ExchangesApiRequestFactory,
        responseProcessor?: ExchangesApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ExchangesApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ExchangesApiResponseProcessor();
    }

    /**
     * Create a new exchange
     * create exchange
     * @param request CreateExchange
     */
    public v1ExchangesCreate(request: CreateExchange, _options?: Configuration): Observable<Exchange> {
        const requestContextPromise = this.requestFactory.v1ExchangesCreate(request, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1ExchangesCreate(rsp)));
            }));
    }
 
    /**
     * list currency pairs
     * list currency pairs
     */
    public v1ExchangesCurrencyPairs(_options?: Configuration): Observable<ListExchangeCurrencyPairsResponse> {
        const requestContextPromise = this.requestFactory.v1ExchangesCurrencyPairs(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1ExchangesCurrencyPairs(rsp)));
            }));
    }
 
    /**
     * get currency pair quota
     * currency pair quota
     * @param fromCurrency 
     * @param toCurrency 
     */
    public v1ExchangesCurrencyQuota(fromCurrency: string, toCurrency: string, _options?: Configuration): Observable<GetCurrencyPairQuotaResponse> {
        const requestContextPromise = this.requestFactory.v1ExchangesCurrencyQuota(fromCurrency, toCurrency, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1ExchangesCurrencyQuota(rsp)));
            }));
    }
 
    /**
     * list exchanges
     * list exchanges
     * @param limit The number of items to return per page.
     * @param walletId The wallet id
     * @param cursor The cursor to use for pagination.
     */
    public v1ExchangesList(limit: number, walletId: string, cursor?: string, _options?: Configuration): Observable<CursorPageExchange> {
        const requestContextPromise = this.requestFactory.v1ExchangesList(limit, walletId, cursor, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1ExchangesList(rsp)));
            }));
    }
 
    /**
     * retrieve a specified exchange
     * retrieve exchange
     * @param exchangeId Exchange ID
     */
    public v1ExchangesRetrieve(exchangeId: string, _options?: Configuration): Observable<Exchange> {
        const requestContextPromise = this.requestFactory.v1ExchangesRetrieve(exchangeId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1ExchangesRetrieve(rsp)));
            }));
    }
 
    /**
     * submit a exchange
     * submit exchange
     * @param exchangeId Exchange ID
     */
    public v1ExchangesSubmit(exchangeId: string, _options?: Configuration): Observable<ExchangeSubmitResponse> {
        const requestContextPromise = this.requestFactory.v1ExchangesSubmit(exchangeId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1ExchangesSubmit(rsp)));
            }));
    }
 
}

import { NetworksApiRequestFactory, NetworksApiResponseProcessor} from "../apis/NetworksApi";
export class ObservableNetworksApi {
    private requestFactory: NetworksApiRequestFactory;
    private responseProcessor: NetworksApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: NetworksApiRequestFactory,
        responseProcessor?: NetworksApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new NetworksApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new NetworksApiResponseProcessor();
    }

    /**
     * List networks
     * List Networks
     * @param limit The number of items to return per page.
     * @param cursor The cursor to use for pagination.
     */
    public v1NetworksList(limit: number, cursor?: string, _options?: Configuration): Observable<CursorPageChainNetwork> {
        const requestContextPromise = this.requestFactory.v1NetworksList(limit, cursor, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1NetworksList(rsp)));
            }));
    }
 
}

import { RatesApiRequestFactory, RatesApiResponseProcessor} from "../apis/RatesApi";
export class ObservableRatesApi {
    private requestFactory: RatesApiRequestFactory;
    private responseProcessor: RatesApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: RatesApiRequestFactory,
        responseProcessor?: RatesApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new RatesApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new RatesApiResponseProcessor();
    }

    /**
     * Estimates currency exchange amounts.
     * Estimates
     * @param baseAmount The amount of the base currency you want to convert
     * @param baseCurrency The currency code of the base currency that you want to convert from
     * @param toCurrency The currency code of the target currency that you want to convert to
     */
    public v1RatesEstimate(baseAmount: string, baseCurrency: string, toCurrency: string, _options?: Configuration): Observable<EstimateResponse> {
        const requestContextPromise = this.requestFactory.v1RatesEstimate(baseAmount, baseCurrency, toCurrency, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1RatesEstimate(rsp)));
            }));
    }
 
    /**
     * Query the latest exchange rates between different currencies.
     * List rates
     * @param request Request body
     */
    public v1RatesList(request: GetRatesRequest, _options?: Configuration): Observable<GetRatesResponse> {
        const requestContextPromise = this.requestFactory.v1RatesList(request, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1RatesList(rsp)));
            }));
    }
 
}

import { SweepFundsApiRequestFactory, SweepFundsApiResponseProcessor} from "../apis/SweepFundsApi";
export class ObservableSweepFundsApi {
    private requestFactory: SweepFundsApiRequestFactory;
    private responseProcessor: SweepFundsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: SweepFundsApiRequestFactory,
        responseProcessor?: SweepFundsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new SweepFundsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new SweepFundsApiResponseProcessor();
    }

    /**
     * Sweep funds from a single address
     * Sweep address
     * @param address Address that funds will be swept from
     * @param request Request
     */
    public v1SweepAddress(address: string, request: SweepAddressRequest, _options?: Configuration): Observable<SweepAddressResponse> {
        const requestContextPromise = this.requestFactory.v1SweepAddress(address, request, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1SweepAddress(rsp)));
            }));
    }
 
}

import { TransactionsApiRequestFactory, TransactionsApiResponseProcessor} from "../apis/TransactionsApi";
export class ObservableTransactionsApi {
    private requestFactory: TransactionsApiRequestFactory;
    private responseProcessor: TransactionsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: TransactionsApiRequestFactory,
        responseProcessor?: TransactionsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new TransactionsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new TransactionsApiResponseProcessor();
    }

    /**
     * estimate fee of the withdraw
     * EstimateFee
     * @param request estimate fee request
     */
    public v1TransactionsEstimateFee(request: EstimateFeeRequest, _options?: Configuration): Observable<EstimateFeeResponse> {
        const requestContextPromise = this.requestFactory.v1TransactionsEstimateFee(request, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1TransactionsEstimateFee(rsp)));
            }));
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
    public v1TransactionsList(limit: number, currency?: string, cursor?: string, direction?: 'OUT' | 'IN', gateway?: string, network?: string, status?: 'PROCESSING' | 'CANCELED' | 'FAILED' | 'SUCCEED', txhash?: string, walletId?: string, _options?: Configuration): Observable<CursorPageTransaction> {
        const requestContextPromise = this.requestFactory.v1TransactionsList(limit, currency, cursor, direction, gateway, network, status, txhash, walletId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1TransactionsList(rsp)));
            }));
    }
 
    /**
     * Get a transaction by ID
     * Get transaction
     * @param transactionId Transaction ID
     */
    public v1TransactionsRetrieve(transactionId: string, _options?: Configuration): Observable<Transaction> {
        const requestContextPromise = this.requestFactory.v1TransactionsRetrieve(transactionId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1TransactionsRetrieve(rsp)));
            }));
    }
 
    /**
     * Create a transfer transaction
     * Transfer(internal)
     * @param request Request Body
     */
    public v1TransactionsTransfer(request: CreateTransferRequest, _options?: Configuration): Observable<CreateTransferResponse> {
        const requestContextPromise = this.requestFactory.v1TransactionsTransfer(request, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1TransactionsTransfer(rsp)));
            }));
    }
 
    /**
     * Create a new withdrawal request for a specified currency
     * Withdraw
     * @param request withdraw
     */
    public v1TransactionsWithdraw(request: CreateWithdrawRequest, _options?: Configuration): Observable<CreateWithdrawReply> {
        const requestContextPromise = this.requestFactory.v1TransactionsWithdraw(request, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1TransactionsWithdraw(rsp)));
            }));
    }
 
}

import { WalletsApiRequestFactory, WalletsApiResponseProcessor} from "../apis/WalletsApi";
export class ObservableWalletsApi {
    private requestFactory: WalletsApiRequestFactory;
    private responseProcessor: WalletsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: WalletsApiRequestFactory,
        responseProcessor?: WalletsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new WalletsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new WalletsApiResponseProcessor();
    }

    /**
     * Create a Wallet
     * Create wallet
     * @param request Request body
     */
    public v1WalletsCreate(request: CreateWalletRequest, _options?: Configuration): Observable<Wallet> {
        const requestContextPromise = this.requestFactory.v1WalletsCreate(request, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1WalletsCreate(rsp)));
            }));
    }
 
    /**
     * List all wallets
     * List wallets
     * @param limit The number of items to return per page.
     * @param cursor The cursor to use for pagination.
     */
    public v1WalletsList(limit: number, cursor?: string, _options?: Configuration): Observable<CursorPageWallet> {
        const requestContextPromise = this.requestFactory.v1WalletsList(limit, cursor, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1WalletsList(rsp)));
            }));
    }
 
    /**
     * List wallet accounts
     * List wallet accounts
     * @param walletId Wallet ID
     * @param limit The number of items to return per page.
     * @param cursor The cursor to use for pagination.
     */
    public v1WalletsListAccounts(walletId: string, limit: number, cursor?: string, _options?: Configuration): Observable<CursorPageAccount> {
        const requestContextPromise = this.requestFactory.v1WalletsListAccounts(walletId, limit, cursor, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1WalletsListAccounts(rsp)));
            }));
    }
 
    /**
     * Get a wallet by ID
     * Get wallet
     * @param walletId Wallet ID
     */
    public v1WalletsRetrieve(walletId: string, _options?: Configuration): Observable<Wallet> {
        const requestContextPromise = this.requestFactory.v1WalletsRetrieve(walletId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1WalletsRetrieve(rsp)));
            }));
    }
 
    /**
     * Update a Wallet
     * Update wallet
     * @param walletId Wallet ID
     * @param request Request body
     */
    public v1WalletsUpdate(walletId: string, request: UpdateWalletRequest, _options?: Configuration): Observable<Wallet> {
        const requestContextPromise = this.requestFactory.v1WalletsUpdate(walletId, request, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1WalletsUpdate(rsp)));
            }));
    }
 
}

import { WebhookEndpointsApiRequestFactory, WebhookEndpointsApiResponseProcessor} from "../apis/WebhookEndpointsApi";
export class ObservableWebhookEndpointsApi {
    private requestFactory: WebhookEndpointsApiRequestFactory;
    private responseProcessor: WebhookEndpointsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: WebhookEndpointsApiRequestFactory,
        responseProcessor?: WebhookEndpointsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new WebhookEndpointsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new WebhookEndpointsApiResponseProcessor();
    }

    /**
     * Create a webhook endpoint
     * Create webhook endpoint
     * @param request Request body
     */
    public v1WebhooksCreate(request: CreateEndpoint, _options?: Configuration): Observable<Endpoint> {
        const requestContextPromise = this.requestFactory.v1WebhooksCreate(request, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1WebhooksCreate(rsp)));
            }));
    }
 
    /**
     * Delete specific webhook endpoint
     * Delete webhook endpoint
     * @param endpointId Endpoint ID
     */
    public v1WebhooksDelete(endpointId: string, _options?: Configuration): Observable<DeleteWebhookEndpointResponse> {
        const requestContextPromise = this.requestFactory.v1WebhooksDelete(endpointId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1WebhooksDelete(rsp)));
            }));
    }
 
    /**
     * List webhook endpoints
     * List webhook endpoints
     * @param limit The number of items to return per page.
     * @param cursor The cursor to use for pagination.
     */
    public v1WebhooksList(limit: number, cursor?: string, _options?: Configuration): Observable<CursorPageEndpoint> {
        const requestContextPromise = this.requestFactory.v1WebhooksList(limit, cursor, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1WebhooksList(rsp)));
            }));
    }
 
    /**
     * Get specific webhook endpoint
     * Get webhook endpoint
     * @param endpointId Endpoint ID
     */
    public v1WebhooksRetrieve(endpointId: string, _options?: Configuration): Observable<Endpoint> {
        const requestContextPromise = this.requestFactory.v1WebhooksRetrieve(endpointId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1WebhooksRetrieve(rsp)));
            }));
    }
 
    /**
     * Update specific webhook endpoint
     * Update webhook endpoint
     * @param endpointId Endpoint ID
     * @param request Request body
     */
    public v1WebhooksUpdate(endpointId: string, request: UpdateEndpoint, _options?: Configuration): Observable<Endpoint> {
        const requestContextPromise = this.requestFactory.v1WebhooksUpdate(endpointId, request, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1WebhooksUpdate(rsp)));
            }));
    }
 
}

import { WebhookEventTypesApiRequestFactory, WebhookEventTypesApiResponseProcessor} from "../apis/WebhookEventTypesApi";
export class ObservableWebhookEventTypesApi {
    private requestFactory: WebhookEventTypesApiRequestFactory;
    private responseProcessor: WebhookEventTypesApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: WebhookEventTypesApiRequestFactory,
        responseProcessor?: WebhookEventTypesApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new WebhookEventTypesApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new WebhookEventTypesApiResponseProcessor();
    }

    /**
     * List all webhook event types
     * List webhook event types
     */
    public v1WebhooksEventtypesList(_options?: Configuration): Observable<Array<EventType>> {
        const requestContextPromise = this.requestFactory.v1WebhooksEventtypesList(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1WebhooksEventtypesList(rsp)));
            }));
    }
 
}

import { WebhookEventsApiRequestFactory, WebhookEventsApiResponseProcessor} from "../apis/WebhookEventsApi";
export class ObservableWebhookEventsApi {
    private requestFactory: WebhookEventsApiRequestFactory;
    private responseProcessor: WebhookEventsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: WebhookEventsApiRequestFactory,
        responseProcessor?: WebhookEventsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new WebhookEventsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new WebhookEventsApiResponseProcessor();
    }

    /**
     * List webhook events
     * List webhook events
     * @param limit The number of items to return per page.
     * @param cursor The cursor to use for pagination.
     * @param eventTypes The type of the webhook event
     */
    public v1WebhooksEventsList(limit: number, cursor?: string, eventTypes?: Array<string>, _options?: Configuration): Observable<CursorPageWebhookEvent> {
        const requestContextPromise = this.requestFactory.v1WebhooksEventsList(limit, cursor, eventTypes, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1WebhooksEventsList(rsp)));
            }));
    }
 
    /**
     * Resend a webhook event to specific endpoint
     * Resend webhook event
     * @param request The request
     */
    public v1WebhooksEventsResend(request: ResendWebhookEventRequest, _options?: Configuration): Observable<ResendWebhookEventResponse> {
        const requestContextPromise = this.requestFactory.v1WebhooksEventsResend(request, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1WebhooksEventsResend(rsp)));
            }));
    }
 
}
