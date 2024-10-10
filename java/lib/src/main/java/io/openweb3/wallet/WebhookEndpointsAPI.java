package io.openweb3.wallet;

import io.openweb3.wallet.exceptions.ApiException;
import io.openweb3.wallet.internal.api.WebhookEndpointsApi;
import io.openweb3.wallet.models.CreateWebhook;
import io.openweb3.wallet.models.UpdateWebhook;
import io.openweb3.wallet.models.Webhook;
import io.openweb3.wallet.models.CursorPageWebhook;

public final class WebhookEndpointsAPI {
	private final WebhookEndpointsApi api;

	WebhookEndpointsAPI() {
		api = new WebhookEndpointsApi();
	}

	public CursorPageWebhook list(final ListWebhookEndpointOptions options) throws ApiException {
		try {
			return api.v1WebhooksList(options.getCursor(), options.getLimit());
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	public Webhook create(final String appId, final CreateWebhook req)
			throws ApiException {
		try {
			return api.v1WebhooksCreate(req);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	// delete
	public Webhook get(final String endpointId) throws ApiException {
		try {
			return api.v1WebhooksDelete(endpointId);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	// delete
	public Webhook delete(final String endpointId) throws ApiException {
		try {
			return api.v1WebhooksDelete(endpointId);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	// update
	public Webhook update(final String endpointId, final UpdateWebhook req) throws ApiException {
		try {
			return api.v1WebhooksUpdate(endpointId, req);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

}
