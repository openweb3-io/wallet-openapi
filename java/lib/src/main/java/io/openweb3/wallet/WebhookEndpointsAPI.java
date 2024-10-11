package io.openweb3.wallet;

import io.openweb3.wallet.exceptions.ApiException;
import io.openweb3.wallet.internal.api.WebhookEndpointsApi;
import io.openweb3.wallet.models.*;

public final class WebhookEndpointsAPI {
	private final WebhookEndpointsApi api;

	WebhookEndpointsAPI() {
		api = new WebhookEndpointsApi();
	}

	public CursorPageEndpoint list(final ListWebhookEndpointOptions options) throws ApiException {
		try {
			return api.v1WebhooksList(options.getCursor(), options.getLimit());
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	public Endpoint create(final CreateEndpoint req)
			throws ApiException {
		try {
			return api.v1WebhooksCreate(req);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	// delete
	public Endpoint get(final String endpointId) throws ApiException {
		try {
			return api.v1WebhooksDelete(endpointId);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	// delete
	public Endpoint delete(final String endpointId) throws ApiException {
		try {
			return api.v1WebhooksDelete(endpointId);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

	// update
	public Endpoint update(final String endpointId, final UpdateEndpoint req) throws ApiException {
		try {
			return api.v1WebhooksUpdate(endpointId, req);
		} catch (io.openweb3.wallet.internal.ApiException e) {
			throw Utils.WrapInternalApiException(e);
		}
	}

}
