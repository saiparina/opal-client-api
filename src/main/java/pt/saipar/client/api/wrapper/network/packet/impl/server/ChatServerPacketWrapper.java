package pt.saipar.client.api.wrapper.network.packet.impl.server;

import pt.saipar.client.api.wrapper.network.packet.PacketWrapper;

public interface ChatServerPacketWrapper<T> extends PacketWrapper<T> {

    // TODO: Chat components
    String getMessage();

    // TODO: enum
    byte getType();

}
