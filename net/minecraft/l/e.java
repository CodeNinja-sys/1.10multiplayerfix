/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.l;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.cn;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.u.b.s;

public class e {
    public static boolean a(s s2, s s3, s s4) {
        return s2.b > s3.b && s2.c > s3.c && s2.d > s3.d && s2.b < s4.b && s2.c < s4.c && s2.d < s4.d;
    }

    public static s a(s s2, float f2, float f3) {
        Random random = new Random();
        for (int i2 = 0; i2 < 1000; ++i2) {
            int n2;
            int n3 = (int)s2.b + random.nextInt((int)f3 * 2) - (int)f3;
            if (!(e.a(s2.b, 0.0, s2.d, n3, 0.0, n2 = (int)s2.d + random.nextInt((int)f3 * 2) - (int)f3) > (double)f2) || !(e.a(s2.b, 0.0, s2.d, n3, 0.0, n2) < (double)f3)) continue;
            return new s(n3, s2.c, n2);
        }
        System.out.println("NULL");
        return null;
    }

    public static s a(s s2, k k2, int n2) {
        for (int i2 = 0; i2 < 200; ++i2) {
            int n3 = (int)s2.b + k2.p.nextInt(n2 * 2) - n2;
            int n4 = (int)s2.d + k2.p.nextInt(n2 * 2) - n2;
            int n5 = e.b(k2, new cn[]{p.c, p.d}, n3, n4);
            if (n5 == -1) continue;
            return new s(n3, n5 + 2, n4);
        }
        System.out.println("Cant find spawn pos!");
        return null;
    }

    public static double a(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Math.sqrt(Math.pow(d2 - d5, 2.0) + Math.pow(d3 - d6, 2.0) + Math.pow(d4 - d7, 2.0));
    }

    public static double[] a(double d2) {
        return new double[]{-Math.sin(d2 * (Math.PI / 180)), Math.cos(d2 * (Math.PI / 180))};
    }

    public static double a(double[] arrd, double[] arrd2) {
        double d2 = arrd[0] * arrd2[0] + arrd[1] * arrd2[1];
        double d3 = Math.sqrt(Math.pow(arrd[0], 2.0) + Math.pow(arrd[1], 2.0));
        double d4 = Math.sqrt(Math.pow(arrd2[0], 2.0) + Math.pow(arrd2[1], 2.0));
        return Math.acos(d2 / (d4 * d3 + 1.0E-9)) * 57.29577951308232;
    }

    public static int a(k k2, cn[] arrcn, int n2, int n3) {
        for (int i2 = 127; i2 >= 0; --i2) {
            boolean bl2 = false;
            for (int i3 = 0; i3 < arrcn.length; ++i3) {
                if (k2.n(new b(n2, i2, n3)).c() != arrcn[i3]) continue;
                bl2 = true;
                break;
            }
            if (bl2 || k2.n(new b(n2, i2, n3)).c() == p.a) continue;
            return i2;
        }
        return -1;
    }

    public static int b(k k2, cn[] arrcn, int n2, int n3) {
        for (int i2 = 127; i2 >= 0; --i2) {
            if (k2.n(new b(n2, i2, n3)).c() == p.a) continue;
            for (int i3 = 0; i3 < arrcn.length; ++i3) {
                if (k2.n(new b(n2, i2, n3)).c() != arrcn[i3]) continue;
                return i2;
            }
            return -1;
        }
        return -1;
    }
}

