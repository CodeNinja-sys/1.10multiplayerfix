/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import java.util.ArrayList;
import java.util.List;
import org.apache.a.e;
import org.apache.a.f;
import org.apache.a.g.b;
import org.apache.a.g.m;
import org.apache.a.i.d.g;
import org.apache.a.i.d.h;
import org.apache.a.i.d.i;
import org.apache.a.i.d.j;
import org.apache.a.i.d.s;
import org.apache.a.i.d.x;
import org.apache.a.i.d.y;
import org.apache.a.k.r;
import org.apache.a.o.a;
import org.apache.a.o.d;

public class z
extends s {
    protected static final String a = "EEE, dd-MMM-yy HH:mm:ss z";
    private final String[] b;

    public z(String[] arrstring) {
        this.b = arrstring != null ? (String[])arrstring.clone() : new String[]{a};
        this.a("path", new i());
        this.a("domain", new x());
        this.a("max-age", new h());
        this.a("secure", new j());
        this.a("comment", new org.apache.a.i.d.e());
        this.a("expires", new g(this.b));
    }

    public z() {
        this(null);
    }

    public List a(f f2, org.apache.a.g.e e2) {
        org.apache.a.k.x x2;
        d d2;
        org.apache.a.o.a.a(f2, "Header");
        org.apache.a.o.a.a(e2, "Cookie origin");
        if (!f2.c().equalsIgnoreCase("Set-Cookie")) {
            throw new m("Unrecognized cookie header '" + f2.toString() + "'");
        }
        y y2 = y.a;
        if (f2 instanceof e) {
            d2 = ((e)f2).a();
            x2 = new org.apache.a.k.x(((e)f2).b(), d2.e());
        } else {
            String string = f2.d();
            if (string == null) {
                throw new m("Header value is null");
            }
            d2 = new d(string.length());
            d2.a(string);
            x2 = new org.apache.a.k.x(0, d2.e());
        }
        return this.a(new org.apache.a.g[]{y2.a(d2, x2)}, e2);
    }

    public List a(List list) {
        org.apache.a.o.a.a(list, "List of cookies");
        d d2 = new d(20 * list.size());
        d2.a("Cookie");
        d2.a(": ");
        for (int i2 = 0; i2 < list.size(); ++i2) {
            b b2 = (b)list.get(i2);
            if (i2 > 0) {
                d2.a("; ");
            }
            d2.a(b2.a());
            String string = b2.b();
            if (string == null) continue;
            d2.a("=");
            d2.a(string);
        }
        ArrayList<r> arrayList = new ArrayList<r>(1);
        arrayList.add(new r(d2));
        return arrayList;
    }

    public int a() {
        return 0;
    }

    public f b() {
        return null;
    }

    public String toString() {
        return "netscape";
    }
}

