package pt.saipar.client.api.utils.range;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public final class Range {

    private final int start, end;

    public boolean in(final int value) {
        return value >= start && value <= end;
    }

    public String key() {
        return String.format("%d:%d", start, end);
    }

    @Override
    public String toString() {
        return String.format("[%d, %d]", start, end);
    }

    public static Range of(final String key) {
        final String[] data = key.split(":");

        return new Range(Integer.parseInt(data[0]), Integer.parseInt(data[1]));
    }

}
