package pt.saipar.client.api.event.impl;

import pt.saipar.client.api.event.Event;
import pt.saipar.client.api.input.key.Key;

public interface KeyPressEvent extends Event {

    Key getKey();

}
