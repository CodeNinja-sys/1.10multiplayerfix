/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.a.ag;
import org.apache.a.g;
import org.apache.a.g.e;
import org.apache.a.g.m;
import org.apache.a.i.d.b;
import org.apache.a.i.d.c;
import org.apache.a.o.a;

public abstract class s
extends b {
    protected static String a(e e2) {
        String string = e2.b();
        int n2 = string.lastIndexOf(47);
        if (n2 >= 0) {
            if (n2 == 0) {
                n2 = 1;
            }
            string = string.substring(0, n2);
        }
        return string;
    }

    protected static String b(e e2) {
        return e2.a();
    }

    protected List a(g[] arrg, e e2) {
        ArrayList<c> arrayList = new ArrayList<c>(arrg.length);
        for (g g2 : arrg) {
            String string = g2.a();
            String string2 = g2.b();
            if (string == null || string.length() == 0) {
                throw new m("Cookie name may not be empty");
            }
            c c2 = new c(string, string2);
            c2.f(s.a(e2));
            c2.e(s.b(e2));
            ag[] arrag = g2.c();
            for (int i2 = arrag.length - 1; i2 >= 0; --i2) {
                ag ag2 = arrag[i2];
                String string3 = ag2.a().toLowerCase(Locale.ENGLISH);
                c2.a(string3, ag2.b());
                org.apache.a.g.c c3 = this.a(string3);
                if (c3 == null) continue;
                c3.a(c2, ag2.b());
            }
            arrayList.add(c2);
        }
        return arrayList;
    }

    public void a(org.apache.a.g.b b2, e e2) {
        a.a(b2, "Cookie");
        a.a(e2, "Cookie origin");
        for (org.apache.a.g.c c2 : this.c()) {
            c2.a(b2, e2);
        }
    }

    public boolean b(org.apache.a.g.b b2, e e2) {
        a.a(b2, "Cookie");
        a.a(e2, "Cookie origin");
        for (org.apache.a.g.c c2 : this.c()) {
            if (c2.b(b2, e2)) continue;
            return false;
        }
        return true;
    }
}

