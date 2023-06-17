/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.cq;
import java.io.Serializable;

final class cn
implements Serializable {
    private static final long n = -7849612037842370168L;
    int a = -1;
    int b = -1;
    int c;
    int d;
    int e;
    int f;
    boolean g;
    int h = -1;
    int i;
    int j;
    int k;
    int l;
    boolean m;

    cn() {
    }

    void a(int n2, int n3, int n4, int n5, int n6, boolean bl2) {
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = n5;
        this.f = n6;
        this.g = bl2;
    }

    void b(int n2, int n3, int n4, int n5, int n6, boolean bl2) {
        this.h = n2;
        this.i = n3;
        this.j = n4;
        this.k = n5;
        this.l = n6;
        this.m = bl2;
    }

    void a(cq cq2) {
        if (this.a != -1) {
            cq2.b(this.a);
        }
        if (this.b != -1) {
            if (this.f == -1) {
                cq2.a(this.b, this.c, this.d, this.e);
            } else if (this.d == -1) {
                cq2.a(this.b, this.f, this.e);
            } else {
                cq2.a(this.b, this.f, this.d, this.e, this.g);
            }
        }
        if (this.h != -1) {
            if (this.l == -1) {
                cq2.b(this.h, this.i, this.j, this.k);
            } else if (this.j == -1) {
                cq2.b(this.h, this.l, this.k);
            } else {
                cq2.b(this.h, this.l, this.j, this.k, this.m);
            }
        }
    }
}

