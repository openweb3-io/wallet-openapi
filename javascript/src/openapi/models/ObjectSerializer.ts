export * from './Account';
export * from './Address';
export * from './ChainNetwork';
export * from './CreateEndpoint';
export * from './CreateExchange';
export * from './CreateTransferRequest';
export * from './CreateTransferResponse';
export * from './CreateWalletRequest';
export * from './CreateWithdrawReply';
export * from './CreateWithdrawRequest';
export * from './Currency';
export * from './CurrencyNetwork';
export * from './CurrencyPair';
export * from './CursorPageAccount';
export * from './CursorPageAddress';
export * from './CursorPageChainNetwork';
export * from './CursorPageCurrency';
export * from './CursorPageEndpoint';
export * from './CursorPageExchange';
export * from './CursorPageTransaction';
export * from './CursorPageWallet';
export * from './CursorPageWebhookEvent';
export * from './DeleteWebhookEndpointResponse';
export * from './Endpoint';
export * from './EstimateFeeRequest';
export * from './EstimateFeeResponse';
export * from './EstimateResponse';
export * from './EventType';
export * from './Exchange';
export * from './ExchangeCurrencyPairs';
export * from './ExchangeSubmitResponse';
export * from './GetCurrencyPairQuotaResponse';
export * from './GetRatesRequest';
export * from './GetRatesResponse';
export * from './ListExchangeCurrencyPairsResponse';
export * from './ModelError';
export * from './Rate';
export * from './ResendWebhookEventRequest';
export * from './ResendWebhookEventResponse';
export * from './SweepAddressRequest';
export * from './SweepAddressResponse';
export * from './Transaction';
export * from './TransactionDirection';
export * from './TransactionStatus';
export * from './UpdateEndpoint';
export * from './UpdateWalletRequest';
export * from './Wallet';
export * from './WebhookEvent';

import { Account } from './Account';
import { Address } from './Address';
import { ChainNetwork } from './ChainNetwork';
import { CreateEndpoint } from './CreateEndpoint';
import { CreateExchange } from './CreateExchange';
import { CreateTransferRequest } from './CreateTransferRequest';
import { CreateTransferResponse } from './CreateTransferResponse';
import { CreateWalletRequest } from './CreateWalletRequest';
import { CreateWithdrawReply } from './CreateWithdrawReply';
import { CreateWithdrawRequest } from './CreateWithdrawRequest';
import { Currency } from './Currency';
import { CurrencyNetwork } from './CurrencyNetwork';
import { CurrencyPair } from './CurrencyPair';
import { CursorPageAccount } from './CursorPageAccount';
import { CursorPageAddress } from './CursorPageAddress';
import { CursorPageChainNetwork } from './CursorPageChainNetwork';
import { CursorPageCurrency } from './CursorPageCurrency';
import { CursorPageEndpoint } from './CursorPageEndpoint';
import { CursorPageExchange } from './CursorPageExchange';
import { CursorPageTransaction } from './CursorPageTransaction';
import { CursorPageWallet } from './CursorPageWallet';
import { CursorPageWebhookEvent } from './CursorPageWebhookEvent';
import { DeleteWebhookEndpointResponse } from './DeleteWebhookEndpointResponse';
import { Endpoint } from './Endpoint';
import { EstimateFeeRequest } from './EstimateFeeRequest';
import { EstimateFeeResponse } from './EstimateFeeResponse';
import { EstimateResponse } from './EstimateResponse';
import { EventType } from './EventType';
import { Exchange } from './Exchange';
import { ExchangeCurrencyPairs } from './ExchangeCurrencyPairs';
import { ExchangeSubmitResponse } from './ExchangeSubmitResponse';
import { GetCurrencyPairQuotaResponse } from './GetCurrencyPairQuotaResponse';
import { GetRatesRequest } from './GetRatesRequest';
import { GetRatesResponse } from './GetRatesResponse';
import { ListExchangeCurrencyPairsResponse } from './ListExchangeCurrencyPairsResponse';
import { ModelError } from './ModelError';
import { Rate } from './Rate';
import { ResendWebhookEventRequest } from './ResendWebhookEventRequest';
import { ResendWebhookEventResponse } from './ResendWebhookEventResponse';
import { SweepAddressRequest } from './SweepAddressRequest';
import { SweepAddressResponse } from './SweepAddressResponse';
import { Transaction } from './Transaction';
import { TransactionDirection } from './TransactionDirection';
import { TransactionStatus } from './TransactionStatus';
import { UpdateEndpoint } from './UpdateEndpoint';
import { UpdateWalletRequest } from './UpdateWalletRequest';
import { Wallet } from './Wallet';
import { WebhookEvent } from './WebhookEvent';

