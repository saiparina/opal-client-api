package pt.saipar.client.api.wrapper.network.packet.impl.client;

import pt.saipar.client.api.utils.location.Location;
import pt.saipar.client.api.wrapper.network.packet.PacketWrapper;

public interface PlayerBlockPlacementClientPacketWrapper<T> extends PacketWrapper<T> {

    /**
     * Sets the {@link Location} of the block that was clicked
     *
     * @param location the clicked block's {@link Location}
     */
    PlayerBlockPlacementClientPacketWrapper<T> setPosition(final Location location);

    /**
     * Gets the {@link Location} of the clicked block
     *
     * @return the clicked block's {@link Location}
     */
    Location getPosition();

    /**
     * Sets the {@link Facing} of the face that was clicked
     *
     * @param direction the {@link Facing}
     */
    PlayerBlockPlacementClientPacketWrapper<T> setDirection(final Facing direction);

    /**
     * Gets the {@link Facing} of the clicked face
     *
     * @return the {@link Facing}
     */
    Facing getDirection();

    /**
     * Sets the click offset within the clicked block's face
     *
     * @param x the x-offset
     * @param y the y-offset
     * @param z the z-offset
     */
    PlayerBlockPlacementClientPacketWrapper<T> setFacing(final float x, final float y, final float z);

    enum Facing {

        DOWN,
        UP,
        NORTH,
        SOUTH,
        WEST,
        EAST

    }

}
