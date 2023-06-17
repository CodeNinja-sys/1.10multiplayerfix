/*
 * Decompiled with CFR 0.150.
 */
public class avi
extends ahw {
    public abd a;
    public abd b;
    public abd c;
    public abd d;

    public avi() {
        this(0.0f);
    }

    public avi(float f2) {
        super(f2, 64, 64);
        this.e = new abd(this, 0, 0);
        this.e.a(-1.0f, -7.0f, -1.0f, 2, 7, 2, f2);
        this.e.a(0.0f, 0.0f, 0.0f);
        this.g = new abd(this, 0, 26);
        this.g.a(-6.0f, 0.0f, -1.5f, 12, 3, 3, f2);
        this.g.a(0.0f, 0.0f, 0.0f);
        this.h = new abd(this, 24, 0);
        this.h.a(-2.0f, -2.0f, -1.0f, 2, 12, 2, f2);
        this.h.a(-5.0f, 2.0f, 0.0f);
        this.i = new abd(this, 32, 16);
        this.i.i = true;
        this.i.a(0.0f, -2.0f, -1.0f, 2, 12, 2, f2);
        this.i.a(5.0f, 2.0f, 0.0f);
        this.j = new abd(this, 8, 0);
        this.j.a(-1.0f, 0.0f, -1.0f, 2, 11, 2, f2);
        this.j.a(-1.9f, 12.0f, 0.0f);
        this.k = new abd(this, 40, 16);
        this.k.i = true;
        this.k.a(-1.0f, 0.0f, -1.0f, 2, 11, 2, f2);
        this.k.a(1.9f, 12.0f, 0.0f);
        this.a = new abd(this, 16, 0);
        this.a.a(-3.0f, 3.0f, -1.0f, 2, 7, 2, f2);
        this.a.a(0.0f, 0.0f, 0.0f);
        this.a.j = true;
        this.b = new abd(this, 48, 16);
        this.b.a(1.0f, 3.0f, -1.0f, 2, 7, 2, f2);
        this.b.a(0.0f, 0.0f, 0.0f);
        this.c = new abd(this, 0, 48);
        this.c.a(-4.0f, 10.0f, -1.0f, 8, 2, 2, f2);
        this.c.a(0.0f, 0.0f, 0.0f);
        this.d = new abd(this, 0, 32);
        this.d.a(-6.0f, 11.0f, -6.0f, 12, 1, 12, f2);
        this.d.a(0.0f, 12.0f, 0.0f);
        this.f.j = false;
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, cpk cpk2) {
        super.a(f2, f3, f4, f5, f6, f7, cpk2);
        if (!(cpk2 instanceof bdi)) {
            return;
        }
        bdi bdi2 = (bdi)cpk2;
        this.i.j = bdi2.C();
        this.h.j = bdi2.C();
        this.d.j = !bdi2.T();
        this.k.a(1.9f, 12.0f, 0.0f);
        this.j.a(-1.9f, 12.0f, 0.0f);
        this.a.f = (float)Math.PI / 180 * bdi2.ae().b();
        this.a.g = (float)Math.PI / 180 * bdi2.ae().c();
        this.a.h = (float)Math.PI / 180 * bdi2.ae().d();
        this.b.f = (float)Math.PI / 180 * bdi2.ae().b();
        this.b.g = (float)Math.PI / 180 * bdi2.ae().c();
        this.b.h = (float)Math.PI / 180 * bdi2.ae().d();
        this.c.f = (float)Math.PI / 180 * bdi2.ae().b();
        this.c.g = (float)Math.PI / 180 * bdi2.ae().c();
        this.c.h = (float)Math.PI / 180 * bdi2.ae().d();
        this.d.f = 0.0f;
        this.d.g = (float)Math.PI / 180 * -cpk2.ba;
        this.d.h = 0.0f;
    }

    @Override
    public void a(cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        super.a(cpk2, f2, f3, f4, f5, f6, f7);
        cja.D();
        if (this.n) {
            float f8 = 2.0f;
            cja.b(0.5f, 0.5f, 0.5f);
            cja.c(0.0f, 24.0f * f7, 0.0f);
            this.a.a(f7);
            this.b.a(f7);
            this.c.a(f7);
            this.d.a(f7);
        } else {
            if (cpk2.ar_()) {
                cja.c(0.0f, 0.2f, 0.0f);
            }
            this.a.a(f7);
            this.b.a(f7);
            this.c.a(f7);
            this.d.a(f7);
        }
        cja.E();
    }

    @Override
    public void a(float f2, s s2) {
        abd abd2 = this.a(s2);
        boolean bl2 = abd2.j;
        abd2.j = true;
        super.a(f2, s2);
        abd2.j = bl2;
    }
}

