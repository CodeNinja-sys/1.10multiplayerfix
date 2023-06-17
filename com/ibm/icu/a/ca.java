/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.bp;
import com.ibm.icu.a.bx;

final class ca
extends bx {
    int a(int n2) {
        return this.c(n2);
    }

    ca(bp bp2, int n2) {
        super(bp2);
        n2 = bp.b(bp2, n2);
        this.e = bp.g(bp2, n2);
        this.b = this.e.length;
        this.c = n2 + 4 * (1 + this.b);
    }
}

