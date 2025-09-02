package pt.saipar.client.api.wrapper.network.packet.impl.client;

import pt.saipar.client.api.wrapper.network.packet.PacketWrapper;

public interface ResourcePackClientPacketWrapper<T> extends PacketWrapper<T> {

    ResourcePackClientPacketWrapper<T> setHash(final String hash);

    String getHash();

    ResourcePackClientPacketWrapper<T> setAction(final Action action);

    Action getAction();

    enum Action {

        LOADED,
        DECLINED,
        FAILED,
        ACCEPTED

    }

}
