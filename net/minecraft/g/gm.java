/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.u.at;

public enum gm implements at
{
    a(0, "sunflower"),
    b(1, "syringa"),
    c(2, "double_grass", "grass"),
    d(3, "double_fern", "fern"),
    e(4, "double_rose", "rose"),
    f(5, "paeonia");

    private static final gm[] g;
    private final int h;
    private final String i;
    private final String j;

    static {
        g = new gm[gm.values().length];
        gm[] arrgm = gm.values();
        int n2 = arrgm.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            gm gm2;
            gm.g[gm2.b()] = gm2 = arrgm[i2];
        }
    }

    /*
     * WARNING - void declaration
     */
    private gm() {
        this((String)var1_-1, (int)var2_-1, (int)var3_1, (String)var4_2, (String)var4_2);
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private gm(String string) {
        void var5_3;
        void var4_2;
        this.h = (int)string;
        this.i = var4_2;
        this.j = var5_3;
    }

    public int b() {
        return this.h;
    }

    public String toString() {
        return this.i;
    }

    public static gm a(int n2) {
        if (n2 < 0 || n2 >= g.length) {
            n2 = 0;
        }
        return g[n2];
    }

    @Override
    public String a() {
        return this.i;
    }

    public String c() {
        return this.j;
    }
}

