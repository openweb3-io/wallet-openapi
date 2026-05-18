

# Currency


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canDeposit** | **Boolean** | Is it depositable on-chain | 
**canTransfer** | **Boolean** | Is it transferable within the platform | 
**canWithdraw** | **Boolean** | Is it withdrawable on-chain | 
**code** | **String** | Currency code identifier | 
**contractAddress** | **String** | Contract address (for token contracts, if applicable) |  [optional]
**decimals** | **Integer** | Decimal precision | 
**disabled** | **Boolean** | Indicates if the currency is disabled | 
**logo** | **String** | Currency logo URL | 
**maxFee** | **String** | Maximum fee | 
**maxFeeForCtAddr** | **String** | Maximum fee for contract addresses | 
**maxWithdrawAmount** | **String** | Maximum withdraw amount per transaction in nano units (multiply by 10^decimals) | 
**minDepositAmount** | **String** | Minimum deposit amount per transaction in nano units (multiply by 10^decimals) | 
**minFee** | **String** | Minimum fee | 
**minFeeForCtAddr** | **String** | Minimum fee for contract addresses | 
**minTransferAmount** | **String** | Minimum transfer amount per transaction in nano units (multiply by 10^decimals) | 
**minWithdrawAmount** | **String** | Minimum withdraw amount per transaction in nano units (multiply by 10^decimals) | 
**name** | **String** | Currency name | 
**needMemo** | **Boolean** | Does it require a memo/note for transactions | 
**networks** | [**List&lt;CurrencyNetwork&gt;**](CurrencyNetwork.md) | Networks information | 
**precision** | **Integer** | The number of decimals used by the currency | 
**rated** | **Boolean** | Participate in exchange rate calculation | 
**symbol** | **String** | Currency symbol | 



