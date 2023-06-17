/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.ak;

final class am {
    final ak a;
    private final int g;
    private final int h;
    private final int i;
    private final long[] j;
    am b;
    am c;
    boolean d;
    int e;
    private int k;
    private int l;
    private int m;
    private int n;

    am(int n2) {
        this.a = null;
        this.g = -1;
        this.h = -1;
        this.e = -1;
        this.i = n2;
        this.j = null;
    }

    am(ak ak2, int n2, int n3, int n4, int n5) {
        this.a = ak2;
        this.g = n2;
        this.h = n3;
        this.i = n4;
        this.j = new long[n4 >>> 10];
        this.a(n5);
    }

    void a(int n2) {
        this.d = true;
        this.e = n2;
        if (n2 != 0) {
            this.k = this.n = this.i / n2;
            this.m = 0;
            this.l = this.k >>> 6;
            if ((this.k & 0x3F) != 0) {
                ++this.l;
            }
            for (int i2 = 0; i2 < this.l; ++i2) {
                this.j[i2] = 0L;
            }
        }
        this.b();
    }

    long a() {
        if (this.e == 0) {
            return this.d(0);
        }
        if (this.n == 0 || !this.d) {
            return -1L;
        }
        int n2 = this.d();
        int n3 = n2 >>> 6;
        int n4 = n2 & 0x3F;
        assert ((this.j[n3] >>> n4 & 1L) == 0L);
        int n5 = n3;
        this.j[n5] = this.j[n5] | 1L << n4;
        if (--this.n == 0) {
            this.c();
        }
        return this.d(n2);
    }

    boolean b(int n2) {
        if (this.e == 0) {
            return true;
        }
        int n3 = n2 >>> 6;
        int n4 = n2 & 0x3F;
        assert ((this.j[n3] >>> n4 & 1L) != 0L);
        int n5 = n3;
        this.j[n5] = this.j[n5] ^ 1L << n4;
        this.c(n2);
        if (this.n++ == 0) {
            this.b();
            return true;
        }
        if (this.n != this.k) {
            return true;
        }
        if (this.b == this.c) {
            return true;
        }
        this.d = false;
        this.c();
        return false;
    }

    private void b() {
        am am2 = this.a.a.e(this.e);
        assert (this.b == null && this.c == null);
        this.b = am2;
        this.c = am2.c;
        this.c.b = this;
        am2.c = this;
    }

    private void c() {
        assert (this.b != null && this.c != null);
        this.b.c = this.c;
        this.c.b = this.b;
        this.c = null;
        this.b = null;
    }

    private void c(int n2) {
        this.m = n2;
    }

    private int d() {
        int n2 = this.m;
        if (n2 >= 0) {
            this.m = -1;
            return n2;
        }
        return this.e();
    }

    private int e() {
        long[] arrl = this.j;
        int n2 = this.l;
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = arrl[i2];
            if ((l2 ^ 0xFFFFFFFFFFFFFFFFL) == 0L) continue;
            return this.a(i2, l2);
        }
        return -1;
    }

    private int a(int n2, long l2) {
        int n3 = this.k;
        int n4 = n2 << 6;
        for (int i2 = 0; i2 < 64; ++i2) {
            if ((l2 & 1L) == 0L) {
                int n5 = n4 | i2;
                if (n5 >= n3) break;
                return n5;
            }
            l2 >>>= 1;
        }
        return -1;
    }

    private long d(int n2) {
        return 0x4000000000000000L | (long)n2 << 32 | (long)this.g;
    }

    public String toString() {
        if (!this.d) {
            return "(" + this.g + ": not in use)";
        }
        return String.valueOf('(') + this.g + ": " + (this.k - this.n) + '/' + this.k + ", offset: " + this.h + ", length: " + this.i + ", elemSize: " + this.e + ')';
    }
}

