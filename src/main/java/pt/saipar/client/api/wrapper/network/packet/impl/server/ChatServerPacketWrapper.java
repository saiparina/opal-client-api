package pt.saipar.client.api.wrapper.network.packet.impl.server;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import pt.saipar.client.api.wrapper.network.packet.PacketWrapper;

public interface ChatServerPacketWrapper<T> extends PacketWrapper<T> {

    // TODO: Chat components
    String getMessage();

    Type getType();

    @RequiredArgsConstructor
    @Getter
    enum Type {

        NONE(-1),
        CHAT(1),
        ACTION_BAR(2);

        private final int id;

    }

}
