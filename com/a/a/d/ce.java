/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cf;
import com.a.a.d.cg;

public abstract class ce
extends Enum {
    public static final /* enum */ ce a = new cf();
    public static final /* enum */ ce b = new cg();
    private static final /* synthetic */ ce[] c;

    public static ce[] values() {
        return (ce[])c.clone();
    }

    public static ce valueOf(String string) {
        return Enum.valueOf(ce.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ce() {
        void var2_-1;
        void var1_-1;
    }

    static ce a(boolean bl2) {
        return bl2 ? b : a;
    }

    abstract ce a();

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ ce(cf cf2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        c = new ce[]{a, b};
    }
}

