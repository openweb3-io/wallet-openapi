package signature

import (
	"crypto/ed25519"
	"testing"

	"github.com/stretchr/testify/assert"
)

func Test_SignAndVerify(t *testing.T) {
	pubKey, priKey, err := ed25519.GenerateKey(nil)
	assert.NoError(t, err)

	signer := &ed25519Signer{}

	content := []byte("hello world")

	signature, err := signer.Sign(priKey, content)
	assert.NoError(t, err)

	err = signer.Verify(pubKey, content, signature)
	assert.NoError(t, err)
}
