/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.n;

import org.apache.a.ac;
import org.apache.a.aj;
import org.apache.a.ak;
import org.apache.a.n;
import org.apache.a.n.g;
import org.apache.a.o;
import org.apache.a.o.a;
import org.apache.a.u;
import org.apache.a.w;

public class x
implements w {
    private final boolean a;

    public x() {
        this(false);
    }

    public x(boolean bl2) {
        this.a = bl2;
    }

    public void a(u u2, g g2) {
        org.apache.a.o.a.a(u2, "HTTP request");
        if (u2 instanceof o) {
            if (this.a) {
                u2.e("Transfer-Encoding");
                u2.e("Content-Length");
            } else {
                if (u2.a("Transfer-Encoding")) {
                    throw new aj("Transfer-encoding header already present");
                }
                if (u2.a("Content-Length")) {
                    throw new aj("Content-Length header already present");
                }
            }
            ak ak2 = u2.g().b();
            n n2 = ((o)u2).b();
            if (n2 == null) {
                u2.a("Content-Length", "0");
                return;
            }
            if (n2.b() || n2.c() < 0L) {
                if (ak2.d(ac.c)) {
                    throw new aj("Chunked transfer encoding not allowed for " + ak2);
                }
                u2.a("Transfer-Encoding", "chunked");
            } else {
                u2.a("Content-Length", Long.toString(n2.c()));
            }
            if (n2.d() != null && !u2.a("Content-Type")) {
                u2.a(n2.d());
            }
            if (n2.e() != null && !u2.a("Content-Encoding")) {
                u2.a(n2.e());
            }
        }
    }
}

