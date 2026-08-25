package pt.saipar.client.api.module;

import lombok.Getter;
import lombok.Setter;
import pt.saipar.client.api.input.key.Key;
import pt.saipar.client.api.module.base.AbstractModule;
import pt.saipar.client.api.module.category.ModuleCategory;
import pt.saipar.client.api.module.data.ModuleData;
import pt.saipar.client.api.module.mode.Mode;

@Getter
@Setter
public abstract class Module extends AbstractModule {

    private final ModuleCategory category;
    private final boolean hidden;
    private final boolean disableOnLoad;
    private final boolean unreloadable;
    private final boolean development;

    private boolean enabled;
    private String suffix;
    private Mode<?> mode;
    private Key key;

    public Module() {
        final ModuleData data = this.getClass().getAnnotation(ModuleData.class);

        if (data == null) {
            throw new RuntimeException(String.format("No ModuleData for %s!", this.getClass().getSimpleName()));
        }

        this.aliases = data.aliases();
        this.category = data.category();
        this.description = data.description();
        this.key = data.key();
        this.hidden = data.hidden();
        this.disableOnLoad = data.disableOnLoad();
        this.unreloadable = data.unreloadable();
        this.development = data.development();
    }

}
