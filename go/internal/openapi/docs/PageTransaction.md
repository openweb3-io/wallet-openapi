# PageTransaction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**[]Transaction**](Transaction.md) |  | 
**Total** | **int32** |  | 

## Methods

### NewPageTransaction

`func NewPageTransaction(items []Transaction, total int32, ) *PageTransaction`

NewPageTransaction instantiates a new PageTransaction object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPageTransactionWithDefaults

`func NewPageTransactionWithDefaults() *PageTransaction`

NewPageTransactionWithDefaults instantiates a new PageTransaction object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *PageTransaction) GetItems() []Transaction`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *PageTransaction) GetItemsOk() (*[]Transaction, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *PageTransaction) SetItems(v []Transaction)`

SetItems sets Items field to given value.


### GetTotal

`func (o *PageTransaction) GetTotal() int32`

GetTotal returns the Total field if non-nil, zero value otherwise.

### GetTotalOk

`func (o *PageTransaction) GetTotalOk() (*int32, bool)`

GetTotalOk returns a tuple with the Total field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotal

`func (o *PageTransaction) SetTotal(v int32)`

SetTotal sets Total field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


