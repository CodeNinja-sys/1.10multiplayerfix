/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import java.util.List;
import org.apache.a.e;
import org.apache.a.f;
import org.apache.a.g;
import org.apache.a.g.b;
import org.apache.a.g.h;
import org.apache.a.g.p;
import org.apache.a.i.d.ae;
import org.apache.a.i.d.al;
import org.apache.a.i.d.m;
import org.apache.a.i.d.y;
import org.apache.a.k.x;
import org.apache.a.o.a;
import org.apache.a.o.d;

public class k
implements h {
    private final String[] a;
    private final boolean b;
    private al c;
    private ae d;
    private m e;

    public k(String[] arrstring, boolean bl2) {
        this.a = arrstring == null ? null : (String[])arrstring.clone();
        this.b = bl2;
    }

    public k() {
        this(null, false);
    }

    private al c() {
        if (this.c == null) {
            this.c = new al(this.a, this.b);
        }
        return this.c;
    }

    private ae d() {
        if (this.d == null) {
            this.d = new ae(this.a, this.b);
        }
        return this.d;
    }

    private m e() {
        if (this.e == null) {
            this.e = new m(this.a);
        }
        return this.e;
    }

    public List a(f f2, org.apache.a.g.e e2) {
        org.apache.a.o.a.a(f2, "Header");
        org.apache.a.o.a.a(e2, "Cookie origin");
        g[] arrg = f2.e();
        boolean bl2 = false;
        boolean bl3 = false;
        for (g object : arrg) {
            if (object.a("version") != null) {
                bl2 = true;
            }
            if (object.a("expires") == null) continue;
            bl3 = true;
        }
        if (bl3 || !bl2) {
            x x2;
            d d2;
            y y2 = y.a;
            if (f2 instanceof e) {
                d2 = ((e)f2).a();
                x2 = new x(((e)f2).b(), d2.e());
            } else {
                String string = f2.d();
                if (string == null) {
                    throw new org.apache.a.g.m("Header value is null");
                }
                d2 = new d(string.length());
                d2.a(string);
                x2 = new x(0, d2.e());
            }
            arrg = new g[]{y2.a(d2, x2)};
            return this.e().a(arrg, e2);
        }
        if ("Set-Cookie2".equals(f2.c())) {
            return this.c().a(arrg, e2);
        }
        return this.d().a(arrg, e2);
    }

    public void a(b b2, org.apache.a.g.e e2) {
        org.apache.a.o.a.a(b2, "Cookie");
        org.apache.a.o.a.a(e2, "Cookie origin");
        if (b2.k() > 0) {
            if (b2 instanceof p) {
                this.c().a(b2, e2);
            } else {
                this.d().a(b2, e2);
            }
        } else {
            this.e().a(b2, e2);
        }
    }

    public boolean b(b b2, org.apache.a.g.e e2) {
        org.apache.a.o.a.a(b2, "Cookie");
        org.apache.a.o.a.a(e2, "Cookie origin");
        if (b2.k() > 0) {
            if (b2 instanceof p) {
                return this.c().b(b2, e2);
            }
            return this.d().b(b2, e2);
        }
        return this.e().b(b2, e2);
    }

    public List a(List list) {
        org.apache.a.o.a.a((Object)list, "List of cookies");
        int n2 = Integer.MAX_VALUE;
        boolean bl2 = true;
        for (b b2 : list) {
            if (!(b2 instanceof p)) {
                bl2 = false;
            }
            if (b2.k() >= n2) continue;
            n2 = b2.k();
        }
        if (n2 > 0) {
            if (bl2) {
                return this.c().a(list);
            }
            return this.d().a(list);
        }
        return this.e().a(list);
    }

    public int a() {
        return this.c().a();
    }

    public f b() {
        return this.c().b();
    }

    public String toString() {
        return "best-match";
    }
}

