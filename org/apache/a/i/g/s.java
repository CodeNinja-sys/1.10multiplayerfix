/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.g;

import org.apache.a.ah;
import org.apache.a.an;
import org.apache.a.i.g.a;
import org.apache.a.j.h;
import org.apache.a.k.w;
import org.apache.a.k.x;
import org.apache.a.l.j;
import org.apache.a.o.d;
import org.apache.a.t;
import org.apache.a.y;

public class s
extends a {
    private final y b;
    private final d c;

    public s(h h2, w w2, y y2, j j2) {
        super(h2, w2, j2);
        this.b = (y)org.apache.a.o.a.a(y2, "Response factory");
        this.c = new d(128);
    }

    protected t b(h h2) {
        this.c.a();
        int n2 = h2.a(this.c);
        if (n2 == -1) {
            throw new ah("The target server failed to respond");
        }
        x x2 = new x(0, this.c.e());
        an an2 = this.a.d(this.c, x2);
        return this.b.a(an2, null);
    }
}

