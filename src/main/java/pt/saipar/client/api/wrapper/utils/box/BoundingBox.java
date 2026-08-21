package pt.saipar.client.api.wrapper.utils.box;

import pt.saipar.client.api.utils.location.Location;
import pt.saipar.client.api.utils.rotation.Rotation;

import java.util.List;

public interface BoundingBox {

    Location getMin();

    Location getMax();

    Location getCenter();

    List<Location> getPoints();

    BoundingBox expand(final Location sizes);

    double getDistance(final Location origin, final Rotation rotation);

}
