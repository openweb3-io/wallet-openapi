# CreateWithdrawRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Amount** | **string** | The amount of currency to be withdrawn | 
**Currency** | **string** | The code of currency to be withdrawn. | 
**Network** | **string** | The network of the currency to be withdrawn. | 
**ToAddress** | **string** | The recipient address where the withdrawn funds will be sent. This is usually a wallet address specific to the chosen network. | 
**WalletId** | **string** | The ID of the wallet from which the withdrawal will be made. | 

## Methods

### NewCreateWithdrawRequest

`func NewCreateWithdrawRequest(amount string, currency string, network string, toAddress string, walletId string, ) *CreateWithdrawRequest`

NewCreateWithdrawRequest instantiates a new CreateWithdrawRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateWithdrawRequestWithDefaults

`func NewCreateWithdrawRequestWithDefaults() *CreateWithdrawRequest`

NewCreateWithdrawRequestWithDefaults instantiates a new CreateWithdrawRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAmount

`func (o *CreateWithdrawRequest) GetAmount() string`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *CreateWithdrawRequest) GetAmountOk() (*string, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *CreateWithdrawRequest) SetAmount(v string)`

SetAmount sets Amount field to given value.


### GetCurrency

`func (o *CreateWithdrawRequest) GetCurrency() string`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *CreateWithdrawRequest) GetCurrencyOk() (*string, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *CreateWithdrawRequest) SetCurrency(v string)`

SetCurrency sets Currency field to given value.


### GetNetwork

`func (o *CreateWithdrawRequest) GetNetwork() string`

GetNetwork returns the Network field if non-nil, zero value otherwise.

### GetNetworkOk

`func (o *CreateWithdrawRequest) GetNetworkOk() (*string, bool)`

GetNetworkOk returns a tuple with the Network field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetwork

`func (o *CreateWithdrawRequest) SetNetwork(v string)`

SetNetwork sets Network field to given value.


### GetToAddress

`func (o *CreateWithdrawRequest) GetToAddress() string`

GetToAddress returns the ToAddress field if non-nil, zero value otherwise.

### GetToAddressOk

`func (o *CreateWithdrawRequest) GetToAddressOk() (*string, bool)`

GetToAddressOk returns a tuple with the ToAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToAddress

`func (o *CreateWithdrawRequest) SetToAddress(v string)`

SetToAddress sets ToAddress field to given value.


### GetWalletId

`func (o *CreateWithdrawRequest) GetWalletId() string`

GetWalletId returns the WalletId field if non-nil, zero value otherwise.

### GetWalletIdOk

`func (o *CreateWithdrawRequest) GetWalletIdOk() (*string, bool)`

GetWalletIdOk returns a tuple with the WalletId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWalletId

`func (o *CreateWithdrawRequest) SetWalletId(v string)`

SetWalletId sets WalletId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


