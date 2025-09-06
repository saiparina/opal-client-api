package pt.saipar.client.api.command.subcommand;

import lombok.Getter;
import pt.saipar.client.api.command.Command;
import pt.saipar.client.api.command.subcommand.data.SubCommandData;

@Getter
public abstract class SubCommand<T extends Command> {

    private T parent;
    private String[] aliases;

    public SubCommand() {
        final SubCommandData data = this.getClass().getAnnotation(SubCommandData.class);

        if (data != null) {

            this.aliases = data.aliases();
        }
    }

    /**
     * Sets the parent
     *
     * @param parent the parent
     */
    @SuppressWarnings("unchecked")
    public void setParent(final Object parent) {
        this.parent = (T) parent;
    }

    public abstract void handle(final String... arguments);

}
