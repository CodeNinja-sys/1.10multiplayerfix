/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.e;

import com.a.a.b.cl;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public final class b {
    private final char[][] a;
    private static final char[][] b = new char[0][0];

    public static b a(Map map) {
        return new b(com.a.a.e.b.b(map));
    }

    private b(char[][] arrc) {
        this.a = arrc;
    }

    char[][] a() {
        return this.a;
    }

    static char[][] b(Map map) {
        cl.a(map);
        if (map.isEmpty()) {
            return b;
        }
        char c2 = ((Character)Collections.max(map.keySet())).charValue();
        char[][] arrarrc = new char[c2 + '\u0001'][];
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            char c3 = ((Character)iterator.next()).charValue();
            arrarrc[c3] = ((String)map.get(Character.valueOf(c3))).toCharArray();
        }
        return arrarrc;
    }
}

