package pt.saipar.client.api.wrapper.network;

import pt.saipar.client.api.wrapper.network.packet.PacketWrapper;

public interface NetworkManagerWrapper {

    /**
     * Creates a {@link PacketWrapper} instance
     *
     * @param packetClass the {@link Class} of the {@link PacketWrapper}
     * @return the {@link PacketWrapper}
     */
    <T extends PacketWrapper<?>> T create(final Class<T> packetClass);

    /**
     * Sends a {@link PacketWrapper} to the server
     *
     * @param packet the {@link PacketWrapper}
     */
    void send(final PacketWrapper<?> packet);

}
