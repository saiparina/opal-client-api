package pt.saipar.client.api.wrapper.network.packet.impl.client;

import pt.saipar.client.api.wrapper.network.packet.PacketWrapper;
import pt.saipar.client.api.wrapper.utils.buffer.PacketBufferWrapper;

public interface PayloadClientPacketWrapper<T> extends PacketWrapper<T> {

    PayloadClientPacketWrapper<T> setChannel(final String channel);

    String getChannel();

    PayloadClientPacketWrapper<T> setBuffer(final PacketBufferWrapper buffer);

    PacketBufferWrapper getBuffer();

}
