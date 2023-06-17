/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import java.util.Random;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.w.f.ae;
import net.minecraft.w.n;

public class a {
    private static final Random a = new Random();

    public static void a(k k2, b b2, y y2) {
        net.minecraft.h.a.a(k2, (double)b2.cy_(), (double)b2.k(), (double)b2.l(), y2);
    }

    public static void a(k k2, n n2, y y2) {
        net.minecraft.h.a.a(k2, n2.aU, n2.aV, n2.aW, y2);
    }

    private static void a(k k2, double d2, double d3, double d4, y y2) {
        for (int i2 = 0; i2 < y2.e(); ++i2) {
            cu cu2 = y2.a(i2);
            if (cu2 == null) continue;
            net.minecraft.h.a.a(k2, d2, d3, d4, cu2);
        }
    }

    public static void a(k k2, double d2, double d3, double d4, cu cu2) {
        float f2 = a.nextFloat() * 0.8f + 0.1f;
        float f3 = a.nextFloat() * 0.8f + 0.1f;
        float f4 = a.nextFloat() * 0.8f + 0.1f;
        while (cu2.b > 0) {
            int n2 = a.nextInt(21) + 10;
            if (n2 > cu2.b) {
                n2 = cu2.b;
            }
            cu2.b -= n2;
            ae ae2 = new ae(k2, d2 + (double)f2, d3 + (double)f3, d4 + (double)f4, new cu(cu2.a(), n2, cu2.h()));
            if (cu2.n()) {
                ae2.c().d(cu2.o().g());
            }
            float f5 = 0.05f;
            ae2.aX = a.nextGaussian() * (double)0.05f;
            ae2.aY = a.nextGaussian() * (double)0.05f + (double)0.2f;
            ae2.aZ = a.nextGaussian() * (double)0.05f;
            k2.a(ae2);
        }
    }
}

