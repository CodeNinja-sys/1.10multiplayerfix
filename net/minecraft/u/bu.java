/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import com.a.a.d.sz;
import java.util.Map;
import java.util.Set;

public enum bu {
    a("master"),
    b("music"),
    c("record"),
    d("weather"),
    e("block"),
    f("hostile"),
    g("neutral"),
    h("player"),
    i("ambient"),
    j("voice");

    private static final Map k;
    private final String l;

    static {
        k = sz.c();
        for (bu bu2 : bu.values()) {
            if (k.containsKey(bu2.a())) {
                throw new Error("Clash in Sound Category name pools! Cannot insert " + (Object)((Object)bu2));
            }
            k.put(bu2.a(), bu2);
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bu() {
        void var3_1;
        this.l = var3_1;
    }

    public String a() {
        return this.l;
    }

    public static bu a(String string) {
        return (bu)((Object)k.get(string));
    }

    public static Set b() {
        return k.keySet();
    }
}

