package pt.saipar.client.api.ui.font;

import pt.saipar.client.api.ui.font.renderer.FontRenderer;

public interface FontManager {

    FontRenderer get(final String name, final int size);

}