/* tslint:disable:no-unused-variable */
let primitives = [
                    "string",
                    "boolean",
                    "double",
                    "integer",
                    "long",
                    "float",
                    "number",
                    "any"
                 ];

const supportedMediaTypes: { [mediaType: string]: number } = {
  "application/json": Infinity,
  "application/octet-stream": 0
}

                 
let enumsMap: Set<string> = new Set<string>([
    "TransactionDirection",
    "TransactionStatus",
]);

let typeMap: {[index: string]: any} = {
    "Account": Account,
    "Address": Address,
    "ChainNetwork": ChainNetwork,
    "CreateEndpoint": CreateEndpoint,
    "CreateExchange": CreateExchange,
    "CreateTransferRequest": CreateTransferRequest,
    "CreateTransferResponse": CreateTransferResponse,
    "CreateWalletRequest": CreateWalletRequest,
    "CreateWithdrawReply": CreateWithdrawReply,
    "CreateWithdrawRequest": CreateWithdrawRequest,
    "Currency": Currency,
    "CurrencyNetwork": CurrencyNetwork,
    "CurrencyPair": CurrencyPair,
    "CursorPageAccount": CursorPageAccount,
    "CursorPageAddress": CursorPageAddress,
    "CursorPageChainNetwork": CursorPageChainNetwork,
    "CursorPageCurrency": CursorPageCurrency,
    "CursorPageEndpoint": CursorPageEndpoint,
    "CursorPageExchange": CursorPageExchange,
    "CursorPageTransaction": CursorPageTransaction,
    "CursorPageWallet": CursorPageWallet,
    "CursorPageWebhookEvent": CursorPageWebhookEvent,
    "DeleteWebhookEndpointResponse": DeleteWebhookEndpointResponse,
    "Endpoint": Endpoint,
    "EstimateFeeRequest": EstimateFeeRequest,
    "EstimateFeeResponse": EstimateFeeResponse,
    "EstimateResponse": EstimateResponse,
    "EventType": EventType,
    "Exchange": Exchange,
    "ExchangeCurrencyPairs": ExchangeCurrencyPairs,
    "ExchangeSubmitResponse": ExchangeSubmitResponse,
    "GetCurrencyPairQuotaResponse": GetCurrencyPairQuotaResponse,
    "GetRatesRequest": GetRatesRequest,
    "GetRatesResponse": GetRatesResponse,
    "ListExchangeCurrencyPairsResponse": ListExchangeCurrencyPairsResponse,
    "ModelError": ModelError,
    "Rate": Rate,
    "ResendWebhookEventRequest": ResendWebhookEventRequest,
    "ResendWebhookEventResponse": ResendWebhookEventResponse,
    "SweepAddressRequest": SweepAddressRequest,
    "SweepAddressResponse": SweepAddressResponse,
    "Transaction": Transaction,
    "UpdateEndpoint": UpdateEndpoint,
    "UpdateWalletRequest": UpdateWalletRequest,
    "Wallet": Wallet,
    "WebhookEvent": WebhookEvent,
}

export class ObjectSerializer {
    public static findCorrectType(data: any, expectedType: string) {
        if (data == undefined) {
            return expectedType;
        } else if (primitives.indexOf(expectedType.toLowerCase()) !== -1) {
            return expectedType;
        } else if (expectedType === "Date") {
            return expectedType;
        } else {
            if (enumsMap.has(expectedType)) {
                return expectedType;
            }

            if (!typeMap[expectedType]) {
                return expectedType; // w/e we don't know the type
            }

            // Check the discriminator
            let discriminatorProperty = typeMap[expectedType].discriminator;
            if (discriminatorProperty == null) {
                return expectedType; // the type does not have a discriminator. use it.
            } else {
                if (data[discriminatorProperty]) {
                    var discriminatorType = data[discriminatorProperty];
                    if(typeMap[discriminatorType]){
                        return discriminatorType; // use the type given in the discriminator
                    } else {
                        return expectedType; // discriminator did not map to a type
                    }
                } else {
                    return expectedType; // discriminator was not present (or an empty string)
                }
            }
        }
    }

