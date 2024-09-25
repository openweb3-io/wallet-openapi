# PageAddress

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**[]Address**](Address.md) |  | 
**Total** | **int32** |  | 

## Methods

### NewPageAddress

`func NewPageAddress(items []Address, total int32, ) *PageAddress`

NewPageAddress instantiates a new PageAddress object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPageAddressWithDefaults

`func NewPageAddressWithDefaults() *PageAddress`

NewPageAddressWithDefaults instantiates a new PageAddress object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *PageAddress) GetItems() []Address`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *PageAddress) GetItemsOk() (*[]Address, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *PageAddress) SetItems(v []Address)`

SetItems sets Items field to given value.


### GetTotal

`func (o *PageAddress) GetTotal() int32`

GetTotal returns the Total field if non-nil, zero value otherwise.

### GetTotalOk

`func (o *PageAddress) GetTotalOk() (*int32, bool)`

GetTotalOk returns a tuple with the Total field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotal

`func (o *PageAddress) SetTotal(v int32)`

SetTotal sets Total field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


