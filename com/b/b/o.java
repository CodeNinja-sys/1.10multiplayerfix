/*
 * Decompiled with CFR 0.150.
 */
package com.b.b;

import com.b.b.m;

class o {
    static final int a = 63;
    static final int b = 16;
    static final int c = 31;
    int d;
    int[] e = new int[31];
    int[] f = new int[16];
    int[] g = new int[16];
    int[] h = new int[16];
    int[][] i = new int[16][];
    int j;
    int[] k = new int[65];
    float l;
    float m;
    float n;
    int o;
    int p;
    int q;
    float r;
    int s;
    int t;
    int u;
    final /* synthetic */ m v;

    o(m m2) {
        this.v = m2;
        for (int i2 = 0; i2 < this.i.length; ++i2) {
            this.i[i2] = new int[8];
        }
    }

    void a() {
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.k = null;
    }

    Object b() {
        o o2 = this;
        o o3 = new o(this.v);
        o3.d = o2.d;
        System.arraycopy(o2.e, 0, o3.e, 0, 31);
        System.arraycopy(o2.f, 0, o3.f, 0, 16);
        System.arraycopy(o2.g, 0, o3.g, 0, 16);
        System.arraycopy(o2.h, 0, o3.h, 0, 16);
        for (int i2 = 0; i2 < 16; ++i2) {
            System.arraycopy(o2.i[i2], 0, o3.i[i2], 0, 8);
        }
        o3.j = o2.j;
        System.arraycopy(o2.k, 0, o3.k, 0, 65);
        o3.l = o2.l;
        o3.m = o2.m;
        o3.n = o2.n;
        o3.o = o2.o;
        o3.p = o2.p;
        o3.q = o2.q;
        o3.r = o2.r;
        o3.s = o2.s;
        o3.t = o2.t;
        o3.u = o2.u;
        return o3;
    }
}

