/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.b.ak;
import com.a.a.b.cl;
import com.a.a.l.i;
import com.a.a.l.n;
import com.a.a.l.o;
import com.a.a.l.p;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class m {
    public static final int a = 4;

    private m() {
    }

    public static int a(float f2) {
        return Float.valueOf(f2).hashCode();
    }

    public static int a(float f2, float f3) {
        return Float.compare(f2, f3);
    }

    public static boolean b(float f2) {
        return Float.NEGATIVE_INFINITY < f2 & f2 < Float.POSITIVE_INFINITY;
    }

    public static boolean a(float[] arrf, float f2) {
        for (float f3 : arrf) {
            if (f3 != f2) continue;
            return true;
        }
        return false;
    }

    public static int b(float[] arrf, float f2) {
        return m.c(arrf, f2, 0, arrf.length);
    }

    private static int c(float[] arrf, float f2, int n2, int n3) {
        for (int i2 = n2; i2 < n3; ++i2) {
            if (arrf[i2] != f2) continue;
            return i2;
        }
        return -1;
    }

    public static int a(float[] arrf, float[] arrf2) {
        cl.a(arrf, (Object)"array");
        cl.a(arrf2, (Object)"target");
        if (arrf2.length == 0) {
            return 0;
        }
        block0: for (int i2 = 0; i2 < arrf.length - arrf2.length + 1; ++i2) {
            for (int i3 = 0; i3 < arrf2.length; ++i3) {
                if (arrf[i2 + i3] != arrf2[i3]) continue block0;
            }
            return i2;
        }
        return -1;
    }

    public static int c(float[] arrf, float f2) {
        return m.d(arrf, f2, 0, arrf.length);
    }

    private static int d(float[] arrf, float f2, int n2, int n3) {
        for (int i2 = n3 - 1; i2 >= n2; --i2) {
            if (arrf[i2] != f2) continue;
            return i2;
        }
        return -1;
    }

    public static float a(float ... arrf) {
        cl.a(arrf.length > 0);
        float f2 = arrf[0];
        for (int i2 = 1; i2 < arrf.length; ++i2) {
            f2 = Math.min(f2, arrf[i2]);
        }
        return f2;
    }

    public static float b(float ... arrf) {
        cl.a(arrf.length > 0);
        float f2 = arrf[0];
        for (int i2 = 1; i2 < arrf.length; ++i2) {
            f2 = Math.max(f2, arrf[i2]);
        }
        return f2;
    }

    public static float[] a(float[] ... arrf) {
        int n2 = 0;
        for (float[] arrf2 : arrf) {
            n2 += arrf2.length;
        }
        float[] arrf3 = new float[n2];
        int n3 = 0;
        for (float[] arrf4 : arrf) {
            System.arraycopy(arrf4, 0, arrf3, n3, arrf4.length);
            n3 += arrf4.length;
        }
        return arrf3;
    }

    public static ak a() {
        return o.a;
    }

    public static float[] a(float[] arrf, int n2, int n3) {
        cl.a(n2 >= 0, "Invalid minLength: %s", new Object[]{n2});
        cl.a(n3 >= 0, "Invalid padding: %s", new Object[]{n3});
        return arrf.length < n2 ? m.a(arrf, n2 + n3) : arrf;
    }

    private static float[] a(float[] arrf, int n2) {
        float[] arrf2 = new float[n2];
        System.arraycopy(arrf, 0, arrf2, 0, Math.min(arrf.length, n2));
        return arrf2;
    }

    public static String a(String string, float ... arrf) {
        cl.a(string);
        if (arrf.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(arrf.length * 12);
        stringBuilder.append(arrf[0]);
        for (int i2 = 1; i2 < arrf.length; ++i2) {
            stringBuilder.append(string).append(arrf[i2]);
        }
        return stringBuilder.toString();
    }

    public static Comparator b() {
        return p.a;
    }

    public static float[] a(Collection collection) {
        if (collection instanceof n) {
            return ((n)collection).a();
        }
        Object[] arrobject = collection.toArray();
        int n2 = arrobject.length;
        float[] arrf = new float[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrf[i2] = ((Number)cl.a(arrobject[i2])).floatValue();
        }
        return arrf;
    }

    public static List c(float ... arrf) {
        if (arrf.length == 0) {
            return Collections.emptyList();
        }
        return new n(arrf);
    }

    public static Float a(String string) {
        if (i.b.matcher(string).matches()) {
            try {
                return Float.valueOf(Float.parseFloat(string));
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        return null;
    }

    static /* synthetic */ int a(float[] arrf, float f2, int n2, int n3) {
        return m.c(arrf, f2, n2, n3);
    }

    static /* synthetic */ int b(float[] arrf, float f2, int n2, int n3) {
        return m.d(arrf, f2, n2, n3);
    }
}

