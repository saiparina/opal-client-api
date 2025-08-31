package pt.saipar.client.api.module.mode.data;


import pt.saipar.client.api.module.Module;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ModeData {

    Class<? extends Module> parent();

    String[] aliases();

    String description() default "No description.";

}
