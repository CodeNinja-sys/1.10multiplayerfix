/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import java.util.Random;
import net.minecraft.i.j;
import net.minecraft.u.b.b;
import net.minecraft.u.b.n;
import net.minecraft.u.b.s;
import net.minecraft.w.t;

public class af {
    private static s a = s.a;

    public static s a(t t2, int n2, int n3) {
        return af.c(t2, n2, n3, null);
    }

    public static s a(t t2, int n2, int n3, s s2) {
        a = s2.a(t2.aU, t2.aV, t2.aW);
        return af.c(t2, n2, n3, a);
    }

    public static s b(t t2, int n2, int n3, s s2) {
        a = new s(t2.aU, t2.aV, t2.aW).d(s2);
        return af.c(t2, n2, n3, a);
    }

    private static s c(t t2, int n2, int n3, s s2) {
        double d2;
        double d3;
        j j2 = t2.N();
        Random random = t2.bd();
        boolean bl2 = false;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        float f2 = -99999.0f;
        boolean bl3 = t2.dm() ? (d3 = t2.dj().e((double)n.c(t2.aU), (double)n.c(t2.aV), (double)n.c(t2.aW)) + 4.0) < (d2 = (double)(t2.dk() + (float)n2)) * d2 : false;
        for (int i2 = 0; i2 < 10; ++i2) {
            float f3;
            b b2;
            int n7 = random.nextInt(2 * n2 + 1) - n2;
            int n8 = random.nextInt(2 * n3 + 1) - n3;
            int n9 = random.nextInt(2 * n2 + 1) - n2;
            if (s2 != null && !((double)n7 * s2.b + (double)n9 * s2.d >= 0.0)) continue;
            if (t2.dm() && n2 > 1) {
                b2 = t2.dj();
                n7 = t2.aU > (double)b2.cy_() ? (n7 -= random.nextInt(n2 / 2)) : (n7 += random.nextInt(n2 / 2));
                n9 = t2.aW > (double)b2.l() ? (n9 -= random.nextInt(n2 / 2)) : (n9 += random.nextInt(n2 / 2));
            }
            b2 = new b((double)n7 + t2.aU, (double)n8 + t2.aV, (double)n9 + t2.aW);
            if (bl3 && !t2.f(b2) || !j2.b(b2) || !((f3 = t2.a(b2)) > f2)) continue;
            f2 = f3;
            n4 = n7;
            n5 = n8;
            n6 = n9;
            bl2 = true;
        }
        if (bl2) {
            return new s((double)n4 + t2.aU, (double)n5 + t2.aV, (double)n6 + t2.aW);
        }
        return null;
    }
}

