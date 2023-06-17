/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.d.ta;
import com.a.a.d.ts;
import com.a.a.d.tt;

abstract class tr
extends Enum
implements bl {
    public static final /* enum */ tr a = new ts();
    public static final /* enum */ tr b = new tt();
    private static final /* synthetic */ tr[] c;

    public static tr[] values() {
        return (tr[])c.clone();
    }

    public static tr valueOf(String string) {
        return Enum.valueOf(tr.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private tr() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ tr(ta ta2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        c = new tr[]{a, b};
    }
}

