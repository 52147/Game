# Object-Oriented Design : Gorilla-Game

## Description
- Design a game that 2 player can operate gorilla to use the banana to attack each other.
- Each player blood initialze 10 blood.
- Player be attacked by banana loose one blood.
- Player that first become 0 blood loose.

## Requirement
- inheritence class
- overriding method : override parent class method in child class
- overloading method : same method different parameter
- setter/getter
- naming convetion


## Design
- This project contains six classes :
1. GorillaGame : GorillaGame class implement GorillaConsole interface.
2. GorillaConsole : GorillaConsole interface contains 5 functions that user can operate.
3. Player : Player class contains player attribute and get/set method.
4. Gorilla: Gorilla class extend the Player class and overriding the show() method in Player class, and overloading print() method.
5. Map: Maps class contains the attribute of map and building height and building width.
6. Main : Main class to execute the Game.  
