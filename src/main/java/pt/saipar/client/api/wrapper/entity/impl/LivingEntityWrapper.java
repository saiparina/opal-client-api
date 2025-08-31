package pt.saipar.client.api.wrapper.entity.impl;

import pt.saipar.client.api.wrapper.entity.EntityWrapper;
import pt.saipar.client.api.wrapper.item.ItemWrapper;

public interface LivingEntityWrapper extends EntityWrapper {

    ItemWrapper getItemInHand();

    float getHealth();

}
