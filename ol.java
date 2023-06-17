/*
 * Decompiled with CFR 0.150.
 */
public class ol
extends qh {
    public ol(bi bi2, csg csg2, float f2, float f3, cmz cmz2) {
        this(bi2, csg2, f2, f3, (float)cmz2.a() + 0.5f, (float)cmz2.b() + 0.5f, (float)cmz2.c() + 0.5f);
    }

    public static ol a(bi bi2, float f2) {
        return new ol(bi2, csg.a, 0.25f, f2, false, 0, btu.a, 0.0f, 0.0f, 0.0f);
    }

    public static ol a(bi bi2) {
        return new ol(bi2, csg.b, 1.0f, 1.0f, false, 0, btu.a, 0.0f, 0.0f, 0.0f);
    }

    public static ol a(bi bi2, float f2, float f3, float f4) {
        return new ol(bi2, csg.c, 4.0f, 1.0f, false, 0, btu.b, f2, f3, f4);
    }

    public ol(bi bi2, csg csg2, float f2, float f3, float f4, float f5, float f6) {
        this(bi2, csg2, f2, f3, false, 0, btu.b, f4, f5, f6);
    }

    private ol(bi bi2, csg csg2, float f2, float f3, boolean bl2, int n2, btu btu2, float f4, float f5, float f6) {
        this(bi2.a(), csg2, f2, f3, bl2, n2, btu2, f4, f5, f6);
    }

    public ol(bpx bpx2, csg csg2, float f2, float f3, boolean bl2, int n2, btu btu2, float f4, float f5, float f6) {
        super(bpx2, csg2);
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = bl2;
        this.j = n2;
        this.k = btu2;
    }
}

