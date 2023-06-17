/*
 * Decompiled with CFR 0.150.
 */
package com.a.b;

import com.a.b.ai;
import com.a.b.aj;
import com.a.b.w;

public abstract class ah
extends Enum {
    public static final /* enum */ ah a = new ai();
    public static final /* enum */ ah b = new aj();
    private static final /* synthetic */ ah[] c;

    public static ah[] values() {
        return (ah[])c.clone();
    }

    public static ah valueOf(String string) {
        return Enum.valueOf(ah.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ah() {
        void var2_-1;
        void var1_-1;
    }

    public abstract w a(Long var1);

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ ah(ai ai2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        c = new ah[]{a, b};
    }
}

