package pt.saipar.client.api.wrapper;

import pt.saipar.client.api.ui.font.renderer.FontRenderer;
import pt.saipar.client.api.wrapper.entity.impl.PlayerWrapper;
import pt.saipar.client.api.wrapper.inventory.InventoryWrapper;
import pt.saipar.client.api.wrapper.network.NetworkManagerWrapper;
import pt.saipar.client.api.wrapper.render.manager.RenderManagerWrapper;
import pt.saipar.client.api.wrapper.settings.SettingsWrapper;
import pt.saipar.client.api.wrapper.util.timer.TimerWrapper;
import pt.saipar.client.api.wrapper.world.WorldWrapper;

public interface Wrapper {

    /**
     * Gets the game's {@link NetworkManagerWrapper}
     *
     * @return the {@link NetworkManagerWrapper}
     */
    NetworkManagerWrapper getNetworkManager();

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
     * Gets the {@link InventoryWrapper}
     *
     * @return the {@link InventoryWrapper}
     */
    InventoryWrapper getInventory();

    /**
     * Gets the {@link WorldWrapper}
     *
     * @return the {@link WorldWrapper}
     */
    WorldWrapper getWorld();

    /**
     * Gets the minecraft {@link FontRenderer}
     *
     * @return the {@link FontRenderer}
     */
    FontRenderer getFont();

    /**
     * Gets the minecraft {@link RenderManagerWrapper}
     *
     * @return the {@link RenderManagerWrapper}
     */
    RenderManagerWrapper getRenderManager();

    /**
     * Gets the minecraft {@link TimerWrapper}
     *
     * @return the {@link TimerWrapper}
     */
    TimerWrapper getTimer();

    /**
     * Presses the left mouse button
     */
    void clickMouse();

}
