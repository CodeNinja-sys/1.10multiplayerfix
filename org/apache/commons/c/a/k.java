/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.a;

import org.apache.commons.c.a.c;
import org.apache.commons.c.a.d;

class k
extends c {
    private static final long d = 1L;
    final /* synthetic */ short a;
    final /* synthetic */ short b;
    final /* synthetic */ d c;

    k(d d2, String string, short s2, short s3) {
        this.c = d2;
        this.a = s2;
        this.b = s3;
        super(string);
    }

    public Short c() {
        return this.a;
    }

    public Short d() {
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

