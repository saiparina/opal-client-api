package pt.saipar.client.api.wrapper.settings.keybind;

public interface KeyBindWrapper {

    void setPressed(final boolean state);

    boolean isPressed();

    void tick();

}
