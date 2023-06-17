/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.c;

import com.sun.jna.c.c;
import com.sun.jna.c.g;
import com.sun.jna.c.h;
import java.util.Map;

public interface f
extends c {
    public static final Map g = new g();
    public static final Map h = new h();
    public static final Map i = Boolean.getBoolean("w32.ascii") ? h : g;
}

