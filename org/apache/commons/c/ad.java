/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.util.Random;
import org.apache.commons.c.ao;

public class ad {
    private static final Random a = new Random();

    public static byte[] a(int n2) {
        ao.a(n2 >= 0, "Count cannot be negative.", new Object[0]);
        byte[] arrby = new byte[n2];
        a.nextBytes(arrby);
        return arrby;
    }

    public static int a(int n2, int n3) {
        ao.a(n3 >= n2, "Start value must be smaller or equal to end value.", new Object[0]);
        ao.a(n2 >= 0, "Both range values must be non-negative.", new Object[0]);
        if (n2 == n3) {
            return n2;
        }
        return n2 + a.nextInt(n3 - n2);
    }

    public static long a(long l2, long l3) {
        ao.a(l3 >= l2, "Start value must be smaller or equal to end value.", new Object[0]);
        ao.a(l2 >= 0L, "Both range values must be non-negative.", new Object[0]);
        if (l2 == l3) {
            return l2;
        }
        return (long)ad.a((double)l2, (double)l3);
    }

    public static double a(double d2, double d3) {
        ao.a(d3 >= d2, "Start value must be smaller or equal to end value.", new Object[0]);
        ao.a(d2 >= 0.0, "Both range values must be non-negative.", new Object[0]);
        if (d2 == d3) {
            return d2;
        }
        return d2 + (d3 - d2) * a.nextDouble();
    }

    public static float a(float f2, float f3) {
        ao.a(f3 >= f2, "Start value must be smaller or equal to end value.", new Object[0]);
        ao.a(f2 >= 0.0f, "Both range values must be non-negative.", new Object[0]);
        if (f2 == f3) {
            return f2;
        }
        return f2 + (f3 - f2) * a.nextFloat();
    }
}

