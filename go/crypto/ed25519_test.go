package crypto

import (
	"crypto/ed25519"
	"encoding/hex"
	"fmt"
	"testing"

	"github.com/stretchr/testify/assert"
)

func Test_SignAndVerify(t *testing.T) {
	_, secret, err := GenerateApiKey()
	assert.NoError(t, err)

	signer := &Ed25519Signer{
		secret,
	}

	content := []byte("hello world")

	signature, err := signer.Sign(content)
	assert.NoError(t, err)

	err = signer.Verify(content, signature)
	assert.NoError(t, err)
}

func Test_SignAndVerify2(t *testing.T) {
	// priKey, _ := hex.DecodeString("bc23cef5b3c9027b81ec8f53758b649a7cac6f79bd0190e148fa2c296792e491a04d8bf16666df289647a5fb6ac8d0722976b97094a0c0bf81ab956041c5418d")
	// pubKey, _ := hex.DecodeString("a04d8bf16666df289647a5fb6ac8d0722976b97094a0c0bf81ab956041c5418d")

	signer := &Ed25519Signer{
		Secret: "bc23cef5b3c9027b81ec8f53758b649a7cac6f79bd0190e148fa2c296792e491",
	}

	// content := []byte("hello world")
	// content := []byte("{\"uid\":91,\"note\":\"WooCommerce Order ID: 91\",\"amount\":\"0.10\",\"currency\":\"USD\",\"creator\":\"\",\"expiration\":600,\"metadata\":{\"email\":\"omni-wallet@yelala.com\"}}/api/v1/orders1747212416799")
	content := []byte(`{"uid":92,"note":"WooCommerce Order ID: 92","amount":"0.10","currency":"USD","creator":"","expiration":600,"metadata":{"email":"omni-wallet@yelala.com"}}/api/v1/orders1747214289092`)

	hash := Hash256([]byte(content))

	fmt.Println(hex.EncodeToString(hash))

	apiSecret, _ := hex.DecodeString("bc23cef5b3c9027b81ec8f53758b649a7cac6f79bd0190e148fa2c296792e491")
	signature := ed25519.Sign(ed25519.NewKeyFromSeed(apiSecret), hash[:])

	var err error
	// signature, err := signer.Sign(hash)
	assert.NoError(t, err)

	fmt.Println(hex.EncodeToString(signature))

	err = signer.Verify(hash, signature)
	assert.NoError(t, err)
}
