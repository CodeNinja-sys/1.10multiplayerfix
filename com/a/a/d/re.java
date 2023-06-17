/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.qy;
import com.a.a.d.qz;
import com.a.a.d.rf;
import com.a.a.d.rg;
import com.a.a.d.rh;
import com.a.a.d.ri;
import com.a.a.d.rj;
import com.a.a.d.rk;
import com.a.a.d.rl;
import com.a.a.d.rm;
import com.a.a.d.rz;
import com.a.a.d.sa;
import com.a.a.d.sh;

abstract class re
extends Enum {
    public static final /* enum */ re a = new rf();
    public static final /* enum */ re b = new rg();
    public static final /* enum */ re c = new rh();
    public static final /* enum */ re d = new ri();
    public static final /* enum */ re e = new rj();
    public static final /* enum */ re f = new rk();
    public static final /* enum */ re g = new rl();
    public static final /* enum */ re h = new rm();
    static final int i = 1;
    static final int j = 2;
    static final re[][] k;
    private static final /* synthetic */ re[] l;

    public static re[] values() {
        return (re[])l.clone();
    }

    public static re valueOf(String string) {
        return Enum.valueOf(re.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private re() {
        void var2_-1;
        void var1_-1;
    }

    static re a(sh sh2, boolean bl2, boolean bl3) {
        int n2 = (bl2 ? 1 : 0) | (bl3 ? 2 : 0);
        return k[sh2.ordinal()][n2];
    }

    abstract rz a(sa var1, Object var2, int var3, rz var4);

    rz a(sa sa2, rz rz2, rz rz3) {
        return this.a(sa2, rz2.d(), rz2.c(), rz3);
    }

    void a(rz rz2, rz rz3) {
        rz3.a(rz2.e());
        qy.b(rz2.g(), rz3);
        qy.b(rz3, rz2.f());
        qy.e(rz2);
    }

    void b(rz rz2, rz rz3) {
        qy.c(rz2.i(), rz3);
        qy.c(rz3, rz2.h());
        qy.f(rz2);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ re(qz qz2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        l = new re[]{a, b, c, d, e, f, g, h};
        k = new re[][]{{a, b, c, d}, new re[0], {e, f, g, h}};
    }
}

