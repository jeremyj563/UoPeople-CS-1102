package RPG.Characters;

import java.util.Arrays;
import java.util.List;

import RPG.Commands.*;

public abstract class Character {
    protected int _level;
    public void setLevel(int level) { this._level = level; }

    protected int _hitPoints;
    public void setHitPoints(int hitPoints) { this._hitPoints = hitPoints; }

    protected int _magicPoints;
    public void setMagicPoints(int magicPoints) { this._magicPoints = magicPoints; }

    protected int _experiencePoints;
    public void setExperiencePoints(int experiencePoints) { this._experiencePoints = experiencePoints; }

    protected int _nextLevel;
    public void setNextLevel(int nextLevel) { this._nextLevel = nextLevel; }

    protected int _attackPower;
    public void setAttackPower(int attackPower) { this._attackPower = attackPower; }

    protected int _defensePower;
    public void setDefensePower(int defensePower) { this._defensePower = defensePower; }

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
        System.out.println(cmd.getHPEffect());
    }

    private void ApplyCommandEffect(Command cmd) {
        this._attackPower += cmd.getAPEffect();
    }
}
