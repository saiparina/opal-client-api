package pt.saipar.client.api.command;

import lombok.Getter;
import pt.saipar.client.api.command.data.CommandData;
import pt.saipar.client.api.command.subcommand.SubCommand;
import pt.saipar.client.api.logger.Logger;
import pt.saipar.client.api.utils.map.ClassMap;

@Getter
public abstract class Command {

    private final ClassMap<SubCommand<?>> subCommands = new ClassMap<>();

    private String[] aliases;

    public Command() {
        final CommandData data = this.getClass().getAnnotation(CommandData.class);

        if (data != null) {
            this.aliases = data.aliases();
        } else {
            Logger.WARN.log("No 'CommandData' provided for %s.", this.getClass().getSimpleName());
        }
    }

    public abstract void handle(final String... arguments);

}
