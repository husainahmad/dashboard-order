package com.harmoni.dashboard.order.event.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.harmoni.dashboard.order.component.BroadcastMessage;
import com.harmoni.dashboard.order.component.Broadcaster;
import com.harmoni.dashboard.order.dto.RestAPIResponse;
import com.harmoni.dashboard.order.util.ObjectUtil;

public interface BroadcastMessageService {

    default void broadcastMessage(String type, RestAPIResponse restAPIResponse) {
        try {
            Broadcaster.broadcast(ObjectUtil.objectToJsonString(BroadcastMessage.builder()
                    .type(type)
                    .data(restAPIResponse).build()));
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
