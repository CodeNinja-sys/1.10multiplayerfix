/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.n;

import org.apache.a.n.g;
import org.apache.a.n.i;
import org.apache.a.o;
import org.apache.a.o.a;
import org.apache.a.u;
import org.apache.a.w;

public class y
implements w {
    private static final i a = new i();

    public void a(u u2, g g2) {
        org.apache.a.o.a.a(u2, "HTTP request");
        if (u2 instanceof o && !u2.a("Date")) {
            String string = a.a();
            u2.b("Date", string);
        }
    }
}

