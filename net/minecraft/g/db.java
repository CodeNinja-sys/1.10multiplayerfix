/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.g.a.e;
import net.minecraft.u.at;

public enum db implements at
{
    a(0, net.minecraft.g.a.e.m, "stone"),
    b(1, net.minecraft.g.a.e.l, "granite"),
    c(2, net.minecraft.g.a.e.l, "smooth_granite", "graniteSmooth"),
    d(3, net.minecraft.g.a.e.p, "diorite"),
    e(4, net.minecraft.g.a.e.p, "smooth_diorite", "dioriteSmooth"),
    f(5, net.minecraft.g.a.e.m, "andesite"),
    g(6, net.minecraft.g.a.e.m, "smooth_andesite", "andesiteSmooth");

    private static final db[] h;
    private final int i;
    private final String j;
    private final String k;
    private final e l;

    static {
        h = new db[db.values().length];
        db[] arrdb = db.values();
        int n2 = arrdb.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            db db2;
            db.h[db2.b()] = db2 = arrdb[i2];
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private db(String string) {
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
    private db(String string, String string2) {
        void var6_4;
        void var5_3;
        this.i = (int)string;
        this.j = var5_3;
        this.k = var6_4;
        this.l = string2;
    }

    public int b() {
        return this.i;
    }

    public e c() {
        return this.l;
    }

    public String toString() {
        return this.j;
    }

    public static db a(int n2) {
        if (n2 < 0 || n2 >= h.length) {
            n2 = 0;
        }
        return h[n2];
    }

    @Override
    public String a() {
        return this.j;
    }

    public String d() {
        return this.k;
    }
}

