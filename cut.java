/*
 * Decompiled with CFR 0.150.
 */
public abstract class cut
extends ck {
    protected xy c;
    protected cmz d = cmz.e;
    protected xt e;
    boolean f;
    float g;
    float h;

    public cut(xy xy2) {
        this.c = xy2;
        if (!(xy2.ap() instanceof vp)) {
            throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
        }
    }

    @Override
    public boolean b() {
        if (!this.c.bf) {
            return false;
        }
        vp vp2 = (vp)this.c.ap();
        dbn dbn2 = vp2.l();
        if (dbn2 == null || dbn2.b() || !vp2.f()) {
            return false;
        }
        for (int i2 = 0; i2 < Math.min(dbn2.e() + 2, dbn2.d()); ++i2) {
            aqn aqn2 = dbn2.a(i2);
            this.d = new cmz(aqn2.a, aqn2.b + 1, aqn2.c);
            if (this.c.i(this.d.a(), this.c.aV, this.d.c()) > 2.25) continue;
            this.e = this.a(this.d);
            if (this.e == null) continue;
            return true;
        }
        this.d = new cmz(this.c).g();
        this.e = this.a(this.d);
        return this.e != null;
    }

    @Override
    public boolean a() {
        return !this.f;
    }

    @Override
    public void c() {
        this.f = false;
        this.g = (float)((double)((float)this.d.a() + 0.5f) - this.c.aU);
        this.h = (float)((double)((float)this.d.c() + 0.5f) - this.c.aW);
    }

    @Override
    public void e() {
        float f2;
        float f3 = (float)((double)((float)this.d.a() + 0.5f) - this.c.aU);
        float f4 = this.g * f3 + this.h * (f2 = (float)((double)((float)this.d.c() + 0.5f) - this.c.aW));
        if (f4 < 0.0f) {
            this.f = true;
        }
    }

    private xt a(cmz cmz2) {
        dbk dbk2 = this.c.aQ.n(cmz2);
        bfa bfa2 = dbk2.t();
        if (bfa2 instanceof xt && dbk2.a() == ahk.d) {
            return (xt)bfa2;
        }
        return null;
    }
}

