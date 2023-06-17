/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.dw;

public enum dv {
    a(dw.a, 0),
    b(dw.a, 1),
    c(dw.b, 0),
    d(dw.b, 1),
    e(dw.b, 2),
    f(dw.b, 3),
    g(dw.b, 4);

    private final dw h;
    private final int i;

    /*
     * WARNING - void declaration
     */
    private dv() {
        void var4_2;
        void var3_1;
        this.h = var3_1;
        this.i = var4_2;
    }

    public dw a() {
        return this.h;
    }

    public int b() {
        return this.i;
    }
}

