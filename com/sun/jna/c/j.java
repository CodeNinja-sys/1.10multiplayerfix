/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.c;

import com.sun.jna.bc;
import com.sun.jna.bs;
import com.sun.jna.bt;
import com.sun.jna.bw;
import com.sun.jna.c.i;
import com.sun.jna.m;

class j
implements bt {
    private final i a;

    j(i i2) {
        this.a = i2;
    }

    public Object a(Object object, bs bs2) {
        if (object == null) {
            return null;
        }
        if (object instanceof String[]) {
            return new bc((String[])object, true);
        }
        return new bw(object.toString());
    }

    public Object a(Object object, m m2) {
        if (object == null) {
            return null;
        }
        return object.toString();
    }

    public Class a() {
        return i.k == null ? (i.k = i.b("com.sun.jna.bw")) : i.k;
    }
}

