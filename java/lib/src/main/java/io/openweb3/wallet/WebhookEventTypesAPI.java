package io.openweb3.wallet;

import io.openweb3.wallet.exceptions.ApiException;
import io.openweb3.wallet.internal.api.WebhookEventTypesApi;
import io.openweb3.wallet.models.EventType;

import java.util.List;

public final class WebhookEventTypesAPI {
	private final WebhookEventTypesApi api;

	WebhookEventTypesAPI() {
		api = new WebhookEventTypesApi();
	}

	public List<EventType> list() throws ApiException {
		try {
			return api.v1WebhooksEventtypesList();
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

}
