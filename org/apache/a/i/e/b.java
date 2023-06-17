/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.e;

import org.apache.a.f;
import org.apache.a.i.g.e;
import org.apache.a.i.g.g;
import org.apache.a.i.g.v;
import org.apache.a.j.h;
import org.apache.a.n;
import org.apache.a.o.a;
import org.apache.a.t;

public class b {
    private final org.apache.a.h.e a;

    public b(org.apache.a.h.e e2) {
        this.a = (org.apache.a.h.e)org.apache.a.o.a.a(e2, "Content length strategy");
    }

    protected org.apache.a.h.b a(h h2, t t2) {
        f f2;
        org.apache.a.h.b b2 = new org.apache.a.h.b();
        long l2 = this.a.a(t2);
        if (l2 == -2L) {
            b2.a(true);
            b2.a(-1L);
            b2.a(new e(h2));
        } else if (l2 == -1L) {
            b2.a(false);
            b2.a(-1L);
            b2.a(new v(h2));
        } else {
            b2.a(false);
            b2.a(l2);
            b2.a(new g(h2, l2));
        }
        f f3 = t2.c("Content-Type");
        if (f3 != null) {
            b2.a(f3);
        }
        if ((f2 = t2.c("Content-Encoding")) != null) {
            b2.b(f2);
        }
        return b2;
    }

    public n b(h h2, t t2) {
        org.apache.a.o.a.a(h2, "Session input buffer");
        org.apache.a.o.a.a(t2, "HTTP message");
        return this.a(h2, t2);
    }
}

