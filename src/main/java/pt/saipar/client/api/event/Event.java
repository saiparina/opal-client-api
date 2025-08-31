package pt.saipar.client.api.event;

import pt.saipar.client.api.event.state.EventState;

public interface Event {

    void setState(final EventState state);

    EventState getState();

    void setCancelled(final boolean cancelled);

    void cancel();

    boolean isCancelled();

}
