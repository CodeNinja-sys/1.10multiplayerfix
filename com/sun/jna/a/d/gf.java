/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.dz;
import com.sun.jna.ay;
import com.sun.jna.bb;
import com.sun.jna.m;

public class gf
extends bb {
    private boolean b;

    public gf() {
    }

    public gf(ay ay2) {
        this.a(ay2);
        this.b = true;
    }

    public Object a(Object object, m m2) {
        Object object2 = super.a(object, m2);
        if (dz.T_.equals(object2)) {
            return dz.T_;
        }
        return object2;
    }

    public void a(ay ay2) {
        if (this.b) {
            throw new UnsupportedOperationException("immutable reference");
        }
        super.a(ay2);
    }
}

