package pt.saipar.client.api.addon.manager;

import pt.saipar.client.api.addon.Addon;

import java.io.File;

public interface AddonManager {

    void load(final File addonFile);

    void register();

    void unload(final Addon addon);

    Addon get(final String addonName);

    boolean isLoaded(final String addonName);

}
