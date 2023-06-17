/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.e;

import com.a.b.w;
import com.a.b.z;
import java.util.Date;

public class a {
    public static String a(String string, z z2, String string2) {
        w w2 = z2.c(string);
        if (w2 != null) {
            return w2.s() ? string2 : w2.d();
        }
        return string2;
    }

    public static int a(String string, z z2, int n2) {
        w w2 = z2.c(string);
        if (w2 != null) {
            return w2.s() ? n2 : w2.j();
        }
        return n2;
    }

    public static long a(String string, z z2, long l2) {
        w w2 = z2.c(string);
        if (w2 != null) {
            return w2.s() ? l2 : w2.i();
        }
        return l2;
    }

    public static boolean a(String string, z z2, boolean bl2) {
        w w2 = z2.c(string);
        if (w2 != null) {
            return w2.s() ? bl2 : w2.n();
        }
        return bl2;
    }

    public static Date a(String string, z z2) {
        w w2 = z2.c(string);
        if (w2 != null) {
            return new Date(Long.parseLong(w2.d()));
        }
        return new Date();
    }
}

