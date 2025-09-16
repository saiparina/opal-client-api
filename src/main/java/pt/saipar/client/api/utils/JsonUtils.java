package pt.saipar.client.api.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.experimental.UtilityClass;

@UtilityClass
public final class JsonUtils {

    public final Gson PRETTY_GSON = new GsonBuilder()
            .setPrettyPrinting()
            .disableHtmlEscaping()
            .create();
    public final Gson GSON = new Gson();

    public String toJson(final Object object) {
        return GSON.toJson(object);
    }


}
