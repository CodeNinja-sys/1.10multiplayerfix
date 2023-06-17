/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

public class q {
    private static final int[] b = new int[]{61, 127, 509, 1021, 2039, 4093, 8191, 16381, 32749, 65521, 131071, 262139};
    private int c = 0;
    private int d = 0;
    private int e = b[this.c];
    private int f = this.e * 3 / 4;
    private long[] g = new long[this.e];
    private long[] h = new long[this.e];
    public static long a = Long.MIN_VALUE;

    public q() {
        this.a(this.e);
    }

    private void a(int n2) {
        this.g = new long[n2];
        this.h = new long[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.h[i2] = a;
        }
        this.e = n2;
        this.f = (int)((double)this.e * 0.75);
        this.d = 0;
    }

    public synchronized long a(long l2) {
        return this.h[this.b(l2)];
    }

    public synchronized void a(long l2, long l3) {
        if (this.d >= this.f) {
            this.a();
        }
        int n2 = this.b(l2);
        this.g[n2] = l2;
        this.h[n2] = l3;
        ++this.d;
    }

    private final int b(long l2) {
        int n2 = this.c(l2);
        int n3 = 0;
        while (this.h[n2] != a && this.g[n2] != l2) {
            if (n3 == 0) {
                n3 = this.d(l2);
            }
            n2 = (n2 + n3) % this.e;
        }
        return n2;
    }

    private void a() {
        int n2 = this.e;
        long[] arrl = this.g;
        long[] arrl2 = this.h;
        this.e = this.c < b.length - 1 ? b[++this.c] : this.e * 2 + 1;
        this.d = 0;
        this.a(this.e);
        for (int i2 = 0; i2 < n2; ++i2) {
            if (arrl2[i2] == a) continue;
            this.a(arrl[i2], arrl2[i2]);
        }
    }

    private final int c(long l2) {
        int n2 = (int)((l2 * 15821L + 1L) % (long)this.e);
        if (n2 < 0) {
            n2 += this.e;
        }
        return n2;
    }

    private final int d(long l2) {
        return this.e - 2 - (int)(l2 % (long)(this.e - 2));
    }
}

