/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.a.ag;
import org.apache.a.f;
import org.apache.a.g;
import org.apache.a.g.a;
import org.apache.a.g.b;
import org.apache.a.g.c;
import org.apache.a.g.e;
import org.apache.a.g.m;
import org.apache.a.i.d.ae;
import org.apache.a.i.d.ah;
import org.apache.a.i.d.ai;
import org.apache.a.i.d.aj;
import org.apache.a.i.d.ak;
import org.apache.a.i.d.an;
import org.apache.a.i.d.d;
import org.apache.a.k.r;

public class al
extends ae {
    public al() {
        this(null, false);
    }

    public al(String[] arrstring, boolean bl2) {
        super(arrstring, bl2);
        this.a("domain", new aj());
        this.a("port", new ak());
        this.a("commenturl", new ah());
        this.a("discard", new ai());
        this.a("version", new an());
    }

    public List a(f f2, e e2) {
        org.apache.a.o.a.a(f2, "Header");
        org.apache.a.o.a.a(e2, "Cookie origin");
        if (!f2.c().equalsIgnoreCase("Set-Cookie2")) {
            throw new m("Unrecognized cookie header '" + f2.toString() + "'");
        }
        g[] arrg = f2.e();
        return this.b(arrg, al.c(e2));
    }

    protected List a(g[] arrg, e e2) {
        return this.b(arrg, al.c(e2));
    }

    private List b(g[] arrg, e e2) {
        ArrayList<d> arrayList = new ArrayList<d>(arrg.length);
        for (g g2 : arrg) {
            String string = g2.a();
            String string2 = g2.b();
            if (string == null || string.length() == 0) {
                throw new m("Cookie name may not be empty");
            }
            d d2 = new d(string, string2);
            d2.f(al.a(e2));
            d2.e(al.b(e2));
            d2.a(new int[]{e2.c()});
            ag[] arrag = g2.c();
            HashMap<String, ag> hashMap = new HashMap<String, ag>(arrag.length);
            for (int i2 = arrag.length - 1; i2 >= 0; --i2) {
                ag ag2 = arrag[i2];
                hashMap.put(ag2.a().toLowerCase(Locale.ENGLISH), ag2);
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                ag ag3 = (ag)entry.getValue();
                String string3 = ag3.a().toLowerCase(Locale.ENGLISH);
                d2.a(string3, ag3.b());
                c c2 = this.a(string3);
                if (c2 == null) continue;
                c2.a(d2, ag3.b());
            }
            arrayList.add(d2);
        }
        return arrayList;
    }

    public void a(b b2, e e2) {
        org.apache.a.o.a.a(b2, "Cookie");
        org.apache.a.o.a.a(e2, "Cookie origin");
        super.a(b2, al.c(e2));
    }

    public boolean b(b b2, e e2) {
        org.apache.a.o.a.a(b2, "Cookie");
        org.apache.a.o.a.a(e2, "Cookie origin");
        return super.b(b2, al.c(e2));
    }

    protected void a(org.apache.a.o.d d2, b b2, int n2) {
        String string;
        super.a(d2, b2, n2);
        if (b2 instanceof a && (string = ((a)b2).b_("port")) != null) {
            int[] arrn;
            d2.a("; $Port");
            d2.a("=\"");
            if (string.trim().length() > 0 && (arrn = b2.i()) != null) {
                int n3 = arrn.length;
                for (int i2 = 0; i2 < n3; ++i2) {
                    if (i2 > 0) {
                        d2.a(",");
                    }
                    d2.a(Integer.toString(arrn[i2]));
                }
            }
            d2.a("\"");
        }
    }

    private static e c(e e2) {
        String string = e2.a();
        boolean bl2 = true;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 != '.' && c2 != ':') continue;
            bl2 = false;
            break;
        }
        if (bl2) {
            string = string + ".local";
            return new e(string, e2.c(), e2.b(), e2.d());
        }
        return e2;
    }

    public int a() {
        return 1;
    }

    public f b() {
        org.apache.a.o.d d2 = new org.apache.a.o.d(40);
        d2.a("Cookie2");
        d2.a(": ");
        d2.a("$Version=");
        d2.a(Integer.toString(this.a()));
        return new r(d2);
    }

    public String toString() {
        return "rfc2965";
    }
}

