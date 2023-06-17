/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.b;

import com.ibm.icu.a.b.x;

public final class p {
    final byte a;
    final boolean b;
    final int[] c;

    public static p a(float f2, x x2) {
        p.a(f2);
        return new p(0, false, f2, x2);
    }

    public static p b(float f2, x x2) {
        p.a(f2);
        return new p(2, false, f2, x2);
    }

    public static p c(float f2, x x2) {
        p.a(f2);
        return new p(1, false, f2, x2);
    }

    public p d(float f2, x x2) {
        p.a(f2);
        return this.a(x2, f2);
    }

    public p a(x x2) {
        return this.a(x2, 0);
    }

    public p a() {
        return this.a((byte)0);
    }

    public p b() {
        return this.a((byte)2);
    }

    public p c() {
        return this.a((byte)1);
    }

    public p d() {
        return this.c(true);
    }

    public p e() {
        return this.c(false);
    }

    public p a(boolean bl2) {
        return this.c(bl2);
    }

    public p b(boolean bl2) {
        return this.c(!bl2);
    }

    public boolean f() {
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            if (this.c[i2] == 0) continue;
            return true;
        }
        return false;
    }

    public boolean b(x x2) {
        return this.c[x2.b] > 0;
    }

    public float c(x x2) {
        byte by2 = x2.b;
        if (this.c[by2] == 0) {
            return 0.0f;
        }
        return (float)(this.c[by2] - 1) / 1000.0f;
    }

    public boolean g() {
        return this.b;
    }

    public boolean h() {
        return !this.b;
    }

    public boolean i() {
        return this.a == 2;
    }

    public boolean j() {
        return this.a == 1;
    }

    public boolean equals(Object object) {
        try {
            return this.a((p)object);
        }
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    public boolean a(p p2) {
        if (p2 != null && this.a == p2.a && this.b == p2.b) {
            for (int i2 = 0; i2 < this.c.length; ++i2) {
                if (this.c[i2] == p2.c[i2]) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int n2 = this.a << 1 | (this.b ? 1 : 0);
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            n2 = n2 << 2 ^ this.c[i2];
        }
        return n2;
    }

    private p(int n2, boolean bl2, float f2, x x2) {
        this.a = (byte)n2;
        this.b = bl2;
        this.c = new int[x.k.length];
        this.c[x2.b] = (int)(f2 * 1000.0f) + 1;
    }

    p(int n2, boolean bl2, int[] arrn) {
        this.a = (byte)n2;
        this.b = bl2;
        this.c = arrn;
    }

    private p a(x x2, float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("value: " + f2);
        }
        return this.a(x2, (int)(f2 * 1000.0f) + 1);
    }

    private p a(x x2, int n2) {
        byte by2 = x2.b;
        if (this.c[by2] != n2) {
            int[] arrn = new int[this.c.length];
            for (int i2 = 0; i2 < this.c.length; ++i2) {
                arrn[i2] = this.c[i2];
            }
            arrn[by2] = n2;
            return new p(this.a, this.b, arrn);
        }
        return this;
    }

    private p c(boolean bl2) {
        if (this.b != bl2) {
            return new p(this.a, bl2, this.c);
        }
        return this;
    }

    private p a(byte by2) {
        if (this.a != by2) {
            return new p(by2, this.b, this.c);
        }
        return this;
    }

    private static void a(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("count (" + f2 + ") cannot be negative");
        }
    }
}

