/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b.b;

import java.util.LinkedHashMap;
import org.apache.commons.compress.b.e;

public class d {
    private static final e a;

    private d() {
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
        linkedHashMap.put(".tgz", ".tar");
        linkedHashMap.put(".taz", ".tar");
        linkedHashMap.put(".svgz", ".svg");
        linkedHashMap.put(".cpgz", ".cpio");
        linkedHashMap.put(".wmz", ".wmf");
        linkedHashMap.put(".emz", ".emf");
        linkedHashMap.put(".gz", "");
        linkedHashMap.put(".z", "");
        linkedHashMap.put("-gz", "");
        linkedHashMap.put("-z", "");
        linkedHashMap.put("_z", "");
        a = new e(linkedHashMap, ".gz");
    }
}

