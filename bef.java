/*
 * Decompiled with CFR 0.150.
 */
public class bef
extends bjv {
    public bef(iu iu2) {
        super(iu2);
    }

    public bef(iu iu2, bga bga2) {
        super(iu2, bga2);
    }

    public bef(iu iu2, double d2, double d3, double d4) {
        super(iu2, d2, d3, d4);
    }

    public static void a(cgy cgy2) {
        bjv.a(cgy2, "Snowball");
    }

    @Override
    protected void a(auu auu2) {
        int n2;
        if (auu2.d != null) {
            n2 = 0;
            if (auu2.d instanceof abs) {
                n2 = 3;
            }
            auu2.d.a(ahy.a((cpk)this, (cpk)this.p()), (float)n2);
        }
        for (n2 = 0; n2 < 8; ++n2) {
            this.aQ.a(lz.F, this.aU, this.aV, this.aW, 0.0, 0.0, 0.0, new int[0]);
        }
        if (!this.aQ.C) {
            this.ak_();
        }
    }
}

