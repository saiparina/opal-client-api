package pt.saipar.client.api.wrapper.entity;

import pt.saipar.client.api.utils.location.Location;
import pt.saipar.client.api.utils.rotation.Rotation;
import pt.saipar.client.api.wrapper.utils.box.BoundingBox;

public interface EntityWrapper {

    /**
     * Whether this {@link EntityWrapper} is an instance of a {@link Class} of another {@link EntityWrapper}
     *
     * @param entityClass the {@link Class} of the desired {@link EntityWrapper}
     * @return whether this {@link EntityWrapper} is a valid instance
     */
    boolean isInstance(final Class<?> entityClass);

    /**
     * Casts a {@link EntityWrapper} to another {@link Class}
     *
     * @param entityClass the {@link Class}
     * @return the casted {@link EntityWrapper}
     */
    <T extends EntityWrapper> T cast(final Class<T> entityClass);

    /**
     * Whether the {@link EntityWrapper} exists in the world
     *
     * @return whether the {@link EntityWrapper} exists
     */
    boolean exists();

    /**
     * Gets the id of the {@link EntityWrapper}
     *
     * @return the id of the {@link EntityWrapper}
     */
    int getId();

    /**
     * Gets the amount of ticks this {@link EntityWrapper} has exited
     *
     * @return the amount of ticks this {@link EntityWrapper} has exited
     */
    long getLivingTicks();

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
     * Whether the {@link EntityWrapper} is on the ground
     *
     * @return whether the {@link EntityWrapper} is on the ground
     */
    boolean isOnGround();

    /**
     * Gets the {@link EntityWrapper} this {@link EntityWrapper} is riding
     *
     * @return the {@link EntityWrapper} this {@link EntityWrapper} is riding
     */
    EntityWrapper getRiding();

    /**
     * Gets the {@link EntityWrapper} whose this {@link EntityWrapper} is being ridden
     *
     * @return the {@link EntityWrapper} whose this {@link EntityWrapper} is being ridden
     */
    EntityWrapper getRidden();

    /**
     * Gets the distance between two {@link EntityWrapper}.
     *
     * @param entity the other {@link EntityWrapper}
     * @return the distance between the entities
     */
    double getDistance(final EntityWrapper entity);

    /**
     * Gets the {@link EntityWrapper}'s eye height
     *
     * @return the eye height
     */
    double getEyeHeight();

    /**
     * Gets the {@link EntityWrapper}'s eye {@link Location}
     *
     * @return the eye {@link Location}
     */
    Location getEyeLocation();

    /**
     * Gets the {@link EntityWrapper}'s {@link BoundingBox}
     *
     * @return the {@link BoundingBox}
     */
    BoundingBox getBoundingBox();

    /**
     * Checks if this {@link EntityWrapper} can see the given {@link Location}
     *
     * @param location the {@link Location}
     * @return whether the location is visible
     */
    boolean canSee(final Location location);

    /**
     * Checks if this {@link EntityWrapper} can see the given {@link EntityWrapper}
     *
     * @param entity the target {@link EntityWrapper}
     * @return whether the entity is visible
     */
    boolean canSee(final EntityWrapper entity);

    /**
     * Finds a visible {@link Location} on the given {@link EntityWrapper}'s bounding box
     *
     * @param target the target {@link EntityWrapper}
     * @return the visible {@link Location}, or null if completely obstructed
     */
    Location getVisiblePoint(final EntityWrapper target);

}
