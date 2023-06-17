/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.Native;
import com.sun.jna.ay;
import com.sun.jna.c.c;
import com.sun.jna.c.f;

public interface ca
extends c {
    public static final ca g = (ca)Native.a("Oleaut32", ca.class, f.g);

    public ay a(String var1);

    public void a(ay var1);
}

