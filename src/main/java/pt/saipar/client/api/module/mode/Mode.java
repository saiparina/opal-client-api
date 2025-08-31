package pt.saipar.client.api.module.mode;

import lombok.Getter;
import lombok.Setter;
import pt.saipar.client.api.OpalAPI;
import pt.saipar.client.api.module.Module;
import pt.saipar.client.api.module.base.AbstractModule;
import pt.saipar.client.api.module.mode.data.ModeData;

import java.lang.reflect.ParameterizedType;

@Getter @Setter
public abstract class Mode<T extends Module> extends AbstractModule {

    private final T parent;

    @SuppressWarnings("unchecked")
    public Mode() {
        final ModeData data = this.getClass().getAnnotation(ModeData.class);

        if (data == null) {
            throw new RuntimeException(String.format("No ModeData for %s!", this.getClass().getSimpleName()));
        }

        final Class<T> parentClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];

        this.parent = OpalAPI.INSTANCE.getModuleManager().get(parentClass);
        this.aliases = data.aliases();
        this.description = data.description();
    }

}
