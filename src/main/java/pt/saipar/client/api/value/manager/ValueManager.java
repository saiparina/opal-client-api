package pt.saipar.client.api.value.manager;

import com.google.gson.JsonObject;
import pt.saipar.client.api.value.Value;

import java.lang.reflect.Field;
import java.util.Optional;
import java.util.Set;

public interface ValueManager {

    /**
     * Checks whether a field is a value
     *
     * @param field the {@link Field}
     * @return whether a field is a value
     */
    boolean isValue(final Field field);

    /**
     * Gets the name of a {@link Value} from its {@link Field}
     *
     * @param field the {@link Field} of the {@link Value}
     * @return the name of the {@link Value}
     */
    String getName(final Field field);

    /**
     * Registers an {@link Object}
     *
     * @param object the {@link Object}
     */
    void register(final Object object);

    /**
     * Gets the values of an {@link Object}
     *
     * @param object the {@link Object}
     * @return a {@link Set} of {@link Value}
     */
    Set<Value> get(final Object object);

    /**
     * Gets the value
     *
     * @param parent the parent {@link Object}
     * @param value  the {@link Value}
     * @return the {@link Object} value
     */
    Object getValue(final Object parent, final Value value);

    /**
     * Finds and gets a {@link Value} by its name
     *
     * @param parent the parent {@link Object}
     * @param name   the name of the {@link Value}
     * @return an {@link Optional} of the {@link Value}
     */
    Optional<Value> get(final Object parent, final String name);

    /**
     * Sets the value of a {@link Value}
     *
     * @param parent the parent {@link Object} of the {@link Value}
     * @param value  the {@link Value}
     * @param result the result for the {@link Value}
     */
    void set(final Object parent, final Value value, final String result);

    JsonObject getJson(final Object parent);

}
