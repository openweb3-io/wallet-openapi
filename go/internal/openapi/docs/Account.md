# Account

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Balance** | **string** | The current balance of the wallet | 
**Currency** | **string** | The currency associated with the wallet | 
**Id** | **string** | Account id | 
**InTransitBalance** | **string** | The amount of the balance that is in transit | 
**LockedBalance** | **string** | The amount of the balance that is locked | 
**WalletId** | **string** | The wallet&#39;s ID | 

## Methods

### NewAccount

`func NewAccount(balance string, currency string, id string, inTransitBalance string, lockedBalance string, walletId string, ) *Account`

NewAccount instantiates a new Account object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAccountWithDefaults

`func NewAccountWithDefaults() *Account`

NewAccountWithDefaults instantiates a new Account object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBalance

`func (o *Account) GetBalance() string`

GetBalance returns the Balance field if non-nil, zero value otherwise.

### GetBalanceOk

`func (o *Account) GetBalanceOk() (*string, bool)`

GetBalanceOk returns a tuple with the Balance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBalance

`func (o *Account) SetBalance(v string)`

SetBalance sets Balance field to given value.


### GetCurrency

`func (o *Account) GetCurrency() string`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *Account) GetCurrencyOk() (*string, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *Account) SetCurrency(v string)`

SetCurrency sets Currency field to given value.


### GetId

`func (o *Account) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Account) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Account) SetId(v string)`

SetId sets Id field to given value.


### GetInTransitBalance

`func (o *Account) GetInTransitBalance() string`

GetInTransitBalance returns the InTransitBalance field if non-nil, zero value otherwise.

### GetInTransitBalanceOk

`func (o *Account) GetInTransitBalanceOk() (*string, bool)`

GetInTransitBalanceOk returns a tuple with the InTransitBalance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInTransitBalance

`func (o *Account) SetInTransitBalance(v string)`

SetInTransitBalance sets InTransitBalance field to given value.


### GetLockedBalance

`func (o *Account) GetLockedBalance() string`

GetLockedBalance returns the LockedBalance field if non-nil, zero value otherwise.

### GetLockedBalanceOk

`func (o *Account) GetLockedBalanceOk() (*string, bool)`

GetLockedBalanceOk returns a tuple with the LockedBalance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLockedBalance

`func (o *Account) SetLockedBalance(v string)`

SetLockedBalance sets LockedBalance field to given value.


### GetWalletId

`func (o *Account) GetWalletId() string`

GetWalletId returns the WalletId field if non-nil, zero value otherwise.

### GetWalletIdOk

`func (o *Account) GetWalletIdOk() (*string, bool)`

GetWalletIdOk returns a tuple with the WalletId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWalletId

`func (o *Account) SetWalletId(v string)`

SetWalletId sets WalletId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


