package pt.saipar.client.api.logger.manager;

import pt.saipar.client.api.logger.Logger;
import pt.saipar.client.api.logger.log.Log;

import java.io.File;

public interface LoggerManager {

    /**
     * Creates the log file and registers the log executor
     */
    void register();

    /**
     * Saves all logs
     */
    void save();

    /**
     * Saves a {@link Log} to the log {@link File}
     *
     * @param log the {@link Log}
     */
    void save(final Log log);

    /**
     * Queues a {@link Log} to be saved
     *
     * @param logger     the logger type
     * @param message    the message
     */
    void queue(final Logger logger, final String message);

}
