/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.e;

import java.util.HashMap;
import java.util.Map;

public class u {
    private static Map a = new HashMap();

    public static String a(long l2) {
        return (String)a.get(l2);
    }

    public static void b(long l2) {
        a.remove(l2);
    }

    public static void a(long l2, String string) {
        a.put(l2, string);
    }
}

