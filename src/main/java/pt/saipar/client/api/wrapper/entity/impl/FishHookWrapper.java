package pt.saipar.client.api.wrapper.entity.impl;

import pt.saipar.client.api.wrapper.entity.EntityWrapper;

public interface FishHookWrapper extends EntityWrapper {

    PlayerWrapper getAngler();

    EntityWrapper getCaught();

    boolean isOnGround();

}
