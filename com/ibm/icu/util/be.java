/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import java.util.HashMap;
import java.util.Map;

public enum be {
    a,
    b,
    c;

    private static Map d;

    public static be a(String string) {
        be be2 = (be)((Object)d.get(string));
        if (be2 == null) {
            throw new IllegalArgumentException("Unknown gender style name: " + string);
        }
        return be2;
    }

    static {
        d = new HashMap(3);
        d.put("neutral", a);
        d.put("maleTaints", c);
        d.put("mixedNeutral", b);
    }
}

