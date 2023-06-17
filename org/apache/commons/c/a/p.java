/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.a;

import org.apache.commons.c.a.c;
import org.apache.commons.c.a.d;

class p
extends c {
    private static final long d = 1L;
    final /* synthetic */ byte a;
    final /* synthetic */ byte b;
    final /* synthetic */ d c;

    p(d d2, String string, byte by2, byte by3) {
        this.c = d2;
        this.a = by2;
        this.b = by3;
        super(string);
    }

    public Byte c() {
        return this.a;
    }

    public Byte d() {
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

