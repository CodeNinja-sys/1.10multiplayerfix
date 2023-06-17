/*
 * Decompiled with CFR 0.150.
 */
public class anf
extends bcf {
    private static final bpx a = new bpx("textures/entity/chicken.png");

    public anf(bid bid2, axg axg2, float f2) {
        super(bid2, axg2, f2);
    }

    protected bpx a(jp jp2) {
        return a;
    }

    protected float a(jp jp2, float f2) {
        float f3 = jp2.d + (jp2.a - jp2.d) * f2;
        float f4 = jp2.c + (jp2.b - jp2.c) * f2;
        return (cmk.a(f3) + 1.0f) * f4;
    }

    @Override
    protected /* synthetic */ float e(bga bga2, float f2) {
        return this.a((jp)bga2, f2);
    }
}

