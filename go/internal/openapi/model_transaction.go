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

// Transaction struct for Transaction
type Transaction struct {
	// The total amount of money involved in the transaction.
	Amount string `json:"amount"`
	// A URL or path to an avatar image associated with the transaction, often used to visually represent the transaction's source or recipient.
	Avatar string `json:"avatar"`
	// The date and time when the transaction was created.
	CreatedAt string `json:"created_at"`
	// The code of currency used in the transaction (e.g., TON, USDT, USD, EUR, etc.).
	Currency string `json:"currency"`
	// Indicates the flow of the transaction, typically whether it is incoming or outgoing.
	Direction TransactionDirection `json:"direction"`
	// The amount of fee
	FeeAmount string `json:"fee_amount"`
	// The currency of fee
	FeeCurrency string `json:"fee_currency"`
	// The address of the sender.
	FromAddress string `json:"from_address"`
	// The payment gateway or platform used to process the transaction.
	Gateway string `json:"gateway"`
	// A unique identifier for the transaction.
	Id string `json:"id"`
	// The blockchain network on which the transaction takes place.
	Network string `json:"network"`
	// The current status of the transaction.
	Status TransactionStatus `json:"status"`
	// The address of the recipient.
	ToAddress string `json:"to_address"`
	// The ID of the wallet associated with the transaction.
	WalletId string `json:"wallet_id"`
}

// NewTransaction instantiates a new Transaction object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewTransaction(amount string, avatar string, createdAt string, currency string, direction TransactionDirection, feeAmount string, feeCurrency string, fromAddress string, gateway string, id string, network string, status TransactionStatus, toAddress string, walletId string) *Transaction {
	this := Transaction{}
	this.Amount = amount
	this.Avatar = avatar
	this.CreatedAt = createdAt
	this.Currency = currency
	this.Direction = direction
	this.FeeAmount = feeAmount
	this.FeeCurrency = feeCurrency
	this.FromAddress = fromAddress
	this.Gateway = gateway
	this.Id = id
	this.Network = network
	this.Status = status
	this.ToAddress = toAddress
	this.WalletId = walletId
	return &this
}

// NewTransactionWithDefaults instantiates a new Transaction object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewTransactionWithDefaults() *Transaction {
	this := Transaction{}
	return &this
}

// GetAmount returns the Amount field value
func (o *Transaction) GetAmount() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Amount
}

// GetAmountOk returns a tuple with the Amount field value
// and a boolean to check if the value has been set.
func (o *Transaction) GetAmountOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Amount, true
}

// SetAmount sets field value
func (o *Transaction) SetAmount(v string) {
	o.Amount = v
}

// GetAvatar returns the Avatar field value
func (o *Transaction) GetAvatar() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Avatar
}

// GetAvatarOk returns a tuple with the Avatar field value
// and a boolean to check if the value has been set.
func (o *Transaction) GetAvatarOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Avatar, true
}

// SetAvatar sets field value
func (o *Transaction) SetAvatar(v string) {
	o.Avatar = v
}

// GetCreatedAt returns the CreatedAt field value
func (o *Transaction) GetCreatedAt() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value
// and a boolean to check if the value has been set.
func (o *Transaction) GetCreatedAtOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.CreatedAt, true
}

// SetCreatedAt sets field value
func (o *Transaction) SetCreatedAt(v string) {
	o.CreatedAt = v
}

// GetCurrency returns the Currency field value
func (o *Transaction) GetCurrency() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Currency
}

// GetCurrencyOk returns a tuple with the Currency field value
// and a boolean to check if the value has been set.
func (o *Transaction) GetCurrencyOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Currency, true
}

// SetCurrency sets field value
func (o *Transaction) SetCurrency(v string) {
	o.Currency = v
}

// GetDirection returns the Direction field value
func (o *Transaction) GetDirection() TransactionDirection {
	if o == nil {
		var ret TransactionDirection
		return ret
	}

	return o.Direction
}

// GetDirectionOk returns a tuple with the Direction field value
// and a boolean to check if the value has been set.
func (o *Transaction) GetDirectionOk() (*TransactionDirection, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Direction, true
}

// SetDirection sets field value
func (o *Transaction) SetDirection(v TransactionDirection) {
	o.Direction = v
}

// GetFeeAmount returns the FeeAmount field value
func (o *Transaction) GetFeeAmount() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.FeeAmount
}

// GetFeeAmountOk returns a tuple with the FeeAmount field value
// and a boolean to check if the value has been set.
func (o *Transaction) GetFeeAmountOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.FeeAmount, true
}

// SetFeeAmount sets field value
func (o *Transaction) SetFeeAmount(v string) {
	o.FeeAmount = v
}

