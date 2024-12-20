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

// CreateGasStationRequest struct for CreateGasStationRequest
type CreateGasStationRequest struct {
	// Disabled
	Disabled bool `json:"disabled"`
	// Gas Capacity
	GasCapacity string `json:"gas_capacity"`
	// Gas Threshold
	GasThreshold string `json:"gas_threshold"`
	// Max Fee Limit
	MaxFeeLimit string `json:"max_fee_limit"`
	// Network
	Network string `json:"network"`
}

// NewCreateGasStationRequest instantiates a new CreateGasStationRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCreateGasStationRequest(disabled bool, gasCapacity string, gasThreshold string, maxFeeLimit string, network string) *CreateGasStationRequest {
	this := CreateGasStationRequest{}
	this.Disabled = disabled
	this.GasCapacity = gasCapacity
	this.GasThreshold = gasThreshold
	this.MaxFeeLimit = maxFeeLimit
	this.Network = network
	return &this
}

// NewCreateGasStationRequestWithDefaults instantiates a new CreateGasStationRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCreateGasStationRequestWithDefaults() *CreateGasStationRequest {
	this := CreateGasStationRequest{}
	return &this
}

// GetDisabled returns the Disabled field value
func (o *CreateGasStationRequest) GetDisabled() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Disabled
}

// GetDisabledOk returns a tuple with the Disabled field value
// and a boolean to check if the value has been set.
func (o *CreateGasStationRequest) GetDisabledOk() (*bool, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Disabled, true
}

// SetDisabled sets field value
func (o *CreateGasStationRequest) SetDisabled(v bool) {
	o.Disabled = v
}

// GetGasCapacity returns the GasCapacity field value
func (o *CreateGasStationRequest) GetGasCapacity() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.GasCapacity
}

// GetGasCapacityOk returns a tuple with the GasCapacity field value
// and a boolean to check if the value has been set.
func (o *CreateGasStationRequest) GetGasCapacityOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.GasCapacity, true
}

// SetGasCapacity sets field value
func (o *CreateGasStationRequest) SetGasCapacity(v string) {
	o.GasCapacity = v
}

// GetGasThreshold returns the GasThreshold field value
func (o *CreateGasStationRequest) GetGasThreshold() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.GasThreshold
}

// GetGasThresholdOk returns a tuple with the GasThreshold field value
// and a boolean to check if the value has been set.
func (o *CreateGasStationRequest) GetGasThresholdOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.GasThreshold, true
}

// SetGasThreshold sets field value
func (o *CreateGasStationRequest) SetGasThreshold(v string) {
	o.GasThreshold = v
}

// GetMaxFeeLimit returns the MaxFeeLimit field value
func (o *CreateGasStationRequest) GetMaxFeeLimit() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.MaxFeeLimit
}

// GetMaxFeeLimitOk returns a tuple with the MaxFeeLimit field value
// and a boolean to check if the value has been set.
func (o *CreateGasStationRequest) GetMaxFeeLimitOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.MaxFeeLimit, true
}

// SetMaxFeeLimit sets field value
func (o *CreateGasStationRequest) SetMaxFeeLimit(v string) {
	o.MaxFeeLimit = v
}

// GetNetwork returns the Network field value
func (o *CreateGasStationRequest) GetNetwork() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Network
}

// GetNetworkOk returns a tuple with the Network field value
// and a boolean to check if the value has been set.
func (o *CreateGasStationRequest) GetNetworkOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Network, true
}

// SetNetwork sets field value
func (o *CreateGasStationRequest) SetNetwork(v string) {
	o.Network = v
}

func (o CreateGasStationRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["disabled"] = o.Disabled
	}
	if true {
		toSerialize["gas_capacity"] = o.GasCapacity
	}
	if true {
		toSerialize["gas_threshold"] = o.GasThreshold
	}
	if true {
		toSerialize["max_fee_limit"] = o.MaxFeeLimit
	}
	if true {
		toSerialize["network"] = o.Network
	}
	return json.Marshal(toSerialize)
}

type NullableCreateGasStationRequest struct {
	value *CreateGasStationRequest
	isSet bool
}

func (v NullableCreateGasStationRequest) Get() *CreateGasStationRequest {
	return v.value
}

func (v *NullableCreateGasStationRequest) Set(val *CreateGasStationRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateGasStationRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateGasStationRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateGasStationRequest(val *CreateGasStationRequest) *NullableCreateGasStationRequest {
	return &NullableCreateGasStationRequest{value: val, isSet: true}
}

func (v NullableCreateGasStationRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateGasStationRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


