# SweepAddressRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Amount** | Pointer to **string** | amount in smallest unit to be swept, if not provided, all funds will be swept | [optional] 
**Currency** | **string** | currency to be swept | 

## Methods

### NewSweepAddressRequest

`func NewSweepAddressRequest(currency string, ) *SweepAddressRequest`

NewSweepAddressRequest instantiates a new SweepAddressRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSweepAddressRequestWithDefaults

`func NewSweepAddressRequestWithDefaults() *SweepAddressRequest`

NewSweepAddressRequestWithDefaults instantiates a new SweepAddressRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAmount

`func (o *SweepAddressRequest) GetAmount() string`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *SweepAddressRequest) GetAmountOk() (*string, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *SweepAddressRequest) SetAmount(v string)`

SetAmount sets Amount field to given value.

### HasAmount

`func (o *SweepAddressRequest) HasAmount() bool`

HasAmount returns a boolean if a field has been set.

### GetCurrency

`func (o *SweepAddressRequest) GetCurrency() string`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *SweepAddressRequest) GetCurrencyOk() (*string, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *SweepAddressRequest) SetCurrency(v string)`

SetCurrency sets Currency field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


