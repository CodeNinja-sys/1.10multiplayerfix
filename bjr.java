/*
 * Decompiled with CFR 0.150.
 */
import java.nio.FloatBuffer;

public class bjr {
    private static final FloatBuffer a = avj.e(4);
    private static final amj b = new amj(0.2f, 1.0, -0.7f).a();
    private static final amj c = new amj(-0.2f, 1.0, 0.7f).a();

    public static void a() {
        cja.f();
        cja.b(0);
        cja.b(1);
        cja.h();
    }

    public static void b() {
        cja.e();
        cja.a(0);
        cja.a(1);
        cja.g();
        cja.a(1032, 5634);
        cja.a(16384, 4611, bjr.a(bjr.b.b, bjr.b.c, bjr.b.d, 0.0));
        float f2 = 0.6f;
        cja.a(16384, 4609, bjr.a(0.6f, 0.6f, 0.6f, 1.0f));
        cja.a(16384, 4608, bjr.a(0.0f, 0.0f, 0.0f, 1.0f));
        cja.a(16384, 4610, bjr.a(0.0f, 0.0f, 0.0f, 1.0f));
        cja.a(16385, 4611, bjr.a(bjr.c.b, bjr.c.c, bjr.c.d, 0.0));
        cja.a(16385, 4609, bjr.a(0.6f, 0.6f, 0.6f, 1.0f));
        cja.a(16385, 4608, bjr.a(0.0f, 0.0f, 0.0f, 1.0f));
        cja.a(16385, 4610, bjr.a(0.0f, 0.0f, 0.0f, 1.0f));
        cja.j(7424);
        float f3 = 0.4f;
        cja.a(2899, bjr.a(0.4f, 0.4f, 0.4f, 1.0f));
    }

    private static FloatBuffer a(double d2, double d3, double d4, double d5) {
        return bjr.a((float)d2, (float)d3, (float)d4, (float)d5);
    }

    public static FloatBuffer a(float f2, float f3, float f4, float f5) {
        a.clear();
        a.put(f2).put(f3).put(f4).put(f5);
        a.flip();
        return a;
    }

    public static void c() {
        cja.D();
        cja.b(-30.0f, 0.0f, 1.0f, 0.0f);
        cja.b(165.0f, 1.0f, 0.0f, 0.0f);
        bjr.b();
        cja.E();
    }
}

