/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import org.apache.a.ah;
import org.apache.a.aj;
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
import org.apache.commons.d.c;

public class n
extends a {
    private final org.apache.commons.d.a b = org.apache.commons.d.c.b(this.getClass());
    private final y c;
    private final d d;

    public n(h h2, w w2, y y2, j j2) {
        super(h2, w2, j2);
        org.apache.a.o.a.a(y2, "Response factory");
        this.c = y2;
        this.d = new d(128);
    }

    public n(h h2, w w2, y y2, org.apache.a.e.d d2) {
        super(h2, w2, d2);
        this.c = y2 != null ? y2 : l.a;
        this.d = new d(128);
    }

    public n(h h2, org.apache.a.e.d d2) {
        this(h2, null, null, d2);
    }

    public n(h h2) {
        this(h2, null, null, org.apache.a.e.d.a);
    }

    protected x a(h h2) {
        int n2 = 0;
        org.apache.a.k.x x2 = null;
        while (true) {
            this.d.a();
            int n3 = h2.a(this.d);
            if (n3 == -1 && n2 == 0) {
                throw new ah("The target server failed to respond");
            }
            x2 = new org.apache.a.k.x(0, this.d.e());
            if (this.a.b(this.d, x2)) break;
            if (n3 == -1 || this.a(this.d, n2)) {
                throw new aj("The server failed to respond with a valid HTTP response");
            }
            if (this.b.a()) {
                this.b.b("Garbage in response: " + this.d.toString());
            }
            ++n2;
        }
        an an2 = this.a.d(this.d, x2);
        return this.c.a(an2, null);
    }

    protected boolean a(d d2, int n2) {
        return false;
    }

    protected /* synthetic */ t b(h h2) {
        return this.a(h2);
    }
}

