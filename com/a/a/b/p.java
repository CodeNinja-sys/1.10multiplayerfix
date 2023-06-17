/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.m;
import java.util.Arrays;
import java.util.BitSet;

final class p
extends m {
    final /* synthetic */ char[] s;

    p(String string, char[] arrc) {
        this.s = arrc;
        super(string);
    }

    @Override
    public boolean c(char c2) {
        return Arrays.binarySearch(this.s, c2) >= 0;
    }

    @Override
    void a(BitSet bitSet) {
        for (char c2 : this.s) {
            bitSet.set(c2);
        }
    }
}

