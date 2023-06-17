/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import java.util.Locale;
import org.apache.a.g.a;
import org.apache.a.g.b;
import org.apache.a.g.c;
import org.apache.a.g.e;
import org.apache.a.g.g;
import org.apache.a.g.m;
import org.apache.a.g.o;

public class aj
implements c {
    public void a(o o2, String string) {
        org.apache.a.o.a.a(o2, "Cookie");
        if (string == null) {
            throw new m("Missing value for domain attribute");
        }
        if (string.trim().length() == 0) {
            throw new m("Blank value for domain attribute");
        }
        String string2 = string;
        string2 = string2.toLowerCase(Locale.ENGLISH);
        if (!string.startsWith(".")) {
            string2 = '.' + string2;
        }
        o2.e(string2);
    }

    public boolean a(String string, String string2) {
        boolean bl2 = string.equals(string2) || string2.startsWith(".") && string.endsWith(string2);
        return bl2;
    }

    public void a(b b2, e e2) {
        org.apache.a.o.a.a(b2, "Cookie");
        org.apache.a.o.a.a(e2, "Cookie origin");
        String string = e2.a().toLowerCase(Locale.ENGLISH);
        if (b2.g() == null) {
            throw new g("Invalid cookie state: domain not specified");
        }
        String string2 = b2.g().toLowerCase(Locale.ENGLISH);
        if (b2 instanceof a && ((a)b2).b("domain")) {
            if (!string2.startsWith(".")) {
                throw new g("Domain attribute \"" + b2.g() + "\" violates RFC 2109: domain must start with a dot");
            }
            int n2 = string2.indexOf(46, 1);
            if (!(n2 >= 0 && n2 != string2.length() - 1 || string2.equals(".local"))) {
                throw new g("Domain attribute \"" + b2.g() + "\" violates RFC 2965: the value contains no embedded dots " + "and the value is not .local");
            }
            if (!this.a(string, string2)) {
                throw new g("Domain attribute \"" + b2.g() + "\" violates RFC 2965: effective host name does not " + "domain-match domain attribute.");
            }
            String string3 = string.substring(0, string.length() - string2.length());
            if (string3.indexOf(46) != -1) {
                throw new g("Domain attribute \"" + b2.g() + "\" violates RFC 2965: " + "effective host minus domain may not contain any dots");
            }
        } else if (!b2.g().equals(string)) {
            throw new g("Illegal domain attribute: \"" + b2.g() + "\"." + "Domain of origin: \"" + string + "\"");
        }
    }

    public boolean b(b b2, e e2) {
        org.apache.a.o.a.a(b2, "Cookie");
        org.apache.a.o.a.a(e2, "Cookie origin");
        String string = e2.a().toLowerCase(Locale.ENGLISH);
        String string2 = b2.g();
        if (!this.a(string, string2)) {
            return false;
        }
        String string3 = string.substring(0, string.length() - string2.length());
        return string3.indexOf(46) == -1;
    }
}

