package pt.saipar.client.api.wrapper.render.manager;

import pt.saipar.client.api.utils.location.Location;
import pt.saipar.client.api.utils.rotation.Rotation;

public interface RenderManagerWrapper {

    Location getRenderLocation();

    Rotation getPlayerView();

}
