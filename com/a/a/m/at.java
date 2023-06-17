/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.b.cm;
import com.a.a.m.af;
import com.a.a.m.au;
import com.a.a.m.av;

abstract class at
extends Enum
implements cm {
    public static final /* enum */ at a = new au();
    public static final /* enum */ at b = new av();
    private static final /* synthetic */ at[] c;

    public static at[] values() {
        return (at[])c.clone();
    }

    public static at valueOf(String string) {
        return Enum.valueOf(at.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private at() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ at(af af2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        c = new at[]{a, b};
    }
}

