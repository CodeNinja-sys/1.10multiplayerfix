/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class ahe
extends gj {
    public ahe(iu iu2) {
        super(iu2);
    }

    public ahe(iu iu2, cmz cmz2) {
        super(iu2, cmz2);
        this.d((double)cmz2.a() + 0.5, (double)cmz2.b() + 0.5, (double)cmz2.c() + 0.5);
        float f2 = 0.125f;
        float f3 = 0.1875f;
        float f4 = 0.25f;
        this.a(new cxt(this.aU - 0.1875, this.aV - 0.25 + 0.125, this.aW - 0.1875, this.aU + 0.1875, this.aV + 0.25 + 0.125, this.aW + 0.1875));
    }

    @Override
    public void d(double d2, double d3, double d4) {
        super.d((double)cmk.c(d2) + 0.5, (double)cmk.c(d3) + 0.5, (double)cmk.c(d4) + 0.5);
    }

    @Override
    protected void f() {
        this.aU = (double)this.a.a() + 0.5;
        this.aV = (double)this.a.b() + 0.5;
        this.aW = (double)this.a.c() + 0.5;
    }

    @Override
    public void a(bqk bqk2) {
    }

    @Override
    public int j() {
        return 9;
    }

    @Override
    public int k() {
        return 9;
    }

    @Override
    public float A() {
        return -0.0625f;
    }

    @Override
    public boolean a(double d2) {
        return d2 < 1024.0;
    }

    @Override
    public void b(cpk cpk2) {
        this.a(dah.dj, 1.0f, 1.0f);
    }

    @Override
    public boolean c(bvp bvp2) {
        return false;
    }

    @Override
    public void a(bvp bvp2) {
    }

    @Override
    public void b(bvp bvp2) {
    }

    @Override
    public boolean a(bdl bdl2, bhl bhl2, bqp bqp2) {
        List list;
        double d2;
        if (this.aQ.C) {
            return true;
        }
        boolean bl2 = false;
        if (bhl2 != null && bhl2.a() == hp.cx) {
            d2 = 7.0;
            list = this.aQ.a(xy.class, new cxt(this.aU - 7.0, this.aV - 7.0, this.aW - 7.0, this.aU + 7.0, this.aV + 7.0, this.aW + 7.0));
            for (xy xy2 : list) {
                if (!xy2.aG() || xy2.aH() != bdl2) continue;
                xy2.b((cpk)this, true);
                bl2 = true;
            }
        }
        if (!bl2) {
            this.ak_();
            if (bdl2.G.d) {
                d2 = 7.0;
                list = this.aQ.a(xy.class, new cxt(this.aU - 7.0, this.aV - 7.0, this.aW - 7.0, this.aU + 7.0, this.aV + 7.0, this.aW + 7.0));
                for (xy xy2 : list) {
                    if (!xy2.aG() || xy2.aH() != this) continue;
                    xy2.a(true, false);
                }
            }
        }
        return true;
    }

    @Override
    public boolean h() {
        return this.aQ.n(this.a).t() instanceof gd;
    }

    public static ahe a(iu iu2, cmz cmz2) {
        ahe ahe2 = new ahe(iu2, cmz2);
        ahe2.aP = true;
        iu2.b(ahe2);
        ahe2.n();
        return ahe2;
    }

    public static ahe b(iu iu2, cmz cmz2) {
        int n2 = cmz2.a();
        int n3 = cmz2.b();
        int n4 = cmz2.c();
        List list = iu2.a(ahe.class, new cxt((double)n2 - 1.0, (double)n3 - 1.0, (double)n4 - 1.0, (double)n2 + 1.0, (double)n3 + 1.0, (double)n4 + 1.0));
        for (ahe ahe2 : list) {
            if (!ahe2.p().equals(cmz2)) continue;
            return ahe2;
        }
        return null;
    }

    @Override
    public void n() {
        this.a(dah.dk, 1.0f, 1.0f);
    }
}

