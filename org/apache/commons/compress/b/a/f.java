/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b.a;

import java.util.LinkedHashMap;
import org.apache.commons.compress.b.e;

public abstract class f {
    private static final e a;

    private f() {
    }

    public static boolean a(String string) {
        return a.a(string);
    }

    public static String b(String string) {
        return a.b(string);
    }

    public static String c(String string) {
        return a.c(string);
    }

    static {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        linkedHashMap.put(".tar.bz2", ".tar");
        linkedHashMap.put(".tbz2", ".tar");
        linkedHashMap.put(".tbz", ".tar");
        linkedHashMap.put(".bz2", "");
        linkedHashMap.put(".bz", "");
        a = new e(linkedHashMap, ".bz2");
    }
}

