/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.a.f;
import org.apache.a.g.a;
import org.apache.a.g.b;
import org.apache.a.g.m;
import org.apache.a.i.d.ad;
import org.apache.a.i.d.ag;
import org.apache.a.i.d.e;
import org.apache.a.i.d.g;
import org.apache.a.i.d.h;
import org.apache.a.i.d.i;
import org.apache.a.i.d.j;
import org.apache.a.i.d.s;
import org.apache.a.k.r;
import org.apache.a.o.d;

public class ae
extends s {
    private static final org.apache.a.g.f a = new org.apache.a.g.f();
    private static final String[] b = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};
    private final String[] c;
    private final boolean d;

    public ae(String[] arrstring, boolean bl2) {
        this.c = arrstring != null ? (String[])arrstring.clone() : b;
        this.d = bl2;
        this.a("version", new ag());
        this.a("path", new i());
        this.a("domain", new ad());
        this.a("max-age", new h());
        this.a("secure", new j());
        this.a("comment", new e());
        this.a("expires", new g(this.c));
    }

    public ae() {
        this(null, false);
    }

    public List a(f f2, org.apache.a.g.e e2) {
        org.apache.a.o.a.a(f2, "Header");
        org.apache.a.o.a.a(e2, "Cookie origin");
        if (!f2.c().equalsIgnoreCase("Set-Cookie")) {
            throw new m("Unrecognized cookie header '" + f2.toString() + "'");
        }
        org.apache.a.g[] arrg = f2.e();
        return this.a(arrg, e2);
    }

    public void a(b b2, org.apache.a.g.e e2) {
        org.apache.a.o.a.a(b2, "Cookie");
        String string = b2.a();
        if (string.indexOf(32) != -1) {
            throw new org.apache.a.g.g("Cookie name may not contain blanks");
        }
        if (string.startsWith("$")) {
            throw new org.apache.a.g.g("Cookie name may not start with $");
        }
        super.a(b2, e2);
    }

    public List a(List arrayList) {
        ArrayList arrayList2;
        org.apache.a.o.a.a(arrayList, "List of cookies");
        if (arrayList.size() > 1) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2, a);
        } else {
            arrayList2 = arrayList;
        }
        if (this.d) {
            return this.b(arrayList2);
        }
        return this.c(arrayList2);
    }

    private List b(List list) {
        Object object2;
        int n2 = Integer.MAX_VALUE;
        for (Object object2 : list) {
            if (object2.k() >= n2) continue;
            n2 = object2.k();
        }
        d d2 = new d(40 * list.size());
        d2.a("Cookie");
        d2.a(": ");
        d2.a("$Version=");
        d2.a(Integer.toString(n2));
        for (b b2 : list) {
            d2.a("; ");
            b b3 = b2;
            this.a(d2, b3, n2);
        }
        object2 = new ArrayList<r>(1);
        object2.add(new r(d2));
        return object2;
    }

    private List c(List list) {
        ArrayList<r> arrayList = new ArrayList<r>(list.size());
        for (b b2 : list) {
            int n2 = b2.k();
            d d2 = new d(40);
            d2.a("Cookie: ");
            d2.a("$Version=");
            d2.a(Integer.toString(n2));
            d2.a("; ");
            this.a(d2, b2, n2);
            arrayList.add(new r(d2));
        }
        return arrayList;
    }

    protected void a(d d2, String string, String string2, int n2) {
        d2.a(string);
        d2.a("=");
        if (string2 != null) {
            if (n2 > 0) {
                d2.a('\"');
                d2.a(string2);
                d2.a('\"');
            } else {
                d2.a(string2);
            }
        }
    }

    protected void a(d d2, b b2, int n2) {
        this.a(d2, b2.a(), b2.b(), n2);
        if (b2.h() != null && b2 instanceof a && ((a)b2).b("path")) {
            d2.a("; ");
            this.a(d2, "$Path", b2.h(), n2);
        }
        if (b2.g() != null && b2 instanceof a && ((a)b2).b("domain")) {
            d2.a("; ");
            this.a(d2, "$Domain", b2.g(), n2);
        }
    }

    public int a() {
        return 1;
    }

    public f b() {
        return null;
    }

    public String toString() {
        return "rfc2109";
    }
}

