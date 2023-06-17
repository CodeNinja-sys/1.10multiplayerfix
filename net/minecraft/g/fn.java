/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.u.at;

public enum fn implements at
{
    a(0, "default", "default"),
    b(1, "chiseled", "chiseled"),
    c(2, "lines_y", "lines"),
    d(3, "lines_x", "lines"),
    e(4, "lines_z", "lines");

    private static final fn[] f;
    private final int g;
    private final String h;
    private final String i;

    static {
        f = new fn[fn.values().length];
        fn[] arrfn = fn.values();
        int n2 = arrfn.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            fn fn2;
            fn.f[fn2.b()] = fn2 = arrfn[i2];
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private fn(String string) {
        void var5_3;
        void var4_2;
        this.g = (int)string;
        this.h = var4_2;
        this.i = var5_3;
    }

    public int b() {
        return this.g;
    }

    public String toString() {
        return this.i;
    }

    public static fn a(int n2) {
        if (n2 < 0 || n2 >= f.length) {
            n2 = 0;
        }
        return f[n2];
    }

    @Override
    public String a() {
        return this.h;
    }
}

