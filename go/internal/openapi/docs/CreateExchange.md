# CreateExchange

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FiatCurrency** | **string** | The currency code of fiat currency, e.g.: USD | 
**FromAmount** | **string** | The amount of the source currency to be exchange, e.g.: 100000 | 
**FromCurrency** | **string** | The currency code of source currency, e.g.: TON | 
**ToCurrency** | **string** | The currency code of target currency, e.g.: USDT | 
**WalletId** | **string** | The wallet id | 

## Methods

### NewCreateExchange

`func NewCreateExchange(fiatCurrency string, fromAmount string, fromCurrency string, toCurrency string, walletId string, ) *CreateExchange`

NewCreateExchange instantiates a new CreateExchange object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateExchangeWithDefaults

`func NewCreateExchangeWithDefaults() *CreateExchange`

NewCreateExchangeWithDefaults instantiates a new CreateExchange object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFiatCurrency

`func (o *CreateExchange) GetFiatCurrency() string`

GetFiatCurrency returns the FiatCurrency field if non-nil, zero value otherwise.

### GetFiatCurrencyOk

`func (o *CreateExchange) GetFiatCurrencyOk() (*string, bool)`

GetFiatCurrencyOk returns a tuple with the FiatCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiatCurrency

`func (o *CreateExchange) SetFiatCurrency(v string)`

SetFiatCurrency sets FiatCurrency field to given value.


### GetFromAmount

`func (o *CreateExchange) GetFromAmount() string`

GetFromAmount returns the FromAmount field if non-nil, zero value otherwise.

### GetFromAmountOk

`func (o *CreateExchange) GetFromAmountOk() (*string, bool)`

GetFromAmountOk returns a tuple with the FromAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFromAmount

`func (o *CreateExchange) SetFromAmount(v string)`

SetFromAmount sets FromAmount field to given value.


### GetFromCurrency

`func (o *CreateExchange) GetFromCurrency() string`

GetFromCurrency returns the FromCurrency field if non-nil, zero value otherwise.

### GetFromCurrencyOk

`func (o *CreateExchange) GetFromCurrencyOk() (*string, bool)`

GetFromCurrencyOk returns a tuple with the FromCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFromCurrency

`func (o *CreateExchange) SetFromCurrency(v string)`

SetFromCurrency sets FromCurrency field to given value.


### GetToCurrency

`func (o *CreateExchange) GetToCurrency() string`

GetToCurrency returns the ToCurrency field if non-nil, zero value otherwise.

### GetToCurrencyOk

`func (o *CreateExchange) GetToCurrencyOk() (*string, bool)`

GetToCurrencyOk returns a tuple with the ToCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToCurrency

`func (o *CreateExchange) SetToCurrency(v string)`

SetToCurrency sets ToCurrency field to given value.


### GetWalletId

`func (o *CreateExchange) GetWalletId() string`

GetWalletId returns the WalletId field if non-nil, zero value otherwise.

### GetWalletIdOk

`func (o *CreateExchange) GetWalletIdOk() (*string, bool)`

GetWalletIdOk returns a tuple with the WalletId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWalletId

`func (o *CreateExchange) SetWalletId(v string)`

SetWalletId sets WalletId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


