/*
 * Decompiled with CFR 0.150.
 */
public class ks
extends chu {
    public ks() {
        this(0.0f, 0.0f, false);
    }

    public ks(float f2, float f3, boolean bl2) {
        super(f2, 0.0f, 64, bl2 ? 32 : 64);
        if (bl2) {
            this.e = new abd(this, 0, 0);
            this.e.a(-4.0f, -10.0f, -4.0f, 8, 8, 8, f2);
            this.e.a(0.0f, 0.0f + f3, 0.0f);
            this.g = new abd(this, 16, 16);
            this.g.a(0.0f, 0.0f + f3, 0.0f);
            this.g.a(-4.0f, 0.0f, -2.0f, 8, 12, 4, f2 + 0.1f);
            this.j = new abd(this, 0, 16);
            this.j.a(-2.0f, 12.0f + f3, 0.0f);
            this.j.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2 + 0.1f);
            this.k = new abd(this, 0, 16);
            this.k.i = true;
            this.k.a(2.0f, 12.0f + f3, 0.0f);
            this.k.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2 + 0.1f);
        } else {
            this.e = new abd(this, 0, 0);
            this.e.a(0.0f, f3, 0.0f);
            this.e.a(0, 0).a(-4.0f, -10.0f, -4.0f, 8, 10, 8, f2);
            this.e.a(24, 0).a(-1.0f, -3.0f, -6.0f, 2, 4, 2, f2);
            this.g = new abd(this, 16, 20);
            this.g.a(0.0f, 0.0f + f3, 0.0f);
            this.g.a(-4.0f, 0.0f, -3.0f, 8, 12, 6, f2);
            this.g.a(0, 38).a(-4.0f, 0.0f, -3.0f, 8, 18, 6, f2 + 0.05f);
            this.h = new abd(this, 44, 38);
            this.h.a(-3.0f, -2.0f, -2.0f, 4, 12, 4, f2);
            this.h.a(-5.0f, 2.0f + f3, 0.0f);
            this.i = new abd(this, 44, 38);
            this.i.i = true;
            this.i.a(-1.0f, -2.0f, -2.0f, 4, 12, 4, f2);
            this.i.a(5.0f, 2.0f + f3, 0.0f);
            this.j = new abd(this, 0, 22);
            this.j.a(-2.0f, 12.0f + f3, 0.0f);
            this.j.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2);
            this.k = new abd(this, 0, 22);
            this.k.i = true;
            this.k.a(2.0f, 12.0f + f3, 0.0f);
            this.k.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, cpk cpk2) {
        float f8;
        super.a(f2, f3, f4, f5, f6, f7, cpk2);
        oe oe2 = (oe)cpk2;
        float f9 = cmk.a(this.l * (float)Math.PI);
        float f10 = cmk.a((1.0f - (1.0f - this.l) * (1.0f - this.l)) * (float)Math.PI);
        this.h.h = 0.0f;
        this.i.h = 0.0f;
        this.h.g = -(0.1f - f9 * 0.6f);
        this.i.g = 0.1f - f9 * 0.6f;
        this.h.f = f8 = (float)(-Math.PI) / (oe2.B() ? 1.5f : 2.25f);
        this.i.f = f8;
        this.h.f += f9 * 1.2f - f10 * 0.4f;
        this.i.f += f9 * 1.2f - f10 * 0.4f;
        this.h.h += cmk.b(f4 * 0.09f) * 0.05f + 0.05f;
        this.i.h -= cmk.b(f4 * 0.09f) * 0.05f + 0.05f;
        this.h.f += cmk.a(f4 * 0.067f) * 0.05f;
        this.i.f -= cmk.a(f4 * 0.067f) * 0.05f;
    }
}

