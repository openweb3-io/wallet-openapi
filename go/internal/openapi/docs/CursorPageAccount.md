# CursorPageAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HasNext** | **bool** |  | 
**Items** | [**[]Account**](Account.md) |  | 
**NextCursor** | Pointer to **string** |  | [optional] 
**PrevCursor** | Pointer to **string** |  | [optional] 

## Methods

### NewCursorPageAccount

`func NewCursorPageAccount(hasNext bool, items []Account, ) *CursorPageAccount`

NewCursorPageAccount instantiates a new CursorPageAccount object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCursorPageAccountWithDefaults

`func NewCursorPageAccountWithDefaults() *CursorPageAccount`

NewCursorPageAccountWithDefaults instantiates a new CursorPageAccount object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetHasNext

`func (o *CursorPageAccount) GetHasNext() bool`

GetHasNext returns the HasNext field if non-nil, zero value otherwise.

### GetHasNextOk

`func (o *CursorPageAccount) GetHasNextOk() (*bool, bool)`

GetHasNextOk returns a tuple with the HasNext field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasNext

`func (o *CursorPageAccount) SetHasNext(v bool)`

SetHasNext sets HasNext field to given value.


### GetItems

`func (o *CursorPageAccount) GetItems() []Account`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *CursorPageAccount) GetItemsOk() (*[]Account, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *CursorPageAccount) SetItems(v []Account)`

SetItems sets Items field to given value.


### GetNextCursor

`func (o *CursorPageAccount) GetNextCursor() string`

GetNextCursor returns the NextCursor field if non-nil, zero value otherwise.

### GetNextCursorOk

`func (o *CursorPageAccount) GetNextCursorOk() (*string, bool)`

GetNextCursorOk returns a tuple with the NextCursor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextCursor

`func (o *CursorPageAccount) SetNextCursor(v string)`

SetNextCursor sets NextCursor field to given value.

### HasNextCursor

`func (o *CursorPageAccount) HasNextCursor() bool`

HasNextCursor returns a boolean if a field has been set.

### GetPrevCursor

`func (o *CursorPageAccount) GetPrevCursor() string`

GetPrevCursor returns the PrevCursor field if non-nil, zero value otherwise.

### GetPrevCursorOk

`func (o *CursorPageAccount) GetPrevCursorOk() (*string, bool)`

GetPrevCursorOk returns a tuple with the PrevCursor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevCursor

`func (o *CursorPageAccount) SetPrevCursor(v string)`

SetPrevCursor sets PrevCursor field to given value.

### HasPrevCursor

`func (o *CursorPageAccount) HasPrevCursor() bool`

HasPrevCursor returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


