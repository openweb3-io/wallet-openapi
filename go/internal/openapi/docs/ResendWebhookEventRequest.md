# ResendWebhookEventRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EndpointId** | **string** | The endpoint id of the webhook event | 
**EventId** | **string** | The id of the webhook event | 

## Methods

### NewResendWebhookEventRequest

`func NewResendWebhookEventRequest(endpointId string, eventId string, ) *ResendWebhookEventRequest`

NewResendWebhookEventRequest instantiates a new ResendWebhookEventRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewResendWebhookEventRequestWithDefaults

`func NewResendWebhookEventRequestWithDefaults() *ResendWebhookEventRequest`

NewResendWebhookEventRequestWithDefaults instantiates a new ResendWebhookEventRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEndpointId

`func (o *ResendWebhookEventRequest) GetEndpointId() string`

GetEndpointId returns the EndpointId field if non-nil, zero value otherwise.

### GetEndpointIdOk

`func (o *ResendWebhookEventRequest) GetEndpointIdOk() (*string, bool)`

GetEndpointIdOk returns a tuple with the EndpointId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndpointId

`func (o *ResendWebhookEventRequest) SetEndpointId(v string)`

SetEndpointId sets EndpointId field to given value.


### GetEventId

`func (o *ResendWebhookEventRequest) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *ResendWebhookEventRequest) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *ResendWebhookEventRequest) SetEventId(v string)`

SetEventId sets EventId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


