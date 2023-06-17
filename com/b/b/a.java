/*
 * Decompiled with CFR 0.150.
 */
package com.b.b;

import com.b.a.b;
import com.b.b.h;
import com.b.b.s;
import com.b.b.v;

public class a {
    float[][] a = new float[0][];
    com.b.a.a b = new com.b.a.a();
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    long i;
    long j;
    h k;
    int l;
    int m;
    int n;
    int o;

    public a(h h2) {
        this.k = h2;
        if (h2.d != 0) {
            this.b.a();
        }
    }

    public void a(h h2) {
        this.k = h2;
    }

    public int a() {
        if (this.k != null && this.k.d != 0) {
            this.b.c();
        }
        return 0;
    }

    public int a(b b2) {
        int n2;
        v v2 = this.k.e;
        this.b.a(b2.a, b2.b, b2.c);
        if (this.b.c(1) != 0) {
            return -1;
        }
        int n3 = this.b.c(this.k.f);
        if (n3 == -1) {
            return -1;
        }
        this.g = n3;
        this.d = v2.o[this.g].a;
        if (this.d != 0) {
            this.c = this.b.c(1);
            this.e = this.b.c(1);
            if (this.e == -1) {
                return -1;
            }
        } else {
            this.c = 0;
            this.e = 0;
        }
        this.i = b2.f;
        this.j = b2.g - 3L;
        this.h = b2.e;
        this.f = v2.g[this.d];
        if (this.a.length < v2.b) {
            this.a = new float[v2.b][];
        }
        for (n2 = 0; n2 < v2.b; ++n2) {
            if (this.a[n2] == null || this.a[n2].length < this.f) {
                this.a[n2] = new float[this.f];
                continue;
            }
            for (int i2 = 0; i2 < this.f; ++i2) {
                this.a[n2][i2] = 0.0f;
            }
        }
        n2 = v2.p[v2.o[this.g].d];
        return s.a[n2].a(this, this.k.B[this.g]);
    }
}

