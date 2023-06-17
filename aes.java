/*
 * Decompiled with CFR 0.150.
 */
public class aes
extends buc {
    private static final bpx a = new bpx("textures/entity/endercrystal/endercrystal.png");
    private final axg b = new bzc(0.0f, true);
    private final axg c = new bzc(0.0f, false);

    public aes(bid bid2) {
        super(bid2);
        this.h = 0.5f;
    }

    public void a(abi abi2, double d2, double d3, double d4, float f2, float f3) {
        float f4 = (float)abi2.a + f3;
        cja.D();
        cja.c((float)d2, (float)d3, (float)d4);
        this.a(a);
        float f5 = cmk.a(f4 * 0.2f) / 2.0f + 0.5f;
        f5 = f5 * f5 + f5;
        if (this.j) {
            cja.g();
            cja.e(this.d(abi2));
        }
        if (abi2.p()) {
            this.b.a(abi2, 0.0f, f4 * 3.0f, f5 * 0.2f, 0.0f, 0.0f, 0.0625f);
        } else {
            this.c.a(abi2, 0.0f, f4 * 3.0f, f5 * 0.2f, 0.0f, 0.0f, 0.0625f);
        }
        if (this.j) {
            cja.m();
            cja.h();
        }
        cja.E();
        cmz cmz2 = abi2.n();
        if (cmz2 != null) {
            this.a(sq.a);
            float f6 = (float)cmz2.a() + 0.5f;
            float f7 = (float)cmz2.b() + 0.5f;
            float f8 = (float)cmz2.c() + 0.5f;
            double d5 = (double)f6 - abi2.aU;
            double d6 = (double)f7 - abi2.aV;
            double d7 = (double)f8 - abi2.aW;
            sq.a(d2 + d5, d3 - 0.3 + (double)(f5 * 0.4f) + d6, d4 + d7, f3, f6, f7, f8, abi2.a, abi2.aU, abi2.aV, abi2.aW);
        }
        super.a((cpk)abi2, d2, d3, d4, f2, f3);
    }

    protected bpx a(abi abi2) {
        return a;
    }

    public boolean a(abi abi2, cct cct2, double d2, double d3, double d4) {
        return super.a((cpk)abi2, cct2, d2, d3, d4) || abi2.n() != null;
    }
}

