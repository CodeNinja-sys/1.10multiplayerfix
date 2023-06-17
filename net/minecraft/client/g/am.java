/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import java.nio.FloatBuffer;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.v;
import net.minecraft.u.b.s;

public class am {
    private static final FloatBuffer a = v.e(4);
    private static final s b = new s(0.2f, 1.0, -0.7f).a();
    private static final s c = new s(-0.2f, 1.0, 0.7f).a();

    public static void a() {
        bd.f();
        bd.b(0);
        bd.b(1);
        bd.h();
    }

    public static void b() {
        bd.e();
        bd.a(0);
        bd.a(1);
        bd.g();
        bd.a(1032, 5634);
        bd.a(16384, 4611, am.a(am.b.b, am.b.c, am.b.d, 0.0));
        float f2 = 0.6f;
        bd.a(16384, 4609, am.a(0.6f, 0.6f, 0.6f, 1.0f));
        bd.a(16384, 4608, am.a(0.0f, 0.0f, 0.0f, 1.0f));
        bd.a(16384, 4610, am.a(0.0f, 0.0f, 0.0f, 1.0f));
        bd.a(16385, 4611, am.a(am.c.b, am.c.c, am.c.d, 0.0));
        bd.a(16385, 4609, am.a(0.6f, 0.6f, 0.6f, 1.0f));
        bd.a(16385, 4608, am.a(0.0f, 0.0f, 0.0f, 1.0f));
        bd.a(16385, 4610, am.a(0.0f, 0.0f, 0.0f, 1.0f));
        bd.j(7424);
        float f3 = 0.4f;
        bd.a(2899, am.a(0.4f, 0.4f, 0.4f, 1.0f));
    }

    private static FloatBuffer a(double d2, double d3, double d4, double d5) {
        return am.a((float)d2, (float)d3, (float)d4, (float)d5);
    }

    public static FloatBuffer a(float f2, float f3, float f4, float f5) {
        a.clear();
        a.put(f2).put(f3).put(f4).put(f5);
        a.flip();
        return a;
    }

    public static void c() {
        bd.D();
        bd.b(-30.0f, 0.0f, 1.0f, 0.0f);
        bd.b(165.0f, 1.0f, 0.0f, 0.0f);
        am.b();
        bd.E();
    }
}

