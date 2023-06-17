/*
 * Decompiled with CFR 0.150.
 */
package com.b.a;

public class c {
    private static int[] g = new int[256];
    public byte[] a;
    public int b;
    public int c;
    public byte[] d;
    public int e;
    public int f;

    private static int a(int n2) {
        int n3 = n2 << 24;
        for (int i2 = 0; i2 < 8; ++i2) {
            if ((n3 & Integer.MIN_VALUE) != 0) {
                n3 = n3 << 1 ^ 0x4C11DB7;
                continue;
            }
            n3 <<= 1;
        }
        return n3 & 0xFFFFFFFF;
    }

    int a() {
        return this.a[this.b + 4] & 0xFF;
    }

    int b() {
        return this.a[this.b + 5] & 1;
    }

    public int c() {
        return this.a[this.b + 5] & 2;
    }

    public int d() {
        return this.a[this.b + 5] & 4;
    }

    public long e() {
        long l2 = this.a[this.b + 13] & 0xFF;
        l2 = l2 << 8 | (long)(this.a[this.b + 12] & 0xFF);
        l2 = l2 << 8 | (long)(this.a[this.b + 11] & 0xFF);
        l2 = l2 << 8 | (long)(this.a[this.b + 10] & 0xFF);
        l2 = l2 << 8 | (long)(this.a[this.b + 9] & 0xFF);
        l2 = l2 << 8 | (long)(this.a[this.b + 8] & 0xFF);
        l2 = l2 << 8 | (long)(this.a[this.b + 7] & 0xFF);
        l2 = l2 << 8 | (long)(this.a[this.b + 6] & 0xFF);
        return l2;
    }

    public int f() {
        return this.a[this.b + 14] & 0xFF | (this.a[this.b + 15] & 0xFF) << 8 | (this.a[this.b + 16] & 0xFF) << 16 | (this.a[this.b + 17] & 0xFF) << 24;
    }

    int g() {
        return this.a[this.b + 18] & 0xFF | (this.a[this.b + 19] & 0xFF) << 8 | (this.a[this.b + 20] & 0xFF) << 16 | (this.a[this.b + 21] & 0xFF) << 24;
    }

    void h() {
        int n2;
        int n3 = 0;
        for (n2 = 0; n2 < this.c; ++n2) {
            n3 = n3 << 8 ^ g[n3 >>> 24 & 0xFF ^ this.a[this.b + n2] & 0xFF];
        }
        for (n2 = 0; n2 < this.f; ++n2) {
            n3 = n3 << 8 ^ g[n3 >>> 24 & 0xFF ^ this.d[this.e + n2] & 0xFF];
        }
        this.a[this.b + 22] = (byte)n3;
        this.a[this.b + 23] = (byte)(n3 >>> 8);
        this.a[this.b + 24] = (byte)(n3 >>> 16);
        this.a[this.b + 25] = (byte)(n3 >>> 24);
    }

    public c i() {
        return this.a(new c());
    }

    public c a(c c2) {
        byte[] arrby = new byte[this.c];
        System.arraycopy(this.a, this.b, arrby, 0, this.c);
        c2.c = this.c;
        c2.a = arrby;
        c2.b = 0;
        arrby = new byte[this.f];
        System.arraycopy(this.d, this.e, arrby, 0, this.f);
        c2.f = this.f;
        c2.d = arrby;
        c2.e = 0;
        return c2;
    }

    static {
        for (int i2 = 0; i2 < g.length; ++i2) {
            com.b.a.c.g[i2] = com.b.a.c.a(i2);
        }
    }
}

