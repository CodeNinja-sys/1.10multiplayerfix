/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.v;
import net.minecraft.g.c.b;
import net.minecraft.g.ee;
import net.minecraft.q.k;
import net.minecraft.u.b.n;
import net.minecraft.u.b.s;
import org.lwjgl.util.a.c;

public class ao {
    private static final IntBuffer a = v.d(16);
    private static final FloatBuffer b = v.e(16);
    private static final FloatBuffer c = v.e(16);
    private static final FloatBuffer d = v.e(3);
    private static s e = new s(0.0, 0.0, 0.0);
    private static float f;
    private static float g;
    private static float h;
    private static float i;
    private static float j;

    public static void a(net.minecraft.w.a.b b2, boolean bl2) {
        bd.c(2982, b);
        bd.c(2983, c);
        bd.a(2978, a);
        float f2 = (a.get(0) + a.get(2)) / 2;
        float f3 = (a.get(1) + a.get(3)) / 2;
        org.lwjgl.util.a.c.b(f2, f3, 0.0f, b, c, a, d);
        e = new s(d.get(0), d.get(1), d.get(2));
        int n2 = bl2 ? 1 : 0;
        float f4 = b2.bb;
        float f5 = b2.ba;
        f = n.b(f5 * ((float)Math.PI / 180)) * (float)(1 - n2 * 2);
        h = n.a(f5 * ((float)Math.PI / 180)) * (float)(1 - n2 * 2);
        i = -h * n.a(f4 * ((float)Math.PI / 180)) * (float)(1 - n2 * 2);
        j = f * n.a(f4 * ((float)Math.PI / 180)) * (float)(1 - n2 * 2);
        g = n.b(f4 * ((float)Math.PI / 180));
    }

    public static s a(net.minecraft.w.n n2, double d2) {
        double d3 = n2.aR + (n2.aU - n2.aR) * d2;
        double d4 = n2.aS + (n2.aV - n2.aS) * d2;
        double d5 = n2.aT + (n2.aW - n2.aT) * d2;
        double d6 = d3 + ao.e.b;
        double d7 = d4 + ao.e.c;
        double d8 = d5 + ao.e.d;
        return new s(d6, d7, d8);
    }

    public static b a(k k2, net.minecraft.w.n n2, float f2) {
        s s2 = ao.a(n2, f2);
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(s2);
        b b3 = k2.n(b2);
        if (b3.d().d()) {
            float f3;
            float f4 = 0.0f;
            if (b3.c() instanceof ee) {
                f4 = ee.b((Integer)b3.a(ee.a)) - 0.11111111f;
            }
            if (s2.c >= (double)(f3 = (float)(b2.k() + 1) - f4)) {
                b3 = k2.n(b2.b());
            }
        }
        return b3;
    }

    public static s a() {
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

