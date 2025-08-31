package pt.saipar.client.api.utils.map;


import java.util.HashMap;

/**
 * This is basically a {@link com.google.common.collect.ClassToInstanceMap} except it works, and it's easier to use
 *
 * @param <V> the type
 */
public final class ClassMap<V> extends HashMap<Class<V>, V> {

    /**
     * Adds an element to the map
     *
     * @param element the element
     */
    @SuppressWarnings("unchecked")
    public void add(final V element) {
        this.put((Class<V>) element.getClass(), element);
    }

    /**
     * Gets an element from the map
     *
     * @param elementClass the {@link Class} of the element
     * @param <T>          the type
     * @return the element
     */
    @SuppressWarnings("unchecked")
    public <T extends V> T get(final Class<T> elementClass) {
        return (T) super.get(elementClass);
    }

}
