/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.c;

import com.sun.jna.at;
import com.sun.jna.m;

public class aq
extends at {
    private static final long b = 1L;
    public static final aq d = null;

    public aq() {
        this(0L);
    }

    public aq(long l2) {
        super(l2);
    }

    protected boolean a(Object object) {
        return object == null || object instanceof Number && ((Number)object).longValue() == 0L;
    }

    public Object a(Object object, m m2) {
        if (this.a(object)) {
            return d;
        }
        return new aq(((Number)object).longValue());
    }

    public String toString() {
        return "0x" + Long.toHexString(this.longValue());
    }
}

