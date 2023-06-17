/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.ae;
import java.util.BitSet;

final class q
extends ae {
    final /* synthetic */ char s;
    final /* synthetic */ char t;

    q(String string, char c2, char c3) {
        this.s = c2;
        this.t = c3;
        super(string);
    }

    @Override
    public boolean c(char c2) {
        return c2 == this.s || c2 == this.t;
    }

    @Override
    void a(BitSet bitSet) {
        bitSet.set(this.s);
        bitSet.set(this.t);
    }
}

