/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.ae;
import com.a.a.b.m;
import java.util.BitSet;

final class ab
extends ae {
    final /* synthetic */ char s;

    ab(String string, char c2) {
        this.s = c2;
        super(string);
    }

    @Override
    public boolean c(char c2) {
        return c2 == this.s;
    }

    @Override
    public String a(CharSequence charSequence, char c2) {
        return charSequence.toString().replace(this.s, c2);
    }

    @Override
    public m a(m m2) {
        return m2.c(this.s) ? this : m;
    }

    @Override
    public m b(m m2) {
        return m2.c(this.s) ? m2 : super.b(m2);
    }

    @Override
    public m a() {
        return ab.b(this.s);
    }

    @Override
    void a(BitSet bitSet) {
        bitSet.set(this.s);
    }
}

