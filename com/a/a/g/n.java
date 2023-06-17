/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.g.m;
import com.a.a.g.o;
import com.a.a.g.p;

abstract class n
extends Enum
implements m {
    public static final /* enum */ n a = new o();
    public static final /* enum */ n b = new p();
    private static final /* synthetic */ n[] c;

    public static n[] values() {
        return (n[])c.clone();
    }

    public static n valueOf(String string) {
        return Enum.valueOf(n.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private n() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ n(o o2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        c = new n[]{a, b};
    }
}

