/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.d.jl;
import com.a.a.d.jn;
import com.a.a.m.az;
import com.a.a.m.bi;
import com.a.a.m.bj;
import com.a.a.m.bk;
import java.lang.reflect.Type;

abstract class bh
extends Enum {
    public static final /* enum */ bh a = new bj();
    public static final /* enum */ bh b = new bk();
    static final bh c;
    private static final /* synthetic */ bh[] d;

    public static bh[] values() {
        return (bh[])d.clone();
    }

    public static bh valueOf(String string) {
        return Enum.valueOf(bh.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bh() {
        void var2_-1;
        void var1_-1;
    }

    abstract Type a(Type var1);

    abstract Type b(Type var1);

    final jl a(Type[] arrtype) {
        jn jn2 = jl.g();
        for (Type type : arrtype) {
            jn2.c(this.b(type));
        }
        return jn2.b();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ bh(az az2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        d = new bh[]{a, b};
        c = new bi().a() instanceof Class ? b : a;
    }
}

