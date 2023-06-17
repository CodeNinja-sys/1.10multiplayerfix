/*
 * Decompiled with CFR 0.150.
 */
public class ady
extends buc {
    private static final bpx a = new bpx("textures/entity/shulker/spark.png");
    private final bcx b = new bcx();

    public ady(bid bid2) {
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

    public void a(dcg dcg2, double d2, double d3, double d4, float f2, float f3) {
        cja.D();
        float f4 = this.a(dcg2.bc, dcg2.ba, f3);
        float f5 = dcg2.bd + (dcg2.bb - dcg2.bd) * f3;
        float f6 = (float)dcg2.by + f3;
        cja.c((float)d2, (float)d3 + 0.15f, (float)d4);
        cja.b(cmk.a(f6 * 0.1f) * 180.0f, 0.0f, 1.0f, 0.0f);
        cja.b(cmk.b(f6 * 0.1f) * 180.0f, 1.0f, 0.0f, 0.0f);
        cja.b(cmk.a(f6 * 0.15f) * 360.0f, 0.0f, 0.0f, 1.0f);
        float f7 = 0.03125f;
        cja.A();
        cja.b(-1.0f, -1.0f, 1.0f);
        this.e(dcg2);
        this.b.a(dcg2, 0.0f, 0.0f, 0.0f, f4, f5, 0.03125f);
        cja.l();
        cja.c(1.0f, 1.0f, 1.0f, 0.5f);
        cja.b(1.5f, 1.5f, 1.5f);
        this.b.a(dcg2, 0.0f, 0.0f, 0.0f, f4, f5, 0.03125f);
        cja.k();
        cja.E();
        super.a((cpk)dcg2, d2, d3, d4, f2, f3);
    }

    protected bpx a(dcg dcg2) {
        return a;
    }
}

