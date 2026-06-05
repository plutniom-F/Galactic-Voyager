package com.galacticvoyager;

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MissionControl control = new MissionControl();
        
        System.out.println("Welcome to the Galactic Voyager Command Center");
        System.out.println("---------------------------------------------");

        // Setup a default ship and crew for simplicity in this demo
        SpaceShip odyssey = new SpaceShip("USS Odyssey", 1000.0);
        odyssey.addCrewMember(new CrewMember("Cmdr. Sarah Vance", "Pilot", 5));
        odyssey.addCrewMember(new CrewMember("Dr. Alan Grant", "Xeno-Biologist", 4));
        odyssey.addCrewMember(new CrewMember("Lt. Jim Beam", "Engineer", 3));

        boolean running = true;
        while (running) {
            System.out.println("\nMain Menu:");
            System.out.println("1. View Ship Status");
            System.out.println("2. Explore Known Planets");
            System.out.println("3. Launch Exploration Mission");
            System.out.println("4. Refuel Ship");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    odyssey.displayStatus();
                    break;
                case "2":
                    List<Planet> planets = control.getKnownPlanets();
                    System.out.println("\n--- Galactic Database ---");
                    for (int i = 0; i < planets.size(); i++) {
                        System.out.println((i + 1) + ". " + planets.get(i));
                    }
                    break;
                case "3":
                    System.out.println("Which planet do you want to visit?");
                    List<Planet> pList = control.getKnownPlanets();
                    for (int i = 0; i < pList.size(); i++) {
                        System.out.println((i + 1) + ". " + pList.get(i).getName());
                    }
                    try {
                        int planetIdx = Integer.parseInt(scanner.nextLine()) - 1;
                        if (planetIdx >= 0 && planetIdx < pList.size()) {
                            control.launchMission(odyssey, pList.get(planetIdx));
                        } else {
                            System.out.println("Invalid planet selection.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                    break;
                case "4":
                    odyssey.refuel();
                    System.out.println("Ship refueled to maximum capacity.");
                    break;
                case "5":
                    running = false;
                    System.out.println("Shutting down Command Center... Safe travels!");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        scanner.close();
    }
}
