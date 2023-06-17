/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.cm;
import com.a.a.b.co;
import com.a.a.b.cz;
import com.a.a.b.da;
import com.a.a.b.db;
import com.a.a.b.dc;

abstract class cy
extends Enum
implements cm {
    public static final /* enum */ cy a = new cz();
    public static final /* enum */ cy b = new da();
    public static final /* enum */ cy c = new db();
    public static final /* enum */ cy d = new dc();
    private static final /* synthetic */ cy[] e;

    public static cy[] values() {
        return (cy[])e.clone();
    }

    public static cy valueOf(String string) {
        return Enum.valueOf(cy.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cy() {
        void var2_-1;
        void var1_-1;
    }

    cm a() {
        return this;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ cy(co co2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        e = new cy[]{a, b, c, d};
    }
}

