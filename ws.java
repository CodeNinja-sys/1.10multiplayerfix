/*
 * Decompiled with CFR 0.150.
 */
public class ws
extends bcf {
    private static final bpx a = new bpx("textures/entity/slime/magmacube.png");

    public ws(bid bid2) {
        super(bid2, new cur(), 0.25f);
    }

    protected bpx a(clw clw2) {
        return a;
    }

    protected void a(clw clw2, float f2) {
        int n2 = clw2.B();
        float f3 = (clw2.c + (clw2.b - clw2.c) * f2) / ((float)n2 * 0.5f + 1.0f);
        float f4 = 1.0f / (f3 + 1.0f);
        cja.b(f4 * (float)n2, 1.0f / f4 * (float)n2, f4 * (float)n2);
    }
}

