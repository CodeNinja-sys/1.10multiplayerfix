/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.a.c.c.u;
import org.apache.a.c.j;
import org.apache.a.c.r;
import org.apache.a.d.c;
import org.apache.a.i.b.ae;
import org.apache.a.n.g;

class al
implements Callable {
    private final u a;
    private final j b;
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final long d = System.currentTimeMillis();
    private long e = -1L;
    private long f = -1L;
    private final g g;
    private final r h;
    private final c i;
    private final ae j;

    al(j j2, u u2, g g2, r r2, c c2, ae ae2) {
        this.b = j2;
        this.h = r2;
        this.a = u2;
        this.g = g2;
        this.i = c2;
        this.j = ae2;
    }

    public long a() {
        return this.d;
    }

    public long b() {
        return this.e;
    }

    public long c() {
        return this.f;
    }

    public Object call() {
        if (!this.c.get()) {
            try {
                this.j.a().incrementAndGet();
                this.e = System.currentTimeMillis();
                try {
                    this.j.b().decrementAndGet();
                    Object object = this.b.a(this.a, this.h, this.g);
                    this.f = System.currentTimeMillis();
                    this.j.c().a(this.e);
                    if (this.i != null) {
                        this.i.a(object);
                    }
                    Object object2 = object;
                    return object2;
                }
                catch (Exception exception) {
                    this.j.d().a(this.e);
                    this.f = System.currentTimeMillis();
                    if (this.i != null) {
                        this.i.a(exception);
                    }
                    throw exception;
                }
            }
            finally {
                this.j.e().a(this.e);
                this.j.f().a(this.e);
                this.j.a().decrementAndGet();
            }
        }
        throw new IllegalStateException("call has been cancelled for request " + this.a.k());
    }

    public void d() {
        this.c.set(true);
        if (this.i != null) {
            this.i.a();
        }
    }
}

