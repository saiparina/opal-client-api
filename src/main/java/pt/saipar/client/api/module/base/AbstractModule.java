package pt.saipar.client.api.module.base;

import lombok.Getter;
import pt.saipar.client.api.OpalAPI;
import pt.saipar.client.api.event.listener.event.EventListener;
import pt.saipar.client.api.wrapper.Wrapper;

@Getter
public abstract class AbstractModule implements EventListener {

    // Quick access to the wrapper for easy use in modules
    protected static final Wrapper WRAPPER = OpalAPI.INSTANCE.getWrapper();

    protected String[] aliases;
    protected String description;

    public String getLabel() {
        return "";
    }

}
