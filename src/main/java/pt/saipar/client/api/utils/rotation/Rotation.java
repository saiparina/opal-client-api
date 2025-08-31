package pt.saipar.client.api.utils.rotation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import pt.saipar.client.api.OpalAPI;

@AllArgsConstructor
@Getter @Setter
public final class Rotation {

    private float yaw, pitch;

    public Rotation add(final float yaw, final float pitch) {
        this.yaw += yaw;
        this.pitch += pitch;

        return this;
    }

    public Rotation add(final Rotation rotation) {
        return this.add(rotation.getYaw(), rotation.getPitch());
    }

    public Rotation normalize() {
        final float sensitivity = OpalAPI.get().getWrapper().getSettings().getSensitivity();
        final float factor = sensitivity * 0.6f + 0.2f;
        final float modulo = factor * factor * factor * 1.2f;

        yaw -= yaw % modulo;
        pitch -= pitch % modulo;

        return this;
    }

}
