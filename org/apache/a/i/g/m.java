/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.g;

import org.apache.a.ah;
import org.apache.a.an;
import org.apache.a.i.g.a;
import org.apache.a.i.l;
import org.apache.a.j.h;
import org.apache.a.k.w;
import org.apache.a.l.j;
import org.apache.a.o.d;
import org.apache.a.t;
import org.apache.a.x;
import org.apache.a.y;

public class m
extends a {
    private final y b;
    private final d c;

    public m(h h2, w w2, y y2, j j2) {
        super(h2, w2, j2);
        this.b = (y)org.apache.a.o.a.a(y2, "Response factory");
        this.c = new d(128);
    }

    public m(h h2, w w2, y y2, org.apache.a.e.d d2) {
        super(h2, w2, d2);
        this.b = y2 != null ? y2 : l.a;
        this.c = new d(128);
    }

    public m(h h2, org.apache.a.e.d d2) {
        this(h2, null, null, d2);
    }

    public m(h h2) {
        this(h2, null, null, org.apache.a.e.d.a);
    }

    protected x a(h h2) {
        this.c.a();
        int n2 = h2.a(this.c);
        if (n2 == -1) {
            throw new ah("The target server failed to respond");
        }
        org.apache.a.k.x x2 = new org.apache.a.k.x(0, this.c.e());
        an an2 = this.a.d(this.c, x2);
        return this.b.a(an2, null);
    }

    protected /* synthetic */ t b(h h2) {
        return this.a(h2);
    }
}

