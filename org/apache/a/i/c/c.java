/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import org.apache.a.f.w;
import org.apache.a.i.c.a;
import org.apache.a.i.c.b;
import org.apache.a.i.c.k;
import org.apache.a.l.j;
import org.apache.a.n.g;
import org.apache.a.r;

public abstract class c
extends a {
    protected volatile b a;

    protected c(org.apache.a.f.c c2, b b2) {
        super(c2, b2.b);
        this.a = b2;
    }

    public String s() {
        return null;
    }

    protected b z() {
        return this.a;
    }

    protected void a(b b2) {
        if (this.y() || b2 == null) {
            throw new k();
        }
    }

    protected final void A() {
        if (this.a == null) {
            throw new k();
        }
    }

    protected synchronized void u() {
        this.a = null;
        super.u();
    }

    public org.apache.a.f.b.b m() {
        b b2 = this.z();
        this.a(b2);
        return b2.e == null ? null : b2.e.l();
    }

    public void a(org.apache.a.f.b.b b2, g g2, j j2) {
        b b3 = this.z();
        this.a(b3);
        b3.a(b2, g2, j2);
    }

    public void a(boolean bl2, j j2) {
        b b2 = this.z();
        this.a(b2);
        b2.a(bl2, j2);
    }

    public void a(r r2, boolean bl2, j j2) {
        b b2 = this.z();
        this.a(b2);
        b2.a(r2, bl2, j2);
    }

    public void a(g g2, j j2) {
        b b2 = this.z();
        this.a(b2);
        b2.a(g2, j2);
    }

    public void close() {
        w w2;
        b b2 = this.z();
        if (b2 != null) {
            b2.b();
        }
        if ((w2 = this.v()) != null) {
            w2.close();
        }
    }

    public void f() {
        w w2;
        b b2 = this.z();
        if (b2 != null) {
            b2.b();
        }
        if ((w2 = this.v()) != null) {
            w2.f();
        }
    }

    public Object r() {
        b b2 = this.z();
        this.a(b2);
        return b2.a();
    }

    public void a(Object object) {
        b b2 = this.z();
        this.a(b2);
        b2.a(object);
    }
}

