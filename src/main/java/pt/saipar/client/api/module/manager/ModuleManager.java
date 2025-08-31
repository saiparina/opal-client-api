package pt.saipar.client.api.module.manager;

import pt.saipar.client.api.module.Module;
import pt.saipar.client.api.module.mode.Mode;

import java.util.Collection;
import java.util.Optional;

public interface ModuleManager {

    /**
     * Saves a {@link Module}
     *
     * @param module the {@link Module}
     */
    void save(final Module module);

    /**
     * Loads a {@link Module}
     *
     * @param module the {@link Module}
     */
    void load(final Module module);

    /**
     * Saves all {@link Module}s
     */
    void save();

    /**
     * Registers a {@link Mode} for a {@link Module}
     *
     * @param module the {@link Module}
     * @param mode   the {@link Mode}
     */
    <T extends Module> void register(final T module, final Mode<T> mode);

    /**
     * Registers a {@link Module}
     *
     * @param module the {@link Module}
     */
    void register(final Module module);

    /**
     * Registers all {@link Module}s
     *
     * @apiNote This can't be used
     */
    void register();

    /**
     * Finds a {@link Module} by its alias
     *
     * @param alias the alias of the {@link Module}
     * @return the {@link Module}
     */
    Optional<Module> get(final String alias);

    /**
     * Finds a {@link Module} by its {@link Class}
     *
     * @param moduleClass the {@link Class} of the {@link Module}
     * @return the {@link Module}
     */
    <T extends Module> T get(final Class<T> moduleClass);

    /**
     * Toggles a {@link Module}
     *
     * @param module the {@link Module}
     */
    void toggle(final Module module);

    /**
     * Gets the {@link Mode}s of a {@link Module}
     *
     * @param module the {@link Module}
     * @return a {@link Collection} with the {@link Mode}s of the {@link Module}
     */
    Collection<Mode<?>> getModes(final Module module);

    /**
     * Gets the {@link Mode} by its {@link Class}
     *
     * @param module    the {@link Module} parent
     * @param modeClass the {@link Class} of the {@link Mode}
     * @return the {@link Mode}
     */
    Mode<?> get(final Module module, final Class<? extends Mode<?>> modeClass);

    /**
     * Gets all {@link Module}s
     *
     * @return a {@link Collection} with all {@link Module}s
     */
    Collection<Module> getModules();

}
