/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import com.a.a.d.sz;
import java.util.Map;

public enum bt {
    a("legacy"),
    b("mojang");

    private static final Map c;
    private final String d;

    static {
        c = sz.c();
        for (bt bt2 : bt.values()) {
            c.put(bt2.d, bt2);
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bt() {
        void var3_1;
        this.d = var3_1;
    }

    public static bt a(String string) {
        return (bt)((Object)c.get(string.toLowerCase()));
    }
}

