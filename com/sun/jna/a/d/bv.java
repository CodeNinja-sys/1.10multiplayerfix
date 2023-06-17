/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.Native;
import com.sun.jna.a.d.gf;
import com.sun.jna.b.e;
import com.sun.jna.bd;
import com.sun.jna.c.c;
import com.sun.jna.c.f;

public interface bv
extends c {
    public static final bv g = (bv)Native.a("NtDll", bv.class, f.g);

    public int a(gf var1, int var2, bd var3, int var4, e var5);
}

