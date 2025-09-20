package pt.saipar.client.api.wrapper.entity.impl;

import pt.saipar.client.api.wrapper.entity.EntityWrapper;

public interface ArrowWrapper extends EntityWrapper {

    EntityWrapper getShooter();

    boolean hasLanded();

}
