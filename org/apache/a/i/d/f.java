/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import org.apache.a.g.b;
import org.apache.a.g.c;
import org.apache.a.g.e;
import org.apache.a.g.g;
import org.apache.a.g.m;
import org.apache.a.g.o;
import org.apache.a.o.a;

public class f
implements c {
    public void a(o o2, String string) {
        a.a(o2, "Cookie");
        if (string == null) {
            throw new m("Missing value for domain attribute");
        }
        if (string.trim().length() == 0) {
            throw new m("Blank value for domain attribute");
        }
        o2.e(string);
    }

    public void a(b b2, e e2) {
        a.a(b2, "Cookie");
        a.a(e2, "Cookie origin");
        String string = e2.a();
        String string2 = b2.g();
        if (string2 == null) {
            throw new g("Cookie domain may not be null");
        }
        if (string.contains(".")) {
            if (!string.endsWith(string2)) {
                if (string2.startsWith(".")) {
                    string2 = string2.substring(1, string2.length());
                }
                if (!string.equals(string2)) {
                    throw new g("Illegal domain attribute \"" + string2 + "\". Domain of origin: \"" + string + "\"");
                }
            }
        } else if (!string.equals(string2)) {
            throw new g("Illegal domain attribute \"" + string2 + "\". Domain of origin: \"" + string + "\"");
        }
    }

    public boolean b(b b2, e e2) {
        a.a(b2, "Cookie");
        a.a(e2, "Cookie origin");
        String string = e2.a();
        String string2 = b2.g();
        if (string2 == null) {
            return false;
        }
        if (string.equals(string2)) {
            return true;
        }
        if (!string2.startsWith(".")) {
            string2 = '.' + string2;
        }
        return string.endsWith(string2) || string.equals(string2.substring(1));
    }
}

