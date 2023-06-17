/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.a.f.b.b;
import org.apache.a.f.f;
import org.apache.a.f.t;
import org.apache.a.f.w;
import org.apache.a.i.c.ah;
import org.apache.a.i.c.ar;
import org.apache.a.i.c.e;
import org.apache.a.i.c.m;
import org.apache.a.i.c.y;
import org.apache.a.j;
import org.apache.commons.d.a;
import org.apache.commons.d.c;

public class d
implements org.apache.a.f.c {
    private final a b = org.apache.commons.d.c.b(this.getClass());
    private static final AtomicLong c = new AtomicLong();
    public static final String a = "Invalid use of BasicClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.";
    private final org.apache.a.f.c.j d;
    private final org.apache.a.f.e e;
    private y f;
    private ah g;
    private volatile boolean h;

    public d(org.apache.a.f.c.j j2) {
        org.apache.a.o.a.a(j2, "Scheme registry");
        this.d = j2;
        this.e = this.a(j2);
    }

    public d() {
        this(ar.a());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void finalize() {
        try {
            this.c();
        }
        finally {
            super.finalize();
        }
    }

    public org.apache.a.f.c.j a() {
        return this.d;
    }

    protected org.apache.a.f.e a(org.apache.a.f.c.j j2) {
        return new m(j2);
    }

    public final f a(b b2, Object object) {
        return new e(this, b2, object);
    }

    private void d() {
        org.apache.a.o.b.a(!this.h, "Connection manager has been shut down");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    t b(b b2, Object object) {
        org.apache.a.o.a.a(b2, "Route");
        d d2 = this;
        synchronized (d2) {
            long l2;
            this.d();
            if (this.b.a()) {
                this.b.b("Get connection for route " + b2);
            }
            org.apache.a.o.b.a(this.g == null, a);
            if (this.f != null && !this.f.b().equals(b2)) {
                this.f.f();
                this.f = null;
            }
            if (this.f == null) {
                String string = Long.toString(c.getAndIncrement());
                w w2 = this.e.a();
                this.f = new y(this.b, string, b2, w2, 0L, TimeUnit.MILLISECONDS);
            }
            if (this.f.a(l2 = System.currentTimeMillis())) {
                this.f.f();
                this.f.a().c();
            }
            this.g = new ah(this, this.e, this.f);
            return this.g;
        }
    }

    private void a(j j2) {
        block2: {
            try {
                j2.f();
            }
            catch (IOException iOException) {
                if (!this.b.a()) break block2;
                this.b.b("I/O exception shutting down connection", iOException);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(t t2, long l2, TimeUnit timeUnit) {
        ah ah2;
        org.apache.a.o.a.a(t2 instanceof ah, "Connection class mismatch, connection not obtained from this manager");
        ah ah3 = ah2 = (ah)t2;
        synchronized (ah3) {
            if (this.b.a()) {
                this.b.b("Releasing connection " + t2);
            }
            if (ah2.u() == null) {
                return;
            }
            org.apache.a.f.c c2 = ah2.w();
            org.apache.a.o.b.a(c2 == this, "Connection not obtained from this manager");
            d d2 = this;
            synchronized (d2) {
                if (this.h) {
                    this.a(ah2);
                    return;
                }
                try {
                    if (ah2.c() && !ah2.q()) {
                        this.a(ah2);
                    }
                    if (ah2.q()) {
                        this.f.a(l2, timeUnit != null ? timeUnit : TimeUnit.MILLISECONDS);
                        if (this.b.a()) {
                            String string = l2 > 0L ? "for " + l2 + " " + (Object)((Object)timeUnit) : "indefinitely";
                            this.b.b("Connection can be kept alive " + string);
                        }
                    }
                }
                finally {
                    ah2.v();
                    this.g = null;
                    if (this.f.e()) {
                        this.f = null;
                    }
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b() {
        d d2 = this;
        synchronized (d2) {
            this.d();
            long l2 = System.currentTimeMillis();
            if (this.f != null && this.f.a(l2)) {
                this.f.f();
                this.f.a().c();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(long l2, TimeUnit timeUnit) {
        org.apache.a.o.a.a((Object)timeUnit, "Time unit");
        d d2 = this;
        synchronized (d2) {
            this.d();
            long l3 = timeUnit.toMillis(l2);
            if (l3 < 0L) {
                l3 = 0L;
            }
            long l4 = System.currentTimeMillis() - l3;
            if (this.f != null && this.f.m() <= l4) {
                this.f.f();
                this.f.a().c();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c() {
        d d2 = this;
        synchronized (d2) {
            this.h = true;
            try {
                if (this.f != null) {
                    this.f.f();
                }
            }
            finally {
                this.f = null;
                this.g = null;
            }
        }
    }
}

