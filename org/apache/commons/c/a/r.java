/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.a;

import org.apache.commons.c.a.c;
import org.apache.commons.c.a.d;

class r
extends c {
    private static final long d = 1L;
    final /* synthetic */ char a;
    final /* synthetic */ char b;
    final /* synthetic */ d c;

    r(d d2, String string, char c2, char c3) {
        this.c = d2;
        this.a = c2;
        this.b = c3;
        super(string);
    }

    public Character c() {
        return Character.valueOf(this.a);
    }

    public Character d() {
        return Character.valueOf(this.b);
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

