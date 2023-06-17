/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b.f;

import java.util.HashMap;
import org.apache.commons.compress.b.e;
import org.apache.commons.compress.b.f.a;

public class c {
    private static final e a;

    private c() {
    }

    public static boolean a() {
        try {
            org.apache.commons.compress.b.f.a.a(null, 0);
            return true;
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            return false;
        }
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
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(".txz", ".tar");
        hashMap.put(".xz", "");
        hashMap.put("-xz", "");
        a = new e(hashMap, ".xz");
    }
}

