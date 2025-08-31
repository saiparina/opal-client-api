package pt.saipar.client.api.event.listener;

import pt.saipar.client.api.event.Event;

@FunctionalInterface
public interface Listener<E extends Event> {

    /**
     * Fires a {@link Event}
     *
     * @param event the {@link Event}
     */
    void fire(final E event);

}
