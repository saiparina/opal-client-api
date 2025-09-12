package pt.saipar.client.api.wrapper.network.packet;

public interface PacketWrapper<T> {

    /**
     * Whether this {@link PacketWrapper} is an instance of a {@link Class} of another {@link PacketWrapper}
     *
     * @param entityClass the {@link Class} of the desired {@link PacketWrapper}
     * @return whether this {@link PacketWrapper} is a valid instance
     */
    boolean isInstance(final Class<?> entityClass);

    /**
     * Casts a {@link PacketWrapper} to another {@link Class}
     *
     * @param entityClass the {@link Class}
     * @return the casted {@link PacketWrapper}
     */
    <P extends PacketWrapper<?>> P cast(final Class<P> entityClass);

    /**
     * Unwraps the {@link PacketWrapper} to its minecraft object
     *
     * @return the unwrapped {@link PacketWrapper}
     */
    T unwrap();

}
