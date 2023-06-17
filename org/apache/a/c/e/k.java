/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.e;

import org.apache.a.ac;
import org.apache.a.ak;
import org.apache.a.c.e.c;
import org.apache.a.n;
import org.apache.a.n.g;
import org.apache.a.o;
import org.apache.a.o.a;
import org.apache.a.u;
import org.apache.a.w;

public class k
implements w {
    public void a(u u2, g g2) {
        a.a(u2, "HTTP request");
        if (!u2.a("Expect") && u2 instanceof o) {
            c c2;
            org.apache.a.c.a.c c3;
            ak ak2 = u2.g().b();
            n n2 = ((o)u2).b();
            if (n2 != null && n2.c() != 0L && !ak2.d(ac.c) && (c3 = (c2 = c.a(g2)).n()).a()) {
                u2.a("Expect", "100-continue");
            }
        }
    }
}

