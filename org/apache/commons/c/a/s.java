/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.a;

import org.apache.commons.c.a.c;
import org.apache.commons.c.a.d;

class s
extends c {
    private static final long d = 1L;
    final /* synthetic */ char[] a;
    final /* synthetic */ char[] b;
    final /* synthetic */ d c;

    s(d d2, String string, char[] arrc, char[] arrc2) {
        this.c = d2;
        this.a = arrc;
        this.b = arrc2;
        super(string);
    }

    public Character[] c() {
        return org.apache.commons.c.c.d(this.a);
    }

    public Character[] d() {
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

