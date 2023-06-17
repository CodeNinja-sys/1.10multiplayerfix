/*
 * Decompiled with CFR 0.150.
 */
public class aed
extends chu {
    public aed() {
        this(0.0f, false);
    }

    public aed(float f2, boolean bl2) {
        super(f2, 0.0f, 64, 32);
        if (!bl2) {
            this.h = new abd(this, 40, 16);
            this.h.a(-1.0f, -2.0f, -1.0f, 2, 12, 2, f2);
            this.h.a(-5.0f, 2.0f, 0.0f);
            this.i = new abd(this, 40, 16);
            this.i.i = true;
            this.i.a(-1.0f, -2.0f, -1.0f, 2, 12, 2, f2);
            this.i.a(5.0f, 2.0f, 0.0f);
            this.j = new abd(this, 0, 16);
            this.j.a(-1.0f, 0.0f, -1.0f, 2, 12, 2, f2);
            this.j.a(-2.0f, 12.0f, 0.0f);
            this.k = new abd(this, 0, 16);
            this.k.i = true;
            this.k.a(-1.0f, 0.0f, -1.0f, 2, 12, 2, f2);
            this.k.a(2.0f, 12.0f, 0.0f);
        }
    }

    @Override
    public void a(bga bga2, float f2, float f3, float f4) {
        this.s = ckq.a;
        this.r = ckq.a;
        bhl bhl2 = bga2.c(bqp.a);
        if (bhl2 != null && bhl2.a() == hp.f && ((azy)bga2).ae()) {
            if (bga2.aK() == s.b) {
                this.s = ckq.d;
            } else {
                this.r = ckq.d;
            }
        }
        super.a(bga2, f2, f3, f4);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, cpk cpk2) {
        super.a(f2, f3, f4, f5, f6, f7, cpk2);
        bhl bhl2 = ((bga)cpk2).bt();
        azy azy2 = (azy)cpk2;
        if (azy2.ae() && (bhl2 == null || bhl2.a() != hp.f)) {
            float f8 = cmk.a(this.l * (float)Math.PI);
            float f9 = cmk.a((1.0f - (1.0f - this.l) * (1.0f - this.l)) * (float)Math.PI);
            this.h.h = 0.0f;
            this.i.h = 0.0f;
            this.h.g = -(0.1f - f8 * 0.6f);
            this.i.g = 0.1f - f8 * 0.6f;
            this.h.f = -1.5707964f;
            this.i.f = -1.5707964f;
            this.h.f -= f8 * 1.2f - f9 * 0.4f;
            this.i.f -= f8 * 1.2f - f9 * 0.4f;
            this.h.h += cmk.b(f4 * 0.09f) * 0.05f + 0.05f;
            this.i.h -= cmk.b(f4 * 0.09f) * 0.05f + 0.05f;
            this.h.f += cmk.a(f4 * 0.067f) * 0.05f;
            this.i.f -= cmk.a(f4 * 0.067f) * 0.05f;
        }
    }

    @Override
    public void a(float f2, s s2) {
        float f3 = s2 == s.b ? 1.0f : -1.0f;
        abd abd2 = this.a(s2);
        abd2.c += f3;
        abd2.c(f2);
        abd2.c -= f3;
    }
}

