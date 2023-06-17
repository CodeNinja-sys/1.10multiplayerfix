/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.c;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;
import org.apache.a.c.c.p;
import org.apache.a.f;
import org.apache.a.g;
import org.apache.a.i;
import org.apache.a.o.a;
import org.apache.a.x;

public class l
extends p {
    public static final String a = "OPTIONS";

    public l() {
    }

    public l(URI uRI) {
        this.a(uRI);
    }

    public l(String string) {
        this.a(URI.create(string));
    }

    public String cL_() {
        return a;
    }

    public Set a(x x2) {
        org.apache.a.o.a.a(x2, "HTTP response");
        i i2 = x2.f("Allow");
        HashSet<String> hashSet = new HashSet<String>();
        while (i2.hasNext()) {
            g[] arrg;
            f f2 = i2.a();
            for (g g2 : arrg = f2.e()) {
                hashSet.add(g2.a());
            }
        }
        return hashSet;
    }
}

