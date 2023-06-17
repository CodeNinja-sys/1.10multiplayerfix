/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.Native;
import com.sun.jna.a.d.eu;
import com.sun.jna.a.d.ew;
import com.sun.jna.a.d.fe;
import com.sun.jna.a.d.fr;
import com.sun.jna.a.d.fs;
import com.sun.jna.a.d.fu;
import com.sun.jna.a.d.gf;
import com.sun.jna.a.d.id;
import com.sun.jna.ay;
import com.sun.jna.b.h;
import com.sun.jna.c.c;
import com.sun.jna.c.f;

public interface y
extends c {
    public static final y g = (y)Native.a("gdi32", y.class, f.i);

    public fe a(ay var1, int var2, fu var3);

    public int a(fe var1, fe var2, fe var3, int var4);

    public fe a(int var1, int var2, int var3, int var4);

    public fe a(int var1, int var2, int var3, int var4, int var5, int var6);

    public fe a(id[] var1, int[] var2, int var3, int var4);

    public boolean a(fe var1, int var2, int var3, int var4, int var5);

    public int a(ew var1, int var2, int var3, int var4);

    public ew a(ew var1);

    public boolean b(ew var1);

    public eu a(ew var1, fs var2, int var3, ay var4, fr var5, int var6);

    public eu a(ew var1, fr var2, int var3, h var4, ay var5, int var6);

    public eu a(ew var1, int var2, int var3);

    public gf a(ew var1, gf var2);

    public boolean a(gf var1);

    public int a(ew var1, int var2);

    public int a(ew var1, eu var2, int var3, int var4, ay var5, fr var6, int var7);
}

