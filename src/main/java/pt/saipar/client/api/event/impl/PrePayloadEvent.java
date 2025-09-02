package pt.saipar.client.api.event.impl;

import pt.saipar.client.api.event.Event;
import pt.saipar.client.api.wrapper.network.packet.impl.server.PayloadServerPacketWrapper;

public interface PrePayloadEvent extends Event {

    PayloadServerPacketWrapper<?> getPayload();

}
