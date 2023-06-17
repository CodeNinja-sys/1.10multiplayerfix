/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.b;

import com.ibm.icu.a.b.e;
import com.ibm.icu.a.b.p;
import com.ibm.icu.a.b.q;
import com.ibm.icu.a.b.s;
import com.ibm.icu.a.b.x;

class n
extends s {
    private int b;

    n(int n2, e e2) {
        super(e2);
        this.b = n2;
    }

    public static n a(int n2, e e2) {
        if (n2 > 0 && e2 != null) {
            return new n(n2, e2);
        }
        return null;
    }

    protected q a(e e2) {
        return n.a(this.b, e2);
    }

    protected p a(long l2, long l3, boolean bl2) {
        p p2 = null;
        int n2 = 0;
        short s2 = this.a.a();
        for (int i2 = 0; i2 < x.k.length; ++i2) {
            if (0 == (s2 & 1 << i2)) continue;
            x x2 = x.k[i2];
            if (n2 == this.b) break;
            long l4 = this.a(x2);
            if (l2 < l4 && n2 <= 0) continue;
            double d2 = (double)l2 / (double)l4;
            if (++n2 < this.b) {
                d2 = Math.floor(d2);
                l2 -= (long)(d2 * (double)l4);
            }
            p2 = p2 == null ? p.a((float)d2, x2).b(bl2) : p2.d((float)d2, x2);
        }
        return p2;
    }
}

