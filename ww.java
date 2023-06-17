/*
 * Decompiled with CFR 0.150.
 */
public class ww
extends cef {
    private static final bcz c = bwm.a(ww.class, cbf.h);
    private int d;
    public double a;
    public double b;

    public ww(iu iu2) {
        super(iu2);
    }

    public ww(iu iu2, double d2, double d3, double d4) {
        super(iu2, d2, d3, d4);
    }

    public static void a(cgy cgy2) {
        cef.b(cgy2, "MinecartFurnace");
    }

    @Override
    public cta bd_() {
        return cta.c;
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(c, false);
    }

    @Override
    public void bb_() {
        super.bb_();
        if (this.d > 0) {
            --this.d;
        }
        if (this.d <= 0) {
            this.a = 0.0;
            this.b = 0.0;
        }
        this.a(this.d > 0);
        if (this.p() && this.bx.nextInt(4) == 0) {
            this.aQ.a(lz.m, this.aU, this.aV + 0.8, this.aW, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    protected double aw_() {
        return 0.2;
    }

    @Override
    public void a(ahy ahy2) {
        super.a(ahy2);
        if (!ahy2.e() && this.aQ.F().b("doEntityDrops")) {
            this.a(new bhl(blg.al, 1), 0.0f);
        }
    }

    @Override
    protected void a(cmz cmz2, dbk dbk2) {
        super.a(cmz2, dbk2);
        double d2 = this.a * this.a + this.b * this.b;
        if (d2 > 1.0E-4 && this.aX * this.aX + this.aZ * this.aZ > 0.001) {
            d2 = cmk.a(d2);
            this.a /= d2;
            this.b /= d2;
            if (this.a * this.aX + this.b * this.aZ < 0.0) {
                this.a = 0.0;
                this.b = 0.0;
            } else {
                double d3 = d2 / this.aw_();
                this.a *= d3;
                this.b *= d3;
            }
        }
    }

    @Override
    protected void ax_() {
        double d2 = this.a * this.a + this.b * this.b;
        if (d2 > 1.0E-4) {
            d2 = cmk.a(d2);
            this.a /= d2;
            this.b /= d2;
            double d3 = 1.0;
            this.aX *= (double)0.8f;
            this.aY *= 0.0;
            this.aZ *= (double)0.8f;
            this.aX += this.a * 1.0;
            this.aZ += this.b * 1.0;
        } else {
            this.aX *= (double)0.98f;
            this.aY *= 0.0;
            this.aZ *= (double)0.98f;
        }
        super.ax_();
    }

    @Override
    public boolean a(bdl bdl2, bhl bhl2, bqp bqp2) {
        if (bhl2 != null && bhl2.a() == hp.j && this.d + 3600 <= 32000) {
            if (!bdl2.G.d) {
                --bhl2.b;
            }
            this.d += 3600;
        }
        this.a = this.aU - bdl2.aU;
        this.b = this.aW - bdl2.aW;
        return true;
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("PushX", this.a);
        bvp2.a("PushZ", this.b);
        bvp2.a("Fuel", (short)this.d);
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.a = bvp2.k("PushX");
        this.b = bvp2.k("PushZ");
        this.d = bvp2.g("Fuel");
    }

    protected boolean p() {
        return (Boolean)this.bE.a(c);
    }

    protected void a(boolean bl2) {
        this.bE.b(c, bl2);
    }

    @Override
    public dbk be_() {
        return (this.p() ? blg.am : blg.al).s().a(aer.a, (Comparable)((Object)bqk.c));
    }
}

