/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.u.at;

public enum by implements at
{
    a(0, "north_south"),
    b(1, "east_west"),
    c(2, "ascending_east"),
    d(3, "ascending_west"),
    e(4, "ascending_north"),
    f(5, "ascending_south"),
    g(6, "south_east"),
    h(7, "south_west"),
    i(8, "north_west"),
    j(9, "north_east");

    private static final by[] k;
    private final int l;
    private final String m;

    static {
        k = new by[by.values().length];
        by[] arrby = by.values();
        int n2 = arrby.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            by by2;
            by.k[by2.b()] = by2 = arrby[i2];
        }
    }

    /*
     * WARNING - void declaration
     */
    private by() {
        void var4_2;
        void var3_1;
        this.l = var3_1;
        this.m = var4_2;
    }

    public int b() {
        return this.l;
    }

    public String toString() {
        return this.m;
    }

    public boolean c() {
        return this == e || this == c || this == f || this == d;
    }

    public static by a(int n2) {
        if (n2 < 0 || n2 >= k.length) {
            n2 = 0;
        }
        return k[n2];
    }

    @Override
    public String a() {
        return this.m;
    }
}

