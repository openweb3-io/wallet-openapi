# ExchangeCurrencyPairs

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FromCurrency** | Pointer to **string** | The currency code of source currency, e.g.: TON | [optional] 
**ToCurrencies** | Pointer to **[]string** | The currency code list of target currency, e.g.: USDT | [optional] 

## Methods

### NewExchangeCurrencyPairs

`func NewExchangeCurrencyPairs() *ExchangeCurrencyPairs`

NewExchangeCurrencyPairs instantiates a new ExchangeCurrencyPairs object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewExchangeCurrencyPairsWithDefaults

`func NewExchangeCurrencyPairsWithDefaults() *ExchangeCurrencyPairs`

NewExchangeCurrencyPairsWithDefaults instantiates a new ExchangeCurrencyPairs object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFromCurrency

`func (o *ExchangeCurrencyPairs) GetFromCurrency() string`

GetFromCurrency returns the FromCurrency field if non-nil, zero value otherwise.

### GetFromCurrencyOk

`func (o *ExchangeCurrencyPairs) GetFromCurrencyOk() (*string, bool)`

GetFromCurrencyOk returns a tuple with the FromCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFromCurrency

`func (o *ExchangeCurrencyPairs) SetFromCurrency(v string)`

SetFromCurrency sets FromCurrency field to given value.

### HasFromCurrency

`func (o *ExchangeCurrencyPairs) HasFromCurrency() bool`

HasFromCurrency returns a boolean if a field has been set.

### GetToCurrencies

`func (o *ExchangeCurrencyPairs) GetToCurrencies() []string`

GetToCurrencies returns the ToCurrencies field if non-nil, zero value otherwise.

### GetToCurrenciesOk

`func (o *ExchangeCurrencyPairs) GetToCurrenciesOk() (*[]string, bool)`

GetToCurrenciesOk returns a tuple with the ToCurrencies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToCurrencies

`func (o *ExchangeCurrencyPairs) SetToCurrencies(v []string)`

SetToCurrencies sets ToCurrencies field to given value.

### HasToCurrencies

`func (o *ExchangeCurrencyPairs) HasToCurrencies() bool`

HasToCurrencies returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


