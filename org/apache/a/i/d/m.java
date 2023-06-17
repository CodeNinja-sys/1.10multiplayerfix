/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import java.util.ArrayList;
import java.util.List;
import org.apache.a.g.b;
import org.apache.a.i.d.e;
import org.apache.a.i.d.f;
import org.apache.a.i.d.g;
import org.apache.a.i.d.h;
import org.apache.a.i.d.i;
import org.apache.a.i.d.j;
import org.apache.a.i.d.n;
import org.apache.a.i.d.q;
import org.apache.a.i.d.r;
import org.apache.a.i.d.s;
import org.apache.a.i.d.y;
import org.apache.a.k.c;
import org.apache.a.k.x;
import org.apache.a.o.a;
import org.apache.a.o.d;

public class m
extends s {
    private static final String[] a = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z"};
    private final String[] b;

    public m(String[] arrstring, q q2) {
        this.b = arrstring != null ? (String[])arrstring.clone() : a;
        switch (q2) {
            case a: {
                this.a("path", new i());
                break;
            }
            case b: {
                this.a("path", new n(this));
                break;
            }
            default: {
                throw new RuntimeException("Unknown security level");
            }
        }
        this.a("domain", new f());
        this.a("max-age", new h());
        this.a("secure", new j());
        this.a("comment", new e());
        this.a("expires", new g(this.b));
        this.a("version", new r());
    }

    public m(String[] arrstring) {
        this(arrstring, q.a);
    }

    public m() {
        this(null, q.a);
    }

    public List a(org.apache.a.f f2, org.apache.a.g.e e2) {
        org.apache.a.o.a.a(f2, "Header");
        org.apache.a.o.a.a(e2, "Cookie origin");
        String string = f2.c();
        if (!string.equalsIgnoreCase("Set-Cookie")) {
            throw new org.apache.a.g.m("Unrecognized cookie header '" + f2.toString() + "'");
        }
        org.apache.a.g[] arrg = f2.e();
        boolean bl2 = false;
        boolean bl3 = false;
        for (org.apache.a.g object : arrg) {
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
            if (f2 instanceof org.apache.a.e) {
                d2 = ((org.apache.a.e)f2).a();
                x2 = new x(((org.apache.a.e)f2).b(), d2.e());
            } else {
                String string2 = f2.d();
                if (string2 == null) {
                    throw new org.apache.a.g.m("Header value is null");
                }
                d2 = new d(string2.length());
                d2.a(string2);
                x2 = new x(0, d2.e());
            }
            arrg = new org.apache.a.g[]{y2.a(d2, x2)};
        }
        return this.a(arrg, e2);
    }

    private static boolean c(String string) {
        return string != null && string.startsWith("\"") && string.endsWith("\"");
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
            String string = b2.a();
            String string2 = b2.b();
            if (b2.k() > 0 && !m.c(string2)) {
                org.apache.a.k.f.b.a(d2, new c(string, string2), false);
                continue;
            }
            d2.a(string);
            d2.a("=");
            if (string2 == null) continue;
            d2.a(string2);
        }
        ArrayList<org.apache.a.k.r> arrayList = new ArrayList<org.apache.a.k.r>(1);
        arrayList.add(new org.apache.a.k.r(d2));
        return arrayList;
    }

    public int a() {
        return 0;
    }

    public org.apache.a.f b() {
        return null;
    }

    public String toString() {
        return "compatibility";
    }
}

