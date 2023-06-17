/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.e;

import org.apache.a.b.d;
import org.apache.a.c.a;
import org.apache.a.f.c.f;
import org.apache.a.f.c.j;
import org.apache.a.n.g;
import org.apache.a.r;
import org.apache.a.x;
import org.apache.a.z;
import org.apache.commons.d.c;

public class n
implements z {
    private final org.apache.commons.d.a a = c.b(this.getClass());

    public void a(x x2, g g2) {
        Object object;
        Object object2;
        org.apache.a.o.a.a(x2, "HTTP request");
        org.apache.a.o.a.a(g2, "HTTP context");
        a a2 = (a)g2.a("http.auth.auth-cache");
        r r2 = (r)g2.a("http.target_host");
        org.apache.a.b.j j2 = (org.apache.a.b.j)g2.a("http.auth.target-scope");
        if (r2 != null && j2 != null) {
            if (this.a.a()) {
                this.a.b("Target auth state: " + (Object)((Object)j2.b()));
            }
            if (this.a(j2)) {
                object2 = (j)g2.a("http.scheme-registry");
                if (r2.b() < 0) {
                    object = ((j)object2).a(r2);
                    r2 = new r(r2.a(), ((f)object).a(r2.b()), r2.c());
                }
                if (a2 == null) {
                    a2 = new org.apache.a.i.b.g();
                    g2.a("http.auth.auth-cache", a2);
                }
                switch (j2.b()) {
                    case b: {
                        this.a(a2, r2, j2.c());
                        break;
                    }
                    case d: {
                        this.b(a2, r2, j2.c());
                    }
                }
            }
        }
        object2 = (r)g2.a("http.proxy_host");
        object = (org.apache.a.b.j)g2.a("http.auth.proxy-scope");
        if (object2 != null && object != null) {
            if (this.a.a()) {
                this.a.b("Proxy auth state: " + (Object)((Object)((org.apache.a.b.j)object).b()));
            }
            if (this.a((org.apache.a.b.j)object)) {
                if (a2 == null) {
                    a2 = new org.apache.a.i.b.g();
                    g2.a("http.auth.auth-cache", a2);
                }
                switch (((org.apache.a.b.j)object).b()) {
                    case b: {
                        this.a(a2, (r)object2, ((org.apache.a.b.j)object).c());
                        break;
                    }
                    case d: {
                        this.b(a2, (r)object2, ((org.apache.a.b.j)object).c());
                    }
                }
            }
        }
    }

    private boolean a(org.apache.a.b.j j2) {
        d d2 = j2.c();
        if (d2 == null || !d2.d()) {
            return false;
        }
        String string = d2.a();
        return string.equalsIgnoreCase("Basic") || string.equalsIgnoreCase("Digest");
    }

    private void a(a a2, r r2, d d2) {
        if (this.a.a()) {
            this.a.b("Caching '" + d2.a() + "' auth scheme for " + r2);
        }
        a2.a(r2, d2);
    }

    private void b(a a2, r r2, d d2) {
        if (this.a.a()) {
            this.a.b("Removing from cache '" + d2.a() + "' auth scheme for " + r2);
        }
        a2.b(r2);
    }
}

