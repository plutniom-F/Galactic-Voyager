package com.galacticvoyager;

import java.util.ArrayList;
import java.util.List;

public class SpaceShip {
    private final String shipName;
    private double fuelLevel;
    private final double maxFuel;
    private final List<CrewMember> crew;

    public SpaceShip(String shipName, double maxFuel) {
        this.shipName = shipName;
        this.maxFuel = maxFuel;
        this.fuelLevel = maxFuel;
        this.crew = new ArrayList<>();
    }

    public void addCrewMember(CrewMember member) {
        crew.add(member);
    }

    public boolean consumeFuel(double amount) {
        if (fuelLevel >= amount) {
            fuelLevel -= amount;
            return true;
        }
        return false;
    }

    public void refuel() {
        this.fuelLevel = maxFuel;
    }

    public String getShipName() { return shipName; }
    public double getFuelLevel() { return fuelLevel; }
    public List<CrewMember> getCrew() { return crew; }

    public void displayStatus() {
        System.out.println("--- Ship Status: " + shipName + " ---");
        System.out.printf("Fuel: %.1f / %.1f\n", fuelLevel, maxFuel);
        System.out.println("Crew size: " + crew.size());
        for (CrewMember m : crew) {
            System.out.println(" - " + m);
        }
    }
}
