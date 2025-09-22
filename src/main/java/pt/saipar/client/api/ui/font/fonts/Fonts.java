package pt.saipar.client.api.ui.font.fonts;

import lombok.RequiredArgsConstructor;
import pt.saipar.client.api.OpalAPI;
import pt.saipar.client.api.ui.font.renderer.FontRenderer;

@RequiredArgsConstructor
public enum Fonts {
    MINECRAFT("minecraft"),
    TAHOMA("tahoma-regular"),
    ROBOTO("roboto-regular"),
    ROBOTO_BOLD("roboto-bold");

    private final String name;

    public FontRenderer withSize(final int size) {
        return OpalAPI.INSTANCE.getFontManager().get(name, size);
    }

}
