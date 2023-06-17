/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.a;

import org.apache.commons.c.a.c;
import org.apache.commons.c.a.d;

class h
extends c {
    private static final long d = 1L;
    final /* synthetic */ int[] a;
    final /* synthetic */ int[] b;
    final /* synthetic */ d c;

    h(d d2, String string, int[] arrn, int[] arrn2) {
        this.c = d2;
        this.a = arrn;
        this.b = arrn2;
        super(string);
    }

    public Integer[] c() {
        return org.apache.commons.c.c.d(this.a);
    }

    public Integer[] d() {
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

