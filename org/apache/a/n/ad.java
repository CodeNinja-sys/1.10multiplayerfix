/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.n;

import org.apache.a.ac;
import org.apache.a.aj;
import org.apache.a.ak;
import org.apache.a.n;
import org.apache.a.n.g;
import org.apache.a.o.a;
import org.apache.a.x;
import org.apache.a.z;

public class ad
implements z {
    private final boolean a;

    public ad() {
        this(false);
    }

    public ad(boolean bl2) {
        this.a = bl2;
    }

    public void a(x x2, g g2) {
        org.apache.a.o.a.a(x2, "HTTP response");
        if (this.a) {
            x2.e("Transfer-Encoding");
            x2.e("Content-Length");
        } else {
            if (x2.a("Transfer-Encoding")) {
                throw new aj("Transfer-encoding header already present");
            }
            if (x2.a("Content-Length")) {
                throw new aj("Content-Length header already present");
            }
        }
        ak ak2 = x2.a().a();
        n n2 = x2.b();
        if (n2 != null) {
            long l2 = n2.c();
            if (n2.b() && !ak2.d(ac.c)) {
                x2.a("Transfer-Encoding", "chunked");
            } else if (l2 >= 0L) {
                x2.a("Content-Length", Long.toString(n2.c()));
            }
            if (n2.d() != null && !x2.a("Content-Type")) {
                x2.a(n2.d());
            }
            if (n2.e() != null && !x2.a("Content-Encoding")) {
                x2.a(n2.e());
            }
        } else {
            int n3 = x2.a().b();
            if (n3 != 204 && n3 != 304 && n3 != 205) {
                x2.a("Content-Length", "0");
            }
        }
    }
}

