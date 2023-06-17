/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.a;

import org.apache.commons.c.a.c;
import org.apache.commons.c.a.d;

class u
extends c {
    private static final long d = 1L;
    final /* synthetic */ double[] a;
    final /* synthetic */ double[] b;
    final /* synthetic */ d c;

    u(d d2, String string, double[] arrd, double[] arrd2) {
        this.c = d2;
        this.a = arrd;
        this.b = arrd2;
        super(string);
    }

    public Double[] c() {
        return org.apache.commons.c.c.d(this.a);
    }

    public Double[] d() {
        return org.apache.commons.c.c.d(this.b);
    }

    @Override
    public /* synthetic */ Object e() {
        return this.d();
    }

    @Override
    public /* synthetic */ Object f() {
        return this.c();
    }
}

