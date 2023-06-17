/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import org.apache.a.g.b;
import org.apache.a.g.e;
import org.apache.a.g.g;
import org.apache.a.g.m;
import org.apache.a.g.o;
import org.apache.a.i.d.a;

public class ag
extends a {
    public void a(o o2, String string) {
        org.apache.a.o.a.a(o2, "Cookie");
        if (string == null) {
            throw new m("Missing value for version attribute");
        }
        if (string.trim().length() == 0) {
            throw new m("Blank value for version attribute");
        }
        try {
            o2.a(Integer.parseInt(string));
        }
        catch (NumberFormatException numberFormatException) {
            throw new m("Invalid version: " + numberFormatException.getMessage());
        }
    }

    public void a(b b2, e e2) {
        org.apache.a.o.a.a(b2, "Cookie");
        if (b2.k() < 0) {
            throw new g("Cookie version may not be negative");
        }
    }
}

