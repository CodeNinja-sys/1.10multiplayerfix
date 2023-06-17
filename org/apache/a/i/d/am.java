/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import java.util.Collection;
import org.apache.a.g.h;
import org.apache.a.g.i;
import org.apache.a.i.d.al;
import org.apache.a.l.j;
import org.apache.a.n.g;

public class am
implements i,
org.apache.a.g.j {
    private final String[] a;
    private final boolean b;

    public am(String[] arrstring, boolean bl2) {
        this.a = arrstring;
        this.b = bl2;
    }

    public am() {
        this(null, false);
    }

    public h a(j j2) {
        if (j2 != null) {
            String[] arrstring = null;
            Collection collection = (Collection)j2.a("http.protocol.cookie-datepatterns");
            if (collection != null) {
                arrstring = new String[collection.size()];
                arrstring = collection.toArray(arrstring);
            }
            boolean bl2 = j2.a("http.protocol.single-cookie-header", false);
            return new al(arrstring, bl2);
        }
        return new al();
    }

    public h a(g g2) {
        return new al(this.a, this.b);
    }
}

