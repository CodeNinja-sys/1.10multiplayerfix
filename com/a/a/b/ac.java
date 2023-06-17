/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.cl;
import com.a.a.b.m;
import java.util.BitSet;

class ac
extends m {
    final m s;
    final m t;

    ac(m m2, m m3) {
        this(m2, m3, "CharMatcher.and(" + m2 + ", " + m3 + ")");
    }

    ac(m m2, m m3, String string) {
        super(string);
        this.s = (m)cl.a(m2);
        this.t = (m)cl.a(m3);
    }

    @Override
    public boolean c(char c2) {
        return this.s.c(c2) && this.t.c(c2);
    }

    @Override
    void a(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        this.s.a(bitSet2);
        BitSet bitSet3 = new BitSet();
        this.t.a(bitSet3);
        bitSet2.and(bitSet3);
        bitSet.or(bitSet2);
    }

    @Override
    m a(String string) {
        return new ac(this.s, this.t, string);
    }
}

