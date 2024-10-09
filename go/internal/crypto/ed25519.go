package crypto

import (
	"crypto/ed25519"
	"crypto/rand"
	"encoding/hex"
	"errors"
)

const SigningMethodEd25519 SigningMethodType = "ed25519"

type Ed25519Signer struct {
	Secret string
}

func (signer Ed25519Signer) GetPublicKey() string {
	apiSecret, _ := hex.DecodeString(signer.Secret)
	sk := ed25519.NewKeyFromSeed(apiSecret)
	pk := sk.Public().(ed25519.PublicKey)
	return hex.EncodeToString(pk)
}

func (signer *Ed25519Signer) Verify(hash []byte, sig []byte) (err error) {
	apiSecret, _ := hex.DecodeString(signer.Secret)

	sk := ed25519.NewKeyFromSeed(apiSecret)
	edPubKey, ok := sk.Public().(ed25519.PublicKey)
	if !ok {
		return errors.New("error public key format")
	}

	// verify
	valid := ed25519.Verify(edPubKey, hash, sig)
	if !valid {
		return ErrSignatureNotVerified
	}

	return nil
}

func (signer *Ed25519Signer) Sign(hash []byte) ([]byte, error) {
	apiSecret, _ := hex.DecodeString(signer.Secret)
	sig := ed25519.Sign(ed25519.NewKeyFromSeed(apiSecret), hash[:])
	return sig, nil
}

func GenerateApiKey() (apiKey, apiSecret string, err error) {
	pk, sk, err := ed25519.GenerateKey(rand.Reader)
	if err != nil {
		return "", "", err
	}
	apiSecret = hex.EncodeToString(sk.Seed())
	apiKey = hex.EncodeToString(pk)
	return
}
