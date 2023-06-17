/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.a;

import org.lwjgl.a.a;

class b {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    private a e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private long k;
    private float l;
    private float m;

    b(a a2, long l2, int n2, int n3, boolean bl2, boolean bl3) {
        this(a2, l2, n2, n3, false, bl2, bl3, 0.0f, 0.0f);
    }

    b(a a2, long l2, int n2, int n3, boolean bl2, boolean bl3, boolean bl4, float f2, float f3) {
        this.e = a2;
        this.k = l2;
        this.g = n2;
        this.f = n3;
        this.h = bl2;
        this.i = bl3;
        this.j = bl4;
        this.l = f2;
        this.m = f3;
    }

    public long a() {
        return this.k;
    }

    public a b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    public boolean d() {
        return this.g == 1;
    }

    public boolean e() {
        return this.h;
    }

    public boolean f() {
        return this.g == 2;
    }

    public boolean g() {
        return this.g == 4;
    }

    public boolean h() {
        return this.g == 3;
    }

    public boolean i() {
        return this.i;
    }

    public boolean j() {
        return this.j;
    }

    public float k() {
        return this.l;
    }

    public float l() {
        return this.m;
    }

    public String toString() {
        return "[" + this.e + " type=" + this.g + " xaxis=" + this.i + " yaxis=" + this.j + "]";
    }
}

