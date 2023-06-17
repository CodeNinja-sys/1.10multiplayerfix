/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.qm;
import com.a.a.d.qr;
import com.a.a.d.qs;
import com.a.a.d.qt;
import com.a.a.d.qu;
import com.a.a.d.qv;

abstract class qq
extends Enum {
    public static final /* enum */ qq a = new qr();
    public static final /* enum */ qq b = new qs();
    public static final /* enum */ qq c = new qt();
    public static final /* enum */ qq d = new qu();
    public static final /* enum */ qq e = new qv();
    private static final /* synthetic */ qq[] f;

    public static qq[] values() {
        return (qq[])f.clone();
    }

    public static qq valueOf(String string) {
        return Enum.valueOf(qq.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private qq() {
        void var2_-1;
        void var1_-1;
    }

    abstract boolean a();

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ qq(qm qm2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        f = new qq[]{a, b, c, d, e};
    }
}

