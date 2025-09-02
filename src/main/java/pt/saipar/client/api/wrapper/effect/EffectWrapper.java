package pt.saipar.client.api.wrapper.effect;

import pt.saipar.client.api.wrapper.effect.type.EffectType;

public interface EffectWrapper {

    EffectType getType();

    int getDurationTicks();

    int getAmplifier();

}
