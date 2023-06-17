/*
 * Decompiled with CFR 0.150.
 */
public class cmr
extends vp {
    private cmz f;

    public cmr(xy xy2, iu iu2) {
        super(xy2, iu2);
    }

    @Override
    public dbn b(cmz cmz2) {
        this.f = cmz2;
        return super.b(cmz2);
    }

    @Override
    public dbn a(cpk cpk2) {
        this.f = new cmz(cpk2);
        return super.a(cpk2);
    }

    @Override
    public boolean a(cpk cpk2, double d2) {
        dbn dbn2 = this.a(cpk2);
        if (dbn2 != null) {
            return this.a(dbn2, d2);
        }
        this.f = new cmz(cpk2);
        this.d = d2;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void h() {
        block5: {
            block4: {
                if (!this.m()) {
                    super.h();
                    return;
                }
                if (this.f == null) return;
                double d2 = this.a.bl * this.a.bl;
                if (this.a.f(this.f) < d2) break block4;
                if (!(this.a.aV > (double)this.f.b())) break block5;
                cmz cmz2 = new cmz(this.f.a(), cmk.c(this.a.aV), this.f.c());
                if (!(this.a.f(cmz2) < d2)) break block5;
            }
            this.f = null;
            return;
        }
        this.a.an().a(this.f.a(), this.f.b(), this.f.c(), this.d);
    }
}

