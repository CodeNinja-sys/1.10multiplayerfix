/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.e;

import org.apache.a.b.j;
import org.apache.a.c.e.g;
import org.apache.a.o.a;
import org.apache.a.u;

public class m
extends g {
    public void a(u u2, org.apache.a.n.g g2) {
        org.apache.a.o.a.a(u2, "HTTP request");
        org.apache.a.o.a.a(g2, "HTTP context");
        String string = u2.g().a();
        if (string.equalsIgnoreCase("CONNECT")) {
            return;
        }
        if (u2.a("Authorization")) {
            return;
        }
        j j2 = (j)g2.a("http.auth.target-scope");
        if (j2 == null) {
            this.a.b("Target auth state not set in the context");
            return;
        }
        if (this.a.a()) {
            this.a.b("Target auth state: " + (Object)((Object)j2.b()));
        }
        this.a(j2, u2, g2);
    }
}

