/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i;

import java.io.IOException;
import org.apache.a.aa;
import org.apache.a.i.e.a;
import org.apache.a.i.e.c;
import org.apache.a.i.e.d;
import org.apache.a.i.e.e;
import org.apache.a.i.g.i;
import org.apache.a.i.g.t;
import org.apache.a.i.k;
import org.apache.a.i.o;
import org.apache.a.j.g;
import org.apache.a.j.h;
import org.apache.a.l.j;
import org.apache.a.m;
import org.apache.a.n;
import org.apache.a.u;
import org.apache.a.v;
import org.apache.a.x;

public abstract class b
implements aa {
    private final c a = this.n();
    private final org.apache.a.i.e.b b = this.m();
    private h c = null;
    private org.apache.a.j.i d = null;
    private org.apache.a.j.b e = null;
    private org.apache.a.j.c f = null;
    private org.apache.a.j.e g = null;
    private o h = null;

    protected abstract void l();

    protected org.apache.a.i.e.b m() {
        return new org.apache.a.i.e.b(new a(new d(0)));
    }

    protected c n() {
        return new c(new e());
    }

    protected v o() {
        return k.a;
    }

    protected org.apache.a.j.c a(h h2, v v2, j j2) {
        return new i(h2, null, v2, j2);
    }

    protected org.apache.a.j.e a(org.apache.a.j.i i2, j j2) {
        return new t(i2, null, j2);
    }

    protected o a(g g2, g g3) {
        return new o(g2, g3);
    }

    protected void a(h h2, org.apache.a.j.i i2, j j2) {
        this.c = (h)org.apache.a.o.a.a(h2, "Input session buffer");
        this.d = (org.apache.a.j.i)org.apache.a.o.a.a(i2, "Output session buffer");
        if (h2 instanceof org.apache.a.j.b) {
            this.e = (org.apache.a.j.b)((Object)h2);
        }
        this.f = this.a(h2, this.o(), j2);
        this.g = this.a(i2, j2);
        this.h = this.a(h2.c(), i2.b());
    }

    public u a() {
        this.l();
        u u2 = (u)this.f.a();
        this.h.f();
        return u2;
    }

    public void a(org.apache.a.o o2) {
        org.apache.a.o.a.a(o2, "HTTP request");
        this.l();
        n n2 = this.b.b(this.c, o2);
        o2.a(n2);
    }

    protected void p() {
        this.d.a();
    }

    public void b() {
        this.l();
        this.p();
    }

    public void a(x x2) {
        org.apache.a.o.a.a(x2, "HTTP response");
        this.l();
        this.g.b(x2);
        if (x2.a().b() >= 200) {
            this.h.g();
        }
    }

    public void b(x x2) {
        if (x2.b() == null) {
            return;
        }
        this.a.a(this.d, x2, x2.b());
    }

    protected boolean q() {
        return this.e != null && this.e.d();
    }

    public boolean d() {
        if (!this.c()) {
            return true;
        }
        if (this.q()) {
            return true;
        }
        try {
            this.c.a(1);
            return this.q();
        }
        catch (IOException iOException) {
            return true;
        }
    }

    public m g() {
        return this.h;
    }
}

