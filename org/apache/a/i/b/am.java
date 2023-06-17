/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import org.apache.a.c.c.e;
import org.apache.a.c.c.q;
import org.apache.a.c.f;
import org.apache.a.c.h;
import org.apache.a.c.i;
import org.apache.a.f.b.b;
import org.apache.a.f.b.d;
import org.apache.a.f.o;
import org.apache.a.i.b.an;
import org.apache.a.i.b.m;
import org.apache.a.l.j;
import org.apache.a.l.k;
import org.apache.a.n.g;
import org.apache.a.p;
import org.apache.a.r;
import org.apache.a.u;
import org.apache.commons.d.a;
import org.apache.commons.d.c;

class am
extends m {
    private final a a = org.apache.commons.d.c.b(this.getClass());
    private final org.apache.a.i.f.b b;
    private final o c;
    private final d d;
    private final org.apache.a.e.c e;
    private final org.apache.a.e.c f;
    private final h g;
    private final i h;
    private final org.apache.a.c.a.c i;
    private final List j;

    public am(org.apache.a.i.f.b b2, o o2, d d2, org.apache.a.e.c c2, org.apache.a.e.c c3, h h2, i i2, org.apache.a.c.a.c c4, List list) {
        org.apache.a.o.a.a(b2, "HTTP client exec chain");
        org.apache.a.o.a.a(o2, "HTTP connection manager");
        org.apache.a.o.a.a(d2, "HTTP route planner");
        this.b = b2;
        this.c = o2;
        this.d = d2;
        this.e = c2;
        this.f = c3;
        this.g = h2;
        this.h = i2;
        this.i = c4;
        this.j = list;
    }

    private b d(r r2, u u2, g g2) {
        r r3 = r2;
        if (r3 == null) {
            r3 = (r)u2.f().a("http.default-host");
        }
        org.apache.a.o.b.a(r3, "Target host");
        return this.d.a(r3, u2, g2);
    }

    private void a(org.apache.a.c.e.c c2) {
        if (c2.a("http.auth.target-scope") == null) {
            c2.a("http.auth.target-scope", new org.apache.a.b.j());
        }
        if (c2.a("http.auth.proxy-scope") == null) {
            c2.a("http.auth.proxy-scope", new org.apache.a.b.j());
        }
        if (c2.a("http.authscheme-registry") == null) {
            c2.a("http.authscheme-registry", this.f);
        }
        if (c2.a("http.cookiespec-registry") == null) {
            c2.a("http.cookiespec-registry", this.e);
        }
        if (c2.a("http.cookie-store") == null) {
            c2.a("http.cookie-store", this.g);
        }
        if (c2.a("http.auth.credentials-provider") == null) {
            c2.a("http.auth.credentials-provider", this.h);
        }
        if (c2.a("http.request-config") == null) {
            c2.a("http.request-config", this.i);
        }
    }

    protected e b(r r2, u u2, g g2) {
        org.apache.a.o.a.a(u2, "HTTP request");
        org.apache.a.c.c.i i2 = null;
        if (u2 instanceof org.apache.a.c.c.i) {
            i2 = (org.apache.a.c.c.i)((Object)u2);
        }
        try {
            Object object;
            q q2 = q.a(u2);
            org.apache.a.c.e.c c2 = org.apache.a.c.e.c.a(g2 != null ? g2 : new org.apache.a.n.a());
            org.apache.a.c.a.c c3 = null;
            if (u2 instanceof org.apache.a.c.c.f) {
                c3 = ((org.apache.a.c.c.f)((Object)u2)).d();
            }
            if (c3 == null) {
                object = u2.f();
                if (object instanceof k) {
                    if (!((k)object).f().isEmpty()) {
                        c3 = org.apache.a.c.d.f.a((j)object);
                    }
                } else {
                    c3 = org.apache.a.c.d.f.a((j)object);
                }
            }
            if (c3 != null) {
                c2.a(c3);
            }
            this.a(c2);
            object = this.d(r2, q2, c2);
            return this.b.a((b)object, q2, c2, i2);
        }
        catch (p p2) {
            throw new f(p2);
        }
    }

    public void close() {
        this.c.b();
        if (this.j != null) {
            for (Closeable closeable : this.j) {
                try {
                    closeable.close();
                }
                catch (IOException iOException) {
                    this.a.e(iOException.getMessage(), iOException);
                }
            }
        }
    }

    public j a() {
        throw new UnsupportedOperationException();
    }

    public org.apache.a.f.c b() {
        return new an(this);
    }

    static /* synthetic */ o a(am am2) {
        return am2.c;
    }
}

