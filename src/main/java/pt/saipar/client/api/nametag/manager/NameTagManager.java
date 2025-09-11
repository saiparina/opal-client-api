package pt.saipar.client.api.nametag.manager;

import pt.saipar.client.api.nametag.extension.NameTagExtension;

import java.util.Collection;

public interface NameTagManager {

    /**
     * Registers a new {@link NameTagExtension}
     *
     * @param extension the {@link NameTagExtension}
     */
    void register(final NameTagExtension extension);

    /**
     * Gets all the {@link NameTagExtension}s
     *
     * @return a {@link Collection} with all {@link NameTagExtension}s
     */
    Collection<NameTagExtension> getExtensions();

}
