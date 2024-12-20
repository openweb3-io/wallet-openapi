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

// ResendWebhookEventResponse struct for ResendWebhookEventResponse
type ResendWebhookEventResponse struct {
	// The success of the webhook event
	Success bool `json:"success"`
}

// NewResendWebhookEventResponse instantiates a new ResendWebhookEventResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewResendWebhookEventResponse(success bool) *ResendWebhookEventResponse {
	this := ResendWebhookEventResponse{}
	this.Success = success
	return &this
}

// NewResendWebhookEventResponseWithDefaults instantiates a new ResendWebhookEventResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewResendWebhookEventResponseWithDefaults() *ResendWebhookEventResponse {
	this := ResendWebhookEventResponse{}
	return &this
}

// GetSuccess returns the Success field value
func (o *ResendWebhookEventResponse) GetSuccess() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Success
}

// GetSuccessOk returns a tuple with the Success field value
// and a boolean to check if the value has been set.
func (o *ResendWebhookEventResponse) GetSuccessOk() (*bool, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Success, true
}

// SetSuccess sets field value
func (o *ResendWebhookEventResponse) SetSuccess(v bool) {
	o.Success = v
}

func (o ResendWebhookEventResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["success"] = o.Success
	}
	return json.Marshal(toSerialize)
}

type NullableResendWebhookEventResponse struct {
	value *ResendWebhookEventResponse
	isSet bool
}

func (v NullableResendWebhookEventResponse) Get() *ResendWebhookEventResponse {
	return v.value
}

func (v *NullableResendWebhookEventResponse) Set(val *ResendWebhookEventResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableResendWebhookEventResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableResendWebhookEventResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableResendWebhookEventResponse(val *ResendWebhookEventResponse) *NullableResendWebhookEventResponse {
	return &NullableResendWebhookEventResponse{value: val, isSet: true}
}

func (v NullableResendWebhookEventResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableResendWebhookEventResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


