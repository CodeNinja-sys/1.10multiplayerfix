/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import org.apache.commons.c.ao;

public abstract class gj
extends cpk {
    private static final cm c = new deu();
    private int d;
    protected cmz a;
    public bqk b;

    public gj(iu iu2) {
        super(iu2);
        this.a_(0.5f, 0.5f);
    }

    public gj(iu iu2, cmz cmz2) {
        this(iu2);
        this.a = cmz2;
    }

    @Override
    protected void a() {
    }

    protected void a(bqk bqk2) {
        ao.a(bqk2);
        ao.a(bqk2.l().d());
        this.b = bqk2;
        this.bc = this.ba = (float)(this.b.c() * 90);
        this.f();
    }

    protected void f() {
        if (this.b == null) {
            return;
        }
        double d2 = (double)this.a.a() + 0.5;
        double d3 = (double)this.a.b() + 0.5;
        double d4 = (double)this.a.c() + 0.5;
        double d5 = 0.46875;
        double d6 = this.c(this.j());
        double d7 = this.c(this.k());
        d2 -= (double)this.b.h() * 0.46875;
        d4 -= (double)this.b.j() * 0.46875;
        bqk bqk2 = this.b.g();
        this.aU = d2 += d6 * (double)bqk2.h();
        this.aV = d3 += d7;
        this.aW = d4 += d6 * (double)bqk2.j();
        double d8 = this.j();
        double d9 = this.k();
        double d10 = this.j();
        if (this.b.l() == ctv.c) {
            d10 = 1.0;
        } else {
            d8 = 1.0;
        }
        this.a(new cxt(d2 - (d8 /= 32.0), d3 - (d9 /= 32.0), d4 - (d10 /= 32.0), d2 + d8, d3 + d9, d4 + d10));
    }

    private double c(int n2) {
        return n2 % 32 == 0 ? 0.5 : 0.0;
    }

    @Override
    public void bb_() {
        this.aR = this.aU;
        this.aS = this.aV;
        this.aT = this.aW;
        if (this.d++ == 100 && !this.aQ.C) {
            this.d = 0;
            if (!this.bk && !this.h()) {
                this.ak_();
                this.b((cpk)null);
            }
        }
    }

    public boolean h() {
        if (!this.aQ.a((cpk)this, this.cD()).isEmpty()) {
            return false;
        }
        int n2 = Math.max(1, this.j() / 16);
        int n3 = Math.max(1, this.k() / 16);
        cmz cmz2 = this.a.c(this.b.e());
        bqk bqk2 = this.b.g();
        pj pj2 = new pj();
        for (int i2 = 0; i2 < n2; ++i2) {
            for (int i3 = 0; i3 < n3; ++i3) {
                int n4 = (n2 - 1) / -2;
                int n5 = (n3 - 1) / -2;
                pj2.a(cmz2).a(bqk2, i2 + n4).a(bqk.b, i3 + n5);
                dbk dbk2 = this.aQ.n(pj2);
                if (dbk2.a().a() || vh.o(dbk2)) continue;
                return false;
            }
        }
        return this.aQ.a((cpk)this, this.cD(), c).isEmpty();
    }

    @Override
    public boolean bc_() {
        return true;
    }

    @Override
    public boolean d_(cpk cpk2) {
        if (cpk2 instanceof bdl) {
            return this.a(ahy.a((bdl)cpk2), 0.0f);
        }
        return false;
    }

    @Override
    public bqk B_() {
        return this.b;
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        if (this.c(ahy2)) {
            return false;
        }
        if (!this.bk && !this.aQ.C) {
            this.ak_();
            this.bz();
            this.b(ahy2.b());
        }
        return true;
    }

    @Override
    public void b(double d2, double d3, double d4) {
        if (!this.aQ.C && !this.bk && d2 * d2 + d3 * d3 + d4 * d4 > 0.0) {
            this.ak_();
            this.b((cpk)null);
        }
    }

    @Override
    public void c(double d2, double d3, double d4) {
        if (!this.aQ.C && !this.bk && d2 * d2 + d3 * d3 + d4 * d4 > 0.0) {
            this.ak_();
            this.b((cpk)null);
        }
    }

    @Override
    public void a(bvp bvp2) {
        bvp2.a("Facing", (byte)this.b.c());
        cmz cmz2 = this.p();
        bvp2.a("TileX", cmz2.a());
        bvp2.a("TileY", cmz2.b());
        bvp2.a("TileZ", cmz2.c());
    }

    @Override
    public void b(bvp bvp2) {
        this.a = new cmz(bvp2.h("TileX"), bvp2.h("TileY"), bvp2.h("TileZ"));
        this.a(bqk.b(bvp2.f("Facing")));
    }

    public abstract int j();

    public abstract int k();

    public abstract void b(cpk var1);

    public abstract void n();

    @Override
    public er a(bhl bhl2, float f2) {
        er er2 = new er(this.aQ, this.aU + (double)((float)this.b.h() * 0.15f), this.aV + (double)f2, this.aW + (double)((float)this.b.j() * 0.15f), bhl2);
        er2.l();
        this.aQ.b(er2);
        return er2;
    }

    @Override
    protected boolean x_() {
        return false;
    }

    @Override
    public void d(double d2, double d3, double d4) {
        this.a = new cmz(d2, d3, d4);
        this.f();
        this.bO = true;
    }

    public cmz p() {
        return this.a;
    }

    @Override
    public float a(ih ih2) {
        if (this.b != null && this.b.l() != ctv.b) {
            switch (ih2) {
                case c: {
                    this.b = this.b.e();
                    break;
                }
                case d: {
                    this.b = this.b.g();
                    break;
                }
                case b: {
                    this.b = this.b.f();
                    break;
                }
            }
        }
        float f2 = cmk.g(this.ba);
        switch (ih2) {
            case c: {
                return f2 + 180.0f;
            }
            case d: {
                return f2 + 90.0f;
            }
            case b: {
                return f2 + 270.0f;
            }
        }
        return f2;
    }

    @Override
    public float a(cdk cdk2) {
        return this.a(cdk2.a(this.b));
    }

    @Override
    public void a(tz tz2) {
    }
}

