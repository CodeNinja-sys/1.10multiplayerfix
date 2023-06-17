/*
 * Decompiled with CFR 0.150.
 */
public class dco
implements ciq {
    private final iu a;
    private final cmz b;

    public dco(iu iu2, cmz cmz2) {
        this.a = iu2;
        this.b = cmz2;
    }

    @Override
    public String i_() {
        return null;
    }

    @Override
    public boolean j_() {
        return false;
    }

    @Override
    public cbg v() {
        return new du(blg.ai.n() + ".name", new Object[0]);
    }

    @Override
    public apq a(cps cps2, bdl bdl2) {
        return new fd(cps2, this.a, this.b);
    }

    @Override
    public String n() {
        return "minecraft:crafting_table";
    }
}

