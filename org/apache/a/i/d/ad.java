/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import java.util.Locale;
import org.apache.a.g.b;
import org.apache.a.g.c;
import org.apache.a.g.e;
import org.apache.a.g.g;
import org.apache.a.g.m;
import org.apache.a.g.o;
import org.apache.a.o.a;

public class ad
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
        if (!string2.equals(string)) {
            int n2 = string2.indexOf(46);
            if (n2 == -1) {
                throw new g("Domain attribute \"" + string2 + "\" does not match the host \"" + string + "\"");
            }
            if (!string2.startsWith(".")) {
                throw new g("Domain attribute \"" + string2 + "\" violates RFC 2109: domain must start with a dot");
            }
            n2 = string2.indexOf(46, 1);
            if (n2 < 0 || n2 == string2.length() - 1) {
                throw new g("Domain attribute \"" + string2 + "\" violates RFC 2109: domain must contain an embedded dot");
            }
            if (!(string = string.toLowerCase(Locale.ENGLISH)).endsWith(string2)) {
                throw new g("Illegal domain attribute \"" + string2 + "\". Domain of origin: \"" + string + "\"");
            }
            String string3 = string.substring(0, string.length() - string2.length());
            if (string3.indexOf(46) != -1) {
                throw new g("Domain attribute \"" + string2 + "\" violates RFC 2109: host minus domain may not contain any dots");
            }
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
        return string.equals(string2) || string2.startsWith(".") && string.endsWith(string2);
    }
}

