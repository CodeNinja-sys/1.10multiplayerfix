/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.b;

import io.netty.b.g;
import io.netty.c.a.d.b.m;

class n {
    byte[] a;
    int b;
    int c;
    int d;
    int e;
    g f;

    n(g g2) {
        if (!g2.W()) {
            throw new m();
        }
        this.f = g2;
        this.a = g2.X();
        this.b = g2.p();
        this.d = this.c = g2.Y() + this.b;
        this.e = g2.Y() + g2.q();
    }

    void a(int n2) {
        this.c -= n2;
        this.b = this.b(this.c);
        this.f.g(this.b);
    }

    int b(int n2) {
        return n2 - this.d + this.b;
    }

    void a() {
        this.f = null;
        this.a = null;
        this.e = 0;
        this.c = 0;
        this.b = 0;
    }
}

