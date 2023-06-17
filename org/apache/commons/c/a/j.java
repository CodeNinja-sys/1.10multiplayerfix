/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.a;

import org.apache.commons.c.a.c;
import org.apache.commons.c.a.d;

class j
extends c {
    private static final long d = 1L;
    final /* synthetic */ long[] a;
    final /* synthetic */ long[] b;
    final /* synthetic */ d c;

    j(d d2, String string, long[] arrl, long[] arrl2) {
        this.c = d2;
        this.a = arrl;
        this.b = arrl2;
        super(string);
    }

    public Long[] c() {
        return org.apache.commons.c.c.d(this.a);
    }

    public Long[] d() {
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

