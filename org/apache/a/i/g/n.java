/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.g;

import org.apache.a.e.d;
import org.apache.a.i.g.m;
import org.apache.a.i.l;
import org.apache.a.j.c;
import org.apache.a.j.h;
import org.apache.a.k.w;
import org.apache.a.y;

public class n
implements org.apache.a.j.d {
    public static final n a = new n();
    private final w b;
    private final y c;

    public n(w w2, y y2) {
        this.b = w2 != null ? w2 : org.apache.a.k.l.b;
        this.c = y2 != null ? y2 : l.a;
    }

    public n() {
        this(null, null);
    }

    public c a(h h2, d d2) {
        return new m(h2, this.b, this.c, d2);
    }
}

