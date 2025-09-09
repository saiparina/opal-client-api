package pt.saipar.client.api.event.impl;

import pt.saipar.client.api.event.Event;
import pt.saipar.client.api.wrapper.entity.impl.AbstractLivingEntityWrapper;
import pt.saipar.client.api.wrapper.settings.resolution.ResolutionWrapper;

public interface RenderEvent extends Event {

    float getPartialTicks();

    interface HUD extends RenderEvent {

        ResolutionWrapper getResolution();

    }

    interface Game extends RenderEvent {
    }

    interface NameTag extends RenderEvent {

        AbstractLivingEntityWrapper getEntity();

        void setName(final String name);

        String getName();

        boolean isPlayer();

    }

}
