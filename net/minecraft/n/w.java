/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import java.util.Random;
import net.minecraft.g.a.h;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.u.b.n;

class w {
    double a;
    double b;

    w() {
    }

    w(double d2, double d3) {
        this.a = d2;
        this.b = d3;
    }

    double a(w w2) {
        double d2 = this.a - w2.a;
        double d3 = this.b - w2.b;
        return Math.sqrt(d2 * d2 + d3 * d3);
    }

    void a() {
        double d2 = this.b();
        this.a /= d2;
        this.b /= d2;
    }

    float b() {
        return n.a(this.a * this.a + this.b * this.b);
    }

    public void b(w w2) {
        this.a -= w2.a;
        this.b -= w2.b;
    }

    public boolean a(double d2, double d3, double d4, double d5) {
        boolean bl2 = false;
        if (this.a < d2) {
            this.a = d2;
            bl2 = true;
        } else if (this.a > d4) {
            this.a = d4;
            bl2 = true;
        }
        if (this.b < d3) {
            this.b = d3;
            bl2 = true;
        } else if (this.b > d5) {
            this.b = d5;
            bl2 = true;
        }
        return bl2;
    }

    public int a(k k2) {
        b b2 = new b(this.a, 256.0, this.b);
        while (b2.k() > 0) {
            if (k2.n(b2 = b2.c()).d() == h.a) continue;
            return b2.k() + 1;
        }
        return 257;
    }

    public boolean b(k k2) {
        b b2 = new b(this.a, 256.0, this.b);
        while (b2.k() > 0) {
            h h2 = k2.n(b2 = b2.c()).d();
            if (h2 == h.a) continue;
            return !h2.d() && h2 != h.o;
        }
        return false;
    }

    public void a(Random random, double d2, double d3, double d4, double d5) {
        this.a = n.a(random, d2, d4);
        this.b = n.a(random, d3, d5);
    }
}

