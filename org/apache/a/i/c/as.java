/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.a.f.b.b;
import org.apache.a.f.b.h;
import org.apache.a.f.c;
import org.apache.a.f.e;
import org.apache.a.f.f;
import org.apache.a.f.t;
import org.apache.a.i.c.ar;
import org.apache.a.i.c.at;
import org.apache.a.i.c.au;
import org.apache.a.i.c.av;
import org.apache.a.i.c.m;
import org.apache.a.l.j;
import org.apache.commons.d.a;

public class as
implements c {
    private final a j = org.apache.commons.d.c.b(this.getClass());
    public static final String a = "Invalid use of SingleClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.";
    protected final org.apache.a.f.c.j b;
    protected final e c;
    protected final boolean d;
    protected volatile av e;
    protected volatile au f;
    protected volatile long g;
    protected volatile long h;
    protected volatile boolean i;

    public as(j j2, org.apache.a.f.c.j j3) {
        this(j3);
    }

    public as(org.apache.a.f.c.j j2) {
        org.apache.a.o.a.a(j2, "Scheme registry");
        this.b = j2;
        this.c = this.a(j2);
        this.e = new av(this);
        this.f = null;
        this.g = -1L;
        this.d = false;
        this.i = false;
    }

    public as() {
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
        return this.b;
    }

    protected e a(org.apache.a.f.c.j j2) {
        return new m(j2);
    }

    protected final void d() {
        org.apache.a.o.b.a(!this.i, "Manager is shut down");
    }

    public final f a(b b2, Object object) {
        return new at(this, b2, object);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public t b(b b2, Object object) {
        org.apache.a.o.a.a(b2, "Route");
        this.d();
        if (this.j.a()) {
            this.j.b("Get connection for route " + b2);
        }
        as as2 = this;
        synchronized (as2) {
            org.apache.a.o.b.a(this.f == null, a);
            boolean bl2 = false;
            boolean bl3 = false;
            this.b();
            if (this.e.b.c()) {
                h h2 = this.e.e;
                bl3 = h2 == null || !h2.l().equals(b2);
            } else {
                bl2 = true;
            }
            if (bl3) {
                bl2 = true;
                try {
                    this.e.d();
                }
                catch (IOException iOException) {
                    this.j.b("Problem shutting down connection.", iOException);
                }
            }
            if (bl2) {
                this.e = new av(this);
            }
            this.f = new au(this, this.e, b2);
            return this.f;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(t t2, long l2, TimeUnit timeUnit) {
        au au2;
        org.apache.a.o.a.a(t2 instanceof au, "Connection class mismatch, connection not obtained from this manager");
        this.d();
        if (this.j.a()) {
            this.j.b("Releasing connection " + t2);
        }
        au au3 = au2 = (au)t2;
        synchronized (au3) {
            if (au2.a == null) {
                return;
            }
            c c2 = au2.w();
            org.apache.a.o.b.a(c2 == this, "Connection not obtained from this manager");
            try {
                if (au2.c() && (this.d || !au2.q())) {
                    if (this.j.a()) {
                        this.j.b("Released connection open but not reusable.");
                    }
                    au2.f();
                }
            }
            catch (IOException iOException) {
                if (this.j.a()) {
                    this.j.b("Exception shutting down released connection.", iOException);
                }
            }
            finally {
                au2.u();
                as as2 = this;
                synchronized (as2) {
                    this.f = null;
                    this.g = System.currentTimeMillis();
                    this.h = l2 > 0L ? timeUnit.toMillis(l2) + this.g : Long.MAX_VALUE;
                }
            }
        }
    }

    public void b() {
        long l2 = this.h;
        if (System.currentTimeMillis() >= l2) {
            this.a(0L, TimeUnit.MILLISECONDS);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(long l2, TimeUnit timeUnit) {
        this.d();
        org.apache.a.o.a.a((Object)timeUnit, "Time unit");
        as as2 = this;
        synchronized (as2) {
            long l3;
            if (this.f == null && this.e.b.c() && this.g <= (l3 = System.currentTimeMillis() - timeUnit.toMillis(l2))) {
                try {
                    this.e.c();
                }
                catch (IOException iOException) {
                    this.j.b("Problem closing idle connection.", iOException);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c() {
        this.i = true;
        as as2 = this;
        synchronized (as2) {
            try {
                if (this.e != null) {
                    this.e.d();
                }
            }
            catch (IOException iOException) {
                this.j.b("Problem while shutting down manager.", iOException);
            }
            finally {
                this.e = null;
                this.f = null;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void e() {
        au au2 = this.f;
        if (au2 == null) {
            return;
        }
        au2.u();
        as as2 = this;
        synchronized (as2) {
            try {
                this.e.d();
            }
            catch (IOException iOException) {
                this.j.b("Problem while shutting down connection.", iOException);
            }
        }
    }
}

