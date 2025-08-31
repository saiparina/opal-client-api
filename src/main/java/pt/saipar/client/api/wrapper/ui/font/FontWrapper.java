package pt.saipar.client.api.wrapper.ui.font;

import java.awt.*;

public interface FontWrapper {

    /**
     * Draws a {@link String} at a given position with a given {@link Color}
     *
     * @param text the text
     * @param x the x coordinate
     * @param y the y coordinate
     * @param color the {@link Color}
     */
    void drawString(final String text, final int x, int y, final Color color);

    /**
     * Draws a {@link String} with shadow at a given position with a given {@link Color}
     *
     * @param text the text
     * @param x the x coordinate
     * @param y the y coordinate
     * @param color the {@link Color}
     */
    void drawStringWithShadow(final String text, final int x, final int y, final Color color);

    /**
     * Gets the height of the {@link FontWrapper}
     *
     * @return the height
     */
    int getHeight();

    /**
     * Gets the width of a {@link String}
     *
     * @param text the {@link String}
     * @return the width of the {@link String}
     */
    int getWidth(final String text);

}
