/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.b;

import net.minecraft.u.b.b;
import net.minecraft.w.n;

public class m {
    public final int a;
    public final int b;

    public m(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public m(b b2) {
        this.a = b2.cy_() >> 4;
        this.b = b2.l() >> 4;
    }

    public static long a(int n2, int n3) {
        return (long)n2 & 0xFFFFFFFFL | ((long)n3 & 0xFFFFFFFFL) << 32;
    }

    public int hashCode() {
        int n2 = 1664525 * this.a + 1013904223;
        int n3 = 1664525 * (this.b ^ 0xDEADBEEF) + 1013904223;
        return n2 ^ n3;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof m)) {
            return false;
        }
        m m2 = (m)object;
        return this.a == m2.a && this.b == m2.b;
    }

    public double a(n n2) {
        double d2 = this.a * 16 + 8;
        double d3 = this.b * 16 + 8;
        double d4 = d2 - n2.aU;
        double d5 = d3 - n2.aW;
        return d4 * d4 + d5 * d5;
    }

    public int a() {
        return (this.a << 4) + 8;
    }

    public int b() {
        return (this.b << 4) + 8;
    }

    public int c() {
        return this.a << 4;
    }

    public int d() {
        return this.b << 4;
    }

    public int e() {
        return (this.a << 4) + 15;
    }

    public int f() {
        return (this.b << 4) + 15;
    }

    public b a(int n2, int n3, int n4) {
        return new b((this.a << 4) + n2, n3, (this.b << 4) + n4);
    }

    public b a(int n2) {
        return new b(this.a(), n2, this.b());
    }

    public String toString() {
        return "[" + this.a + ", " + this.b + "]";
    }
}

