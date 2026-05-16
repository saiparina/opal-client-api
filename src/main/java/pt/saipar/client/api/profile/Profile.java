package pt.saipar.client.api.profile;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Getter
@RequiredArgsConstructor
public final class Profile {

    private final String name;

    // Map<ModuleAlias, Map<ValueName, ValueString>>
    private final Map<String, Map<String, String>> overrides = new HashMap<>();

}
