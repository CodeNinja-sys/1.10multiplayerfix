/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.a.f.b.b;
import org.apache.a.f.e;
import org.apache.a.i.c.x;
import org.apache.a.i.c.y;
import org.apache.commons.d.a;

class w
extends org.apache.a.m.a {
    private static final AtomicLong a = new AtomicLong();
    private final a b;
    private final long c;
    private final TimeUnit d;

    public w(a a2, e e2, int n2, int n3, long l2, TimeUnit timeUnit) {
        super(new x(e2), n2, n3);
        this.b = a2;
        this.c = l2;
        this.d = timeUnit;
    }

    protected y a(b b2, org.apache.a.f.w w2) {
        String string = Long.toString(a.getAndIncrement());
        return new y(this.b, string, b2, w2, this.c, this.d);
    }
}

