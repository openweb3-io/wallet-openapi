package io.openweb3.wallet;

import io.openweb3.wallet.exceptions.ApiException;
import io.openweb3.wallet.internal.api.WebhookEndpointsApi;
import io.openweb3.wallet.models.CreateWebhook;
import io.openweb3.wallet.models.UpdateWebhook;
import io.openweb3.wallet.models.Webhook;
import io.openweb3.wallet.models.CursorPageWebhook;

public final class WebhookEndpointAPI {
	private final WebhookEndpointsApi api;

	WebhookEndpointAPI() {
		api = new WebhookEndpointsApi();
	}

	public CursorPageWebhook list(final String appId, final CursorListOptions options) throws ApiException {
		try {
			return api.v1WebhooksList(appId, options.getCursor(), options.getLimit());
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	public Webhook create(final String appId, final CreateWebhook req) throws ApiException {
		return this.create(appId, req, new PostOptions());
	}

	public Webhook create(final String appId, final CreateWebhook req, final PostOptions options)
			throws ApiException {
		try {
			return api.v1WebhooksCreate(appId, req);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	// delete
	public Webhook get(final String appId, final String endpointId) throws ApiException {
		try {
			return api.v1WebhooksDelete(appId, endpointId);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	// delete
	public Webhook delete(final String appId, final String endpointId) throws ApiException {
		try {
			return api.v1WebhooksDelete(appId, endpointId);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	// update
	public Webhook update(final String appId, final String endpointId, final UpdateWebhook req) throws ApiException {
		try {
			return api.v1WebhooksUpdate(appId, endpointId, req);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

}
