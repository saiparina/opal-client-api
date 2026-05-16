package pt.saipar.client.api.profile.manager;

import pt.saipar.client.api.profile.Profile;

import java.util.Collection;
import java.util.Optional;

public interface ProfileManager {

    /**
     * Registers the profile manager
     */
    void register();

    /**
     * Saves the current profiles
     */
    void save();

    /**
     * Loads a profile by its name
     *
     * @param name the name of the profile
     */
    void load(final String name);

    /**
     * Creates a new profile
     *
     * @param name the name of the profile
     */
    void create(final String name);

    /**
     * Deletes a profile
     *
     * @param name the name of the profile
     */
    void delete(final String name);

    /**
     * Gets the active profile
     *
     * @return an {@link Optional} of the active {@link Profile}
     */
    Optional<Profile> getActive();

    /**
     * Gets all profiles
     *
     * @return a {@link Collection} of all {@link Profile}s
     */
    Collection<Profile> getProfiles();

    /**
     * Checks if a profile is currently being applied
     *
     * @return whether a profile is being applied
     */
    boolean isApplying();

}
