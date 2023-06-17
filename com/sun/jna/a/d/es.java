/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.fn;
import com.sun.jna.u;

public class es
extends u {
    public es() {
        this(0L);
    }

    public es(long l2) {
        super(4, l2, true);
    }

    public fn c() {
        return new fn(this.longValue() & 0xFFL);
    }

    public fn d() {
        return new fn(this.longValue() >> 16 & 0xFFL);
    }
}

