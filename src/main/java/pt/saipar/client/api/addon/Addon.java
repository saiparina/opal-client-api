package pt.saipar.client.api.addon;

import lombok.Getter;
import lombok.Setter;
import pt.saipar.client.api.addon.data.AddonData;
import pt.saipar.client.api.command.Command;
import pt.saipar.client.api.module.Module;
import pt.saipar.client.api.nametag.extension.NameTagExtension;
import pt.saipar.client.api.utils.map.ClassMap;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

@Getter @Setter
public abstract class Addon {

    private final ClassMap<Module> modules = new ClassMap<>();
    private final ClassMap<Command> commands = new ClassMap<>();
    private final Map<String, NameTagExtension> extensions = new HashMap<>();

    private final String name;

    private File file;

    public Addon() {
        final AddonData data = this.getClass().getAnnotation(AddonData.class);

        if (data == null) {
            throw new RuntimeException("No @AddonData found for " + this.getClass().getSimpleName());
        }

        this.name = data.value();
    }

    public abstract void register();

}
