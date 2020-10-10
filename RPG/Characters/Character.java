package RPG.Characters;

import RPG.Commands.*;

public abstract class Character {
    protected int _level;
    protected int _hitPoints;
    protected int _magicPoints;
    protected int _experiencePoints;
    protected int _nextLevel;
    protected int _attackPower;
    protected int _defensePower;

    protected Character(int hitPoints, int magicPoints, int attackPower, int defensePower) {
        this._hitPoints = hitPoints;
        this._magicPoints = magicPoints;
        this._attackPower = attackPower;
        this._defensePower = defensePower;
    }

    public void Command(Command cmd) {
        var cls = cmd.getClass();
        var name = cls.getSimpleName();
        System.out.println(name);
        this.ApplyCommandEffect(cmd);
    }

    private void ExecuteCommand(Command cmd) {
        
    }

    private void ApplyCommandEffect(Command cmd) {
        var ap = this._attackPower + cmd.getAPEffect();
        var dp = this._defensePower + cmd.getDPEffect();
        var hp = cmd.getHPEffect();
        var mp = cmd.getMPEffect();
        var xp = cmd.getXPEffect();
        this._hitPoints += (hp + ap + dp);
        this._magicPoints += mp;
        this._experiencePoints += xp;
    }

    private void PrintEffect() {
        System.out.println();
    }
}
