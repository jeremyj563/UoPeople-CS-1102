package RPG;

import RPG.Characters.*;

public class Main {
    public static void main(String[] args)  {
        var player1 = new Fighter();
        var state = new State(player1);
        var bolt = new RPG.Commands.BlackSpells.Bolt();
        player1.Command(bolt);
    }
}
