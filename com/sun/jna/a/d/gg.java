/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.dz;
import com.sun.jna.a.d.gf;
import com.sun.jna.ay;
import com.sun.jna.b.a;

public class gg
extends a {
    public gg() {
        this((gf)null);
    }

    public gg(gf gf2) {
        super(ay.H);
        this.a(gf2);
    }

    public void a(gf gf2) {
        this.c().a(0L, gf2 != null ? gf2.c() : null);
    }

    public gf d() {
        ay ay2 = this.c().i(0L);
        if (ay2 == null) {
            return null;
        }
        if (dz.T_.c().equals(ay2)) {
            return dz.T_;
        }
        gf gf2 = new gf();
        gf2.a(ay2);
        return gf2;
    }
}

