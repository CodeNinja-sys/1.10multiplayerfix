/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.h.au;

public enum k {
    a(au.a, 0, 0, "mainhand"),
    b(au.a, 1, 5, "offhand"),
    c(au.b, 0, 1, "feet"),
    d(au.b, 1, 2, "legs"),
    e(au.b, 2, 3, "chest"),
    f(au.b, 3, 4, "head");

    private final au g;
    private final int h;
    private final int i;
    private final String j;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private k(int n2, String string) {
        void var6_4;
        void var5_3;
        this.g = (au)n2;
        this.h = (int)string;
        this.i = var5_3;
        this.j = var6_4;
    }

    public au a() {
        return this.g;
    }

    public int b() {
        return this.h;
    }

    public int c() {
        return this.i;
    }

    public String d() {
        return this.j;
    }

    public static k a(String string) {
        for (k k2 : net.minecraft.h.k.values()) {
            if (!k2.d().equals(string)) continue;
            return k2;
        }
        throw new IllegalArgumentException("Invalid slot '" + string + "'");
    }
}

