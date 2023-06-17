/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import org.apache.a.ah;
import org.apache.a.aj;
import org.apache.a.an;
import org.apache.a.i.g.a;
import org.apache.a.j.h;
import org.apache.a.k.w;
import org.apache.a.k.x;
import org.apache.a.l.j;
import org.apache.a.o.d;
import org.apache.a.t;
import org.apache.a.y;
import org.apache.commons.d.c;

public class s
extends a {
    private final org.apache.commons.d.a b = org.apache.commons.d.c.b(this.getClass());
    private final y c;
    private final d d;
    private final int e;

    public s(h h2, w w2, y y2, j j2) {
        super(h2, w2, j2);
        org.apache.a.o.a.a(y2, "Response factory");
        this.c = y2;
        this.d = new d(128);
        this.e = this.a(j2);
    }

    protected int a(j j2) {
        return j2.a("http.connection.max-status-line-garbage", Integer.MAX_VALUE);
    }

    protected t b(h h2) {
        int n2 = 0;
        x x2 = null;
        while (true) {
            this.d.a();
            int n3 = h2.a(this.d);
            if (n3 == -1 && n2 == 0) {
                throw new ah("The target server failed to respond");
            }
            x2 = new x(0, this.d.e());
            if (this.a.b(this.d, x2)) break;
            if (n3 == -1 || n2 >= this.e) {
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
}

