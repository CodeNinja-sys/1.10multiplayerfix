/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.u.at;

public enum t implements at
{
    a(0, "dead_bush"),
    b(1, "tall_grass"),
    c(2, "fern");

    private static final t[] d;
    private final int e;
    private final String f;

    static {
        d = new t[t.values().length];
        t[] arrt = t.values();
        int n2 = arrt.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            t t2;
            t.d[t2.b()] = t2 = arrt[i2];
        }
    }

    /*
     * WARNING - void declaration
     */
    private t() {
        void var4_2;
        void var3_1;
        this.e = var3_1;
        this.f = var4_2;
    }

    public int b() {
        return this.e;
    }

    public String toString() {
        return this.f;
    }

    public static t a(int n2) {
        if (n2 < 0 || n2 >= d.length) {
            n2 = 0;
        }
        return d[n2];
    }

    @Override
    public String a() {
        return this.f;
    }
}

