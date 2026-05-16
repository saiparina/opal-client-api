package pt.saipar.client.api.nametag.extension;

import pt.saipar.client.api.nametag.extension.data.NameTagExtensionData;
import pt.saipar.client.api.wrapper.entity.impl.PlayerWrapper;

public interface NameTagExtension {

    /**
     * The ID of the {@link NameTagExtension}
     *
     * @return the ID
     */
    default String getId() {
        final NameTagExtensionData data = this.getClass().getAnnotation(NameTagExtensionData.class);

        if (data == null) {
            throw new RuntimeException(String.format("No NameTagExtensionData for %s!", this.getClass().getSimpleName()));
        }

        return data.value();
    }

    /**
     * Returns the text for the {@link NameTagExtension}
     *
     * @param player the player
     * @return the text
     */
    default String getText(final PlayerWrapper player) {
        return "";
    }

    /**
     * Renders the {@link NameTagExtension}
     *
     * @param player the player
     * @param x the x position
     * @param y the y position
     */
    default void render(final PlayerWrapper player, final float x, final float y) {
    }

    /**
     * Returns the width of the {@link NameTagExtension} when rendered
     *
     * @param player the player
     * @return the width
     */
    default float getWidth(final PlayerWrapper player) {
        return 0;
    }

}
