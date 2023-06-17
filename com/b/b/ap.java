/*
 * Decompiled with CFR 0.150.
 */
package com.b.b;

import com.b.a.b;
import com.b.a.c;
import com.b.a.d;
import com.b.b.a;
import com.b.b.aq;
import com.b.b.e;
import com.b.b.h;
import com.b.b.v;
import com.b.b.x;
import java.io.IOException;
import java.io.InputStream;

public class ap {
    static final int a = 8500;
    static final int b = 0;
    static final int c = 1;
    static final int d = 2;
    static final int e = -1;
    static final int f = -2;
    static final int g = -3;
    static final int h = -128;
    static final int i = -129;
    static final int j = -130;
    static final int k = -131;
    static final int l = -132;
    static final int m = -133;
    static final int n = -134;
    static final int o = -135;
    static final int p = -136;
    static final int q = -137;
    static final int r = -138;
    InputStream s;
    boolean t = false;
    long u;
    long v;
    com.b.a.e w = new com.b.a.e();
    int x;
    long[] y;
    long[] z;
    int[] A;
    long[] B;
    v[] C;
    e[] D;
    long E;
    boolean F = false;
    int G;
    int H;
    float I;
    float J;
    d K = new d();
    h L = new h();
    a M = new a(this.L);

    public ap(String string) {
        aq aq2 = null;
        try {
            aq2 = new aq(this, string);
            int n2 = this.a(aq2, null, 0);
            if (n2 == -1) {
                throw new x("VorbisFile: open return -1");
            }
        }
        catch (Exception exception) {
            throw new x("VorbisFile: " + exception.toString());
        }
        finally {
            if (aq2 != null) {
                try {
                    ((InputStream)aq2).close();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
        }
    }

    public ap(InputStream inputStream, byte[] arrby, int n2) {
        int n3 = this.a(inputStream, arrby, n2);
        if (n3 == -1) {
            // empty if block
        }
    }

    private int o() {
        int n2 = this.w.a(8500);
        byte[] arrby = this.w.a;
        int n3 = 0;
        try {
            n3 = this.s.read(arrby, n2, 8500);
        }
        catch (Exception exception) {
            return -128;
        }
        this.w.b(n3);
        if (n3 == -1) {
            n3 = 0;
        }
        return n3;
    }

    private void b(long l2) {
        ap.a(this.s, l2, 0);
        this.u = l2;
        this.w.b();
    }

    private int a(c c2, long l2) {
        int n2;
        int n3;
        block6: {
            if (l2 > 0L) {
                l2 += this.u;
            }
            while (true) {
                if (l2 > 0L && this.u >= l2) {
                    return -1;
                }
                n3 = this.w.a(c2);
                if (n3 < 0) {
                    this.u -= (long)n3;
                    continue;
                }
                if (n3 != 0) break block6;
                if (l2 == 0L) {
                    return -1;
                }
                n2 = this.o();
                if (n2 == 0) {
                    return -2;
                }
                if (n2 < 0) break;
            }
            return -128;
        }
        n2 = (int)this.u;
        this.u += (long)n3;
        return n2;
    }

    private int a(c c2) {
        int n2;
        long l2 = this.u;
        int n3 = -1;
        block0: while (n3 == -1) {
            if ((l2 -= 8500L) < 0L) {
                l2 = 0L;
            }
            this.b(l2);
            while (this.u < l2 + 8500L) {
                n2 = this.a(c2, l2 + 8500L - this.u);
                if (n2 == -128) {
                    return -128;
                }
                if (n2 < 0) {
                    if (n3 != -1) continue block0;
                    throw new x();
                }
                n3 = n2;
            }
        }
        this.b((long)n3);
        n2 = this.a(c2, 8500L);
        if (n2 < 0) {
            return -129;
        }
        return n3;
    }

    int a(long l2, long l3, long l4, int n2, int n3) {
        int n4;
        long l5 = l4;
        long l6 = l4;
        c c2 = new c();
        while (l3 < l5) {
            long l7 = l5 - l3 < 8500L ? l3 : (l3 + l5) / 2L;
            this.b(l7);
            n4 = this.a(c2, -1L);
            if (n4 == -128) {
                return -128;
            }
            if (n4 < 0 || c2.f() != n2) {
                l5 = l7;
                if (n4 < 0) continue;
                l6 = n4;
                continue;
            }
            l3 = n4 + c2.c + c2.f;
        }
        this.b(l6);
        n4 = this.a(c2, -1L);
        if (n4 == -128) {
            return -128;
        }
        if (l3 >= l4 || n4 == -1) {
            this.x = n3 + 1;
            this.y = new long[n3 + 2];
            this.y[n3 + 1] = l3;
        } else {
            n4 = this.a(l6, this.u, l4, c2.f(), n3 + 1);
            if (n4 == -128) {
                return -128;
            }
        }
        this.y[n3] = l2;
        return 0;
    }

    int a(v v2, e e2, int[] arrn, c c2) {
        c c3 = new c();
        b b2 = new b();
        if (c2 == null) {
            int n2 = this.a(c3, 8500L);
            if (n2 == -128) {
                return -128;
            }
            if (n2 < 0) {
                return -132;
            }
            c2 = c3;
        }
        if (arrn != null) {
            arrn[0] = c2.f();
        }
        this.K.a(c2.f());
        v2.a();
        e2.a();
        int n3 = 0;
        while (n3 < 3) {
            int n4;
            this.K.a(c2);
            while (n3 < 3 && (n4 = this.K.b(b2)) != 0) {
                if (n4 == -1) {
                    v2.b();
                    e2.b();
                    this.K.b();
                    return -1;
                }
                if (v2.a(e2, b2) != 0) {
                    v2.b();
                    e2.b();
                    this.K.b();
                    return -1;
                }
                ++n3;
            }
            if (n3 >= 3 || this.a(c2, 1L) >= 0) continue;
            v2.b();
            e2.b();
            this.K.b();
            return -1;
        }
        return 0;
    }

    void a(v v2, e e2, int n2) {
        c c2 = new c();
        this.C = new v[this.x];
        this.D = new e[this.x];
        this.z = new long[this.x];
        this.B = new long[this.x];
        this.A = new int[this.x];
        block0: for (int i2 = 0; i2 < this.x; ++i2) {
            if (v2 != null && e2 != null && i2 == 0) {
                this.C[i2] = v2;
                this.D[i2] = e2;
                this.z[i2] = n2;
            } else {
                this.b(this.y[i2]);
                this.C[i2] = new v();
                this.D[i2] = new e();
                if (this.a(this.C[i2], this.D[i2], null, null) == -1) {
                    this.z[i2] = -1L;
                } else {
                    this.z[i2] = this.u;
                    this.K.b();
                }
            }
            long l2 = this.y[i2 + 1];
            this.b(l2);
            do {
                int n3;
                if ((n3 = this.a(c2)) != -1) continue;
                this.C[i2].b();
                this.D[i2].b();
                continue block0;
            } while (c2.e() == -1L);
            this.A[i2] = c2.f();
            this.B[i2] = c2.e();
        }
    }

    private int p() {
        if (this.F) {
            System.exit(1);
        }
        this.L.a(this.C[0]);
        this.M.a(this.L);
        this.F = true;
        return 0;
    }

    int a() {
        v v2 = new v();
        e e2 = new e();
        c c2 = new c();
        int[] arrn = new int[1];
        int n2 = this.a(v2, e2, arrn, null);
        int n3 = arrn[0];
        int n4 = (int)this.u;
        this.K.b();
        if (n2 == -1) {
            return -1;
        }
        if (n2 < 0) {
            return n2;
        }
        this.t = true;
        ap.a(this.s, 0L, 2);
        long l2 = this.u = ap.a(this.s);
        l2 = this.a(c2);
        if (c2.f() != n3) {
            if (this.a(0L, 0L, l2 + 1L, n3, 0) < 0) {
                this.d();
                return -128;
            }
        } else if (this.a(0L, l2, l2 + 1L, n3, 0) < 0) {
            this.d();
            return -128;
        }
        this.a(v2, e2, n4);
        return 0;
    }

    int b() {
        this.x = 1;
        this.C = new v[this.x];
        this.C[0] = new v();
        this.D = new e[this.x];
        this.D[0] = new e();
        int[] arrn = new int[1];
        if (this.a(this.C[0], this.D[0], arrn, null) == -1) {
            return -1;
        }
        this.G = arrn[0];
        this.p();
        return 0;
    }

    void c() {
        this.K.b();
        this.L.a();
        this.M.a();
        this.F = false;
        this.I = 0.0f;
        this.J = 0.0f;
    }

    int a(int n2) {
        c c2 = new c();
        while (true) {
            b b2;
            int n3;
            if (this.F && (n3 = this.K.b(b2 = new b())) > 0) {
                long l2 = b2.f;
                if (this.M.a(b2) == 0) {
                    int n4 = this.L.a((float[][][])null, null);
                    this.L.a(this.M);
                    this.J += (float)(this.L.a((float[][][])null, null) - n4);
                    this.I += (float)(b2.c * 8);
                    if (l2 != -1L && b2.e == 0) {
                        n4 = this.t ? this.H : 0;
                        int n5 = this.L.a((float[][][])null, null);
                        l2 -= (long)n5;
                        for (int i2 = 0; i2 < n4; ++i2) {
                            l2 += this.B[i2];
                        }
                        this.E = l2;
                    }
                    return 1;
                }
            }
            if (n2 == 0) {
                return 0;
            }
            if (this.a(c2, -1L) < 0) {
                return 0;
            }
            this.I += (float)(c2.c * 8);
            if (this.F && this.G != c2.f()) {
                this.c();
            }
            if (!this.F) {
                int n6;
                if (this.t) {
                    this.G = c2.f();
                    for (n6 = 0; n6 < this.x && this.A[n6] != this.G; ++n6) {
                    }
                    if (n6 == this.x) {
                        return -1;
                    }
                    this.H = n6;
                    this.K.a(this.G);
                    this.K.e();
                } else {
                    int[] arrn = new int[1];
                    int n7 = this.a(this.C[0], this.D[0], arrn, c2);
                    this.G = arrn[0];
                    if (n7 != 0) {
                        return n7;
                    }
                    ++this.H;
                    n6 = 0;
                }
                this.p();
            }
            this.K.a(c2);
        }
    }

    int d() {
        this.M.a();
        this.L.a();
        this.K.b();
        if (this.C != null && this.x != 0) {
            for (int i2 = 0; i2 < this.x; ++i2) {
                this.C[i2].b();
                this.D[i2].b();
            }
            this.C = null;
            this.D = null;
        }
        if (this.z != null) {
            this.z = null;
        }
        if (this.B != null) {
            this.B = null;
        }
        if (this.A != null) {
            this.A = null;
        }
        if (this.y != null) {
            this.y = null;
        }
        this.w.a();
        return 0;
    }

    static int a(InputStream inputStream, long l2, int n2) {
        if (inputStream instanceof aq) {
            aq aq2 = (aq)inputStream;
            try {
                if (n2 == 0) {
                    aq2.a(l2);
                } else if (n2 == 2) {
                    aq2.a(aq2.a() - l2);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            return 0;
        }
        try {
            if (n2 == 0) {
                inputStream.reset();
            }
            inputStream.skip(l2);
        }
        catch (Exception exception) {
            return -1;
        }
        return 0;
    }

    static long a(InputStream inputStream) {
        try {
            if (inputStream instanceof aq) {
                aq aq2 = (aq)inputStream;
                return aq2.b();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return 0L;
    }

    int a(InputStream inputStream, byte[] arrby, int n2) {
        return this.b(inputStream, arrby, n2);
    }

    int b(InputStream inputStream, byte[] arrby, int n2) {
        int n3;
        this.s = inputStream;
        this.w.c();
        if (arrby != null) {
            int n4 = this.w.a(n2);
            System.arraycopy(arrby, 0, this.w.a, n4, n2);
            this.w.b(n2);
        }
        if ((n3 = inputStream instanceof aq ? this.a() : this.b()) != 0) {
            this.s = null;
            this.d();
        }
        return n3;
    }

    public int e() {
        return this.x;
    }

    public boolean f() {
        return this.t;
    }

    public int b(int n2) {
        if (n2 >= this.x) {
            return -1;
        }
        if (!this.t && n2 != 0) {
            return this.b(0);
        }
        if (n2 < 0) {
            long l2 = 0L;
            for (int i2 = 0; i2 < this.x; ++i2) {
                l2 += (this.y[i2 + 1] - this.z[i2]) * 8L;
            }
            return (int)Math.rint((float)l2 / this.f(-1));
        }
        if (this.t) {
            return (int)Math.rint((float)((this.y[n2 + 1] - this.z[n2]) * 8L) / this.f(n2));
        }
        if (this.C[n2].e > 0) {
            return this.C[n2].e;
        }
        if (this.C[n2].d > 0) {
            if (this.C[n2].f > 0) {
                return (this.C[n2].d + this.C[n2].f) / 2;
            }
            return this.C[n2].d;
        }
        return -1;
    }

    public int g() {
        int n2;
        int n3 = n2 = this.t ? this.H : 0;
        if (this.J == 0.0f) {
            return -1;
        }
        int n4 = (int)((double)(this.I / this.J * (float)this.C[n2].c) + 0.5);
        this.I = 0.0f;
        this.J = 0.0f;
        return n4;
    }

    public int c(int n2) {
        if (n2 >= this.x) {
            return -1;
        }
        if (!this.t && n2 >= 0) {
            return this.c(-1);
        }
        if (n2 < 0) {
            return this.G;
        }
        return this.A[n2];
    }

    public long d(int n2) {
        if (!this.t || n2 >= this.x) {
            return -1L;
        }
        if (n2 < 0) {
            long l2 = 0L;
            for (int i2 = 0; i2 < this.x; ++i2) {
                l2 += this.d(i2);
            }
            return l2;
        }
        return this.y[n2 + 1] - this.y[n2];
    }

    public long e(int n2) {
        if (!this.t || n2 >= this.x) {
            return -1L;
        }
        if (n2 < 0) {
            long l2 = 0L;
            for (int i2 = 0; i2 < this.x; ++i2) {
                l2 += this.e(i2);
            }
            return l2;
        }
        return this.B[n2];
    }

    public float f(int n2) {
        if (!this.t || n2 >= this.x) {
            return -1.0f;
        }
        if (n2 < 0) {
            float f2 = 0.0f;
            for (int i2 = 0; i2 < this.x; ++i2) {
                f2 += this.f(i2);
            }
            return f2;
        }
        return (float)this.B[n2] / (float)this.C[n2].c;
    }

    public int g(int n2) {
        if (!this.t) {
            return -1;
        }
        if (n2 < 0 || (long)n2 > this.y[this.x]) {
            this.E = -1L;
            this.c();
            return -1;
        }
        this.E = -1L;
        this.c();
        this.b((long)n2);
        switch (this.a(1)) {
            case 0: {
                this.E = this.e(-1);
                return 0;
            }
            case -1: {
                this.E = -1L;
                this.c();
                return -1;
            }
        }
        while (true) {
            switch (this.a(0)) {
                case 0: {
                    return 0;
                }
                case -1: {
                    this.E = -1L;
                    this.c();
                    return -1;
                }
            }
        }
    }

    public int a(long l2) {
        int n2 = -1;
        long l3 = this.e(-1);
        if (!this.t) {
            return -1;
        }
        if (l2 < 0L || l2 > l3) {
            this.E = -1L;
            this.c();
            return -1;
        }
        for (n2 = this.x - 1; n2 >= 0 && l2 < (l3 -= this.B[n2]); --n2) {
        }
        long l4 = l2 - l3;
        long l5 = this.y[n2 + 1];
        long l6 = this.y[n2];
        int n3 = (int)l6;
        c c2 = new c();
        while (l6 < l5) {
            long l7 = l5 - l6 < 8500L ? l6 : (l5 + l6) / 2L;
            this.b(l7);
            int n4 = this.a(c2, l5 - l7);
            if (n4 == -1) {
                l5 = l7;
                continue;
            }
            long l8 = c2.e();
            if (l8 < l4) {
                n3 = n4;
                l6 = this.u;
                continue;
            }
            l5 = l7;
        }
        if (this.g(n3) != 0) {
            this.E = -1L;
            this.c();
            return -1;
        }
        if (this.E >= l2) {
            this.E = -1L;
            this.c();
            return -1;
        }
        if (l2 > this.e(-1)) {
            this.E = -1L;
            this.c();
            return -1;
        }
        while (this.E < l2) {
            int n5 = (int)(l2 - this.E);
            float[][][] arrarrf = new float[1][][];
            int[] arrn = new int[this.h((int)-1).b];
            int n6 = this.L.a(arrarrf, arrn);
            if (n6 > n5) {
                n6 = n5;
            }
            this.L.a(n6);
            this.E += (long)n6;
            if (n6 >= n5 || this.a(1) != 0) continue;
            this.E = this.e(-1);
        }
        return 0;
    }

    int a(float f2) {
        int n2 = -1;
        long l2 = this.e(-1);
        float f3 = this.f(-1);
        if (!this.t) {
            return -1;
        }
        if (f2 < 0.0f || f2 > f3) {
            this.E = -1L;
            this.c();
            return -1;
        }
        for (n2 = this.x - 1; n2 >= 0; --n2) {
            l2 -= this.B[n2];
            if (f2 >= (f3 -= this.f(n2))) break;
        }
        long l3 = (long)((float)l2 + (f2 - f3) * (float)this.C[n2].c);
        return this.a(l3);
    }

    public long h() {
        return this.u;
    }

    public long i() {
        return this.E;
    }

    public float j() {
        int n2 = -1;
        long l2 = 0L;
        float f2 = 0.0f;
        if (this.t) {
            l2 = this.e(-1);
            f2 = this.f(-1);
            for (n2 = this.x - 1; n2 >= 0; --n2) {
                f2 -= this.f(n2);
                if (this.E >= (l2 -= this.B[n2])) break;
            }
        }
        return f2 + (float)(this.E - l2) / (float)this.C[n2].c;
    }

    public v h(int n2) {
        if (this.t) {
            if (n2 < 0) {
                if (this.F) {
                    return this.C[this.H];
                }
                return null;
            }
            if (n2 >= this.x) {
                return null;
            }
            return this.C[n2];
        }
        if (this.F) {
            return this.C[0];
        }
        return null;
    }

    public e i(int n2) {
        if (this.t) {
            if (n2 < 0) {
                if (this.F) {
                    return this.D[this.H];
                }
                return null;
            }
            if (n2 >= this.x) {
                return null;
            }
            return this.D[n2];
        }
        if (this.F) {
            return this.D[0];
        }
        return null;
    }

    int k() {
        return 1;
    }

    int a(byte[] arrby, int n2, int n3, int n4, int n5, int[] arrn) {
        int n6 = this.k();
        int n7 = 0;
        while (true) {
            if (this.F) {
                float[][][] arrarrf = new float[1][][];
                int[] arrn2 = new int[this.h((int)-1).b];
                int n8 = this.L.a(arrarrf, arrn2);
                float[][] arrf = arrarrf[0];
                if (n8 != 0) {
                    int n9 = this.h((int)-1).b;
                    int n10 = n4 * n9;
                    if (n8 > n2 / n10) {
                        n8 = n2 / n10;
                    }
                    if (n4 == 1) {
                        int n11 = n5 != 0 ? 0 : 128;
                        for (int i2 = 0; i2 < n8; ++i2) {
                            for (int i3 = 0; i3 < n9; ++i3) {
                                int n12 = (int)((double)arrf[i3][arrn2[i3] + i2] * 128.0 + 0.5);
                                if (n12 > 127) {
                                    n12 = 127;
                                } else if (n12 < -128) {
                                    n12 = -128;
                                }
                                arrby[n7++] = (byte)(n12 + n11);
                            }
                        }
                    } else {
                        int n13;
                        int n14 = n13 = n5 != 0 ? 0 : 32768;
                        if (n6 == n3) {
                            if (n5 != 0) {
                                for (int i4 = 0; i4 < n9; ++i4) {
                                    int n15 = arrn2[i4];
                                    int n16 = i4;
                                    for (int i5 = 0; i5 < n8; ++i5) {
                                        int n17 = (int)((double)arrf[i4][n15 + i5] * 32768.0 + 0.5);
                                        if (n17 > 32767) {
                                            n17 = 32767;
                                        } else if (n17 < -32768) {
                                            n17 = -32768;
                                        }
                                        arrby[n16] = (byte)(n17 >>> 8);
                                        arrby[n16 + 1] = (byte)n17;
                                        n16 += n9 * 2;
                                    }
                                }
                            } else {
                                for (int i6 = 0; i6 < n9; ++i6) {
                                    float[] arrf2 = arrf[i6];
                                    int n18 = i6;
                                    for (int i7 = 0; i7 < n8; ++i7) {
                                        int n19 = (int)((double)arrf2[i7] * 32768.0 + 0.5);
                                        if (n19 > 32767) {
                                            n19 = 32767;
                                        } else if (n19 < -32768) {
                                            n19 = -32768;
                                        }
                                        arrby[n18] = (byte)(n19 + n13 >>> 8);
                                        arrby[n18 + 1] = (byte)(n19 + n13);
                                        n18 += n9 * 2;
                                    }
                                }
                            }
                        } else if (n3 != 0) {
                            for (int i8 = 0; i8 < n8; ++i8) {
                                for (int i9 = 0; i9 < n9; ++i9) {
                                    int n20 = (int)((double)arrf[i9][i8] * 32768.0 + 0.5);
                                    if (n20 > 32767) {
                                        n20 = 32767;
                                    } else if (n20 < -32768) {
                                        n20 = -32768;
                                    }
                                    arrby[n7++] = (byte)((n20 += n13) >>> 8);
                                    arrby[n7++] = (byte)n20;
                                }
                            }
                        } else {
                            for (int i10 = 0; i10 < n8; ++i10) {
                                for (int i11 = 0; i11 < n9; ++i11) {
                                    int n21 = (int)((double)arrf[i11][i10] * 32768.0 + 0.5);
                                    if (n21 > 32767) {
                                        n21 = 32767;
                                    } else if (n21 < -32768) {
                                        n21 = -32768;
                                    }
                                    arrby[n7++] = (byte)(n21 += n13);
                                    arrby[n7++] = (byte)(n21 >>> 8);
                                }
                            }
                        }
                    }
                    this.L.a(n8);
                    this.E += (long)n8;
                    if (arrn != null) {
                        arrn[0] = this.H;
                    }
                    return n8 * n10;
                }
            }
            switch (this.a(1)) {
                case 0: {
                    return 0;
                }
                case -1: {
                    return -1;
                }
            }
        }
    }

    public v[] l() {
        return this.C;
    }

    public e[] m() {
        return this.D;
    }

    public void n() {
        this.s.close();
    }
}

