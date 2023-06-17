/*
 * Decompiled with CFR 0.150.
 */
public class aji
extends ck {
    private final azy a;
    private final double b;
    private int c;
    private final float d;
    private int e = -1;
    private int f;
    private boolean g;
    private boolean h;
    private int i = -1;

    public aji(azy azy2, double d2, int n2, float f2) {
        this.a = azy2;
        this.b = d2;
        this.c = n2;
        this.d = f2 * f2;
        this.a(3);
    }

    public void b(int n2) {
        this.c = n2;
    }

    @Override
    public boolean b() {
        if (this.a.ar() == null) {
            return false;
        }
        return this.f();
    }

    protected boolean f() {
        return this.a.bt() != null && this.a.bt().a() == hp.f;
    }

    @Override
    public boolean a() {
        return (this.b() || !this.a.ap().m()) && this.f();
    }

    @Override
    public void c() {
        super.c();
        this.a.a(true);
    }

    @Override
    public void d() {
        super.d();
        this.a.a(false);
        this.f = 0;
        this.e = -1;
        this.a.ai_();
    }

    @Override
    public void e() {
        boolean bl2;
        bga bga2 = this.a.ar();
        if (bga2 == null) {
            return;
        }
        double d2 = this.a.i(bga2.aU, bga2.cD().b, bga2.aW);
        boolean bl3 = this.a.aq().a(bga2);
        boolean bl4 = bl2 = this.f > 0;
        if (bl3 != bl2) {
            this.f = 0;
        }
        this.f = bl3 ? ++this.f : --this.f;
        if (d2 > (double)this.d || this.f < 20) {
            this.a.ap().a(bga2, this.b);
            this.i = -1;
        } else {
            this.a.ap().n();
            ++this.i;
        }
        if (this.i >= 20) {
            if ((double)this.a.aW().nextFloat() < 0.3) {
                boolean bl5 = this.g = !this.g;
            }
            if ((double)this.a.aW().nextFloat() < 0.3) {
                this.h = !this.h;
            }
            this.i = 0;
        }
        if (this.i > -1) {
            if (d2 > (double)(this.d * 0.75f)) {
                this.h = false;
            } else if (d2 < (double)(this.d * 0.25f)) {
                this.h = true;
            }
            this.a.an().a(this.h ? -0.5f : 0.5f, this.g ? 0.5f : -0.5f);
            this.a.a(bga2, 30.0f, 30.0f);
        } else {
            this.a.am().a(bga2, 30.0f, 30.0f);
        }
        if (this.a.ag_()) {
            int n2;
            if (!bl3 && this.f < -60) {
                this.a.ai_();
            } else if (bl3 && (n2 = this.a.bI()) >= 20) {
                this.a.ai_();
                this.a.a(bga2, azd.b(n2));
                this.e = this.c;
            }
        } else if (--this.e <= 0 && this.f >= -60) {
            this.a.b(bqp.a);
        }
    }
}

