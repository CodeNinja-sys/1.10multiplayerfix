/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.e;

import java.util.Collection;
import org.apache.a.f;
import org.apache.a.n.g;
import org.apache.a.o.a;
import org.apache.a.u;
import org.apache.a.w;

public class j
implements w {
    private final Collection a;

    public j(Collection collection) {
        this.a = collection;
    }

    public j() {
        this(null);
    }

    public void a(u u2, g g2) {
        org.apache.a.o.a.a(u2, "HTTP request");
        String string = u2.g().a();
        if (string.equalsIgnoreCase("CONNECT")) {
            return;
        }
        Collection collection = (Collection)u2.f().a("http.default-headers");
        if (collection == null) {
            collection = this.a;
        }
        if (collection != null) {
            for (f f2 : collection) {
                u2.a(f2);
            }
        }
    }
}

