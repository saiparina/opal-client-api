package pt.saipar.client.api.wrapper.network;

import pt.saipar.client.api.wrapper.network.packet.PacketWrapper;
import pt.saipar.client.api.wrapper.utils.buffer.PacketBufferWrapper;

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

    /**
     * Creates a {@link PacketBufferWrapper}
     *
     * @param data the data as an array of bytes
     * @return the {@link PacketBufferWrapper}
     */
    PacketBufferWrapper createBuffer(final byte[] data);

    /**
     * Creates a {@link PacketBufferWrapper}
     *
     * @return the {@link PacketBufferWrapper}
     */
    PacketBufferWrapper createBuffer();

}
