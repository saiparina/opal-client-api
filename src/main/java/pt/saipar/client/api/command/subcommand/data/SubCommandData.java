package pt.saipar.client.api.command.subcommand.data;

import pt.saipar.client.api.command.Command;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface SubCommandData {

    Class<? extends Command> parent();

    String[] aliases();

}
