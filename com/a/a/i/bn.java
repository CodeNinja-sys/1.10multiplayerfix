/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cm;
import com.a.a.i.bj;
import com.a.a.i.bo;
import com.a.a.i.bp;

abstract class bn
extends Enum
implements cm {
    public static final /* enum */ bn a = new bo();
    public static final /* enum */ bn b = new bp();
    private static final /* synthetic */ bn[] c;

    public static bn[] values() {
        return (bn[])c.clone();
    }

    public static bn valueOf(String string) {
        return Enum.valueOf(bn.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bn() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ bn(bj bj2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        c = new bn[]{a, b};
    }
}

