package RPG.Commands;

public abstract class Command {
    protected int _hpEffect;
    public int getHPEffect() { return this._hpEffect; }

    protected int _mpEffect;
    public int getMPEffect() { return this._mpEffect; }

    protected int _xpEffect;
    public int getXPEffect() { return this._xpEffect; }

    protected int _apEffect;
    public int getAPEffect() { return this._apEffect; }

    protected int _dpEffect;
    public int getDPEffect() { return this._dpEffect; }

    protected Command(int hpEffect, int mpEffect, int xpEffect, int apEffect, int dpEffect) {
        this._hpEffect = hpEffect;
        this._mpEffect = mpEffect;
        this._xpEffect = xpEffect;
        this._apEffect = apEffect;
        this._dpEffect = dpEffect;
    }
}
