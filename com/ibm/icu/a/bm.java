/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.bh;
import com.ibm.icu.a.bp;

final class bm
extends bh {
    private int[] I;

    public int[] z() {
        return this.I;
    }

    bm(bp bp2, String string, String string2, int n2, bh bh2) {
        super(bp2, string, string2, n2, bh2);
        this.I = bp2.h(n2);
    }
}

