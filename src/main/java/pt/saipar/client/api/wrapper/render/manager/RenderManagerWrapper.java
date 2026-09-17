package pt.saipar.client.api.wrapper.render.manager;

import pt.saipar.client.api.utils.location.Location;
import pt.saipar.client.api.utils.rotation.Rotation;
import pt.saipar.client.api.wrapper.entity.EntityWrapper;

import java.awt.*;

public interface RenderManagerWrapper {

    Location getRenderLocation();

    Rotation getPlayerView();

    /**
     * Renders an {@link EntityWrapper}'s hitbox
     *
     * @param entity the {@link EntityWrapper}
     * @param color the {@link Color}
     */
    void renderHitbox(final EntityWrapper entity, final Color color);

    /**
     * Renders an {@link EntityWrapper}'s model with a glow {@link Color}
     *
     * @param entity the {@link EntityWrapper}
     * @param color the {@link Color}
     */
    void renderModel(final EntityWrapper entity, final Color color);

}
