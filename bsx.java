/*
 * Decompiled with CFR 0.150.
 */
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.util.a.c;

public class bsx {
    private static final IntBuffer a = avj.d(16);
    private static final FloatBuffer b = avj.e(16);
    private static final FloatBuffer c = avj.e(16);
    private static final FloatBuffer d = avj.e(3);
    private static amj e = new amj(0.0, 0.0, 0.0);
    private static float f;
    private static float g;
    private static float h;
    private static float i;
    private static float j;

    public static void a(bdl bdl2, boolean bl2) {
        cja.c(2982, b);
        cja.c(2983, c);
        cja.a(2978, a);
        float f2 = (a.get(0) + a.get(2)) / 2;
        float f3 = (a.get(1) + a.get(3)) / 2;
        org.lwjgl.util.a.c.b(f2, f3, 0.0f, b, c, a, d);
        e = new amj(d.get(0), d.get(1), d.get(2));
        int n2 = bl2 ? 1 : 0;
        float f4 = bdl2.bb;
        float f5 = bdl2.ba;
        f = cmk.b(f5 * ((float)Math.PI / 180)) * (float)(1 - n2 * 2);
        h = cmk.a(f5 * ((float)Math.PI / 180)) * (float)(1 - n2 * 2);
        i = -h * cmk.a(f4 * ((float)Math.PI / 180)) * (float)(1 - n2 * 2);
        j = f * cmk.a(f4 * ((float)Math.PI / 180)) * (float)(1 - n2 * 2);
        g = cmk.b(f4 * ((float)Math.PI / 180));
    }

    public static amj a(cpk cpk2, double d2) {
        double d3 = cpk2.aR + (cpk2.aU - cpk2.aR) * d2;
        double d4 = cpk2.aS + (cpk2.aV - cpk2.aS) * d2;
        double d5 = cpk2.aT + (cpk2.aW - cpk2.aT) * d2;
        double d6 = d3 + bsx.e.b;
        double d7 = d4 + bsx.e.c;
        double d8 = d5 + bsx.e.d;
        return new amj(d6, d7, d8);
    }

    public static dbk a(iu iu2, cpk cpk2, float f2) {
        amj amj2 = bsx.a(cpk2, f2);
        cmz cmz2 = new cmz(amj2);
        dbk dbk2 = iu2.n(cmz2);
        if (dbk2.a().d()) {
            float f3;
            float f4 = 0.0f;
            if (dbk2.t() instanceof en) {
                f4 = en.b((Integer)dbk2.b(en.a)) - 0.11111111f;
            }
            if (amj2.c >= (double)(f3 = (float)(cmz2.b() + 1) - f4)) {
                dbk2 = iu2.n(cmz2.g());
            }
        }
        return dbk2;
    }

    public static amj a() {
        return e;
    }

    public static float b() {
        return f;
    }

    public static float c() {
        return g;
    }

    public static float d() {
        return h;
    }

    public static float e() {
        return i;
    }

    public static float f() {
        return j;
    }
}

