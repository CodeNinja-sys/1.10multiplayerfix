/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.FromNativeConverter;
import com.sun.jna.ToNativeConverter;
import com.sun.jna.bd;
import com.sun.jna.m;
import java.lang.reflect.Field;

class bp {
    public String a;
    public Class b;
    public Field c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public FromNativeConverter h;
    public ToNativeConverter i;
    public m j;
    private final bd k;

    bp(bd bd2) {
        this.k = bd2;
        this.d = -1;
        this.e = -1;
    }

    public String toString() {
        return this.a + "@" + this.e + "[" + this.d + "] (" + this.b + ")";
    }
}

