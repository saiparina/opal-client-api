package pt.saipar.client.api.wrapper.network.packet.impl.server;

import pt.saipar.client.api.wrapper.network.packet.PacketWrapper;
import pt.saipar.client.api.wrapper.util.buffer.PacketBufferWrapper;

public interface PayloadServerPacketWrapper<T> extends PacketWrapper<T> {

    String getChannel();

    PacketBufferWrapper getBuffer();

}
