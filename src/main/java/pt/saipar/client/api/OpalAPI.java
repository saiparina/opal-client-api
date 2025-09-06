package pt.saipar.client.api;

import pt.saipar.client.api.command.manager.CommandManager;
import pt.saipar.client.api.event.manager.EventManager;
import pt.saipar.client.api.friend.FriendManager;
import pt.saipar.client.api.keyboard.manager.KeyboardManager;
import pt.saipar.client.api.logger.manager.LoggerManager;
import pt.saipar.client.api.module.manager.ModuleManager;
import pt.saipar.client.api.ui.font.FontManager;
import pt.saipar.client.api.ui.notification.manager.NotificationManager;
import pt.saipar.client.api.value.manager.ValueManager;
import pt.saipar.client.api.wrapper.Wrapper;

public interface OpalAPI {

    /**
     * This will be injected later on
     */
    OpalAPI INSTANCE = new OpalAPI() {
        @Override
        public LoggerManager getLoggerManager() {
            return null;
        }

        @Override
        public FontManager getFontManager() {
            return null;
        }

        @Override
        public EventManager getEventManager() {
            return null;
        }

        @Override
        public KeyboardManager getKeyboardManager() {
            return null;
        }

        @Override
        public NotificationManager getNotificationManager() {
            return null;
        }

        @Override
        public ValueManager getValueManager() {
            return null;
        }

        @Override
        public ModuleManager getModuleManager() {
            return null;
        }

        @Override
        public CommandManager getCommandManager() {
            return null;
        }

        @Override
        public FriendManager getFriendManager() {
            return null;
        }

        @Override
        public Wrapper getWrapper() {
            return null;
        }
    };

    LoggerManager getLoggerManager();

    FontManager getFontManager();

    EventManager getEventManager();

    KeyboardManager getKeyboardManager();

    NotificationManager getNotificationManager();

    ValueManager getValueManager();

    ModuleManager getModuleManager();

    CommandManager getCommandManager();

    FriendManager getFriendManager();

    Wrapper getWrapper();

}
