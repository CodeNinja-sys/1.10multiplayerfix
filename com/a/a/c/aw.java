/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.ao;
import com.a.a.c.ap;
import com.a.a.c.ax;
import com.a.a.c.ay;
import com.a.a.c.az;
import com.a.a.c.ba;
import com.a.a.c.bb;
import com.a.a.c.bc;
import com.a.a.c.bd;
import com.a.a.c.be;
import com.a.a.c.bs;
import com.a.a.c.bt;
import com.a.a.c.bw;

abstract class aw
extends Enum {
    public static final /* enum */ aw a = new ax();
    public static final /* enum */ aw b = new ay();
    public static final /* enum */ aw c = new az();
    public static final /* enum */ aw d = new ba();
    public static final /* enum */ aw e = new bb();
    public static final /* enum */ aw f = new bc();
    public static final /* enum */ aw g = new bd();
    public static final /* enum */ aw h = new be();
    static final int i = 1;
    static final int j = 2;
    static final int k = 4;
    static final aw[] l;
    private static final /* synthetic */ aw[] m;

    public static aw[] values() {
        return (aw[])m.clone();
    }

    public static aw valueOf(String string) {
        return Enum.valueOf(aw.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private aw() {
        void var2_-1;
        void var1_-1;
    }

    static aw a(bw bw2, boolean bl2, boolean bl3) {
        int n2 = (bw2 == bw.c ? 4 : 0) | (bl2 ? 1 : 0) | (bl3 ? 2 : 0);
        return l[n2];
    }

    abstract bs a(bt var1, Object var2, int var3, bs var4);

    bs a(bt bt2, bs bs2, bs bs3) {
        return this.a(bt2, bs2.d(), bs2.c(), bs3);
    }

    void a(bs bs2, bs bs3) {
        bs3.a(bs2.e());
        ao.b(bs2.g(), bs3);
        ao.b(bs3, bs2.f());
        ao.b(bs2);
    }

    void b(bs bs2, bs bs3) {
        bs3.b(bs2.h());
        ao.c(bs2.j(), bs3);
        ao.c(bs3, bs2.i());
        ao.c(bs2);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ aw(ap ap2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        m = new aw[]{a, b, c, d, e, f, g, h};
        l = new aw[]{a, b, c, d, e, f, g, h};
    }
}

