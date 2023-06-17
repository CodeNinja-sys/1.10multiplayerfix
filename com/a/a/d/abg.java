/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.abb;
import com.a.a.d.abh;
import com.a.a.d.abi;
import com.a.a.d.abj;
import com.a.a.d.abk;
import com.a.a.d.abl;
import java.util.Comparator;
import java.util.List;

public abstract class abg
extends Enum {
    public static final /* enum */ abg a = new abh();
    public static final /* enum */ abg b = new abi();
    public static final /* enum */ abg c = new abj();
    public static final /* enum */ abg d = new abk();
    public static final /* enum */ abg e = new abl();
    private static final /* synthetic */ abg[] f;

    public static abg[] values() {
        return (abg[])f.clone();
    }

    public static abg valueOf(String string) {
        return Enum.valueOf(abg.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private abg() {
        void var2_-1;
        void var1_-1;
    }

    abstract int a(Comparator var1, Object var2, List var3, int var4);

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ abg(abb abb2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        f = new abg[]{a, b, c, d, e};
    }
}

