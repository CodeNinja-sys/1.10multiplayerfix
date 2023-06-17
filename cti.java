/*
 * Decompiled with CFR 0.150.
 */
public class cti
extends chu {
    public boolean a;
    public boolean b;

    public cti(float f2) {
        super(0.0f, -14.0f, 64, 32);
        float f3 = -14.0f;
        this.f = new abd(this, 0, 16);
        this.f.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, f2 - 0.5f);
        this.f.a(0.0f, -14.0f, 0.0f);
        this.g = new abd(this, 32, 16);
        this.g.a(-4.0f, 0.0f, -2.0f, 8, 12, 4, f2);
        this.g.a(0.0f, -14.0f, 0.0f);
        this.h = new abd(this, 56, 0);
        this.h.a(-1.0f, -2.0f, -1.0f, 2, 30, 2, f2);
        this.h.a(-3.0f, -12.0f, 0.0f);
        this.i = new abd(this, 56, 0);
        this.i.i = true;
        this.i.a(-1.0f, -2.0f, -1.0f, 2, 30, 2, f2);
        this.i.a(5.0f, -12.0f, 0.0f);
        this.j = new abd(this, 56, 0);
        this.j.a(-1.0f, 0.0f, -1.0f, 2, 30, 2, f2);
        this.j.a(-2.0f, -2.0f, 0.0f);
        this.k = new abd(this, 56, 0);
        this.k.i = true;
        this.k.a(-1.0f, 0.0f, -1.0f, 2, 30, 2, f2);
        this.k.a(2.0f, -2.0f, 0.0f);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, cpk cpk2) {
        super.a(f2, f3, f4, f5, f6, f7, cpk2);
        this.e.j = true;
        float f8 = -14.0f;
        this.g.f = 0.0f;
        this.g.d = -14.0f;
        this.g.e = -0.0f;
        this.j.f -= 0.0f;
        this.k.f -= 0.0f;
        this.h.f = (float)((double)this.h.f * 0.5);
        this.i.f = (float)((double)this.i.f * 0.5);
        this.j.f = (float)((double)this.j.f * 0.5);
        this.k.f = (float)((double)this.k.f * 0.5);
        float f9 = 0.4f;
        if (this.h.f > 0.4f) {
            this.h.f = 0.4f;
        }
        if (this.i.f > 0.4f) {
            this.i.f = 0.4f;
        }
        if (this.h.f < -0.4f) {
            this.h.f = -0.4f;
        }
        if (this.i.f < -0.4f) {
            this.i.f = -0.4f;
        }
        if (this.j.f > 0.4f) {
            this.j.f = 0.4f;
        }
        if (this.k.f > 0.4f) {
            this.k.f = 0.4f;
        }
        if (this.j.f < -0.4f) {
            this.j.f = -0.4f;
        }
        if (this.k.f < -0.4f) {
            this.k.f = -0.4f;
        }
        if (this.a) {
            this.h.f = -0.5f;
            this.i.f = -0.5f;
            this.h.h = 0.05f;
            this.i.h = -0.05f;
        }
        this.h.e = 0.0f;
        this.i.e = 0.0f;
        this.j.e = 0.0f;
        this.k.e = 0.0f;
        this.j.d = -5.0f;
        this.k.d = -5.0f;
        this.e.e = -0.0f;
        this.e.d = -13.0f;
        this.f.c = this.e.c;
        this.f.d = this.e.d;
        this.f.e = this.e.e;
        this.f.f = this.e.f;
        this.f.g = this.e.g;
        this.f.h = this.e.h;
        if (this.b) {
            float f10 = 1.0f;
            this.e.d -= 5.0f;
        }
    }
}

