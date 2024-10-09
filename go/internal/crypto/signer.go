package crypto

type SigningMethodType string

type ApiSigner interface {
	Verify(data []byte, sig []byte) (err error)
	Sign(hash []byte) ([]byte, error)
}

func Provide(name SigningMethodType) ApiSigner {
	return defaultSignatureManager.Provide(name)
}
