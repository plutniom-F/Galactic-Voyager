package com.galacticvoyager;

public class CrewMember {
    private final String name;
    private final String role;
    private int experienceLevel; // 1 to 5

    public CrewMember(String name, String role, int experienceLevel) {
        this.name = name;
        this.role = role;
        this.experienceLevel = experienceLevel;
    }

    public String getName() { return name; }
    public String getRole() { return role; }
    public int getExperienceLevel() { return experienceLevel; }

    @Override
    public String toString() {
        return name + " (" + role + ") - Exp: " + experienceLevel;
    }
}
