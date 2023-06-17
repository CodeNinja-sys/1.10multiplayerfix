/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import java.util.Date;
import org.apache.a.c.f.b;
import org.apache.a.g.m;
import org.apache.a.g.o;
import org.apache.a.i.d.a;

public class g
extends a {
    private final String[] a;

    public g(String[] arrstring) {
        org.apache.a.o.a.a(arrstring, "Array of date patterns");
        this.a = arrstring;
    }

    public void a(o o2, String string) {
        org.apache.a.o.a.a(o2, "Cookie");
        if (string == null) {
            throw new m("Missing value for expires attribute");
        }
        Date date = b.a(string, this.a);
        if (date == null) {
            throw new m("Unable to parse expires attribute: " + string);
        }
        o2.b(date);
    }
}

