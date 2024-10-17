package io.openweb3.wallet;

import io.openweb3.wallet.exceptions.ApiException;
import io.openweb3.wallet.internal.api.WebhookEventsApi;
import io.openweb3.wallet.models.*;

public final class WebhookEventsAPI {
	private final WebhookEventsApi api;

	WebhookEventsAPI() {
		api = new WebhookEventsApi();
	}

	// list
	public CursorPageWebhookEvent list(final ListWebhookEventOptions options) throws ApiException {
		try {
			return api.v1WebhooksEventsList(options.getCursor(), options.getEventTypes(), options.getLimit());
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	// resend
	public ResendWebhookEventResponse resend(ResendWebhookEventRequest req) throws ApiException {
		try {
			return api.v1WebhooksEventsResend(req);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}
}
