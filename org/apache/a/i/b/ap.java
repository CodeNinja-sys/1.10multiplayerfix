/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import org.apache.a.c.a.c;
import org.apache.a.c.c.q;
import org.apache.a.c.f;
import org.apache.a.f.b.b;
import org.apache.a.f.o;
import org.apache.a.i.b.aq;
import org.apache.a.i.b.m;
import org.apache.a.i.b.r;
import org.apache.a.i.f.e;
import org.apache.a.i.i;
import org.apache.a.l.j;
import org.apache.a.n.a;
import org.apache.a.n.g;
import org.apache.a.p;
import org.apache.a.u;

class ap
extends m {
    private final o a;
    private final e b;
    private final j c;

    public ap(o o2) {
        this.a = (o)org.apache.a.o.a.a(o2, "HTTP connection manager");
        this.b = new e(new org.apache.a.n.m(), o2, i.a, r.a);
        this.c = new org.apache.a.l.b();
    }

    protected org.apache.a.c.c.e b(org.apache.a.r r2, u u2, g g2) {
        org.apache.a.o.a.a(r2, "Target host");
        org.apache.a.o.a.a(u2, "HTTP request");
        org.apache.a.c.c.i i2 = null;
        if (u2 instanceof org.apache.a.c.c.i) {
            i2 = (org.apache.a.c.c.i)((Object)u2);
        }
        try {
            q q2 = q.a(u2);
            org.apache.a.c.e.c c2 = org.apache.a.c.e.c.a(g2 != null ? g2 : new a());
            b b2 = new b(r2);
            c c3 = null;
            if (u2 instanceof org.apache.a.c.c.f) {
                c3 = ((org.apache.a.c.c.f)((Object)u2)).d();
            }
            if (c3 != null) {
                c2.a(c3);
            }
            return this.b.a(b2, q2, c2, i2);
        }
        catch (p p2) {
            throw new f(p2);
        }
    }

    public j a() {
        return this.c;
    }

    public void close() {
        this.a.b();
    }

    public org.apache.a.f.c b() {
        return new aq(this);
    }

    static /* synthetic */ o a(ap ap2) {
        return ap2.a;
    }
}

