package pt.saipar.client.api;

import pt.saipar.client.api.accessor.OpalAccessor;
import pt.saipar.client.api.friend.FriendManager;
import pt.saipar.client.api.logger.manager.LoggerManager;

public interface OpalAPI {

    OpalAccessor ACCESSOR = new OpalAccessor();

    LoggerManager getLoggerManager();

    FriendManager getFriendManager();

    static OpalAPI get() {
        return ACCESSOR.getInstance();
    }

}
