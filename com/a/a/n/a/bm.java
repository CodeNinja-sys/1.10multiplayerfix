/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.be;
import com.a.a.n.a.bn;
import com.a.a.n.a.bo;
import com.a.a.n.a.bp;
import com.a.a.n.a.bq;

public abstract class bm
extends Enum
implements bq {
    public static final /* enum */ bm a = new bn();
    public static final /* enum */ bm b = new bo();
    public static final /* enum */ bm c = new bp();
    private static final /* synthetic */ bm[] d;

    public static bm[] values() {
        return (bm[])d.clone();
    }

    public static bm valueOf(String string) {
        return Enum.valueOf(bm.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bm() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ bm(be be2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        d = new bm[]{a, b, c};
    }
}

