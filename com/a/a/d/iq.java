/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

final class iq {
    private static final int a = -862048943;
    private static final int b = 461845907;
    private static int c = 0x40000000;

    private iq() {
    }

    static int a(int n2) {
        return 461845907 * Integer.rotateLeft(n2 * -862048943, 15);
    }

    static int a(Object object) {
        return iq.a(object == null ? 0 : object.hashCode());
    }

    static int a(int n2, double d2) {
        int n3;
        if ((n2 = Math.max(n2, 2)) > (int)(d2 * (double)(n3 = Integer.highestOneBit(n2)))) {
            return (n3 <<= 1) > 0 ? n3 : c;
        }
        return n3;
    }

    static boolean a(int n2, int n3, double d2) {
        return (double)n2 > d2 * (double)n3 && n3 < c;
    }
}

