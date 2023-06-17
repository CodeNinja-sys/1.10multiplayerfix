/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.n;

import org.apache.a.ak;
import org.apache.a.f;
import org.apache.a.n;
import org.apache.a.n.g;
import org.apache.a.n.h;
import org.apache.a.o.a;
import org.apache.a.x;
import org.apache.a.z;

public class ac
implements z {
    public void a(x x2, g g2) {
        Object object;
        a.a(x2, "HTTP response");
        h h2 = h.b(g2);
        int n2 = x2.a().b();
        if (n2 == 400 || n2 == 408 || n2 == 411 || n2 == 413 || n2 == 414 || n2 == 503 || n2 == 501) {
            x2.b("Connection", "Close");
            return;
        }
        f f2 = x2.c("Connection");
        if (f2 != null && "Close".equalsIgnoreCase(f2.d())) {
            return;
        }
        n n3 = x2.b();
        if (n3 != null) {
            object = x2.a().a();
            if (n3.c() < 0L && (!n3.b() || ((ak)object).d(org.apache.a.ac.c))) {
                x2.b("Connection", "Close");
                return;
            }
        }
        if ((object = h2.q()) != null) {
            f f3 = object.c("Connection");
            if (f3 != null) {
                x2.b("Connection", f3.d());
            } else if (object.c().d(org.apache.a.ac.c)) {
                x2.b("Connection", "Close");
            }
        }
    }
}

