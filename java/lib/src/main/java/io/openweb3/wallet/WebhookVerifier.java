package io.openweb3.wallet;

import io.openweb3.wallet.exceptions.VerificationException;

public final class WebhookVerifier {
	private final String publicKey;

	public WebhookVerifier(final String publicKey) {
		this.publicKey = publicKey;
	}

	public boolean verify(final String payload, final String signature) throws VerificationException {
		try {
			return Utils.verify(payload, signature, this.publicKey);
		} catch (Exception e) {
			throw new VerificationException(e.getMessage());
		}
	}
}
