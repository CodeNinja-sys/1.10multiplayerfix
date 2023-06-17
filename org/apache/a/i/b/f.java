/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URI;
import org.apache.a.f.c;
import org.apache.a.i.b.s;
import org.apache.a.i.b.z;
import org.apache.a.l.j;
import org.apache.a.n.g;
import org.apache.a.r;
import org.apache.a.u;
import org.apache.a.x;
import org.apache.commons.d.a;

public class f
implements org.apache.a.c.j {
    private final org.apache.a.c.j a;
    private final org.apache.a.c.s b;
    private final a c = org.apache.commons.d.c.b(this.getClass());

    public f(org.apache.a.c.j j2, org.apache.a.c.s s2) {
        org.apache.a.o.a.a(j2, "HttpClient");
        org.apache.a.o.a.a(s2, "ServiceUnavailableRetryStrategy");
        this.a = j2;
        this.b = s2;
    }

    public f() {
        this(new s(), new z());
    }

    public f(org.apache.a.c.s s2) {
        this(new s(), s2);
    }

    public f(org.apache.a.c.j j2) {
        this(j2, new z());
    }

    public x a(r r2, u u2) {
        g g2 = null;
        return this.a(r2, u2, g2);
    }

    public Object a(r r2, u u2, org.apache.a.c.r r3) {
        return this.a(r2, u2, r3, null);
    }

    public Object a(r r2, u u2, org.apache.a.c.r r3, g g2) {
        x x2 = this.a(r2, u2, g2);
        return r3.a(x2);
    }

    public x a(org.apache.a.c.c.u u2) {
        g g2 = null;
        return this.a(u2, g2);
    }

    public x a(org.apache.a.c.c.u u2, g g2) {
        URI uRI = u2.k();
        r r2 = new r(uRI.getHost(), uRI.getPort(), uRI.getScheme());
        return this.a(r2, (u)u2, g2);
    }

    public Object a(org.apache.a.c.c.u u2, org.apache.a.c.r r2) {
        return this.a(u2, r2, null);
    }

    public Object a(org.apache.a.c.c.u u2, org.apache.a.c.r r2, g g2) {
        x x2 = this.a(u2, g2);
        return r2.a(x2);
    }

    public x a(r r2, u u2, g g2) {
        int n2 = 1;
        while (true) {
            block8: {
                x x2 = this.a.a(r2, u2, g2);
                try {
                    if (this.b.a(x2, n2, g2)) {
                        org.apache.a.o.g.b(x2.b());
                        long l2 = this.b.a();
                        try {
                            this.c.a("Wait for " + l2);
                            Thread.sleep(l2);
                            break block8;
                        }
                        catch (InterruptedException interruptedException) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                    return x2;
                }
                catch (RuntimeException runtimeException) {
                    try {
                        org.apache.a.o.g.b(x2.b());
                    }
                    catch (IOException iOException) {
                        this.c.d("I/O error consuming response content", iOException);
                    }
                    throw runtimeException;
                }
            }
            ++n2;
        }
    }

    public c b() {
        return this.a.b();
    }

    public j a() {
        return this.a.a();
    }
}

