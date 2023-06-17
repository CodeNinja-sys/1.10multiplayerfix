/*
 * Decompiled with CFR 0.150.
 */
public class cxa
extends bub {
    public cxa(iu iu2) {
        super(iu2);
    }

    public cxa(iu iu2, double d2, double d3, double d4) {
        super(iu2, d2, d3, d4);
    }

    public static void a(cgy cgy2) {
        bub.a(cgy2, "MinecartChest");
    }

    @Override
    public void a(ahy ahy2) {
        super.a(ahy2);
        if (this.aQ.F().b("doEntityDrops")) {
            this.a(azg.a(blg.ae), 1, 0.0f);
        }
    }

    @Override
    public int aI_() {
        return 27;
    }

    @Override
    public cta bd_() {
        return cta.b;
    }

    @Override
    public dbk be_() {
        return blg.ae.s().a(aqi.a, (Comparable)((Object)bqk.c));
    }

    @Override
    public int J() {
        return 8;
    }

    @Override
    public String n() {
        return "minecraft:chest";
    }

    @Override
    public apq a(cps cps2, bdl bdl2) {
        this.e(bdl2);
        return new cnx(cps2, this, bdl2);
    }
}

