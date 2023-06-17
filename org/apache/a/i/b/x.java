/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.net.URI;
import org.apache.a.c.c.j;
import org.apache.a.c.c.k;
import org.apache.a.c.o;
import org.apache.a.c.p;
import org.apache.a.n.g;
import org.apache.a.u;

class x
implements p {
    private final o a;

    public x(o o2) {
        this.a = o2;
    }

    public boolean a(u u2, org.apache.a.x x2, g g2) {
        return this.a.a(x2, g2);
    }

    public org.apache.a.c.c.u b(u u2, org.apache.a.x x2, g g2) {
        URI uRI = this.a.b(x2, g2);
        String string = u2.g().a();
        if (string.equalsIgnoreCase("HEAD")) {
            return new k(uRI);
        }
        return new j(uRI);
    }

    public o a() {
        return this.a;
    }
}

