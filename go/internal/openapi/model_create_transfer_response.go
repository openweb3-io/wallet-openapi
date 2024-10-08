/*
 * Wallet OpenAPI Documentation
 *
 * This is a custody wallet service openapi server.
 *
 * API version: 1.0
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// CreateTransferResponse struct for CreateTransferResponse
type CreateTransferResponse struct {
	TransactionId string `json:"transaction_id"`
}

// NewCreateTransferResponse instantiates a new CreateTransferResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCreateTransferResponse(transactionId string) *CreateTransferResponse {
	this := CreateTransferResponse{}
	this.TransactionId = transactionId
	return &this
}

// NewCreateTransferResponseWithDefaults instantiates a new CreateTransferResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCreateTransferResponseWithDefaults() *CreateTransferResponse {
	this := CreateTransferResponse{}
	return &this
}

// GetTransactionId returns the TransactionId field value
func (o *CreateTransferResponse) GetTransactionId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.TransactionId
}

// GetTransactionIdOk returns a tuple with the TransactionId field value
// and a boolean to check if the value has been set.
func (o *CreateTransferResponse) GetTransactionIdOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.TransactionId, true
}

// SetTransactionId sets field value
func (o *CreateTransferResponse) SetTransactionId(v string) {
	o.TransactionId = v
}

func (o CreateTransferResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["transaction_id"] = o.TransactionId
	}
	return json.Marshal(toSerialize)
}

type NullableCreateTransferResponse struct {
	value *CreateTransferResponse
	isSet bool
}

func (v NullableCreateTransferResponse) Get() *CreateTransferResponse {
	return v.value
}

func (v *NullableCreateTransferResponse) Set(val *CreateTransferResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateTransferResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateTransferResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateTransferResponse(val *CreateTransferResponse) *NullableCreateTransferResponse {
	return &NullableCreateTransferResponse{value: val, isSet: true}
}

func (v NullableCreateTransferResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateTransferResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


