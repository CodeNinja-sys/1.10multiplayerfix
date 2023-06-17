/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.b.aw;
import com.a.a.c.ap;
import com.a.a.c.bs;
import com.a.a.c.bt;
import com.a.a.c.bx;
import com.a.a.c.by;
import com.a.a.c.bz;
import com.a.a.c.cg;

abstract class bw
extends Enum {
    public static final /* enum */ bw a = new bx();
    public static final /* enum */ bw b = new by();
    public static final /* enum */ bw c = new bz();
    private static final /* synthetic */ bw[] d;

    public static bw[] values() {
        return (bw[])d.clone();
    }

    public static bw valueOf(String string) {
        return Enum.valueOf(bw.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bw() {
        void var2_-1;
        void var1_-1;
    }

    abstract cg a(bt var1, bs var2, Object var3, int var4);

    abstract aw a();

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ bw(ap ap2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        d = new bw[]{a, b, c};
    }
}

