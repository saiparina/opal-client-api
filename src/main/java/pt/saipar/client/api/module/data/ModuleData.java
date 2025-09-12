package pt.saipar.client.api.module.data;

import pt.saipar.client.api.keyboard.Key;
import pt.saipar.client.api.module.category.ModuleCategory;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ModuleData {

    String[] aliases();

    ModuleCategory category();

    String description() default "No description set.";

    Key key() default Key.NONE;

    boolean hidden() default false;

    boolean disableOnLoad() default false;

    boolean unreloadable() default false;

    boolean development() default false;

}
