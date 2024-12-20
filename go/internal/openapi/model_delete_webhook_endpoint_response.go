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

// DeleteWebhookEndpointResponse struct for DeleteWebhookEndpointResponse
type DeleteWebhookEndpointResponse struct {
	// The success of the webhook endpoint
	Success bool `json:"success"`
}

// NewDeleteWebhookEndpointResponse instantiates a new DeleteWebhookEndpointResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewDeleteWebhookEndpointResponse(success bool) *DeleteWebhookEndpointResponse {
	this := DeleteWebhookEndpointResponse{}
	this.Success = success
	return &this
}

// NewDeleteWebhookEndpointResponseWithDefaults instantiates a new DeleteWebhookEndpointResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewDeleteWebhookEndpointResponseWithDefaults() *DeleteWebhookEndpointResponse {
	this := DeleteWebhookEndpointResponse{}
	return &this
}

// GetSuccess returns the Success field value
func (o *DeleteWebhookEndpointResponse) GetSuccess() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Success
}

// GetSuccessOk returns a tuple with the Success field value
// and a boolean to check if the value has been set.
func (o *DeleteWebhookEndpointResponse) GetSuccessOk() (*bool, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Success, true
}

// SetSuccess sets field value
func (o *DeleteWebhookEndpointResponse) SetSuccess(v bool) {
	o.Success = v
}

func (o DeleteWebhookEndpointResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["success"] = o.Success
	}
	return json.Marshal(toSerialize)
}

type NullableDeleteWebhookEndpointResponse struct {
	value *DeleteWebhookEndpointResponse
	isSet bool
}

func (v NullableDeleteWebhookEndpointResponse) Get() *DeleteWebhookEndpointResponse {
	return v.value
}

func (v *NullableDeleteWebhookEndpointResponse) Set(val *DeleteWebhookEndpointResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableDeleteWebhookEndpointResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableDeleteWebhookEndpointResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDeleteWebhookEndpointResponse(val *DeleteWebhookEndpointResponse) *NullableDeleteWebhookEndpointResponse {
	return &NullableDeleteWebhookEndpointResponse{value: val, isSet: true}
}

func (v NullableDeleteWebhookEndpointResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDeleteWebhookEndpointResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


