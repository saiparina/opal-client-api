package pt.saipar.client.api.logger.log;

import pt.saipar.client.api.logger.Logger;

import java.text.SimpleDateFormat;

public interface Log {

    SimpleDateFormat FORMAT = new SimpleDateFormat("HH:mm:ss");

    Logger getLogger();

    String getMessage();

    long getTimestamp();

    /**
     * Formats the {@link Log}
     *
     * @return the formatted log as a {@link String}
     */
    String format();

    /**
     * Formats the {@link Log} with colors
     *
     * @return the formatted log as a {@link String}
     */
    String formatColored();

}
