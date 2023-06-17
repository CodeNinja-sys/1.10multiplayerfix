/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.a.f.b.b;
import org.apache.a.f.u;
import org.apache.a.i.c.i;
import org.apache.a.m.f;
import org.apache.commons.d.a;
import org.apache.commons.d.c;

class h
extends org.apache.a.m.a {
    private static final AtomicLong a = new AtomicLong();
    private final a b = org.apache.commons.d.c.b(h.class);
    private final long c;
    private final TimeUnit d;

    public h(f f2, int n2, int n3, long l2, TimeUnit timeUnit) {
        super(f2, n2, n3);
        this.c = l2;
        this.d = timeUnit;
    }

    protected i a(b b2, u u2) {
        String string = Long.toString(a.getAndIncrement());
        return new i(this.b, string, b2, u2, this.c, this.d);
    }
}

