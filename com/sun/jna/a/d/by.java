/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.Native;
import com.sun.jna.a.d.aa;
import com.sun.jna.a.d.ab;
import com.sun.jna.a.d.gh;
import com.sun.jna.ay;
import com.sun.jna.b.h;
import com.sun.jna.c.c;
import com.sun.jna.c.f;

public interface by
extends c {
    public static final by g = (by)Native.a("Ole32", by.class, f.g);

    public gh a(ab var1);

    public int a(ab var1, char[] var2, int var3);

    public gh a(String var1, ab var2);

    public gh a(ay var1, int var2);

    public void a();

    public gh a(aa var1, ay var2, int var3, aa var4, h var5);
}

