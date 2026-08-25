package pt.saipar.client.api.input.manager;

import pt.saipar.client.api.input.key.Key;

import java.util.Optional;

public interface InputManager {

    /**
     * Gets a {@link Key} from its code
     *
     * @param code the code of the {@link Key}
     * @return an {@link Optional} of the {@link Key}
     */
    Optional<Key> from(final int code);

    /**
     * Gets a {@link Key} from its name
     *
     * @param name the name of the {@link Key}
     * @return an {@link Optional} of the {@link Key}
     */
    Optional<Key> from(final String name);

    /**
     * Whether the {@link Key} is being pressed
     *
     * @param key the {@link Key}
     * @return whether the {@link Key} is being pressed
     */
    boolean isKeyPressed(final Key key);

    boolean isMouseButtonPressed(final int buttonId);

}
