/*
 * Decompiled with CFR 0.150.
 */
public class czk
extends bwv {
    public boolean g;
    private final abd h = new abd(this).b(64, 128);
    private final abd i;

    public czk(float f2) {
        super(f2, 0.0f, 64, 128);
        this.h.a(0.0f, -2.0f, 0.0f);
        this.h.a(0, 0).a(0.0f, 3.0f, -6.75f, 1, 1, 1, -0.25f);
        this.f.a(this.h);
        this.i = new abd(this).b(64, 128);
        this.i.a(-5.0f, -10.03125f, -5.0f);
        this.i.a(0, 64).a(0.0f, 0.0f, 0.0f, 10, 2, 10);
        this.a.a(this.i);
        abd abd2 = new abd(this).b(64, 128);
        abd2.a(1.75f, -4.0f, 2.0f);
        abd2.a(0, 76).a(0.0f, 0.0f, 0.0f, 7, 4, 7);
        abd2.f = -0.05235988f;
        abd2.h = 0.02617994f;
        this.i.a(abd2);
        abd abd3 = new abd(this).b(64, 128);
        abd3.a(1.75f, -4.0f, 2.0f);
        abd3.a(0, 87).a(0.0f, 0.0f, 0.0f, 4, 4, 4);
        abd3.f = -0.10471976f;
        abd3.h = 0.05235988f;
        abd2.a(abd3);
        abd abd4 = new abd(this).b(64, 128);
        abd4.a(1.75f, -2.0f, 2.0f);
        abd4.a(0, 95).a(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.25f);
        abd4.f = -0.20943952f;
        abd4.h = 0.10471976f;
        abd3.a(abd4);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, cpk cpk2) {
        super.a(f2, f3, f4, f5, f6, f7, cpk2);
        this.f.o = 0.0f;
        this.f.p = 0.0f;
        this.f.q = 0.0f;
        float f8 = 0.01f * (float)(cpk2.bW() % 10);
        this.f.f = cmk.a((float)cpk2.by * f8) * 4.5f * ((float)Math.PI / 180);
        this.f.g = 0.0f;
        this.f.h = cmk.b((float)cpk2.by * f8) * 2.5f * ((float)Math.PI / 180);
        if (this.g) {
            this.f.f = -0.9f;
            this.f.q = -0.09375f;
            this.f.p = 0.1875f;
        }
    }
}

