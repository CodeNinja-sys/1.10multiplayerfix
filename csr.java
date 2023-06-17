/*
 * Decompiled with CFR 0.150.
 */
public class csr
extends chu {
    public abd a;
    public abd b;
    public abd c;
    public abd d;
    public abd u;
    private final abd v;
    private final abd w;
    private final boolean x;

    public csr(float f2, boolean bl2) {
        super(f2, 0.0f, 64, 64);
        this.x = bl2;
        this.w = new abd(this, 24, 0);
        this.w.a(-3.0f, -6.0f, -1.0f, 6, 6, 1, f2);
        this.v = new abd(this, 0, 0);
        this.v.b(64, 32);
        this.v.a(-5.0f, 0.0f, -1.0f, 10, 16, 1, f2);
        if (bl2) {
            this.i = new abd(this, 32, 48);
            this.i.a(-1.0f, -2.0f, -2.0f, 3, 12, 4, f2);
            this.i.a(5.0f, 2.5f, 0.0f);
            this.h = new abd(this, 40, 16);
            this.h.a(-2.0f, -2.0f, -2.0f, 3, 12, 4, f2);
            this.h.a(-5.0f, 2.5f, 0.0f);
            this.a = new abd(this, 48, 48);
            this.a.a(-1.0f, -2.0f, -2.0f, 3, 12, 4, f2 + 0.25f);
            this.a.a(5.0f, 2.5f, 0.0f);
            this.b = new abd(this, 40, 32);
            this.b.a(-2.0f, -2.0f, -2.0f, 3, 12, 4, f2 + 0.25f);
            this.b.a(-5.0f, 2.5f, 10.0f);
        } else {
            this.i = new abd(this, 32, 48);
            this.i.a(-1.0f, -2.0f, -2.0f, 4, 12, 4, f2);
            this.i.a(5.0f, 2.0f, 0.0f);
            this.a = new abd(this, 48, 48);
            this.a.a(-1.0f, -2.0f, -2.0f, 4, 12, 4, f2 + 0.25f);
            this.a.a(5.0f, 2.0f, 0.0f);
            this.b = new abd(this, 40, 32);
            this.b.a(-3.0f, -2.0f, -2.0f, 4, 12, 4, f2 + 0.25f);
            this.b.a(-5.0f, 2.0f, 10.0f);
        }
        this.k = new abd(this, 16, 48);
        this.k.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2);
        this.k.a(1.9f, 12.0f, 0.0f);
        this.c = new abd(this, 0, 48);
        this.c.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2 + 0.25f);
        this.c.a(1.9f, 12.0f, 0.0f);
        this.d = new abd(this, 0, 32);
        this.d.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2 + 0.25f);
        this.d.a(-1.9f, 12.0f, 0.0f);
        this.u = new abd(this, 16, 32);
        this.u.a(-4.0f, 0.0f, -2.0f, 8, 12, 4, f2 + 0.25f);
        this.u.a(0.0f, 0.0f, 0.0f);
    }

    @Override
    public void a(cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        super.a(cpk2, f2, f3, f4, f5, f6, f7);
        cja.D();
        if (this.n) {
            float f8 = 2.0f;
            cja.b(0.5f, 0.5f, 0.5f);
            cja.c(0.0f, 24.0f * f7, 0.0f);
            this.c.a(f7);
            this.d.a(f7);
            this.a.a(f7);
            this.b.a(f7);
            this.u.a(f7);
        } else {
            if (cpk2.ar_()) {
                cja.c(0.0f, 0.2f, 0.0f);
            }
            this.c.a(f7);
            this.d.a(f7);
            this.a.a(f7);
            this.b.a(f7);
            this.u.a(f7);
        }
        cja.E();
    }

    public void a(float f2) {
        csr.a(this.e, this.w);
        this.w.c = 0.0f;
        this.w.d = 0.0f;
        this.w.a(f2);
    }

    public void b(float f2) {
        this.v.a(f2);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, cpk cpk2) {
        super.a(f2, f3, f4, f5, f6, f7, cpk2);
        csr.a(this.k, this.c);
        csr.a(this.j, this.d);
        csr.a(this.i, this.a);
        csr.a(this.h, this.b);
        csr.a(this.g, this.u);
        this.v.d = cpk2.ar_() ? 2.0f : 0.0f;
    }

    @Override
    public void a(boolean bl2) {
        super.a(bl2);
        this.a.j = bl2;
        this.b.j = bl2;
        this.c.j = bl2;
        this.d.j = bl2;
        this.u.j = bl2;
        this.v.j = bl2;
        this.w.j = bl2;
    }

    @Override
    public void a(float f2, s s2) {
        abd abd2 = this.a(s2);
        if (this.x) {
            float f3 = 0.5f * (float)(s2 == s.b ? 1 : -1);
            abd2.c += f3;
            abd2.c(f2);
            abd2.c -= f3;
        } else {
            abd2.c(f2);
        }
    }
}

