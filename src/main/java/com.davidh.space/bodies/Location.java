package com.davidh.space.bodies;

/**
 * @author david.hines
 */
public class Location {

    private Double x;
    private Double y;
    private Double z;

    public double distanceFrom(Location l) {
        double xd = this.x - l.x;
        double yd = this.y - l.y;
        double zd = this.z - l.y;
        return Math.sqrt(xd * xd + yd * yd + zd * zd);
    }

}
