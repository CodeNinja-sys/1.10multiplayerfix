/*
 * Decompiled with CFR 0.150.
 */
package com.c.a;

import java.util.HashMap;
import java.util.Map;

public enum k {
    a("legacy"),
    b("mojang");

    private static final Map c;
    private final String d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private k() {
        void var3_1;
        this.d = var3_1;
    }

    public static k a(String string) {
        return (k)((Object)c.get(string.toLowerCase()));
    }

    public String a() {
        return this.d;
    }

    static {
        c = new HashMap();
        for (k k2 : k.values()) {
            c.put(k2.d, k2);
        }
    }
}

