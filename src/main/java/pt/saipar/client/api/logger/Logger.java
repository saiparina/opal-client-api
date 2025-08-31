package pt.saipar.client.api.logger;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import pt.saipar.client.api.OpalAPI;

@RequiredArgsConstructor
@Getter
public enum Logger {

    INFO("§e"),
    WARN("§4"),
    DEBUG("§d");

    private final String color;

    /**
     * Logs a message to the console and queues the log
     *
     * @param message the message
     * @param objects the objects that are going to be formatted
     */
    public void log(final String message, final Object... objects) {
        OpalAPI.INSTANCE.getLoggerManager().queue(this, String.format(message, objects));
    }

}
