/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.Native;
import com.sun.jna.a.d.aa;
import com.sun.jna.a.d.bh;
import com.sun.jna.a.d.v;
import com.sun.jna.a.d.x;
import com.sun.jna.at;
import com.sun.jna.ay;
import com.sun.jna.b.e;
import com.sun.jna.b.g;
import com.sun.jna.b.h;
import com.sun.jna.bd;
import com.sun.jna.c.c;
import com.sun.jna.c.f;

public interface bn
extends c {
    public static final bn g = (bn)Native.a("Netapi32", bn.class, f.g);

    public int a(String var1, h var2, e var3);

    public int a(ay var1);

    public int a(String var1, int var2, h var3, int var4, e var5, e var6, e var7);

    public int a(String var1, String var2, h var3);

    public int b(String var1, int var2, h var3, int var4, e var5, e var6, e var7);

    public int a(String var1, int var2, int var3, h var4, int var5, e var6, e var7, e var8);

    public int a(String var1, String var2, int var3, h var4, int var5, e var6, e var7);

    public int a(String var1, String var2, int var3, int var4, h var5, int var6, e var7, e var8);

    public int a(String var1, int var2, bd var3, e var4);

    public int a(String var1, String var2);

    public int a(String var1, String var2, String var3, String var4);

    public int a(String var1, String var2, aa var3, String var4, int var5, v var6);

    public int a(String var1, String var2, int var3, bh var4);

    public int a(String var1, at var2, x var3, g var4);

    public int a(String var1, String var2, int var3, h var4);
}

