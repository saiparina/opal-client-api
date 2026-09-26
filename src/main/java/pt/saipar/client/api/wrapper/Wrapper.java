package pt.saipar.client.api.wrapper;

import pt.saipar.client.api.ui.font.renderer.FontRenderer;
import pt.saipar.client.api.wrapper.entity.impl.PlayerWrapper;
import pt.saipar.client.api.wrapper.inventory.InventoryWrapper;
import pt.saipar.client.api.wrapper.network.NetworkManagerWrapper;
import pt.saipar.client.api.wrapper.render.manager.RenderManagerWrapper;
import pt.saipar.client.api.wrapper.settings.SettingsWrapper;
import pt.saipar.client.api.wrapper.ui.screen.ScreenWrapper;
import pt.saipar.client.api.wrapper.utils.timer.TimerWrapper;
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
     * Gets the current {@link ScreenWrapper}
     *
     * @return the current {@link ScreenWrapper}
     */
    ScreenWrapper getCurrentScreen();

    /**
     * Whether the player's inventory screen is open
     *
     * @return whether the inventory is open
     */
    boolean isInventoryOpen();

    /**
     * Opens the player's inventory
     */
    void openInventory();

    /**
     * Closes the screen the player has open
     */
    void closeScreen();

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
     * Sets the left click counter
     *
     * @param counter value
     */
    void setLeftClickCounter(final int counter);

    /**
     * Presses the left mouse button
     */
    void clickMouse();

}
