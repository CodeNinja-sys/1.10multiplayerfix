/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.f;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.a.aj;
import org.apache.a.b;
import org.apache.a.c.c.q;
import org.apache.a.f.h;
import org.apache.a.f.o;
import org.apache.a.i.f.c;
import org.apache.a.i.f.g;
import org.apache.a.i.f.i;
import org.apache.a.j;
import org.apache.a.n;
import org.apache.a.n.aa;
import org.apache.a.n.ab;
import org.apache.a.n.k;
import org.apache.a.n.m;
import org.apache.a.n.v;
import org.apache.a.o.l;
import org.apache.a.p;
import org.apache.a.r;
import org.apache.a.u;
import org.apache.a.x;
import org.apache.commons.d.a;

public class e
implements org.apache.a.i.f.b {
    private final a a = org.apache.commons.d.c.b(this.getClass());
    private final m b;
    private final o c;
    private final b d;
    private final h e;
    private final k f;

    public e(m m2, o o2, b b2, h h2) {
        org.apache.a.o.a.a(m2, "HTTP request executor");
        org.apache.a.o.a.a(o2, "Client connection manager");
        org.apache.a.o.a.a(b2, "Connection reuse strategy");
        org.apache.a.o.a.a(h2, "Connection keep alive strategy");
        this.f = new v(new org.apache.a.n.x(), new aa(), new org.apache.a.c.e.i(), new ab(l.a("Apache-HttpClient", "org.apache.http.client", this.getClass())));
        this.b = m2;
        this.c = o2;
        this.d = b2;
        this.e = h2;
    }

    static void a(q q2, org.apache.a.f.b.b b2) {
        try {
            URI uRI = q2.k();
            if (uRI != null) {
                uRI = uRI.isAbsolute() ? org.apache.a.c.f.k.a(uRI, null, true) : org.apache.a.c.f.k.a(uRI);
                q2.a(uRI);
            }
        }
        catch (URISyntaxException uRISyntaxException) {
            throw new aj("Invalid URI: " + q2.g().c(), uRISyntaxException);
        }
    }

    public org.apache.a.c.c.e a(org.apache.a.f.b.b b2, q q2, org.apache.a.c.e.c c2, org.apache.a.c.c.i i2) {
        j j2;
        org.apache.a.o.a.a(b2, "HTTP route");
        org.apache.a.o.a.a(q2, "HTTP request");
        org.apache.a.o.a.a(c2, "HTTP context");
        org.apache.a.i.f.e.a(q2, b2);
        org.apache.a.f.k k2 = this.c.a(b2, null);
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
        c c4 = new c(this.a, this.c, j2);
        try {
            Object object;
            int n3;
            if (i2 != null) {
                if (i2.h()) {
                    c4.close();
                    throw new i("Request aborted");
                }
                i2.a(c4);
            }
            if (!j2.c()) {
                n3 = c3.n();
                this.c.a(j2, b2, n3 > 0 ? n3 : 0, c2);
                this.c.b(j2, b2, c2);
            }
            if ((n3 = c3.o()) >= 0) {
                j2.b(n3);
            }
            r r2 = null;
            u u2 = q2.i();
            if (u2 instanceof org.apache.a.c.c.u && ((URI)(object = ((org.apache.a.c.c.u)u2).k())).isAbsolute()) {
                r2 = new r(((URI)object).getHost(), ((URI)object).getPort(), ((URI)object).getScheme());
            }
            if (r2 == null) {
                r2 = b2.a();
            }
            c2.a("http.target_host", r2);
            c2.a("http.request", q2);
            c2.a("http.connection", j2);
            c2.a("http.route", b2);
            this.f.a(q2, (org.apache.a.n.g)c2);
            object = this.b.a((u)q2, j2, (org.apache.a.n.g)c2);
            this.f.a((x)object, (org.apache.a.n.g)c2);
            if (this.d.a((x)object, c2)) {
                long l2 = this.e.a((x)object, c2);
                c4.a(l2, TimeUnit.MILLISECONDS);
                c4.c();
            } else {
                c4.d();
            }
            n n4 = object.b();
            if (n4 == null || !n4.g()) {
                c4.cM_();
                return g.a((x)object, null);
            }
            return g.a((x)object, c4);
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
}

