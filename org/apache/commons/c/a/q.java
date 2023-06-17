/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.a;

import org.apache.commons.c.a.c;
import org.apache.commons.c.a.d;

class q
extends c {
    private static final long d = 1L;
    final /* synthetic */ byte[] a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ d c;

    q(d d2, String string, byte[] arrby, byte[] arrby2) {
        this.c = d2;
        this.a = arrby;
        this.b = arrby2;
        super(string);
    }

    public Byte[] c() {
        return org.apache.commons.c.c.d(this.a);
    }

    public Byte[] d() {
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

