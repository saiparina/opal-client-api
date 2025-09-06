package pt.saipar.client.api.command.manager;

import pt.saipar.client.api.command.Command;
import pt.saipar.client.api.command.subcommand.SubCommand;

import java.util.Optional;

public interface CommandManager {

    String PREFIX = "#";

    void registerSubCommand(final Command parent, final SubCommand<?> subCommand);

    /**
     * Registers a {@link Command}
     *
     * @param command the {@link Command}
     */
    void register(final Command command);

    /**
     * Registers all commands
     */
    void register();

    /**
     * Gets a {@link Command} by its alias
     *
     * @param alias the alias
     * @return an {@link Optional} of a {@link Command}
     */
    Optional<Command> get(final String alias);

    /**
     * Gets a {@link Command} by its class
     *
     * @param commandClass the {@link Class} of the {@link Command}
     * @return the {@link Command} instance
     */
    <T extends Command> T get(final Class<T> commandClass);

    Optional<SubCommand<?>> getSubCommand(final Command parent, final String alias);

}