// GetFeeCurrency returns the FeeCurrency field value
func (o *Transaction) GetFeeCurrency() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.FeeCurrency
}

// GetFeeCurrencyOk returns a tuple with the FeeCurrency field value
// and a boolean to check if the value has been set.
func (o *Transaction) GetFeeCurrencyOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.FeeCurrency, true
}

// SetFeeCurrency sets field value
func (o *Transaction) SetFeeCurrency(v string) {
	o.FeeCurrency = v
}

// GetFromAddress returns the FromAddress field value
func (o *Transaction) GetFromAddress() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.FromAddress
}

// GetFromAddressOk returns a tuple with the FromAddress field value
// and a boolean to check if the value has been set.
func (o *Transaction) GetFromAddressOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.FromAddress, true
}

// SetFromAddress sets field value
func (o *Transaction) SetFromAddress(v string) {
	o.FromAddress = v
}

// GetGateway returns the Gateway field value
func (o *Transaction) GetGateway() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Gateway
}

// GetGatewayOk returns a tuple with the Gateway field value
// and a boolean to check if the value has been set.
func (o *Transaction) GetGatewayOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Gateway, true
}

// SetGateway sets field value
func (o *Transaction) SetGateway(v string) {
	o.Gateway = v
}

// GetId returns the Id field value
func (o *Transaction) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *Transaction) GetIdOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *Transaction) SetId(v string) {
	o.Id = v
}

// GetNetwork returns the Network field value
func (o *Transaction) GetNetwork() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Network
}

// GetNetworkOk returns a tuple with the Network field value
// and a boolean to check if the value has been set.
func (o *Transaction) GetNetworkOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Network, true
}

// SetNetwork sets field value
func (o *Transaction) SetNetwork(v string) {
	o.Network = v
}

// GetStatus returns the Status field value
func (o *Transaction) GetStatus() TransactionStatus {
	if o == nil {
		var ret TransactionStatus
		return ret
	}

	return o.Status
}

// GetStatusOk returns a tuple with the Status field value
// and a boolean to check if the value has been set.
func (o *Transaction) GetStatusOk() (*TransactionStatus, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Status, true
}

// SetStatus sets field value
func (o *Transaction) SetStatus(v TransactionStatus) {
	o.Status = v
}

// GetToAddress returns the ToAddress field value
func (o *Transaction) GetToAddress() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ToAddress
}

// GetToAddressOk returns a tuple with the ToAddress field value
// and a boolean to check if the value has been set.
func (o *Transaction) GetToAddressOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.ToAddress, true
}

// SetToAddress sets field value
func (o *Transaction) SetToAddress(v string) {
	o.ToAddress = v
}

// GetWalletId returns the WalletId field value
func (o *Transaction) GetWalletId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.WalletId
}

// GetWalletIdOk returns a tuple with the WalletId field value
// and a boolean to check if the value has been set.
func (o *Transaction) GetWalletIdOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.WalletId, true
}

// SetWalletId sets field value
func (o *Transaction) SetWalletId(v string) {
	o.WalletId = v
}

func (o Transaction) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["amount"] = o.Amount
	}
	if true {
		toSerialize["avatar"] = o.Avatar
	}
	if true {
		toSerialize["created_at"] = o.CreatedAt
	}
	if true {
		toSerialize["currency"] = o.Currency
	}
	if true {
		toSerialize["direction"] = o.Direction
	}
	if true {
		toSerialize["fee_amount"] = o.FeeAmount
	}
	if true {
		toSerialize["fee_currency"] = o.FeeCurrency
	}
	if true {
		toSerialize["from_address"] = o.FromAddress
	}
	if true {
		toSerialize["gateway"] = o.Gateway
	}
	if true {
		toSerialize["id"] = o.Id
	}
	if true {
		toSerialize["network"] = o.Network
	}
	if true {
		toSerialize["status"] = o.Status
	}
	if true {
		toSerialize["to_address"] = o.ToAddress
	}
	if true {
		toSerialize["wallet_id"] = o.WalletId
	}
	return json.Marshal(toSerialize)
}

type NullableTransaction struct {
	value *Transaction
	isSet bool
}

func (v NullableTransaction) Get() *Transaction {
	return v.value
}

func (v *NullableTransaction) Set(val *Transaction) {
	v.value = val
	v.isSet = true
}

func (v NullableTransaction) IsSet() bool {
	return v.isSet
}

func (v *NullableTransaction) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTransaction(val *Transaction) *NullableTransaction {
	return &NullableTransaction{value: val, isSet: true}
}

func (v NullableTransaction) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTransaction) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


