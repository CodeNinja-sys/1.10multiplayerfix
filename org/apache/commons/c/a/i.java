/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.a;

import org.apache.commons.c.a.c;
import org.apache.commons.c.a.d;

class i
extends c {
    private static final long d = 1L;
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ d c;

    i(d d2, String string, long l2, long l3) {
        this.c = d2;
        this.a = l2;
        this.b = l3;
        super(string);
    }

    public Long c() {
        return this.a;
    }

    public Long d() {
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

