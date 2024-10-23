# Transaction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Amount** | **string** | The total amount of money involved in the transaction. | 
**Avatar** | **string** | A URL or path to an avatar image associated with the transaction, often used to visually represent the transaction&#39;s source or recipient. | 
**CreatedAt** | **string** | The date and time when the transaction was created. | 
**Currency** | **string** | The code of currency used in the transaction (e.g., TON, USDT, USD, EUR, etc.). | 
**Direction** | [**TransactionDirection**](TransactionDirection.md) | Indicates the flow of the transaction, typically whether it is incoming or outgoing. | 
**FeeAmount** | **string** | The amount of fee | 
**FeeCurrency** | **string** | The currency of fee | 
**FromAddress** | **string** | The address of the sender. | 
**Gateway** | **string** | The payment gateway or platform used to process the transaction. | 
**Id** | **string** | A unique identifier for the transaction. | 
**Network** | **string** | The blockchain network on which the transaction takes place. | 
**Status** | [**TransactionStatus**](TransactionStatus.md) | The current status of the transaction. | 
**ToAddress** | **string** | The address of the recipient. | 
**WalletId** | **string** | The ID of the wallet associated with the transaction. | 

## Methods

### NewTransaction

`func NewTransaction(amount string, avatar string, createdAt string, currency string, direction TransactionDirection, feeAmount string, feeCurrency string, fromAddress string, gateway string, id string, network string, status TransactionStatus, toAddress string, walletId string, ) *Transaction`

NewTransaction instantiates a new Transaction object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTransactionWithDefaults

`func NewTransactionWithDefaults() *Transaction`

NewTransactionWithDefaults instantiates a new Transaction object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAmount

`func (o *Transaction) GetAmount() string`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *Transaction) GetAmountOk() (*string, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *Transaction) SetAmount(v string)`

SetAmount sets Amount field to given value.


### GetAvatar

`func (o *Transaction) GetAvatar() string`

GetAvatar returns the Avatar field if non-nil, zero value otherwise.

### GetAvatarOk

`func (o *Transaction) GetAvatarOk() (*string, bool)`

GetAvatarOk returns a tuple with the Avatar field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvatar

`func (o *Transaction) SetAvatar(v string)`

SetAvatar sets Avatar field to given value.


### GetCreatedAt

`func (o *Transaction) GetCreatedAt() string`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *Transaction) GetCreatedAtOk() (*string, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *Transaction) SetCreatedAt(v string)`

SetCreatedAt sets CreatedAt field to given value.


### GetCurrency

`func (o *Transaction) GetCurrency() string`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *Transaction) GetCurrencyOk() (*string, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *Transaction) SetCurrency(v string)`

SetCurrency sets Currency field to given value.


### GetDirection

`func (o *Transaction) GetDirection() TransactionDirection`

GetDirection returns the Direction field if non-nil, zero value otherwise.

### GetDirectionOk

`func (o *Transaction) GetDirectionOk() (*TransactionDirection, bool)`

GetDirectionOk returns a tuple with the Direction field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDirection

`func (o *Transaction) SetDirection(v TransactionDirection)`

SetDirection sets Direction field to given value.


### GetFeeAmount

`func (o *Transaction) GetFeeAmount() string`

GetFeeAmount returns the FeeAmount field if non-nil, zero value otherwise.

### GetFeeAmountOk

`func (o *Transaction) GetFeeAmountOk() (*string, bool)`

GetFeeAmountOk returns a tuple with the FeeAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeeAmount

`func (o *Transaction) SetFeeAmount(v string)`

SetFeeAmount sets FeeAmount field to given value.


### GetFeeCurrency

`func (o *Transaction) GetFeeCurrency() string`

GetFeeCurrency returns the FeeCurrency field if non-nil, zero value otherwise.

### GetFeeCurrencyOk

`func (o *Transaction) GetFeeCurrencyOk() (*string, bool)`

GetFeeCurrencyOk returns a tuple with the FeeCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeeCurrency

`func (o *Transaction) SetFeeCurrency(v string)`

SetFeeCurrency sets FeeCurrency field to given value.


### GetFromAddress

`func (o *Transaction) GetFromAddress() string`

GetFromAddress returns the FromAddress field if non-nil, zero value otherwise.

### GetFromAddressOk

`func (o *Transaction) GetFromAddressOk() (*string, bool)`

GetFromAddressOk returns a tuple with the FromAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFromAddress

`func (o *Transaction) SetFromAddress(v string)`

SetFromAddress sets FromAddress field to given value.


### GetGateway

`func (o *Transaction) GetGateway() string`

GetGateway returns the Gateway field if non-nil, zero value otherwise.

### GetGatewayOk

`func (o *Transaction) GetGatewayOk() (*string, bool)`

GetGatewayOk returns a tuple with the Gateway field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGateway

`func (o *Transaction) SetGateway(v string)`

SetGateway sets Gateway field to given value.


### GetId

`func (o *Transaction) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Transaction) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Transaction) SetId(v string)`

SetId sets Id field to given value.


### GetNetwork

`func (o *Transaction) GetNetwork() string`

GetNetwork returns the Network field if non-nil, zero value otherwise.

### GetNetworkOk

`func (o *Transaction) GetNetworkOk() (*string, bool)`

GetNetworkOk returns a tuple with the Network field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetwork

`func (o *Transaction) SetNetwork(v string)`

SetNetwork sets Network field to given value.


### GetStatus

`func (o *Transaction) GetStatus() TransactionStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *Transaction) GetStatusOk() (*TransactionStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *Transaction) SetStatus(v TransactionStatus)`

SetStatus sets Status field to given value.


### GetToAddress

`func (o *Transaction) GetToAddress() string`

GetToAddress returns the ToAddress field if non-nil, zero value otherwise.

### GetToAddressOk

`func (o *Transaction) GetToAddressOk() (*string, bool)`

GetToAddressOk returns a tuple with the ToAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToAddress

`func (o *Transaction) SetToAddress(v string)`

SetToAddress sets ToAddress field to given value.


### GetWalletId

`func (o *Transaction) GetWalletId() string`

GetWalletId returns the WalletId field if non-nil, zero value otherwise.

### GetWalletIdOk

`func (o *Transaction) GetWalletIdOk() (*string, bool)`

GetWalletIdOk returns a tuple with the WalletId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWalletId

`func (o *Transaction) SetWalletId(v string)`

SetWalletId sets WalletId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


