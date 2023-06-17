/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.e;

import org.apache.a.c.e.a;
import org.apache.a.c.h;
import org.apache.a.c.i;
import org.apache.a.g.k;
import org.apache.a.n.g;

public class b
implements a {
    private final g p;

    public b(g g2) {
        org.apache.a.o.a.a(g2, "HTTP context");
        this.p = g2;
    }

    public void a(k k2) {
        this.p.a("http.cookiespec-registry", k2);
    }

    public void a(org.apache.a.b.g g2) {
        this.p.a("http.authscheme-registry", g2);
    }

    public void a(h h2) {
        this.p.a("http.cookie-store", h2);
    }

    public void a(i i2) {
        this.p.a("http.auth.credentials-provider", i2);
    }
}

