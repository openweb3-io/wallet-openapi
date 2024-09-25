# WithdrawRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Address** | **string** | The recipient address where the withdrawn funds will be sent. This is usually a wallet address specific to the chosen network. | 
**Amount** | **map[string]interface{}** | The amount of currency to be withdrawn | 
**Currency** | **string** | The code of currency to be withdrawn. | 
**Network** | **string** | It designates the network through which the withdrawal transaction will be processed, such as \&quot;Bitcoin\&quot;, \&quot;Ethereum\&quot;, etc. | 

## Methods

### NewWithdrawRequest

`func NewWithdrawRequest(address string, amount map[string]interface{}, currency string, network string, ) *WithdrawRequest`

NewWithdrawRequest instantiates a new WithdrawRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewWithdrawRequestWithDefaults

`func NewWithdrawRequestWithDefaults() *WithdrawRequest`

NewWithdrawRequestWithDefaults instantiates a new WithdrawRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAddress

`func (o *WithdrawRequest) GetAddress() string`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *WithdrawRequest) GetAddressOk() (*string, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *WithdrawRequest) SetAddress(v string)`

SetAddress sets Address field to given value.


### GetAmount

`func (o *WithdrawRequest) GetAmount() map[string]interface{}`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *WithdrawRequest) GetAmountOk() (*map[string]interface{}, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *WithdrawRequest) SetAmount(v map[string]interface{})`

SetAmount sets Amount field to given value.


### GetCurrency

`func (o *WithdrawRequest) GetCurrency() string`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *WithdrawRequest) GetCurrencyOk() (*string, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *WithdrawRequest) SetCurrency(v string)`

SetCurrency sets Currency field to given value.


### GetNetwork

`func (o *WithdrawRequest) GetNetwork() string`

GetNetwork returns the Network field if non-nil, zero value otherwise.

### GetNetworkOk

`func (o *WithdrawRequest) GetNetworkOk() (*string, bool)`

GetNetworkOk returns a tuple with the Network field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetwork

`func (o *WithdrawRequest) SetNetwork(v string)`

SetNetwork sets Network field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


