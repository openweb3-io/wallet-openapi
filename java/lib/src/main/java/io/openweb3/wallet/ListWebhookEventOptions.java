package io.openweb3.wallet;

import java.util.List;

public final class ListWebhookEventOptions extends ListOptions<ListWebhookEventOptions> {
    private List<String> eventTypes;

    public ListWebhookEventOptions eventTypes(List<String> eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }

    public List<String> getEventTypes() {
        return eventTypes;
    }

    public void setEventTypes(List<String> eventTypes) {
        this.eventTypes = eventTypes;
    }
}

