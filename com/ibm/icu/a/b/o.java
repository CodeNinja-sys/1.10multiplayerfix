/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.b;

import com.ibm.icu.a.b.e;
import com.ibm.icu.a.b.p;
import com.ibm.icu.a.b.q;
import com.ibm.icu.a.b.s;
import com.ibm.icu.a.b.x;

class o
extends s {
    o(e e2) {
        super(e2);
    }

    public static o b(e e2) {
        if (e2 == null) {
            return null;
        }
        return new o(e2);
    }

    protected q a(e e2) {
        return o.b(e2);
    }

    protected p a(long l2, long l3, boolean bl2) {
        p p2 = null;
        short s2 = this.a.a();
        for (int i2 = 0; i2 < x.k.length; ++i2) {
            x x2;
            long l4;
            if (0 == (s2 & 1 << i2) || l2 < (l4 = this.a(x2 = x.k[i2])) && p2 == null) continue;
            double d2 = (double)l2 / (double)l4;
            if (p2 == null) {
                if (d2 >= 2.0) {
                    p2 = p.a((float)d2, x2);
                    break;
                }
                p2 = p.a(1.0f, x2).b(bl2);
                l2 -= l4;
                continue;
            }
            if (!(d2 >= 1.0)) break;
            p2 = p2.d((float)d2, x2);
            break;
        }
        return p2;
    }
}

