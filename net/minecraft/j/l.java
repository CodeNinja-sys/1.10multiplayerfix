/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.j;

import com.a.a.d.sz;
import java.util.Map;

public enum l {
    a("integer"),
    b("hearts");

    private static final Map c;
    private final String d;

    static {
        c = sz.c();
        for (l l2 : l.values()) {
            c.put(l2.a(), l2);
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private l() {
        void var3_1;
        this.d = var3_1;
    }

    public String a() {
        return this.d;
    }

    public static l a(String string) {
        l l2 = (l)((Object)c.get(string));
        return l2 == null ? a : l2;
    }
}

