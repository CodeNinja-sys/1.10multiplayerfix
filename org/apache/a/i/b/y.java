/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;
import org.apache.a.aj;
import org.apache.a.ak;
import org.apache.a.b;
import org.apache.a.b.t;
import org.apache.a.c.q;
import org.apache.a.f.b.a;
import org.apache.a.f.f;
import org.apache.a.i.b.ac;
import org.apache.a.i.b.ah;
import org.apache.a.i.b.aw;
import org.apache.a.i.b.ax;
import org.apache.a.i.b.bd;
import org.apache.a.i.b.d;
import org.apache.a.k.i;
import org.apache.a.l.h;
import org.apache.a.l.j;
import org.apache.a.l.m;
import org.apache.a.n;
import org.apache.a.n.g;
import org.apache.a.n.k;
import org.apache.a.o;
import org.apache.a.p;
import org.apache.a.r;
import org.apache.a.u;
import org.apache.a.x;
import org.apache.commons.d.c;

public class y
implements q {
    private final org.apache.commons.d.a s;
    protected final org.apache.a.f.c a;
    protected final org.apache.a.f.b.d b;
    protected final b c;
    protected final org.apache.a.f.h d;
    protected final org.apache.a.n.m e;
    protected final k f;
    protected final org.apache.a.c.k g;
    protected final org.apache.a.c.o h;
    protected final org.apache.a.c.p i;
    protected final org.apache.a.c.b j;
    protected final org.apache.a.c.c k;
    protected final org.apache.a.c.b l;
    protected final org.apache.a.c.c m;
    protected final org.apache.a.c.t n;
    protected final j o;
    protected org.apache.a.f.t p;
    protected final org.apache.a.b.j q;
    protected final org.apache.a.b.j r;
    private final ah t;
    private int u;
    private int v;
    private final int w;
    private r x;

    public y(org.apache.a.n.m m2, org.apache.a.f.c c2, b b2, org.apache.a.f.h h2, org.apache.a.f.b.d d2, k k2, org.apache.a.c.k k3, org.apache.a.c.o o2, org.apache.a.c.b b3, org.apache.a.c.b b4, org.apache.a.c.t t2, j j2) {
        this(org.apache.commons.d.c.b(y.class), m2, c2, b2, h2, d2, k2, k3, (org.apache.a.c.p)new org.apache.a.i.b.x(o2), new d(b3), new d(b4), t2, j2);
    }

    public y(org.apache.commons.d.a a2, org.apache.a.n.m m2, org.apache.a.f.c c2, b b2, org.apache.a.f.h h2, org.apache.a.f.b.d d2, k k2, org.apache.a.c.k k3, org.apache.a.c.p p2, org.apache.a.c.b b3, org.apache.a.c.b b4, org.apache.a.c.t t2, j j2) {
        this(org.apache.commons.d.c.b(y.class), m2, c2, b2, h2, d2, k2, k3, p2, new d(b3), new d(b4), t2, j2);
    }

    public y(org.apache.commons.d.a a2, org.apache.a.n.m m2, org.apache.a.f.c c2, b b2, org.apache.a.f.h h2, org.apache.a.f.b.d d2, k k2, org.apache.a.c.k k3, org.apache.a.c.p p2, org.apache.a.c.c c3, org.apache.a.c.c c4, org.apache.a.c.t t2, j j2) {
        org.apache.a.o.a.a(a2, "Log");
        org.apache.a.o.a.a(m2, "Request executor");
        org.apache.a.o.a.a(c2, "Client connection manager");
        org.apache.a.o.a.a(b2, "Connection reuse strategy");
        org.apache.a.o.a.a(h2, "Connection keep alive strategy");
        org.apache.a.o.a.a(d2, "Route planner");
        org.apache.a.o.a.a(k2, "HTTP protocol processor");
        org.apache.a.o.a.a(k3, "HTTP request retry handler");
        org.apache.a.o.a.a(p2, "Redirect strategy");
        org.apache.a.o.a.a(c3, "Target authentication strategy");
        org.apache.a.o.a.a(c4, "Proxy authentication strategy");
        org.apache.a.o.a.a(t2, "User token handler");
        org.apache.a.o.a.a(j2, "HTTP parameters");
        this.s = a2;
        this.t = new ah(a2);
        this.e = m2;
        this.a = c2;
        this.c = b2;
        this.d = h2;
        this.b = d2;
        this.f = k2;
        this.g = k3;
        this.i = p2;
        this.k = c3;
        this.m = c4;
        this.n = t2;
        this.o = j2;
        this.h = p2 instanceof org.apache.a.i.b.x ? ((org.apache.a.i.b.x)p2).a() : null;
        this.j = c3 instanceof d ? ((d)c3).a() : null;
        this.l = c4 instanceof d ? ((d)c4).a() : null;
        this.p = null;
        this.u = 0;
        this.v = 0;
        this.q = new org.apache.a.b.j();
        this.r = new org.apache.a.b.j();
        this.w = this.o.a("http.protocol.max-redirects", 100);
    }

    private aw a(u u2) {
        if (u2 instanceof o) {
            return new ac((o)u2);
        }
        return new aw(u2);
    }

    protected void a(aw aw2, org.apache.a.f.b.b b2) {
        try {
            URI uRI = aw2.k();
            if (b2.e() != null && !b2.g()) {
                if (!uRI.isAbsolute()) {
                    r r2 = b2.a();
                    uRI = org.apache.a.c.f.k.a(uRI, r2, true);
                } else {
                    uRI = org.apache.a.c.f.k.a(uRI);
                }
            } else {
                uRI = uRI.isAbsolute() ? org.apache.a.c.f.k.a(uRI, null, true) : org.apache.a.c.f.k.a(uRI);
            }
            aw2.a(uRI);
        }
        catch (URISyntaxException uRISyntaxException) {
            throw new aj("Invalid URI: " + aw2.g().c(), uRISyntaxException);
        }
    }

    public x a(r r2, u u2, g g2) {
        Object object;
        boolean bl2;
        g2.a("http.auth.target-scope", this.q);
        g2.a("http.auth.proxy-scope", this.r);
        r r3 = r2;
        u u3 = u2;
        aw aw2 = this.a(u3);
        aw2.a(this.o);
        org.apache.a.f.b.b b2 = this.b(r3, aw2, g2);
        this.x = (r)aw2.f().a("http.virtual-host");
        if (this.x != null && this.x.b() == -1 && !(bl2 = ((r)(object = r3 != null ? r3 : b2.a())).b())) {
            this.x = new r(this.x.a(), (int)bl2, this.x.c());
        }
        object = new ax(aw2, b2);
        bl2 = false;
        boolean bl3 = false;
        try {
            Object object2;
            x x2 = null;
            while (!bl3) {
                ax ax2;
                Object object3;
                object2 = ((ax)object).a();
                org.apache.a.f.b.b b3 = ((ax)object).b();
                x2 = null;
                Object object4 = g2.a("http.user-token");
                if (this.p == null) {
                    object3 = this.a.a(b3, object4);
                    if (u3 instanceof org.apache.a.c.c.a) {
                        ((org.apache.a.c.c.a)((Object)u3)).a((f)object3);
                    }
                    long l2 = org.apache.a.c.d.g.d(this.o);
                    try {
                        this.p = object3.a(l2, TimeUnit.MILLISECONDS);
                    }
                    catch (InterruptedException interruptedException) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                    if (org.apache.a.l.h.g(this.o) && this.p.c()) {
                        this.s.b("Stale connection check");
                        if (this.p.d()) {
                            this.s.b("Stale connection detected");
                            this.p.close();
                        }
                    }
                }
                if (u3 instanceof org.apache.a.c.c.a) {
                    ((org.apache.a.c.c.a)((Object)u3)).a(this.p);
                }
                try {
                    this.a((ax)object, g2);
                }
                catch (bd bd2) {
                    if (this.s.a()) {
                        this.s.b(bd2.getMessage());
                    }
                    x2 = bd2.a();
                    break;
                }
                object3 = ((aw)object2).k().getUserInfo();
                if (object3 != null) {
                    this.q.a(new org.apache.a.i.a.b(), new t((String)object3));
                }
                if (this.x != null) {
                    r3 = this.x;
                } else {
                    URI uRI = ((aw)object2).k();
                    if (uRI.isAbsolute()) {
                        r3 = org.apache.a.c.f.k.b(uRI);
                    }
                }
                if (r3 == null) {
                    r3 = b3.a();
                }
                ((aw)object2).j();
                this.a((aw)object2, b3);
                g2.a("http.target_host", r3);
                g2.a("http.route", b3);
                g2.a("http.connection", this.p);
                this.e.a((u)object2, this.f, g2);
                x2 = this.b((ax)object, g2);
                if (x2 == null) continue;
                x2.a(this.o);
                this.e.a(x2, this.f, g2);
                bl2 = this.c.a(x2, g2);
                if (bl2) {
                    long l3 = this.d.a(x2, g2);
                    if (this.s.a()) {
                        String string = l3 > 0L ? "for " + l3 + " " + (Object)((Object)TimeUnit.MILLISECONDS) : "indefinitely";
                        this.s.b("Connection can be kept alive " + string);
                    }
                    this.p.a(l3, TimeUnit.MILLISECONDS);
                }
                if ((ax2 = this.a((ax)object, x2, g2)) == null) {
                    bl3 = true;
                } else {
                    if (bl2) {
                        n n2 = x2.b();
                        org.apache.a.o.g.b(n2);
                        this.p.o();
                    } else {
                        this.p.close();
                        if (this.r.b().compareTo(org.apache.a.b.c.b) > 0 && this.r.c() != null && this.r.c().c()) {
                            this.s.b("Resetting proxy auth state");
                            this.r.a();
                        }
                        if (this.q.b().compareTo(org.apache.a.b.c.b) > 0 && this.q.c() != null && this.q.c().c()) {
                            this.s.b("Resetting target auth state");
                            this.q.a();
                        }
                    }
                    if (!ax2.b().equals(((ax)object).b())) {
                        this.a();
                    }
                    object = ax2;
                }
                if (this.p == null) continue;
                if (object4 == null) {
                    object4 = this.n.a(g2);
                    g2.a("http.user-token", object4);
                }
                if (object4 == null) continue;
                this.p.a(object4);
            }
            if (x2 == null || x2.b() == null || !x2.b().g()) {
                if (bl2) {
                    this.p.o();
                }
                this.a();
            } else {
                object2 = x2.b();
                object2 = new org.apache.a.f.b((n)object2, this.p, bl2);
                x2.a((n)object2);
            }
            return x2;
        }
        catch (org.apache.a.i.c.k k2) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("Connection has been shut down");
            interruptedIOException.initCause(k2);
            throw interruptedIOException;
        }
        catch (p p2) {
            this.b();
            throw p2;
        }
        catch (IOException iOException) {
            this.b();
            throw iOException;
        }
        catch (RuntimeException runtimeException) {
            this.b();
            throw runtimeException;
        }
    }

    private void a(ax ax2, g g2) {
        org.apache.a.f.b.b b2 = ax2.b();
        aw aw2 = ax2.a();
        int n2 = 0;
        while (true) {
            g2.a("http.request", aw2);
            ++n2;
            try {
                if (!this.p.c()) {
                    this.p.a(b2, g2, this.o);
                } else {
                    this.p.b(org.apache.a.l.h.a(this.o));
                }
                this.a(b2, g2);
            }
            catch (IOException iOException) {
                try {
                    this.p.close();
                }
                catch (IOException iOException2) {
                    // empty catch block
                }
                if (this.g.a(iOException, n2, g2)) {
                    if (!this.s.d()) continue;
                    this.s.c("I/O exception (" + iOException.getClass().getName() + ") caught when connecting to " + b2 + ": " + iOException.getMessage());
                    if (this.s.a()) {
                        this.s.b(iOException.getMessage(), iOException);
                    }
                    this.s.c("Retrying connect to " + b2);
                    continue;
                }
                throw iOException;
            }
            break;
        }
    }

    private x b(ax ax2, g g2) {
        aw aw2 = ax2.a();
        org.apache.a.f.b.b b2 = ax2.b();
        x x2 = null;
        IOException iOException = null;
        while (true) {
            ++this.u;
            aw2.n();
            if (!aw2.i()) {
                this.s.b("Cannot retry non-repeatable request");
                if (iOException != null) {
                    throw new org.apache.a.c.m("Cannot retry request with a non-repeatable request entity.  The cause lists the reason the original request failed.", iOException);
                }
                throw new org.apache.a.c.m("Cannot retry request with a non-repeatable request entity.");
            }
            try {
                if (!this.p.c()) {
                    if (!b2.g()) {
                        this.s.b("Reopening the direct connection.");
                        this.p.a(b2, g2, this.o);
                    } else {
                        this.s.b("Proxied connection. Need to start over.");
                        break;
                    }
                }
                if (this.s.a()) {
                    this.s.b("Attempt " + this.u + " to execute request");
                }
                x2 = this.e.a((u)aw2, this.p, g2);
            }
            catch (IOException iOException2) {
                this.s.b("Closing the connection.");
                try {
                    this.p.close();
                }
                catch (IOException iOException3) {
                    // empty catch block
                }
                if (this.g.a(iOException2, aw2.m(), g2)) {
                    if (this.s.d()) {
                        this.s.c("I/O exception (" + iOException2.getClass().getName() + ") caught when processing request to " + b2 + ": " + iOException2.getMessage());
                    }
                    if (this.s.a()) {
                        this.s.b(iOException2.getMessage(), iOException2);
                    }
                    if (this.s.d()) {
                        this.s.c("Retrying request to " + b2);
                    }
                    iOException = iOException2;
                    continue;
                }
                if (iOException2 instanceof org.apache.a.ah) {
                    org.apache.a.ah ah2 = new org.apache.a.ah(b2.a().f() + " failed to respond");
                    ah2.setStackTrace(iOException2.getStackTrace());
                    throw ah2;
                }
                throw iOException2;
            }
            break;
        }
        return x2;
    }

    protected void a() {
        try {
            this.p.cM_();
        }
        catch (IOException iOException) {
            this.s.b("IOException releasing connection", iOException);
        }
        this.p = null;
    }

    protected org.apache.a.f.b.b b(r r2, u u2, g g2) {
        return this.b.a(r2 != null ? r2 : (r)u2.f().a("http.default-host"), u2, g2);
    }

    protected void a(org.apache.a.f.b.b b2, g g2) {
        int n2;
        a a2 = new a();
        do {
            org.apache.a.f.b.b b3 = this.p.m();
            n2 = a2.a(b2, b3);
            switch (n2) {
                case 1: 
                case 2: {
                    this.p.a(b2, g2, this.o);
                    break;
                }
                case 3: {
                    int n3 = this.b(b2, g2);
                    this.s.b("Tunnel to target created.");
                    this.p.a(n3 != 0, this.o);
                    break;
                }
                case 4: {
                    int n3 = b3.d() - 1;
                    boolean bl2 = this.a(b2, n3, g2);
                    this.s.b("Tunnel to proxy created.");
                    this.p.a(b2.a(n3), bl2, this.o);
                    break;
                }
                case 5: {
                    this.p.a(g2, this.o);
                    break;
                }
                case -1: {
                    throw new p("Unable to establish route: planned = " + b2 + "; current = " + b3);
                }
                case 0: {
                    break;
                }
                default: {
                    throw new IllegalStateException("Unknown step indicator " + n2 + " from RouteDirector.");
                }
            }
        } while (n2 > 0);
    }

    protected boolean b(org.apache.a.f.b.b b2, g g2) {
        r r2 = b2.e();
        r r3 = b2.a();
        x x2 = null;
        while (true) {
            if (!this.p.c()) {
                this.p.a(b2, g2, this.o);
            }
            u u2 = this.c(b2, g2);
            u2.a(this.o);
            g2.a("http.target_host", r3);
            g2.a("http.proxy_host", r2);
            g2.a("http.connection", this.p);
            g2.a("http.request", u2);
            this.e.a(u2, this.f, g2);
            x2 = this.e.a(u2, this.p, g2);
            x2.a(this.o);
            this.e.a(x2, this.f, g2);
            int n2 = x2.a().b();
            if (n2 < 200) {
                throw new p("Unexpected response to CONNECT request: " + x2.a());
            }
            if (!org.apache.a.c.d.g.b(this.o)) continue;
            if (!this.t.a(r2, x2, this.m, this.r, g2) || !this.t.c(r2, x2, this.m, this.r, g2)) break;
            if (this.c.a(x2, g2)) {
                this.s.b("Connection kept alive");
                n n3 = x2.b();
                org.apache.a.o.g.b(n3);
                continue;
            }
            this.p.close();
        }
        int n4 = x2.a().b();
        if (n4 > 299) {
            n n5 = x2.b();
            if (n5 != null) {
                x2.a(new org.apache.a.h.c(n5));
            }
            this.p.close();
            throw new bd("CONNECT refused by proxy: " + x2.a(), x2);
        }
        this.p.o();
        return false;
    }

    protected boolean a(org.apache.a.f.b.b b2, int n2, g g2) {
        throw new p("Proxy chains are not supported.");
    }

    protected u c(org.apache.a.f.b.b b2, g g2) {
        Object object;
        r r2 = b2.a();
        String string = r2.a();
        int n2 = r2.b();
        if (n2 < 0) {
            object = this.a.a().a(r2.c());
            n2 = ((org.apache.a.f.c.f)object).a();
        }
        object = new StringBuilder(string.length() + 6);
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(':');
        ((StringBuilder)object).append(Integer.toString(n2));
        String string2 = ((StringBuilder)object).toString();
        ak ak2 = org.apache.a.l.m.c(this.o);
        i i2 = new i("CONNECT", string2, ak2);
        return i2;
    }

    protected ax a(ax ax2, x x2, g g2) {
        Serializable serializable;
        Object object;
        org.apache.a.f.b.b b2 = ax2.b();
        aw aw2 = ax2.a();
        j j2 = aw2.f();
        if (org.apache.a.c.d.g.b(j2)) {
            object = (r)g2.a("http.target_host");
            if (object == null) {
                object = b2.a();
            }
            if (((r)object).b() < 0) {
                org.apache.a.f.c.f f2 = this.a.a().a((r)object);
                object = new r(((r)object).a(), f2.a(), ((r)object).c());
            }
            boolean bl2 = this.t.a((r)object, x2, this.k, this.q, g2);
            serializable = b2.e();
            if (serializable == null) {
                serializable = b2.a();
            }
            boolean bl3 = this.t.a((r)serializable, x2, this.m, this.r, g2);
            if (bl2 && this.t.c((r)object, x2, this.k, this.q, g2)) {
                return ax2;
            }
            if (bl3 && this.t.c((r)serializable, x2, this.m, this.r, g2)) {
                return ax2;
            }
        }
        if (org.apache.a.c.d.g.a(j2) && this.i.a(aw2, x2, g2)) {
            Object object2;
            if (this.v >= this.w) {
                throw new org.apache.a.c.n("Maximum redirects (" + this.w + ") exceeded");
            }
            ++this.v;
            this.x = null;
            object = this.i.b(aw2, x2, g2);
            u u2 = aw2.l();
            object.a(u2.cJ_());
            serializable = object.k();
            r r2 = org.apache.a.c.f.k.b((URI)serializable);
            if (r2 == null) {
                throw new aj("Redirect URI does not specify a valid host name: " + serializable);
            }
            if (!b2.a().equals(r2)) {
                this.s.b("Resetting target auth state");
                this.q.a();
                object2 = this.r.c();
                if (object2 != null && object2.c()) {
                    this.s.b("Resetting proxy auth state");
                    this.r.a();
                }
            }
            object2 = this.a((u)object);
            ((org.apache.a.k.a)object2).a(j2);
            org.apache.a.f.b.b b3 = this.b(r2, (u)object2, g2);
            ax ax3 = new ax((aw)object2, b3);
            if (this.s.a()) {
                this.s.b("Redirecting to '" + serializable + "' via " + b3);
            }
            return ax3;
        }
        return null;
    }

    private void b() {
        org.apache.a.f.t t2 = this.p;
        if (t2 != null) {
            block5: {
                this.p = null;
                try {
                    t2.cN_();
                }
                catch (IOException iOException) {
                    if (!this.s.a()) break block5;
                    this.s.b(iOException.getMessage(), iOException);
                }
            }
            try {
                t2.cM_();
            }
            catch (IOException iOException) {
                this.s.b("Error releasing connection", iOException);
            }
        }
    }
}

