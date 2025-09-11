package pt.saipar.client.api.utils.timer;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public final class Timer {

    private long time = System.nanoTime() / 1000000L;

    /**
     * Whether a value of time has elapsed
     *
     * @param time the time
     * @return whether it has elapsed
     */
    public boolean elapsed(final long time) {
        return time() >= time;
    }

    /**
     * Resets the {@link Timer}
     */
    public void reset() {
        time = System.nanoTime() / 1000000L;
    }

    /**
     * Sleeps the {@link Timer} for an amount of time
     *
     * @param time the amount of time
     * @return whether the timer has finished sleeping
     */
    public boolean sleep(final long time) {
        if (time() >= time) {
            this.reset();

            return true;
        }

        return false;
    }

    /**
     * The time elapsed since the last reset
     *
     * @return the time elapsed since the last reset
     */
    public long time() {
        return System.nanoTime() / 1000000L - time;
    }

}
