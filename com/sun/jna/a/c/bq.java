/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.c;

import com.sun.jna.Native;
import com.sun.jna.a.c.ae;
import com.sun.jna.a.c.e;
import com.sun.jna.a.c.f;
import com.sun.jna.a.c.m;
import com.sun.jna.a.c.n;
import com.sun.jna.a.c.o;
import com.sun.jna.at;
import com.sun.jna.x;

public interface bq
extends x {
    public static final bq g = (bq)Native.a("Xtst", bq.class);

    public boolean a(f var1, com.sun.jna.b.e var2, com.sun.jna.b.e var3, com.sun.jna.b.e var4, com.sun.jna.b.e var5);

    public boolean a(f var1, o var2, e var3);

    public boolean a(f var1, o var2);

    public int a(f var1, int var2, boolean var3, at var4);

    public int b(f var1, int var2, boolean var3, at var4);

    public int a(f var1, int var2, int var3, int var4, at var5);

    public int a(f var1, int var2, int var3, at var4);

    public int a(f var1, ae var2, int var3, boolean var4, com.sun.jna.b.e var5, int var6, at var7);

    public int b(f var1, ae var2, int var3, boolean var4, com.sun.jna.b.e var5, int var6, at var7);

    public int a(f var1, ae var2, boolean var3, com.sun.jna.b.e var4, int var5, at var6);

    public int a(f var1, ae var2, boolean var3, int var4, com.sun.jna.b.e var5, int var6, at var7);

    public int a(f var1, boolean var2);

    public void a(m var1, n var2);

    public int a(f var1);
}

