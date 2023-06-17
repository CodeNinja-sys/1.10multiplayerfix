/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.k;

import java.util.ArrayList;
import org.apache.a.ag;
import org.apache.a.k.c;
import org.apache.a.k.n;
import org.apache.a.k.u;
import org.apache.a.k.x;
import org.apache.a.n.f;
import org.apache.a.o.a;
import org.apache.a.o.d;

public class g
implements u {
    public static final g a = new g();
    public static final g b = new g();
    private static final char c = ';';
    private static final char d = ',';
    private static final char[] e = new char[]{';', ','};

    public static org.apache.a.g[] a(String string, u u2) {
        org.apache.a.o.a.a((Object)string, "Value");
        d d2 = new d(string.length());
        d2.a(string);
        x x2 = new x(0, string.length());
        return (u2 != null ? u2 : b).a(d2, x2);
    }

    public org.apache.a.g[] a(d d2, x x2) {
        org.apache.a.o.a.a(d2, "Char array buffer");
        org.apache.a.o.a.a(x2, "Parser cursor");
        ArrayList<org.apache.a.g> arrayList = new ArrayList<org.apache.a.g>();
        while (!x2.d()) {
            org.apache.a.g g2 = this.b(d2, x2);
            if (g2.a().length() == 0 && g2.b() == null) continue;
            arrayList.add(g2);
        }
        return arrayList.toArray(new org.apache.a.g[arrayList.size()]);
    }

    public static org.apache.a.g b(String string, u u2) {
        org.apache.a.o.a.a((Object)string, "Value");
        d d2 = new d(string.length());
        d2.a(string);
        x x2 = new x(0, string.length());
        return (u2 != null ? u2 : b).b(d2, x2);
    }

    public org.apache.a.g b(d d2, x x2) {
        char c2;
        org.apache.a.o.a.a(d2, "Char array buffer");
        org.apache.a.o.a.a(x2, "Parser cursor");
        ag ag2 = this.d(d2, x2);
        ag[] arrag = null;
        if (!x2.d() && (c2 = d2.a(x2.c() - 1)) != ',') {
            arrag = this.c(d2, x2);
        }
        return this.a(ag2.a(), ag2.b(), arrag);
    }

    protected org.apache.a.g a(String string, String string2, ag[] arrag) {
        return new c(string, string2, arrag);
    }

    public static ag[] c(String string, u u2) {
        org.apache.a.o.a.a((Object)string, "Value");
        d d2 = new d(string.length());
        d2.a(string);
        x x2 = new x(0, string.length());
        return (u2 != null ? u2 : b).c(d2, x2);
    }

    public ag[] c(d d2, x x2) {
        char c2;
        int n2;
        org.apache.a.o.a.a(d2, "Char array buffer");
        org.apache.a.o.a.a(x2, "Parser cursor");
        int n3 = x2.b();
        for (n2 = x2.c(); n2 < n3 && f.a(c2 = d2.a(n2)); ++n2) {
        }
        x2.a(n2);
        if (x2.d()) {
            return new ag[0];
        }
        ArrayList<ag> arrayList = new ArrayList<ag>();
        while (!x2.d()) {
            ag ag2 = this.d(d2, x2);
            arrayList.add(ag2);
            char c3 = d2.a(x2.c() - 1);
            if (c3 != ',') continue;
            break;
        }
        return arrayList.toArray(new ag[arrayList.size()]);
    }

    public static ag d(String string, u u2) {
        org.apache.a.o.a.a((Object)string, "Value");
        d d2 = new d(string.length());
        d2.a(string);
        x x2 = new x(0, string.length());
        return (u2 != null ? u2 : b).d(d2, x2);
    }

    public ag d(d d2, x x2) {
        return this.a(d2, x2, e);
    }

    private static boolean a(char c2, char[] arrc) {
        if (arrc != null) {
            for (char c3 : arrc) {
                if (c2 != c3) continue;
                return true;
            }
        }
        return false;
    }

    public ag a(d d2, x x2, char[] arrc) {
        int n2;
        String string;
        char c2;
        int n3;
        org.apache.a.o.a.a(d2, "Char array buffer");
        org.apache.a.o.a.a(x2, "Parser cursor");
        boolean bl2 = false;
        int n4 = x2.c();
        int n5 = x2.b();
        for (n3 = x2.c(); n3 < n5 && (c2 = d2.a(n3)) != '='; ++n3) {
            if (!g.a(c2, arrc)) continue;
            bl2 = true;
            break;
        }
        if (n3 == n5) {
            bl2 = true;
            string = d2.b(n4, n5);
        } else {
            string = d2.b(n4, n3);
            ++n3;
        }
        if (bl2) {
            x2.a(n3);
            return this.a(string, null);
        }
        int n6 = n3;
        boolean bl3 = false;
        boolean bl4 = false;
        while (n3 < n5) {
            n2 = d2.a(n3);
            if (n2 == 34 && !bl4) {
                boolean bl5 = bl3 = !bl3;
            }
            if (!bl3 && !bl4 && g.a((char)n2, arrc)) {
                bl2 = true;
                break;
            }
            bl4 = bl4 ? false : bl3 && n2 == 92;
            ++n3;
        }
        n2 = n3;
        while (n6 < n2 && f.a(d2.a(n6))) {
            ++n6;
        }
        while (n2 > n6 && f.a(d2.a(n2 - 1))) {
            --n2;
        }
        if (n2 - n6 >= 2 && d2.a(n6) == '\"' && d2.a(n2 - 1) == '\"') {
            ++n6;
            --n2;
        }
        String string2 = d2.a(n6, n2);
        if (bl2) {
            ++n3;
        }
        x2.a(n3);
        return this.a(string, string2);
    }

    protected ag a(String string, String string2) {
        return new n(string, string2);
    }
}

