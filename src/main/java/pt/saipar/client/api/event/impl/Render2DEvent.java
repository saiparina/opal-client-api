package pt.saipar.client.api.event.impl;

import pt.saipar.client.api.event.Event;
import pt.saipar.client.api.wrapper.settings.resolution.ResolutionWrapper;

public interface Render2DEvent extends Event {

    ResolutionWrapper getResolution();

    float getPartialTicks();

}
