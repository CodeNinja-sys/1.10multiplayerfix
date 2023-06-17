/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.Native;
import com.sun.jna.ay;
import com.sun.jna.b.e;
import com.sun.jna.b.h;
import com.sun.jna.c.c;
import com.sun.jna.c.f;

public interface dm
extends c {
    public static final dm g = (dm)Native.a("version", dm.class, f.i);

    public int a(String var1, e var2);

    public boolean a(String var1, int var2, int var3, ay var4);

    public boolean a(ay var1, String var2, h var3, e var4);
}

