/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b.a;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.compress.b.a.d;
import org.apache.commons.compress.b.a.e;
import org.apache.commons.compress.b.a.g;
import org.apache.commons.compress.b.a.h;

public class c
extends org.apache.commons.compress.b.c
implements e {
    public static final int a = 1;
    public static final int b = 9;
    private static final int m = 15;
    private static final int n = 0;
    private int o;
    private final int p;
    private int q;
    private int r;
    private final h s = new h();
    private int t;
    private int u;
    private int v = -1;
    private int w = 0;
    private int x;
    private int y;
    private final int z;
    private d A;
    private g B;
    private OutputStream C;

    private static void a(byte[] arrby, int[] arrn, d d2, int n2, int n3) {
        int[] arrn2 = d2.n;
        int[] arrn3 = d2.o;
        int[] arrn4 = d2.p;
        int n4 = n2;
        while (--n4 >= 0) {
            arrn3[n4 + 1] = (arrn[n4] == 0 ? 1 : arrn[n4]) << 8;
        }
        n4 = 1;
        while (n4 != 0) {
            int n5;
            int n6;
            int n7;
            int n8;
            n4 = 0;
            int n9 = n2;
            int n10 = 0;
            arrn2[0] = 0;
            arrn3[0] = 0;
            arrn4[0] = -2;
            for (n8 = 1; n8 <= n2; ++n8) {
                arrn4[n8] = -1;
                arrn2[n10] = n8;
                n7 = ++n10;
                n6 = arrn2[n7];
                while (arrn3[n6] < arrn3[arrn2[n7 >> 1]]) {
                    arrn2[n7] = arrn2[n7 >> 1];
                    n7 >>= 1;
                }
                arrn2[n7] = n6;
            }
            while (n10 > 1) {
                int n11;
                int n12;
                n8 = arrn2[1];
                arrn2[1] = arrn2[n10];
                n7 = 0;
                n6 = 1;
                n5 = arrn2[1];
                while ((n7 = n6 << 1) <= --n10) {
                    if (n7 < n10 && arrn3[arrn2[n7 + 1]] < arrn3[arrn2[n7]]) {
                        ++n7;
                    }
                    if (arrn3[n5] < arrn3[arrn2[n7]]) break;
                    arrn2[n6] = arrn2[n7];
                    n6 = n7;
                }
                arrn2[n6] = n5;
                int n13 = arrn2[1];
                arrn2[1] = arrn2[n10];
                n7 = 0;
                n6 = 1;
                n5 = arrn2[1];
                while ((n7 = n6 << 1) <= --n10) {
                    if (n7 < n10 && arrn3[arrn2[n7 + 1]] < arrn3[arrn2[n7]]) {
                        ++n7;
                    }
                    if (arrn3[n5] < arrn3[arrn2[n7]]) break;
                    arrn2[n6] = arrn2[n7];
                    n6 = n7;
                }
                arrn2[n6] = n5;
                arrn4[n8] = arrn4[n13] = ++n9;
                arrn3[n9] = (n12 & 0xFFFFFF00) + (n11 & 0xFFFFFF00) | 1 + (((n12 = arrn3[n8]) & 0xFF) > ((n11 = arrn3[n13]) & 0xFF) ? n12 & 0xFF : n11 & 0xFF);
                arrn4[n9] = -1;
                arrn2[++n10] = n9;
                n5 = 0;
                n6 = n10;
                n5 = arrn2[n6];
                int n14 = arrn3[n5];
                while (n14 < arrn3[arrn2[n6 >> 1]]) {
                    arrn2[n6] = arrn2[n6 >> 1];
                    n6 >>= 1;
                }
                arrn2[n6] = n5;
            }
            for (n8 = 1; n8 <= n2; ++n8) {
                n7 = 0;
                n6 = n8;
                while ((n5 = arrn4[n6]) >= 0) {
                    n6 = n5;
                    ++n7;
                }
                arrby[n8 - 1] = (byte)n7;
                if (n7 <= n3) continue;
                n4 = 1;
            }
            if (n4 == 0) continue;
            for (n8 = 1; n8 < n2; ++n8) {
                n7 = arrn3[n8] >> 8;
                n7 = 1 + (n7 >> 1);
                arrn3[n8] = n7 << 8;
            }
        }
    }

    public static int a(long l2) {
        return l2 > 0L ? (int)Math.min(l2 / 132000L + 1L, 9L) : 9;
    }

    public c(OutputStream outputStream) {
        this(outputStream, 9);
    }

    public c(OutputStream outputStream, int n2) {
        if (n2 < 1) {
            throw new IllegalArgumentException("blockSize(" + n2 + ") < 1");
        }
        if (n2 > 9) {
            throw new IllegalArgumentException("blockSize(" + n2 + ") > 9");
        }
        this.p = n2;
        this.C = outputStream;
        this.z = this.p * 100000 - 20;
        this.d();
    }

    public void write(int n2) {
        if (this.C == null) {
            throw new IOException("closed");
        }
        this.a(n2);
    }

    private void c() {
        int n2 = this.o;
        if (n2 < this.z) {
            int n3 = this.v;
            d d2 = this.A;
            d2.a[n3] = true;
            byte by2 = (byte)n3;
            int n4 = this.w;
            this.s.a(n3, n4);
            switch (n4) {
                case 1: {
                    d2.q[n2 + 2] = by2;
                    this.o = n2 + 1;
                    break;
                }
                case 2: {
                    d2.q[n2 + 2] = by2;
                    d2.q[n2 + 3] = by2;
                    this.o = n2 + 2;
                    break;
                }
                case 3: {
                    byte[] arrby = d2.q;
                    arrby[n2 + 2] = by2;
                    arrby[n2 + 3] = by2;
                    arrby[n2 + 4] = by2;
                    this.o = n2 + 3;
                    break;
                }
                default: {
                    d2.a[n4 -= 4] = true;
                    byte[] arrby = d2.q;
                    arrby[n2 + 2] = by2;
                    arrby[n2 + 3] = by2;
                    arrby[n2 + 4] = by2;
                    arrby[n2 + 5] = by2;
                    arrby[n2 + 6] = (byte)n4;
                    this.o = n2 + 5;
                    break;
                }
            }
        } else {
            this.f();
            this.e();
            this.c();
        }
    }

    protected void finalize() {
        this.a();
        super.finalize();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a() {
        if (this.C != null) {
            try {
                if (this.w > 0) {
                    this.c();
                }
                this.v = -1;
                this.f();
                this.g();
            }
            finally {
                this.C = null;
                this.A = null;
                this.B = null;
            }
        }
    }

    public void close() {
        if (this.C != null) {
            OutputStream outputStream = this.C;
            this.a();
            outputStream.close();
        }
    }

    public void flush() {
        OutputStream outputStream = this.C;
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    private void d() {
        this.b(66);
        this.b(90);
        this.A = new d(this.p);
        this.B = new g(this.A);
        this.b(104);
        this.b(48 + this.p);
        this.y = 0;
        this.e();
    }

    private void e() {
        this.s.a();
        this.o = -1;
        boolean[] arrbl = this.A.a;
        int n2 = 256;
        while (--n2 >= 0) {
            arrbl[n2] = false;
        }
    }

    private void f() {
        this.x = this.s.b();
        this.y = this.y << 1 | this.y >>> 31;
        this.y ^= this.x;
        if (this.o == -1) {
            return;
        }
        this.m();
        this.b(49);
        this.b(65);
        this.b(89);
        this.b(38);
        this.b(83);
        this.b(89);
        this.c(this.x);
        this.a(1, 0);
        this.l();
    }

    private void g() {
        this.b(23);
        this.b(114);
        this.b(69);
        this.b(56);
        this.b(80);
        this.b(144);
        this.c(this.y);
        this.h();
    }

    public final int b() {
        return this.p;
    }

    public void write(byte[] arrby, int n2, int n3) {
        if (n2 < 0) {
            throw new IndexOutOfBoundsException("offs(" + n2 + ") < 0.");
        }
        if (n3 < 0) {
            throw new IndexOutOfBoundsException("len(" + n3 + ") < 0.");
        }
        if (n2 + n3 > arrby.length) {
            throw new IndexOutOfBoundsException("offs(" + n2 + ") + len(" + n3 + ") > buf.length(" + arrby.length + ").");
        }
        if (this.C == null) {
            throw new IOException("stream closed");
        }
        int n4 = n2 + n3;
        while (n2 < n4) {
            this.a(arrby[n2++]);
        }
    }

    private void a(int n2) {
        if (this.v != -1) {
            if (this.v == (n2 &= 0xFF)) {
                if (++this.w > 254) {
                    this.c();
                    this.v = -1;
                    this.w = 0;
                }
            } else {
                this.c();
                this.w = 1;
                this.v = n2;
            }
        } else {
            this.v = n2 & 0xFF;
            ++this.w;
        }
    }

    private static void a(int[] arrn, byte[] arrby, int n2, int n3, int n4) {
        int n5 = 0;
        for (int i2 = n2; i2 <= n3; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                if ((arrby[i3] & 0xFF) != i2) continue;
                arrn[i3] = n5++;
            }
            n5 <<= 1;
        }
    }

    private void h() {
        while (this.r > 0) {
            int n2 = this.q >> 24;
            this.C.write(n2);
            this.q <<= 8;
            this.r -= 8;
        }
    }

    private void a(int n2, int n3) {
        int n4;
        OutputStream outputStream = this.C;
        int n5 = this.q;
        for (n4 = this.r; n4 >= 8; n4 -= 8) {
            outputStream.write(n5 >> 24);
            n5 <<= 8;
        }
        this.q = n5 | n3 << 32 - n4 - n2;
        this.r = n4 + n2;
    }

    private void b(int n2) {
        this.a(8, n2);
    }

    private void c(int n2) {
        this.a(8, n2 >> 24 & 0xFF);
        this.a(8, n2 >> 16 & 0xFF);
        this.a(8, n2 >> 8 & 0xFF);
        this.a(8, n2 & 0xFF);
    }

    private void i() {
        byte[][] arrby = this.A.g;
        int n2 = this.t + 2;
        int n3 = 6;
        while (--n3 >= 0) {
            byte[] arrby2 = arrby[n3];
            int n4 = n2;
            while (--n4 >= 0) {
                arrby2[n4] = 15;
            }
        }
        n3 = this.u < 200 ? 2 : (this.u < 600 ? 3 : (this.u < 1200 ? 4 : (this.u < 2400 ? 5 : 6)));
        this.b(n3, n2);
        int n5 = this.c(n3, n2);
        this.d(n3, n5);
        this.e(n3, n2);
        this.j();
        this.f(n3, n5);
        this.g(n3, n2);
        this.k();
    }

    private void b(int n2, int n3) {
        byte[][] arrby = this.A.g;
        int[] arrn = this.A.c;
        int n4 = this.u;
        int n5 = 0;
        for (int i2 = n2; i2 > 0; --i2) {
            int n6;
            int n7 = n4 / i2;
            int n8 = n5 - 1;
            int n9 = n3 - 1;
            for (n6 = 0; n6 < n7 && n8 < n9; n6 += arrn[++n8]) {
            }
            if (n8 > n5 && i2 != n2 && i2 != 1 && (n2 - i2 & 1) != 0) {
                n6 -= arrn[n8--];
            }
            byte[] arrby2 = arrby[i2 - 1];
            int n10 = n3;
            while (--n10 >= 0) {
                if (n10 >= n5 && n10 <= n8) {
                    arrby2[n10] = 0;
                    continue;
                }
                arrby2[n10] = 15;
            }
            n5 = n8 + 1;
            n4 -= n6;
        }
    }

    private int c(int n2, int n3) {
        d d2 = this.A;
        int[][] arrn = d2.h;
        int[] arrn2 = d2.i;
        short[] arrs = d2.j;
        char[] arrc = d2.s;
        byte[] arrby = d2.d;
        byte[][] arrby2 = d2.g;
        byte[] arrby3 = arrby2[0];
        byte[] arrby4 = arrby2[1];
        byte[] arrby5 = arrby2[2];
        byte[] arrby6 = arrby2[3];
        byte[] arrby7 = arrby2[4];
        byte[] arrby8 = arrby2[5];
        int n4 = this.u;
        int n5 = 0;
        for (int i2 = 0; i2 < 4; ++i2) {
            int n6;
            int n7 = n2;
            while (--n7 >= 0) {
                arrn2[n7] = 0;
                int[] arrn3 = arrn[n7];
                n6 = n3;
                while (--n6 >= 0) {
                    arrn3[n6] = 0;
                }
            }
            n5 = 0;
            n7 = 0;
            while (n7 < this.u) {
                int n8;
                int n9;
                int n10;
                int n11 = Math.min(n7 + 50 - 1, n4 - 1);
                if (n2 == 6) {
                    n6 = 0;
                    n10 = 0;
                    n9 = 0;
                    n8 = 0;
                    short s2 = 0;
                    short s3 = 0;
                    for (int i3 = n7; i3 <= n11; ++i3) {
                        char c2 = arrc[i3];
                        n6 = (short)(n6 + (arrby3[c2] & 0xFF));
                        n10 = (short)(n10 + (arrby4[c2] & 0xFF));
                        n9 = (short)(n9 + (arrby5[c2] & 0xFF));
                        n8 = (short)(n8 + (arrby6[c2] & 0xFF));
                        s2 = (short)(s2 + (arrby7[c2] & 0xFF));
                        s3 = (short)(s3 + (arrby8[c2] & 0xFF));
                    }
                    arrs[0] = n6;
                    arrs[1] = n10;
                    arrs[2] = n9;
                    arrs[3] = n8;
                    arrs[4] = s2;
                    arrs[5] = s3;
                } else {
                    n6 = n2;
                    while (--n6 >= 0) {
                        arrs[n6] = 0;
                    }
                    for (n6 = n7; n6 <= n11; ++n6) {
                        char c3 = arrc[n6];
                        n9 = n2;
                        while (--n9 >= 0) {
                            int n12 = n9;
                            arrs[n12] = (short)(arrs[n12] + (arrby2[n9][c3] & 0xFF));
                        }
                    }
                }
                n6 = -1;
                n10 = n2;
                n9 = 999999999;
                while (--n10 >= 0) {
                    n8 = arrs[n10];
                    if (n8 >= n9) continue;
                    n9 = n8;
                    n6 = n10;
                }
                int n13 = n6;
                arrn2[n13] = arrn2[n13] + 1;
                arrby[n5] = (byte)n6;
                ++n5;
                int[] arrn4 = arrn[n6];
                for (n9 = n7; n9 <= n11; ++n9) {
                    char c4 = arrc[n9];
                    arrn4[c4] = arrn4[c4] + 1;
                }
                n7 = n11 + 1;
            }
            for (n7 = 0; n7 < n2; ++n7) {
                c.a(arrby2[n7], arrn[n7], this.A, n3, 20);
            }
        }
        return n5;
    }

    private void d(int n2, int n3) {
        d d2 = this.A;
        byte[] arrby = d2.l;
        int n4 = n2;
        while (--n4 >= 0) {
            arrby[n4] = (byte)n4;
        }
        for (n4 = 0; n4 < n3; ++n4) {
            byte by2 = d2.d[n4];
            byte by3 = arrby[0];
            int n5 = 0;
            while (by2 != by3) {
                byte by4 = by3;
                by3 = arrby[++n5];
                arrby[n5] = by4;
            }
            arrby[0] = by3;
            d2.e[n4] = (byte)n5;
        }
    }

    private void e(int n2, int n3) {
        int[][] arrn = this.A.k;
        byte[][] arrby = this.A.g;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4 = 32;
            int n5 = 0;
            byte[] arrby2 = arrby[i2];
            int n6 = n3;
            while (--n6 >= 0) {
                int n7 = arrby2[n6] & 0xFF;
                if (n7 > n5) {
                    n5 = n7;
                }
                if (n7 >= n4) continue;
                n4 = n7;
            }
            c.a(arrn[i2], arrby[i2], n4, n5, n3);
        }
    }

    private void j() {
        int n2;
        int n3;
        boolean[] arrbl = this.A.a;
        boolean[] arrbl2 = this.A.m;
        int n4 = 16;
        while (--n4 >= 0) {
            arrbl2[n4] = false;
            n3 = n4 * 16;
            n2 = 16;
            while (--n2 >= 0) {
                if (!arrbl[n3 + n2]) continue;
                arrbl2[n4] = true;
            }
        }
        for (n4 = 0; n4 < 16; ++n4) {
            this.a(1, arrbl2[n4] ? 1 : 0);
        }
        OutputStream outputStream = this.C;
        n3 = this.r;
        n2 = this.q;
        for (int i2 = 0; i2 < 16; ++i2) {
            if (!arrbl2[i2]) continue;
            int n5 = i2 * 16;
            for (int i3 = 0; i3 < 16; ++i3) {
                while (n3 >= 8) {
                    outputStream.write(n2 >> 24);
                    n2 <<= 8;
                    n3 -= 8;
                }
                if (arrbl[n5 + i3]) {
                    n2 |= 1 << 32 - n3 - 1;
                }
                ++n3;
            }
        }
        this.q = n2;
        this.r = n3;
    }

    private void f(int n2, int n3) {
        this.a(3, n2);
        this.a(15, n3);
        OutputStream outputStream = this.C;
        byte[] arrby = this.A.e;
        int n4 = this.r;
        int n5 = this.q;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n6 = arrby[i2] & 0xFF;
            for (int i3 = 0; i3 < n6; ++i3) {
                while (n4 >= 8) {
                    outputStream.write(n5 >> 24);
                    n5 <<= 8;
                    n4 -= 8;
                }
                n5 |= 1 << 32 - n4 - 1;
                ++n4;
            }
            while (n4 >= 8) {
                outputStream.write(n5 >> 24);
                n5 <<= 8;
                n4 -= 8;
            }
            ++n4;
        }
        this.q = n5;
        this.r = n4;
    }

    private void g(int n2, int n3) {
        byte[][] arrby = this.A.g;
        OutputStream outputStream = this.C;
        int n4 = this.r;
        int n5 = this.q;
        for (int i2 = 0; i2 < n2; ++i2) {
            byte[] arrby2 = arrby[i2];
            int n6 = arrby2[0] & 0xFF;
            while (n4 >= 8) {
                outputStream.write(n5 >> 24);
                n5 <<= 8;
                n4 -= 8;
            }
            n5 |= n6 << 32 - n4 - 5;
            n4 += 5;
            for (int i3 = 0; i3 < n3; ++i3) {
                int n7 = arrby2[i3] & 0xFF;
                while (n6 < n7) {
                    while (n4 >= 8) {
                        outputStream.write(n5 >> 24);
                        n5 <<= 8;
                        n4 -= 8;
                    }
                    n5 |= 2 << 32 - n4 - 2;
                    n4 += 2;
                    ++n6;
                }
                while (n6 > n7) {
                    while (n4 >= 8) {
                        outputStream.write(n5 >> 24);
                        n5 <<= 8;
                        n4 -= 8;
                    }
                    n5 |= 3 << 32 - n4 - 2;
                    n4 += 2;
                    --n6;
                }
                while (n4 >= 8) {
                    outputStream.write(n5 >> 24);
                    n5 <<= 8;
                    n4 -= 8;
                }
                ++n4;
            }
        }
        this.q = n5;
        this.r = n4;
    }

    private void k() {
        d d2 = this.A;
        byte[][] arrby = d2.g;
        int[][] arrn = d2.k;
        OutputStream outputStream = this.C;
        byte[] arrby2 = d2.d;
        char[] arrc = d2.s;
        int n2 = this.u;
        int n3 = 0;
        int n4 = this.r;
        int n5 = this.q;
        int n6 = 0;
        while (n6 < n2) {
            int n7 = Math.min(n6 + 50 - 1, n2 - 1);
            int n8 = arrby2[n3] & 0xFF;
            int[] arrn2 = arrn[n8];
            byte[] arrby3 = arrby[n8];
            while (n6 <= n7) {
                char c2 = arrc[n6];
                while (n4 >= 8) {
                    outputStream.write(n5 >> 24);
                    n5 <<= 8;
                    n4 -= 8;
                }
                int n9 = arrby3[c2] & 0xFF;
                n5 |= arrn2[c2] << 32 - n4 - n9;
                n4 += n9;
                ++n6;
            }
            n6 = n7 + 1;
            ++n3;
        }
        this.q = n5;
        this.r = n4;
    }

    private void l() {
        this.a(24, this.A.t);
        this.n();
        this.i();
    }

    private void m() {
        this.B.a(this.A, this.o);
    }

    private void n() {
        int n2;
        int n3;
        int n4 = this.o;
        d d2 = this.A;
        boolean[] arrbl = d2.a;
        byte[] arrby = d2.q;
        int[] arrn = d2.r;
        char[] arrc = d2.s;
        int[] arrn2 = d2.c;
        byte[] arrby2 = d2.b;
        byte[] arrby3 = d2.f;
        int n5 = 0;
        for (n3 = 0; n3 < 256; ++n3) {
            if (!arrbl[n3]) continue;
            arrby2[n3] = (byte)n5;
            ++n5;
        }
        this.t = n5;
        for (n2 = n3 = n5 + 1; n2 >= 0; --n2) {
            arrn2[n2] = 0;
        }
        n2 = n5;
        while (--n2 >= 0) {
            arrby3[n2] = (byte)n2;
        }
        n2 = 0;
        int n6 = 0;
        for (int i2 = 0; i2 <= n4; ++i2) {
            byte by2 = arrby2[arrby[arrn[i2]] & 0xFF];
            byte by3 = arrby3[0];
            int n7 = 0;
            while (by2 != by3) {
                byte by4 = by3;
                by3 = arrby3[++n7];
                arrby3[n7] = by4;
            }
            arrby3[0] = by3;
            if (n7 == 0) {
                ++n6;
                continue;
            }
            if (n6 > 0) {
                --n6;
                while (true) {
                    if ((n6 & 1) == 0) {
                        arrc[n2] = '\u0000';
                        ++n2;
                        arrn2[0] = arrn2[0] + 1;
                    } else {
                        arrc[n2] = '\u0001';
                        ++n2;
                        arrn2[1] = arrn2[1] + 1;
                    }
                    if (n6 < 2) break;
                    n6 = n6 - 2 >> 1;
                }
                n6 = 0;
            }
            arrc[n2] = (char)(n7 + 1);
            ++n2;
            int n8 = n7 + 1;
            arrn2[n8] = arrn2[n8] + 1;
        }
        if (n6 > 0) {
            --n6;
            while (true) {
                if ((n6 & 1) == 0) {
                    arrc[n2] = '\u0000';
                    ++n2;
                    arrn2[0] = arrn2[0] + 1;
                } else {
                    arrc[n2] = '\u0001';
                    ++n2;
                    arrn2[1] = arrn2[1] + 1;
                }
                if (n6 < 2) break;
                n6 = n6 - 2 >> 1;
            }
        }
        arrc[n2] = (char)n3;
        int n9 = n3;
        arrn2[n9] = arrn2[n9] + 1;
        this.u = n2 + 1;
    }
}

