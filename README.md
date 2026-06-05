# Galactic Voyager ??

A lightweight Java simulation of deep space exploration. This project allows you to manage a spacecraft, assemble a crew, and venture out into the unknown to discover new planets and resources.

## Features
- **Crew Management**: Assign roles and track experience levels of your crew members.
- **Galaxy Mapping**: Explore a database of known exoplanets with varying habitability and resources.
- **Mission Logic**: Travel requires fuel based on the distance to the target planet.
- **Resource Discovery**: Identify what materials are available on visited worlds.

## Getting Started

### Prerequisites
- Java 17 or higher
- Maven (optional, but recommended for building)

### Running the project
If you have Maven installed:
```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.galacticvoyager.Main"
```

Alternatively, you can just open the `src` folder in your favorite IDE (IntelliJ, Eclipse, VS Code) and run `Main.java`.

## How it Works
The project follows a simple object-oriented design:
- `Planet`: Stores astronomical data about celestial bodies.
- `SpaceShip`: Handles fuel consumption and crew logistics.
- `MissionControl`: Manages the fleet's interactions with the galaxy.
- `CrewMember`: Defines the personnel on board.

## Future Improvements (To-Do)
I'm planning to add a few things later:
- [ ] Add random encounter events during travel (asteroid fields, alien contact).
- [ ] Implement a cargo system to bring resources back to Earth.
- [ ] Create a save/load system using JSON files.
- [ ] Expand the planetary database via an external API.

## License
MIT License - feel free to use and modify as you wish!
