/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.g;

import org.apache.a.a;
import org.apache.a.am;
import org.apache.a.j.h;
import org.apache.a.k.w;
import org.apache.a.k.x;
import org.apache.a.l.j;
import org.apache.a.o.d;
import org.apache.a.t;
import org.apache.a.v;

public class q
extends org.apache.a.i.g.a {
    private final v b;
    private final d c;

    public q(h h2, w w2, v v2, j j2) {
        super(h2, w2, j2);
        this.b = (v)org.apache.a.o.a.a(v2, "Request factory");
        this.c = new d(128);
    }

    protected t b(h h2) {
        this.c.a();
        int n2 = h2.a(this.c);
        if (n2 == -1) {
            throw new a("Client closed connection");
        }
        x x2 = new x(0, this.c.e());
        am am2 = this.a.c(this.c, x2);
        return this.b.a(am2);
    }
}

