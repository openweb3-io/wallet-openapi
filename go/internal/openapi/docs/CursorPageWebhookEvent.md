# CursorPageWebhookEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HasNext** | **bool** |  | 
**Items** | [**[]WebhookEvent**](WebhookEvent.md) |  | 
**NextCursor** | Pointer to **string** |  | [optional] 
**PrevCursor** | Pointer to **string** |  | [optional] 

## Methods

### NewCursorPageWebhookEvent

`func NewCursorPageWebhookEvent(hasNext bool, items []WebhookEvent, ) *CursorPageWebhookEvent`

NewCursorPageWebhookEvent instantiates a new CursorPageWebhookEvent object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCursorPageWebhookEventWithDefaults

`func NewCursorPageWebhookEventWithDefaults() *CursorPageWebhookEvent`

NewCursorPageWebhookEventWithDefaults instantiates a new CursorPageWebhookEvent object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetHasNext

`func (o *CursorPageWebhookEvent) GetHasNext() bool`

GetHasNext returns the HasNext field if non-nil, zero value otherwise.

### GetHasNextOk

`func (o *CursorPageWebhookEvent) GetHasNextOk() (*bool, bool)`

GetHasNextOk returns a tuple with the HasNext field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasNext

`func (o *CursorPageWebhookEvent) SetHasNext(v bool)`

SetHasNext sets HasNext field to given value.


### GetItems

`func (o *CursorPageWebhookEvent) GetItems() []WebhookEvent`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *CursorPageWebhookEvent) GetItemsOk() (*[]WebhookEvent, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *CursorPageWebhookEvent) SetItems(v []WebhookEvent)`

SetItems sets Items field to given value.


### GetNextCursor

`func (o *CursorPageWebhookEvent) GetNextCursor() string`

GetNextCursor returns the NextCursor field if non-nil, zero value otherwise.

### GetNextCursorOk

`func (o *CursorPageWebhookEvent) GetNextCursorOk() (*string, bool)`

GetNextCursorOk returns a tuple with the NextCursor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextCursor

`func (o *CursorPageWebhookEvent) SetNextCursor(v string)`

SetNextCursor sets NextCursor field to given value.

### HasNextCursor

`func (o *CursorPageWebhookEvent) HasNextCursor() bool`

HasNextCursor returns a boolean if a field has been set.

### GetPrevCursor

`func (o *CursorPageWebhookEvent) GetPrevCursor() string`

GetPrevCursor returns the PrevCursor field if non-nil, zero value otherwise.

### GetPrevCursorOk

`func (o *CursorPageWebhookEvent) GetPrevCursorOk() (*string, bool)`

GetPrevCursorOk returns a tuple with the PrevCursor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevCursor

`func (o *CursorPageWebhookEvent) SetPrevCursor(v string)`

SetPrevCursor sets PrevCursor field to given value.

### HasPrevCursor

`func (o *CursorPageWebhookEvent) HasPrevCursor() bool`

HasPrevCursor returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


