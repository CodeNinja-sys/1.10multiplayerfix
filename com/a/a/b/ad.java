/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.ae;
import com.a.a.b.n;
import java.util.BitSet;

class ad
extends ae {
    private final BitSet s;

    private ad(BitSet bitSet, String string) {
        super(string);
        if (bitSet.length() + 64 < bitSet.size()) {
            bitSet = (BitSet)bitSet.clone();
        }
        this.s = bitSet;
    }

    @Override
    public boolean c(char c2) {
        return this.s.get(c2);
    }

    @Override
    void a(BitSet bitSet) {
        bitSet.or(this.s);
    }

    /* synthetic */ ad(BitSet bitSet, String string, n n2) {
        this(bitSet, string);
    }
}

