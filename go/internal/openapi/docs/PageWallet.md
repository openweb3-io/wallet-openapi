# PageWallet

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**[]Wallet**](Wallet.md) |  | 
**Total** | **int32** |  | 

## Methods

### NewPageWallet

`func NewPageWallet(items []Wallet, total int32, ) *PageWallet`

NewPageWallet instantiates a new PageWallet object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPageWalletWithDefaults

`func NewPageWalletWithDefaults() *PageWallet`

NewPageWalletWithDefaults instantiates a new PageWallet object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *PageWallet) GetItems() []Wallet`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *PageWallet) GetItemsOk() (*[]Wallet, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *PageWallet) SetItems(v []Wallet)`

SetItems sets Items field to given value.


### GetTotal

`func (o *PageWallet) GetTotal() int32`

GetTotal returns the Total field if non-nil, zero value otherwise.

### GetTotalOk

`func (o *PageWallet) GetTotalOk() (*int32, bool)`

GetTotalOk returns a tuple with the Total field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotal

`func (o *PageWallet) SetTotal(v int32)`

SetTotal sets Total field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


