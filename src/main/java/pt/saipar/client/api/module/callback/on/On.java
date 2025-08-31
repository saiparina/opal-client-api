package pt.saipar.client.api.module.callback.on;

import pt.saipar.client.api.module.callback.type.CallbackType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface On {

    CallbackType value();

}
