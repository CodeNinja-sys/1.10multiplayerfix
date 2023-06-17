/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.i;

import net.minecraft.i.h;
import net.minecraft.u.b.n;
import net.minecraft.x.a;

public class g {
    public final int a;
    public final int b;
    public final int c;
    private final int n;
    public int d = -1;
    public float e;
    public float f;
    public float g;
    public g h;
    public boolean i;
    public float j;
    public float k;
    public float l;
    public h m = net.minecraft.i.h.a;

    public g(int n2, int n3, int n4) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.n = net.minecraft.i.g.b(n2, n3, n4);
    }

    public g a(int n2, int n3, int n4) {
        g g2 = new g(n2, n3, n4);
        g2.d = this.d;
        g2.e = this.e;
        g2.f = this.f;
        g2.g = this.g;
        g2.h = this.h;
        g2.i = this.i;
        g2.j = this.j;
        g2.k = this.k;
        g2.l = this.l;
        g2.m = this.m;
        return g2;
    }

    public static int b(int n2, int n3, int n4) {
        return n3 & 0xFF | (n2 & 0x7FFF) << 8 | (n4 & 0x7FFF) << 24 | (n2 < 0 ? Integer.MIN_VALUE : 0) | (n4 < 0 ? 32768 : 0);
    }

    public float a(g g2) {
        float f2 = g2.a - this.a;
        float f3 = g2.b - this.b;
        float f4 = g2.c - this.c;
        return net.minecraft.u.b.n.c(f2 * f2 + f3 * f3 + f4 * f4);
    }

    public float b(g g2) {
        float f2 = g2.a - this.a;
        float f3 = g2.b - this.b;
        float f4 = g2.c - this.c;
        return f2 * f2 + f3 * f3 + f4 * f4;
    }

    public float c(g g2) {
        float f2 = Math.abs(g2.a - this.a);
        float f3 = Math.abs(g2.b - this.b);
        float f4 = Math.abs(g2.c - this.c);
        return f2 + f3 + f4;
    }

    public boolean equals(Object object) {
        if (!(object instanceof g)) {
            return false;
        }
        g g2 = (g)object;
        return this.n == g2.n && this.a == g2.a && this.b == g2.b && this.c == g2.c;
    }

    public int hashCode() {
        return this.n;
    }

    public boolean a() {
        return this.d >= 0;
    }

    public String toString() {
        return String.valueOf(this.a) + ", " + this.b + ", " + this.c;
    }

    public static g a(a a2) {
        g g2 = new g(a2.K(), a2.K(), a2.K());
        g2.j = a2.O();
        g2.k = a2.O();
        g2.l = a2.O();
        g2.i = a2.D();
        g2.m = net.minecraft.i.h.values()[a2.K()];
        g2.g = a2.O();
        return g2;
    }
}

