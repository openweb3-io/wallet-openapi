# EstimateFeeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Amount** | **string** | The amount of currency to be withdrawn in nano units (multiply by 10^decimals) | 
**Currency** | **string** | The code of currency to be withdrawn. | 
**Network** | **string** | The network of the currency to be withdrawn. | 
**ToAddress** | **string** | The recipient address where the withdrawn funds will be sent. This is usually a wallet address specific to the chosen network. | 
**WalletId** | **string** | The ID of the wallet from which the withdrawal will be made. | 

## Methods

### NewEstimateFeeRequest

`func NewEstimateFeeRequest(amount string, currency string, network string, toAddress string, walletId string, ) *EstimateFeeRequest`

NewEstimateFeeRequest instantiates a new EstimateFeeRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEstimateFeeRequestWithDefaults

`func NewEstimateFeeRequestWithDefaults() *EstimateFeeRequest`

NewEstimateFeeRequestWithDefaults instantiates a new EstimateFeeRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAmount

`func (o *EstimateFeeRequest) GetAmount() string`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *EstimateFeeRequest) GetAmountOk() (*string, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *EstimateFeeRequest) SetAmount(v string)`

SetAmount sets Amount field to given value.


### GetCurrency

`func (o *EstimateFeeRequest) GetCurrency() string`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *EstimateFeeRequest) GetCurrencyOk() (*string, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *EstimateFeeRequest) SetCurrency(v string)`

SetCurrency sets Currency field to given value.


### GetNetwork

`func (o *EstimateFeeRequest) GetNetwork() string`

GetNetwork returns the Network field if non-nil, zero value otherwise.

### GetNetworkOk

`func (o *EstimateFeeRequest) GetNetworkOk() (*string, bool)`

GetNetworkOk returns a tuple with the Network field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetwork

`func (o *EstimateFeeRequest) SetNetwork(v string)`

SetNetwork sets Network field to given value.


### GetToAddress

`func (o *EstimateFeeRequest) GetToAddress() string`

GetToAddress returns the ToAddress field if non-nil, zero value otherwise.

### GetToAddressOk

`func (o *EstimateFeeRequest) GetToAddressOk() (*string, bool)`

GetToAddressOk returns a tuple with the ToAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToAddress

`func (o *EstimateFeeRequest) SetToAddress(v string)`

SetToAddress sets ToAddress field to given value.


### GetWalletId

`func (o *EstimateFeeRequest) GetWalletId() string`

GetWalletId returns the WalletId field if non-nil, zero value otherwise.

### GetWalletIdOk

`func (o *EstimateFeeRequest) GetWalletIdOk() (*string, bool)`

GetWalletIdOk returns a tuple with the WalletId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWalletId

`func (o *EstimateFeeRequest) SetWalletId(v string)`

SetWalletId sets WalletId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


