/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.es;
import com.sun.jna.c.c;

public interface df
extends c {
    public static final es g = new es(1L);
    public static final es h = new es(2L);
    public static final es i = new es(4L);
    public static final es j = new es(8L);
    public static final es k = new es(16L);
    public static final es l = new es((long)(g.intValue() | h.intValue() | i.intValue() | j.intValue()));
    public static final es m = new es((long)Integer.MIN_VALUE);
}

