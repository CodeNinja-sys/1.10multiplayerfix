/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.e;

import org.apache.a.b.d;
import org.apache.a.b.j;
import org.apache.a.b.o;
import org.apache.a.c.a;
import org.apache.a.c.e.c;
import org.apache.a.c.i;
import org.apache.a.f.b.e;
import org.apache.a.n.g;
import org.apache.a.r;
import org.apache.a.u;
import org.apache.a.w;

public class f
implements w {
    private final org.apache.commons.d.a a = org.apache.commons.d.c.b(this.getClass());

    public void a(u u2, g g2) {
        d d2;
        Object object;
        j j2;
        org.apache.a.o.a.a(u2, "HTTP request");
        org.apache.a.o.a.a(g2, "HTTP context");
        c c2 = c.a(g2);
        a a2 = c2.j();
        if (a2 == null) {
            this.a.b("Auth cache not set in the context");
            return;
        }
        i i2 = c2.i();
        if (i2 == null) {
            this.a.b("Credentials provider not set in the context");
            return;
        }
        e e2 = c2.b();
        r r2 = c2.t();
        if (r2.b() < 0) {
            r2 = new r(r2.a(), e2.a().b(), r2.c());
        }
        if ((j2 = c2.k()) != null && j2.b() == org.apache.a.b.c.a && (object = a2.a(r2)) != null) {
            this.a(r2, (d)object, j2, i2);
        }
        object = e2.e();
        j j3 = c2.l();
        if (object != null && j3 != null && j3.b() == org.apache.a.b.c.a && (d2 = a2.a((r)object)) != null) {
            this.a((r)object, d2, j3, i2);
        }
    }

    private void a(r r2, d d2, j j2, i i2) {
        org.apache.a.b.i i3;
        o o2;
        String string = d2.a();
        if (this.a.a()) {
            this.a.b("Re-using cached '" + string + "' auth scheme for " + r2);
        }
        if ((o2 = i2.a(i3 = new org.apache.a.b.i(r2, org.apache.a.b.i.c, string))) != null) {
            if ("BASIC".equalsIgnoreCase(d2.a())) {
                j2.a(org.apache.a.b.c.b);
            } else {
                j2.a(org.apache.a.b.c.e);
            }
            j2.a(d2, o2);
        } else {
            this.a.b("No credentials for preemptive authentication");
        }
    }
}

