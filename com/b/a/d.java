/*
 * Decompiled with CFR 0.150.
 */
package com.b.a;

import com.b.a.b;
import com.b.a.c;

public class d {
    byte[] a;
    int b;
    int c;
    private int r;
    int[] d;
    long[] e;
    int f;
    int g;
    int h;
    int i;
    byte[] j = new byte[282];
    int k;
    public int l;
    int m;
    int n;
    int o;
    long p;
    long q;

    public d() {
        this.a();
    }

    d(int n2) {
        this();
        this.a(n2);
    }

    void a() {
        this.b = 16384;
        this.a = new byte[this.b];
        this.f = 1024;
        this.d = new int[this.f];
        this.e = new long[this.f];
    }

    public void a(int n2) {
        if (this.a == null) {
            this.a();
        } else {
            int n3;
            for (n3 = 0; n3 < this.a.length; ++n3) {
                this.a[n3] = 0;
            }
            for (n3 = 0; n3 < this.d.length; ++n3) {
                this.d[n3] = 0;
            }
            for (n3 = 0; n3 < this.e.length; ++n3) {
                this.e[n3] = 0L;
            }
        }
        this.n = n2;
    }

    public void b() {
        this.a = null;
        this.d = null;
        this.e = null;
    }

    void c() {
        this.b();
    }

    void b(int n2) {
        if (this.b <= this.c + n2) {
            this.b += n2 + 1024;
            byte[] arrby = new byte[this.b];
            System.arraycopy(this.a, 0, arrby, 0, this.a.length);
            this.a = arrby;
        }
    }

    void c(int n2) {
        if (this.f <= this.g + n2) {
            this.f += n2 + 32;
            int[] arrn = new int[this.f];
            System.arraycopy(this.d, 0, arrn, 0, this.d.length);
            this.d = arrn;
            long[] arrl = new long[this.f];
            System.arraycopy(this.e, 0, arrl, 0, this.e.length);
            this.e = arrl;
        }
    }

    public int a(b b2) {
        int n2 = b2.c / 255 + 1;
        if (this.r != 0) {
            this.c -= this.r;
            if (this.c != 0) {
                System.arraycopy(this.a, this.r, this.a, 0, this.c);
            }
            this.r = 0;
        }
        this.b(b2.c);
        this.c(n2);
        System.arraycopy(b2.a, b2.b, this.a, this.c, b2.c);
        this.c += b2.c;
        for (int i2 = 0; i2 < n2 - 1; ++i2) {
            this.d[this.g + i2] = 255;
            this.e[this.g + i2] = this.q;
        }
        this.d[this.g + i2] = b2.c % 255;
        long l2 = b2.f;
        this.e[this.g + i2] = l2;
        this.q = l2;
        int n3 = this.g;
        this.d[n3] = this.d[n3] | 0x100;
        this.g += n2;
        ++this.p;
        if (b2.e != 0) {
            this.l = 1;
        }
        return 0;
    }

    public int b(b b2) {
        int n2;
        if (this.h <= (n2 = this.i++)) {
            return 0;
        }
        if ((this.d[n2] & 0x400) != 0) {
            ++this.p;
            return -1;
        }
        int n3 = this.d[n2] & 0xFF;
        int n4 = 0;
        b2.a = this.a;
        b2.b = this.r;
        b2.e = this.d[n2] & 0x200;
        b2.d = this.d[n2] & 0x100;
        n4 += n3;
        while (n3 == 255) {
            int n5 = this.d[++n2];
            n3 = n5 & 0xFF;
            if ((n5 & 0x200) != 0) {
                b2.e = 512;
            }
            n4 += n3;
        }
        b2.g = this.p++;
        b2.f = this.e[n2];
        b2.c = n4;
        this.r += n4;
        this.i = n2 + 1;
        return 1;
    }

