# CreateTransferRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Amount** | Pointer to **string** | The amount of currency to be transferred | [optional] 
**Currency** | Pointer to **string** | The code of currency to be transferred | [optional] 
**From** | Pointer to **string** | The ID of the wallet from which the transfer will be made | [optional] 
**To** | Pointer to **string** | The ID of the wallet to which the transfer will be made | [optional] 

## Methods

### NewCreateTransferRequest

`func NewCreateTransferRequest() *CreateTransferRequest`

NewCreateTransferRequest instantiates a new CreateTransferRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateTransferRequestWithDefaults

`func NewCreateTransferRequestWithDefaults() *CreateTransferRequest`

NewCreateTransferRequestWithDefaults instantiates a new CreateTransferRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAmount

`func (o *CreateTransferRequest) GetAmount() string`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *CreateTransferRequest) GetAmountOk() (*string, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *CreateTransferRequest) SetAmount(v string)`

SetAmount sets Amount field to given value.

### HasAmount

`func (o *CreateTransferRequest) HasAmount() bool`

HasAmount returns a boolean if a field has been set.

### GetCurrency

`func (o *CreateTransferRequest) GetCurrency() string`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *CreateTransferRequest) GetCurrencyOk() (*string, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *CreateTransferRequest) SetCurrency(v string)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *CreateTransferRequest) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### GetFrom

`func (o *CreateTransferRequest) GetFrom() string`

GetFrom returns the From field if non-nil, zero value otherwise.

### GetFromOk

`func (o *CreateTransferRequest) GetFromOk() (*string, bool)`

GetFromOk returns a tuple with the From field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrom

`func (o *CreateTransferRequest) SetFrom(v string)`

SetFrom sets From field to given value.

### HasFrom

`func (o *CreateTransferRequest) HasFrom() bool`

HasFrom returns a boolean if a field has been set.

### GetTo

`func (o *CreateTransferRequest) GetTo() string`

GetTo returns the To field if non-nil, zero value otherwise.

### GetToOk

`func (o *CreateTransferRequest) GetToOk() (*string, bool)`

GetToOk returns a tuple with the To field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTo

`func (o *CreateTransferRequest) SetTo(v string)`

SetTo sets To field to given value.

### HasTo

`func (o *CreateTransferRequest) HasTo() bool`

HasTo returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


