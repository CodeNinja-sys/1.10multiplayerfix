/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.a;

import org.apache.commons.c.a.c;
import org.apache.commons.c.a.d;

class o
extends c {
    private static final long d = 1L;
    final /* synthetic */ boolean[] a;
    final /* synthetic */ boolean[] b;
    final /* synthetic */ d c;

    o(d d2, String string, boolean[] arrbl, boolean[] arrbl2) {
        this.c = d2;
        this.a = arrbl;
        this.b = arrbl2;
        super(string);
    }

    public Boolean[] c() {
        return org.apache.commons.c.c.d(this.a);
    }

    public Boolean[] d() {
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

