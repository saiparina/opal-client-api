package pt.saipar.client.api.wrapper.block;

import pt.saipar.client.api.utils.location.Location;

public interface BlockWrapper {

    Location getLocation();

    boolean isAir();

}
