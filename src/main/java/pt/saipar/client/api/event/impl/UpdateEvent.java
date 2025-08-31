package pt.saipar.client.api.event.impl;

import pt.saipar.client.api.event.Event;
import pt.saipar.client.api.utils.location.Location;
import pt.saipar.client.api.utils.rotation.Rotation;

public interface UpdateEvent extends Event {

    Location getLocation();

    Rotation getRotation();

    void setGround(final boolean ground);

    boolean isGround();

}
