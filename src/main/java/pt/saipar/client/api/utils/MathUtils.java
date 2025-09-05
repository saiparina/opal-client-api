package pt.saipar.client.api.utils;

import lombok.experimental.UtilityClass;

import java.math.BigDecimal;
import java.math.RoundingMode;

@UtilityClass
public final class MathUtils {

    public float calculateGaussianValue(final float x, final float sigma) {
        double output = 1.0 / Math.sqrt(2.0 * Math.PI * (sigma * sigma));

        return (float) (output * Math.exp(-(x * x) / (2.0 * (sigma * sigma))));
    }

    public double interpolate(final double oldValue, final double newValue, final double interpolationValue){
        return (oldValue + (newValue - oldValue) * interpolationValue);
    }

    public float interpolateFloat(final float oldValue, final float newValue, final double interpolationValue){
        return (float) MathUtils.interpolate(oldValue, newValue, (float) interpolationValue);
    }

    public int interpolateInt(final int oldValue, final int newValue, final double interpolationValue){
        return (int) MathUtils.interpolate(oldValue, newValue, (float) interpolationValue);
    }

    public boolean isDouble(final String value) {
        try {
            Double.parseDouble(value);

            return true;
        } catch (final Exception ignored) {
            return false;
        }
    }

    public double round(final Number value, final int places) {
        return BigDecimal.valueOf(value.doubleValue())
                .setScale(places, RoundingMode.HALF_DOWN)
                .doubleValue();
    }

}
