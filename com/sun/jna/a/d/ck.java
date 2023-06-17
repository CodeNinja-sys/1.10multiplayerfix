/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.Native;
import com.sun.jna.a.d.cm;
import com.sun.jna.a.d.cn;
import com.sun.jna.a.d.es;
import com.sun.jna.a.d.ez;
import com.sun.jna.a.d.fg;
import com.sun.jna.a.d.gf;
import com.sun.jna.a.d.gh;
import com.sun.jna.b.h;
import com.sun.jna.c.c;
import com.sun.jna.c.f;

public interface ck
extends cm,
c {
    public static final ck g = (ck)Native.a("shell32", ck.class, f.g);

    public int a(cn var1);

    public gh a(fg var1, int var2, gf var3, es var4, char[] var5);

    public gh a(h var1);

    public ez a(fg var1, String var2, String var3, String var4, String var5, int var6);
}

