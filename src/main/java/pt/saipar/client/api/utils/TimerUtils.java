package pt.saipar.client.api.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class TimerUtils {

    /**
     * Generates a random delay between two values
     *
     * @param minDelay the minimum delay
     * @param maxDelay the maximum delay
     * @return the delay
     */
    public long randomDelay(final int minDelay, final int maxDelay) {
        if (minDelay == maxDelay) {
            return (1000 / minDelay - 1000 / maxDelay + 1) + 1000 / maxDelay;
        }

        return (long) ((Math.random() * (1000 / minDelay - 1000 / maxDelay + 1)) + 1000 / maxDelay);
    }

}
