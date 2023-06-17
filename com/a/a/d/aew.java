/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aes;
import com.a.a.d.aex;
import com.a.a.d.aey;
import com.a.a.d.aez;

abstract class aew
extends Enum {
    public static final /* enum */ aew a = new aex();
    public static final /* enum */ aew b = new aey();
    private static final /* synthetic */ aew[] c;

    public static aew[] values() {
        return (aew[])c.clone();
    }

    public static aew valueOf(String string) {
        return Enum.valueOf(aew.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private aew() {
        void var2_-1;
        void var1_-1;
    }

    abstract int a(aez var1);

    abstract long b(aez var1);

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ aew(aes aes2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        c = new aew[]{a, b};
    }
}

