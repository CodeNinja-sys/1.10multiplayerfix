/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.j;

import com.a.a.d.sz;
import java.util.Map;

public enum b {
    a("always", 0),
    b("never", 1),
    c("pushOtherTeams", 2),
    d("pushOwnTeam", 3);

    private static final Map g;
    public final String e;
    public final int f;

    static {
        g = sz.c();
        for (b b2 : net.minecraft.j.b.values()) {
            g.put(b2.e, b2);
        }
    }

    public static String[] a() {
        return g.keySet().toArray(new String[g.size()]);
    }

    public static b a(String string) {
        return (b)((Object)g.get(string));
    }

    /*
     * WARNING - void declaration
     */
    private b() {
        void var4_2;
        void var3_1;
        this.e = var3_1;
        this.f = var4_2;
    }
}

