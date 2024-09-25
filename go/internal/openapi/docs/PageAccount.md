# PageAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**[]Account**](Account.md) |  | 
**Total** | **int32** |  | 

## Methods

### NewPageAccount

`func NewPageAccount(items []Account, total int32, ) *PageAccount`

NewPageAccount instantiates a new PageAccount object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPageAccountWithDefaults

`func NewPageAccountWithDefaults() *PageAccount`

NewPageAccountWithDefaults instantiates a new PageAccount object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *PageAccount) GetItems() []Account`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *PageAccount) GetItemsOk() (*[]Account, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *PageAccount) SetItems(v []Account)`

SetItems sets Items field to given value.


### GetTotal

`func (o *PageAccount) GetTotal() int32`

GetTotal returns the Total field if non-nil, zero value otherwise.

### GetTotalOk

`func (o *PageAccount) GetTotalOk() (*int32, bool)`

GetTotalOk returns a tuple with the Total field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotal

`func (o *PageAccount) SetTotal(v int32)`

SetTotal sets Total field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


