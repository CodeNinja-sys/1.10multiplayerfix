/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.cl;
import com.a.a.b.m;
import java.util.BitSet;

class ah
extends m {
    final m s;
    final m t;

    ah(m m2, m m3, String string) {
        super(string);
        this.s = (m)cl.a(m2);
        this.t = (m)cl.a(m3);
    }

    ah(m m2, m m3) {
        this(m2, m3, "CharMatcher.or(" + m2 + ", " + m3 + ")");
    }

    @Override
    void a(BitSet bitSet) {
        this.s.a(bitSet);
        this.t.a(bitSet);
    }

    @Override
    public boolean c(char c2) {
        return this.s.c(c2) || this.t.c(c2);
    }

    @Override
    m a(String string) {
        return new ah(this.s, this.t, string);
    }
}

