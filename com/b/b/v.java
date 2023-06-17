/*
 * Decompiled with CFR 0.150.
 */
package com.b.b;

import com.b.a.a;
import com.b.a.b;
import com.b.b.af;
import com.b.b.am;
import com.b.b.ao;
import com.b.b.e;
import com.b.b.r;
import com.b.b.s;
import com.b.b.t;
import com.b.b.u;
import com.b.b.w;

public class v {
    private static final int C = -136;
    private static final int D = -135;
    private static byte[] E = "vorbis".getBytes();
    private static final int F = 1;
    private static final int G = 2;
    private static final int H = 3;
    private static final int I = 1;
    private static final int J = 1;
    public int a;
    public int b;
    public int c;
    int d;
    int e;
    int f;
    int[] g = new int[2];
    int h;
    int i;
    int j;
    int k;
    int l;
    int m;
    int n;
    w[] o = null;
    int[] p = null;
    Object[] q = null;
    int[] r = null;
    Object[] s = null;
    int[] t = null;
    Object[] u = null;
    int[] v = null;
    Object[] w = null;
    am[] x = null;
    af[] y = new af[64];
    int z;
    float A;
    float B;

    public void a() {
        this.c = 0;
    }

    public void b() {
        int n2;
        for (n2 = 0; n2 < this.h; ++n2) {
            this.o[n2] = null;
        }
        this.o = null;
        for (n2 = 0; n2 < this.i; ++n2) {
            com.b.b.s.a[this.p[n2]].a(this.q[n2]);
        }
        this.q = null;
        for (n2 = 0; n2 < this.j; ++n2) {
            com.b.b.u.a[this.r[n2]].a(this.s[n2]);
        }
        this.s = null;
        for (n2 = 0; n2 < this.k; ++n2) {
            com.b.b.r.c[this.t[n2]].b(this.u[n2]);
        }
        this.u = null;
        for (n2 = 0; n2 < this.l; ++n2) {
            com.b.b.t.a[this.v[n2]].a(this.w[n2]);
        }
        this.w = null;
        for (n2 = 0; n2 < this.m; ++n2) {
            if (this.x[n2] == null) continue;
            this.x[n2].a();
            this.x[n2] = null;
        }
        this.x = null;
        for (n2 = 0; n2 < this.n; ++n2) {
            this.y[n2].a();
        }
    }

    int a(a a2) {
        this.a = a2.c(32);
        if (this.a != 0) {
            return -1;
        }
        this.b = a2.c(8);
        this.c = a2.c(32);
        this.d = a2.c(32);
        this.e = a2.c(32);
        this.f = a2.c(32);
        this.g[0] = 1 << a2.c(4);
        this.g[1] = 1 << a2.c(4);
        if (this.c < 1 || this.b < 1 || this.g[0] < 8 || this.g[1] < this.g[0] || a2.c(1) != 1) {
            this.b();
            return -1;
        }
        return 0;
    }

    int b(a a2) {
        int n2;
        this.m = a2.c(8) + 1;
        if (this.x == null || this.x.length != this.m) {
            this.x = new am[this.m];
        }
        for (n2 = 0; n2 < this.m; ++n2) {
            this.x[n2] = new am();
            if (this.x[n2].b(a2) == 0) continue;
            this.b();
            return -1;
        }
        this.j = a2.c(6) + 1;
        if (this.r == null || this.r.length != this.j) {
            this.r = new int[this.j];
        }
        if (this.s == null || this.s.length != this.j) {
            this.s = new Object[this.j];
        }
        for (n2 = 0; n2 < this.j; ++n2) {
            this.r[n2] = a2.c(16);
            if (this.r[n2] < 0 || this.r[n2] >= 1) {
                this.b();
                return -1;
            }
            this.s[n2] = com.b.b.u.a[this.r[n2]].a(this, a2);
            if (this.s[n2] != null) continue;
            this.b();
            return -1;
        }
        this.k = a2.c(6) + 1;
        if (this.t == null || this.t.length != this.k) {
            this.t = new int[this.k];
        }
        if (this.u == null || this.u.length != this.k) {
            this.u = new Object[this.k];
        }
        for (n2 = 0; n2 < this.k; ++n2) {
            this.t[n2] = a2.c(16);
            if (this.t[n2] < 0 || this.t[n2] >= 2) {
                this.b();
                return -1;
            }
            this.u[n2] = com.b.b.r.c[this.t[n2]].a(this, a2);
            if (this.u[n2] != null) continue;
            this.b();
            return -1;
        }
        this.l = a2.c(6) + 1;
        if (this.v == null || this.v.length != this.l) {
            this.v = new int[this.l];
        }
        if (this.w == null || this.w.length != this.l) {
            this.w = new Object[this.l];
        }
        for (n2 = 0; n2 < this.l; ++n2) {
            this.v[n2] = a2.c(16);
            if (this.v[n2] < 0 || this.v[n2] >= 3) {
                this.b();
                return -1;
            }
            this.w[n2] = com.b.b.t.a[this.v[n2]].a(this, a2);
            if (this.w[n2] != null) continue;
            this.b();
            return -1;
        }
        this.i = a2.c(6) + 1;
        if (this.p == null || this.p.length != this.i) {
            this.p = new int[this.i];
        }
        if (this.q == null || this.q.length != this.i) {
            this.q = new Object[this.i];
        }
        for (n2 = 0; n2 < this.i; ++n2) {
            this.p[n2] = a2.c(16);
            if (this.p[n2] < 0 || this.p[n2] >= 1) {
                this.b();
                return -1;
            }
            this.q[n2] = com.b.b.s.a[this.p[n2]].a(this, a2);
            if (this.q[n2] != null) continue;
            this.b();
            return -1;
        }
        this.h = a2.c(6) + 1;
        if (this.o == null || this.o.length != this.h) {
            this.o = new w[this.h];
        }
        for (n2 = 0; n2 < this.h; ++n2) {
            this.o[n2] = new w();
            this.o[n2].a = a2.c(1);
            this.o[n2].b = a2.c(16);
            this.o[n2].c = a2.c(16);
            this.o[n2].d = a2.c(8);
            if (this.o[n2].b < 1 && this.o[n2].c < 1 && this.o[n2].d < this.i) continue;
            this.b();
            return -1;
        }
        if (a2.c(1) != 1) {
            this.b();
            return -1;
        }
        return 0;
    }

