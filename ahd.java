/*
 * Decompiled with CFR 0.150.
 */
public class ahd
extends bcf {
    private static final bpx a = new bpx("textures/entity/squid.png");

    public ahd(bid bid2, axg axg2, float f2) {
        super(bid2, axg2, f2);
    }

    protected bpx a(aqc aqc2) {
        return a;
    }

    protected void a(aqc aqc2, float f2, float f3, float f4) {
        float f5 = aqc2.b + (aqc2.a - aqc2.b) * f4;
        float f6 = aqc2.d + (aqc2.c - aqc2.d) * f4;
        cja.c(0.0f, 0.5f, 0.0f);
        cja.b(180.0f - f3, 0.0f, 1.0f, 0.0f);
        cja.b(f5, 1.0f, 0.0f, 0.0f);
        cja.b(f6, 0.0f, 1.0f, 0.0f);
        cja.c(0.0f, -1.2f, 0.0f);
    }

    protected float a(aqc aqc2, float f2) {
        return aqc2.q + (aqc2.g - aqc2.q) * f2;
    }

    @Override
    protected /* synthetic */ float e(bga bga2, float f2) {
        return this.a((aqc)bga2, f2);
    }
}

