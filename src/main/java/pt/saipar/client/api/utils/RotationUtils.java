package pt.saipar.client.api.utils;

import lombok.experimental.UtilityClass;
import pt.saipar.client.api.OpalAPI;
import pt.saipar.client.api.utils.location.Location;
import pt.saipar.client.api.utils.rotation.Rotation;
import pt.saipar.client.api.wrapper.entity.EntityWrapper;
import pt.saipar.client.api.wrapper.entity.impl.PlayerWrapper;

@UtilityClass
public final class RotationUtils {

    public Rotation getRotation(final Location origin, final Location position) {
        final Location originVec = origin.clone(),
                positionVec = position.clone();
        final Location difference = positionVec.subtract(originVec);

        final double distance = difference.clone().flat().length();

        return new Rotation(
                (float) (Math.toDegrees(Math.atan2(difference.getZ(), difference.getX())) - 90.0f),
                (float) -Math.toDegrees(Math.atan2(difference.getY(), distance))
        );
    }

    public double getDistance(final Rotation originRotation, final Location origin, final Location position) {
        final Rotation rotation = RotationUtils.getRotation(origin, position);

        return Math.sqrt(Math.pow(originRotation.getYaw() - rotation.getYaw(), 2) + Math.pow(originRotation.getPitch() - rotation.getPitch(), 2));
    }

    public float getAngleDifference(final float direction, final float rotationYaw) {
        final float difference = Math.abs(rotationYaw - direction) % 360.0f;

        return difference > 180.0f ? 360.0f - difference : difference;
    }

    public float getAngleDifferenceTo(final EntityWrapper entity) {
        final PlayerWrapper player = OpalAPI.INSTANCE.getWrapper().getPlayer();

        return RotationUtils.getAngleDifference(
                player.getRotation().getYaw(),
                RotationUtils.getRotation(
                        player.getLocation(),
                        entity.getLocation()
                ).getYaw()
        );
    }

    public float wrapTo180(float value) {
        value = value % 360.0F;

        if (value >= 180.0F) {
            value -= 360.0F;
        }

        if (value < -180.0F) {
            value += 360.0F;
        }

        return value;
    }

}
