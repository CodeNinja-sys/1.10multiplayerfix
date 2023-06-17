/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import java.util.Collection;
import org.apache.a.g.h;
import org.apache.a.g.i;
import org.apache.a.i.d.z;
import org.apache.a.l.j;
import org.apache.a.n.g;

public class aa
implements i,
org.apache.a.g.j {
    private final String[] a;

    public aa(String[] arrstring) {
        this.a = arrstring;
    }

    public aa() {
        this(null);
    }

    public h a(j j2) {
        if (j2 != null) {
            String[] arrstring = null;
            Collection collection = (Collection)j2.a("http.protocol.cookie-datepatterns");
            if (collection != null) {
                arrstring = new String[collection.size()];
                arrstring = collection.toArray(arrstring);
            }
            return new z(arrstring);
        }
        return new z();
    }

    public h a(g g2) {
        return new z(this.a);
    }
}

