/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.c;

import com.sun.jna.a.c.aq;
import com.sun.jna.m;

public class g
extends aq {
    private static final long c = 1L;
    public static final g b = null;

    public g() {
    }

    public g(long l2) {
        super(l2);
    }

    public Object a(Object object, m m2) {
        if (this.a(object)) {
            return b;
        }
        return new g(((Number)object).longValue());
    }
}

