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

// SweepAddressResponse struct for SweepAddressResponse
type SweepAddressResponse struct {
	// transaction id
	TxId *string `json:"tx_id,omitempty"`
}

// NewSweepAddressResponse instantiates a new SweepAddressResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSweepAddressResponse() *SweepAddressResponse {
	this := SweepAddressResponse{}
	return &this
}

// NewSweepAddressResponseWithDefaults instantiates a new SweepAddressResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSweepAddressResponseWithDefaults() *SweepAddressResponse {
	this := SweepAddressResponse{}
	return &this
}

// GetTxId returns the TxId field value if set, zero value otherwise.
func (o *SweepAddressResponse) GetTxId() string {
	if o == nil || o.TxId == nil {
		var ret string
		return ret
	}
	return *o.TxId
}

// GetTxIdOk returns a tuple with the TxId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SweepAddressResponse) GetTxIdOk() (*string, bool) {
	if o == nil || o.TxId == nil {
		return nil, false
	}
	return o.TxId, true
}

// HasTxId returns a boolean if a field has been set.
func (o *SweepAddressResponse) HasTxId() bool {
	if o != nil && o.TxId != nil {
		return true
	}

	return false
}

// SetTxId gets a reference to the given string and assigns it to the TxId field.
func (o *SweepAddressResponse) SetTxId(v string) {
	o.TxId = &v
}

func (o SweepAddressResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.TxId != nil {
		toSerialize["tx_id"] = o.TxId
	}
	return json.Marshal(toSerialize)
}

type NullableSweepAddressResponse struct {
	value *SweepAddressResponse
	isSet bool
}

func (v NullableSweepAddressResponse) Get() *SweepAddressResponse {
	return v.value
}

func (v *NullableSweepAddressResponse) Set(val *SweepAddressResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableSweepAddressResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableSweepAddressResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSweepAddressResponse(val *SweepAddressResponse) *NullableSweepAddressResponse {
	return &NullableSweepAddressResponse{value: val, isSet: true}
}

func (v NullableSweepAddressResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSweepAddressResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


