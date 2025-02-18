# Exchange

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedAt** | **string** | The create time | 
**FeeAmount** | **string** | The amount of the fee charged for this exchange, denominated in the &#x60;fee_currency&#x60; | 
**FeeCurrency** | **string** | The currency in which the fee is denominated. For example, &#39;TON&#39;. | 
**FiatCurrency** | **string** | The currency code of fiat currency, e.g.: USD | 
**FromAmount** | **string** | The amount of the source currency being sent. For example, 0.1 TON. | 
**FromCurrency** | **string** | The currency being sent. In this case, it is &#39;TON&#39;. | 
**Id** | **string** | A unique identifier for the exchange. | 
**Rate** | **float32** | The exchange rate applied during the exchange. For example, the rate is 7.11116. | 
**Status** | **string** | The status of the exchange. For example, &#39;SUCCESS&#39;. | 
**ToAmount** | **string** | The amount of the target currency received. For example, 0.711116 USDT. | 
**ToCurrency** | **string** | The currency being received. In this case, it is &#39;USDT&#39;. | 
**Ttl** | **int32** | The validity period for the exchange | 
**UpdatedAt** | **string** | The update time | 
**WalletId** | **string** | The walletID that the exchange belong to | 

## Methods

### NewExchange

`func NewExchange(createdAt string, feeAmount string, feeCurrency string, fiatCurrency string, fromAmount string, fromCurrency string, id string, rate float32, status string, toAmount string, toCurrency string, ttl int32, updatedAt string, walletId string, ) *Exchange`

NewExchange instantiates a new Exchange object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewExchangeWithDefaults

`func NewExchangeWithDefaults() *Exchange`

NewExchangeWithDefaults instantiates a new Exchange object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCreatedAt

`func (o *Exchange) GetCreatedAt() string`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *Exchange) GetCreatedAtOk() (*string, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *Exchange) SetCreatedAt(v string)`

SetCreatedAt sets CreatedAt field to given value.


### GetFeeAmount

`func (o *Exchange) GetFeeAmount() string`

GetFeeAmount returns the FeeAmount field if non-nil, zero value otherwise.

### GetFeeAmountOk

`func (o *Exchange) GetFeeAmountOk() (*string, bool)`

GetFeeAmountOk returns a tuple with the FeeAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeeAmount

`func (o *Exchange) SetFeeAmount(v string)`

SetFeeAmount sets FeeAmount field to given value.


### GetFeeCurrency

`func (o *Exchange) GetFeeCurrency() string`

GetFeeCurrency returns the FeeCurrency field if non-nil, zero value otherwise.

### GetFeeCurrencyOk

`func (o *Exchange) GetFeeCurrencyOk() (*string, bool)`

GetFeeCurrencyOk returns a tuple with the FeeCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeeCurrency

`func (o *Exchange) SetFeeCurrency(v string)`

SetFeeCurrency sets FeeCurrency field to given value.


### GetFiatCurrency

`func (o *Exchange) GetFiatCurrency() string`

GetFiatCurrency returns the FiatCurrency field if non-nil, zero value otherwise.

### GetFiatCurrencyOk

`func (o *Exchange) GetFiatCurrencyOk() (*string, bool)`

GetFiatCurrencyOk returns a tuple with the FiatCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiatCurrency

`func (o *Exchange) SetFiatCurrency(v string)`

SetFiatCurrency sets FiatCurrency field to given value.


### GetFromAmount

`func (o *Exchange) GetFromAmount() string`

GetFromAmount returns the FromAmount field if non-nil, zero value otherwise.

### GetFromAmountOk

`func (o *Exchange) GetFromAmountOk() (*string, bool)`

GetFromAmountOk returns a tuple with the FromAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFromAmount

`func (o *Exchange) SetFromAmount(v string)`

SetFromAmount sets FromAmount field to given value.


### GetFromCurrency

`func (o *Exchange) GetFromCurrency() string`

GetFromCurrency returns the FromCurrency field if non-nil, zero value otherwise.

### GetFromCurrencyOk

`func (o *Exchange) GetFromCurrencyOk() (*string, bool)`

GetFromCurrencyOk returns a tuple with the FromCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFromCurrency

`func (o *Exchange) SetFromCurrency(v string)`

SetFromCurrency sets FromCurrency field to given value.


### GetId

`func (o *Exchange) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Exchange) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Exchange) SetId(v string)`

SetId sets Id field to given value.


### GetRate

`func (o *Exchange) GetRate() float32`

GetRate returns the Rate field if non-nil, zero value otherwise.

### GetRateOk

`func (o *Exchange) GetRateOk() (*float32, bool)`

GetRateOk returns a tuple with the Rate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRate

`func (o *Exchange) SetRate(v float32)`

SetRate sets Rate field to given value.


### GetStatus

`func (o *Exchange) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *Exchange) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *Exchange) SetStatus(v string)`

SetStatus sets Status field to given value.


### GetToAmount

`func (o *Exchange) GetToAmount() string`

GetToAmount returns the ToAmount field if non-nil, zero value otherwise.

### GetToAmountOk

`func (o *Exchange) GetToAmountOk() (*string, bool)`

GetToAmountOk returns a tuple with the ToAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToAmount

`func (o *Exchange) SetToAmount(v string)`

SetToAmount sets ToAmount field to given value.


### GetToCurrency

`func (o *Exchange) GetToCurrency() string`

GetToCurrency returns the ToCurrency field if non-nil, zero value otherwise.

### GetToCurrencyOk

`func (o *Exchange) GetToCurrencyOk() (*string, bool)`

GetToCurrencyOk returns a tuple with the ToCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToCurrency

`func (o *Exchange) SetToCurrency(v string)`

SetToCurrency sets ToCurrency field to given value.


### GetTtl

`func (o *Exchange) GetTtl() int32`

GetTtl returns the Ttl field if non-nil, zero value otherwise.

### GetTtlOk

`func (o *Exchange) GetTtlOk() (*int32, bool)`

GetTtlOk returns a tuple with the Ttl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTtl

`func (o *Exchange) SetTtl(v int32)`

SetTtl sets Ttl field to given value.


### GetUpdatedAt

`func (o *Exchange) GetUpdatedAt() string`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *Exchange) GetUpdatedAtOk() (*string, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *Exchange) SetUpdatedAt(v string)`

SetUpdatedAt sets UpdatedAt field to given value.


### GetWalletId

`func (o *Exchange) GetWalletId() string`

GetWalletId returns the WalletId field if non-nil, zero value otherwise.

### GetWalletIdOk

`func (o *Exchange) GetWalletIdOk() (*string, bool)`

GetWalletIdOk returns a tuple with the WalletId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWalletId

`func (o *Exchange) SetWalletId(v string)`

SetWalletId sets WalletId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


