/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

public final class ix {
    private char[] a = new char[8];
    private int b;
    private int c;
    private int d;

    public final boolean a(char[] arrc, int n2) {
        this.a = null;
        this.d = 0;
        this.c = 0;
        this.b = 0;
        this.d = arrc[n2++];
        if ((this.d & 0x8000) > 0) {
            this.d &= 0x7FFF;
            if (arrc.length < n2 + 1 + this.d) {
                this.d = 0;
                throw new IndexOutOfBoundsException();
            }
            this.c = arrc[n2++];
        } else {
            if (arrc.length < n2 + this.d) {
                this.d = 0;
                throw new IndexOutOfBoundsException();
            }
            this.c = this.d;
        }
        this.a = new char[this.d];
        System.arraycopy(arrc, n2, this.a, 0, this.d);
        return true;
    }

    public final void a(int n2) {
        if (0x10FFFF < n2) {
            return;
        }
        if (n2 < 65535) {
            this.d = 2;
            this.c = 2;
            this.a[0] = (char)n2;
            this.a[1] = (char)(n2 + 1);
        } else if (n2 == 65535) {
            this.c = 1;
            this.d = 3;
            this.a[0] = 65535;
            this.a[1] = '\u0001';
            this.a[2] = '\u0000';
        } else if (n2 < 0x10FFFF) {
            this.c = 0;
            this.d = 4;
            this.a[0] = (char)(n2 >> 16);
            this.a[1] = (char)n2;
            this.a[2] = (char)(++n2 >> 16);
            this.a[3] = (char)n2;
        } else {
            this.c = 0;
            this.d = 2;
            this.a[0] = 16;
            this.a[1] = 65535;
        }
    }

    public final boolean a(int n2, int[] arrn) {
        if (n2 < 0) {
            return false;
        }
        if (this.a == null) {
            this.a = new char[8];
        }
        if (arrn == null || arrn.length < 2) {
            throw new IllegalArgumentException();
        }
        if ((n2 *= 2) < this.c) {
            arrn[0] = this.a[n2++];
            arrn[1] = n2 < this.c ? this.a[n2] - '\u0001' : (n2 < this.d ? (this.a[n2] << 16 | this.a[n2 + 1]) - 1 : 0x10FFFF);
            return true;
        }
        n2 -= this.c;
        int n3 = this.d - this.c;
        if ((n2 *= 2) < n3) {
            int n4 = this.b + this.c;
            arrn[0] = this.a[n4 + n2] << 16 | this.a[n4 + n2 + 1];
            arrn[1] = (n2 += 2) < n3 ? (this.a[n4 + n2] << 16 | this.a[n4 + n2 + 1]) - 1 : 0x10FFFF;
            return true;
        }
        return false;
    }

    public final boolean b(int n2) {
        int n3;
        if (n2 > 0x10FFFF) {
            return false;
        }
        if (n2 <= 65535) {
            int n4;
            for (n4 = 0; n4 < this.c && (char)n2 >= this.a[n4]; ++n4) {
            }
            return (n4 & 1) != 0;
        }
        char c2 = (char)(n2 >> 16);
        char c3 = (char)n2;
        for (n3 = this.c; n3 < this.d && (c2 > this.a[n3] || c2 == this.a[n3] && c3 >= this.a[n3 + 1]); n3 += 2) {
        }
        return (n3 + this.c & 2) != 0;
    }

    public final int a() {
        return (this.c + (this.d - this.c) / 2 + 1) / 2;
    }
}

