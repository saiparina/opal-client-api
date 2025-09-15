package pt.saipar.client.api.event.impl;

import pt.saipar.client.api.event.Event;

public interface ChatEvent extends Event {

    void setMessage(final String message);

    String getMessage();

    interface Send extends ChatEvent {
    }

    interface Receive extends ChatEvent {

    }

}
