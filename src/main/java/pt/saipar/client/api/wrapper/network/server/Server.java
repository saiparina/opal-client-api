package pt.saipar.client.api.wrapper.network.server;

import pt.saipar.client.api.wrapper.utils.name.DisplayName;

import java.util.Set;

public interface Server {

    Set<DisplayName> getOnlineDisplayNames();

}
