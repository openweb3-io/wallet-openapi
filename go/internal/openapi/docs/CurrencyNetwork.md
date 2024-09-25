# CurrencyNetwork

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CanDeposit** | Pointer to **bool** | Indicates if on-chain deposits are allowed | [optional] 
**CanTransfer** | Pointer to **bool** | Indicates if internal transfers are permitted | [optional] 
**CanWithdraw** | Pointer to **bool** | Indicates if on-chain withdrawals are allowed | [optional] 
**Code** | Pointer to **string** | Currency code | [optional] 
**ContractAddress** | Pointer to **string** | Contract address for tokens based on smart contracts, such as ERC-20 | [optional] 
**Id** | Pointer to **string** |  | [optional] 
**MaxFee** | Pointer to **string** | Maximum transaction fee | [optional] 
**MaxFeeForCtAddr** | Pointer to **string** | Maximum transaction fee for contract addresses | [optional] 
**MaxWithdrawAmount** | Pointer to **string** | Maximum amount for a single on-chain withdrawal | [optional] 
**MinCollectAmount** | Pointer to **string** | Minimum amount for collection, i.e., the minimum amount to aggregate small balances to a single address | [optional] 
**MinConfirmations** | Pointer to **int32** | Minimum number of confirmations required, indicating the number of block confirmations needed for a transaction to be considered valid | [optional] 
**MinDepositAmount** | Pointer to **string** | Minimum amount for a single deposit | [optional] 
**MinFee** | Pointer to **string** | Minimum transaction fee | [optional] 
**MinFeeForCtAddr** | Pointer to **string** | Minimum transaction fee for contract addresses | [optional] 
**MinWithdrawAmount** | Pointer to **string** | Minimum amount for a single on-chain withdrawal | [optional] 
**Name** | Pointer to **string** | Name of the currency, e.g., Bitcoin, Ethereum, etc. | [optional] 
**NeedMemo** | Pointer to **bool** | Indicates if additional Memo information is required, as needed by some currencies or exchanges | [optional] 
**Network** | Pointer to **string** | Associated network, e.g., Bitcoin, Ethereum, etc. | [optional] 

## Methods

### NewCurrencyNetwork

`func NewCurrencyNetwork() *CurrencyNetwork`

NewCurrencyNetwork instantiates a new CurrencyNetwork object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCurrencyNetworkWithDefaults

`func NewCurrencyNetworkWithDefaults() *CurrencyNetwork`

NewCurrencyNetworkWithDefaults instantiates a new CurrencyNetwork object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanDeposit

`func (o *CurrencyNetwork) GetCanDeposit() bool`

GetCanDeposit returns the CanDeposit field if non-nil, zero value otherwise.

### GetCanDepositOk

`func (o *CurrencyNetwork) GetCanDepositOk() (*bool, bool)`

GetCanDepositOk returns a tuple with the CanDeposit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanDeposit

`func (o *CurrencyNetwork) SetCanDeposit(v bool)`

SetCanDeposit sets CanDeposit field to given value.

### HasCanDeposit

`func (o *CurrencyNetwork) HasCanDeposit() bool`

HasCanDeposit returns a boolean if a field has been set.

### GetCanTransfer

`func (o *CurrencyNetwork) GetCanTransfer() bool`

GetCanTransfer returns the CanTransfer field if non-nil, zero value otherwise.

### GetCanTransferOk

`func (o *CurrencyNetwork) GetCanTransferOk() (*bool, bool)`

GetCanTransferOk returns a tuple with the CanTransfer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanTransfer

`func (o *CurrencyNetwork) SetCanTransfer(v bool)`

SetCanTransfer sets CanTransfer field to given value.

### HasCanTransfer

`func (o *CurrencyNetwork) HasCanTransfer() bool`

HasCanTransfer returns a boolean if a field has been set.

### GetCanWithdraw

`func (o *CurrencyNetwork) GetCanWithdraw() bool`

GetCanWithdraw returns the CanWithdraw field if non-nil, zero value otherwise.

### GetCanWithdrawOk

`func (o *CurrencyNetwork) GetCanWithdrawOk() (*bool, bool)`

GetCanWithdrawOk returns a tuple with the CanWithdraw field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanWithdraw

`func (o *CurrencyNetwork) SetCanWithdraw(v bool)`

SetCanWithdraw sets CanWithdraw field to given value.

### HasCanWithdraw

`func (o *CurrencyNetwork) HasCanWithdraw() bool`

HasCanWithdraw returns a boolean if a field has been set.

### GetCode

