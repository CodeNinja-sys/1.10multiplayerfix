/*
 * Decompiled with CFR 0.150.
 */
public class bwj
implements ciq {
    private final iu a;
    private final cmz b;

    public bwj(iu iu2, cmz cmz2) {
        this.a = iu2;
        this.b = cmz2;
    }

    @Override
    public String i_() {
        return "anvil";
    }

    @Override
    public boolean j_() {
        return false;
    }

    @Override
    public cbg v() {
        return new du(blg.cf.n() + ".name", new Object[0]);
    }

    @Override
    public apq a(cps cps2, bdl bdl2) {
        return new li(cps2, this.a, this.b, bdl2);
    }

    @Override
    public String n() {
        return "minecraft:anvil";
    }
}

