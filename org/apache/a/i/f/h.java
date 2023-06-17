/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.f;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import org.apache.a.aj;
import org.apache.a.b.j;
import org.apache.a.c.c.e;
import org.apache.a.c.c.i;
import org.apache.a.c.c.q;
import org.apache.a.c.c.u;
import org.apache.a.c.f.k;
import org.apache.a.c.n;
import org.apache.a.f.b.d;
import org.apache.a.i.f.b;
import org.apache.a.i.f.g;
import org.apache.a.o;
import org.apache.a.p;
import org.apache.a.r;
import org.apache.commons.d.a;
import org.apache.commons.d.c;

public class h
implements b {
    private final a a = org.apache.commons.d.c.b(this.getClass());
    private final b b;
    private final org.apache.a.c.p c;
    private final d d;

    public h(b b2, d d2, org.apache.a.c.p p2) {
        org.apache.a.o.a.a(b2, "HTTP client request executor");
        org.apache.a.o.a.a(d2, "HTTP route planner");
        org.apache.a.o.a.a(p2, "HTTP redirect strategy");
        this.b = b2;
        this.d = d2;
        this.c = p2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public e a(org.apache.a.f.b.b b2, q q2, org.apache.a.c.e.c c2, i i2) {
        org.apache.a.c.a.c c3;
        org.apache.a.o.a.a(b2, "HTTP route");
        org.apache.a.o.a.a(q2, "HTTP request");
        org.apache.a.o.a.a(c2, "HTTP context");
        List list = c2.c();
        if (list != null) {
            list.clear();
        }
        int n2 = (c3 = c2.n()).i() > 0 ? c3.i() : 50;
        org.apache.a.f.b.b b3 = b2;
        q q3 = q2;
        int n3 = 0;
        while (true) {
            e e2 = this.b.a(b3, q3, c2, i2);
            try {
                r r2;
                Object object;
                if (!c3.f()) return e2;
                if (!this.c.a(q3, e2, c2)) return e2;
                if (n3 >= n2) {
                    throw new n("Maximum redirects (" + n2 + ") exceeded");
                }
                ++n3;
                u u2 = this.c.b(q3, e2, c2);
                if (!u2.e().hasNext()) {
                    object = q2.i();
                    u2.a(object.cJ_());
                }
                if ((q3 = q.a(u2)) instanceof o) {
                    g.a((o)((Object)q3));
                }
                if ((r2 = k.b((URI)(object = q3.k()))) == null) {
                    throw new aj("Redirect URI does not specify a valid host name: " + object);
                }
                if (!b3.a().equals(r2)) {
                    org.apache.a.b.d d2;
                    j j2;
                    j j3 = c2.k();
                    if (j3 != null) {
                        this.a.b("Resetting target auth state");
                        j3.a();
                    }
                    if ((j2 = c2.l()) != null && (d2 = j2.c()) != null && d2.c()) {
                        this.a.b("Resetting proxy auth state");
                        j2.a();
                    }
                }
                b3 = this.d.a(r2, q3, c2);
                if (this.a.a()) {
                    this.a.b("Redirecting to '" + object + "' via " + b3);
                }
                org.apache.a.o.g.b(e2.b());
                e2.close();
            }
            catch (RuntimeException runtimeException) {
                e2.close();
                throw runtimeException;
            }
            catch (IOException iOException) {
                e2.close();
                throw iOException;
            }
            catch (p p2) {
                try {
                    org.apache.a.o.g.b(e2.b());
                    throw p2;
                }
                catch (IOException iOException) {
                    this.a.b("I/O error while releasing connection", iOException);
                    throw p2;
                }
                finally {
                    e2.close();
                }
            }
        }
    }
}

