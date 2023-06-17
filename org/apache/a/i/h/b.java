/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.h;

import java.util.concurrent.atomic.AtomicLong;
import org.apache.a.e.h;
import org.apache.a.i.h.a;
import org.apache.a.i.h.c;
import org.apache.a.j;
import org.apache.a.m.f;
import org.apache.a.r;

public class b
extends org.apache.a.m.a {
    private static final AtomicLong a = new AtomicLong();

    public b(f f2) {
        super(f2, 2, 20);
    }

    public b(org.apache.a.l.j j2) {
        super(new a(j2), 2, 20);
    }

    public b(h h2, org.apache.a.e.a a2) {
        super(new a(h2, a2), 2, 20);
    }

    public b() {
        super(new a(h.a, org.apache.a.e.a.a), 2, 20);
    }

    protected c a(r r2, j j2) {
        return new c(Long.toString(a.getAndIncrement()), r2, j2);
    }
}

