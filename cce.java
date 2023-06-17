/*
 * Decompiled with CFR 0.150.
 */
public class cce
extends crm
implements cyt {
    private static final bcz a = bwm.a(cce.class, cbf.a);

    public cce(iu iu2) {
        super(iu2);
        this.a_(0.7f, 1.9f);
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "SnowMan");
    }

    @Override
    protected void n() {
        this.m.a(1, new amv(this, 1.25, 20, 10.0f));
        this.m.a(2, new vq(this, 1.0));
        this.m.a(3, new chx(this, bdl.class, 6.0f));
        this.m.a(4, new bzv(this));
        this.n.a(1, new cyx(this, xy.class, 10, true, false, cso.a_));
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.a).a(4.0);
        this.a(cgz.d).a(0.2f);
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(a, (byte)0);
    }

    @Override
    public void Q_() {
        super.Q_();
        if (!this.aQ.C) {
            int n2 = cmk.c(this.aU);
            int n3 = cmk.c(this.aV);
            int n4 = cmk.c(this.aW);
            if (this.ch()) {
                this.a(ahy.g, 1.0f);
            }
            cmz cmz2 = new cmz(n2, 0, n4);
            cmz cmz3 = new cmz(n2, n3, n4);
            if (this.aQ.a(cmz2).c(cmz3) > 1.0f) {
                this.a(ahy.c, 1.0f);
            }
            if (!this.aQ.F().b("mobGriefing")) {
                return;
            }
            for (int i2 = 0; i2 < 4; ++i2) {
                n2 = cmk.c(this.aU + (double)((float)(i2 % 2 * 2 - 1) * 0.25f));
                cmz cmz4 = new cmz(n2, n3 = cmk.c(this.aV), n4 = cmk.c(this.aW + (double)((float)(i2 / 2 % 2 * 2 - 1) * 0.25f)));
                if (this.aQ.n(cmz4).a() != ahk.a) continue;
                cmz cmz5 = new cmz(n2, 0, n4);
                if (!(this.aQ.a(cmz5).c(cmz4) < 0.8f) || !blg.aH.a(this.aQ, cmz4)) continue;
                this.aQ.a(cmz4, blg.aH.s());
            }
        }
    }

    @Override
    protected bpx u() {
        return bvm.A;
    }

    @Override
    public void a(bga bga2, float f2) {
        bef bef2 = new bef(this.aQ, this);
        double d2 = bga2.aV + (double)bga2.A() - (double)1.1f;
        double d3 = bga2.aU - this.aU;
        double d4 = d2 - bef2.aV;
        double d5 = bga2.aW - this.aW;
        float f3 = cmk.a(d3 * d3 + d5 * d5) * 0.2f;
        bef2.a(d3, d4 + (double)f3, d5, 1.6f, 12.0f);
        this.a(dah.fW, 1.0f, 1.0f / (this.aW().nextFloat() * 0.4f + 0.8f));
        this.aQ.b(bef2);
    }

    @Override
    public float A() {
        return 1.7f;
    }

    @Override
    protected boolean a(bdl bdl2, bqp bqp2, bhl bhl2) {
        if (bhl2 != null && bhl2.a() == hp.bl && !this.T() && !this.aQ.C) {
            this.d(true);
            bhl2.a(1, (bga)bdl2);
        }
        return super.a(bdl2, bqp2, bhl2);
    }

    public boolean T() {
        return ((Byte)this.bE.a(a) & 0x10) != 0;
    }

    public void d(boolean bl2) {
        byte by2 = (Byte)this.bE.a(a);
        if (bl2) {
            this.bE.b(a, (byte)(by2 | 0x10));
        } else {
            this.bE.b(a, (byte)(by2 & 0xFFFFFFEF));
        }
    }

    @Override
    protected bi q() {
        return dah.fT;
    }

    @Override
    protected bi r() {
        return dah.fV;
    }

    @Override
    protected bi s() {
        return dah.fU;
    }
}

