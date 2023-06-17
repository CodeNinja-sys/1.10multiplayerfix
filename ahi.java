/*
 * Decompiled with CFR 0.150.
 */
public class ahi
extends dad {
    protected ahi(bkl bkl2, mo mo2, dfm ... arrdfm) {
        super(bkl2, mo2, arrdfm);
        if (mo2 == mo.h) {
            this.b("lootBonusDigger");
        } else if (mo2 == mo.i) {
            this.b("lootBonusFishing");
        } else {
            this.b("lootBonus");
        }
    }

    @Override
    public int a(int n2) {
        return 15 + (n2 - 1) * 9;
    }

    @Override
    public int b(int n2) {
        return super.a(n2) + 50;
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public boolean a(dad dad2) {
        return super.a(dad2) && dad2 != bbh.r;
    }
}

