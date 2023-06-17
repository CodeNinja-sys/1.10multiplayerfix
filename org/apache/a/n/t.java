/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.n;

import org.apache.a.aa;
import org.apache.a.ac;
import org.apache.a.af;
import org.apache.a.aj;
import org.apache.a.aq;
import org.apache.a.b;
import org.apache.a.h.d;
import org.apache.a.i.i;
import org.apache.a.i.l;
import org.apache.a.n.g;
import org.apache.a.n.j;
import org.apache.a.n.k;
import org.apache.a.n.n;
import org.apache.a.n.o;
import org.apache.a.n.q;
import org.apache.a.n.u;
import org.apache.a.o.a;
import org.apache.a.o.f;
import org.apache.a.p;
import org.apache.a.x;
import org.apache.a.y;

public class t {
    private volatile org.apache.a.l.j a = null;
    private volatile k b = null;
    private volatile o c = null;
    private volatile b d = null;
    private volatile y e = null;
    private volatile j f = null;

    public t(k k2, b b2, y y2, q q2, j j2, org.apache.a.l.j j3) {
        this(k2, b2, y2, new u(q2), j2);
        this.a = j3;
    }

    public t(k k2, b b2, y y2, q q2, org.apache.a.l.j j2) {
        this(k2, b2, y2, new u(q2), null);
        this.a = j2;
    }

    public t(k k2, b b2, y y2) {
        this.a(k2);
        this.a(b2);
        this.a(y2);
    }

    public t(k k2, b b2, y y2, o o2, j j2) {
        this.b = (k)org.apache.a.o.a.a(k2, "HTTP processor");
        this.d = b2 != null ? b2 : i.a;
        this.e = y2 != null ? y2 : l.a;
        this.c = o2;
        this.f = j2;
    }

    public t(k k2, b b2, y y2, o o2) {
        this(k2, b2, y2, o2, null);
    }

    public t(k k2, o o2) {
        this(k2, null, null, o2, null);
    }

    public void a(k k2) {
        org.apache.a.o.a.a(k2, "HTTP processor");
        this.b = k2;
    }

    public void a(b b2) {
        org.apache.a.o.a.a(b2, "Connection reuse strategy");
        this.d = b2;
    }

    public void a(y y2) {
        org.apache.a.o.a.a(y2, "Response factory");
        this.e = y2;
    }

    public void a(org.apache.a.l.j j2) {
        this.a = j2;
    }

    public void a(q q2) {
        this.c = new u(q2);
    }

    public void a(j j2) {
        this.f = j2;
    }

    public org.apache.a.l.j a() {
        return this.a;
    }

    public void a(aa aa2, g g2) {
        g2.a("http.connection", aa2);
        x x2 = null;
        try {
            org.apache.a.u u2 = aa2.a();
            if (u2 instanceof org.apache.a.o) {
                if (((org.apache.a.o)u2).a()) {
                    x2 = this.e.a(ac.d, 100, g2);
                    if (this.f != null) {
                        try {
                            this.f.a(u2, x2, g2);
                        }
                        catch (p p2) {
                            x2 = this.e.a(ac.c, 500, g2);
                            this.a(p2, x2);
                        }
                    }
                    if (x2.a().b() < 200) {
                        aa2.a(x2);
                        aa2.b();
                        x2 = null;
                        aa2.a((org.apache.a.o)u2);
                    }
                } else {
                    aa2.a((org.apache.a.o)u2);
                }
            }
            g2.a("http.request", u2);
            if (x2 == null) {
                x2 = this.e.a(ac.d, 200, g2);
                this.b.a(u2, g2);
                this.a(u2, x2, g2);
            }
            if (u2 instanceof org.apache.a.o) {
                org.apache.a.n n2 = ((org.apache.a.o)u2).b();
                org.apache.a.o.g.b(n2);
            }
        }
        catch (p p3) {
            x2 = this.e.a(ac.c, 500, g2);
            this.a(p3, x2);
        }
        g2.a("http.response", x2);
        this.b.a(x2, g2);
        aa2.a(x2);
        aa2.b(x2);
        aa2.b();
        if (!this.d.a(x2, g2)) {
            aa2.close();
        }
    }

    protected void a(p p2, x x2) {
        if (p2 instanceof af) {
            x2.a(501);
        } else if (p2 instanceof aq) {
            x2.a(505);
        } else if (p2 instanceof aj) {
            x2.a(400);
        } else {
            x2.a(500);
        }
        String string = p2.getMessage();
        if (string == null) {
            string = p2.toString();
        }
        byte[] arrby = org.apache.a.o.f.a(string);
        d d2 = new d(arrby);
        d2.a("text/plain; charset=US-ASCII");
        x2.a(d2);
    }

    protected void a(org.apache.a.u u2, x x2, g g2) {
        n n2 = null;
        if (this.c != null) {
            n2 = this.c.a(u2);
        }
        if (n2 != null) {
            n2.a(u2, x2, g2);
        } else {
            x2.a(501);
        }
    }
}

