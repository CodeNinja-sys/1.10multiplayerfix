/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import org.apache.a.f.h;
import org.apache.a.g;
import org.apache.a.k.d;
import org.apache.a.o.a;
import org.apache.a.x;

public class r
implements h {
    public static final r a = new r();

    public long a(x x2, org.apache.a.n.g g2) {
        org.apache.a.o.a.a(x2, "HTTP response");
        d d2 = new d(x2.f("Keep-Alive"));
        while (d2.hasNext()) {
            g g3 = d2.a();
            String string = g3.a();
            String string2 = g3.b();
            if (string2 == null || !string.equalsIgnoreCase("timeout")) continue;
            try {
                return Long.parseLong(string2) * 1000L;
            }
            catch (NumberFormatException numberFormatException) {
            }
        }
        return -1L;
    }
}

