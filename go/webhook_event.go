package wallet

import "time"

type WebhookEvent struct {
	Type    string      `json:"type"`
	Payload Transaction `json:"payload"`
}

type TransactionPayload struct {
	Id        string         `json:"id"`
	Type      string         `json:"type"`
	WalletId  string         `json:"walleId"`
	AccountId string         `json:"accountId"`
	Gateway   string         `json:"gateway"`
	Amount    CurrencyAmount `json:"amount"`
	Status    string         `json:"status"`
	CreatedAt time.Time      `json:"createdAt"`
}

type CurrencyAmount struct {
	Currency string `json:"currency"`
	Amount   string `json:"amount"`
}
