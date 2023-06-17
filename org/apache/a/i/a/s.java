/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.a;

import org.apache.a.i.a.p;

class s {
    protected int a = 1732584193;
    protected int b = -271733879;
    protected int c = -1732584194;
    protected int d = 271733878;
    protected long e = 0L;
    protected byte[] f = new byte[64];

    s() {
    }

    void a(byte[] arrby) {
        int n2;
        int n3 = (int)(this.e & 0x3FL);
        int n4 = 0;
        while (arrby.length - n4 + n3 >= this.f.length) {
            n2 = this.f.length - n3;
            System.arraycopy(arrby, n4, this.f, n3, n2);
            this.e += (long)n2;
            n3 = 0;
            n4 += n2;
            this.b();
        }
        if (n4 < arrby.length) {
            n2 = arrby.length - n4;
            System.arraycopy(arrby, n4, this.f, n3, n2);
            this.e += (long)n2;
            n3 += n2;
        }
    }

    byte[] a() {
        int n2 = (int)(this.e & 0x3FL);
        int n3 = n2 < 56 ? 56 - n2 : 120 - n2;
        byte[] arrby = new byte[n3 + 8];
        arrby[0] = -128;
        for (int i2 = 0; i2 < 8; ++i2) {
            arrby[n3 + i2] = (byte)(this.e * 8L >>> 8 * i2);
        }
        this.a(arrby);
        byte[] arrby2 = new byte[16];
        p.a(arrby2, this.a, 0);
        p.a(arrby2, this.b, 4);
        p.a(arrby2, this.c, 8);
        p.a(arrby2, this.d, 12);
        return arrby2;
    }

    protected void b() {
        int n2;
        int[] arrn = new int[16];
        for (n2 = 0; n2 < 16; ++n2) {
            arrn[n2] = (this.f[n2 * 4] & 0xFF) + ((this.f[n2 * 4 + 1] & 0xFF) << 8) + ((this.f[n2 * 4 + 2] & 0xFF) << 16) + ((this.f[n2 * 4 + 3] & 0xFF) << 24);
        }
        n2 = this.a;
        int n3 = this.b;
        int n4 = this.c;
        int n5 = this.d;
        this.a(arrn);
        this.b(arrn);
        this.c(arrn);
        this.a += n2;
        this.b += n3;
        this.c += n4;
        this.d += n5;
    }

    protected void a(int[] arrn) {
        this.a = p.a(this.a + p.a(this.b, this.c, this.d) + arrn[0], 3);
        this.d = p.a(this.d + p.a(this.a, this.b, this.c) + arrn[1], 7);
        this.c = p.a(this.c + p.a(this.d, this.a, this.b) + arrn[2], 11);
        this.b = p.a(this.b + p.a(this.c, this.d, this.a) + arrn[3], 19);
        this.a = p.a(this.a + p.a(this.b, this.c, this.d) + arrn[4], 3);
        this.d = p.a(this.d + p.a(this.a, this.b, this.c) + arrn[5], 7);
        this.c = p.a(this.c + p.a(this.d, this.a, this.b) + arrn[6], 11);
        this.b = p.a(this.b + p.a(this.c, this.d, this.a) + arrn[7], 19);
        this.a = p.a(this.a + p.a(this.b, this.c, this.d) + arrn[8], 3);
        this.d = p.a(this.d + p.a(this.a, this.b, this.c) + arrn[9], 7);
        this.c = p.a(this.c + p.a(this.d, this.a, this.b) + arrn[10], 11);
        this.b = p.a(this.b + p.a(this.c, this.d, this.a) + arrn[11], 19);
        this.a = p.a(this.a + p.a(this.b, this.c, this.d) + arrn[12], 3);
        this.d = p.a(this.d + p.a(this.a, this.b, this.c) + arrn[13], 7);
        this.c = p.a(this.c + p.a(this.d, this.a, this.b) + arrn[14], 11);
        this.b = p.a(this.b + p.a(this.c, this.d, this.a) + arrn[15], 19);
    }

