/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.n;

import org.apache.a.ac;
import org.apache.a.ak;
import org.apache.a.n;
import org.apache.a.n.g;
import org.apache.a.o;
import org.apache.a.o.a;
import org.apache.a.u;
import org.apache.a.w;

public class z
implements w {
    private final boolean a;

    public z() {
        this(false);
    }

    public z(boolean bl2) {
        this.a = bl2;
    }

    public void a(u u2, g g2) {
        org.apache.a.o.a.a(u2, "HTTP request");
        if (!u2.a("Expect") && u2 instanceof o) {
            boolean bl2;
            ak ak2 = u2.g().b();
            n n2 = ((o)u2).b();
            if (n2 != null && n2.c() != 0L && !ak2.d(ac.c) && (bl2 = u2.f().a("http.protocol.expect-continue", this.a))) {
                u2.a("Expect", "100-continue");
            }
        }
    }
}

