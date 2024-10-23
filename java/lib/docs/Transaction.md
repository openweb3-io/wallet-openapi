

# Transaction


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **String** | The total amount of money involved in the transaction. | 
**avatar** | **String** | A URL or path to an avatar image associated with the transaction, often used to visually represent the transaction&#39;s source or recipient. | 
**createdAt** | **String** | The date and time when the transaction was created. | 
**currency** | **String** | The code of currency used in the transaction (e.g., TON, USDT, USD, EUR, etc.). | 
**direction** | [**TransactionDirection**](TransactionDirection.md) | Indicates the flow of the transaction, typically whether it is incoming or outgoing. | 
**feeAmount** | **String** | The amount of fee | 
**feeCurrency** | **String** | The currency of fee | 
**fromAddress** | **String** | The address of the sender. | 
**gateway** | **String** | The payment gateway or platform used to process the transaction. | 
**id** | **String** | A unique identifier for the transaction. | 
**network** | **String** | The blockchain network on which the transaction takes place. | 
**status** | [**TransactionStatus**](TransactionStatus.md) | The current status of the transaction. | 
**toAddress** | **String** | The address of the recipient. | 
**walletId** | **String** | The ID of the wallet associated with the transaction. | 



