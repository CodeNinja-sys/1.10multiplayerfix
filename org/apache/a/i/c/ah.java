/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.a.f.b.b;
import org.apache.a.f.b.h;
import org.apache.a.f.c;
import org.apache.a.f.e;
import org.apache.a.f.t;
import org.apache.a.f.w;
import org.apache.a.i.c.k;
import org.apache.a.i.c.y;
import org.apache.a.l.j;
import org.apache.a.m;
import org.apache.a.n.g;
import org.apache.a.o;
import org.apache.a.o.a;
import org.apache.a.r;
import org.apache.a.u;
import org.apache.a.x;

class ah
implements t {
    private final c a;
    private final e b;
    private volatile y c;
    private volatile boolean d;
    private volatile long e;

    ah(c c2, e e2, y y2) {
        org.apache.a.o.a.a(c2, "Connection manager");
        org.apache.a.o.a.a(e2, "Connection operator");
        org.apache.a.o.a.a(y2, "HTTP pool entry");
        this.a = c2;
        this.b = e2;
        this.c = y2;
        this.d = false;
        this.e = Long.MAX_VALUE;
    }

    public String s() {
        return null;
    }

    y u() {
        return this.c;
    }

    y v() {
        y y2 = this.c;
        this.c = null;
        return y2;
    }

    public c w() {
        return this.a;
    }

    private w x() {
        y y2 = this.c;
        if (y2 == null) {
            return null;
        }
        return (w)y2.i();
    }

    private w y() {
        y y2 = this.c;
        if (y2 == null) {
            throw new k();
        }
        return (w)y2.i();
    }

    private y z() {
        y y2 = this.c;
        if (y2 == null) {
            throw new k();
        }
        return y2;
    }

    public void close() {
        y y2 = this.c;
        if (y2 != null) {
            w w2 = (w)y2.i();
            y2.a().c();
            w2.close();
        }
    }

    public void f() {
        y y2 = this.c;
        if (y2 != null) {
            w w2 = (w)y2.i();
            y2.a().c();
            w2.f();
        }
    }

    public boolean c() {
        w w2 = this.x();
        if (w2 != null) {
            return w2.c();
        }
        return false;
    }

    public boolean d() {
        w w2 = this.x();
        if (w2 != null) {
            return w2.d();
        }
        return true;
    }

    public void b(int n2) {
        w w2 = this.y();
        w2.b(n2);
    }

    public int e() {
        w w2 = this.y();
        return w2.e();
    }

    public m g() {
        w w2 = this.y();
        return w2.g();
    }

    public void b() {
        w w2 = this.y();
        w2.b();
    }

    public boolean a(int n2) {
        w w2 = this.y();
        return w2.a(n2);
    }

    public void a(x x2) {
        w w2 = this.y();
        w2.a(x2);
    }

    public x a() {
        w w2 = this.y();
        return w2.a();
    }

    public void a(o o2) {
        w w2 = this.y();
        w2.a(o2);
    }

    public void a(u u2) {
        w w2 = this.y();
        w2.a(u2);
    }

    public InetAddress h() {
        w w2 = this.y();
        return w2.h();
    }

    public int i() {
        w w2 = this.y();
        return w2.i();
    }

    public InetAddress j() {
        w w2 = this.y();
        return w2.j();
    }

    public int k() {
        w w2 = this.y();
        return w2.k();
    }

    public boolean l() {
        w w2 = this.y();
        return w2.m();
    }

    public void a(Socket socket) {
        throw new UnsupportedOperationException();
    }

    public Socket t() {
        w w2 = this.y();
        return w2.t();
    }

    public SSLSession n() {
        w w2 = this.y();
        SSLSession sSLSession = null;
        Socket socket = w2.t();
        if (socket instanceof SSLSocket) {
            sSLSession = ((SSLSocket)socket).getSession();
        }
        return sSLSession;
    }

    public Object a(String string) {
        w w2 = this.y();
        if (w2 instanceof g) {
            return ((g)((Object)w2)).a(string);
        }
        return null;
    }

    public Object b(String string) {
        w w2 = this.y();
        if (w2 instanceof g) {
            return ((g)((Object)w2)).b(string);
        }
        return null;
    }

    public void a(String string, Object object) {
        w w2 = this.y();
        if (w2 instanceof g) {
            ((g)((Object)w2)).a(string, object);
        }
    }

    public b m() {
        y y2 = this.z();
        return y2.c();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(b b2, g g2, j j2) {
        w w2;
        Object object;
        org.apache.a.o.a.a(b2, "Route");
        org.apache.a.o.a.a(j2, "HTTP parameters");
        Object object2 = this;
        synchronized (object2) {
            if (this.c == null) {
                throw new k();
            }
            object = this.c.a();
            org.apache.a.o.b.a(object, "Route tracker");
            org.apache.a.o.b.a(!((h)object).k(), "Connection already open");
            w2 = (w)this.c.i();
        }
        object2 = b2.e();
        this.b.a(w2, (r)(object2 != null ? object2 : b2.a()), b2.b(), g2, j2);
        object = this;
        synchronized (object) {
            if (this.c == null) {
                throw new InterruptedIOException();
            }
            h h2 = this.c.a();
            if (object2 == null) {
                h2.a(w2.m());
            } else {
                h2.a((r)object2, w2.m());
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(boolean bl2, j j2) {
        w w2;
        r r2;
        h h2;
        org.apache.a.o.a.a(j2, "HTTP parameters");
        ah ah2 = this;
        synchronized (ah2) {
            if (this.c == null) {
                throw new k();
            }
            h2 = this.c.a();
            org.apache.a.o.b.a(h2, "Route tracker");
            org.apache.a.o.b.a(h2.k(), "Connection not open");
            org.apache.a.o.b.a(!h2.g(), "Connection is already tunnelled");
            r2 = h2.a();
            w2 = (w)this.c.i();
        }
        w2.a(null, r2, bl2, j2);
        ah2 = this;
        synchronized (ah2) {
            if (this.c == null) {
                throw new InterruptedIOException();
            }
            h2 = this.c.a();
            h2.b(bl2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(r r2, boolean bl2, j j2) {
        w w2;
        h h2;
        org.apache.a.o.a.a(r2, "Next proxy");
        org.apache.a.o.a.a(j2, "HTTP parameters");
        ah ah2 = this;
        synchronized (ah2) {
            if (this.c == null) {
                throw new k();
            }
            h2 = this.c.a();
            org.apache.a.o.b.a(h2, "Route tracker");
            org.apache.a.o.b.a(h2.k(), "Connection not open");
            w2 = (w)this.c.i();
        }
        w2.a(null, r2, bl2, j2);
        ah2 = this;
        synchronized (ah2) {
            if (this.c == null) {
                throw new InterruptedIOException();
            }
            h2 = this.c.a();
            h2.b(r2, bl2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(g g2, j j2) {
        w w2;
        r r2;
        h h2;
        org.apache.a.o.a.a(j2, "HTTP parameters");
        ah ah2 = this;
        synchronized (ah2) {
            if (this.c == null) {
                throw new k();
            }
            h2 = this.c.a();
            org.apache.a.o.b.a(h2, "Route tracker");
            org.apache.a.o.b.a(h2.k(), "Connection not open");
            org.apache.a.o.b.a(h2.g(), "Protocol layering without a tunnel not supported");
            org.apache.a.o.b.a(!h2.i(), "Multiple protocol layering not supported");
            r2 = h2.a();
            w2 = (w)this.c.i();
        }
        this.b.a(w2, r2, g2, j2);
        ah2 = this;
        synchronized (ah2) {
            if (this.c == null) {
                throw new InterruptedIOException();
            }
            h2 = this.c.a();
            h2.c(w2.m());
        }
    }

    public Object r() {
        y y2 = this.z();
        return y2.l();
    }

    public void a(Object object) {
        y y2 = this.z();
        y2.a(object);
    }

    public void o() {
        this.d = true;
    }

    public void p() {
        this.d = false;
    }

    public boolean q() {
        return this.d;
    }

    public void a(long l2, TimeUnit timeUnit) {
        this.e = l2 > 0L ? timeUnit.toMillis(l2) : -1L;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void cM_() {
        ah ah2 = this;
        synchronized (ah2) {
            if (this.c == null) {
                return;
            }
            this.a.a(this, this.e, TimeUnit.MILLISECONDS);
            this.c = null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void cN_() {
        ah ah2 = this;
        synchronized (ah2) {
            if (this.c == null) {
                return;
            }
            this.d = false;
            w w2 = (w)this.c.i();
            try {
                w2.f();
            }
            catch (IOException iOException) {
                // empty catch block
            }
            this.a.a(this, this.e, TimeUnit.MILLISECONDS);
            this.c = null;
        }
    }
}

