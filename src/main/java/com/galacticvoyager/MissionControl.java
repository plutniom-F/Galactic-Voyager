package com.galacticvoyager;

import java.util.*;

public class MissionControl {
    private final List<Planet> knownPlanets;
    private final Random random = new Random();

    public MissionControl() {
        knownPlanets = new ArrayList<>();
        initializeGalaxy();
    }

    private void initializeGalaxy() {
        knownPlanets.add(new Planet("Proxima Centauri b", 4.2, true, "Water"));
        knownPlanets.add(new Planet("TRAPPIST-1e", 39.6, true, "Silicates"));
        knownPlanets.add(new Planet("Kepler-186f", 582.0, true, "Iron"));
        knownPlanets.add(new Planet("Gliese 581g", 20.3, false, "Plasma Crystals"));
        knownPlanets.add(new Planet("HD 40307 g", 42.0, false, "Unknown Gas"));
    }

    public List<Planet> getKnownPlanets() {
        return knownPlanets;
    }

    public boolean launchMission(SpaceShip ship, Planet target) {
        System.out.println("Launching mission to " + target.getName() + "...");
        
        // Simple logic: fuel cost is proportional to distance (simplified for simulation)
        double fuelNeeded = target.getDistanceToSun() * 10; 
        
        if (ship.consumeFuel(fuelNeeded)) {
            System.out.println("Mission successful! We have reached " + target.getName());
            if (target.isHabitable()) {
                System.out.println("Great news: The planet is habitable!");
            } else {
                System.out.println("Warning: Planet is hostile to human life.");
            }
            System.out.println("Resource discovered: " + target.getPrimaryResource());
            return true;
        } else {
            System.out.println("Mission failed: Insufficient fuel for the journey!");
            return false;
        }
    }
}
