package pt.saipar.client.api.event.listener;

import pt.saipar.client.api.event.Event;

@FunctionalInterface
public interface Listener<E extends Event> {

    /**
     * Processes a {@link Event}
     *
     * @param event the {@link Event}
     */
    void process(final E event);

}
