package pt.saipar.client.api.module.category;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.awt.*;

@RequiredArgsConstructor
@Getter
public enum ModuleCategory {

    COMBAT(new Color(0xffE64D3A)),
    MOVEMENT(new Color(0xff2ECD6F)),
    RENDER(new Color(0xff3601CE)),
    PLAYER(new Color(0xff8E45AE)),
    EXPLOIT(new Color(0xff3398D9)),
    OTHER(new Color(0xCBFF02));

    private final Color color;

}
