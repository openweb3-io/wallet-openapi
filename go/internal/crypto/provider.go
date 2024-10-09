package crypto

type manager struct {
	signers map[SigningMethodType]ApiSigner
}

func (m *manager) Register(name SigningMethodType, signer ApiSigner) {
	m.signers[name] = signer
}

func (m *manager) Provide(name SigningMethodType) ApiSigner {
	return m.signers[name]
}

var defaultSignatureManager = manager{
	signers: make(map[SigningMethodType]ApiSigner),
}
