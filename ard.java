/*
 * Decompiled with CFR 0.150.
 */
public class ard
extends bcf {
    private static final bpx a = new bpx("textures/entity/slime/slime.png");

    public ard(bid bid2, axg axg2, float f2) {
        super(bid2, axg2, f2);
        this.a(new aky(this));
    }

    public void a(akr akr2, double d2, double d3, double d4, float f2, float f3) {
        this.h = 0.25f * (float)akr2.B();
        super.a(akr2, d2, d3, d4, f2, f3);
    }

    protected void a(akr akr2, float f2) {
        float f3 = 0.999f;
        cja.b(0.999f, 0.999f, 0.999f);
        float f4 = akr2.B();
        float f5 = (akr2.c + (akr2.b - akr2.c) * f2) / (f4 * 0.5f + 1.0f);
        float f6 = 1.0f / (f5 + 1.0f);
        cja.b(f6 * f4, 1.0f / f6 * f4, f6 * f4);
    }

    protected bpx a(akr akr2) {
        return a;
    }
}

