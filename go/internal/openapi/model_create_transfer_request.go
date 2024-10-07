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

// CreateTransferRequest struct for CreateTransferRequest
type CreateTransferRequest struct {
	// The amount of currency to be transferred
	Amount string `json:"amount"`
	// The code of currency to be transferred
	Currency string `json:"currency"`
	// The ID of the wallet from which the transfer will be made
	From string `json:"from"`
	// The ID of the wallet to which the transfer will be made
	To string `json:"to"`
	// The ID of the wallet from which the transfer will be made
	WalletId string `json:"wallet_id"`
}

// NewCreateTransferRequest instantiates a new CreateTransferRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCreateTransferRequest(amount string, currency string, from string, to string, walletId string) *CreateTransferRequest {
	this := CreateTransferRequest{}
	this.Amount = amount
	this.Currency = currency
	this.From = from
	this.To = to
	this.WalletId = walletId
	return &this
}

// NewCreateTransferRequestWithDefaults instantiates a new CreateTransferRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCreateTransferRequestWithDefaults() *CreateTransferRequest {
	this := CreateTransferRequest{}
	return &this
}

// GetAmount returns the Amount field value
func (o *CreateTransferRequest) GetAmount() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Amount
}

// GetAmountOk returns a tuple with the Amount field value
// and a boolean to check if the value has been set.
func (o *CreateTransferRequest) GetAmountOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Amount, true
}

// SetAmount sets field value
func (o *CreateTransferRequest) SetAmount(v string) {
	o.Amount = v
}

// GetCurrency returns the Currency field value
func (o *CreateTransferRequest) GetCurrency() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Currency
}

// GetCurrencyOk returns a tuple with the Currency field value
// and a boolean to check if the value has been set.
func (o *CreateTransferRequest) GetCurrencyOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Currency, true
}

// SetCurrency sets field value
func (o *CreateTransferRequest) SetCurrency(v string) {
	o.Currency = v
}

// GetFrom returns the From field value
func (o *CreateTransferRequest) GetFrom() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.From
}

// GetFromOk returns a tuple with the From field value
// and a boolean to check if the value has been set.
func (o *CreateTransferRequest) GetFromOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.From, true
}

// SetFrom sets field value
func (o *CreateTransferRequest) SetFrom(v string) {
	o.From = v
}

// GetTo returns the To field value
func (o *CreateTransferRequest) GetTo() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.To
}

// GetToOk returns a tuple with the To field value
// and a boolean to check if the value has been set.
func (o *CreateTransferRequest) GetToOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.To, true
}

// SetTo sets field value
func (o *CreateTransferRequest) SetTo(v string) {
	o.To = v
}

// GetWalletId returns the WalletId field value
func (o *CreateTransferRequest) GetWalletId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.WalletId
}

// GetWalletIdOk returns a tuple with the WalletId field value
// and a boolean to check if the value has been set.
func (o *CreateTransferRequest) GetWalletIdOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.WalletId, true
}

// SetWalletId sets field value
func (o *CreateTransferRequest) SetWalletId(v string) {
	o.WalletId = v
}

func (o CreateTransferRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["amount"] = o.Amount
	}
	if true {
		toSerialize["currency"] = o.Currency
	}
	if true {
		toSerialize["from"] = o.From
	}
	if true {
		toSerialize["to"] = o.To
	}
	if true {
		toSerialize["wallet_id"] = o.WalletId
	}
	return json.Marshal(toSerialize)
}

type NullableCreateTransferRequest struct {
	value *CreateTransferRequest
	isSet bool
}

func (v NullableCreateTransferRequest) Get() *CreateTransferRequest {
	return v.value
}

func (v *NullableCreateTransferRequest) Set(val *CreateTransferRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateTransferRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateTransferRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateTransferRequest(val *CreateTransferRequest) *NullableCreateTransferRequest {
	return &NullableCreateTransferRequest{value: val, isSet: true}
}

func (v NullableCreateTransferRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateTransferRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


