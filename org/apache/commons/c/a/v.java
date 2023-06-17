/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.a;

import org.apache.commons.c.a.c;
import org.apache.commons.c.a.d;

class v
extends c {
    private static final long d = 1L;
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ d c;

    v(d d2, String string, float f2, float f3) {
        this.c = d2;
        this.a = f2;
        this.b = f3;
        super(string);
    }

    public Float c() {
        return Float.valueOf(this.a);
    }

    public Float d() {
        return Float.valueOf(this.b);
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

