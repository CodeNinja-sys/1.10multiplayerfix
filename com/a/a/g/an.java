/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.b.dx;
import com.a.a.g.al;
import com.a.a.g.ao;
import com.a.a.g.ap;
import java.util.zip.Checksum;

abstract class an
extends Enum
implements dx {
    public static final /* enum */ an a = new ao(32);
    public static final /* enum */ an b = new ap(32);
    private final int c;
    private static final /* synthetic */ an[] d;

    public static an[] values() {
        return (an[])d.clone();
    }

    public static an valueOf(String string) {
        return Enum.valueOf(an.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private an() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.c = var3_1;
    }

    public abstract Checksum b();

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }

    static /* synthetic */ int a(an an2) {
        return an2.c;
    }

    /*
     * WARNING - void declaration
     */
    /* synthetic */ an(int n2, al al2) {
        this((String)var1_-1, (int)al2, (int)var3_2);
        void var3_2;
        void var1_-1;
    }

    static {
        d = new an[]{a, b};
    }
}

