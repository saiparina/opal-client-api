package pt.saipar.client.api.wrapper.entity;

import pt.saipar.client.api.utils.location.Location;
import pt.saipar.client.api.utils.rotation.Rotation;

public interface EntityWrapper {

    /**
     * Gets the id of the {@link EntityWrapper}
     *
     * @return the id of the {@link EntityWrapper}
     */
    int getId();

    /**
     * Gets the name of the {@link EntityWrapper}
     *
     * @return the name of the {@link EntityWrapper}
     */
    String getName();

    /**
     * Gets the display name of the {@link EntityWrapper}
     *
     * @return the display name of the {@link EntityWrapper}
     */
    String getDisplayName();

    /**
     * Gets the {@link EntityWrapper}'s {@link Location}
     *
     * @return the {@link EntityWrapper}'s {@link Location}
     */
    Location getLocation();

    /**
     * Gets the {@link EntityWrapper}'s last tick {@link Location}
     *
     * @return the last tick {@link Location}
     */
    Location getLastTickLocation();

    /**
     * Looks at a {@link Rotation}
     *
     * @param rotation the {@link Rotation}
     */
    void lookAt(final Rotation rotation);

    /**
     * Gets the {@link EntityWrapper}'s {@link Rotation}
     *
     * @return the {@link EntityWrapper}'s {@link Rotation}
     */
    Rotation getRotation();

    /**
     * Gets the X value of the {@link EntityWrapper}'s delta
     *
     * @return the X value of the {@link EntityWrapper}'s delta
     */
    double getDeltaX();

    /**
     * Gets the Y value of the {@link EntityWrapper}'s delta
     *
     * @return the Y value of the {@link EntityWrapper}'s delta
     */
    double getDeltaY();

    /**
     * Gets the Z value of the {@link EntityWrapper}'s delta
     *
     * @return the Z value of the {@link EntityWrapper}'s delta
     */
    double getDeltaZ();

    /**
     * Whether the {@link EntityWrapper} is sprinting
     *
     * @return the sprinting state of the {@link EntityWrapper}
     */
    boolean isSprinting();

    /**
     * Whether the {@link EntityWrapper} is sneaking
     *
     * @return the sneaking state of the {@link EntityWrapper}
     */
    boolean isSneaking();

    /**
     * Whether the {@link EntityWrapper} is a player
     *
     * @return whether the {@link EntityWrapper} is a player
     */
    boolean isPlayer();

    /**
     * Gets the distance between two {@link EntityWrapper}.
     *
     * @param entity the other {@link EntityWrapper}
     * @return the distance between the entities
     */
    double getDistance(final EntityWrapper entity);

}
