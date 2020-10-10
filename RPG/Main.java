package RPG;

import RPG.Characters.*;
import RPG.Encounters.*;
import RPG.Enemies.*;
import RPG.Locations.*;

public class Main {
    public static void main(String[] args)  {
        var fighter = new Fighter();
        var cave = new Cave();
        var skeleton = new Skeleton();
        var normalEncounter = new RPG.Encounters.Normal(cave, fighter, skeleton);
        


        var bolt = new RPG.Commands.BlackSpells.Bolt();
        fighter.Command(bolt);
    }
}
