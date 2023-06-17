/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.hj;
import com.ibm.icu.d.hl;

class hn
extends hj {
    private static final long c = 1405488568664762222L;

    hn(hl hl2, hl hl3) {
        super(hl2, hl3, " || ");
    }

    public boolean a(double d2) {
        return this.a.a(d2) || this.b.a(d2);
    }

    public boolean a() {
        return this.a.a() && this.b.a();
    }
}

