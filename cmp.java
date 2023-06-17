/*
 * Decompiled with CFR 0.150.
 */
public class cmp
extends buc {
    private static final bpx a = new bpx("textures/entity/wither/wither_invulnerable.png");
    private static final bpx b = new bpx("textures/entity/wither/wither.png");
    private final bpl c = new bpl();

    public cmp(bid bid2) {
        super(bid2);
    }

    private float a(float f2, float f3, float f4) {
        float f5;
        for (f5 = f3 - f2; f5 < -180.0f; f5 += 360.0f) {
        }
        while (f5 >= 180.0f) {
            f5 -= 360.0f;
        }
        return f2 + f4 * f5;
    }

    public void a(nm nm2, double d2, double d3, double d4, float f2, float f3) {
        cja.D();
        cja.q();
        float f4 = this.a(nm2.bc, nm2.ba, f3);
        float f5 = nm2.bd + (nm2.bb - nm2.bd) * f3;
        cja.c((float)d2, (float)d3, (float)d4);
        float f6 = 0.0625f;
        cja.A();
        cja.b(-1.0f, -1.0f, 1.0f);
        cja.d();
        this.e(nm2);
        if (this.j) {
            cja.g();
            cja.e(this.d(nm2));
        }
        this.c.a(nm2, 0.0f, 0.0f, 0.0f, f4, f5, 0.0625f);
        if (this.j) {
            cja.m();
            cja.h();
        }
        cja.E();
        super.a((cpk)nm2, d2, d3, d4, f2, f3);
    }

    protected bpx a(nm nm2) {
        return nm2.k() ? a : b;
    }
}

