/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.Native;
import com.sun.jna.a.d.ep;
import com.sun.jna.a.d.eq;
import com.sun.jna.ay;
import com.sun.jna.b.h;
import com.sun.jna.c.c;
import com.sun.jna.c.f;

public interface n
extends c {
    public static final n g = (n)Native.a("Crypt32", n.class, f.g);

    public boolean a(eq var1, String var2, eq var3, ay var4, ep var5, int var6, eq var7);

    public boolean a(eq var1, h var2, eq var3, ay var4, ep var5, int var6, eq var7);
}

