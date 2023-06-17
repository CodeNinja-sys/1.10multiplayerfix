/*
 * Decompiled with CFR 0.150.
 */
public class ddg
extends bjv {
    private bga d;

    public ddg(iu iu2) {
        super(iu2);
    }

    public ddg(iu iu2, bga bga2) {
        super(iu2, bga2);
        this.d = bga2;
    }

    public ddg(iu iu2, double d2, double d3, double d4) {
        super(iu2, d2, d3, d4);
    }

    public static void a(cgy cgy2) {
        bjv.a(cgy2, "ThrownEnderpearl");
    }

    @Override
    protected void a(auu auu2) {
        cmz cmz2;
        Object object;
        bga bga2 = this.p();
        if (auu2.d != null) {
            if (auu2.d == this.d) {
                return;
            }
            auu2.d.a(ahy.a((cpk)this, (cpk)bga2), 0.0f);
        }
        if (auu2.a == bmw.b && (object = this.aQ.q(cmz2 = auu2.a())) instanceof bii) {
            bii bii2 = (bii)object;
            if (bga2 != null) {
                bii2.a(bga2);
                this.ak_();
                return;
            }
            bii2.a(this);
            return;
        }
        for (int i2 = 0; i2 < 32; ++i2) {
            this.aQ.a(lz.y, this.aU, this.aV + this.bx.nextDouble() * 2.0, this.aW, this.bx.nextGaussian(), 0.0, this.bx.nextGaussian(), new int[0]);
        }
        if (!this.aQ.C) {
            if (bga2 instanceof czt) {
                czt czt2 = (czt)bga2;
                if (czt2.a.b().e() && czt2.aQ == this.aQ && !czt2.H_()) {
                    if (this.bx.nextFloat() < 0.05f && this.aQ.F().b("doMobSpawning")) {
                        object = new cjo(this.aQ);
                        ((cjo)object).d(true);
                        ((cpk)object).a_(bga2.aU, bga2.aV, bga2.aW, bga2.ba, bga2.bb);
                        this.aQ.b((cpk)object);
                    }
                    if (bga2.cp()) {
                        bga2.s_();
                    }
                    bga2.l(this.aU, this.aV, this.aW);
                    bga2.bq = 0.0f;
                    bga2.a(ahy.j, 5.0f);
                }
            } else if (bga2 != null) {
                bga2.l(this.aU, this.aV, this.aW);
                bga2.bq = 0.0f;
            }
            this.ak_();
        }
    }

    @Override
    public void bb_() {
        bga bga2 = this.p();
        if (bga2 != null && bga2 instanceof bdl && !bga2.bj()) {
            this.ak_();
        } else {
            super.bb_();
        }
    }
}

