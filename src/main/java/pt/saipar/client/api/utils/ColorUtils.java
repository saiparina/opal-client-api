package pt.saipar.client.api.utils;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.UtilityClass;

import java.util.regex.Pattern;

@UtilityClass
public final class ColorUtils {

    public java.awt.Color interpolateColorC(final java.awt.Color color1, final java.awt.Color color2, float amount) {
        amount = Math.min(1, Math.max(0, amount));

        return new java.awt.Color(
                MathUtils.interpolateInt(color1.getRed(), color2.getRed(), amount),
                MathUtils.interpolateInt(color1.getGreen(), color2.getGreen(), amount),
                MathUtils.interpolateInt(color1.getBlue(), color2.getBlue(), amount),
                MathUtils.interpolateInt(color1.getAlpha(), color2.getAlpha(), amount)
        );
    }

    /**
     * Strips certain colors from a given string
     * <p> If there's no given colors to strip all will be stripped
     *
     * @param message the string to be stripped
     * @param colors  the colors to be stripped from the message
     * @return the stripped string
     */
    public String strip(final String message, Color... colors) {
        if (colors.length < 1) {
            colors = Color.values();
        }

        final StringBuilder codes = new StringBuilder();

        for (final Color color : colors) {
            codes.append(color.getCode());
        }

        return Pattern.compile("(?i)" + '§' + "[" + codes.toString().toUpperCase() + "]")
                .matcher(message)
                .replaceAll("");
    }

    @RequiredArgsConstructor
    @Getter
    public enum Color {

        BLACK('0'),
        DARK_BLUE('1'),
        DARK_GREEN('2'),
        DARK_AQUA('3'),
        DARK_RED('4'),
        DARK_PURPLE('5'),
        GOLD('6'),
        GRAY('7'),
        DARK_GRAY('8'),
        BLUE('9'),
        GREEN('a'),
        AQUA('b'),
        RED('c'),
        LIGHT_PURPLE('d'),
        YELLOW('e'),
        WHITE('f'),
        MAGIC('k'),
        BOLD('l'),
        STRIKETHROUGH('m'),
        UNDERLINE('n'),
        ITALIC('o'),
        RESET('r');

        private final char code;

    }

}
