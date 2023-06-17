/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.a;

import org.apache.commons.c.a.c;
import org.apache.commons.c.a.d;

class e
extends c {
    private static final long d = 1L;
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ d c;

    e(d d2, String string, boolean bl2, boolean bl3) {
        this.c = d2;
        this.a = bl2;
        this.b = bl3;
        super(string);
    }

    public Boolean c() {
        return this.a;
    }

    public Boolean d() {
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

