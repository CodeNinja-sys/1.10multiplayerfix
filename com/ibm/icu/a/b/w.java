/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.b;

import com.ibm.icu.a.b.e;
import com.ibm.icu.a.b.p;
import com.ibm.icu.a.b.q;
import com.ibm.icu.a.b.s;
import com.ibm.icu.a.b.x;

class w
extends s {
    w(e e2) {
        super(e2);
    }

    public static w b(e e2) {
        if (e2 == null) {
            return null;
        }
        return new w(e2);
    }

    protected q a(e e2) {
        return w.b(e2);
    }

    protected p a(long l2, long l3, boolean bl2) {
        short s2 = this.a.a();
        for (int i2 = 0; i2 < x.k.length; ++i2) {
            x x2;
            long l4;
            if (0 == (s2 & 1 << i2) || l2 < (l4 = this.a(x2 = x.k[i2]))) continue;
            return p.a((float)((double)l2 / (double)l4), x2).b(bl2);
        }
        return null;
    }
}

