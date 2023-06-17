/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.gr;
import com.sun.jna.ay;
import com.sun.jna.b.a;

public class gt
extends a {
    public gt() {
        this((gr)null);
    }

    public gt(gr gr2) {
        super(ay.H);
        this.a(gr2);
    }

    public void a(gr gr2) {
        this.c().a(0L, gr2 != null ? gr2.g() : null);
    }

    public gr d() {
        ay ay2 = this.c().i(0L);
        if (ay2 == null) {
            return null;
        }
        return new gr(ay2);
    }
}

