package pt.saipar.client.api.utils.location;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public final class Location {

    private double x, y, z;

    /*public Vec3 vector() {
        return new Vec3(x, y, z);
    }*/

}