    protected void b(int[] arrn) {
        this.a = p.a(this.a + p.b(this.b, this.c, this.d) + arrn[0] + 1518500249, 3);
        this.d = p.a(this.d + p.b(this.a, this.b, this.c) + arrn[4] + 1518500249, 5);
        this.c = p.a(this.c + p.b(this.d, this.a, this.b) + arrn[8] + 1518500249, 9);
        this.b = p.a(this.b + p.b(this.c, this.d, this.a) + arrn[12] + 1518500249, 13);
        this.a = p.a(this.a + p.b(this.b, this.c, this.d) + arrn[1] + 1518500249, 3);
        this.d = p.a(this.d + p.b(this.a, this.b, this.c) + arrn[5] + 1518500249, 5);
        this.c = p.a(this.c + p.b(this.d, this.a, this.b) + arrn[9] + 1518500249, 9);
        this.b = p.a(this.b + p.b(this.c, this.d, this.a) + arrn[13] + 1518500249, 13);
        this.a = p.a(this.a + p.b(this.b, this.c, this.d) + arrn[2] + 1518500249, 3);
        this.d = p.a(this.d + p.b(this.a, this.b, this.c) + arrn[6] + 1518500249, 5);
        this.c = p.a(this.c + p.b(this.d, this.a, this.b) + arrn[10] + 1518500249, 9);
        this.b = p.a(this.b + p.b(this.c, this.d, this.a) + arrn[14] + 1518500249, 13);
        this.a = p.a(this.a + p.b(this.b, this.c, this.d) + arrn[3] + 1518500249, 3);
        this.d = p.a(this.d + p.b(this.a, this.b, this.c) + arrn[7] + 1518500249, 5);
        this.c = p.a(this.c + p.b(this.d, this.a, this.b) + arrn[11] + 1518500249, 9);
        this.b = p.a(this.b + p.b(this.c, this.d, this.a) + arrn[15] + 1518500249, 13);
    }

    protected void c(int[] arrn) {
        this.a = p.a(this.a + p.c(this.b, this.c, this.d) + arrn[0] + 1859775393, 3);
        this.d = p.a(this.d + p.c(this.a, this.b, this.c) + arrn[8] + 1859775393, 9);
        this.c = p.a(this.c + p.c(this.d, this.a, this.b) + arrn[4] + 1859775393, 11);
        this.b = p.a(this.b + p.c(this.c, this.d, this.a) + arrn[12] + 1859775393, 15);
        this.a = p.a(this.a + p.c(this.b, this.c, this.d) + arrn[2] + 1859775393, 3);
        this.d = p.a(this.d + p.c(this.a, this.b, this.c) + arrn[10] + 1859775393, 9);
        this.c = p.a(this.c + p.c(this.d, this.a, this.b) + arrn[6] + 1859775393, 11);
        this.b = p.a(this.b + p.c(this.c, this.d, this.a) + arrn[14] + 1859775393, 15);
        this.a = p.a(this.a + p.c(this.b, this.c, this.d) + arrn[1] + 1859775393, 3);
        this.d = p.a(this.d + p.c(this.a, this.b, this.c) + arrn[9] + 1859775393, 9);
        this.c = p.a(this.c + p.c(this.d, this.a, this.b) + arrn[5] + 1859775393, 11);
        this.b = p.a(this.b + p.c(this.c, this.d, this.a) + arrn[13] + 1859775393, 15);
        this.a = p.a(this.a + p.c(this.b, this.c, this.d) + arrn[3] + 1859775393, 3);
        this.d = p.a(this.d + p.c(this.a, this.b, this.c) + arrn[11] + 1859775393, 9);
        this.c = p.a(this.c + p.c(this.d, this.a, this.b) + arrn[7] + 1859775393, 11);
        this.b = p.a(this.b + p.c(this.c, this.d, this.a) + arrn[15] + 1859775393, 15);
    }
}

