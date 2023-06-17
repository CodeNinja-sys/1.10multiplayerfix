/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.io.IOException;
import java.net.URI;
import org.apache.a.c.e.d;
import org.apache.a.c.f;
import org.apache.a.c.f.k;
import org.apache.a.f.c;
import org.apache.a.i.b.ac;
import org.apache.a.i.b.aw;
import org.apache.a.i.b.s;
import org.apache.a.l.j;
import org.apache.a.n;
import org.apache.a.n.a;
import org.apache.a.n.g;
import org.apache.a.o;
import org.apache.a.r;
import org.apache.a.u;
import org.apache.a.w;
import org.apache.a.x;
import org.apache.a.z;

public class p
implements org.apache.a.c.j {
    private final org.apache.a.c.j a;
    private final w b;
    private final z c;

    public p() {
        this(new s());
    }

    public p(org.apache.a.c.j j2) {
        this(j2, new d(), new org.apache.a.c.e.p());
    }

    p(org.apache.a.c.j j2, w w2, z z2) {
        this.a = j2;
        this.b = w2;
        this.c = z2;
    }

    public j a() {
        return this.a.a();
    }

    public c b() {
        return this.a.b();
    }

    public x a(org.apache.a.c.c.u u2) {
        return this.a(this.b(u2), (u)u2, (g)null);
    }

    public org.apache.a.c.j c() {
        return this.a;
    }

    r b(org.apache.a.c.c.u u2) {
        URI uRI = u2.k();
        return k.b(uRI);
    }

    public x a(org.apache.a.c.c.u u2, g g2) {
        return this.a(this.b(u2), (u)u2, g2);
    }

    public x a(r r2, u u2) {
        return this.a(r2, u2, (g)null);
    }

    public x a(r r2, u u2, g g2) {
        try {
            g g3 = g2 != null ? g2 : new a();
            aw aw2 = u2 instanceof o ? new ac((o)u2) : new aw(u2);
            this.b.a(aw2, g3);
            x x2 = this.a.a(r2, (u)aw2, g3);
            try {
                this.c.a(x2, g3);
                if (Boolean.TRUE.equals(g3.a("http.client.response.uncompressed"))) {
                    x2.e("Content-Length");
                    x2.e("Content-Encoding");
                    x2.e("Content-MD5");
                }
                return x2;
            }
            catch (org.apache.a.p p2) {
                org.apache.a.o.g.b(x2.b());
                throw p2;
            }
            catch (IOException iOException) {
                org.apache.a.o.g.b(x2.b());
                throw iOException;
            }
            catch (RuntimeException runtimeException) {
                org.apache.a.o.g.b(x2.b());
                throw runtimeException;
            }
        }
        catch (org.apache.a.p p3) {
            throw new f(p3);
        }
    }

    public Object a(org.apache.a.c.c.u u2, org.apache.a.c.r r2) {
        return this.a(this.b(u2), (u)u2, r2);
    }

    public Object a(org.apache.a.c.c.u u2, org.apache.a.c.r r2, g g2) {
        return this.a(this.b(u2), u2, r2, g2);
    }

    public Object a(r r2, u u2, org.apache.a.c.r r3) {
        return this.a(r2, u2, r3, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object a(r r2, u u2, org.apache.a.c.r r3, g g2) {
        x x2 = this.a(r2, u2, g2);
        try {
            Object object = r3.a(x2);
            return object;
        }
        finally {
            n n2 = x2.b();
            if (n2 != null) {
                org.apache.a.o.g.b(n2);
            }
        }
    }
}

