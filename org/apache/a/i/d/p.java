/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import java.util.Collection;
import org.apache.a.g.h;
import org.apache.a.g.i;
import org.apache.a.i.d.m;
import org.apache.a.i.d.q;
import org.apache.a.l.j;
import org.apache.a.n.g;

public class p
implements i,
org.apache.a.g.j {
    private final String[] a;
    private final q b;

    public p(String[] arrstring, q q2) {
        this.a = arrstring;
        this.b = q2;
    }

    public p(String[] arrstring) {
        this(null, q.a);
    }

    public p() {
        this(null, q.a);
    }

    public h a(j j2) {
        if (j2 != null) {
            String[] arrstring = null;
            Collection collection = (Collection)j2.a("http.protocol.cookie-datepatterns");
            if (collection != null) {
                arrstring = new String[collection.size()];
                arrstring = collection.toArray(arrstring);
            }
            return new m(arrstring, this.b);
        }
        return new m(null, this.b);
    }

    public h a(g g2) {
        return new m(this.a);
    }
}

