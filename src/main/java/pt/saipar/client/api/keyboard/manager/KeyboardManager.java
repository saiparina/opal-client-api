package pt.saipar.client.api.keyboard.manager;

import pt.saipar.client.api.keyboard.Key;

import java.util.Optional;

public interface KeyboardManager {

    /**
     * Gets a {@link Key} from its code
     *
     * @param code the code of the {@link Key}
     * @return an {@link Optional} of the {@link Key}
     */
    Optional<Key> from(final int code);

    /**
     * Whether the {@link Key} is being pressed
     *
     * @param key the {@link Key}
     * @return whether the {@link Key} is being pressed
     */
    boolean isKeyPressed(final Key key);

}
