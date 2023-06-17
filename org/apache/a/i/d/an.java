/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import org.apache.a.g.a;
import org.apache.a.g.b;
import org.apache.a.g.c;
import org.apache.a.g.e;
import org.apache.a.g.g;
import org.apache.a.g.m;
import org.apache.a.g.o;
import org.apache.a.g.p;

public class an
implements c {
    public void a(o o2, String string) {
        org.apache.a.o.a.a(o2, "Cookie");
        if (string == null) {
            throw new m("Missing value for version attribute");
        }
        int n2 = -1;
        try {
            n2 = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            n2 = -1;
        }
        if (n2 < 0) {
            throw new m("Invalid cookie version.");
        }
        o2.a(n2);
    }

    public void a(b b2, e e2) {
        org.apache.a.o.a.a(b2, "Cookie");
        if (b2 instanceof p && b2 instanceof a && !((a)b2).b("version")) {
            throw new g("Violates RFC 2965. Version attribute is required.");
        }
    }

    public boolean b(b b2, e e2) {
        return true;
    }
}

