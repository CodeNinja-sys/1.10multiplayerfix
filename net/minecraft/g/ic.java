/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.g.a.e;
import net.minecraft.u.at;

public enum ic implements at
{
    a(0, "dirt", "default", net.minecraft.g.a.e.l),
    b(1, "coarse_dirt", "coarse", net.minecraft.g.a.e.l),
    c(2, "podzol", net.minecraft.g.a.e.J);

    private static final ic[] d;
    private final int e;
    private final String f;
    private final String g;
    private final e h;

    static {
        d = new ic[ic.values().length];
        ic[] arric = ic.values();
        int n2 = arric.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            ic ic2;
            ic.d[ic2.b()] = ic2 = arric[i2];
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ic(e e2) {
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
    private ic(String string, e e2) {
        void var6_4;
        void var5_3;
        this.e = (int)string;
        this.f = e2;
        this.g = var5_3;
        this.h = var6_4;
    }

    public int b() {
        return this.e;
    }

    public String c() {
        return this.g;
    }

    public e d() {
        return this.h;
    }

    public String toString() {
        return this.f;
    }

    public static ic a(int n2) {
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

