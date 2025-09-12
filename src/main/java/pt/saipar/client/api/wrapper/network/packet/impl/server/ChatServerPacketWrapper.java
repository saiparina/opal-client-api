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

        CHAT(1),
        ACTION_BAR(1);

        private final int id;

    }

}