    public int a(e e2, b b2) {
        a a2 = new a();
        if (b2 != null) {
            a2.a(b2.a, b2.b, b2.c);
            byte[] arrby = new byte[6];
            int n2 = a2.c(8);
            a2.a(arrby, 6);
            if (arrby[0] != 118 || arrby[1] != 111 || arrby[2] != 114 || arrby[3] != 98 || arrby[4] != 105 || arrby[5] != 115) {
                return -1;
            }
            switch (n2) {
                case 1: {
                    if (b2.d == 0) {
                        return -1;
                    }
                    if (this.c != 0) {
                        return -1;
                    }
                    return this.a(a2);
                }
                case 3: {
                    if (this.c == 0) {
                        return -1;
                    }
                    return e2.a(a2);
                }
                case 5: {
                    if (this.c == 0 || e2.d == null) {
                        return -1;
                    }
                    return this.b(a2);
                }
            }
        }
        return -1;
    }

    int c(a a2) {
        a2.a(1, 8);
        a2.a(E);
        a2.a(0, 32);
        a2.a(this.b, 8);
        a2.a(this.c, 32);
        a2.a(this.d, 32);
        a2.a(this.e, 32);
        a2.a(this.f, 32);
        a2.a(ao.b(this.g[0]), 4);
        a2.a(ao.b(this.g[1]), 4);
        a2.a(1, 1);
        return 0;
    }

    int d(a a2) {
        int n2;
        a2.a(5, 8);
        a2.a(E);
        a2.a(this.m - 1, 8);
        for (n2 = 0; n2 < this.m; ++n2) {
            if (this.x[n2].a(a2) == 0) continue;
            return -1;
        }
        a2.a(this.j - 1, 6);
        for (n2 = 0; n2 < this.j; ++n2) {
            a2.a(this.r[n2], 16);
            com.b.b.u.a[this.r[n2]].a(this.s[n2], a2);
        }
        a2.a(this.k - 1, 6);
        for (n2 = 0; n2 < this.k; ++n2) {
            a2.a(this.t[n2], 16);
            com.b.b.r.c[this.t[n2]].a(this.u[n2], a2);
        }
        a2.a(this.l - 1, 6);
        for (n2 = 0; n2 < this.l; ++n2) {
            a2.a(this.v[n2], 16);
            com.b.b.t.a[this.v[n2]].a(this.w[n2], a2);
        }
        a2.a(this.i - 1, 6);
        for (n2 = 0; n2 < this.i; ++n2) {
            a2.a(this.p[n2], 16);
            com.b.b.s.a[this.p[n2]].a(this, this.q[n2], a2);
        }
        a2.a(this.h - 1, 6);
        for (n2 = 0; n2 < this.h; ++n2) {
            a2.a(this.o[n2].a, 1);
            a2.a(this.o[n2].b, 16);
            a2.a(this.o[n2].c, 16);
            a2.a(this.o[n2].d, 8);
        }
        a2.a(1, 1);
        return 0;
    }

    public int a(b b2) {
        a a2 = new a();
        a2.a(b2.a, b2.b, b2.c);
        if (a2.c(1) != 0) {
            return -135;
        }
        int n2 = 0;
        for (int i2 = this.h; i2 > 1; i2 >>>= 1) {
            ++n2;
        }
        int n3 = a2.c(n2);
        if (n3 == -1) {
            return -136;
        }
        return this.g[this.o[n3].a];
    }

    public String toString() {
        return "version:" + new Integer(this.a) + ", channels:" + new Integer(this.b) + ", rate:" + new Integer(this.c) + ", bitrate:" + new Integer(this.d) + "," + new Integer(this.e) + "," + new Integer(this.f);
    }
}

