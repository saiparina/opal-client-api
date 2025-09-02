package pt.saipar.client.api.wrapper.entity.impl;

import pt.saipar.client.api.wrapper.effect.EffectWrapper;
import pt.saipar.client.api.wrapper.effect.type.EffectType;
import pt.saipar.client.api.wrapper.entity.EntityWrapper;
import pt.saipar.client.api.wrapper.item.ItemWrapper;

public interface LivingEntityWrapper extends EntityWrapper {

    ItemWrapper getItemInHand();

    float getHealth();

    EffectWrapper getEffect(final EffectType type);

    boolean hasEffect(final EffectType type);

}
