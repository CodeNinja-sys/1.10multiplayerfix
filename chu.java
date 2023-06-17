/*
 * Decompiled with CFR 0.150.
 */
public class chu
extends axg {
    public abd e;
    public abd f;
    public abd g;
    public abd h;
    public abd i;
    public abd j;
    public abd k;
    public ckq r = ckq.a;
    public ckq s = ckq.a;
    public boolean t;

    public chu() {
        this(0.0f);
    }

    public chu(float f2) {
        this(f2, 0.0f, 64, 32);
    }

    public chu(float f2, float f3, int n2, int n3) {
        this.p = n2;
        this.q = n3;
        this.e = new abd(this, 0, 0);
        this.e.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, f2);
        this.e.a(0.0f, 0.0f + f3, 0.0f);
        this.f = new abd(this, 32, 0);
        this.f.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, f2 + 0.5f);
        this.f.a(0.0f, 0.0f + f3, 0.0f);
        this.g = new abd(this, 16, 16);
        this.g.a(-4.0f, 0.0f, -2.0f, 8, 12, 4, f2);
        this.g.a(0.0f, 0.0f + f3, 0.0f);
        this.h = new abd(this, 40, 16);
        this.h.a(-3.0f, -2.0f, -2.0f, 4, 12, 4, f2);
        this.h.a(-5.0f, 2.0f + f3, 0.0f);
        this.i = new abd(this, 40, 16);
        this.i.i = true;
        this.i.a(-1.0f, -2.0f, -2.0f, 4, 12, 4, f2);
        this.i.a(5.0f, 2.0f + f3, 0.0f);
        this.j = new abd(this, 0, 16);
        this.j.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2);
        this.j.a(-1.9f, 12.0f + f3, 0.0f);
        this.k = new abd(this, 0, 16);
        this.k.i = true;
        this.k.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2);
        this.k.a(1.9f, 12.0f + f3, 0.0f);
    }

    @Override
    public void a(cpk cpk2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, cpk2);
        cja.D();
        if (this.n) {
            float f8 = 2.0f;
            cja.b(0.75f, 0.75f, 0.75f);
            cja.c(0.0f, 16.0f * f7, 0.0f);
            this.e.a(f7);
            cja.E();
            cja.D();
            cja.b(0.5f, 0.5f, 0.5f);
            cja.c(0.0f, 24.0f * f7, 0.0f);
            this.g.a(f7);
            this.h.a(f7);
            this.i.a(f7);
            this.j.a(f7);
            this.k.a(f7);
            this.f.a(f7);
        } else {
            if (cpk2.ar_()) {
                cja.c(0.0f, 0.2f, 0.0f);
            }
            this.e.a(f7);
            this.g.a(f7);
            this.h.a(f7);
            this.i.a(f7);
            this.j.a(f7);
            this.k.a(f7);
            this.f.a(f7);
        }
        cja.E();
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, cpk cpk2) {
        boolean bl2 = cpk2 instanceof bga && ((bga)cpk2).bM() > 4;
        this.e.g = f5 * ((float)Math.PI / 180);
        this.e.f = bl2 ? -0.7853982f : f6 * ((float)Math.PI / 180);
        this.g.g = 0.0f;
        this.h.e = 0.0f;
        this.h.c = -5.0f;
        this.i.e = 0.0f;
        this.i.c = 5.0f;
        float f8 = 1.0f;
        if (bl2) {
            f8 = (float)(cpk2.aX * cpk2.aX + cpk2.aY * cpk2.aY + cpk2.aZ * cpk2.aZ);
            f8 /= 0.2f;
            f8 *= f8 * f8;
        }
        if (f8 < 1.0f) {
            f8 = 1.0f;
        }
        this.h.f = cmk.b(f2 * 0.6662f + (float)Math.PI) * 2.0f * f3 * 0.5f / f8;
        this.i.f = cmk.b(f2 * 0.6662f) * 2.0f * f3 * 0.5f / f8;
        this.h.h = 0.0f;
        this.i.h = 0.0f;
        this.j.f = cmk.b(f2 * 0.6662f) * 1.4f * f3 / f8;
        this.k.f = cmk.b(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3 / f8;
        this.j.g = 0.0f;
        this.k.g = 0.0f;
        this.j.h = 0.0f;
        this.k.h = 0.0f;
        if (this.m) {
            this.h.f += -0.62831855f;
            this.i.f += -0.62831855f;
            this.j.f = -1.4137167f;
            this.j.g = 0.31415927f;
            this.j.h = 0.07853982f;
            this.k.f = -1.4137167f;
            this.k.g = -0.31415927f;
            this.k.h = -0.07853982f;
        }
        this.h.g = 0.0f;
        this.h.h = 0.0f;
        switch (this.r) {
            case a: {
                this.i.g = 0.0f;
                break;
            }
            case c: {
                this.i.f = this.i.f * 0.5f - 0.9424779f;
                this.i.g = 0.5235988f;
                break;
            }
            case b: {
                this.i.f = this.i.f * 0.5f - 0.31415927f;
                this.i.g = 0.0f;
            }
        }
        switch (this.s) {
            case a: {
                this.h.g = 0.0f;
                break;
            }
            case c: {
                this.h.f = this.h.f * 0.5f - 0.9424779f;
                this.h.g = -0.5235988f;
                break;
            }
            case b: {
                this.h.f = this.h.f * 0.5f - 0.31415927f;
                this.h.g = 0.0f;
            }
        }
        if (this.l > 0.0f) {
            s s2 = this.a(cpk2);
            abd abd2 = this.a(s2);
            float f9 = this.l;
            this.g.g = cmk.a(cmk.c(f9) * ((float)Math.PI * 2)) * 0.2f;
            if (s2 == s.a) {
                this.g.g *= -1.0f;
            }
            this.h.e = cmk.a(this.g.g) * 5.0f;
            this.h.c = -cmk.b(this.g.g) * 5.0f;
            this.i.e = -cmk.a(this.g.g) * 5.0f;
            this.i.c = cmk.b(this.g.g) * 5.0f;
            this.h.g += this.g.g;
            this.i.g += this.g.g;
            this.i.f += this.g.g;
            f9 = 1.0f - this.l;
            f9 *= f9;
            f9 *= f9;
            f9 = 1.0f - f9;
            float f10 = cmk.a(f9 * (float)Math.PI);
            float f11 = cmk.a(this.l * (float)Math.PI) * -(this.e.f - 0.7f) * 0.75f;
            abd2.f = (float)((double)abd2.f - ((double)f10 * 1.2 + (double)f11));
            abd2.g += this.g.g * 2.0f;
            abd2.h += cmk.a(this.l * (float)Math.PI) * -0.4f;
        }
        if (this.t) {
            this.g.f = 0.5f;
            this.h.f += 0.4f;
            this.i.f += 0.4f;
            this.j.e = 4.0f;
            this.k.e = 4.0f;
            this.j.d = 9.0f;
            this.k.d = 9.0f;
            this.e.d = 1.0f;
        } else {
            this.g.f = 0.0f;
            this.j.e = 0.1f;
            this.k.e = 0.1f;
            this.j.d = 12.0f;
            this.k.d = 12.0f;
            this.e.d = 0.0f;
        }
        this.h.h += cmk.b(f4 * 0.09f) * 0.05f + 0.05f;
        this.i.h -= cmk.b(f4 * 0.09f) * 0.05f + 0.05f;
        this.h.f += cmk.a(f4 * 0.067f) * 0.05f;
        this.i.f -= cmk.a(f4 * 0.067f) * 0.05f;
        if (this.s == ckq.d) {
            this.h.g = -0.1f + this.e.g;
            this.i.g = 0.1f + this.e.g + 0.4f;
            this.h.f = -1.5707964f + this.e.f;
            this.i.f = -1.5707964f + this.e.f;
        } else if (this.r == ckq.d) {
            this.h.g = -0.1f + this.e.g - 0.4f;
            this.i.g = 0.1f + this.e.g;
            this.h.f = -1.5707964f + this.e.f;
            this.i.f = -1.5707964f + this.e.f;
        }
        chu.a(this.e, this.f);
    }

    @Override
    public void a(axg axg2) {
        super.a(axg2);
        if (axg2 instanceof chu) {
            chu chu2 = (chu)axg2;
            this.r = chu2.r;
            this.s = chu2.s;
            this.t = chu2.t;
        }
    }

    public void a(boolean bl2) {
        this.e.j = bl2;
        this.f.j = bl2;
        this.g.j = bl2;
        this.h.j = bl2;
        this.i.j = bl2;
        this.j.j = bl2;
        this.k.j = bl2;
    }

    public void a(float f2, s s2) {
        this.a(s2).c(f2);
    }

    protected abd a(s s2) {
        if (s2 == s.a) {
            return this.i;
        }
        return this.h;
    }

    protected s a(cpk cpk2) {
        if (cpk2 instanceof bga) {
            return ((bga)cpk2).aK();
        }
        return s.b;
    }
}

