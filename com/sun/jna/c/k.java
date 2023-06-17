/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.c;

import com.sun.jna.bs;
import com.sun.jna.bt;
import com.sun.jna.c.i;
import com.sun.jna.m;

class k
implements bt {
    private final i a;

    k(i i2) {
        this.a = i2;
    }

    public Object a(Object object, bs bs2) {
        return new Integer(Boolean.TRUE.equals(object) ? 1 : 0);
    }

    public Object a(Object object, m m2) {
        return (Integer)object != 0 ? Boolean.TRUE : Boolean.FALSE;
    }

    public Class a() {
        return i.n == null ? (i.n = i.b("java.lang.Integer")) : i.n;
    }
}

