/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.fp;
import com.sun.jna.a.d.gh;

public abstract class dn
implements fp {
    public static final boolean a(int n2) {
        return n2 >= 0;
    }

    public static final boolean b(int n2) {
        return n2 < 0;
    }

    public static final int c(int n2) {
        return n2 & 0xFFFF;
    }

    public static final int d(int n2) {
        return n2 & 0xFFFF;
    }

    public static final int e(int n2) {
        return (n2 >>= 16) & 0x1FFF;
    }

    public static final int a(short s2) {
        s2 = (short)(s2 >> 16);
        return s2 & 0x1FFF;
    }

    public static short f(int n2) {
        return (short)((n2 >>= 31) & 1);
    }

    public static short b(short s2) {
        s2 = (short)(s2 >> 31);
        return (short)(s2 & 1);
    }

    public static int a(short s2, short s3, short s4) {
        return s2 << 31 | s3 << 16 | s4;
    }

    public static final int b(short s2, short s3, short s4) {
        return s2 << 31 | s3 << 16 | s4;
    }

    public static final gh g(int n2) {
        int n3 = 7;
        return new gh(n2 <= 0 ? n2 : n2 & 0xFFFF | (n3 <<= 16) | Integer.MIN_VALUE);
    }

    public static final int h(int n2) {
        int n3 = 31;
        return n2 & 0x8000FFFF | (n3 <<= 16);
    }
}

