package pt.saipar.client.api.utils.location;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public final class Location {

    private double x, y, z;

    public Location subtract(final Location other) {
        x -= other.getX();
        y -= other.getY();
        z -= other.getZ();

        return this;
    }

    public Location flat() {
        y = 0;

        return this;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Location clone() {
        return new Location(x, y, z);
    }

}
