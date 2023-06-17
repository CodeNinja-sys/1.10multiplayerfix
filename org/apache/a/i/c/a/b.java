/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c.a;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.TimeUnit;
import org.apache.a.f.e;
import org.apache.a.f.w;
import org.apache.a.i.c.a.c;
import org.apache.a.o.a;

public class b
extends org.apache.a.i.c.b {
    private final long f;
    private long g;
    private final long h;
    private long i;

    public b(e e2, org.apache.a.f.b.b b2, ReferenceQueue referenceQueue) {
        super(e2, b2);
        org.apache.a.o.a.a(b2, "HTTP route");
        this.f = System.currentTimeMillis();
        this.i = this.h = Long.MAX_VALUE;
    }

    public b(e e2, org.apache.a.f.b.b b2) {
        this(e2, b2, -1L, TimeUnit.MILLISECONDS);
    }

    public b(e e2, org.apache.a.f.b.b b2, long l2, TimeUnit timeUnit) {
        super(e2, b2);
        org.apache.a.o.a.a(b2, "HTTP route");
        this.f = System.currentTimeMillis();
        this.h = l2 > 0L ? this.f + timeUnit.toMillis(l2) : Long.MAX_VALUE;
        this.i = this.h;
    }

    protected final w c() {
        return this.b;
    }

    protected final org.apache.a.f.b.b d() {
        return this.c;
    }

    protected final c e() {
        return null;
    }

    protected void b() {
        super.b();
    }

    public long f() {
        return this.f;
    }

    public long g() {
        return this.g;
    }

    public long h() {
        return this.i;
    }

    public long i() {
        return this.h;
    }

    public void a(long l2, TimeUnit timeUnit) {
        this.g = System.currentTimeMillis();
        long l3 = l2 > 0L ? this.g + timeUnit.toMillis(l2) : Long.MAX_VALUE;
        this.i = Math.min(this.h, l3);
    }

    public boolean a(long l2) {
        return l2 >= this.i;
    }
}

