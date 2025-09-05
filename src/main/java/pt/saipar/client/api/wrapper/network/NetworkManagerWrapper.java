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
     * Whether a {@link PacketWrapper} is an instance of a {@link Class} of another {@link PacketWrapper}
     *
     * @param packet      the {@link PacketWrapper}
     * @param packetClass the {@link Class} of the desired {@link PacketWrapper}
     * @return whether the {@link PacketWrapper} is a valid instance
     */
    boolean isInstance(final PacketWrapper<?> packet, final Class<?> packetClass);

    /**
     * Casts a {@link PacketWrapper} to another {@link Class}
     *
     * @param packet      the {@link PacketWrapper}
     * @param packetClass the {@link Class}
     * @return the casted {@link PacketWrapper}
     */
    <T extends PacketWrapper<?>> T cast(final PacketWrapper<?> packet, final Class<T> packetClass);

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
