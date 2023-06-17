/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.g;

import org.apache.a.e.d;
import org.apache.a.i.g.i;
import org.apache.a.i.k;
import org.apache.a.j.c;
import org.apache.a.j.h;
import org.apache.a.k.l;
import org.apache.a.k.w;
import org.apache.a.v;

public class j
implements org.apache.a.j.d {
    public static final j a = new j();
    private final w b;
    private final v c;

    public j(w w2, v v2) {
        this.b = w2 != null ? w2 : l.b;
        this.c = v2 != null ? v2 : k.a;
    }

    public j() {
        this(null, null);
    }

    public c a(h h2, d d2) {
        return new i(h2, this.b, this.c, d2);
    }
}

