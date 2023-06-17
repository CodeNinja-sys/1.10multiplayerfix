/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import java.util.Date;
import org.apache.a.g.m;
import org.apache.a.g.o;
import org.apache.a.i.d.a;

public class h
extends a {
    public void a(o o2, String string) {
        int n2;
        org.apache.a.o.a.a(o2, "Cookie");
        if (string == null) {
            throw new m("Missing value for max-age attribute");
        }
        try {
            n2 = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            throw new m("Invalid max-age attribute: " + string);
        }
        if (n2 < 0) {
            throw new m("Negative max-age attribute: " + string);
        }
        o2.b(new Date(System.currentTimeMillis() + (long)n2 * 1000L));
    }
}

