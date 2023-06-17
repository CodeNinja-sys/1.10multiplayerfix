/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.ae;
import java.util.BitSet;

final class r
extends ae {
    final /* synthetic */ char s;
    final /* synthetic */ char t;

    r(String string, char c2, char c3) {
        this.s = c2;
        this.t = c3;
        super(string);
    }

    @Override
    public boolean c(char c2) {
        return this.s <= c2 && c2 <= this.t;
    }

    @Override
    void a(BitSet bitSet) {
        bitSet.set((int)this.s, this.t + '\u0001');
    }
}

