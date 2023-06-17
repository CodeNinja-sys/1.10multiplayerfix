/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.io.InterruptedIOException;
import org.apache.a.f.b.h;
import org.apache.a.f.e;
import org.apache.a.f.w;
import org.apache.a.l.j;
import org.apache.a.n.g;
import org.apache.a.o.a;
import org.apache.a.r;

public abstract class b {
    protected final e a;
    protected final w b;
    protected volatile org.apache.a.f.b.b c;
    protected volatile Object d;
    protected volatile h e;

    protected b(e e2, org.apache.a.f.b.b b2) {
        org.apache.a.o.a.a(e2, "Connection operator");
        this.a = e2;
        this.b = e2.a();
        this.c = b2;
        this.e = null;
    }

    public Object a() {
        return this.d;
    }

    public void a(Object object) {
        this.d = object;
    }

    public void a(org.apache.a.f.b.b b2, g g2, j j2) {
        org.apache.a.o.a.a(b2, "Route");
        org.apache.a.o.a.a(j2, "HTTP parameters");
        if (this.e != null) {
            org.apache.a.o.b.a(!this.e.k(), "Connection already open");
        }
        this.e = new h(b2);
        r r2 = b2.e();
        this.a.a(this.b, r2 != null ? r2 : b2.a(), b2.b(), g2, j2);
        h h2 = this.e;
        if (h2 == null) {
            throw new InterruptedIOException("Request aborted");
        }
        if (r2 == null) {
            h2.a(this.b.m());
        } else {
            h2.a(r2, this.b.m());
        }
    }

    public void a(boolean bl2, j j2) {
        org.apache.a.o.a.a(j2, "HTTP parameters");
        org.apache.a.o.b.a(this.e, "Route tracker");
        org.apache.a.o.b.a(this.e.k(), "Connection not open");
        org.apache.a.o.b.a(!this.e.g(), "Connection is already tunnelled");
        this.b.a(null, this.e.a(), bl2, j2);
        this.e.b(bl2);
    }

    public void a(r r2, boolean bl2, j j2) {
        org.apache.a.o.a.a(r2, "Next proxy");
        org.apache.a.o.a.a(j2, "Parameters");
        org.apache.a.o.b.a(this.e, "Route tracker");
        org.apache.a.o.b.a(this.e.k(), "Connection not open");
        this.b.a(null, r2, bl2, j2);
        this.e.b(r2, bl2);
    }

    public void a(g g2, j j2) {
        org.apache.a.o.a.a(j2, "HTTP parameters");
        org.apache.a.o.b.a(this.e, "Route tracker");
        org.apache.a.o.b.a(this.e.k(), "Connection not open");
        org.apache.a.o.b.a(this.e.g(), "Protocol layering without a tunnel not supported");
        org.apache.a.o.b.a(!this.e.i(), "Multiple protocol layering not supported");
        r r2 = this.e.a();
        this.a.a(this.b, r2, g2, j2);
        this.e.c(this.b.m());
    }

    protected void b() {
        this.e = null;
        this.d = null;
    }
}

