/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.ah;
import io.netty.b.al;
import io.netty.b.am;
import io.netty.b.at;

final class ak {
    final ah a;
    final Object b;
    final boolean c;
    private final byte[] h;
    private final byte[] i;
    private final am[] j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final byte r;
    private int s;
    al d;
    ak e;
    ak f;

    ak(ah ah2, Object object, int n2, int n3, int n4, int n5) {
        this.c = false;
        this.a = ah2;
        this.b = object;
        this.l = n2;
        this.m = n4;
        this.n = n3;
        this.o = n5;
        this.r = (byte)(n3 + 1);
        this.p = ak.j(n5);
        this.k = ~(n2 - 1);
        this.s = n5;
        assert (n3 < 30) : "maxOrder should be < 30, but is: " + n3;
        this.q = 1 << n3;
        this.h = new byte[this.q << 1];
        this.i = new byte[this.h.length];
        int n6 = 1;
        for (int i2 = 0; i2 <= n3; ++i2) {
            int n7 = 1 << i2;
            for (int i3 = 0; i3 < n7; ++i3) {
                this.h[n6] = (byte)i2;
                this.i[n6] = (byte)i2;
                ++n6;
            }
        }
        this.j = this.b(this.q);
    }

    ak(ah ah2, Object object, int n2) {
        this.c = true;
        this.a = ah2;
        this.b = object;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.r = (byte)(this.n + 1);
        this.o = n2;
        this.p = ak.j(this.o);
        this.q = 0;
    }

    private am[] b(int n2) {
        return new am[n2];
    }

    int a() {
        int n2 = this.s;
        if (n2 == 0) {
            return 100;
        }
        int n3 = (int)((long)n2 * 100L / (long)this.o);
        if (n3 == 0) {
            return 99;
        }
        return 100 - n3;
    }

    long a(int n2) {
        if ((n2 & this.k) != 0) {
            return this.f(n2);
        }
        return this.g(n2);
    }

    private void c(int n2) {
        while (n2 > 1) {
            byte by2;
            int n3 = n2 >>> 1;
            byte by3 = this.h(n2);
            byte by4 = by3 < (by2 = this.h(n2 ^ 1)) ? by3 : by2;
            this.a(n3, by4);
            n2 = n3;
        }
    }

    private void d(int n2) {
        int n3 = this.i(n2) + 1;
        while (n2 > 1) {
            int n4 = n2 >>> 1;
            byte by2 = this.h(n2);
            byte by3 = this.h(n2 ^ 1);
            if (by2 == --n3 && by3 == n3) {
                this.a(n4, (byte)(n3 - 1));
            } else {
                byte by4 = by2 < by3 ? by2 : by3;
                this.a(n4, by4);
            }
            n2 = n4;
        }
    }

    private int e(int n2) {
        int n3 = 1;
        int n4 = -(1 << n2);
        byte by2 = this.h(n3);
        if (by2 > n2) {
            return -1;
        }
        while (by2 < n2 || (n3 & n4) == 0) {
            by2 = this.h(n3 <<= 1);
            if (by2 <= n2) continue;
            by2 = this.h(n3 ^= 1);
        }
        byte by3 = this.h(n3);
        assert (by3 == n2 && (n3 & n4) == 1 << n2) : String.format("val = %d, id & initial = %d, d = %d", by3, n3 & n4, n2);
        this.a(n3, this.r);
        this.c(n3);
        return n3;
    }

    private long f(int n2) {
        int n3 = this.n - (ak.j(n2) - this.m);
        int n4 = this.e(n3);
        if (n4 < 0) {
            return n4;
        }
        this.s -= this.k(n4);
        return n4;
    }

    private long g(int n2) {
        int n3 = this.n;
        int n4 = this.e(n3);
        if (n4 < 0) {
            return n4;
        }
        am[] arram = this.j;
        int n5 = this.l;
        this.s -= n5;
        int n6 = this.m(n4);
        am am2 = arram[n6];
        if (am2 == null) {
            arram[n6] = am2 = new am(this, n4, this.l(n4), n5, n2);
        } else {
            am2.a(n2);
        }
        return am2.a();
    }

    void a(long l2) {
        int n2 = (int)l2;
        int n3 = (int)(l2 >>> 32);
        if (n3 != 0) {
            am am2 = this.j[this.m(n2)];
            assert (am2 != null && am2.d);
            if (am2.b(n3 & 0x3FFFFFFF)) {
                return;
            }
        }
        this.s += this.k(n2);
        this.a(n2, this.i(n2));
        this.d(n2);
    }

    void a(at at2, long l2, int n2) {
        int n3 = (int)l2;
        int n4 = (int)(l2 >>> 32);
        if (n4 == 0) {
            byte by2 = this.h(n3);
            assert (by2 == this.r) : String.valueOf(by2);
            at2.a(this, l2, this.l(n3), n2, this.k(n3));
        } else {
            this.a(at2, l2, n4, n2);
        }
    }

    void b(at at2, long l2, int n2) {
        this.a(at2, l2, (int)(l2 >>> 32), n2);
    }

    private void a(at at2, long l2, int n2, int n3) {
        assert (n2 != 0);
        int n4 = (int)l2;
        am am2 = this.j[this.m(n4)];
        assert (am2.d);
        assert (n3 <= am2.e);
        at2.a(this, l2, this.l(n4) + (n2 & 0x3FFFFFFF) * am2.e, n3, am2.e);
    }

    private byte h(int n2) {
        return this.h[n2];
    }

    private void a(int n2, byte by2) {
        this.h[n2] = by2;
    }

    private byte i(int n2) {
        return this.i[n2];
    }

    private static int j(int n2) {
        return 31 - Integer.numberOfLeadingZeros(n2);
    }

    private int k(int n2) {
        return 1 << this.p - this.i(n2);
    }

    private int l(int n2) {
        int n3 = n2 ^ 1 << this.i(n2);
        return n3 * this.k(n2);
    }

    private int m(int n2) {
        return n2 ^ this.q;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Chunk(");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(": ");
        stringBuilder.append(this.a());
        stringBuilder.append("%, ");
        stringBuilder.append(this.o - this.s);
        stringBuilder.append('/');
        stringBuilder.append(this.o);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

