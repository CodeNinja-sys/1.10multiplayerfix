/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.n;

import org.apache.a.n.g;
import org.apache.a.n.i;
import org.apache.a.o.a;
import org.apache.a.x;
import org.apache.a.z;

public class ae
implements z {
    private static final i a = new i();

    public void a(x x2, g g2) {
        org.apache.a.o.a.a(x2, "HTTP response");
        int n2 = x2.a().b();
        if (n2 >= 200 && !x2.a("Date")) {
            String string = a.a();
            x2.b("Date", string);
        }
    }
}

