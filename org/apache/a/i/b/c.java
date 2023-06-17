/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import org.apache.a.b;
import org.apache.a.c.f;
import org.apache.a.c.o;
import org.apache.a.c.q;
import org.apache.a.i.a.ae;
import org.apache.a.i.a.e;
import org.apache.a.i.b.aa;
import org.apache.a.i.b.ab;
import org.apache.a.i.b.at;
import org.apache.a.i.b.bc;
import org.apache.a.i.b.d;
import org.apache.a.i.b.h;
import org.apache.a.i.b.k;
import org.apache.a.i.b.m;
import org.apache.a.i.b.n;
import org.apache.a.i.b.t;
import org.apache.a.i.b.v;
import org.apache.a.i.b.y;
import org.apache.a.i.c.ar;
import org.apache.a.i.d.af;
import org.apache.a.i.d.am;
import org.apache.a.i.d.l;
import org.apache.a.i.i;
import org.apache.a.l.j;
import org.apache.a.n.g;
import org.apache.a.p;
import org.apache.a.r;
import org.apache.a.u;
import org.apache.a.w;
import org.apache.a.x;
import org.apache.a.z;
import org.apache.commons.d.a;

public abstract class c
extends m {
    private final a a = org.apache.commons.d.c.b(this.getClass());
    private j b;
    private org.apache.a.n.m c;
    private org.apache.a.f.c d;
    private b e;
    private org.apache.a.f.h f;
    private org.apache.a.g.k g;
    private org.apache.a.b.g h;
    private org.apache.a.n.b i;
    private org.apache.a.n.v j;
    private org.apache.a.c.k k;
    private org.apache.a.c.p l;
    private org.apache.a.c.c m;
    private org.apache.a.c.c n;
    private org.apache.a.c.h o;
    private org.apache.a.c.i p;
    private org.apache.a.f.b.d q;
    private org.apache.a.c.t r;
    private org.apache.a.c.g s;
    private org.apache.a.c.d t;

    protected c(org.apache.a.f.c c2, j j2) {
        this.b = j2;
        this.d = c2;
    }

    protected abstract j c();

    protected abstract org.apache.a.n.b d();

    protected g e() {
        org.apache.a.n.a a2 = new org.apache.a.n.a();
        a2.a("http.scheme-registry", this.b().a());
        a2.a("http.authscheme-registry", this.w());
        a2.a("http.cookiespec-registry", this.y());
        a2.a("http.cookie-store", this.J());
        a2.a("http.auth.credentials-provider", this.K());
        return a2;
    }

    protected org.apache.a.f.c f() {
        org.apache.a.f.c.j j2 = ar.a();
        org.apache.a.f.c c2 = null;
        j j3 = this.a();
        org.apache.a.f.d d2 = null;
        String string = (String)j3.a("http.connection-manager.factory-class-name");
        if (string != null) {
            try {
                Class<?> class_ = Class.forName(string);
                d2 = (org.apache.a.f.d)class_.newInstance();
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw new IllegalStateException("Invalid class name: " + string);
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new IllegalAccessError(illegalAccessException.getMessage());
            }
            catch (InstantiationException instantiationException) {
                throw new InstantiationError(instantiationException.getMessage());
            }
        }
        c2 = d2 != null ? d2.a(j3, j2) : new org.apache.a.i.c.d(j2);
        return c2;
    }

    protected org.apache.a.b.g g() {
        org.apache.a.b.g g2 = new org.apache.a.b.g();
        g2.a("Basic", new org.apache.a.i.a.c());
        g2.a("Digest", new e());
        g2.a("NTLM", new org.apache.a.i.a.z());
        g2.a("negotiate", new ae());
        g2.a("Kerberos", new org.apache.a.i.a.m());
        return g2;
    }

    protected org.apache.a.g.k h() {
        org.apache.a.g.k k2 = new org.apache.a.g.k();
        k2.a("best-match", new l());
        k2.a("compatibility", new org.apache.a.i.d.p());
        k2.a("netscape", new org.apache.a.i.d.aa());
        k2.a("rfc2109", new af());
        k2.a("rfc2965", new am());
        k2.a("ignoreCookies", new org.apache.a.i.d.w());
        return k2;
    }

    protected org.apache.a.n.m i() {
        return new org.apache.a.n.m();
    }

    protected b j() {
        return new i();
    }

    protected org.apache.a.f.h k() {
        return new org.apache.a.i.b.r();
    }

    protected org.apache.a.c.k l() {
        return new t();
    }

    protected o m() {
        return new v();
    }

    protected org.apache.a.c.c n() {
        return new bc();
    }

    protected org.apache.a.c.b o() {
        return new aa();
    }

    protected org.apache.a.c.c p() {
        return new at();
    }

    protected org.apache.a.c.b q() {
        return new org.apache.a.i.b.u();
    }

    protected org.apache.a.c.h r() {
        return new h();
    }

    protected org.apache.a.c.i s() {
        return new org.apache.a.i.b.i();
    }

    protected org.apache.a.f.b.d t() {
        return new org.apache.a.i.c.p(this.b().a());
    }

    protected org.apache.a.c.t u() {
        return new ab();
    }

    public final synchronized j a() {
        if (this.b == null) {
            this.b = this.c();
        }
        return this.b;
    }

    public synchronized void a(j j2) {
        this.b = j2;
    }

    public final synchronized org.apache.a.f.c b() {
        if (this.d == null) {
            this.d = this.f();
        }
        return this.d;
    }

    public final synchronized org.apache.a.n.m v() {
        if (this.c == null) {
            this.c = this.i();
        }
        return this.c;
    }

    public final synchronized org.apache.a.b.g w() {
        if (this.h == null) {
            this.h = this.g();
        }
        return this.h;
    }

    public synchronized void a(org.apache.a.b.g g2) {
        this.h = g2;
    }

    public final synchronized org.apache.a.c.g x() {
        return this.s;
    }

    public synchronized void a(org.apache.a.c.g g2) {
        this.s = g2;
    }

    public final synchronized org.apache.a.g.k y() {
        if (this.g == null) {
            this.g = this.h();
        }
        return this.g;
    }

    public final synchronized org.apache.a.c.d z() {
        return this.t;
    }

    public synchronized void a(org.apache.a.c.d d2) {
        this.t = d2;
    }

    public synchronized void a(org.apache.a.g.k k2) {
        this.g = k2;
    }

    public final synchronized b A() {
        if (this.e == null) {
            this.e = this.j();
        }
        return this.e;
    }

    public synchronized void a(b b2) {
        this.e = b2;
    }

    public final synchronized org.apache.a.f.h B() {
        if (this.f == null) {
            this.f = this.k();
        }
        return this.f;
    }

    public synchronized void a(org.apache.a.f.h h2) {
        this.f = h2;
    }

    public final synchronized org.apache.a.c.k C() {
        if (this.k == null) {
            this.k = this.l();
        }
        return this.k;
    }

    public synchronized void a(org.apache.a.c.k k2) {
        this.k = k2;
    }

    public final synchronized o D() {
        return this.m();
    }

    public synchronized void a(o o2) {
        this.l = new org.apache.a.i.b.x(o2);
    }

    public final synchronized org.apache.a.c.p E() {
        if (this.l == null) {
            this.l = new org.apache.a.i.b.w();
        }
        return this.l;
    }

    public synchronized void a(org.apache.a.c.p p2) {
        this.l = p2;
    }

    public final synchronized org.apache.a.c.b F() {
        return this.o();
    }

    public synchronized void a(org.apache.a.c.b b2) {
        this.m = new d(b2);
    }

    public final synchronized org.apache.a.c.c G() {
        if (this.m == null) {
            this.m = this.n();
        }
        return this.m;
    }

    public synchronized void a(org.apache.a.c.c c2) {
        this.m = c2;
    }

    public final synchronized org.apache.a.c.b H() {
        return this.q();
    }

    public synchronized void b(org.apache.a.c.b b2) {
        this.n = new d(b2);
    }

    public final synchronized org.apache.a.c.c I() {
        if (this.n == null) {
            this.n = this.p();
        }
        return this.n;
    }

    public synchronized void b(org.apache.a.c.c c2) {
        this.n = c2;
    }

    public final synchronized org.apache.a.c.h J() {
        if (this.o == null) {
            this.o = this.r();
        }
        return this.o;
    }

    public synchronized void a(org.apache.a.c.h h2) {
        this.o = h2;
    }

    public final synchronized org.apache.a.c.i K() {
        if (this.p == null) {
            this.p = this.s();
        }
        return this.p;
    }

    public synchronized void a(org.apache.a.c.i i2) {
        this.p = i2;
    }

    public final synchronized org.apache.a.f.b.d L() {
        if (this.q == null) {
            this.q = this.t();
        }
        return this.q;
    }

    public synchronized void a(org.apache.a.f.b.d d2) {
        this.q = d2;
    }

    public final synchronized org.apache.a.c.t M() {
        if (this.r == null) {
            this.r = this.u();
        }
        return this.r;
    }

    public synchronized void a(org.apache.a.c.t t2) {
        this.r = t2;
    }

    protected final synchronized org.apache.a.n.b N() {
        if (this.i == null) {
            this.i = this.d();
        }
        return this.i;
    }

    private synchronized org.apache.a.n.k S() {
        if (this.j == null) {
            int n2;
            org.apache.a.n.b b2 = this.N();
            int n3 = b2.a();
            w[] arrw = new w[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                arrw[n2] = b2.a(n2);
            }
            n2 = b2.c();
            z[] arrz = new z[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                arrz[i2] = b2.b(i2);
            }
            this.j = new org.apache.a.n.v(arrw, arrz);
        }
        return this.j;
    }

    public synchronized int O() {
        return this.N().c();
    }

    public synchronized z a(int n2) {
        return this.N().b(n2);
    }

    public synchronized w b(int n2) {
        return this.N().a(n2);
    }

    public synchronized int P() {
        return this.N().a();
    }

    public synchronized void a(z z2) {
        this.N().b(z2);
        this.j = null;
    }

    public synchronized void a(z z2, int n2) {
        this.N().b(z2, n2);
        this.j = null;
    }

    public synchronized void Q() {
        this.N().d();
        this.j = null;
    }

    public synchronized void a(Class class_) {
        this.N().b(class_);
        this.j = null;
    }

    public synchronized void a(w w2) {
        this.N().b(w2);
        this.j = null;
    }

    public synchronized void a(w w2, int n2) {
        this.N().b(w2, n2);
        this.j = null;
    }

    public synchronized void R() {
        this.N().b();
        this.j = null;
    }

    public synchronized void b(Class class_) {
        this.N().a(class_);
        this.j = null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected final org.apache.a.c.c.e b(r r2, u u2, g g2) {
        Object object;
        Object object2;
        org.apache.a.o.a.a(u2, "HTTP request");
        Object object3 = null;
        q q2 = null;
        org.apache.a.f.b.d d2 = null;
        org.apache.a.c.g g3 = null;
        org.apache.a.c.d d3 = null;
        Object object4 = this;
        synchronized (object4) {
            object2 = this.e();
            object3 = g2 == null ? object2 : new org.apache.a.n.d(g2, (g)object2);
            object = this.a(u2);
            org.apache.a.c.a.c c2 = org.apache.a.c.d.f.a((j)object);
            object3.a("http.request-config", c2);
            q2 = this.a(this.v(), this.b(), this.A(), this.B(), this.L(), this.S(), this.C(), this.E(), this.G(), this.I(), this.M(), (j)object);
            d2 = this.L();
            g3 = this.x();
            d3 = this.z();
        }
        try {
            if (g3 != null && d3 != null) {
                object4 = r2 != null ? r2 : (r)this.a(u2).a("http.default-host");
                object2 = d2.a((r)object4, u2, (g)object3);
                try {
                    object = org.apache.a.i.b.n.a(q2.a(r2, u2, (g)object3));
                }
                catch (RuntimeException runtimeException) {
                    if (g3.a(runtimeException)) {
                        d3.a((org.apache.a.f.b.b)object2);
                    }
                    throw runtimeException;
                }
                catch (Exception exception) {
                    if (g3.a(exception)) {
                        d3.a((org.apache.a.f.b.b)object2);
                    }
                    if (exception instanceof p) {
                        throw (p)exception;
                    }
                    if (exception instanceof IOException) {
                        throw (IOException)exception;
                    }
                    throw new UndeclaredThrowableException(exception);
                }
                if (g3.a((x)object)) {
                    d3.a((org.apache.a.f.b.b)object2);
                } else {
                    d3.b((org.apache.a.f.b.b)object2);
                }
                return object;
            }
            return org.apache.a.i.b.n.a(q2.a(r2, u2, (g)object3));
        }
        catch (p p2) {
            throw new f(p2);
        }
    }

    protected q a(org.apache.a.n.m m2, org.apache.a.f.c c2, b b2, org.apache.a.f.h h2, org.apache.a.f.b.d d2, org.apache.a.n.k k2, org.apache.a.c.k k3, o o2, org.apache.a.c.b b3, org.apache.a.c.b b4, org.apache.a.c.t t2, j j2) {
        return new y(m2, c2, b2, h2, d2, k2, k3, o2, b3, b4, t2, j2);
    }

    protected q a(org.apache.a.n.m m2, org.apache.a.f.c c2, b b2, org.apache.a.f.h h2, org.apache.a.f.b.d d2, org.apache.a.n.k k2, org.apache.a.c.k k3, org.apache.a.c.p p2, org.apache.a.c.b b3, org.apache.a.c.b b4, org.apache.a.c.t t2, j j2) {
        return new y(this.a, m2, c2, b2, h2, d2, k2, k3, p2, b3, b4, t2, j2);
    }

    protected q a(org.apache.a.n.m m2, org.apache.a.f.c c2, b b2, org.apache.a.f.h h2, org.apache.a.f.b.d d2, org.apache.a.n.k k2, org.apache.a.c.k k3, org.apache.a.c.p p2, org.apache.a.c.c c3, org.apache.a.c.c c4, org.apache.a.c.t t2, j j2) {
        return new y(this.a, m2, c2, b2, h2, d2, k2, k3, p2, c3, c4, t2, j2);
    }

    protected j a(u u2) {
        return new k(null, this.a(), u2.f(), null);
    }

    public void close() {
        this.b().c();
    }
}

