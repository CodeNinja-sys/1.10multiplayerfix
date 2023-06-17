/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.aw;
import com.a.a.d.qz;
import com.a.a.d.rz;
import com.a.a.d.sa;
import com.a.a.d.si;
import com.a.a.d.sj;
import com.a.a.d.sk;
import com.a.a.d.sr;

abstract class sh
extends Enum {
    public static final /* enum */ sh a = new si();
    public static final /* enum */ sh b = new sj();
    public static final /* enum */ sh c = new sk();
    private static final /* synthetic */ sh[] d;

    public static sh[] values() {
        return (sh[])d.clone();
    }

    public static sh valueOf(String string) {
        return Enum.valueOf(sh.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private sh() {
        void var2_-1;
        void var1_-1;
    }

    abstract sr a(sa var1, rz var2, Object var3);

    abstract aw a();

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ sh(qz qz2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        d = new sh[]{a, b, c};
    }
}

