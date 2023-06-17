/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.Native;
import com.sun.jna.ay;
import com.sun.jna.b.e;
import com.sun.jna.c.c;
import com.sun.jna.c.f;

public interface ik
extends c {
    public static final ik g = (ik)Native.a("Winspool.drv", ik.class, f.g);
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 4;
    public static final int k = 4;
    public static final int l = 8;
    public static final int m = 16;
    public static final int n = 32;
    public static final int o = 64;
    public static final int p = 16384;
    public static final int q = 32768;
    public static final int r = 0xFF0000;
    public static final int s = 65536;
    public static final int t = 131072;
    public static final int u = 262144;
    public static final int v = 524288;
    public static final int w = 0x100000;
    public static final int x = 0x200000;
    public static final int y = 0x400000;
    public static final int z = 0x800000;
    public static final int A = 0x1000000;

    public boolean a(int var1, String var2, int var3, ay var4, int var5, e var6, e var7);
}

