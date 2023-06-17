/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.dz;
import com.sun.jna.a.d.hj;
import com.sun.jna.ay;
import com.sun.jna.b.a;

public class hk
extends a {
    public hk() {
        this((hj)null);
    }

    public hk(hj hj2) {
        super(ay.H);
        this.a(hj2);
    }

    public void a(hj hj2) {
        this.c().a(0L, hj2 != null ? hj2.c() : null);
    }

    public hj d() {
        ay ay2 = this.c().i(0L);
        if (ay2 == null) {
            return null;
        }
        if (dz.T_.c().equals(ay2)) {
            return (hj)dz.T_;
        }
        hj hj2 = new hj();
        hj2.a(ay2);
        return hj2;
    }
}

