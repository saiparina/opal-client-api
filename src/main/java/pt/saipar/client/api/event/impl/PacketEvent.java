package pt.saipar.client.api.event.impl;

import pt.saipar.client.api.event.Event;
import pt.saipar.client.api.wrapper.network.packet.PacketWrapper;

public interface PacketEvent extends Event {

    PacketWrapper<?> getPacket();

}
