/*
 * Decompiled with CFR 0.150.
 */
public class cvv
extends deg {
    private amj b;
    private int c;

    public cvv(brd brd2) {
        super(brd2);
    }

    @Override
    public void e() {
        if (this.c++ % 10 == 0) {
            float f2 = (this.a.aW().nextFloat() - 0.5f) * 8.0f;
            float f3 = (this.a.aW().nextFloat() - 0.5f) * 4.0f;
            float f4 = (this.a.aW().nextFloat() - 0.5f) * 8.0f;
            this.a.aQ.a(lz.c, this.a.aU + (double)f2, this.a.aV + 2.0 + (double)f3, this.a.aW + (double)f4, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    public void a() {
        double d2;
        ++this.c;
        if (this.b == null) {
            cmz cmz2 = this.a.aQ.k(apk.a);
            this.b = new amj(cmz2.a(), cmz2.b(), cmz2.c());
        }
        if ((d2 = this.b.c(this.a.aU, this.a.aV, this.a.aW)) < 100.0 || d2 > 22500.0 || this.a.bf || this.a.bg) {
            this.a.k(0.0f);
        } else {
            this.a.k(1.0f);
        }
    }

    @Override
    public void b() {
        this.b = null;
        this.c = 0;
    }

    @Override
    public float f() {
        return 3.0f;
    }

    @Override
    public amj c() {
        return this.b;
    }

    @Override
    public baw d() {
        return baw.j;
    }
}

