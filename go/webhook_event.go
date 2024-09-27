package wallet

import (
	"time"
)

type WebhookEvent struct {
	Type    string             `json:"type"`
	Payload TransactionPayload `json:"payload"`
}

type TransactionPayload struct {
	TransactionId string         `json:"transactionId"`
	Type          string         `json:"type"`
	WalletId      string         `json:"walletId"`
	Gateway       string         `json:"gateway"`
	Amount        CurrencyAmount `json:"amount"`
	Status        string         `json:"status"`
	CreatedAt     time.Time      `json:"createdAt"`
}

type CurrencyAmount struct {
	Currency string `json:"currency"`
	Amount   string `json:"amount"`
}
