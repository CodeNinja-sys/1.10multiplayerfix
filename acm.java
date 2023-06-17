/*
 * Decompiled with CFR 0.150.
 */
public abstract class acm
extends cfl
implements cso {
    public acm(iu iu2) {
        super(iu2);
        this.i = 5;
    }

    public static void c(cgy cgy2) {
        xy.a(cgy2, "Monster");
    }

    @Override
    public csg y() {
        return csg.f;
    }

    @Override
    public void Q_() {
        this.br();
        float f2 = this.a(1.0f);
        if (f2 > 0.5f) {
            this.ap += 2;
        }
        super.Q_();
    }

    @Override
    public void bb_() {
        super.bb_();
        if (!this.aQ.C && this.aQ.Q() == ct.a) {
            this.ak_();
        }
    }

    @Override
    protected bi am_() {
        return dah.cH;
    }

    @Override
    protected bi an_() {
        return dah.cG;
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        if (this.c(ahy2)) {
            return false;
        }
        return super.a(ahy2, f2);
    }

    @Override
    protected bi r() {
        return dah.cE;
    }

    @Override
    protected bi s() {
        return dah.cD;
    }

    @Override
    protected bi c_(int n2) {
        if (n2 > 4) {
            return dah.cC;
        }
        return dah.cF;
    }

    @Override
    public boolean a(cpk cpk2) {
        boolean bl2;
        float f2 = (float)this.a(cgz.e).e();
        int n2 = 0;
        if (cpk2 instanceof bga) {
            f2 += acz.a(this.bt(), ((bga)cpk2).ak());
            n2 += acz.a(this);
        }
        if (bl2 = cpk2.a(ahy.b(this), f2)) {
            int n3;
            if (n2 > 0 && cpk2 instanceof bga) {
                ((bga)cpk2).a(this, (float)n2 * 0.5f, (double)cmk.a(this.ba * ((float)Math.PI / 180)), (double)(-cmk.b(this.ba * ((float)Math.PI / 180))));
                this.aX *= 0.6;
                this.aZ *= 0.6;
            }
            if ((n3 = acz.b(this)) > 0) {
                cpk2.m(n3 * 4);
            }
            if (cpk2 instanceof bdl) {
                bhl bhl2;
                bdl bdl2 = (bdl)cpk2;
                bhl bhl3 = this.bt();
                bhl bhl4 = bhl2 = bdl2.ag_() ? bdl2.bG() : null;
                if (bhl3 != null && bhl2 != null && bhl3.a() instanceof bap && bhl2.a() == hp.cQ) {
                    float f3 = 0.25f + (float)acz.e(this) * 0.05f;
                    if (this.bx.nextFloat() < f3) {
                        bdl2.aS().a(hp.cQ, 100);
                        this.aQ.a((cpk)bdl2, (byte)30);
                    }
                }
            }
            this.a(this, cpk2);
        }
        return bl2;
    }

    @Override
    public float a(cmz cmz2) {
        return 0.5f - this.aQ.m(cmz2);
    }

    protected boolean aC_() {
        cmz cmz2 = new cmz(this.aU, this.cD().b, this.aW);
        if (this.aQ.b(bzq.a, cmz2) > this.bx.nextInt(32)) {
            return false;
        }
        int n2 = this.aQ.j(cmz2);
        if (this.aQ.H()) {
            int n3 = this.aQ.R();
            this.aQ.c(10);
            n2 = this.aQ.j(cmz2);
            this.aQ.c(n3);
        }
        return n2 <= this.bx.nextInt(8);
    }

    @Override
    public boolean h() {
        return this.aQ.Q() != ct.a && this.aC_() && super.h();
    }

    @Override
    protected void p() {
        super.p();
        this.bs().b(cgz.e);
    }

    @Override
    protected boolean ab_() {
        return true;
    }
}

