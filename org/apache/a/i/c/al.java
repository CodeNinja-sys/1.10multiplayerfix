/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.a.f.b.b;
import org.apache.a.f.d.c;
import org.apache.a.f.e.f;
import org.apache.a.f.k;
import org.apache.a.f.l;
import org.apache.a.f.o;
import org.apache.a.f.p;
import org.apache.a.f.u;
import org.apache.a.f.x;
import org.apache.a.i.c.am;
import org.apache.a.i.c.an;
import org.apache.a.i.c.ao;
import org.apache.a.i.c.h;
import org.apache.a.i.c.i;
import org.apache.a.i.c.j;
import org.apache.a.i.c.v;
import org.apache.a.n.g;
import org.apache.a.r;
import org.apache.commons.d.a;

public class al
implements Closeable,
o,
org.apache.a.m.h {
    private final a a = org.apache.commons.d.c.b(this.getClass());
    private final an b = new an();
    private final h c;
    private final v d;

    private static org.apache.a.e.f h() {
        return org.apache.a.e.g.a().a("http", org.apache.a.f.d.c.a()).a("https", f.a()).b();
    }

    public al() {
        this(al.h());
    }

    public al(long l2, TimeUnit timeUnit) {
        this(al.h(), null, null, null, l2, timeUnit);
    }

    public al(org.apache.a.e.f f2) {
        this(f2, null, null);
    }

    public al(org.apache.a.e.f f2, l l2) {
        this(f2, null, l2);
    }

    public al(org.apache.a.e.f f2, p p2) {
        this(f2, p2, null);
    }

    public al(p p2) {
        this(al.h(), p2, null);
    }

    public al(org.apache.a.e.f f2, p p2, l l2) {
        this(f2, p2, null, l2, -1L, TimeUnit.MILLISECONDS);
    }

    public al(org.apache.a.e.f f2, p p2, x x2, l l2, long l3, TimeUnit timeUnit) {
        this.c = new h(new ao(this.b, p2), 2, 20, l3, timeUnit);
        this.d = new v(f2, x2, l2);
    }

    al(h h2, org.apache.a.e.c c2, x x2, l l2) {
        this.c = h2;
        this.d = new v(c2, x2, l2);
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

    private String b(b b2, Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[route: ").append(b2).append("]");
        if (object != null) {
            stringBuilder.append("[state: ").append(object).append("]");
        }
        return stringBuilder.toString();
    }

    private String c(b b2) {
        StringBuilder stringBuilder = new StringBuilder();
        org.apache.a.m.l l2 = this.c.f();
        org.apache.a.m.l l3 = this.c.a(b2);
        stringBuilder.append("[total kept alive: ").append(l2.c()).append("; ");
        stringBuilder.append("route allocated: ").append(l3.a() + l3.c());
        stringBuilder.append(" of ").append(l3.d()).append("; ");
        stringBuilder.append("total allocated: ").append(l2.a() + l2.c());
        stringBuilder.append(" of ").append(l2.d()).append("]");
        return stringBuilder.toString();
    }

    private String a(i i2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[id: ").append(i2.g()).append("]");
        stringBuilder.append("[route: ").append(i2.h()).append("]");
        Object object = i2.l();
        if (object != null) {
            stringBuilder.append("[state: ").append(object).append("]");
        }
        return stringBuilder.toString();
    }

    public k a(b b2, Object object) {
        org.apache.a.o.a.a(b2, "HTTP route");
        if (this.a.a()) {
            this.a.b("Connection request: " + this.b(b2, object) + this.c(b2));
        }
        Future future = this.c.a(b2, object, null);
        return new am(this, future);
    }

    protected org.apache.a.j a(Future future, long l2, TimeUnit timeUnit) {
        try {
            i i2 = (i)future.get(l2, timeUnit);
            if (i2 == null || future.isCancelled()) {
                throw new InterruptedException();
            }
            org.apache.a.o.b.a(i2.i() != null, "Pool entry with no connection");
            if (this.a.a()) {
                this.a.b("Connection leased: " + this.a(i2) + this.c((b)i2.h()));
            }
            return j.a(i2);
        }
        catch (TimeoutException timeoutException) {
            throw new org.apache.a.f.i("Timeout waiting for connection from pool");
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(org.apache.a.j j2, Object object, long l2, TimeUnit timeUnit) {
        org.apache.a.o.a.a(j2, "Managed connection");
        org.apache.a.j j3 = j2;
        synchronized (j3) {
            u u2;
            i i2;
            block8: {
                i2 = j.b(j2);
                if (i2 == null) {
                    return;
                }
                u2 = (u)i2.i();
                try {
                    if (!u2.c()) break block8;
                    i2.a(object);
                    i2.a(l2, timeUnit != null ? timeUnit : TimeUnit.MILLISECONDS);
                    if (!this.a.a()) break block8;
                    String string = l2 > 0L ? "for " + (double)l2 / 1000.0 + " seconds" : "indefinitely";
                    this.a.b("Connection " + this.a(i2) + " can be kept alive " + string);
                }
                catch (Throwable throwable) {
                    this.c.a(i2, u2.c() && i2.b());
                    if (this.a.a()) {
                        this.a.b("Connection released: " + this.a(i2) + this.c((b)i2.h()));
                    }
                    throw throwable;
                }
            }
            this.c.a(i2, u2.c() && i2.b());
            if (this.a.a()) {
                this.a.b("Connection released: " + this.a(i2) + this.c((b)i2.h()));
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(org.apache.a.j j2, b b2, int n2, g g2) {
        u u2;
        Object object;
        org.apache.a.o.a.a(j2, "Managed Connection");
        org.apache.a.o.a.a(b2, "HTTP route");
        Object object2 = j2;
        synchronized (object2) {
            object = j.a(j2);
            u2 = (u)((org.apache.a.m.i)object).i();
        }
        object2 = b2.e() != null ? b2.e() : b2.a();
        object = b2.c();
        org.apache.a.e.h h2 = this.b.a((r)object2);
        if (h2 == null) {
            h2 = this.b.a();
        }
        if (h2 == null) {
            h2 = org.apache.a.e.h.a;
        }
        this.d.a(u2, (r)object2, (InetSocketAddress)object, n2, h2, g2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(org.apache.a.j j2, b b2, g g2) {
        u u2;
        org.apache.a.o.a.a(j2, "Managed Connection");
        org.apache.a.o.a.a(b2, "HTTP route");
        org.apache.a.j j3 = j2;
        synchronized (j3) {
            i i2 = j.a(j2);
            u2 = (u)i2.i();
        }
        this.d.a(u2, b2.a(), g2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(org.apache.a.j j2, b b2, g g2) {
        org.apache.a.o.a.a(j2, "Managed Connection");
        org.apache.a.o.a.a(b2, "HTTP route");
        org.apache.a.j j3 = j2;
        synchronized (j3) {
            i i2 = j.a(j2);
            i2.a();
        }
    }

    public void b() {
        this.a.b("Connection manager is shutting down");
        try {
            this.c.b();
        }
        catch (IOException iOException) {
            this.a.b("I/O exception shutting down connection manager", iOException);
        }
        this.a.b("Connection manager shut down");
    }

    public void a(long l2, TimeUnit timeUnit) {
        if (this.a.a()) {
            this.a.b("Closing connections idle longer than " + l2 + " " + (Object)((Object)timeUnit));
        }
        this.c.a(l2, timeUnit);
    }

    public void a() {
        this.a.b("Closing expired connections");
        this.c.c();
    }

    public int d() {
        return this.c.d();
    }

    public void a(int n2) {
        this.c.a(n2);
    }

    public int e() {
        return this.c.e();
    }

    public void b(int n2) {
        this.c.b(n2);
    }

    public int a(b b2) {
        return this.c.b(b2);
    }

    public void a(b b2, int n2) {
        this.c.a((Object)b2, n2);
    }

    public org.apache.a.m.l f() {
        return this.c.f();
    }

    public org.apache.a.m.l b(b b2) {
        return this.c.a(b2);
    }

    public org.apache.a.e.h c() {
        return this.b.a();
    }

    public void a(org.apache.a.e.h h2) {
        this.b.a(h2);
    }

    public org.apache.a.e.a g() {
        return this.b.b();
    }

    public void a(org.apache.a.e.a a2) {
        this.b.a(a2);
    }

    public org.apache.a.e.h a(r r2) {
        return this.b.a(r2);
    }

    public void a(r r2, org.apache.a.e.h h2) {
        this.b.a(r2, h2);
    }

    public org.apache.a.e.a b(r r2) {
        return this.b.b(r2);
    }

    public void a(r r2, org.apache.a.e.a a2) {
        this.b.a(r2, a2);
    }

    public /* synthetic */ org.apache.a.m.l a(Object object) {
        return this.b((b)object);
    }

    public /* synthetic */ int b(Object object) {
        return this.a((b)object);
    }
}

