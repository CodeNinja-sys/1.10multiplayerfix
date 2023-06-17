/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.b;

import com.ibm.icu.a.b.a.r;
import com.ibm.icu.a.b.e;
import com.ibm.icu.a.b.m;
import com.ibm.icu.a.b.n;
import com.ibm.icu.a.b.o;
import com.ibm.icu.a.b.q;
import com.ibm.icu.a.b.w;
import com.ibm.icu.a.b.x;
import java.util.TimeZone;

class d
implements com.ibm.icu.a.b.r {
    private r a;
    private e b;
    private static final short c = 255;

    d(r r2) {
        this.a = r2;
        this.b = new e(this);
    }

    static long a(x x2) {
        return x.l[x2.b];
    }

    public com.ibm.icu.a.b.r a(x x2, x x3) {
        int n2 = 0;
        for (int i2 = x3.b; i2 <= x2.b; ++i2) {
            n2 |= 1 << i2;
        }
        if (n2 == 0) {
            throw new IllegalArgumentException("range " + x2 + " to " + x3 + " is empty");
        }
        this.b = this.b.a(n2);
        return this;
    }

    public com.ibm.icu.a.b.r a(x x2, boolean bl2) {
        int n2 = this.b.b;
        n2 = bl2 ? (n2 |= 1 << x2.b) : (n2 &= ~(1 << x2.b));
        this.b = this.b.a(n2);
        return this;
    }

    public com.ibm.icu.a.b.r a(float f2) {
        this.b = this.b.a(f2);
        return this;
    }

    public com.ibm.icu.a.b.r b(float f2) {
        this.b = this.b.b(f2);
        return this;
    }

    public com.ibm.icu.a.b.r a(boolean bl2) {
        this.b = this.b.a(bl2);
        return this;
    }

    public com.ibm.icu.a.b.r b(boolean bl2) {
        this.b = this.b.b(bl2);
        return this;
    }

    public com.ibm.icu.a.b.r c(boolean bl2) {
        this.b = this.b.c(bl2);
        return this;
    }

    public com.ibm.icu.a.b.r a(String string) {
        this.b = this.b.a(string);
        return this;
    }

    public com.ibm.icu.a.b.r a(TimeZone timeZone) {
        return this;
    }

    private e c() {
        if (this.b.a() == 0) {
            return null;
        }
        return this.b.c();
    }

    public q b(x x2) {
        return m.a(x2, this.c());
    }

    public q a() {
        return w.b(this.c());
    }

    public q b() {
        return o.b(this.c());
    }

    public q a(int n2) {
        return n.a(n2, this.c());
    }

    static /* synthetic */ r a(d d2) {
        return d2.a;
    }
}