    public static serialize(data: any, type: string, format: string) {
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index in data) {
                let date = data[index];
                transformedData.push(ObjectSerializer.serialize(date, subType, format));
            }
            return transformedData;
        } else if (type === "Date") {
            if (format == "date") {
                let month = data.getMonth()+1
                month = month < 10 ? "0" + month.toString() : month.toString()
                let day = data.getDate();
                day = day < 10 ? "0" + day.toString() : day.toString();

                return data.getFullYear() + "-" + month + "-" + day;
            } else {
                return data.toISOString();
            }
        } else {
            if (enumsMap.has(type)) {
                return data;
            }
            if (!typeMap[type]) { // in case we dont know the type
                return data;
            }
            
            // Get the actual type of this object
            type = this.findCorrectType(data, type);

            // get the map for the correct type.
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            let instance: {[index: string]: any} = {};
            for (let index in attributeTypes) {
                let attributeType = attributeTypes[index];
                instance[attributeType.baseName] = ObjectSerializer.serialize(data[attributeType.name], attributeType.type, attributeType.format);
            }
            return instance;
        }
    }

    public static deserialize(data: any, type: string, format: string) {
        // polymorphism may change the actual type.
        type = ObjectSerializer.findCorrectType(data, type);
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index in data) {
                let date = data[index];
                transformedData.push(ObjectSerializer.deserialize(date, subType, format));
            }
            return transformedData;
        } else if (type === "Date") {
            return new Date(data);
        } else {
            if (enumsMap.has(type)) {// is Enum
                return data;
            }

            if (!typeMap[type]) { // dont know the type
                return data;
            }
            let instance = new typeMap[type]();
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            for (let index in attributeTypes) {
                let attributeType = attributeTypes[index];
                instance[attributeType.name] = ObjectSerializer.deserialize(data[attributeType.baseName], attributeType.type, attributeType.format);
            }
            return instance;
        }
    }


    /**
     * Normalize media type
     *
     * We currently do not handle any media types attributes, i.e. anything
     * after a semicolon. All content is assumed to be UTF-8 compatible.
     */
    public static normalizeMediaType(mediaType: string | undefined): string | undefined {
        if (mediaType === undefined) {
            return undefined;
        }
        return mediaType.split(";")[0].trim().toLowerCase();
    }

    /**
     * From a list of possible media types, choose the one we can handle best.
     *
     * The order of the given media types does not have any impact on the choice
     * made.
     */
    public static getPreferredMediaType(mediaTypes: Array<string>): string {
        /** According to OAS 3 we should default to json */
        if (!mediaTypes) {
            return "application/json";
        }

        const normalMediaTypes = mediaTypes.map(this.normalizeMediaType);
        let selectedMediaType: string | undefined = undefined;
        let selectedRank: number = -Infinity;
        for (const mediaType of normalMediaTypes) {
            if (supportedMediaTypes[mediaType!] > selectedRank) {
                selectedMediaType = mediaType;
                selectedRank = supportedMediaTypes[mediaType!];
            }
        }

        if (selectedMediaType === undefined) {
            throw new Error("None of the given media types are supported: " + mediaTypes.join(", "));
        }

        return selectedMediaType!;
    }

    /**
     * Convert data to a string according the given media type
     */
    public static stringify(data: any, mediaType: string): string {
        if (mediaType === "application/json") {
            return JSON.stringify(data);
        }

        throw new Error("The mediaType " + mediaType + " is not supported by ObjectSerializer.stringify.");
    }

    /**
     * Parse data from a string according to the given media type
     */
    public static parse(rawData: string, mediaType: string | undefined) {
        if (mediaType === undefined) {
            throw new Error("Cannot parse content. No Content-Type defined.");
        }

        if (mediaType === "application/json") {
            return JSON.parse(rawData);
        }

        throw new Error("The mediaType " + mediaType + " is not supported by ObjectSerializer.parse.");
    }
}
