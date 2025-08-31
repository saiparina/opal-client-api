package pt.saipar.client.api;

import pt.saipar.client.api.accessor.OpalAccessor;
import pt.saipar.client.api.event.manager.EventManager;
import pt.saipar.client.api.friend.FriendManager;
import pt.saipar.client.api.logger.manager.LoggerManager;
import pt.saipar.client.api.wrapper.Wrapper;

public interface OpalAPI {

    OpalAccessor ACCESSOR = new OpalAccessor();

    LoggerManager getLoggerManager();

    EventManager getEventManager();

    FriendManager getFriendManager();

    Wrapper getWrapper();

    static OpalAPI get() {
        return ACCESSOR.getInstance();
    }

}
