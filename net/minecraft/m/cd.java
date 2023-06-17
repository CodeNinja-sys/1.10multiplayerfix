/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.g.a.e;
import net.minecraft.u.at;
import net.minecraft.u.d.o;

public enum cd implements at
{
    a(0, 15, "white", "white", net.minecraft.g.a.e.j, net.minecraft.u.d.o.p),
    b(1, 14, "orange", "orange", net.minecraft.g.a.e.q, net.minecraft.u.d.o.g),
    c(2, 13, "magenta", "magenta", net.minecraft.g.a.e.r, net.minecraft.u.d.o.l),
    d(3, 12, "light_blue", "lightBlue", net.minecraft.g.a.e.s, net.minecraft.u.d.o.j),
    e(4, 11, "yellow", "yellow", net.minecraft.g.a.e.t, net.minecraft.u.d.o.o),
    f(5, 10, "lime", "lime", net.minecraft.g.a.e.u, net.minecraft.u.d.o.k),
    g(6, 9, "pink", "pink", net.minecraft.g.a.e.v, net.minecraft.u.d.o.n),
    h(7, 8, "gray", "gray", net.minecraft.g.a.e.w, net.minecraft.u.d.o.i),
    i(8, 7, "silver", "silver", net.minecraft.g.a.e.x, net.minecraft.u.d.o.h),
    j(9, 6, "cyan", "cyan", net.minecraft.g.a.e.y, net.minecraft.u.d.o.d),
    k(10, 5, "purple", "purple", net.minecraft.g.a.e.z, net.minecraft.u.d.o.f),
    l(11, 4, "blue", "blue", net.minecraft.g.a.e.A, net.minecraft.u.d.o.b),
    m(12, 3, "brown", "brown", net.minecraft.g.a.e.B, net.minecraft.u.d.o.g),
    n(13, 2, "green", "green", net.minecraft.g.a.e.C, net.minecraft.u.d.o.c),
    o(14, 1, "red", "red", net.minecraft.g.a.e.D, net.minecraft.u.d.o.e),
    p(15, 0, "black", "black", net.minecraft.g.a.e.E, net.minecraft.u.d.o.a);

    private static final cd[] q;
    private static final cd[] r;
    private final int s;
    private final int t;
    private final String u;
    private final String v;
    private final e w;
    private final o x;

    static {
        q = new cd[cd.values().length];
        r = new cd[cd.values().length];
        cd[] arrcd = cd.values();
        int n2 = arrcd.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            cd cd2;
            cd.q[cd2.b()] = cd2 = arrcd[i2];
            cd.r[cd2.c()] = cd2;
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cd(String string, String string2, e e2, o o2) {
        void var8_6;
        void var7_5;
        this.s = (int)string;
        this.t = (int)string2;
        this.u = e2;
        this.v = o2;
        this.w = var7_5;
        this.x = var8_6;
    }

    public int b() {
        return this.s;
    }

    public int c() {
        return this.t;
    }

    public String d() {
        return this.v;
    }

    public e e() {
        return this.w;
    }

    public static cd a(int n2) {
        if (n2 < 0 || n2 >= r.length) {
            n2 = 0;
        }
        return r[n2];
    }

    public static cd b(int n2) {
        if (n2 < 0 || n2 >= q.length) {
            n2 = 0;
        }
        return q[n2];
    }

    public String toString() {
        return this.v;
    }

    @Override
    public String a() {
        return this.u;
    }
}

