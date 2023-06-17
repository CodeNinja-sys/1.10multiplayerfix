/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.a;

import org.apache.commons.c.a.c;
import org.apache.commons.c.a.d;

class f
extends c {
    private static final long d = 1L;
    final /* synthetic */ float[] a;
    final /* synthetic */ float[] b;
    final /* synthetic */ d c;

    f(d d2, String string, float[] arrf, float[] arrf2) {
        this.c = d2;
        this.a = arrf;
        this.b = arrf2;
        super(string);
    }

    public Float[] c() {
        return org.apache.commons.c.c.d(this.a);
    }

    public Float[] d() {
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

