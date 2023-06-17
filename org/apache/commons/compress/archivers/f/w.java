/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.f;

import java.util.Arrays;

public enum w {
    a(new byte[]{0}),
    b(new byte[]{3, 1, 1}),
    c(new byte[]{33}),
    d(new byte[]{4, 1, 8}),
    e(new byte[]{4, 2, 2}),
    f(new byte[]{6, -15, 7, 1}),
    g(new byte[]{3, 3, 1, 3}),
    h(new byte[]{3, 3, 2, 5}),
    i(new byte[]{3, 3, 4, 1}),
    j(new byte[]{3, 3, 5, 1}),
    k(new byte[]{3, 3, 7, 1}),
    l(new byte[]{3, 3, 8, 5}),
    m(new byte[]{3});

    private final byte[] n;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private w() {
        void var3_1;
        this.n = var3_1;
    }

    byte[] a() {
        byte[] arrby = new byte[this.n.length];
        System.arraycopy(this.n, 0, arrby, 0, this.n.length);
        return arrby;
    }

    static w a(byte[] arrby) {
        for (w w2 : (w[])w.class.getEnumConstants()) {
            if (!Arrays.equals(w2.n, arrby)) continue;
            return w2;
        }
        return null;
    }
}

