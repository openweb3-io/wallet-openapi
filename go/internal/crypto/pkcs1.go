package crypto

import (
	"crypto"
	"crypto/rand"
	"crypto/rsa"
	"crypto/x509"
	"encoding/hex"
	"encoding/pem"
	"errors"
)

const SigningMethodPKCS1 SigningMethodType = "pkcs1"

type PKCS1 struct {
	pk string
	sk string
}

// verify
func (signer *PKCS1) Verify(data []byte, sign []byte) (err error) {
	pkBytes, _ := hex.DecodeString(signer.pk)

	block, _ := pem.Decode(pkBytes)
	if block == nil {
		return errors.New("public key error")
	}
	pub, err := x509.ParsePKCS1PublicKey(block.Bytes)
	if err != nil {
		return err
	}

	hashFunc := crypto.SHA256
	h := hashFunc.New()
	h.Write(data)
	hashed := h.Sum(nil)
	return rsa.VerifyPKCS1v15(pub, hashFunc, hashed, sign)
}

// sign
func (signer *PKCS1) Sign(data []byte) ([]byte, error) {
	skBytes, _ := hex.DecodeString(signer.sk)

	block, _ := pem.Decode(skBytes)
	if block == nil {
		return nil, errors.New("private key error")
	}
	priv, err := x509.ParsePKCS1PrivateKey(block.Bytes)
	if err != nil {
		return nil, err
	}
	hashFunc := crypto.SHA256
	h := hashFunc.New()
	h.Write(data)
	hashed := h.Sum(nil)
	return rsa.SignPKCS1v15(rand.Reader, priv, hashFunc, hashed)
}
