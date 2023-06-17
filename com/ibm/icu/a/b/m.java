/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.b;

import com.ibm.icu.a.b.e;
import com.ibm.icu.a.b.p;
import com.ibm.icu.a.b.q;
import com.ibm.icu.a.b.s;
import com.ibm.icu.a.b.x;

class m
extends s {
    private x b;

    public static m a(x x2, e e2) {
        if (e2 != null && (e2.a() & 1 << x2.b) != 0) {
            return new m(x2, e2);
        }
        return null;
    }

    m(x x2, e e2) {
        super(e2);
        this.b = x2;
    }

    protected q a(e e2) {
        return m.a(this.b, e2);
    }

    protected p a(long l2, long l3, boolean bl2) {
        if (this.b == null) {
            return null;
        }
        long l4 = this.a(this.b);
        return p.a((float)((double)l2 / (double)l4), this.b).b(bl2);
    }
}

