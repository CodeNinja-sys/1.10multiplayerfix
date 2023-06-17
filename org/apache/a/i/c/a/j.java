/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c.a;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.a.f.a.h;
import org.apache.a.f.c;
import org.apache.a.f.f;
import org.apache.a.f.t;
import org.apache.a.i.c.a.a;
import org.apache.a.i.c.a.b;
import org.apache.a.i.c.a.d;
import org.apache.a.i.c.a.e;
import org.apache.a.i.c.a.g;
import org.apache.a.i.c.a.k;
import org.apache.a.i.c.ar;
import org.apache.a.i.c.m;

public class j
implements c {
    private final org.apache.commons.d.a f;
    protected final org.apache.a.f.c.j a;
    protected final a b;
    protected final e c;
    protected final org.apache.a.f.e d;
    protected final h e;

    public j(org.apache.a.f.c.j j2) {
        this(j2, -1L, TimeUnit.MILLISECONDS);
    }

    public j() {
        this(ar.a());
    }

    public j(org.apache.a.f.c.j j2, long l2, TimeUnit timeUnit) {
        this(j2, l2, timeUnit, new h());
    }

    public j(org.apache.a.f.c.j j2, long l2, TimeUnit timeUnit, h h2) {
        org.apache.a.o.a.a(j2, "Scheme registry");
        this.f = org.apache.commons.d.c.b(this.getClass());
        this.a = j2;
        this.e = h2;
        this.d = this.a(j2);
        this.c = this.b(l2, timeUnit);
        this.b = this.c;
    }

    public j(org.apache.a.l.j j2, org.apache.a.f.c.j j3) {
        org.apache.a.o.a.a(j3, "Scheme registry");
        this.f = org.apache.commons.d.c.b(this.getClass());
        this.a = j3;
        this.e = new h();
        this.d = this.a(j3);
        this.c = (e)this.a(j2);
        this.b = this.c;
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

    protected a a(org.apache.a.l.j j2) {
        return new e(this.d, j2);
    }

    protected e b(long l2, TimeUnit timeUnit) {
        return new e(this.d, this.e, 20, l2, timeUnit);
    }

    protected org.apache.a.f.e a(org.apache.a.f.c.j j2) {
        return new m(j2);
    }

    public org.apache.a.f.c.j a() {
        return this.a;
    }

    public f a(org.apache.a.f.b.b b2, Object object) {
        g g2 = this.c.a(b2, object);
        return new k(this, g2, b2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(t t2, long l2, TimeUnit timeUnit) {
        org.apache.a.o.a.a(t2 instanceof d, "Connection class mismatch, connection not obtained from this manager");
        d d2 = (d)t2;
        if (d2.z() != null) {
            org.apache.a.o.b.a(d2.w() == this, "Connection not obtained from this manager");
        }
        d d3 = d2;
        synchronized (d3) {
            b b2 = (b)d2.z();
            if (b2 == null) {
                return;
            }
            try {
                if (d2.c() && !d2.q()) {
                    d2.f();
                }
            }
            catch (IOException iOException) {
                if (this.f.a()) {
                    this.f.b("Exception shutting down released connection.", iOException);
                }
            }
            finally {
                boolean bl2 = d2.q();
                if (this.f.a()) {
                    if (bl2) {
                        this.f.b("Released connection is reusable.");
                    } else {
                        this.f.b("Released connection is not reusable.");
                    }
                }
                d2.u();
                this.c.a(b2, bl2, l2, timeUnit);
            }
        }
    }

    public void c() {
        this.f.b("Shutting down");
        this.c.d();
    }

    public int a(org.apache.a.f.b.b b2) {
        return this.c.c(b2);
    }

    public int d() {
        return this.c.i();
    }

    public void a(long l2, TimeUnit timeUnit) {
        if (this.f.a()) {
            this.f.b("Closing connections idle longer than " + l2 + " " + (Object)((Object)timeUnit));
        }
        this.c.a(l2, timeUnit);
    }

    public void b() {
        this.f.b("Closing expired connections");
        this.c.b();
    }

    public int e() {
        return this.c.k();
    }

    public void a(int n2) {
        this.c.a(n2);
    }

    public int f() {
        return this.e.b();
    }

    public void b(int n2) {
        this.e.a(n2);
    }

    public int b(org.apache.a.f.b.b b2) {
        return this.e.a(b2);
    }

    public void a(org.apache.a.f.b.b b2, int n2) {
        this.e.a(b2, n2);
    }

    static /* synthetic */ org.apache.commons.d.a a(j j2) {
        return j2.f;
    }
}

