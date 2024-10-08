

# CurrencyNetwork


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canDeposit** | **Boolean** | Indicates if on-chain deposits are allowed | 
**canTransfer** | **Boolean** | Indicates if internal transfers are permitted | 
**canWithdraw** | **Boolean** | Indicates if on-chain withdrawals are allowed | 
**code** | **String** | Currency code | 
**contractAddress** | **String** | Contract address for tokens based on smart contracts, such as ERC-20 |  [optional]
**id** | **String** |  | 
**maxFee** | **String** | Maximum transaction fee | 
**maxFeeForCtAddr** | **String** | Maximum transaction fee for contract addresses | 
**maxWithdrawAmount** | **String** | Maximum amount for a single on-chain withdrawal | 
**minCollectAmount** | **String** | Minimum amount for collection, i.e., the minimum amount to aggregate small balances to a single address |  [optional]
**minConfirmations** | **Integer** | Minimum number of confirmations required, indicating the number of block confirmations needed for a transaction to be considered valid | 
**minDepositAmount** | **String** | Minimum amount for a single deposit | 
**minFee** | **String** | Minimum transaction fee | 
**minFeeForCtAddr** | **String** | Minimum transaction fee for contract addresses | 
**minWithdrawAmount** | **String** | Minimum amount for a single on-chain withdrawal | 
**name** | **String** | Name of the currency, e.g., Bitcoin, Ethereum, etc. | 
**needMemo** | **Boolean** | Indicates if additional Memo information is required, as needed by some currencies or exchanges | 
**network** | **String** | Associated network, e.g., Bitcoin, Ethereum, etc. | 



