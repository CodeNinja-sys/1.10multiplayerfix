/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.b.cl;
import com.a.a.l.e;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class d {
    private d() {
    }

    public static int a(byte by2) {
        return by2;
    }

    public static boolean a(byte[] arrby, byte by2) {
        for (byte by3 : arrby) {
            if (by3 != by2) continue;
            return true;
        }
        return false;
    }

    public static int b(byte[] arrby, byte by2) {
        return d.c(arrby, by2, 0, arrby.length);
    }

    private static int c(byte[] arrby, byte by2, int n2, int n3) {
        for (int i2 = n2; i2 < n3; ++i2) {
            if (arrby[i2] != by2) continue;
            return i2;
        }
        return -1;
    }

    public static int a(byte[] arrby, byte[] arrby2) {
        cl.a(arrby, (Object)"array");
        cl.a(arrby2, (Object)"target");
        if (arrby2.length == 0) {
            return 0;
        }
        block0: for (int i2 = 0; i2 < arrby.length - arrby2.length + 1; ++i2) {
            for (int i3 = 0; i3 < arrby2.length; ++i3) {
                if (arrby[i2 + i3] != arrby2[i3]) continue block0;
            }
            return i2;
        }
        return -1;
    }

    public static int c(byte[] arrby, byte by2) {
        return d.d(arrby, by2, 0, arrby.length);
    }

    private static int d(byte[] arrby, byte by2, int n2, int n3) {
        for (int i2 = n3 - 1; i2 >= n2; --i2) {
            if (arrby[i2] != by2) continue;
            return i2;
        }
        return -1;
    }

    public static byte[] a(byte[] ... arrby) {
        int n2 = 0;
        for (byte[] arrby2 : arrby) {
            n2 += arrby2.length;
        }
        byte[] arrby3 = new byte[n2];
        int n3 = 0;
        for (byte[] arrby4 : arrby) {
            System.arraycopy(arrby4, 0, arrby3, n3, arrby4.length);
            n3 += arrby4.length;
        }
        return arrby3;
    }

    public static byte[] a(byte[] arrby, int n2, int n3) {
        cl.a(n2 >= 0, "Invalid minLength: %s", new Object[]{n2});
        cl.a(n3 >= 0, "Invalid padding: %s", new Object[]{n3});
        return arrby.length < n2 ? d.a(arrby, n2 + n3) : arrby;
    }

    private static byte[] a(byte[] arrby, int n2) {
        byte[] arrby2 = new byte[n2];
        System.arraycopy(arrby, 0, arrby2, 0, Math.min(arrby.length, n2));
        return arrby2;
    }

    public static byte[] a(Collection collection) {
        if (collection instanceof e) {
            return ((e)collection).a();
        }
        Object[] arrobject = collection.toArray();
        int n2 = arrobject.length;
        byte[] arrby = new byte[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrby[i2] = ((Number)cl.a(arrobject[i2])).byteValue();
        }
        return arrby;
    }

    public static List a(byte ... arrby) {
        if (arrby.length == 0) {
            return Collections.emptyList();
        }
        return new e(arrby);
    }

    static /* synthetic */ int a(byte[] arrby, byte by2, int n2, int n3) {
        return d.c(arrby, by2, n2, n3);
    }

    static /* synthetic */ int b(byte[] arrby, byte by2, int n2, int n3) {
        return d.d(arrby, by2, n2, n3);
    }
}

