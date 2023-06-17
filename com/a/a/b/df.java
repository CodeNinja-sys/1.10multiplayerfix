/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.ae;
import com.a.a.b.m;
import java.util.BitSet;

final class df
extends ae {
    static final int s = 1023;
    private final char[] t;
    private final boolean u;
    private final long v;
    private static final int w = -862048943;
    private static final int x = 461845907;
    private static final double y = 0.5;

    private df(char[] arrc, long l2, boolean bl2, String string) {
        super(string);
        this.t = arrc;
        this.v = l2;
        this.u = bl2;
    }

    static int a(int n2) {
        return 461845907 * Integer.rotateLeft(n2 * -862048943, 15);
    }

    private boolean c(int n2) {
        return 1L == (1L & this.v >> n2);
    }

    static int b(int n2) {
        if (n2 == 1) {
            return 2;
        }
        int n3 = Integer.highestOneBit(n2 - 1) << 1;
        while ((double)n3 * 0.5 < (double)n2) {
            n3 <<= 1;
        }
        return n3;
    }

    static m a(BitSet bitSet, String string) {
        long l2 = 0L;
        int n2 = bitSet.cardinality();
        boolean bl2 = bitSet.get(0);
        char[] arrc = new char[df.b(n2)];
        int n3 = arrc.length - 1;
        int n4 = bitSet.nextSetBit(0);
        while (n4 != -1) {
            l2 |= 1L << n4;
            int n5 = df.a(n4) & n3;
            while (true) {
                if (arrc[n5] == '\u0000') break;
                n5 = n5 + 1 & n3;
            }
            arrc[n5] = (char)n4;
            n4 = bitSet.nextSetBit(n4 + 1);
        }
        return new df(arrc, l2, bl2, string);
    }

    @Override
    public boolean c(char c2) {
        int n2;
        if (c2 == '\u0000') {
            return this.u;
        }
        if (!this.c((int)c2)) {
            return false;
        }
        int n3 = this.t.length - 1;
        int n4 = n2 = df.a((int)c2) & n3;
        do {
            if (this.t[n4] == '\u0000') {
                return false;
            }
            if (this.t[n4] != c2) continue;
            return true;
        } while ((n4 = n4 + 1 & n3) != n2);
        return false;
    }

    @Override
    void a(BitSet bitSet) {
        if (this.u) {
            bitSet.set(0);
        }
        for (char c2 : this.t) {
            if (c2 == '\u0000') continue;
            bitSet.set(c2);
        }
    }
}

