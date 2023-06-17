/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.ad;

class bv {
    private static final int a = 0xFFFFFF;
    private int b = 0;
    private int c = 0;
    private int[] d;
    private byte[] e;
    private int f;
    private int g;
    private byte h;

    public bv(int[] arrn, byte[] arrby) {
        this.d = arrn;
        this.e = arrby;
        this.c = 0;
        this.g = 0;
        this.f = 0;
    }

    private static int a(int[] arrn, int n2) {
        int n3 = 0;
        if (arrn[n3 + 32] <= n2) {
            n3 += 32;
        }
        if (arrn[n3 + 16] <= n2) {
            n3 += 16;
        }
        if (arrn[n3 + 8] <= n2) {
            n3 += 8;
        }
        if (arrn[n3 + 4] <= n2) {
            n3 += 4;
        }
        if (arrn[n3 + 2] <= n2) {
            n3 += 2;
        }
        if (arrn[n3 + 1] <= n2) {
            ++n3;
        }
        if (arrn[n3] > n2) {
            --n3;
        }
        if (n3 < 0 || arrn[n3] != n2) {
            return -1;
        }
        return n3;
    }

    private void a(int n2) {
        ++this.f;
        if (bv.a(this.d, n2) >= 0) {
            ++this.g;
        }
    }

    private void b(int n2) {
        this.c = (this.c << 8) + (n2 & 0xFF) & 0xFFFFFF;
        this.a(this.c);
    }

    private int b(ad ad2) {
        if (this.b >= ad2.b) {
            return -1;
        }
        return ad2.a[this.b++] & 0xFF;
    }

    public int a(ad ad2) {
        return this.a(ad2, (byte)32);
    }

    public int a(ad ad2, byte by2) {
        int n2;
        boolean bl2 = false;
        this.h = by2;
        while ((n2 = this.b(ad2)) >= 0) {
            byte by3 = this.e[n2];
            if (by3 == 0) continue;
            if (by3 != this.h || !bl2) {
                this.b(by3);
            }
            bl2 = by3 == this.h;
        }
        this.b(this.h);
        double d2 = (double)this.g / (double)this.f;
        if (d2 > 0.33) {
            return 98;
        }
        return (int)(d2 * 300.0);
    }
}

