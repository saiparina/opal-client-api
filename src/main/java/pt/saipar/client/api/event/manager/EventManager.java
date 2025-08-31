package pt.saipar.client.api.event.manager;

import pt.saipar.client.api.event.Event;
import pt.saipar.client.api.event.listener.event.EventListener;

public interface EventManager {

    /**
     * Registers an {@link EventListener}
     *
     * @param listener the {@link EventListener}
     */
    void register(final EventListener listener);

    /**
     * Registers multiple {@link EventListener}
     *
     * @param listeners the {@link EventListener}
     */
    void register(final EventListener... listeners);

    /**
     * Unregisters an {@link EventListener}
     *
     * @param listener the {@link EventListener}
     */
    void unregister(final EventListener listener);

    /**
     * Posts an {@link Event}
     *
     * @param event the {@link Event}
     */
    void post(final Event event);

}
