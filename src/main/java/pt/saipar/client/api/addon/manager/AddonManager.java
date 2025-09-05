package pt.saipar.client.api.addon.manager;

import java.io.File;

public interface AddonManager {

    void register(final File addonFile);

    void register();

}
