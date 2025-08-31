package pt.saipar.client.api.wrapper;

import pt.saipar.client.api.wrapper.entity.impl.PlayerWrapper;
import pt.saipar.client.api.wrapper.network.NetworkManagerWrapper;
import pt.saipar.client.api.wrapper.settings.SettingsWrapper;
import pt.saipar.client.api.wrapper.ui.font.FontWrapper;
import pt.saipar.client.api.wrapper.world.WorldWrapper;

public interface Wrapper {

    /**
     * Gets the game's {@link NetworkManagerWrapper}
     *
     * @return the {@link NetworkManagerWrapper}
     */
    NetworkManagerWrapper getNeworkManager();

    /**
     * Gets the game's {@link SettingsWrapper}
     *
     * @return the {@link SettingsWrapper}
     */
    SettingsWrapper getSettings();

    /**
     * Gets the {@link PlayerWrapper}
     *
     * @return the {@link PlayerWrapper}
     */
    PlayerWrapper getPlayer();

    /**
     * Gets the {@link WorldWrapper}
     *
     * @return the {@link WorldWrapper}
     */
    WorldWrapper getWorld();

    /**
     * Gets the minecraft {@link FontWrapper}
     *
     * @return the {@link FontWrapper}
     */
    FontWrapper getFont();

    /**
     * Presses the left mouse button
     */
    void clickMouse();

}
