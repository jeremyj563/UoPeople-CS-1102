package RPG.Encounters;

import java.time.Instant;

import RPG.Characters.Character;
import RPG.Enemies.*;
import RPG.Locations.*;

public abstract class Encounter {
    private Location _location;
    public Location getLocation() { return this._location; }

    private Character _character;
    public Character getCharacter() { return this._character; }

    private Enemy _enemy;
    public Enemy getEnemy() { return this._enemy; }

    private Instant _startTime;
    private Instant _stopTime;

    public Encounter(Location location, Character character, Enemy enemy) {
        this._location = location;
        this._character = character;
        this._enemy = enemy;
    }

    public void start() {
        this._startTime = Instant.now();
    }

    public void stop() {
        this._stopTime = Instant.now();
    }
}
