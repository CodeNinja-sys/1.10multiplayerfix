/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.net.InetAddress;
import org.apache.a.f.a.k;
import org.apache.a.f.b.b;
import org.apache.a.f.b.d;
import org.apache.a.f.c.f;
import org.apache.a.f.c.j;
import org.apache.a.n.g;
import org.apache.a.o.a;
import org.apache.a.r;
import org.apache.a.u;

public class p
implements d {
    protected final j a;

    public p(j j2) {
        org.apache.a.o.a.a(j2, "Scheme registry");
        this.a = j2;
    }

    public b a(r r2, u u2, g g2) {
        f f2;
        org.apache.a.o.a.a(u2, "HTTP request");
        b b2 = k.b(u2.f());
        if (b2 != null) {
            return b2;
        }
        org.apache.a.o.b.a(r2, "Target host");
        InetAddress inetAddress = k.c(u2.f());
        r r3 = k.a(u2.f());
        try {
            f2 = this.a.a(r2.c());
        }
        catch (IllegalStateException illegalStateException) {
            throw new org.apache.a.p(illegalStateException.getMessage());
        }
        boolean bl2 = f2.e();
        b2 = r3 == null ? new b(r2, inetAddress, bl2) : new b(r2, inetAddress, r3, bl2);
        return b2;
    }
}

