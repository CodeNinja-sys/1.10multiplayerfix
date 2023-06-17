/*
 * Decompiled with CFR 0.150.
 */
public class qz
extends dct {
    public qz(xy xy2, iu iu2) {
        super(xy2, iu2);
    }

    @Override
    protected cpn a() {
        return new cpn(new v());
    }

    @Override
    protected boolean b() {
        return this.o();
    }

    @Override
    protected amj c() {
        return new amj(this.a.aU, this.a.aV + (double)this.a.bm * 0.5, this.a.aW);
    }

    @Override
    protected void d() {
        amj amj2 = this.c();
        float f2 = this.a.bl * this.a.bl;
        int n2 = 6;
        if (amj2.g(this.c.a(this.a, this.c.e())) < (double)f2) {
            this.c.a();
        }
        for (int i2 = Math.min(this.c.e() + 6, this.c.d() - 1); i2 > this.c.e(); --i2) {
            amj amj3 = this.c.a(this.a, i2);
            if (amj3.g(amj2) > 36.0 || !this.a(amj2, amj3, 0, 0, 0)) continue;
            this.c.c(i2);
            break;
        }
        this.a(amj2);
    }

    @Override
    protected void e() {
        super.e();
    }

    @Override
    protected boolean a(amj amj2, amj amj3, int n2, int n3, int n4) {
        auu auu2 = this.b.a(amj2, new amj(amj3.b, amj3.c + (double)this.a.bm * 0.5, amj3.d), false, true, false);
        return auu2 == null || auu2.a == bmw.a;
    }

    @Override
    public boolean a(cmz cmz2) {
        return !this.b.n(cmz2).b();
    }
}

