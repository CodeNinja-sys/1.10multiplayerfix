/*
 * Decompiled with CFR 0.150.
 */
package com.b.b;

import com.b.b.a;
import com.b.b.ae;
import com.b.b.ao;
import com.b.b.c;
import com.b.b.s;
import com.b.b.v;

public class h {
    static final float a = (float)Math.PI;
    static final int b = 1;
    static final int c = 1;
    int d;
    v e;
    int f;
    float[][] g;
    int h;
    int i;
    int j;
    float[] k;
    int l;
    int m;
    int n;
    int o;
    int p;
    int q;
    int r;
    long s;
    long t;
    long u;
    long v;
    long w;
    long x;
    float[][][][][] y;
    Object[][] z = new Object[2][];
    c[] A;
    Object[] B;
    byte[] C;
    byte[] D;
    byte[] E;

    public h() {
        this.y = new float[2][][][][];
        this.y[0] = new float[2][][][];
        this.y[0][0] = new float[2][][];
        this.y[0][1] = new float[2][][];
        this.y[0][0][0] = new float[2][];
        this.y[0][0][1] = new float[2][];
        this.y[0][1][0] = new float[2][];
        this.y[0][1][1] = new float[2][];
        this.y[1] = new float[2][][][];
        this.y[1][0] = new float[2][][];
        this.y[1][1] = new float[2][][];
        this.y[1][0][0] = new float[2][];
        this.y[1][0][1] = new float[2][];
        this.y[1][1][0] = new float[2][];
        this.y[1][1][1] = new float[2][];
    }

    static float[] a(int n2, int n3, int n4, int n5) {
        float[] arrf = new float[n3];
        switch (n2) {
            case 0: {
                float f2;
                int n6;
                int n7 = n3 / 4 - n4 / 2;
                int n8 = n3 - n3 / 4 - n5 / 2;
                for (n6 = 0; n6 < n4; ++n6) {
                    f2 = (float)(((double)n6 + 0.5) / (double)n4 * 3.1415927410125732 / 2.0);
                    f2 = (float)Math.sin(f2);
                    f2 *= f2;
                    f2 = (float)((double)f2 * 1.5707963705062866);
                    arrf[n6 + n7] = f2 = (float)Math.sin(f2);
                }
                for (n6 = n7 + n4; n6 < n8; ++n6) {
                    arrf[n6] = 1.0f;
                }
                for (n6 = 0; n6 < n5; ++n6) {
                    f2 = (float)(((double)(n5 - n6) - 0.5) / (double)n5 * 3.1415927410125732 / 2.0);
                    f2 = (float)Math.sin(f2);
                    f2 *= f2;
                    f2 = (float)((double)f2 * 1.5707963705062866);
                    arrf[n6 + n8] = f2 = (float)Math.sin(f2);
                }
                break;
            }
            default: {
                return null;
            }
        }
        return arrf;
    }

    int a(v v2, boolean bl2) {
        int n2;
        this.e = v2;
        this.f = ao.b(v2.h);
        this.z[0] = new Object[1];
        this.z[1] = new Object[1];
        this.z[0][0] = new ae();
        this.z[1][0] = new ae();
        ((ae)this.z[0][0]).a(v2.g[0]);
        ((ae)this.z[1][0]).a(v2.g[1]);
        this.y[0][0][0] = new float[1][];
        this.y[0][0][1] = this.y[0][0][0];
        this.y[0][1][0] = this.y[0][0][0];
        this.y[0][1][1] = this.y[0][0][0];
        this.y[1][0][0] = new float[1][];
        this.y[1][0][1] = new float[1][];
        this.y[1][1][0] = new float[1][];
        this.y[1][1][1] = new float[1][];
        for (n2 = 0; n2 < 1; ++n2) {
            this.y[0][0][0][n2] = com.b.b.h.a(n2, v2.g[0], v2.g[0] / 2, v2.g[0] / 2);
            this.y[1][0][0][n2] = com.b.b.h.a(n2, v2.g[1], v2.g[0] / 2, v2.g[0] / 2);
            this.y[1][0][1][n2] = com.b.b.h.a(n2, v2.g[1], v2.g[0] / 2, v2.g[1] / 2);
            this.y[1][1][0][n2] = com.b.b.h.a(n2, v2.g[1], v2.g[1] / 2, v2.g[0] / 2);
            this.y[1][1][1][n2] = com.b.b.h.a(n2, v2.g[1], v2.g[1] / 2, v2.g[1] / 2);
        }
        this.A = new c[v2.m];
        for (n2 = 0; n2 < v2.m; ++n2) {
            this.A[n2] = new c();
            this.A[n2].a(v2.x[n2]);
        }
        this.h = 8192;
        this.g = new float[v2.b][];
        for (n2 = 0; n2 < v2.b; ++n2) {
            this.g[n2] = new float[this.h];
        }
        this.o = 0;
        this.p = 0;
        this.i = this.r = v2.g[1] / 2;
        this.B = new Object[v2.h];
        for (n2 = 0; n2 < v2.h; ++n2) {
            int n3 = v2.o[n2].d;
            int n4 = v2.p[n3];
            this.B[n2] = com.b.b.s.a[n4].a(this, v2.o[n2], v2.q[n3]);
        }
        return 0;
    }

