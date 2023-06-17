/*
 * Decompiled with CFR 0.150.
 */
public class cyk
extends chw {
    public int e = 1;

    public cyk(iu iu2) {
        super(iu2);
    }

    public cyk(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(iu2, d2, d3, d4, d5, d6, d7);
    }

    public cyk(iu iu2, bga bga2, double d2, double d3, double d4) {
        super(iu2, bga2, d2, d3, d4);
    }

    @Override
    protected void a(auu auu2) {
        if (!this.aQ.C) {
            if (auu2.d != null) {
                auu2.d.a(ahy.a(this, (cpk)this.a), 6.0f);
                this.a(this.a, auu2.d);
            }
            boolean bl2 = this.aQ.F().b("mobGriefing");
            this.aQ.a(null, this.aU, this.aV, this.aW, (float)this.e, bl2, bl2);
            this.ak_();
        }
    }

    public static void a(cgy cgy2) {
        chw.a(cgy2, "Fireball");
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("ExplosionPower", this.e);
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        if (bvp2.b("ExplosionPower", 99)) {
            this.e = bvp2.h("ExplosionPower");
        }
    }
}

