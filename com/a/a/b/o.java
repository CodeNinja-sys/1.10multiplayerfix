/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.ae;
import com.a.a.b.m;
import java.util.BitSet;

final class o
extends ae {
    final /* synthetic */ char s;

    o(String string, char c2) {
        this.s = c2;
        super(string);
    }

    @Override
    public boolean c(char c2) {
        return c2 != this.s;
    }

    @Override
    public m a(m m2) {
        return m2.c(this.s) ? super.a(m2) : m2;
    }

    @Override
    public m b(m m2) {
        return m2.c(this.s) ? l : this;
    }

    @Override
    void a(BitSet bitSet) {
        bitSet.set(0, this.s);
        bitSet.set(this.s + '\u0001', 65536);
    }

    @Override
    public m a() {
        return com.a.a.b.o.a(this.s);
    }
}