`func (o *CurrencyNetwork) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *CurrencyNetwork) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *CurrencyNetwork) SetCode(v string)`

SetCode sets Code field to given value.

### HasCode

`func (o *CurrencyNetwork) HasCode() bool`

HasCode returns a boolean if a field has been set.

### GetContractAddress

`func (o *CurrencyNetwork) GetContractAddress() string`

GetContractAddress returns the ContractAddress field if non-nil, zero value otherwise.

### GetContractAddressOk

`func (o *CurrencyNetwork) GetContractAddressOk() (*string, bool)`

GetContractAddressOk returns a tuple with the ContractAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContractAddress

`func (o *CurrencyNetwork) SetContractAddress(v string)`

SetContractAddress sets ContractAddress field to given value.

### HasContractAddress

`func (o *CurrencyNetwork) HasContractAddress() bool`

HasContractAddress returns a boolean if a field has been set.

### GetId

`func (o *CurrencyNetwork) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CurrencyNetwork) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CurrencyNetwork) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *CurrencyNetwork) HasId() bool`

HasId returns a boolean if a field has been set.

### GetMaxFee

`func (o *CurrencyNetwork) GetMaxFee() string`

GetMaxFee returns the MaxFee field if non-nil, zero value otherwise.

### GetMaxFeeOk

`func (o *CurrencyNetwork) GetMaxFeeOk() (*string, bool)`

GetMaxFeeOk returns a tuple with the MaxFee field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxFee

`func (o *CurrencyNetwork) SetMaxFee(v string)`

SetMaxFee sets MaxFee field to given value.

### HasMaxFee

`func (o *CurrencyNetwork) HasMaxFee() bool`

HasMaxFee returns a boolean if a field has been set.

### GetMaxFeeForCtAddr

`func (o *CurrencyNetwork) GetMaxFeeForCtAddr() string`

GetMaxFeeForCtAddr returns the MaxFeeForCtAddr field if non-nil, zero value otherwise.

### GetMaxFeeForCtAddrOk

`func (o *CurrencyNetwork) GetMaxFeeForCtAddrOk() (*string, bool)`

GetMaxFeeForCtAddrOk returns a tuple with the MaxFeeForCtAddr field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxFeeForCtAddr

`func (o *CurrencyNetwork) SetMaxFeeForCtAddr(v string)`

SetMaxFeeForCtAddr sets MaxFeeForCtAddr field to given value.

### HasMaxFeeForCtAddr

`func (o *CurrencyNetwork) HasMaxFeeForCtAddr() bool`

HasMaxFeeForCtAddr returns a boolean if a field has been set.

### GetMaxWithdrawAmount

`func (o *CurrencyNetwork) GetMaxWithdrawAmount() string`

GetMaxWithdrawAmount returns the MaxWithdrawAmount field if non-nil, zero value otherwise.

### GetMaxWithdrawAmountOk

`func (o *CurrencyNetwork) GetMaxWithdrawAmountOk() (*string, bool)`

GetMaxWithdrawAmountOk returns a tuple with the MaxWithdrawAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxWithdrawAmount

`func (o *CurrencyNetwork) SetMaxWithdrawAmount(v string)`

SetMaxWithdrawAmount sets MaxWithdrawAmount field to given value.

### HasMaxWithdrawAmount

`func (o *CurrencyNetwork) HasMaxWithdrawAmount() bool`

HasMaxWithdrawAmount returns a boolean if a field has been set.

### GetMinCollectAmount

`func (o *CurrencyNetwork) GetMinCollectAmount() string`

GetMinCollectAmount returns the MinCollectAmount field if non-nil, zero value otherwise.

### GetMinCollectAmountOk

`func (o *CurrencyNetwork) GetMinCollectAmountOk() (*string, bool)`

GetMinCollectAmountOk returns a tuple with the MinCollectAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinCollectAmount

`func (o *CurrencyNetwork) SetMinCollectAmount(v string)`

SetMinCollectAmount sets MinCollectAmount field to given value.

### HasMinCollectAmount

`func (o *CurrencyNetwork) HasMinCollectAmount() bool`

HasMinCollectAmount returns a boolean if a field has been set.

### GetMinConfirmations

`func (o *CurrencyNetwork) GetMinConfirmations() int32`

GetMinConfirmations returns the MinConfirmations field if non-nil, zero value otherwise.

### GetMinConfirmationsOk

`func (o *CurrencyNetwork) GetMinConfirmationsOk() (*int32, bool)`

GetMinConfirmationsOk returns a tuple with the MinConfirmations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinConfirmations

`func (o *CurrencyNetwork) SetMinConfirmations(v int32)`

