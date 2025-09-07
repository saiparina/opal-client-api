package pt.saipar.client.api.event.impl;

import pt.saipar.client.api.event.Event;
import pt.saipar.client.api.wrapper.entity.impl.AbstractLivingEntityWrapper;

public interface RenderNameTagEvent extends Event {

    AbstractLivingEntityWrapper getEntity();

    void setName(final String name);

    String getName();

}
