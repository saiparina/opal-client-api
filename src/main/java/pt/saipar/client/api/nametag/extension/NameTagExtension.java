package pt.saipar.client.api.nametag.extension;

import pt.saipar.client.api.wrapper.entity.impl.PlayerWrapper;

import java.util.function.Function;

public interface NameTagExtension {

    /**
     * The ID of the {@link NameTagExtension}
     * TODO: annotation?
     *
     * @return the ID
     */
    String getId();

    /**
     * A {@link PlayerWrapper} function returning the added text
     *
     * @return the function
     */
    Function<PlayerWrapper, String> getFunction();

    /**
     * Renders the {@link NameTagExtension}
     *
     * @param player the player
     */
    default void render(final PlayerWrapper player) {
    }

}
