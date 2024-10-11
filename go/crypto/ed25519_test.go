package crypto

import (
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
