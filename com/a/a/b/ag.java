/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.m;
import java.util.BitSet;

class ag
extends m {
    final m s;

    ag(String string, m m2) {
        super(string);
        this.s = m2;
    }

    ag(m m2) {
        this(m2 + ".negate()", m2);
    }

    @Override
    public boolean c(char c2) {
        return !this.s.c(c2);
    }

    @Override
    public boolean d(CharSequence charSequence) {
        return this.s.e(charSequence);
    }

    @Override
    public boolean e(CharSequence charSequence) {
        return this.s.d(charSequence);
    }

    @Override
    public int h(CharSequence charSequence) {
        return charSequence.length() - this.s.h(charSequence);
    }

    @Override
    void a(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        this.s.a(bitSet2);
        bitSet2.flip(0, 65536);
        bitSet.or(bitSet2);
    }

    @Override
    public m a() {
        return this.s;
    }

    @Override
    m a(String string) {
        return new ag(string, this.s);
    }
}

