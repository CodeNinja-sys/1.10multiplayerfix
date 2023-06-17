/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import com.a.a.d.sz;
import java.util.Map;

public enum m {
    a(0, "MinecartRideable"),
    b(1, "MinecartChest"),
    c(2, "MinecartFurnace"),
    d(3, "MinecartTNT"),
    e(4, "MinecartSpawner"),
    f(5, "MinecartHopper"),
    g(6, "MinecartCommandBlock");

    private static final Map h;
    private final int i;
    private final String j;

    static {
        h = sz.c();
        for (m m2 : m.values()) {
            h.put(m2.a(), m2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private m() {
        void var4_2;
        void var3_1;
        this.i = var3_1;
        this.j = var4_2;
    }

    public int a() {
        return this.i;
    }

    public String b() {
        return this.j;
    }

    public static m a(int n2) {
        m m2 = (m)((Object)h.get(n2));
        return m2 == null ? a : m2;
    }
}

