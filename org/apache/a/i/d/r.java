/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import org.apache.a.g.m;
import org.apache.a.g.o;
import org.apache.a.i.d.a;

public class r
extends a {
    public void a(o o2, String string) {
        org.apache.a.o.a.a(o2, "Cookie");
        if (string == null) {
            throw new m("Missing value for version attribute");
        }
        int n2 = 0;
        try {
            n2 = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        o2.a(n2);
    }
}

