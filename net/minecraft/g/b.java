/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.g.a.e;
import net.minecraft.u.at;

public enum b implements at
{
    a(0, "oak", net.minecraft.g.a.e.o),
    b(1, "spruce", net.minecraft.g.a.e.J),
    c(2, "birch", net.minecraft.g.a.e.d),
    d(3, "jungle", net.minecraft.g.a.e.l),
    e(4, "acacia", net.minecraft.g.a.e.q),
    f(5, "dark_oak", "big_oak", net.minecraft.g.a.e.B);

    private static final b[] g;
    private final int h;
    private final String i;
    private final String j;
    private final e k;

    static {
        g = new b[net.minecraft.g.b.values().length];
        b[] arrb = net.minecraft.g.b.values();
        int n2 = arrb.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            b b2;
            net.minecraft.g.b.g[b2.b()] = b2 = arrb[i2];
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b(e e2) {
        this((String)var1_-1, (int)var2_-1, (int)e2, (String)var4_2, (String)var4_2, (e)var5_3);
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b(String string, e e2) {
        void var6_4;
        void var5_3;
        this.h = (int)string;
        this.i = e2;
        this.j = var5_3;
        this.k = var6_4;
    }

    public int b() {
        return this.h;
    }

    public e c() {
        return this.k;
    }

    public String toString() {
        return this.i;
    }

    public static b a(int n2) {
        if (n2 < 0 || n2 >= g.length) {
            n2 = 0;
        }
        return g[n2];
    }

    @Override
    public String a() {
        return this.i;
    }

    public String d() {
        return this.j;
    }
}

