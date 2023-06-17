/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.b.cl;
import com.a.a.l.b;
import com.a.a.l.c;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class a {
    private a() {
    }

    public static int a(boolean bl2) {
        return bl2 ? 1231 : 1237;
    }

    public static int a(boolean bl2, boolean bl3) {
        return bl2 == bl3 ? 0 : (bl2 ? 1 : -1);
    }

    public static boolean a(boolean[] arrbl, boolean bl2) {
        for (boolean bl3 : arrbl) {
            if (bl3 != bl2) continue;
            return true;
        }
        return false;
    }

    public static int b(boolean[] arrbl, boolean bl2) {
        return a.c(arrbl, bl2, 0, arrbl.length);
    }

    private static int c(boolean[] arrbl, boolean bl2, int n2, int n3) {
        for (int i2 = n2; i2 < n3; ++i2) {
            if (arrbl[i2] != bl2) continue;
            return i2;
        }
        return -1;
    }

    public static int a(boolean[] arrbl, boolean[] arrbl2) {
        cl.a(arrbl, (Object)"array");
        cl.a(arrbl2, (Object)"target");
        if (arrbl2.length == 0) {
            return 0;
        }
        block0: for (int i2 = 0; i2 < arrbl.length - arrbl2.length + 1; ++i2) {
            for (int i3 = 0; i3 < arrbl2.length; ++i3) {
                if (arrbl[i2 + i3] != arrbl2[i3]) continue block0;
            }
            return i2;
        }
        return -1;
    }

    public static int c(boolean[] arrbl, boolean bl2) {
        return a.d(arrbl, bl2, 0, arrbl.length);
    }

    private static int d(boolean[] arrbl, boolean bl2, int n2, int n3) {
        for (int i2 = n3 - 1; i2 >= n2; --i2) {
            if (arrbl[i2] != bl2) continue;
            return i2;
        }
        return -1;
    }

    public static boolean[] a(boolean[] ... arrbl) {
        int n2 = 0;
        for (boolean[] arrbl2 : arrbl) {
            n2 += arrbl2.length;
        }
        boolean[] arrbl3 = new boolean[n2];
        int n3 = 0;
        for (boolean[] arrbl4 : arrbl) {
            System.arraycopy(arrbl4, 0, arrbl3, n3, arrbl4.length);
            n3 += arrbl4.length;
        }
        return arrbl3;
    }

    public static boolean[] a(boolean[] arrbl, int n2, int n3) {
        cl.a(n2 >= 0, "Invalid minLength: %s", new Object[]{n2});
        cl.a(n3 >= 0, "Invalid padding: %s", new Object[]{n3});
        return arrbl.length < n2 ? a.a(arrbl, n2 + n3) : arrbl;
    }

    private static boolean[] a(boolean[] arrbl, int n2) {
        boolean[] arrbl2 = new boolean[n2];
        System.arraycopy(arrbl, 0, arrbl2, 0, Math.min(arrbl.length, n2));
        return arrbl2;
    }

    public static String a(String string, boolean ... arrbl) {
        cl.a(string);
        if (arrbl.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(arrbl.length * 7);
        stringBuilder.append(arrbl[0]);
        for (int i2 = 1; i2 < arrbl.length; ++i2) {
            stringBuilder.append(string).append(arrbl[i2]);
        }
        return stringBuilder.toString();
    }

    public static Comparator a() {
        return c.a;
    }

    public static boolean[] a(Collection collection) {
        if (collection instanceof b) {
            return ((b)collection).a();
        }
        Object[] arrobject = collection.toArray();
        int n2 = arrobject.length;
        boolean[] arrbl = new boolean[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrbl[i2] = (Boolean)cl.a(arrobject[i2]);
        }
        return arrbl;
    }

    public static List a(boolean ... arrbl) {
        if (arrbl.length == 0) {
            return Collections.emptyList();
        }
        return new b(arrbl);
    }

    public static int b(boolean ... arrbl) {
        int n2 = 0;
        for (boolean bl2 : arrbl) {
            if (!bl2) continue;
            ++n2;
        }
        return n2;
    }

    static /* synthetic */ int a(boolean[] arrbl, boolean bl2, int n2, int n3) {
        return a.c(arrbl, bl2, n2, n3);
    }

    static /* synthetic */ int b(boolean[] arrbl, boolean bl2, int n2, int n3) {
        return a.d(arrbl, bl2, n2, n3);
    }
}

