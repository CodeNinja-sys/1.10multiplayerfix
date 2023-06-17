/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.Native;
import com.sun.jna.a.d.cq;
import com.sun.jna.a.d.cr;
import com.sun.jna.a.d.cv;
import com.sun.jna.a.d.cz;
import com.sun.jna.a.d.de;
import com.sun.jna.a.d.gg;
import com.sun.jna.a.d.gm;
import com.sun.jna.at;
import com.sun.jna.ay;
import com.sun.jna.b.e;
import com.sun.jna.b.g;
import com.sun.jna.c.c;
import com.sun.jna.c.f;

public interface cb
extends c {
    public static final cb g = (cb)Native.a("Secur32", cb.class, f.g);

    public boolean a(int var1, char[] var2, e var3);

    public int a(String var1, String var2, at var3, gm var4, ay var5, ay var6, ay var7, cq var8, de var9);

    public int a(cq var1, cr var2, String var3, at var4, at var5, at var6, cz var7, at var8, cr var9, cz var10, g var11, de var12);

    public int a(cr var1);

    public int a(cq var1);

    public int a(cq var1, cr var2, cz var3, at var4, at var5, cr var6, cz var7, g var8, de var9);

    public int a(e var1, cv var2);

    public int a(ay var1);

    public int a(cr var1, gg var2);

    public int b(cr var1);

    public int c(cr var1);
}

