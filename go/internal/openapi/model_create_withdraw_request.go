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

// CreateWithdrawRequest struct for CreateWithdrawRequest
type CreateWithdrawRequest struct {
	// The amount of currency to be withdrawn
	Amount string `json:"amount"`
	// The code of currency to be withdrawn.
	Currency string `json:"currency"`
	// The fee of the withdrawal
	Fee *string `json:"fee,omitempty"`
	// The currency of fee
	FeeCurrency *string `json:"fee_currency,omitempty"`
	// The network of the currency to be withdrawn.
	Network string `json:"network"`
	// The recipient address where the withdrawn funds will be sent. This is usually a wallet address specific to the chosen network.
	ToAddress string `json:"to_address"`
	// The ID of the wallet from which the withdrawal will be made.
	WalletId string `json:"wallet_id"`
}

// NewCreateWithdrawRequest instantiates a new CreateWithdrawRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCreateWithdrawRequest(amount string, currency string, network string, toAddress string, walletId string) *CreateWithdrawRequest {
	this := CreateWithdrawRequest{}
	this.Amount = amount
	this.Currency = currency
	this.Network = network
	this.ToAddress = toAddress
	this.WalletId = walletId
	return &this
}

// NewCreateWithdrawRequestWithDefaults instantiates a new CreateWithdrawRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCreateWithdrawRequestWithDefaults() *CreateWithdrawRequest {
	this := CreateWithdrawRequest{}
	return &this
}

// GetAmount returns the Amount field value
func (o *CreateWithdrawRequest) GetAmount() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Amount
}

// GetAmountOk returns a tuple with the Amount field value
// and a boolean to check if the value has been set.
func (o *CreateWithdrawRequest) GetAmountOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Amount, true
}

// SetAmount sets field value
func (o *CreateWithdrawRequest) SetAmount(v string) {
	o.Amount = v
}

// GetCurrency returns the Currency field value
func (o *CreateWithdrawRequest) GetCurrency() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Currency
}

// GetCurrencyOk returns a tuple with the Currency field value
// and a boolean to check if the value has been set.
func (o *CreateWithdrawRequest) GetCurrencyOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Currency, true
}

// SetCurrency sets field value
func (o *CreateWithdrawRequest) SetCurrency(v string) {
	o.Currency = v
}

// GetFee returns the Fee field value if set, zero value otherwise.
func (o *CreateWithdrawRequest) GetFee() string {
	if o == nil || o.Fee == nil {
		var ret string
		return ret
	}
	return *o.Fee
}

// GetFeeOk returns a tuple with the Fee field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateWithdrawRequest) GetFeeOk() (*string, bool) {
	if o == nil || o.Fee == nil {
		return nil, false
	}
	return o.Fee, true
}

// HasFee returns a boolean if a field has been set.
func (o *CreateWithdrawRequest) HasFee() bool {
	if o != nil && o.Fee != nil {
		return true
	}

	return false
}

// SetFee gets a reference to the given string and assigns it to the Fee field.
func (o *CreateWithdrawRequest) SetFee(v string) {
	o.Fee = &v
}

// GetFeeCurrency returns the FeeCurrency field value if set, zero value otherwise.
func (o *CreateWithdrawRequest) GetFeeCurrency() string {
	if o == nil || o.FeeCurrency == nil {
		var ret string
		return ret
	}
	return *o.FeeCurrency
}

// GetFeeCurrencyOk returns a tuple with the FeeCurrency field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateWithdrawRequest) GetFeeCurrencyOk() (*string, bool) {
	if o == nil || o.FeeCurrency == nil {
		return nil, false
	}
	return o.FeeCurrency, true
}

// HasFeeCurrency returns a boolean if a field has been set.
func (o *CreateWithdrawRequest) HasFeeCurrency() bool {
	if o != nil && o.FeeCurrency != nil {
		return true
	}

	return false
}

// SetFeeCurrency gets a reference to the given string and assigns it to the FeeCurrency field.
func (o *CreateWithdrawRequest) SetFeeCurrency(v string) {
	o.FeeCurrency = &v
}

// GetNetwork returns the Network field value
func (o *CreateWithdrawRequest) GetNetwork() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Network
}

// GetNetworkOk returns a tuple with the Network field value
// and a boolean to check if the value has been set.
func (o *CreateWithdrawRequest) GetNetworkOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Network, true
}

// SetNetwork sets field value
func (o *CreateWithdrawRequest) SetNetwork(v string) {
	o.Network = v
}

// GetToAddress returns the ToAddress field value
func (o *CreateWithdrawRequest) GetToAddress() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ToAddress
}

// GetToAddressOk returns a tuple with the ToAddress field value
// and a boolean to check if the value has been set.
func (o *CreateWithdrawRequest) GetToAddressOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.ToAddress, true
}

// SetToAddress sets field value
func (o *CreateWithdrawRequest) SetToAddress(v string) {
	o.ToAddress = v
}

// GetWalletId returns the WalletId field value
func (o *CreateWithdrawRequest) GetWalletId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.WalletId
}

// GetWalletIdOk returns a tuple with the WalletId field value
// and a boolean to check if the value has been set.
func (o *CreateWithdrawRequest) GetWalletIdOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.WalletId, true
}

// SetWalletId sets field value
func (o *CreateWithdrawRequest) SetWalletId(v string) {
	o.WalletId = v
}

func (o CreateWithdrawRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["amount"] = o.Amount
	}
	if true {
		toSerialize["currency"] = o.Currency
	}
	if o.Fee != nil {
		toSerialize["fee"] = o.Fee
	}
	if o.FeeCurrency != nil {
		toSerialize["fee_currency"] = o.FeeCurrency
	}
	if true {
		toSerialize["network"] = o.Network
	}
	if true {
		toSerialize["to_address"] = o.ToAddress
	}
	if true {
		toSerialize["wallet_id"] = o.WalletId
	}
	return json.Marshal(toSerialize)
}

type NullableCreateWithdrawRequest struct {
	value *CreateWithdrawRequest
	isSet bool
}

func (v NullableCreateWithdrawRequest) Get() *CreateWithdrawRequest {
	return v.value
}

func (v *NullableCreateWithdrawRequest) Set(val *CreateWithdrawRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateWithdrawRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateWithdrawRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateWithdrawRequest(val *CreateWithdrawRequest) *NullableCreateWithdrawRequest {
	return &NullableCreateWithdrawRequest{value: val, isSet: true}
}

func (v NullableCreateWithdrawRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateWithdrawRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


