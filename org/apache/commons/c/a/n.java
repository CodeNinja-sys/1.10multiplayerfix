/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.a;

import org.apache.commons.c.a.c;
import org.apache.commons.c.a.d;

class n
extends c {
    private static final long d = 1L;
    final /* synthetic */ Object[] a;
    final /* synthetic */ Object[] b;
    final /* synthetic */ d c;

    n(d d2, String string, Object[] arrobject, Object[] arrobject2) {
        this.c = d2;
        this.a = arrobject;
        this.b = arrobject2;
        super(string);
    }

    public Object[] c() {
        return this.a;
    }

    public Object[] d() {
        return this.b;
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

