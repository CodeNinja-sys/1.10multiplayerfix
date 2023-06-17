/*
 * Decompiled with CFR 0.150.
 */
public abstract class dct {
    protected xy a;
    protected iu b;
    protected dbn c;
    protected double d;
    private final cp f;
    private int g;
    private int h;
    private amj i = amj.a;
    private amj j = amj.a;
    private long k;
    private long l;
    private double m;
    private float n = 0.5f;
    private boolean o;
    private long p;
    protected um e;
    private cmz q;
    private final cpn r;

    public dct(xy xy2, iu iu2) {
        this.a = xy2;
        this.b = iu2;
        this.f = xy2.a(cgz.b);
        this.r = this.a();
    }

    protected abstract cpn a();

    public void a(double d2) {
        this.d = d2;
    }

    public float i() {
        return (float)this.f.e();
    }

    public boolean j() {
        return this.o;
    }

    public void k() {
        if (this.b.z() - this.p > 20L) {
            if (this.q != null) {
                this.c = null;
                this.c = this.b(this.q);
                this.p = this.b.z();
                this.o = false;
            }
        } else {
            this.o = true;
        }
    }

    public final dbn a(double d2, double d3, double d4) {
        return this.b(new cmz(d2, d3, d4));
    }

    public dbn b(cmz cmz2) {
        if (!this.b()) {
            return null;
        }
        if (this.c != null && !this.c.b() && cmz2.equals(this.q)) {
            return this.c;
        }
        this.q = cmz2;
        float f2 = this.i();
        this.b.A.a("pathfind");
        cmz cmz3 = new cmz(this.a);
        int n2 = (int)(f2 + 8.0f);
        dek dek2 = new dek(this.b, cmz3.e(-n2, -n2, -n2), cmz3.e(n2, n2, n2), 0);
        dbn dbn2 = this.r.a((bnj)dek2, this.a, this.q, f2);
        this.b.A.b();
        return dbn2;
    }

    public dbn a(cpk cpk2) {
        if (!this.b()) {
            return null;
        }
        cmz cmz2 = new cmz(cpk2);
        if (this.c != null && !this.c.b() && cmz2.equals(this.q)) {
            return this.c;
        }
        this.q = cmz2;
        float f2 = this.i();
        this.b.A.a("pathfind");
        cmz cmz3 = new cmz(this.a).g();
        int n2 = (int)(f2 + 16.0f);
        dek dek2 = new dek(this.b, cmz3.e(-n2, -n2, -n2), cmz3.e(n2, n2, n2), 0);
        dbn dbn2 = this.r.a((bnj)dek2, this.a, cpk2, f2);
        this.b.A.b();
        return dbn2;
    }

    public boolean a(double d2, double d3, double d4, double d5) {
        return this.a(this.a(d2, d3, d4), d5);
    }

    public boolean a(cpk cpk2, double d2) {
        dbn dbn2 = this.a(cpk2);
        return dbn2 != null && this.a(dbn2, d2);
    }

    public boolean a(dbn dbn2, double d2) {
        if (dbn2 == null) {
            this.c = null;
            return false;
        }
        if (!dbn2.a(this.c)) {
            this.c = dbn2;
        }
        this.e();
        if (this.c.d() == 0) {
            return false;
        }
        this.d = d2;
        amj amj2 = this.c();
        this.h = this.g;
        this.i = amj2;
        return true;
    }

    public dbn l() {
        return this.c;
    }

    public void h() {
        Object object;
        amj amj2;
        ++this.g;
        if (this.o) {
            this.k();
        }
        if (this.m()) {
            return;
        }
        if (this.b()) {
            this.d();
        } else if (this.c != null && this.c.e() < this.c.d()) {
            amj2 = this.c();
            object = this.c.a(this.a, this.c.e());
            if (amj2.c > ((amj)object).c && !this.a.be && cmk.c(amj2.b) == cmk.c(((amj)object).b) && cmk.c(amj2.d) == cmk.c(((amj)object).d)) {
                this.c.c(this.c.e() + 1);
            }
        }
        if (this.m()) {
            return;
        }
        amj2 = this.c.a(this.a);
        if (amj2 == null) {
            return;
        }
        object = new cmz(amj2).h();
        cxt cxt2 = this.b.n((cmz)object).c((bnj)this.b, (cmz)object);
        amj2 = amj2.a(0.0, 1.0 - cxt2.e, 0.0);
        this.a.an().a(amj2.b, amj2.c, amj2.d, this.d);
    }

    protected void d() {
        amj amj2 = this.c();
        int n2 = this.c.d();
        for (int i2 = this.c.e(); i2 < this.c.d(); ++i2) {
            if ((double)this.c.a((int)i2).b == Math.floor(amj2.c)) continue;
            n2 = i2;
            break;
        }
        this.n = this.a.bl > 0.75f ? this.a.bl / 2.0f : 0.75f - this.a.bl / 2.0f;
        amj amj3 = this.c.f();
        if (cmk.e((float)(this.a.aU - (amj3.b + 0.5))) < this.n && cmk.e((float)(this.a.aW - (amj3.d + 0.5))) < this.n && Math.abs(this.a.aV - amj3.c) < 1.0) {
            this.c.c(this.c.e() + 1);
        }
        int n3 = cmk.f(this.a.bl);
        int n4 = cmk.f(this.a.bm);
        int n5 = n3;
        for (int i3 = n2 - 1; i3 >= this.c.e(); --i3) {
            if (!this.a(amj2, this.c.a(this.a, i3), n3, n4, n5)) continue;
            this.c.c(i3);
            break;
        }
        this.a(amj2);
    }

    protected void a(amj amj2) {
        if (this.g - this.h > 100) {
            if (amj2.g(this.i) < 2.25) {
                this.n();
            }
            this.h = this.g;
            this.i = amj2;
        }
        if (this.c != null && !this.c.b()) {
            amj amj3 = this.c.f();
            if (amj3.equals(this.j)) {
                this.k += System.currentTimeMillis() - this.l;
            } else {
                this.j = amj3;
                double d2 = amj2.f(this.j);
                double d3 = this.m = this.a.G_() > 0.0f ? d2 / (double)this.a.G_() * 1000.0 : 0.0;
            }
            if (this.m > 0.0 && (double)this.k > this.m * 3.0) {
                this.j = amj.a;
                this.k = 0L;
                this.m = 0.0;
                this.n();
            }
            this.l = System.currentTimeMillis();
        }
    }

    public boolean m() {
        return this.c == null || this.c.b();
    }

    public void n() {
        this.c = null;
    }

    protected abstract amj c();

    protected abstract boolean b();

    protected boolean o() {
        return this.a.V_() || this.a.cj();
    }

    protected void e() {
    }

    protected abstract boolean a(amj var1, amj var2, int var3, int var4, int var5);

    public boolean a(cmz cmz2) {
        return this.b.n(cmz2.h()).b();
    }

    public um p() {
        return this.e;
    }
}

