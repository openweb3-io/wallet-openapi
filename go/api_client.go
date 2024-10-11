package wallet

import (
	"bytes"
	"encoding/hex"
	"fmt"
	"io"
	"log"
	"net/http"
	"net/url"
	"strings"
	"time"

	"github.com/openweb3-io/wallet-openapi/go/crypto"
	"github.com/openweb3-io/wallet-openapi/go/internal/openapi"
	"github.com/openweb3-io/wallet-openapi/go/internal/version"
)

type (
	APIClientOptions struct {
		Debug bool

		ApiKey string
		Secret string

		// Overrides the base URL (protocol + hostname) used for all requests sent by this wallet client. (Useful for testing)
		ServerUrl  *url.URL
		HTTPClient *http.Client
	}
	APIClient struct {
		Currency          *Currency
		Rate              *Rate
		Address           *Address
		Transaction       *Transaction
		Wallet            *Wallet
		WebhookEndpoint   *WebhookEndpoint
		WebhookEventTypes *WebhookEventTypes
	}
)

var defaultHTTPClient = &http.Client{
	Timeout: 60 * time.Second,
}

func New(options *APIClientOptions) *APIClient {
	conf := openapi.NewConfiguration()
	conf.Scheme = "https"
	conf.Host = "api.wallet.openweb3.io"
	conf.HTTPClient = defaultHTTPClient
	conf.Middleware = func(req *http.Request) {
		requestTime := fmt.Sprintf("%d", time.Now().UnixMilli())
		req.Header.Set("X-Request-Time", requestTime)

		var dataToBeSignature string
		if strings.ToUpper(req.Method) == "POST" || strings.ToUpper(req.Method) == "PUT" {
			body, err := io.ReadAll(req.Body)
			if err != nil {
				log.Printf("Error reading body: %v", err)
			}
			saveBody := body
			savecl := req.ContentLength
			defer func() {
				// set body back to the original value when the middleware is done
				req.Body = io.NopCloser(bytes.NewBuffer(saveBody))
				req.ContentLength = savecl
			}()

			dataToBeSignature = string(body)
		}
		dataToBeSignature = dataToBeSignature + req.URL.RequestURI() + requestTime

		signer := &crypto.Ed25519Signer{Secret: options.Secret}
		hash := crypto.Hash256([]byte(dataToBeSignature))
		sig, err := signer.Sign(hash)
		if err != nil {
			log.Printf("Error generating signature: %v", err)
		}

		req.Header.Set("X-Signature", hex.EncodeToString(sig))
	}

	if options != nil {
		conf.Debug = options.Debug
		if options.ServerUrl != nil {
			conf.Scheme = options.ServerUrl.Scheme
			conf.Host = options.ServerUrl.Host
		}
		if options.HTTPClient != nil {
			conf.HTTPClient = options.HTTPClient
		}
	}
	conf.AddDefaultHeader("X-Api-Key", options.ApiKey)
	conf.UserAgent = fmt.Sprintf("wallet-openapi/%s/go", version.Version)
	apiClient := openapi.NewAPIClient(conf)

	return &APIClient{
		Currency: &Currency{
			api: apiClient,
		},
		Rate: &Rate{
			api: apiClient,
		},
		Address: &Address{
			api: apiClient,
		},
		Transaction: &Transaction{
			api: apiClient,
		},
		Wallet: &Wallet{
			api: apiClient,
		},
		WebhookEndpoint: &WebhookEndpoint{
			api: apiClient,
		},
		WebhookEventTypes: &WebhookEventTypes{
			api: apiClient,
		},
	}
}
