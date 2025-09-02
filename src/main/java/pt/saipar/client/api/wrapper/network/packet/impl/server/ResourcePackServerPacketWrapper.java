package pt.saipar.client.api.wrapper.network.packet.impl.server;

import pt.saipar.client.api.wrapper.network.packet.PacketWrapper;

public interface ResourcePackServerPacketWrapper<T> extends PacketWrapper<T> {

    String getURL();

    String getHash();

}
