/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import net.minecraft.g.b;

public enum t {
    a(net.minecraft.g.b.a.b(), "oak"),
    b(net.minecraft.g.b.b.b(), "spruce"),
    c(net.minecraft.g.b.c.b(), "birch"),
    d(net.minecraft.g.b.d.b(), "jungle"),
    e(net.minecraft.g.b.e.b(), "acacia"),
    f(net.minecraft.g.b.f.b(), "dark_oak");

    private final String g;
    private final int h;

    /*
     * WARNING - void declaration
     */
    private t() {
        void var3_1;
        void var4_2;
        this.g = var4_2;
        this.h = var3_1;
    }

    public String a() {
        return this.g;
    }

    public int b() {
        return this.h;
    }

    public String toString() {
        return this.g;
    }

    public static t a(int n2) {
        if (n2 < 0 || n2 >= t.values().length) {
            n2 = 0;
        }
        return t.values()[n2];
    }

    public static t a(String string) {
        for (int i2 = 0; i2 < t.values().length; ++i2) {
            if (!t.values()[i2].a().equals(string)) continue;
            return t.values()[i2];
        }
        return t.values()[0];
    }
}

