package RPG.Encounters;

import RPG.Characters.Fighter;
import RPG.Enemies.Skeleton;
import RPG.Locations.Cave;

public class Normal extends Encounter {

	public Normal(Cave cave, Fighter fighter, Skeleton skeleton) {
        super(cave, fighter, skeleton);
	}
    
}
