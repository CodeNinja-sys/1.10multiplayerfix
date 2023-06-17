/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b.a;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.b.a.e;
import org.apache.commons.compress.b.a.h;
import org.apache.commons.compress.b.a.i;
import org.apache.commons.compress.b.b;

public class a
extends b
implements e {
    private int a;
    private int b;
    private int m;
    private boolean n;
    private int o;
    private int p;
    private final h q = new h();
    private int r;
    private InputStream s;
    private final boolean t;
    private static final int u = 0;
    private static final int v = 1;
    private static final int w = 2;
    private static final int x = 3;
    private static final int y = 4;
    private static final int z = 5;
    private static final int A = 6;
    private static final int B = 7;
    private int C = 1;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private char P;
    private org.apache.commons.compress.b.a.b Q;

    public a(InputStream inputStream) {
        this(inputStream, false);
    }

    public a(InputStream inputStream, boolean bl2) {
        this.s = inputStream;
        this.t = bl2;
        this.a(true);
        this.e();
    }

    public int read() {
        if (this.s != null) {
            int n2 = this.d();
            this.a(n2 < 0 ? -1 : 1);
            return n2;
        }
        throw new IOException("stream closed");
    }

    public int read(byte[] arrby, int n2, int n3) {
        int n4;
        if (n2 < 0) {
            throw new IndexOutOfBoundsException("offs(" + n2 + ") < 0.");
        }
        if (n3 < 0) {
            throw new IndexOutOfBoundsException("len(" + n3 + ") < 0.");
        }
        if (n2 + n3 > arrby.length) {
            throw new IndexOutOfBoundsException("offs(" + n2 + ") + len(" + n3 + ") > dest.length(" + arrby.length + ").");
        }
        if (this.s == null) {
            throw new IOException("stream closed");
        }
        int n5 = n2 + n3;
        int n6 = n2;
        while (n6 < n5 && (n4 = this.d()) >= 0) {
            arrby[n6++] = (byte)n4;
            this.a(1);
        }
        int n7 = n6 == n2 ? -1 : n6 - n2;
        return n7;
    }

    private void a() {
        boolean[] arrbl = this.Q.a;
        byte[] arrby = this.Q.b;
        int n2 = 0;
        for (int i2 = 0; i2 < 256; ++i2) {
            if (!arrbl[i2]) continue;
            arrby[n2++] = (byte)i2;
        }
        this.r = n2;
    }

    private int d() {
        switch (this.C) {
            case 0: {
                return -1;
            }
            case 1: {
                return this.m();
            }
            case 2: {
                throw new IllegalStateException();
            }
            case 3: {
                return this.p();
            }
            case 4: {
                return this.q();
            }
            case 5: {
                throw new IllegalStateException();
            }
            case 6: {
                return this.r();
            }
            case 7: {
                return this.s();
            }
        }
        throw new IllegalStateException();
    }

    private boolean a(boolean bl2) {
        if (null == this.s) {
            throw new IOException("No InputStream");
        }
        int n2 = this.s.read();
        if (n2 == -1 && !bl2) {
            return false;
        }
        int n3 = this.s.read();
        int n4 = this.s.read();
        if (n2 != 66 || n3 != 90 || n4 != 104) {
            throw new IOException(bl2 ? "Stream is not in the BZip2 format" : "Garbage after a valid BZip2 stream");
        }
        int n5 = this.s.read();
        if (n5 < 49 || n5 > 57) {
            throw new IOException("BZip2 block size is invalid");
        }
        this.m = n5 - 48;
        this.p = 0;
        this.G = 0;
        return true;
    }

    private void e() {
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        block3: {
            do {
                c7 = this.i();
                c6 = this.i();
                c5 = this.i();
                c4 = this.i();
                c3 = this.i();
                c2 = this.i();
                if (c7 != '\u0017' || c6 != 'r' || c5 != 'E' || c4 != '8' || c3 != 'P' || c2 != '\u0090') break block3;
            } while (!this.g());
            return;
        }
        if (c7 != '1' || c6 != 'A' || c5 != 'Y' || c4 != '&' || c3 != 'S' || c2 != 'Y') {
            this.C = 0;
            throw new IOException("bad block header");
        }
        this.D = this.j();
        boolean bl2 = this.n = this.b(1) == 1;
        if (this.Q == null) {
            this.Q = new org.apache.commons.compress.b.a.b(this.m);
        }
        this.l();
        this.q.a();
        this.C = 1;
    }

    private void f() {
        this.F = this.q.b();
        if (this.D != this.F) {
            this.G = this.E << 1 | this.E >>> 31;
            this.G ^= this.D;
            throw new IOException("BZip2 CRC error");
        }
        this.G = this.G << 1 | this.G >>> 31;
        this.G ^= this.F;
    }

    private boolean g() {
        this.E = this.j();
        this.C = 0;
        this.Q = null;
        if (this.E != this.G) {
            throw new IOException("BZip2 CRC error");
        }
        return !this.t || !this.a(false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void close() {
        InputStream inputStream = this.s;
        if (inputStream != null) {
            try {
                if (inputStream != System.in) {
                    inputStream.close();
                }
            }
            finally {
                this.Q = null;
                this.s = null;
            }
        }
    }

    private int b(int n2) {
        int n3 = this.p;
        int n4 = this.o;
        if (n3 < n2) {
            InputStream inputStream = this.s;
            do {
                int n5;
                if ((n5 = inputStream.read()) < 0) {
                    throw new IOException("unexpected end of stream");
                }
                n4 = n4 << 8 | n5;
            } while ((n3 += 8) < n2);
            this.o = n4;
        }
        this.p = n3 - n2;
        return n4 >> n3 - n2 & (1 << n2) - 1;
    }

    private boolean h() {
        int n2 = this.p;
        int n3 = this.o;
        if (n2 < 1) {
            int n4 = this.s.read();
            if (n4 < 0) {
                throw new IOException("unexpected end of stream");
            }
            n3 = n3 << 8 | n4;
            n2 += 8;
            this.o = n3;
        }
        this.p = n2 - 1;
        return (n3 >> n2 - 1 & 1) != 0;
    }

    private char i() {
        return (char)this.b(8);
    }

    private int j() {
        return ((this.b(8) << 8 | this.b(8)) << 8 | this.b(8)) << 8 | this.b(8);
    }

    private static void a(int[] arrn, int[] arrn2, int[] arrn3, char[] arrc, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7 = 0;
        for (n6 = n2; n6 <= n3; ++n6) {
            for (n5 = 0; n5 < n4; ++n5) {
                if (arrc[n5] != n6) continue;
                arrn3[n7++] = n5;
            }
        }
        n6 = 23;
        while (--n6 > 0) {
            arrn2[n6] = 0;
            arrn[n6] = 0;
        }
        for (n6 = 0; n6 < n4; ++n6) {
            int n8 = arrc[n6] + '\u0001';
            arrn2[n8] = arrn2[n8] + 1;
        }
        n7 = arrn2[0];
        for (n6 = 1; n6 < 23; ++n6) {
            arrn2[n6] = n7 += arrn2[n6];
        }
        n7 = 0;
        n5 = arrn2[n6];
        for (n6 = n2; n6 <= n3; ++n6) {
            int n9 = arrn2[n6 + 1];
            n5 = n9;
            arrn[n6] = (n7 += n9 - n5) - 1;
            n7 <<= 1;
        }
        for (n6 = n2 + 1; n6 <= n3; ++n6) {
            arrn2[n6] = (arrn[n6 - 1] + 1 << 1) - arrn2[n6];
        }
    }

    private void k() {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        org.apache.commons.compress.b.a.b b2 = this.Q;
        boolean[] arrbl = b2.a;
        byte[] arrby = b2.m;
        byte[] arrby2 = b2.c;
        byte[] arrby3 = b2.d;
        int n8 = 0;
        for (n7 = 0; n7 < 16; ++n7) {
            if (!this.h()) continue;
            n8 |= 1 << n7;
        }
        n7 = 256;
        while (--n7 >= 0) {
            arrbl[n7] = false;
        }
        for (n7 = 0; n7 < 16; ++n7) {
            if ((n8 & 1 << n7) == 0) continue;
            n6 = n7 << 4;
            for (n5 = 0; n5 < 16; ++n5) {
                if (!this.h()) continue;
                arrbl[n6 + n5] = true;
            }
        }
        this.a();
        n7 = this.r + 2;
        n6 = this.b(3);
        n5 = this.b(15);
        for (n4 = 0; n4 < n5; ++n4) {
            n3 = 0;
            while (this.h()) {
                ++n3;
            }
            arrby3[n4] = (byte)n3;
        }
        n4 = n6;
        while (--n4 >= 0) {
            arrby[n4] = (byte)n4;
        }
        for (n4 = 0; n4 < n5; ++n4) {
            n2 = arrby[n3];
            for (n3 = arrby3[n4] & 0xFF; n3 > 0; --n3) {
                arrby[n3] = arrby[n3 - 1];
            }
            arrby[0] = n2;
            arrby2[n4] = n2;
        }
        char[][] arrc = b2.l;
        for (n3 = 0; n3 < n6; ++n3) {
            n2 = this.b(5);
            char[] arrc2 = arrc[n3];
            for (int i2 = 0; i2 < n7; ++i2) {
                while (this.h()) {
                    n2 += this.h() ? -1 : 1;
                }
                arrc2[i2] = (char)n2;
            }
        }
        this.a(n7, n6);
    }

    private void a(int n2, int n3) {
        org.apache.commons.compress.b.a.b b2 = this.Q;
        char[][] arrc = b2.l;
        int[] arrn = b2.i;
        int[][] arrn2 = b2.f;
        int[][] arrn3 = b2.g;
        int[][] arrn4 = b2.h;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = 32;
            int n5 = 0;
            char[] arrc2 = arrc[i2];
            int n6 = n2;
            while (--n6 >= 0) {
                int n7 = arrc2[n6];
                if (n7 > n5) {
                    n5 = n7;
                }
                if (n7 >= n4) continue;
                n4 = n7;
            }
            org.apache.commons.compress.b.a.a.a(arrn2[i2], arrn3[i2], arrn4[i2], arrc[i2], n4, n5, n2);
            arrn[i2] = n4;
        }
    }

    private void l() {
        this.b = this.b(24);
        this.k();
        InputStream inputStream = this.s;
        org.apache.commons.compress.b.a.b b2 = this.Q;
        byte[] arrby = b2.o;
        int[] arrn = b2.e;
        byte[] arrby2 = b2.c;
        byte[] arrby3 = b2.b;
        char[] arrc = b2.k;
        int[] arrn2 = b2.i;
        int[][] arrn3 = b2.f;
        int[][] arrn4 = b2.g;
        int[][] arrn5 = b2.h;
        int n2 = this.m * 100000;
        int n3 = 256;
        while (--n3 >= 0) {
            arrc[n3] = (char)n3;
            arrn[n3] = 0;
        }
        n3 = 0;
        int n4 = 49;
        int n5 = this.r + 1;
        int n6 = this.c(0);
        int n7 = this.o;
        int n8 = this.p;
        int n9 = -1;
        int n10 = arrby2[n3] & 0xFF;
        int[] arrn6 = arrn4[n10];
        int[] arrn7 = arrn3[n10];
        int[] arrn8 = arrn5[n10];
        int n11 = arrn2[n10];
        while (n6 != n5) {
            int n12;
            int n13;
            int n14;
            int n15;
            if (n6 == 0 || n6 == 1) {
                n15 = -1;
                n14 = 1;
                while (true) {
                    if (n6 == 0) {
                        n15 += n14;
                    } else {
                        if (n6 != 1) break;
                        n15 += n14 << 1;
                    }
                    if (n4 == 0) {
                        n4 = 49;
                        n10 = arrby2[++n3] & 0xFF;
                        arrn6 = arrn4[n10];
                        arrn7 = arrn3[n10];
                        arrn8 = arrn5[n10];
                        n11 = arrn2[n10];
                    } else {
                        --n4;
                    }
                    n13 = n11;
                    while (n8 < n13) {
                        n12 = inputStream.read();
                        if (n12 >= 0) {
                            n7 = n7 << 8 | n12;
                            n8 += 8;
                            continue;
                        }
                        throw new IOException("unexpected end of stream");
                    }
                    n12 = n7 >> n8 - n13 & (1 << n13) - 1;
                    n8 -= n13;
                    while (n12 > arrn7[n13]) {
                        ++n13;
                        while (n8 < 1) {
                            int n16 = inputStream.read();
                            if (n16 >= 0) {
                                n7 = n7 << 8 | n16;
                                n8 += 8;
                                continue;
                            }
                            throw new IOException("unexpected end of stream");
                        }
                        n12 = n12 << 1 | n7 >> --n8 & 1;
                    }
                    n6 = arrn8[n12 - arrn6[n13]];
                    n14 <<= 1;
                }
                n14 = arrby3[arrc[0]];
                int n17 = n14 & 0xFF;
                arrn[n17] = arrn[n17] + (n15 + 1);
                while (n15-- >= 0) {
                    arrby[++n9] = n14;
                }
                if (n9 < n2) continue;
                throw new IOException("block overrun");
            }
            if (++n9 >= n2) {
                throw new IOException("block overrun");
            }
            n15 = arrc[n6 - 1];
            int n18 = arrby3[n15] & 0xFF;
            arrn[n18] = arrn[n18] + 1;
            arrby[n9] = arrby3[n15];
            if (n6 <= 16) {
                n14 = n6 - 1;
                while (n14 > 0) {
                    arrc[n14--] = arrc[n14];
                }
            } else {
                System.arraycopy(arrc, 0, arrc, 1, n6 - 1);
            }
            arrc[0] = n15;
            if (n4 == 0) {
                n4 = 49;
                n10 = arrby2[++n3] & 0xFF;
                arrn6 = arrn4[n10];
                arrn7 = arrn3[n10];
                arrn8 = arrn5[n10];
                n11 = arrn2[n10];
            } else {
                --n4;
            }
            n14 = n11;
            while (n8 < n14) {
                n13 = inputStream.read();
                if (n13 >= 0) {
                    n7 = n7 << 8 | n13;
                    n8 += 8;
                    continue;
                }
                throw new IOException("unexpected end of stream");
            }
            n13 = n7 >> n8 - n14 & (1 << n14) - 1;
            n8 -= n14;
            while (n13 > arrn7[n14]) {
                ++n14;
                while (n8 < 1) {
                    n12 = inputStream.read();
                    if (n12 >= 0) {
                        n7 = n7 << 8 | n12;
                        n8 += 8;
                        continue;
                    }
                    throw new IOException("unexpected end of stream");
                }
                n13 = n13 << 1 | n7 >> --n8 & 1;
            }
            n6 = arrn8[n13 - arrn6[n14]];
        }
        this.a = n9;
        this.p = n8;
        this.o = n7;
    }

    private int c(int n2) {
        InputStream inputStream = this.s;
        org.apache.commons.compress.b.a.b b2 = this.Q;
        int n3 = b2.c[n2] & 0xFF;
        int[] arrn = b2.f[n3];
        int n4 = b2.i[n3];
        int n5 = this.b(n4);
        int n6 = this.p;
        int n7 = this.o;
        while (n5 > arrn[n4]) {
            ++n4;
            while (n6 < 1) {
                int n8 = inputStream.read();
                if (n8 >= 0) {
                    n7 = n7 << 8 | n8;
                    n6 += 8;
                    continue;
                }
                throw new IOException("unexpected end of stream");
            }
            n5 = n5 << 1 | n7 >> --n6 & 1;
        }
        this.p = n6;
        this.o = n7;
        return b2.h[n3][n5 - b2.g[n3][n4]];
    }

    private int m() {
        int n2;
        if (this.C == 0 || this.Q == null) {
            return -1;
        }
        int[] arrn = this.Q.j;
        int[] arrn2 = this.Q.a(this.a + 1);
        byte[] arrby = this.Q.o;
        arrn[0] = 0;
        System.arraycopy(this.Q.e, 0, arrn, 1, 256);
        int n3 = arrn[0];
        for (n2 = 1; n2 <= 256; ++n2) {
            arrn[n2] = n3 += arrn[n2];
        }
        n2 = 0;
        n3 = this.a;
        while (n2 <= n3) {
            int n4 = arrby[n2] & 0xFF;
            int n5 = arrn[n4];
            arrn[n4] = n5 + 1;
            arrn2[n5] = n2++;
        }
        if (this.b < 0 || this.b >= arrn2.length) {
            throw new IOException("stream corrupted");
        }
        this.O = arrn2[this.b];
        this.H = 0;
        this.K = 0;
        this.I = 256;
        if (this.n) {
            this.M = 0;
            this.N = 0;
            return this.n();
        }
        return this.o();
    }

    private int n() {
        if (this.K <= this.a) {
            this.J = this.I;
            int n2 = this.Q.o[this.O] & 0xFF;
            this.O = this.Q.n[this.O];
            if (this.M == 0) {
                this.M = i.a(this.N) - 1;
                if (++this.N == 512) {
                    this.N = 0;
                }
            } else {
                --this.M;
            }
            this.I = n2 ^= this.M == 1 ? 1 : 0;
            ++this.K;
            this.C = 3;
            this.q.b(n2);
            return n2;
        }
        this.f();
        this.e();
        return this.m();
    }

    private int o() {
        if (this.K <= this.a) {
            int n2;
            this.J = this.I;
            this.I = n2 = this.Q.o[this.O] & 0xFF;
            this.O = this.Q.n[this.O];
            ++this.K;
            this.C = 6;
            this.q.b(n2);
            return n2;
        }
        this.C = 5;
        this.f();
        this.e();
        return this.m();
    }

    private int p() {
        if (this.I != this.J) {
            this.C = 2;
            this.H = 1;
            return this.n();
        }
        if (++this.H >= 4) {
            this.P = (char)(this.Q.o[this.O] & 0xFF);
            this.O = this.Q.n[this.O];
            if (this.M == 0) {
                this.M = i.a(this.N) - 1;
                if (++this.N == 512) {
                    this.N = 0;
                }
            } else {
                --this.M;
            }
            this.L = 0;
            this.C = 4;
            if (this.M == 1) {
                this.P = (char)(this.P ^ '\u0001');
            }
            return this.q();
        }
        this.C = 2;
        return this.n();
    }

    private int q() {
        if (this.L < this.P) {
            this.q.b(this.I);
            ++this.L;
            return this.I;
        }
        this.C = 2;
        ++this.K;
        this.H = 0;
        return this.n();
    }

    private int r() {
        if (this.I != this.J) {
            this.H = 1;
            return this.o();
        }
        if (++this.H >= 4) {
            this.P = (char)(this.Q.o[this.O] & 0xFF);
            this.O = this.Q.n[this.O];
            this.L = 0;
            return this.s();
        }
        return this.o();
    }

    private int s() {
        if (this.L < this.P) {
            int n2 = this.I;
            this.q.b(n2);
            ++this.L;
            this.C = 7;
            return n2;
        }
        ++this.K;
        this.H = 0;
        return this.o();
    }

    public static boolean a(byte[] arrby, int n2) {
        if (n2 < 3) {
            return false;
        }
        if (arrby[0] != 66) {
            return false;
        }
        if (arrby[1] != 90) {
            return false;
        }
        return arrby[2] == 104;
    }
}

