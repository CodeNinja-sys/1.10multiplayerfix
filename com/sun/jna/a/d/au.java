/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.Native;
import com.sun.jna.a.d.es;
import com.sun.jna.b.e;
import com.sun.jna.c.c;
import com.sun.jna.c.f;

public interface au
extends c {
    public static final au g = (au)Native.a("msi", au.class, f.g);
    public static final int h = -7;
    public static final int i = -6;
    public static final int j = -5;
    public static final int k = -4;
    public static final int l = -3;
    public static final int m = -2;
    public static final int n = -1;
    public static final int o = 0;
    public static final int p = 1;
    public static final int q = 1;
    public static final int r = 2;
    public static final int s = 3;
    public static final int t = 4;
    public static final int u = 5;

    public int a(String var1, String var2, char[] var3, e var4);

    public int a(String var1, char[] var2, e var3);

    public int a(String var1, char[] var2);

    public int a(es var1, char[] var2);
}

