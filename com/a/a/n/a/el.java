/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.eg;
import com.a.a.n.a.ej;
import java.util.concurrent.TimeUnit;

class el
extends eg {
    final long d;
    private double e;
    private double f;

    el(ej ej2, long l2, TimeUnit timeUnit) {
        super(ej2, null);
        this.d = timeUnit.toMicros(l2);
    }

    @Override
    void a(double d2, double d3) {
        double d4 = this.b;
        this.b = (double)this.d / d3;
        this.f = this.b / 2.0;
        double d5 = d3 * 3.0;
        this.e = (d5 - d3) / this.f;
        this.a = d4 == Double.POSITIVE_INFINITY ? 0.0 : (d4 == 0.0 ? this.b : this.a * this.b / d4);
    }

    @Override
    long b(double d2, double d3) {
        double d4 = d2 - this.f;
        long l2 = 0L;
        if (d4 > 0.0) {
            double d5 = Math.min(d4, d3);
            l2 = (long)(d5 * (this.c(d4) + this.c(d4 - d5)) / 2.0);
            d3 -= d5;
        }
        l2 = (long)((double)l2 + this.c * d3);
        return l2;
    }

    private double c(double d2) {
        return this.c + d2 * this.e;
    }
}

