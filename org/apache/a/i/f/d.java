/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.f;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.a.b;
import org.apache.a.c.c.e;
import org.apache.a.c.c.q;
import org.apache.a.c.t;
import org.apache.a.f.b.a;
import org.apache.a.f.b.h;
import org.apache.a.i.f.c;
import org.apache.a.i.f.g;
import org.apache.a.i.f.i;
import org.apache.a.j;
import org.apache.a.n;
import org.apache.a.n.aa;
import org.apache.a.n.k;
import org.apache.a.n.m;
import org.apache.a.n.v;
import org.apache.a.o;
import org.apache.a.p;
import org.apache.a.r;
import org.apache.a.u;
import org.apache.a.x;

public class d
implements org.apache.a.i.f.b {
    private final org.apache.commons.d.a a = org.apache.commons.d.c.b(this.getClass());
    private final m b;
    private final org.apache.a.f.o c;
    private final b d;
    private final org.apache.a.f.h e;
    private final k f;
    private final org.apache.a.c.c g;
    private final org.apache.a.c.c h;
    private final org.apache.a.i.a.i i;
    private final t j;
    private final org.apache.a.f.b.c k;

    public d(m m2, org.apache.a.f.o o2, b b2, org.apache.a.f.h h2, org.apache.a.c.c c2, org.apache.a.c.c c3, t t2) {
        org.apache.a.o.a.a(m2, "HTTP request executor");
        org.apache.a.o.a.a(o2, "Client connection manager");
        org.apache.a.o.a.a(b2, "Connection reuse strategy");
        org.apache.a.o.a.a(h2, "Connection keep alive strategy");
        org.apache.a.o.a.a(c2, "Target authentication strategy");
        org.apache.a.o.a.a(c3, "Proxy authentication strategy");
        org.apache.a.o.a.a(t2, "User token handler");
        this.i = new org.apache.a.i.a.i();
        this.f = new v(new aa(), new org.apache.a.c.e.i());
        this.k = new a();
        this.b = m2;
        this.c = o2;
        this.d = b2;
        this.e = h2;
        this.g = c2;
        this.h = c3;
        this.j = t2;
    }

    public e a(org.apache.a.f.b.b b2, q q2, org.apache.a.c.e.c c2, org.apache.a.c.c.i i2) {
        j j2;
        org.apache.a.b.j j3;
        org.apache.a.o.a.a(b2, "HTTP route");
        org.apache.a.o.a.a(q2, "HTTP request");
        org.apache.a.o.a.a(c2, "HTTP context");
        org.apache.a.b.j j4 = c2.k();
        if (j4 == null) {
            j4 = new org.apache.a.b.j();
            c2.a("http.auth.target-scope", j4);
        }
        if ((j3 = c2.l()) == null) {
            j3 = new org.apache.a.b.j();
            c2.a("http.auth.proxy-scope", j3);
        }
        if (q2 instanceof o) {
            org.apache.a.i.f.g.a((o)((Object)q2));
        }
        Object object = c2.m();
        org.apache.a.f.k k2 = this.c.a(b2, object);
        if (i2 != null) {
            if (i2.h()) {
                k2.a();
                throw new i("Request aborted");
            }
            i2.a(k2);
        }
        org.apache.a.c.a.c c3 = c2.n();
        try {
            int n2 = c3.m();
            j2 = k2.a(n2 > 0 ? (long)n2 : 0L, TimeUnit.MILLISECONDS);
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            throw new i("Request aborted", interruptedException);
        }
        catch (ExecutionException executionException) {
            Throwable throwable = executionException.getCause();
            if (throwable == null) {
                throwable = executionException;
            }
            throw new i("Request execution failed", throwable);
        }
        c2.a("http.connection", j2);
        if (c3.d() && j2.c()) {
            this.a.b("Stale connection check");
            if (j2.d()) {
                this.a.b("Stale connection detected");
                j2.close();
            }
        }
        c c4 = new c(this.a, this.c, j2);
        try {
            n n3;
            x x2;
            if (i2 != null) {
                i2.a(c4);
            }
            int n4 = 1;
            while (true) {
                int n5;
                if (n4 > 1 && !org.apache.a.i.f.g.a(q2)) {
                    throw new org.apache.a.c.m("Cannot retry request with a non-repeatable request entity.");
                }
                if (i2 != null && i2.h()) {
                    throw new i("Request aborted");
                }
                if (!j2.c()) {
                    this.a.b("Opening connection " + b2);
                    try {
                        this.a(j3, j2, b2, q2, c2);
                    }
                    catch (org.apache.a.i.f.o o2) {
                        if (this.a.a()) {
                            this.a.b(o2.getMessage());
                        }
                        x2 = o2.a();
                        break;
                    }
                }
                if ((n5 = c3.o()) >= 0) {
                    j2.b(n5);
                }
                if (i2 != null && i2.h()) {
                    throw new i("Request aborted");
                }
                if (this.a.a()) {
                    this.a.b("Executing request " + q2.g());
                }
                if (!q2.a("Authorization")) {
                    if (this.a.a()) {
                        this.a.b("Target auth state: " + (Object)((Object)j4.b()));
                    }
                    this.i.a(q2, j4, c2);
                }
                if (!q2.a("Proxy-Authorization") && !b2.g()) {
                    if (this.a.a()) {
                        this.a.b("Proxy auth state: " + (Object)((Object)j3.b()));
                    }
                    this.i.a(q2, j3, c2);
                }
                if (this.d.a(x2 = this.b.a((u)q2, j2, (org.apache.a.n.g)c2), c2)) {
                    long l2 = this.e.a(x2, c2);
                    if (this.a.a()) {
                        String string = l2 > 0L ? "for " + l2 + " " + (Object)((Object)TimeUnit.MILLISECONDS) : "indefinitely";
                        this.a.b("Connection can be kept alive " + string);
                    }
                    c4.a(l2, TimeUnit.MILLISECONDS);
                    c4.c();
                } else {
                    c4.d();
                }
                if (!this.a(j4, j3, b2, x2, c2)) break;
                n n6 = x2.b();
                if (c4.b()) {
                    org.apache.a.o.g.b(n6);
                } else {
                    j2.close();
                    if (j3.b() == org.apache.a.b.c.e && j3.c() != null && j3.c().c()) {
                        this.a.b("Resetting proxy auth state");
                        j3.a();
                    }
                    if (j4.b() == org.apache.a.b.c.e && j4.c() != null && j4.c().c()) {
                        this.a.b("Resetting target auth state");
                        j4.a();
                    }
                }
                u u2 = q2.i();
                if (!u2.a("Authorization")) {
                    q2.e("Authorization");
                }
                if (!u2.a("Proxy-Authorization")) {
                    q2.e("Proxy-Authorization");
                }
                ++n4;
            }
            if (object == null) {
                object = this.j.a(c2);
                c2.a("http.user-token", object);
            }
            if (object != null) {
                c4.a(object);
            }
            if ((n3 = x2.b()) == null || !n3.g()) {
                c4.cM_();
                return org.apache.a.i.f.g.a(x2, null);
            }
            return org.apache.a.i.f.g.a(x2, c4);
        }
        catch (org.apache.a.i.c.k k3) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("Connection has been shut down");
            interruptedIOException.initCause(k3);
            throw interruptedIOException;
        }
        catch (p p2) {
            c4.cN_();
            throw p2;
        }
        catch (IOException iOException) {
            c4.cN_();
            throw iOException;
        }
        catch (RuntimeException runtimeException) {
            c4.cN_();
            throw runtimeException;
        }
    }

    void a(org.apache.a.b.j j2, j j3, org.apache.a.f.b.b b2, u u2, org.apache.a.c.e.c c2) {
        int n2;
        org.apache.a.c.a.c c3 = c2.n();
        int n3 = c3.n();
        h h2 = new h(b2);
        do {
            org.apache.a.f.b.b b3 = h2.l();
            n2 = this.k.a(b2, b3);
            switch (n2) {
                case 1: {
                    this.c.a(j3, b2, n3 > 0 ? n3 : 0, c2);
                    h2.a(b2.j());
                    break;
                }
                case 2: {
                    this.c.a(j3, b2, n3 > 0 ? n3 : 0, c2);
                    r r2 = b2.e();
                    h2.a(r2, false);
                    break;
                }
                case 3: {
                    int n4 = this.b(j2, j3, b2, u2, c2) ? 1 : 0;
                    this.a.b("Tunnel to target created.");
                    h2.b(n4 != 0);
                    break;
                }
                case 4: {
                    int n4 = b3.d() - 1;
                    boolean bl2 = this.a(b2, n4, c2);
                    this.a.b("Tunnel to proxy created.");
                    h2.b(b2.a(n4), bl2);
                    break;
                }
                case 5: {
                    this.c.a(j3, b2, c2);
                    h2.c(b2.j());
                    break;
                }
                case -1: {
                    throw new p("Unable to establish route: planned = " + b2 + "; current = " + b3);
                }
                case 0: {
                    this.c.b(j3, b2, c2);
                    break;
                }
                default: {
                    throw new IllegalStateException("Unknown step indicator " + n2 + " from RouteDirector.");
                }
            }
        } while (n2 > 0);
    }

    private boolean b(org.apache.a.b.j j2, j j3, org.apache.a.f.b.b b2, u u2, org.apache.a.c.e.c c2) {
        n n2;
        int n3;
        x x2;
        org.apache.a.c.a.c c3 = c2.n();
        int n4 = c3.n();
        r r2 = b2.a();
        r r3 = b2.e();
        String string = r2.f();
        org.apache.a.k.i i2 = new org.apache.a.k.i("CONNECT", string, u2.c());
        this.b.a((u)i2, this.f, (org.apache.a.n.g)c2);
        while (true) {
            if (!j3.c()) {
                this.c.a(j3, b2, n4 > 0 ? n4 : 0, c2);
            }
            i2.e("Proxy-Authorization");
            this.i.a(i2, j2, c2);
            x2 = this.b.a((u)i2, j3, (org.apache.a.n.g)c2);
            n3 = x2.a().b();
            if (n3 < 200) {
                throw new p("Unexpected response to CONNECT request: " + x2.a());
            }
            if (!c3.j()) continue;
            if (!this.i.a(r3, x2, this.h, j2, c2) || !this.i.b(r3, x2, this.h, j2, c2)) break;
            if (this.d.a(x2, c2)) {
                this.a.b("Connection kept alive");
                n2 = x2.b();
                org.apache.a.o.g.b(n2);
                continue;
            }
            j3.close();
        }
        n3 = x2.a().b();
        if (n3 > 299) {
            n2 = x2.b();
            if (n2 != null) {
                x2.a(new org.apache.a.h.c(n2));
            }
            j3.close();
            throw new org.apache.a.i.f.o("CONNECT refused by proxy: " + x2.a(), x2);
        }
        return false;
    }

    private boolean a(org.apache.a.f.b.b b2, int n2, org.apache.a.c.e.c c2) {
        throw new p("Proxy chains are not supported.");
    }

    private boolean a(org.apache.a.b.j j2, org.apache.a.b.j j3, org.apache.a.f.b.b b2, x x2, org.apache.a.c.e.c c2) {
        org.apache.a.c.a.c c3 = c2.n();
        if (c3.j()) {
            r r2 = c2.t();
            if (r2 == null) {
                r2 = b2.a();
            }
            if (r2.b() < 0) {
                r2 = new r(r2.a(), b2.a().b(), r2.c());
            }
            boolean bl2 = this.i.a(r2, x2, this.g, j2, c2);
            r r3 = b2.e();
            if (r3 == null) {
                r3 = b2.a();
            }
            boolean bl3 = this.i.a(r3, x2, this.h, j3, c2);
            if (bl2) {
                return this.i.b(r2, x2, this.g, j2, c2);
            }
            if (bl3) {
                return this.i.b(r3, x2, this.h, j3, c2);
            }
        }
        return false;
    }
}

