/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i;

import java.io.IOException;
import java.net.SocketTimeoutException;
import org.apache.a.i.e.b;
import org.apache.a.i.e.c;
import org.apache.a.i.e.d;
import org.apache.a.i.e.e;
import org.apache.a.i.g.m;
import org.apache.a.i.g.r;
import org.apache.a.i.l;
import org.apache.a.i.o;
import org.apache.a.j;
import org.apache.a.j.g;
import org.apache.a.j.h;
import org.apache.a.j.i;
import org.apache.a.n;
import org.apache.a.u;
import org.apache.a.x;
import org.apache.a.y;

public abstract class a
implements j {
    private final c a = this.q();
    private final b b = this.p();
    private h c = null;
    private i d = null;
    private org.apache.a.j.b e = null;
    private org.apache.a.j.c f = null;
    private org.apache.a.j.e g = null;
    private o h = null;

    protected abstract void o();

    protected b p() {
        return new b(new d());
    }

    protected c q() {
        return new c(new e());
    }

    protected y r() {
        return l.a;
    }

    protected org.apache.a.j.c a(h h2, y y2, org.apache.a.l.j j2) {
        return new m(h2, null, y2, j2);
    }

    protected org.apache.a.j.e a(i i2, org.apache.a.l.j j2) {
        return new r(i2, null, j2);
    }

    protected o a(g g2, g g3) {
        return new o(g2, g3);
    }

    protected void a(h h2, i i2, org.apache.a.l.j j2) {
        this.c = (h)org.apache.a.o.a.a(h2, "Input session buffer");
        this.d = (i)org.apache.a.o.a.a(i2, "Output session buffer");
        if (h2 instanceof org.apache.a.j.b) {
            this.e = (org.apache.a.j.b)((Object)h2);
        }
        this.f = this.a(h2, this.r(), j2);
        this.g = this.a(i2, j2);
        this.h = this.a(h2.c(), i2.b());
    }

    public boolean a(int n2) {
        this.o();
        try {
            return this.c.a(n2);
        }
        catch (SocketTimeoutException socketTimeoutException) {
            return false;
        }
    }

    public void a(u u2) {
        org.apache.a.o.a.a(u2, "HTTP request");
        this.o();
        this.g.b(u2);
        this.h.f();
    }

    public void a(org.apache.a.o o2) {
        org.apache.a.o.a.a(o2, "HTTP request");
        this.o();
        if (o2.b() == null) {
            return;
        }
        this.a.a(this.d, o2, o2.b());
    }

    protected void u() {
        this.d.a();
    }

    public void b() {
        this.o();
        this.u();
    }

    public x a() {
        this.o();
        x x2 = (x)this.f.a();
        if (x2.a().b() >= 200) {
            this.h.g();
        }
        return x2;
    }

    public void a(x x2) {
        org.apache.a.o.a.a(x2, "HTTP response");
        this.o();
        n n2 = this.b.b(this.c, x2);
        x2.a(n2);
    }

    protected boolean v() {
        return this.e != null && this.e.d();
    }

    public boolean d() {
        if (!this.c()) {
            return true;
        }
        if (this.v()) {
            return true;
        }
        try {
            this.c.a(1);
            return this.v();
        }
        catch (SocketTimeoutException socketTimeoutException) {
            return false;
        }
        catch (IOException iOException) {
            return true;
        }
    }

    public org.apache.a.m g() {
        return this.h;
    }
}

