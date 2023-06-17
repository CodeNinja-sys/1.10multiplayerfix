/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.g.ae;
import com.a.a.g.aj;
import com.a.a.g.bj;
import com.a.a.g.h;
import java.io.Serializable;

final class bi
extends h
implements Serializable {
    private static final int a = -862048943;
    private static final int b = 461845907;
    private final int c;
    private static final long d = 0L;

    bi(int n2) {
        this.c = n2;
    }

    @Override
    public int b() {
        return 32;
    }

    @Override
    public aj a() {
        return new bj(this.c);
    }

    public String toString() {
        return "Hashing.murmur3_32(" + this.c + ")";
    }

    public boolean equals(Object object) {
        if (object instanceof bi) {
            bi bi2 = (bi)object;
            return this.c == bi2.c;
        }
        return false;
    }

    public int hashCode() {
        return this.getClass().hashCode() ^ this.c;
    }

    @Override
    public ae b(int n2) {
        int n3 = bi.d(n2);
        int n4 = bi.c(this.c, n3);
        return bi.d(n4, 4);
    }

    @Override
    public ae a(long l2) {
        int n2 = (int)l2;
        int n3 = (int)(l2 >>> 32);
        int n4 = bi.d(n2);
        int n5 = bi.c(this.c, n4);
        n4 = bi.d(n3);
        n5 = bi.c(n5, n4);
        return bi.d(n5, 8);
    }

    @Override
    public ae a(CharSequence charSequence) {
        int n2;
        int n3 = this.c;
        for (n2 = 1; n2 < charSequence.length(); n2 += 2) {
            int n4 = charSequence.charAt(n2 - 1) | charSequence.charAt(n2) << 16;
            n4 = bi.d(n4);
            n3 = bi.c(n3, n4);
        }
        if ((charSequence.length() & 1) == 1) {
            n2 = charSequence.charAt(charSequence.length() - 1);
            n2 = bi.d(n2);
            n3 ^= n2;
        }
        return bi.d(n3, 2 * charSequence.length());
    }

    private static int d(int n2) {
        n2 *= -862048943;
        n2 = Integer.rotateLeft(n2, 15);
        return n2 *= 461845907;
    }

    private static int c(int n2, int n3) {
        n2 ^= n3;
        n2 = Integer.rotateLeft(n2, 13);
        n2 = n2 * 5 + -430675100;
        return n2;
    }

    private static ae d(int n2, int n3) {
        n2 ^= n3;
        n2 ^= n2 >>> 16;
        n2 *= -2048144789;
        n2 ^= n2 >>> 13;
        n2 *= -1028477387;
        n2 ^= n2 >>> 16;
        return ae.a(n2);
    }

    static /* synthetic */ int c(int n2) {
        return bi.d(n2);
    }

    static /* synthetic */ int a(int n2, int n3) {
        return bi.c(n2, n3);
    }

    static /* synthetic */ ae b(int n2, int n3) {
        return bi.d(n2, n3);
    }
}

