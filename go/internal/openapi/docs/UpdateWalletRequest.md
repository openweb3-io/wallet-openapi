# UpdateWalletRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | Wallet Name | [optional] 
**Uid** | Pointer to **string** | Custom ID | [optional] 

## Methods

### NewUpdateWalletRequest

`func NewUpdateWalletRequest() *UpdateWalletRequest`

NewUpdateWalletRequest instantiates a new UpdateWalletRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateWalletRequestWithDefaults

`func NewUpdateWalletRequestWithDefaults() *UpdateWalletRequest`

NewUpdateWalletRequestWithDefaults instantiates a new UpdateWalletRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *UpdateWalletRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *UpdateWalletRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *UpdateWalletRequest) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *UpdateWalletRequest) HasName() bool`

HasName returns a boolean if a field has been set.

### GetUid

`func (o *UpdateWalletRequest) GetUid() string`

GetUid returns the Uid field if non-nil, zero value otherwise.

### GetUidOk

`func (o *UpdateWalletRequest) GetUidOk() (*string, bool)`

GetUidOk returns a tuple with the Uid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUid

`func (o *UpdateWalletRequest) SetUid(v string)`

SetUid sets Uid field to given value.

### HasUid

`func (o *UpdateWalletRequest) HasUid() bool`

HasUid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


