/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.g.a.e;
import net.minecraft.u.at;

public enum el implements at
{
    a(0, net.minecraft.g.a.e.m, "stone"),
    b(1, net.minecraft.g.a.e.d, "sandstone", "sand"),
    c(2, net.minecraft.g.a.e.o, "wood_old", "wood"),
    d(3, net.minecraft.g.a.e.m, "cobblestone", "cobble"),
    e(4, net.minecraft.g.a.e.D, "brick"),
    f(5, net.minecraft.g.a.e.m, "stone_brick", "smoothStoneBrick"),
    g(6, net.minecraft.g.a.e.K, "nether_brick", "netherBrick"),
    h(7, net.minecraft.g.a.e.p, "quartz");

    private static final el[] i;
    private final int j;
    private final e k;
    private final String l;
    private final String m;

    static {
        i = new el[el.values().length];
        el[] arrel = el.values();
        int n2 = arrel.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            el el2;
            el.i[el2.b()] = el2 = arrel[i2];
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private el(String string) {
        this((String)var1_-1, (int)var2_-1, (int)string, (e)var4_2, (String)var5_3, (String)var5_3);
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private el(String string, String string2) {
        void var6_4;
        void var5_3;
        this.j = (int)string;
        this.k = string2;
        this.l = var5_3;
        this.m = var6_4;
    }

    public int b() {
        return this.j;
    }

    public e c() {
        return this.k;
    }

    public String toString() {
        return this.l;
    }

    public static el a(int n2) {
        if (n2 < 0 || n2 >= i.length) {
            n2 = 0;
        }
        return i[n2];
    }

    @Override
    public String a() {
        return this.l;
    }

    public String d() {
        return this.m;
    }
}