    public int a(c c2) {
        byte[] arrby = c2.a;
        int n2 = c2.b;
        byte[] arrby2 = c2.d;
        int n3 = c2.e;
        int n4 = c2.f;
        int n5 = 0;
        int n6 = c2.a();
        int n7 = c2.b();
        int n8 = c2.c();
        int n9 = c2.d();
        long l2 = c2.e();
        int n10 = c2.f();
        int n11 = c2.g();
        int n12 = arrby[n2 + 26] & 0xFF;
        int n13 = this.i;
        int n14 = this.r;
        if (n14 != 0) {
            this.c -= n14;
            if (this.c != 0) {
                System.arraycopy(this.a, n14, this.a, 0, this.c);
            }
            this.r = 0;
        }
        if (n13 != 0) {
            if (this.g - n13 != 0) {
                System.arraycopy(this.d, n13, this.d, 0, this.g - n13);
                System.arraycopy(this.e, n13, this.e, 0, this.g - n13);
            }
            this.g -= n13;
            this.h -= n13;
            this.i = 0;
        }
        if (n10 != this.n) {
            return -1;
        }
        if (n6 > 0) {
            return -1;
        }
        this.c(n12 + 1);
        if (n11 != this.o) {
            for (n13 = this.h; n13 < this.g; ++n13) {
                this.c -= this.d[n13] & 0xFF;
            }
            this.g = this.h++;
            if (this.o != -1) {
                this.d[this.g++] = 1024;
            }
            if (n7 != 0) {
                n8 = 0;
                while (n5 < n12) {
                    n14 = arrby[n2 + 27 + n5] & 0xFF;
                    n3 += n14;
                    n4 -= n14;
                    if (n14 < 255) {
                        ++n5;
                        break;
                    }
                    ++n5;
                }
            }
        }
        if (n4 != 0) {
            this.b(n4);
            System.arraycopy(arrby2, n3, this.a, this.c, n4);
            this.c += n4;
        }
        n13 = -1;
        while (n5 < n12) {
            this.d[this.g] = n14 = arrby[n2 + 27 + n5] & 0xFF;
            this.e[this.g] = -1L;
            if (n8 != 0) {
                int n15 = this.g;
                this.d[n15] = this.d[n15] | 0x100;
                n8 = 0;
            }
            if (n14 < 255) {
                n13 = this.g;
            }
            ++this.g;
            ++n5;
            if (n14 >= 255) continue;
            this.h = this.g;
        }
        if (n13 != -1) {
            this.e[n13] = l2;
        }
        if (n9 != 0) {
            this.l = 1;
            if (this.g > 0) {
                int n16 = this.g - 1;
                this.d[n16] = this.d[n16] | 0x200;
            }
        }
        this.o = n11 + 1;
        return 0;
    }

    public int b(c c2) {
        int n2;
        int n3 = 0;
        int n4 = this.g > 255 ? 255 : this.g;
        int n5 = 0;
        int n6 = 0;
        long l2 = this.e[0];
        if (n4 == 0) {
            return 0;
        }
        if (this.m == 0) {
            l2 = 0L;
            for (n3 = 0; n3 < n4; ++n3) {
                if ((this.d[n3] & 0xFF) >= 255) continue;
                ++n3;
                break;
            }
        } else {
            for (n3 = 0; n3 < n4 && n6 <= 4096; n6 += this.d[n3] & 0xFF, ++n3) {
                l2 = this.e[n3];
            }
        }
        System.arraycopy("OggS".getBytes(), 0, this.j, 0, 4);
        this.j[4] = 0;
        this.j[5] = 0;
        if ((this.d[0] & 0x100) == 0) {
            this.j[5] = (byte)(this.j[5] | 1);
        }
        if (this.m == 0) {
            this.j[5] = (byte)(this.j[5] | 2);
        }
        if (this.l != 0 && this.g == n3) {
            this.j[5] = (byte)(this.j[5] | 4);
        }
        this.m = 1;
        for (n2 = 6; n2 < 14; ++n2) {
            this.j[n2] = (byte)l2;
            l2 >>>= 8;
        }
        int n7 = this.n;
        for (n2 = 14; n2 < 18; ++n2) {
            this.j[n2] = (byte)n7;
            n7 >>>= 8;
        }
        if (this.o == -1) {
            this.o = 0;
        }
        n7 = this.o++;
        for (n2 = 18; n2 < 22; ++n2) {
            this.j[n2] = (byte)n7;
            n7 >>>= 8;
        }
        this.j[22] = 0;
        this.j[23] = 0;
        this.j[24] = 0;
        this.j[25] = 0;
        this.j[26] = (byte)n3;
        for (n2 = 0; n2 < n3; ++n2) {
            this.j[n2 + 27] = (byte)this.d[n2];
            n5 += this.j[n2 + 27] & 0xFF;
        }
        c2.a = this.j;
        c2.b = 0;
        c2.c = this.k = n3 + 27;
        c2.d = this.a;
        c2.e = this.r;
        c2.f = n5;
        this.g -= n3;
        System.arraycopy(this.d, n3, this.d, 0, this.g * 4);
        System.arraycopy(this.e, n3, this.e, 0, this.g * 8);
        this.r += n5;
        c2.h();
        return 1;
    }

    public int c(c c2) {
        if (this.l != 0 && this.g != 0 || this.c - this.r > 4096 || this.g >= 255 || this.g != 0 && this.m == 0) {
            return this.b(c2);
        }
        return 0;
    }

    public int d() {
        return this.l;
    }

    public int e() {
        this.c = 0;
        this.r = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.o = -1;
        this.p = 0L;
        this.q = 0L;
        return 0;
    }
}

