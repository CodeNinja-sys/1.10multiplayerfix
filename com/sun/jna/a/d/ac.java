/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.Native;
import com.sun.jna.a.d.ed;
import com.sun.jna.a.d.fw;
import com.sun.jna.a.d.gf;
import com.sun.jna.ay;
import com.sun.jna.b.e;
import com.sun.jna.c.f;
import java.nio.Buffer;

public interface ac
extends fw {
    public static final ac g = (ac)Native.a("kernel32", ac.class, f.g);

    public int a(int var1, ay var2, int var3, int var4, Buffer var5, int var6, ay var7);

    public boolean a(gf var1, Buffer var2, int var3, e var4, ed var5);
}

