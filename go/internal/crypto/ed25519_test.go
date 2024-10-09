package crypto

import (
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
	secret := "710d84bd8d5f426dbf24f0d092fe36e33309bafdd84d8a3bd98813c261f21bfb"

	signer := &Ed25519Signer{
		secret,
	}

	content := []byte("hello world")

	hash := Hash256(content)

	sig, err := signer.Sign(hash)
	assert.NoError(t, err)

	fmt.Println(hex.EncodeToString(sig))

	err = signer.Verify(hash, sig)
	assert.NoError(t, err)
}
