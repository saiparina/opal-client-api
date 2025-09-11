package pt.saipar.client.api.nametag.extension;

import pt.saipar.client.api.wrapper.entity.impl.PlayerWrapper;

import java.util.function.Function;

public interface NameTagExtension {

    String getId();

    Function<PlayerWrapper, String> getFunction();

}
