package com.galacticvoyager;

public class Planet {
    private final String name;
    private final double distanceToSun; // in AU
    private final boolean isHabitable;
    private final String primaryResource;

    public Planet(String name, double distanceToSun, boolean isHabitable, String primaryResource) {
        this.name = name;
        this.distanceToSun = distanceToSun;
        this.isHabitable = isHabitable;
        this.primaryResource = primaryResource;
    }

    public String getName() { return name; }
    public double getDistanceToSun() { return distanceToSun; }
    public boolean isHabitable() { return isHabitable; }
    public String getPrimaryResource() { return primaryResource; }

    @Override
    public String toString() {
        return String.format("%s [Dist: %.2f AU, Habitable: %b, Resource: %s]", 
            name, distanceToSun, isHabitable, primaryResource);
    }
}
