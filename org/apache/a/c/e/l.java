/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.e;

import org.apache.a.b.j;
import org.apache.a.c.e.g;
import org.apache.a.f.b.b;
import org.apache.a.f.s;
import org.apache.a.o.a;
import org.apache.a.u;

public class l
extends g {
    public void a(u u2, org.apache.a.n.g g2) {
        org.apache.a.o.a.a(u2, "HTTP request");
        org.apache.a.o.a.a(g2, "HTTP context");
        if (u2.a("Proxy-Authorization")) {
            return;
        }
        s s2 = (s)g2.a("http.connection");
        if (s2 == null) {
            this.a.b("HTTP connection not set in the context");
            return;
        }
        b b2 = s2.m();
        if (b2.g()) {
            return;
        }
        j j2 = (j)g2.a("http.auth.proxy-scope");
        if (j2 == null) {
            this.a.b("Proxy auth state not set in the context");
            return;
        }
        if (this.a.a()) {
            this.a.b("Proxy auth state: " + (Object)((Object)j2.b()));
        }
        this.a(j2, u2, g2);
    }
}

