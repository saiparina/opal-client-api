package pt.saipar.client.api.wrapper.network.packet.impl.client;

import pt.saipar.client.api.wrapper.network.packet.PacketWrapper;

public interface EntityActionPacketWrapper<T> extends PacketWrapper<T> {

    /**
     * Sets the ID of the entity
     *
     * @param id the new ID
     */
    void setEntityId(final int id);

    /**
     * Gets the ID of the entity
     *
     * @return the ID of the entity
     */
    int getEntityId();

    /**
     * Sets the {@link Action} of the {@link EntityActionPacketWrapper}
     *
     * @param action the {@link Action}
     */
    void setAction(final Action action);

    /**
     * Gets the {@link Action} of the {@link PacketWrapper}
     *
     * @return the {@link Action}
     */
    Action getAction();

    enum Action {

        START_SNEAKING,
        STOP_SNEAKING,
        STOP_SLEEPING,
        START_SPRINTING,
        STOP_SPRINTING,
        RIDING_JUMP,
        OPEN_INVENTORY

    }

}
