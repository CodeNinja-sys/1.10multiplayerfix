/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.j;

import com.a.a.b.cl;
import com.a.a.j.d;
import com.a.a.j.f;

final class e {
    private long a = 0L;
    private double b = 0.0;

    private e() {
    }

    void a(double d2) {
        cl.a(f.c(d2));
        ++this.a;
        this.b += (d2 - this.b) / (double)this.a;
    }

    double a() {
        cl.a(this.a > 0L, (Object)"Cannot take mean of 0 values");
        return this.b;
    }

    /* synthetic */ e(d d2) {
        this();
    }
}

