/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.f;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.a.aj;
import org.apache.a.b.t;
import org.apache.a.c.c.e;
import org.apache.a.c.c.q;
import org.apache.a.i.b.i;
import org.apache.a.i.f.b;
import org.apache.a.n.g;
import org.apache.a.n.k;
import org.apache.a.p;
import org.apache.a.r;
import org.apache.a.u;
import org.apache.a.x;
import org.apache.commons.d.a;
import org.apache.commons.d.c;

public class f
implements b {
    private final a a = org.apache.commons.d.c.b(this.getClass());
    private final b b;
    private final k c;

    public f(b b2, k k2) {
        org.apache.a.o.a.a(b2, "HTTP client request executor");
        org.apache.a.o.a.a(k2, "HTTP protocol processor");
        this.b = b2;
        this.c = k2;
    }

    void a(q q2, org.apache.a.f.b.b b2) {
        try {
            URI uRI = q2.k();
            if (uRI != null) {
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
                q2.a(uRI);
            }
        }
        catch (URISyntaxException uRISyntaxException) {
            throw new aj("Invalid URI: " + q2.g().c(), uRISyntaxException);
        }
    }

    public e a(org.apache.a.f.b.b b2, q q2, org.apache.a.c.e.c c2, org.apache.a.c.c.i i2) {
        Object object;
        Object object2;
        URI uRI;
        block17: {
            org.apache.a.o.a.a(b2, "HTTP route");
            org.apache.a.o.a.a(q2, "HTTP request");
            org.apache.a.o.a.a(c2, "HTTP context");
            u u2 = q2.i();
            uRI = null;
            if (u2 instanceof org.apache.a.c.c.u) {
                uRI = ((org.apache.a.c.c.u)u2).k();
            } else {
                object2 = u2.g().c();
                try {
                    uRI = URI.create((String)object2);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    if (!this.a.a()) break block17;
                    this.a.b("Unable to parse '" + (String)object2 + "' as a valid URI; " + "request URI and Host header may be inconsistent", illegalArgumentException);
                }
            }
        }
        q2.a(uRI);
        this.a(q2, b2);
        object2 = q2.f();
        r r2 = (r)object2.a("http.virtual-host");
        if (r2 != null && r2.b() == -1) {
            int n2 = b2.a().b();
            if (n2 != -1) {
                r2 = new r(r2.a(), n2, r2.c());
            }
            if (this.a.a()) {
                this.a.b("Using virtual host" + r2);
            }
        }
        r r3 = null;
        if (r2 != null) {
            r3 = r2;
        } else if (uRI != null && uRI.isAbsolute() && uRI.getHost() != null) {
            r3 = new r(uRI.getHost(), uRI.getPort(), uRI.getScheme());
        }
        if (r3 == null) {
            r3 = b2.a();
        }
        if (uRI != null && (object = uRI.getUserInfo()) != null) {
            org.apache.a.c.i i3 = c2.i();
            if (i3 == null) {
                i3 = new i();
                c2.a(i3);
            }
            i3.a(new org.apache.a.b.i(r3), new t((String)object));
        }
        c2.a("http.target_host", r3);
        c2.a("http.route", b2);
        c2.a("http.request", q2);
        this.c.a(q2, (g)c2);
        object = this.b.a(b2, q2, c2, i2);
        try {
            c2.a("http.response", object);
            this.c.a((x)object, (g)c2);
            return object;
        }
        catch (RuntimeException runtimeException) {
            object.close();
            throw runtimeException;
        }
        catch (IOException iOException) {
            object.close();
            throw iOException;
        }
        catch (p p2) {
            object.close();
            throw p2;
        }
    }
}

