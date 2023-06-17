/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.j;

import com.a.a.d.sz;
import java.util.Map;

public enum n {
    a("always", 0),
    b("never", 1),
    c("hideForOtherTeams", 2),
    d("hideForOwnTeam", 3);

    private static final Map g;
    public final String e;
    public final int f;

    static {
        g = sz.c();
        for (n n2 : n.values()) {
            g.put(n2.e, n2);
        }
    }

    public static String[] a() {
        return g.keySet().toArray(new String[g.size()]);
    }

    public static n a(String string) {
        return (n)((Object)g.get(string));
    }

    /*
     * WARNING - void declaration
     */
    private n() {
        void var4_2;
        void var3_1;
        this.e = var3_1;
        this.f = var4_2;
    }
}