    public int a(v v2) {
        this.a(v2, false);
        this.j = this.r;
        this.r -= v2.g[this.p] / 4 + v2.g[this.o] / 4;
        this.s = -1L;
        this.t = -1L;
        return 0;
    }

    h(v v2) {
        this();
        this.a(v2, false);
        this.j = this.r;
        this.r -= v2.g[this.p] / 4 + v2.g[this.o] / 4;
        this.s = -1L;
        this.t = -1L;
    }

    public int a(a a2) {
        int n2;
        int n3;
        int n4;
        if (this.r > this.e.g[1] / 2 && this.j > 8192) {
            n4 = this.r - this.e.g[1] / 2;
            n4 = this.j < n4 ? this.j : n4;
            this.i -= n4;
            this.r -= n4;
            this.j -= n4;
            if (n4 != 0) {
                for (n3 = 0; n3 < this.e.b; ++n3) {
                    System.arraycopy(this.g[n3], n4, this.g[n3], 0, this.i);
                }
            }
        }
        this.o = this.p;
        this.p = a2.d;
        this.q = -1;
        this.u += (long)a2.l;
        this.v += (long)a2.m;
        this.w += (long)a2.n;
        this.x += (long)a2.o;
        if (this.t + 1L != a2.j) {
            this.s = -1L;
        }
        this.t = a2.j;
        n4 = this.e.g[this.p];
        n3 = this.r + this.e.g[this.o] / 4 + n4 / 4;
        int n5 = n3 - n4 / 2;
        int n6 = n5 + n4;
        int n7 = 0;
        int n8 = 0;
        if (n6 > this.h) {
            this.h = n6 + this.e.g[1];
            for (n2 = 0; n2 < this.e.b; ++n2) {
                float[] arrf = new float[this.h];
                System.arraycopy(this.g[n2], 0, arrf, 0, this.g[n2].length);
                this.g[n2] = arrf;
            }
        }
        switch (this.p) {
            case 0: {
                n7 = 0;
                n8 = this.e.g[0] / 2;
                break;
            }
            case 1: {
                n7 = this.e.g[1] / 4 - this.e.g[this.o] / 4;
                n8 = n7 + this.e.g[this.o] / 2;
            }
        }
        for (n2 = 0; n2 < this.e.b; ++n2) {
            int n9 = n5;
            int n10 = 0;
            for (n10 = n7; n10 < n8; ++n10) {
                float[] arrf = this.g[n2];
                int n11 = n9 + n10;
                arrf[n11] = arrf[n11] + a2.a[n2][n10];
            }
            while (n10 < n4) {
                this.g[n2][n9 + n10] = a2.a[n2][n10];
                ++n10;
            }
        }
        if (this.s == -1L) {
            this.s = a2.i;
        } else {
            this.s += (long)(n3 - this.r);
            if (a2.i != -1L && this.s != a2.i) {
                if (this.s > a2.i && a2.h != 0) {
                    n3 = (int)((long)n3 - (this.s - a2.i));
                }
                this.s = a2.i;
            }
        }
        this.r = n3;
        this.i = n6;
        if (a2.h != 0) {
            this.n = 1;
        }
        return 0;
    }

    public int a(float[][][] arrf, int[] arrn) {
        if (this.j < this.r) {
            if (arrf != null) {
                for (int i2 = 0; i2 < this.e.b; ++i2) {
                    arrn[i2] = this.j;
                }
                arrf[0] = this.g;
            }
            return this.r - this.j;
        }
        return 0;
    }

    public int a(int n2) {
        if (n2 != 0 && this.j + n2 > this.r) {
            return -1;
        }
        this.j += n2;
        return 0;
    }

    public void a() {
    }
}

