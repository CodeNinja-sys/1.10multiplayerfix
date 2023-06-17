/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.a.e.h;
import org.apache.a.f.b.b;
import org.apache.a.f.d.c;
import org.apache.a.f.k;
import org.apache.a.f.l;
import org.apache.a.f.o;
import org.apache.a.f.p;
import org.apache.a.f.u;
import org.apache.a.f.x;
import org.apache.a.i.c.ai;
import org.apache.a.i.c.g;
import org.apache.a.i.c.v;
import org.apache.a.j;
import org.apache.a.o.i;
import org.apache.a.r;
import org.apache.commons.d.a;

public class f
implements Closeable,
o {
    private final a a = org.apache.commons.d.c.b(this.getClass());
    private final v b;
    private final p c;
    private u d;
    private b e;
    private Object f;
    private long g;
    private long h;
    private boolean i;
    private h j;
    private org.apache.a.e.a k;
    private volatile boolean l;

    private static org.apache.a.e.f g() {
        return org.apache.a.e.g.a().a("http", org.apache.a.f.d.c.a()).a("https", org.apache.a.f.e.f.a()).b();
    }

    public f(org.apache.a.e.c c2, p p2, x x2, l l2) {
        this.b = new v(c2, x2, l2);
        this.c = p2 != null ? p2 : ai.a;
        this.h = Long.MAX_VALUE;
        this.j = org.apache.a.e.h.a;
        this.k = org.apache.a.e.a.a;
    }

    public f(org.apache.a.e.c c2, p p2) {
        this(c2, p2, null, null);
    }

    public f(org.apache.a.e.c c2) {
        this(c2, null, null, null);
    }

    public f() {
        this(org.apache.a.i.c.f.g(), null, null, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void finalize() {
        try {
            this.b();
        }
        finally {
            super.finalize();
        }
    }

    public void close() {
        this.b();
    }

    b c() {
        return this.e;
    }

    Object d() {
        return this.f;
    }

    public synchronized h e() {
        return this.j;
    }

    public synchronized void a(h h2) {
        this.j = h2 != null ? h2 : org.apache.a.e.h.a;
    }

    public synchronized org.apache.a.e.a f() {
        return this.k;
    }

    public synchronized void a(org.apache.a.e.a a2) {
        this.k = a2 != null ? a2 : org.apache.a.e.a.a;
    }

    public final k a(b b2, Object object) {
        org.apache.a.o.a.a(b2, "Route");
        return new g(this, b2, object);
    }

    private void h() {
        if (this.d != null) {
            block3: {
                this.a.b("Closing connection");
                try {
                    this.d.close();
                }
                catch (IOException iOException) {
                    if (!this.a.a()) break block3;
                    this.a.b("I/O exception closing connection", iOException);
                }
            }
            this.d = null;
        }
    }

    private void i() {
        if (this.d != null) {
            block3: {
                this.a.b("Shutting down connection");
                try {
                    this.d.f();
                }
                catch (IOException iOException) {
                    if (!this.a.a()) break block3;
                    this.a.b("I/O exception shutting down connection", iOException);
                }
            }
            this.d = null;
        }
    }

    private void j() {
        if (this.d != null && System.currentTimeMillis() >= this.h) {
            if (this.a.a()) {
                this.a.b("Connection expired @ " + new Date(this.h));
            }
            this.h();
        }
    }

    synchronized j b(b b2, Object object) {
        org.apache.a.o.b.a(!this.l, "Connection manager has been shut down");
        if (this.a.a()) {
            this.a.b("Get connection for route " + b2);
        }
        org.apache.a.o.b.a(!this.i, "Connection is still allocated");
        if (!org.apache.a.o.i.a(this.e, (Object)b2) || !org.apache.a.o.i.a(this.f, object)) {
            this.h();
        }
        this.e = b2;
        this.f = object;
        this.j();
        if (this.d == null) {
            this.d = (u)this.c.a(b2, this.k);
        }
        this.i = true;
        return this.d;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public synchronized void a(j j2, Object object, long l2, TimeUnit timeUnit) {
        org.apache.a.o.a.a(j2, "Connection");
        org.apache.a.o.b.a(j2 == this.d, "Connection not obtained from this manager");
        if (this.a.a()) {
            this.a.b("Releasing connection " + j2);
        }
        if (this.l) {
            this.i();
            return;
        }
        try {
            this.g = System.currentTimeMillis();
            if (!this.d.c()) {
                this.d = null;
                this.e = null;
                this.d = null;
                this.h = Long.MAX_VALUE;
            } else {
                this.f = object;
                if (this.a.a()) {
                    String string = l2 > 0L ? "for " + l2 + " " + (Object)((Object)timeUnit) : "indefinitely";
                    this.a.b("Connection can be kept alive " + string);
                }
                this.h = l2 > 0L ? this.g + timeUnit.toMillis(l2) : Long.MAX_VALUE;
            }
        }
        finally {
            this.i = false;
        }
    }

    public void a(j j2, b b2, int n2, org.apache.a.n.g g2) {
        org.apache.a.o.a.a(j2, "Connection");
        org.apache.a.o.a.a(b2, "HTTP route");
        org.apache.a.o.b.a(j2 == this.d, "Connection not obtained from this manager");
        r r2 = b2.e() != null ? b2.e() : b2.a();
        InetSocketAddress inetSocketAddress = b2.c();
        this.b.a(this.d, r2, inetSocketAddress, n2, this.j, g2);
    }

    public void a(j j2, b b2, org.apache.a.n.g g2) {
        org.apache.a.o.a.a(j2, "Connection");
        org.apache.a.o.a.a(b2, "HTTP route");
        org.apache.a.o.b.a(j2 == this.d, "Connection not obtained from this manager");
        this.b.a(this.d, b2.a(), g2);
    }

    public void b(j j2, b b2, org.apache.a.n.g g2) {
    }

    public synchronized void a() {
        if (this.l) {
            return;
        }
        if (!this.i) {
            this.j();
        }
    }

    public synchronized void a(long l2, TimeUnit timeUnit) {
        org.apache.a.o.a.a((Object)timeUnit, "Time unit");
        if (this.l) {
            return;
        }
        if (!this.i) {
            long l3;
            long l4 = timeUnit.toMillis(l2);
            if (l4 < 0L) {
                l4 = 0L;
            }
            if (this.g <= (l3 = System.currentTimeMillis() - l4)) {
                this.h();
            }
        }
    }

    public synchronized void b() {
        if (this.l) {
            return;
        }
        this.l = true;
        this.i();
    }
}

