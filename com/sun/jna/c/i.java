/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.c;

import com.sun.jna.ToNativeConverter;
import com.sun.jna.bt;
import com.sun.jna.bu;
import com.sun.jna.c.j;
import com.sun.jna.c.k;

public class i
extends com.sun.jna.k {
    public static final bu i = new i(true);
    public static final bu j = new i(false);
    static Class k;
    static Class l;
    static Class m;
    static Class n;
    static Class o;

    protected i(boolean bl2) {
        bt bt2;
        if (bl2) {
            bt2 = new j(this);
            this.a(l == null ? (l = com.sun.jna.c.i.b("java.lang.String")) : l, bt2);
            this.a(m == null ? (m = com.sun.jna.c.i.b("[Ljava.lang.String;")) : m, (ToNativeConverter)bt2);
        }
        bt2 = new k(this);
        this.a(o == null ? (o = com.sun.jna.c.i.b("java.lang.Boolean")) : o, bt2);
    }

    static Class b(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }
}

