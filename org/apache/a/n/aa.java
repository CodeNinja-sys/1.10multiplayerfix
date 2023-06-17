/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.n;

import java.net.InetAddress;
import org.apache.a.ac;
import org.apache.a.aj;
import org.apache.a.ak;
import org.apache.a.k;
import org.apache.a.n.g;
import org.apache.a.n.h;
import org.apache.a.o.a;
import org.apache.a.r;
import org.apache.a.s;
import org.apache.a.u;
import org.apache.a.w;

public class aa
implements w {
    public void a(u u2, g g2) {
        a.a(u2, "HTTP request");
        h h2 = h.b(g2);
        ak ak2 = u2.g().b();
        String string = u2.g().a();
        if (string.equalsIgnoreCase("CONNECT") && ak2.d(ac.c)) {
            return;
        }
        if (!u2.a("Host")) {
            r r2 = h2.t();
            if (r2 == null) {
                k k2 = h2.p();
                if (k2 instanceof s) {
                    InetAddress inetAddress = ((s)k2).j();
                    int n2 = ((s)k2).k();
                    if (inetAddress != null) {
                        r2 = new r(inetAddress.getHostName(), n2);
                    }
                }
                if (r2 == null) {
                    if (ak2.d(ac.c)) {
                        return;
                    }
                    throw new aj("Target host missing");
                }
            }
            u2.a("Host", r2.f());
        }
    }
}

