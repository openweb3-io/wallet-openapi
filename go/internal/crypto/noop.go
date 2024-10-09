package crypto

const SigningMethodNoop SigningMethodType = "NOOP"

type Noop struct {
}

// verify
func (*Noop) Verify(data []byte, sign []byte) (err error) {
	return nil
}

// sign
func (*Noop) Sign(data []byte) (sign []byte, err error) {
	return []byte(""), nil
}
