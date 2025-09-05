package pt.saipar.client.api.addon;

import lombok.Getter;
import pt.saipar.client.api.addon.data.AddonData;

@Getter
public abstract class Addon {

    private final String name;

    public Addon() {
        final AddonData data = this.getClass().getAnnotation(AddonData.class);

        if (data == null) {
            throw new RuntimeException("No @AddonData found for " + this.getClass().getSimpleName());
        }

        this.name = data.value();
    }

    public abstract void register();

}
