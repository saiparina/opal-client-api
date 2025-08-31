package pt.saipar.client.api.ui.notification.manager;

import pt.saipar.client.api.ui.notification.type.NotificationType;

public interface NotificationManager {

    /**
     * Registers the {@link NotificationManager}
     */
    void register();

    /**
     * Posts a notification
     *
     * @param type     the type of the notification
     * @param title    the title of the notification
     * @param text     the text of the notification
     * @param duration how long the notification will render for
     */
    void post(final NotificationType type, final String title, final String text, final long duration);

}
