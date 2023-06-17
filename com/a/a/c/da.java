/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.db;
import com.a.a.c.dc;
import com.a.a.c.dd;
import com.a.a.c.de;
import com.a.a.c.df;

public abstract class da
extends Enum {
    public static final /* enum */ da a = new db();
    public static final /* enum */ da b = new dc();
    public static final /* enum */ da c = new dd();
    public static final /* enum */ da d = new de();
    public static final /* enum */ da e = new df();
    private static final /* synthetic */ da[] f;

    public static da[] values() {
        return (da[])f.clone();
    }

    public static da valueOf(String string) {
        return Enum.valueOf(da.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private da() {
        void var2_-1;
        void var1_-1;
    }

    abstract boolean a();

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ da(db db2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        f = new da[]{a, b, c, d, e};
    }
}

