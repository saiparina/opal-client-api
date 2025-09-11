package pt.saipar.client.api.nametag.manager;

import pt.saipar.client.api.nametag.extension.NameTagExtension;

public interface NameTagManager {

    /**
     * Registers a new {@link NameTagExtension}
     *
     * @param extension the {@link NameTagExtension}
     */
    void register(final NameTagExtension extension);

}
