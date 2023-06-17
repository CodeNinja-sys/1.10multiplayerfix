/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.net.InetAddress;
import org.apache.a.c.a.c;
import org.apache.a.f.b.b;
import org.apache.a.f.b.d;
import org.apache.a.f.x;
import org.apache.a.f.y;
import org.apache.a.n.g;
import org.apache.a.o.a;
import org.apache.a.p;
import org.apache.a.r;
import org.apache.a.u;

public class t
implements d {
    private final x a;

    public t(x x2) {
        this.a = x2 != null ? x2 : org.apache.a.i.c.u.a;
    }

    public b a(r r2, u u2, g g2) {
        r r3;
        org.apache.a.o.a.a(r2, "Target host");
        org.apache.a.o.a.a(u2, "Request");
        org.apache.a.c.e.c c2 = org.apache.a.c.e.c.a(g2);
        c c3 = c2.n();
        InetAddress inetAddress = c3.c();
        r r4 = c3.b();
        if (r4 == null) {
            r4 = this.b(r2, u2, g2);
        }
        if (r2.b() <= 0) {
            try {
                r3 = new r(r2.a(), this.a.a(r2), r2.c());
            }
            catch (y y2) {
                throw new p(y2.getMessage());
            }
        } else {
            r3 = r2;
        }
        boolean bl2 = r3.c().equalsIgnoreCase("https");
        if (r4 == null) {
            return new b(r3, inetAddress, bl2);
        }
        return new b(r3, inetAddress, r4, bl2);
    }

    protected r b(r r2, u u2, g g2) {
        return null;
    }
}

