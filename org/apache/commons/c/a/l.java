/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.a;

import org.apache.commons.c.a.c;
import org.apache.commons.c.a.d;

class l
extends c {
    private static final long d = 1L;
    final /* synthetic */ short[] a;
    final /* synthetic */ short[] b;
    final /* synthetic */ d c;

    l(d d2, String string, short[] arrs, short[] arrs2) {
        this.c = d2;
        this.a = arrs;
        this.b = arrs2;
        super(string);
    }

    public Short[] c() {
        return org.apache.commons.c.c.d(this.a);
    }

    public Short[] d() {
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

