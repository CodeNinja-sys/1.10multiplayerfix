/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.Native;
import com.sun.jna.a.d.aa;
import com.sun.jna.a.d.ab;
import com.sun.jna.a.d.ch;
import com.sun.jna.a.d.cj;
import com.sun.jna.a.d.gf;
import com.sun.jna.ay;
import com.sun.jna.b.e;
import com.sun.jna.c.c;
import com.sun.jna.c.f;

public interface cf
extends c {
    public static final cf g = (cf)Native.a("setupapi", cf.class, f.i);
    public static final aa h = new aa(new byte[]{7, 99, -11, 83, -65, -74, -48, 17, -108, -14, 0, -96, -55, 30, -5, -117});
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 4;
    public static final int l = 8;
    public static final int m = 16;
    public static final int n = 31;
    public static final int o = 4;

    public gf a(ab var1, ay var2, ay var3, int var4);

    public boolean a(gf var1);

    public boolean a(gf var1, ay var2, ab var3, int var4, ch var5);

    public boolean a(gf var1, ch var2, ay var3, int var4, e var5, cj var6);

    public boolean a(gf var1, cj var2, int var3, e var4, ay var5, int var6, e var7);
}

