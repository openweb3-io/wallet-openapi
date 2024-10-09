package crypto

import "crypto/sha256"

func Hash256(s []byte) []byte {
	contentHash := sha256.Sum256(s)
	return contentHash[:]
}
