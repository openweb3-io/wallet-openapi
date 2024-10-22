# CreateEndpoint

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | Pointer to **string** | The description of the webhook endpoint | [optional] 
**Disabled** | Pointer to **bool** | The disabled of the webhook endpoint | [optional] 
**FilterTypes** | **[]string** | The filter event types of the webhook endpoint | 
**Headers** | Pointer to **map[string]string** | The headers of the webhook endpoint | [optional] 
**Metadata** | Pointer to **map[string]interface{}** | The metadata of the webhook endpoint | [optional] 
**Uid** | Pointer to **string** | The uid of the webhook endpoint | [optional] 
**Url** | **string** | The url of the webhook endpoint | 

## Methods

### NewCreateEndpoint

`func NewCreateEndpoint(filterTypes []string, url string, ) *CreateEndpoint`

NewCreateEndpoint instantiates a new CreateEndpoint object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateEndpointWithDefaults

`func NewCreateEndpointWithDefaults() *CreateEndpoint`

NewCreateEndpointWithDefaults instantiates a new CreateEndpoint object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *CreateEndpoint) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CreateEndpoint) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CreateEndpoint) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CreateEndpoint) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDisabled

`func (o *CreateEndpoint) GetDisabled() bool`

GetDisabled returns the Disabled field if non-nil, zero value otherwise.

### GetDisabledOk

`func (o *CreateEndpoint) GetDisabledOk() (*bool, bool)`

GetDisabledOk returns a tuple with the Disabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisabled

`func (o *CreateEndpoint) SetDisabled(v bool)`

SetDisabled sets Disabled field to given value.

### HasDisabled

`func (o *CreateEndpoint) HasDisabled() bool`

HasDisabled returns a boolean if a field has been set.

### GetFilterTypes

`func (o *CreateEndpoint) GetFilterTypes() []string`

GetFilterTypes returns the FilterTypes field if non-nil, zero value otherwise.

### GetFilterTypesOk

`func (o *CreateEndpoint) GetFilterTypesOk() (*[]string, bool)`

GetFilterTypesOk returns a tuple with the FilterTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilterTypes

`func (o *CreateEndpoint) SetFilterTypes(v []string)`

SetFilterTypes sets FilterTypes field to given value.


### GetHeaders

`func (o *CreateEndpoint) GetHeaders() map[string]string`

GetHeaders returns the Headers field if non-nil, zero value otherwise.

### GetHeadersOk

`func (o *CreateEndpoint) GetHeadersOk() (*map[string]string, bool)`

GetHeadersOk returns a tuple with the Headers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeaders

`func (o *CreateEndpoint) SetHeaders(v map[string]string)`

SetHeaders sets Headers field to given value.

### HasHeaders

`func (o *CreateEndpoint) HasHeaders() bool`

HasHeaders returns a boolean if a field has been set.

### GetMetadata

`func (o *CreateEndpoint) GetMetadata() map[string]interface{}`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *CreateEndpoint) GetMetadataOk() (*map[string]interface{}, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *CreateEndpoint) SetMetadata(v map[string]interface{})`

SetMetadata sets Metadata field to given value.

### HasMetadata

`func (o *CreateEndpoint) HasMetadata() bool`

HasMetadata returns a boolean if a field has been set.

### GetUid

`func (o *CreateEndpoint) GetUid() string`

GetUid returns the Uid field if non-nil, zero value otherwise.

### GetUidOk

`func (o *CreateEndpoint) GetUidOk() (*string, bool)`

GetUidOk returns a tuple with the Uid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUid

`func (o *CreateEndpoint) SetUid(v string)`

SetUid sets Uid field to given value.

### HasUid

`func (o *CreateEndpoint) HasUid() bool`

HasUid returns a boolean if a field has been set.

### GetUrl

`func (o *CreateEndpoint) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *CreateEndpoint) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *CreateEndpoint) SetUrl(v string)`

SetUrl sets Url field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


