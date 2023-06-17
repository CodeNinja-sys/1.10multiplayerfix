/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.io.InputStream;

class d {
    private final InputStream a;
    private long b;
    private int c;
    private static final int[] d = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255};

    d(InputStream inputStream) {
        this.a = inputStream;
    }

    private boolean c() {
        long l2;
        boolean bl2 = false;
        while (this.c <= 56 && (l2 = (long)this.a.read()) != -1L) {
            bl2 = true;
            this.b |= l2 << this.c;
            this.c += 8;
        }
        return bl2;
    }

    int a() {
        if (this.c == 0 && !this.c()) {
            return -1;
        }
        int n2 = (int)(this.b & 1L);
        this.b >>>= 1;
        --this.c;
        return n2;
    }

    int a(int n2) {
        if (this.c < n2 && !this.c()) {
            return -1;
        }
        int n3 = (int)(this.b & (long)d[n2]);
        this.b >>>= n2;
        this.c -= n2;
        return n3;
    }

    int b() {
        return this.a(8);
    }
}

