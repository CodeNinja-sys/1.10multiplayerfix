/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.UUID;

public class byl
extends acm
implements cyt {
    private static final UUID a = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
    private static final cs b = new cs(a, "Drinking speed penalty", -0.25, 0).a(false);
    private static final bcz c = bwm.a(byl.class, cbf.h);
    private int d;

    public byl(iu iu2) {
        super(iu2);
        this.a_(0.6f, 1.95f);
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "Witch");
    }

    @Override
    protected void n() {
        this.m.a(1, new baf(this));
        this.m.a(2, new amv(this, 1.0, 60, 10.0f));
        this.m.a(2, new vq(this, 1.0));
        this.m.a(3, new chx(this, bdl.class, 8.0f));
        this.m.a(3, new bzv(this));
        this.n.a(1, new ahx((cfl)this, false, new Class[0]));
        this.n.a(2, new cyx((cfl)this, bdl.class, true));
    }

    @Override
    protected void a() {
        super.a();
        this.bY().a(c, false);
    }

    @Override
    protected bi q() {
        return dah.gP;
    }

    @Override
    protected bi r() {
        return dah.gS;
    }

    @Override
    protected bi s() {
        return dah.gQ;
    }

    public void d(boolean bl2) {
        this.bY().b(c, bl2);
    }

    public boolean T() {
        return (Boolean)this.bY().a(c);
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.a).a(26.0);
        this.a(cgz.d).a(0.25);
    }

    @Override
    public void Q_() {
        if (!this.aQ.C) {
            if (this.T()) {
                if (this.d-- <= 0) {
                    List list;
                    this.d(false);
                    bhl bhl2 = this.bt();
                    this.a(dfm.a, null);
                    if (bhl2 != null && bhl2.a() == hp.bG && (list = anl.a(bhl2)) != null) {
                        for (cko cko2 : list) {
                            this.b(new cko(cko2));
                        }
                    }
                    this.a(cgz.d).c(b);
                }
            } else {
                hy hy2 = null;
                if (this.bx.nextFloat() < 0.15f && this.a(ahk.h) && !this.b(ake.m)) {
                    hy2 = im.t;
                } else if (this.bx.nextFloat() < 0.15f && (this.y_() || this.bi() != null && this.bi().o()) && !this.b(ake.l)) {
                    hy2 = im.m;
                } else if (this.bx.nextFloat() < 0.05f && this.bh() < this.bo()) {
                    hy2 = im.v;
                } else if (this.bx.nextFloat() < 0.5f && this.ar() != null && !this.b(ake.a) && this.ar().l(this) > 121.0) {
                    hy2 = im.o;
                }
                if (hy2 != null) {
                    this.a(dfm.a, anl.a(new bhl(hp.bG), hy2));
                    this.d = this.bt().l();
                    this.d(true);
                    this.aQ.a(null, this.aU, this.aV, this.aW, dah.gR, this.y(), 1.0f, 0.8f + this.bx.nextFloat() * 0.4f);
                    cp cp2 = this.a(cgz.d);
                    cp2.c(b);
                    cp2.b(b);
                }
            }
            if (this.bx.nextFloat() < 7.5E-4f) {
                this.aQ.a((cpk)this, (byte)15);
            }
        }
        super.Q_();
    }

    @Override
    public void a(byte by2) {
        if (by2 == 15) {
            for (int i2 = 0; i2 < this.bx.nextInt(35) + 10; ++i2) {
                this.aQ.a(lz.r, this.aU + this.bx.nextGaussian() * (double)0.13f, this.cD().e + 0.5 + this.bx.nextGaussian() * (double)0.13f, this.aW + this.bx.nextGaussian() * (double)0.13f, 0.0, 0.0, 0.0, new int[0]);
            }
        } else {
            super.a(by2);
        }
    }

    @Override
    protected float d(ahy ahy2, float f2) {
        f2 = super.d(ahy2, f2);
        if (ahy2.b() == this) {
            f2 = 0.0f;
        }
        if (ahy2.s()) {
            f2 = (float)((double)f2 * 0.15);
        }
        return f2;
    }

    @Override
    protected bpx u() {
        return bvm.o;
    }

    @Override
    public void a(bga bga2, float f2) {
        if (this.T()) {
            return;
        }
        double d2 = bga2.aV + (double)bga2.A() - (double)1.1f;
        double d3 = bga2.aU + bga2.aX - this.aU;
        double d4 = d2 - this.aV;
        double d5 = bga2.aW + bga2.aZ - this.aW;
        float f3 = cmk.a(d3 * d3 + d5 * d5);
        hy hy2 = im.x;
        if (f3 >= 8.0f && !bga2.b(ake.b)) {
            hy2 = im.r;
        } else if (bga2.bh() >= 8.0f && !bga2.b(ake.s)) {
            hy2 = im.z;
        } else if (f3 <= 3.0f && !bga2.b(ake.r) && this.bx.nextFloat() < 0.25f) {
            hy2 = im.I;
        }
        tp tp2 = new tp(this.aQ, this, anl.a(new bhl(hp.bH), hy2));
        tp2.bb -= -20.0f;
        tp2.a(d3, d4 + (double)(f3 * 0.2f), d5, 0.75f, 8.0f);
        this.aQ.a(null, this.aU, this.aV, this.aW, dah.gT, this.y(), 1.0f, 0.8f + this.bx.nextFloat() * 0.4f);
        this.aQ.b(tp2);
    }

    @Override
    public float A() {
        return 1.62f;
    }
}

