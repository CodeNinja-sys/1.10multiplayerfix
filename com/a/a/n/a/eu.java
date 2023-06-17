/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.es;
import com.a.a.n.a.ev;
import com.a.a.n.a.ew;
import com.a.a.n.a.ex;
import com.a.a.n.a.ey;
import com.a.a.n.a.ez;
import com.a.a.n.a.fa;

public abstract class eu
extends Enum {
    public static final /* enum */ eu a = new ev();
    public static final /* enum */ eu b = new ew();
    public static final /* enum */ eu c = new ex();
    public static final /* enum */ eu d = new ey();
    public static final /* enum */ eu e = new ez();
    public static final /* enum */ eu f = new fa();
    private static final /* synthetic */ eu[] g;

    public static eu[] values() {
        return (eu[])g.clone();
    }

    public static eu valueOf(String string) {
        return Enum.valueOf(eu.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private eu() {
        void var2_-1;
        void var1_-1;
    }

    abstract boolean a();

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ eu(es es2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        g = new eu[]{a, b, c, d, e, f};
    }
}

