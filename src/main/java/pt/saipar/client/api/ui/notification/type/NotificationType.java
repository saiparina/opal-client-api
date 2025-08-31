package pt.saipar.client.api.ui.notification.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.awt.*;

@RequiredArgsConstructor
@Getter
public enum NotificationType {

    INFO(new Color(0xFFFFFF)),
    SUCCESS(new Color(0x00FF00)),
    WARNING(new Color(0xFFFF00)),
    ERROR(new Color(0xFF0000));

    private final Color color;

}
