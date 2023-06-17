/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.b;

import com.sun.jna.Native;
import com.sun.jna.a.b.b;
import com.sun.jna.a.b.c;
import com.sun.jna.a.b.d;
import com.sun.jna.a.b.e;
import com.sun.jna.ay;
import com.sun.jna.b.h;
import java.nio.IntBuffer;

public interface a {
    public static final a a = (a)Native.a("Carbon", a.class);
    public static final int b = 256;
    public static final int c = 512;
    public static final int d = 2048;
    public static final int e = 4096;

    public ay a();

    public int a(ay var1, b var2, int var3, e[] var4, ay var5, h var6);

    public int a(int var1, int var2, d var3, ay var4, int var5, h var6);

    public int a(ay var1, int var2, int var3, ay var4, int var5, IntBuffer var6, c var7);

    public int a(ay var1);

    public int b(ay var1);
}

