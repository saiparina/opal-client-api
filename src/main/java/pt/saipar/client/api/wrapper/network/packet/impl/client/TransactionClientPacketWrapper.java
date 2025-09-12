package pt.saipar.client.api.wrapper.network.packet.impl.client;

import pt.saipar.client.api.wrapper.network.packet.PacketWrapper;

public interface TransactionClientPacketWrapper<T> extends PacketWrapper<T> {

    TransactionClientPacketWrapper<T> setWindow(final int window);

    int getWindow();

    TransactionClientPacketWrapper<T> setId(final short id);

    short getId();

}
