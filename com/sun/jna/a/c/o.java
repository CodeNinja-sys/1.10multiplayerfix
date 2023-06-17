/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.c;

import com.sun.jna.a.c.g;
import com.sun.jna.m;

public class o
extends g {
    private static final long e = 1L;
    public static final o c = null;

    public o() {
    }

    public o(long l2) {
        super(l2);
    }

    public Object a(Object object, m m2) {
        if (this.a(object)) {
            return c;
        }
        return new o(((Number)object).longValue());
    }
}

