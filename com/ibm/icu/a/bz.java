/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.bp;
import com.ibm.icu.a.bx;

final class bz
extends bx {
    int a(int n2) {
        return this.c(n2);
    }

    bz(bp bp2, int n2) {
        super(bp2);
        n2 = bp.b(bp2, n2);
        this.d = bp.e(bp2, n2);
        this.b = this.d.length;
        this.c = n2 + 2 * (this.b + 2 & 0xFFFFFFFE);
    }
}

