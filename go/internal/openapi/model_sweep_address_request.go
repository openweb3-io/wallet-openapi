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

// SweepAddressRequest struct for SweepAddressRequest
type SweepAddressRequest struct {
	// currency to be swept
	Currency string `json:"currency"`
}

// NewSweepAddressRequest instantiates a new SweepAddressRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSweepAddressRequest(currency string) *SweepAddressRequest {
	this := SweepAddressRequest{}
	this.Currency = currency
	return &this
}

// NewSweepAddressRequestWithDefaults instantiates a new SweepAddressRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSweepAddressRequestWithDefaults() *SweepAddressRequest {
	this := SweepAddressRequest{}
	return &this
}

// GetCurrency returns the Currency field value
func (o *SweepAddressRequest) GetCurrency() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Currency
}

// GetCurrencyOk returns a tuple with the Currency field value
// and a boolean to check if the value has been set.
func (o *SweepAddressRequest) GetCurrencyOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Currency, true
}

// SetCurrency sets field value
func (o *SweepAddressRequest) SetCurrency(v string) {
	o.Currency = v
}

func (o SweepAddressRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["currency"] = o.Currency
	}
	return json.Marshal(toSerialize)
}

type NullableSweepAddressRequest struct {
	value *SweepAddressRequest
	isSet bool
}

func (v NullableSweepAddressRequest) Get() *SweepAddressRequest {
	return v.value
}

func (v *NullableSweepAddressRequest) Set(val *SweepAddressRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableSweepAddressRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableSweepAddressRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSweepAddressRequest(val *SweepAddressRequest) *NullableSweepAddressRequest {
	return &NullableSweepAddressRequest{value: val, isSet: true}
}

func (v NullableSweepAddressRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSweepAddressRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

