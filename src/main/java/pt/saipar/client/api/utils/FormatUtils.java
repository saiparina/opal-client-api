package pt.saipar.client.api.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class FormatUtils {

    /**
     * Replaces the last instance of a {@link String} in a {@link String}
     *
     * @param input the input {@link String}
     * @param regex the regex input
     * @param replacement the replacement
     * @return the result {@link String}
     */
    public String replaceLast(final String input, final String regex, final String replacement) {
        return input.replaceFirst("(?s)" + regex + "(?!.*?" + regex + ")", replacement);
    }

    /**
     * Verifies if a {@link String} is lower case
     *
     * @param input the input {@link String}
     * @return whether the {@link String} is lower case
     */
    public boolean isLowerCase(final String input) {
        return input.equals(input.toLowerCase());
    }

    /**
     * Formats a {@link String}
     *
     * @param input the input {@link String}
     * @param separator the seperator
     * @return the formatted {@link String}
     */
    public String format(final String input, final String separator) {
        final String[] words = input.split(separator);
        final StringBuilder result = new StringBuilder();

        for (final String word : words) {
            if (!isLowerCase(word)) {
                result.append(word).append(" ");

                continue;
            }

            result.append(word.replaceFirst(word.charAt(0) + "", Character.toUpperCase(word.charAt(0)) + "")).append(" ");
        }

        return FormatUtils.replaceLast(result.toString(), " ", "");
    }

    /**
     * Formats a {@link String}
     *
     * @param input the input {@link String}
     * @return the formatted {@link String}
     */
    public String format(final String input) {
        return FormatUtils.format(input, "-");
    }

    /**
     * Formats an {@link Enum}
     *
     * @param input the input {@link Enum}
     * @return the formatted {@link Enum} as a {@link String}
     */
    public String format(final Enum<?> input) {
        return FormatUtils.format(input.name().toLowerCase(), "_");
    }

}
