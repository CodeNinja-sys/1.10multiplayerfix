/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import org.apache.a.g.b;
import org.apache.a.g.c;
import org.apache.a.g.e;
import org.apache.a.g.g;
import org.apache.a.g.o;
import org.apache.a.o.a;
import org.apache.a.o.k;

public class i
implements c {
    public void a(o o2, String string) {
        a.a(o2, "Cookie");
        o2.f(!k.b(string) ? string : "/");
    }

    public void a(b b2, e e2) {
        if (!this.b(b2, e2)) {
            throw new g("Illegal path attribute \"" + b2.h() + "\". Path of origin: \"" + e2.b() + "\"");
        }
    }

    public boolean b(b b2, e e2) {
        boolean bl2;
        a.a(b2, "Cookie");
        a.a(e2, "Cookie origin");
        String string = e2.b();
        String string2 = b2.h();
        if (string2 == null) {
            string2 = "/";
        }
        if (string2.length() > 1 && string2.endsWith("/")) {
            string2 = string2.substring(0, string2.length() - 1);
        }
        if ((bl2 = string.startsWith(string2)) && string.length() != string2.length() && !string2.endsWith("/")) {
            bl2 = string.charAt(string2.length()) == '/';
        }
        return bl2;
    }
}

