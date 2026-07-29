package pt.saipar.client.api.wrapper.entity.impl;

import pt.saipar.client.api.wrapper.item.ItemWrapper;

public interface PlayerWrapper extends AbstractLivingEntityWrapper {

    int getItemInUseDuration();

    ItemWrapper getArmor(final int slot);

    boolean isSleeping();

}
