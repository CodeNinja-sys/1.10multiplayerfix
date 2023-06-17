/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.e;

import org.apache.a.c.e.c;
import org.apache.a.f.b.e;
import org.apache.a.n.g;
import org.apache.a.u;
import org.apache.a.w;
import org.apache.commons.d.a;

public class i
implements w {
    private final a a = org.apache.commons.d.c.b(this.getClass());
    private static final String b = "Proxy-Connection";

    public void a(u u2, g g2) {
        org.apache.a.o.a.a(u2, "HTTP request");
        String string = u2.g().a();
        if (string.equalsIgnoreCase("CONNECT")) {
            u2.b(b, "Keep-Alive");
            return;
        }
        c c2 = c.a(g2);
        e e2 = c2.b();
        if (e2 == null) {
            this.a.b("Connection route not set in the context");
            return;
        }
        if ((e2.d() == 1 || e2.g()) && !u2.a("Connection")) {
            u2.a("Connection", "Keep-Alive");
        }
        if (e2.d() == 2 && !e2.g() && !u2.a(b)) {
            u2.a(b, "Keep-Alive");
        }
    }
}