SetMinConfirmations sets MinConfirmations field to given value.

### HasMinConfirmations

`func (o *CurrencyNetwork) HasMinConfirmations() bool`

HasMinConfirmations returns a boolean if a field has been set.

### GetMinDepositAmount

`func (o *CurrencyNetwork) GetMinDepositAmount() string`

GetMinDepositAmount returns the MinDepositAmount field if non-nil, zero value otherwise.

### GetMinDepositAmountOk

`func (o *CurrencyNetwork) GetMinDepositAmountOk() (*string, bool)`

GetMinDepositAmountOk returns a tuple with the MinDepositAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinDepositAmount

`func (o *CurrencyNetwork) SetMinDepositAmount(v string)`

SetMinDepositAmount sets MinDepositAmount field to given value.

### HasMinDepositAmount

`func (o *CurrencyNetwork) HasMinDepositAmount() bool`

HasMinDepositAmount returns a boolean if a field has been set.

### GetMinFee

`func (o *CurrencyNetwork) GetMinFee() string`

GetMinFee returns the MinFee field if non-nil, zero value otherwise.

### GetMinFeeOk

`func (o *CurrencyNetwork) GetMinFeeOk() (*string, bool)`

GetMinFeeOk returns a tuple with the MinFee field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinFee

`func (o *CurrencyNetwork) SetMinFee(v string)`

SetMinFee sets MinFee field to given value.

### HasMinFee

`func (o *CurrencyNetwork) HasMinFee() bool`

HasMinFee returns a boolean if a field has been set.

### GetMinFeeForCtAddr

`func (o *CurrencyNetwork) GetMinFeeForCtAddr() string`

GetMinFeeForCtAddr returns the MinFeeForCtAddr field if non-nil, zero value otherwise.

### GetMinFeeForCtAddrOk

`func (o *CurrencyNetwork) GetMinFeeForCtAddrOk() (*string, bool)`

GetMinFeeForCtAddrOk returns a tuple with the MinFeeForCtAddr field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinFeeForCtAddr

`func (o *CurrencyNetwork) SetMinFeeForCtAddr(v string)`

SetMinFeeForCtAddr sets MinFeeForCtAddr field to given value.

### HasMinFeeForCtAddr

`func (o *CurrencyNetwork) HasMinFeeForCtAddr() bool`

HasMinFeeForCtAddr returns a boolean if a field has been set.

### GetMinWithdrawAmount

`func (o *CurrencyNetwork) GetMinWithdrawAmount() string`

GetMinWithdrawAmount returns the MinWithdrawAmount field if non-nil, zero value otherwise.

### GetMinWithdrawAmountOk

`func (o *CurrencyNetwork) GetMinWithdrawAmountOk() (*string, bool)`

GetMinWithdrawAmountOk returns a tuple with the MinWithdrawAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinWithdrawAmount

`func (o *CurrencyNetwork) SetMinWithdrawAmount(v string)`

SetMinWithdrawAmount sets MinWithdrawAmount field to given value.

### HasMinWithdrawAmount

`func (o *CurrencyNetwork) HasMinWithdrawAmount() bool`

HasMinWithdrawAmount returns a boolean if a field has been set.

### GetName

`func (o *CurrencyNetwork) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CurrencyNetwork) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CurrencyNetwork) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CurrencyNetwork) HasName() bool`

HasName returns a boolean if a field has been set.

### GetNeedMemo

`func (o *CurrencyNetwork) GetNeedMemo() bool`

GetNeedMemo returns the NeedMemo field if non-nil, zero value otherwise.

### GetNeedMemoOk

`func (o *CurrencyNetwork) GetNeedMemoOk() (*bool, bool)`

GetNeedMemoOk returns a tuple with the NeedMemo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNeedMemo

`func (o *CurrencyNetwork) SetNeedMemo(v bool)`

SetNeedMemo sets NeedMemo field to given value.

### HasNeedMemo

`func (o *CurrencyNetwork) HasNeedMemo() bool`

HasNeedMemo returns a boolean if a field has been set.

### GetNetwork

`func (o *CurrencyNetwork) GetNetwork() string`

GetNetwork returns the Network field if non-nil, zero value otherwise.

### GetNetworkOk

`func (o *CurrencyNetwork) GetNetworkOk() (*string, bool)`

GetNetworkOk returns a tuple with the Network field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetwork

`func (o *CurrencyNetwork) SetNetwork(v string)`

SetNetwork sets Network field to given value.

### HasNetwork

`func (o *CurrencyNetwork) HasNetwork() bool`

HasNetwork returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


