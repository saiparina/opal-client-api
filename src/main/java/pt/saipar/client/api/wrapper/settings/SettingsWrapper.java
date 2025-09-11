package pt.saipar.client.api.wrapper.settings;

import pt.saipar.client.api.wrapper.settings.keybind.KeyBindWrapper;
import pt.saipar.client.api.wrapper.settings.resolution.ResolutionWrapper;

public interface SettingsWrapper {

    ResolutionWrapper getResolution();

    float getSensitivity();

    KeyBindWrapper getAttackKeyBind();

    KeyBindWrapper getUseKeyBind();

    KeyBindWrapper getSprintKeyBind();

    void setMaxFPS(final int value);

    int getMaxFPS();

}
