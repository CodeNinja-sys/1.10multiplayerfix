/*
 * Decompiled with CFR 0.150.
 */
public class xe
extends bjv {
    public xe(iu iu2) {
        super(iu2);
    }

    public xe(iu iu2, bga bga2) {
        super(iu2, bga2);
    }

    public xe(iu iu2, double d2, double d3, double d4) {
        super(iu2, d2, d3, d4);
    }

    public static void a(cgy cgy2) {
        bjv.a(cgy2, "ThrownEgg");
    }

    @Override
    protected void a(auu auu2) {
        if (auu2.d != null) {
            auu2.d.a(ahy.a((cpk)this, (cpk)this.p()), 0.0f);
        }
        if (!this.aQ.C && this.bx.nextInt(8) == 0) {
            int n2 = 1;
            if (this.bx.nextInt(32) == 0) {
                n2 = 4;
            }
            for (int i2 = 0; i2 < n2; ++i2) {
                jp jp2 = new jp(this.aQ);
                jp2.j(-24000);
                jp2.a_(this.aU, this.aV, this.aW, this.ba, 0.0f);
                this.aQ.b(jp2);
            }
        }
        double d2 = 0.08;
        for (int i3 = 0; i3 < 8; ++i3) {
            this.aQ.a(lz.K, this.aU, this.aV, this.aW, ((double)this.bx.nextFloat() - 0.5) * 0.08, ((double)this.bx.nextFloat() - 0.5) * 0.08, ((double)this.bx.nextFloat() - 0.5) * 0.08, azg.a(hp.aW));
        }
        if (!this.aQ.C) {
            this.ak_();
        }
    }
}

