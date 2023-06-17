/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.c;

import com.ibm.icu.c.b;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public class a
extends Number
implements Serializable,
Comparable {
    public static final a a = new a(0L);
    public static final a b = new a(1L);
    public static final a c = new a(10);
    public static final int d = 2;
    public static final int e = 1;
    public static final int f = 3;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 4;
    public static final int j = 7;
    public static final int k = 0;
    private static final byte l = 1;
    private static final byte m = 0;
    private static final byte n = -1;
    private static final int o = -999999999;
    private static final int p = 999999999;
    private static final int q = -999999999;
    private static final int r = 999999999;
    private static final b s = new b(0, 0);
    private static final long t = 8245355804974198832L;
    private static byte[] u = new byte[190];
    private static byte[] v = com.ibm.icu.c.a.p();
    private byte w;
    private byte x = 0;
    private byte[] y;
    private int z;

    public a(BigDecimal bigDecimal) {
        this(bigDecimal.toString());
    }

    public a(BigInteger bigInteger) {
        this(bigInteger.toString(10));
    }

    public a(BigInteger bigInteger, int n2) {
        this(bigInteger.toString(10));
        if (n2 < 0) {
            throw new NumberFormatException("Negative scale: " + n2);
        }
        this.z = -n2;
    }

    public a(char[] arrc) {
        this(arrc, 0, arrc.length);
    }

    public a(char[] arrc, int n2, int n3) {
        int n4 = 0;
        char c2 = '\u0000';
        boolean bl2 = false;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        char c3 = '\u0000';
        int n8 = 0;
        int n9 = 0;
        if (n3 <= 0) {
            this.a(arrc);
        }
        this.w = 1;
        if (arrc[n2] == '-') {
            if (--n3 == 0) {
                this.a(arrc);
            }
            this.w = (byte)-1;
            ++n2;
        } else if (arrc[n2] == '+') {
            if (--n3 == 0) {
                this.a(arrc);
            }
            ++n2;
        }
        boolean bl3 = false;
        boolean bl4 = false;
        int n10 = 0;
        int n11 = -1;
        int n12 = -1;
        int n13 = n3;
        n4 = n2;
        while (n13 > 0) {
            c2 = arrc[n4];
            if (c2 >= '0' && c2 <= '9') {
                n12 = n4;
                ++n10;
            } else if (c2 == '.') {
                if (n11 >= 0) {
                    this.a(arrc);
                }
                n11 = n4 - n2;
            } else {
                if (c2 == 'e' || c2 == 'E') {
                    if (n4 - n2 > n3 - 2) {
                        this.a(arrc);
                    }
                    bl2 = false;
                    if (arrc[n4 + 1] == '-') {
                        bl2 = true;
                        n5 = n4 + 2;
                    } else {
                        n5 = arrc[n4 + 1] == '+' ? n4 + 2 : n4 + 1;
                    }
                    n6 = n3 - (n5 - n2);
                    if (n6 == 0 | n6 > 9) {
                        this.a(arrc);
                    }
                    int n14 = n6;
                    n7 = n5;
                    while (n14 > 0) {
                        c3 = arrc[n7];
                        if (c3 < '0') {
                            this.a(arrc);
                        }
                        if (c3 > '9') {
                            if (!com.ibm.icu.b.b.g(c3)) {
                                this.a(arrc);
                            }
                            if ((n8 = com.ibm.icu.b.b.a((int)c3, 10)) < 0) {
                                this.a(arrc);
                            }
                        } else {
                            n8 = c3 - 48;
                        }
                        this.z = this.z * 10 + n8;
                        --n14;
                        ++n7;
                    }
                    if (bl2) {
                        this.z = -this.z;
                    }
                    bl4 = true;
                    break;
                }
                if (!com.ibm.icu.b.b.g(c2)) {
                    this.a(arrc);
                }
                bl3 = true;
                n12 = n4;
                ++n10;
            }
            --n13;
            ++n4;
        }
        if (n10 == 0) {
            this.a(arrc);
        }
        if (n11 >= 0) {
            this.z = this.z + n11 - n10;
        }
        n13 = n12 - 1;
        for (n4 = n2; n4 <= n13; ++n4) {
            c2 = arrc[n4];
            if (c2 == '0') {
                ++n2;
                --n11;
                --n10;
                continue;
            }
            if (c2 == '.') {
                ++n2;
                --n11;
                continue;
            }
            if (c2 <= '9' || com.ibm.icu.b.b.a((int)c2, 10) != 0) break;
            ++n2;
            --n11;
            --n10;
        }
        this.y = new byte[n10];
        n7 = n2;
        if (bl3) {
            n13 = n10;
            n4 = 0;
            while (n13 > 0) {
                if (n4 == n11) {
                    ++n7;
                }
                if ((c3 = arrc[n7]) <= '9') {
                    this.y[n4] = (byte)(c3 - 48);
                } else {
                    n8 = com.ibm.icu.b.b.a((int)c3, 10);
                    if (n8 < 0) {
                        this.a(arrc);
                    }
                    this.y[n4] = (byte)n8;
                }
                ++n7;
                --n13;
                ++n4;
            }
        } else {
            n13 = n10;
            n4 = 0;
            while (n13 > 0) {
                if (n4 == n11) {
                    ++n7;
                }
                this.y[n4] = (byte)(arrc[n7] - 48);
                ++n7;
                --n13;
                ++n4;
            }
        }
        if (this.y[0] == 0) {
            this.w = 0;
            if (this.z > 0) {
                this.z = 0;
            }
            if (bl4) {
                this.y = com.ibm.icu.c.a.a.y;
                this.z = 0;
            }
        } else if (bl4) {
            this.x = 1;
            n9 = this.z + this.y.length - 1;
            if (n9 < -999999999 | n9 > 999999999) {
                this.a(arrc);
            }
        }
    }

    public a(double d2) {
        this(new BigDecimal(d2).toString());
    }

    public a(int n2) {
        int n3 = 0;
        if (n2 <= 9 && n2 >= -9) {
            if (n2 == 0) {
                this.y = com.ibm.icu.c.a.a.y;
                this.w = 0;
            } else if (n2 == 1) {
                this.y = com.ibm.icu.c.a.b.y;
                this.w = 1;
            } else if (n2 == -1) {
                this.y = com.ibm.icu.c.a.b.y;
                this.w = (byte)-1;
            } else {
                this.y = new byte[1];
                if (n2 > 0) {
                    this.y[0] = (byte)n2;
                    this.w = 1;
                } else {
                    this.y[0] = (byte)(-n2);
                    this.w = (byte)-1;
                }
            }
            return;
        }
        if (n2 > 0) {
            this.w = 1;
            n2 = -n2;
        } else {
            this.w = (byte)-1;
        }
        int n4 = n2;
        n3 = 9;
        while ((n4 /= 10) != 0) {
            --n3;
        }
        this.y = new byte[10 - n3];
        n3 = 10 - n3 - 1;
        while (true) {
            this.y[n3] = -((byte)(n2 % 10));
            if ((n2 /= 10) == 0) break;
            --n3;
        }
    }

    public a(long l2) {
        int n2 = 0;
        if (l2 > 0L) {
            this.w = 1;
            l2 = -l2;
        } else {
            this.w = l2 == 0L ? (byte)0 : (byte)-1;
        }
        long l3 = l2;
        n2 = 18;
        while ((l3 /= 10L) != 0L) {
            --n2;
        }
        this.y = new byte[19 - n2];
        n2 = 19 - n2 - 1;
        while (true) {
            this.y[n2] = -((byte)(l2 % 10L));
            if ((l2 /= 10L) == 0L) break;
            --n2;
        }
    }

    public a(String string) {
        this(string.toCharArray(), 0, string.length());
    }

    private a() {
    }

    public a a() {
        return this.a(s);
    }

    public a a(b b2) {
        if (this.w == -1) {
            return this.b(b2);
        }
        return this.c(b2);
    }

    public a a(a a2) {
        return this.a(a2, s);
    }

    public a a(a a2, b b2) {
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        byte[] arrby = null;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        byte by2 = 0;
        byte by3 = 0;
        if (b2.n) {
            this.b(a2, b2.l);
        }
        a a3 = this;
        if (a3.w == 0 && b2.m != 0) {
            return a2.c(b2);
        }
        if (a2.w == 0 && b2.m != 0) {
            return a3.c(b2);
        }
        int n9 = b2.l;
        if (n9 > 0) {
            if (a3.y.length > n9) {
                a3 = com.ibm.icu.c.a.k(a3).d(b2);
            }
            if (a2.y.length > n9) {
                a2 = com.ibm.icu.c.a.k(a2).d(b2);
            }
        }
        a a4 = new a();
        byte[] arrby2 = a3.y;
        int n10 = a3.y.length;
        byte[] arrby3 = a2.y;
        int n11 = a2.y.length;
        if (a3.z == a2.z) {
            a4.z = a3.z;
        } else if (a3.z > a2.z) {
            n2 = n10 + a3.z - a2.z;
            if (n2 >= n11 + n9 + 1 && n9 > 0) {
                a4.y = arrby2;
                a4.z = a3.z;
                a4.w = a3.w;
                if (n10 < n9) {
                    a4.y = com.ibm.icu.c.a.a(a3.y, n9);
                    a4.z -= n9 - n10;
                }
                return a4.a(b2, false);
            }
            a4.z = a2.z;
            if (n2 > n9 + 1 && n9 > 0) {
                n3 = n2 - n9 - 1;
                n11 -= n3;
                a4.z += n3;
                n2 = n9 + 1;
            }
            if (n2 > n10) {
                n10 = n2;
            }
        } else {
            n2 = n11 + a2.z - a3.z;
            if (n2 >= n10 + n9 + 1 && n9 > 0) {
                a4.y = arrby3;
                a4.z = a2.z;
                a4.w = a2.w;
                if (n11 < n9) {
                    a4.y = com.ibm.icu.c.a.a(a2.y, n9);
                    a4.z -= n9 - n11;
                }
                return a4.a(b2, false);
            }
            a4.z = a3.z;
            if (n2 > n9 + 1 && n9 > 0) {
                n3 = n2 - n9 - 1;
                n10 -= n3;
                a4.z += n3;
                n2 = n9 + 1;
            }
            if (n2 > n11) {
                n11 = n2;
            }
        }
        a4.w = a3.w == 0 ? (byte)1 : a3.w;
        if (a3.w == -1 == (a2.w == -1)) {
            n4 = 1;
        } else {
            n4 = -1;
            if (a2.w != 0) {
                if (n10 < n11 | a3.w == 0) {
                    arrby = arrby2;
                    arrby2 = arrby3;
                    arrby3 = arrby;
                    n3 = n10;
                    n10 = n11;
                    n11 = n3;
                    a4.w = -a4.w;
                } else if (n10 <= n11) {
                    n5 = 0;
                    n6 = 0;
                    n7 = arrby2.length - 1;
                    n8 = arrby3.length - 1;
                    while (true) {
                        if (n5 <= n7) {
                            by2 = arrby2[n5];
                        } else {
                            if (n6 > n8) {
                                if (b2.m == 0) break;
                                return a;
                            }
                            by2 = 0;
                        }
                        by3 = n6 <= n8 ? arrby3[n6] : (byte)0;
                        if (by2 != by3) {
                            if (by2 >= by3) break;
                            arrby = arrby2;
                            arrby2 = arrby3;
                            arrby3 = arrby;
                            n3 = n10;
                            n10 = n11;
                            n11 = n3;
                            a4.w = -a4.w;
                            break;
                        }
                        ++n5;
                        ++n6;
                    }
                }
            }
        }
        a4.y = com.ibm.icu.c.a.a(arrby2, n10, arrby3, n11, n4, false);
        return a4.a(b2, false);
    }

    public int b(a a2) {
        return this.b(a2, s);
    }

    public int b(a a2, b b2) {
        int n2 = 0;
        int n3 = 0;
        if (b2.n) {
            this.b(a2, b2.l);
        }
        if (this.w == a2.w & this.z == a2.z) {
            n2 = this.y.length;
            if (n2 < a2.y.length) {
                return -this.w;
            }
            if (n2 > a2.y.length) {
                return this.w;
            }
            if (n2 <= b2.l | b2.l == 0) {
                int n4 = n2;
                n3 = 0;
                while (n4 > 0) {
                    if (this.y[n3] < a2.y[n3]) {
                        return -this.w;
                    }
                    if (this.y[n3] > a2.y[n3]) {
                        return this.w;
                    }
                    --n4;
                    ++n3;
                }
                return 0;
            }
        } else {
            if (this.w < a2.w) {
                return -1;
            }
            if (this.w > a2.w) {
                return 1;
            }
        }
        a a3 = com.ibm.icu.c.a.k(a2);
        a3.w = -a3.w;
        return this.a((a)a3, (b)b2).w;
    }

    public a c(a a2) {
        return this.a('D', a2, s, -1);
    }

    public a a(a a2, int n2) {
        b b2 = new b(0, 0, false, n2);
        return this.a('D', a2, b2, -1);
    }

    public a a(a a2, int n2, int n3) {
        if (n2 < 0) {
            throw new ArithmeticException("Negative scale: " + n2);
        }
        b b2 = new b(0, 0, false, n3);
        return this.a('D', a2, b2, n2);
    }

    public a c(a a2, b b2) {
        return this.a('D', a2, b2, -1);
    }

    public a d(a a2) {
        return this.a('I', a2, s, 0);
    }

    public a d(a a2, b b2) {
        return this.a('I', a2, b2, 0);
    }

    public a e(a a2) {
        return this.e(a2, s);
    }

    public a e(a a2, b b2) {
        if (this.b(a2, b2) >= 0) {
            return this.c(b2);
        }
        return a2.c(b2);
    }

    public a f(a a2) {
        return this.f(a2, s);
    }

    public a f(a a2, b b2) {
        if (this.b(a2, b2) <= 0) {
            return this.c(b2);
        }
        return a2.c(b2);
    }

    public a g(a a2) {
        return this.g(a2, s);
    }

    public a g(a a2, b b2) {
        byte[] arrby = null;
        byte[] arrby2 = null;
        int n2 = 0;
        int n3 = 0;
        byte by2 = 0;
        if (b2.n) {
            this.b(a2, b2.l);
        }
        a a3 = this;
        int n4 = 0;
        int n5 = b2.l;
        if (n5 > 0) {
            if (a3.y.length > n5) {
                a3 = com.ibm.icu.c.a.k(a3).d(b2);
            }
            if (a2.y.length > n5) {
                a2 = com.ibm.icu.c.a.k(a2).d(b2);
            }
        } else {
            if (a3.z > 0) {
                n4 += a3.z;
            }
            if (a2.z > 0) {
                n4 += a2.z;
            }
        }
        if (a3.y.length < a2.y.length) {
            arrby = a3.y;
            arrby2 = a2.y;
        } else {
            arrby = a2.y;
            arrby2 = a3.y;
        }
        int n6 = arrby.length + arrby2.length - 1;
        n2 = arrby[0] * arrby2[0] > 9 ? n6 + 1 : n6;
        a a4 = new a();
        byte[] arrby3 = new byte[n2];
        int n7 = arrby.length;
        n3 = 0;
        while (n7 > 0) {
            by2 = arrby[n3];
            if (by2 != 0) {
                arrby3 = com.ibm.icu.c.a.a(arrby3, arrby3.length, arrby2, n6, by2, true);
            }
            --n6;
            --n7;
            ++n3;
        }
        a4.w = (byte)(a3.w * a2.w);
        a4.z = a3.z + a2.z - n4;
        a4.y = n4 == 0 ? arrby3 : com.ibm.icu.c.a.a(arrby3, arrby3.length + n4);
        return a4.a(b2, false);
    }

    public a b() {
        return this.b(s);
    }

    public a b(b b2) {
        if (b2.n) {
            this.b((a)null, b2.l);
        }
        a a2 = com.ibm.icu.c.a.k(this);
        a2.w = -a2.w;
        return a2.a(b2, false);
    }

    public a c() {
        return this.c(s);
    }

    public a c(b b2) {
        if (b2.n) {
            this.b((a)null, b2.l);
        }
        if (b2.m == 0 && this.x == 0) {
            if (this.y.length <= b2.l) {
                return this;
            }
            if (b2.l == 0) {
                return this;
            }
        }
        return com.ibm.icu.c.a.k(this).a(b2, false);
    }

    public a h(a a2) {
        return this.h(a2, s);
    }

    public a h(a a2, b b2) {
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        if (b2.n) {
            this.b(a2, b2.l);
        }
        int n5 = a2.c(-999999999, 999999999);
        a a3 = this;
        int n6 = b2.l;
        if (n6 == 0) {
            if (a2.w == -1) {
                throw new ArithmeticException("Negative power: " + a2.toString());
            }
            n2 = 0;
        } else {
            if (a2.y.length + a2.z > n6) {
                throw new ArithmeticException("Too many digits: " + a2.toString());
            }
            if (a3.y.length > n6) {
                a3 = com.ibm.icu.c.a.k(a3).d(b2);
            }
            n3 = a2.y.length + a2.z;
            n2 = n6 + n3 + 1;
        }
        b b3 = new b(n2, b2.m, false, b2.o);
        a a4 = b;
        if (n5 == 0) {
            return a4;
        }
        if (n5 < 0) {
            n5 = -n5;
        }
        boolean bl2 = false;
        n4 = 1;
        while (true) {
            if ((n5 += n5) < 0) {
                bl2 = true;
                a4 = a4.g(a3, b3);
            }
            if (n4 == 31) break;
            if (bl2) {
                a4 = a4.g(a4, b3);
            }
            ++n4;
        }
        if (a2.w < 0) {
            a4 = b.c(a4, b3);
        }
        return a4.a(b2, true);
    }

    public a i(a a2) {
        return this.a('R', a2, s, -1);
    }

    public a i(a a2, b b2) {
        return this.a('R', a2, b2, -1);
    }

    public a j(a a2) {
        return this.j(a2, s);
    }

    public a j(a a2, b b2) {
        if (b2.n) {
            this.b(a2, b2.l);
        }
        a a3 = com.ibm.icu.c.a.k(a2);
        a3.w = -a3.w;
        return this.a(a3, b2);
    }

    public byte d() {
        int n2 = this.e();
        if (n2 > 127 | n2 < -128) {
            throw new ArithmeticException("Conversion overflow: " + this.toString());
        }
        return (byte)n2;
    }

    public double doubleValue() {
        return Double.valueOf(this.toString());
    }

    public boolean equals(Object object) {
        int n2 = 0;
        char[] arrc = null;
        char[] arrc2 = null;
        if (object == null) {
            return false;
        }
        if (!(object instanceof a)) {
            return false;
        }
        a a2 = (a)object;
        if (this.w != a2.w) {
            return false;
        }
        if (this.y.length == a2.y.length & this.z == a2.z & this.x == a2.x) {
            int n3 = this.y.length;
            n2 = 0;
            while (n3 > 0) {
                if (this.y[n2] != a2.y[n2]) {
                    return false;
                }
                --n3;
                ++n2;
            }
        } else {
            arrc = this.o();
            if (arrc.length != (arrc2 = a2.o()).length) {
                return false;
            }
            int n4 = arrc.length;
            n2 = 0;
            while (n4 > 0) {
                if (arrc[n2] != arrc2[n2]) {
                    return false;
                }
                --n4;
                ++n2;
            }
        }
        return true;
    }

    public float floatValue() {
        return Float.valueOf(this.toString()).floatValue();
    }

    public String a(int n2, int n3) {
        return this.a(n2, n3, -1, -1, 1, 4);
    }

    public String a(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        byte[] arrby = null;
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        char[] arrc = null;
        int n15 = 0;
        int n16 = 0;
        if (n2 < -1 | n2 == 0) {
            this.a("format", 1, String.valueOf(n2));
        }
        if (n3 < -1) {
            this.a("format", 2, String.valueOf(n3));
        }
        if (n4 < -1 | n4 == 0) {
            this.a("format", 3, String.valueOf(n4));
        }
        if (n5 < -1) {
            this.a("format", 4, String.valueOf(n4));
        }
        if (n6 != 1 && n6 != 2) {
            if (n6 == -1) {
                n6 = 1;
            } else {
                this.a("format", 5, String.valueOf(n6));
            }
        }
        if (n7 != 4) {
            try {
                if (n7 == -1) {
                    n7 = 4;
                } else {
                    new b(9, 1, false, n7);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                this.a("format", 6, String.valueOf(n7));
            }
        }
        a a2 = com.ibm.icu.c.a.k(this);
        a2.x = n5 == -1 ? (byte)0 : (a2.w == 0 ? (byte)0 : ((n8 = a2.z + a2.y.length) > n5 ? (byte)n6 : (n8 < -5 ? (byte)n6 : (byte)0)));
        if (n3 >= 0) {
            while (true) {
                if (a2.x == 0) {
                    n9 = -a2.z;
                } else if (a2.x == 1) {
                    n9 = a2.y.length - 1;
                } else {
                    n10 = (a2.z + a2.y.length - 1) % 3;
                    if (n10 < 0) {
                        n10 = 3 + n10;
                    }
                    n9 = ++n10 >= a2.y.length ? 0 : a2.y.length - n10;
                }
                if (n9 == n3) break;
                if (n9 < n3) {
                    arrby = com.ibm.icu.c.a.a(a2.y, a2.y.length + n3 - n9);
                    a2.y = arrby;
                    a2.z -= n3 - n9;
                    if (a2.z >= -999999999) break;
                    throw new ArithmeticException("Exponent Overflow: " + a2.z);
                }
                n11 = n9 - n3;
                if (n11 > a2.y.length) {
                    a2.y = com.ibm.icu.c.a.a.y;
                    a2.w = 0;
                    a2.z = 0;
                    continue;
                }
                n12 = a2.y.length - n11;
                n13 = a2.z;
                a2.d(n12, n7);
                if (a2.z - n13 == n11) break;
            }
        }
        char[] arrc2 = a2.o();
        if (n2 > 0) {
            int n17 = arrc2.length;
            n14 = 0;
            while (n17 > 0 && arrc2[n14] != '.' && arrc2[n14] != 'E') {
                --n17;
                ++n14;
            }
            if (n14 > n2) {
                this.a("format", 1, String.valueOf(n2));
            }
            if (n14 < n2) {
                arrc = new char[arrc2.length + n2 - n14];
                n17 = n2 - n14;
                n15 = 0;
                while (n17 > 0) {
                    arrc[n15] = 32;
                    --n17;
                    ++n15;
                }
                System.arraycopy(arrc2, 0, arrc, n15, arrc2.length);
                arrc2 = arrc;
            }
        }
        if (n4 > 0) {
            int n18 = arrc2.length - 1;
            n14 = arrc2.length - 1;
            while (n18 > 0 && arrc2[n14] != 'E') {
                --n18;
                --n14;
            }
            if (n14 == 0) {
                arrc = new char[arrc2.length + n4 + 2];
                System.arraycopy(arrc2, 0, arrc, 0, arrc2.length);
                n18 = n4 + 2;
                n15 = arrc2.length;
                while (n18 > 0) {
                    arrc[n15] = 32;
                    --n18;
                    ++n15;
                }
                arrc2 = arrc;
            } else {
                n16 = arrc2.length - n14 - 2;
                if (n16 > n4) {
                    this.a("format", 3, String.valueOf(n4));
                }
                if (n16 < n4) {
                    arrc = new char[arrc2.length + n4 - n16];
                    System.arraycopy(arrc2, 0, arrc, 0, n14 + 2);
                    n18 = n4 - n16;
                    n15 = n14 + 2;
                    while (n18 > 0) {
                        arrc[n15] = 48;
                        --n18;
                        ++n15;
                    }
                    System.arraycopy(arrc2, n14 + 2, arrc, n15, n16);
                    arrc2 = arrc;
                }
            }
        }
        return new String(arrc2);
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public int intValue() {
        return this.k().intValue();
    }

    public int e() {
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        if (this.w == 0) {
            return 0;
        }
        int n5 = this.y.length - 1;
        if (this.z < 0) {
            if (!com.ibm.icu.c.a.b(this.y, (n5 += this.z) + 1)) {
                throw new ArithmeticException("Decimal part non-zero: " + this.toString());
            }
            if (n5 < 0) {
                return 0;
            }
            n2 = 0;
        } else {
            if (this.z + n5 > 9) {
                throw new ArithmeticException("Conversion overflow: " + this.toString());
            }
            n2 = this.z;
        }
        int n6 = 0;
        int n7 = n5 + n2;
        for (n3 = 0; n3 <= n7; ++n3) {
            n6 *= 10;
            if (n3 > n5) continue;
            n6 += this.y[n3];
        }
        if (n5 + n2 == 9 && (n4 = n6 / 1000000000) != this.y[0]) {
            if (n6 == Integer.MIN_VALUE && this.w == -1 && this.y[0] == 2) {
                return n6;
            }
            throw new ArithmeticException("Conversion overflow: " + this.toString());
        }
        if (this.w == 1) {
            return n6;
        }
        return -n6;
    }

    public long longValue() {
        return this.k().longValue();
    }

    public long f() {
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        long l2 = 0L;
        if (this.w == 0) {
            return 0L;
        }
        int n5 = this.y.length - 1;
        if (this.z < 0) {
            if (!com.ibm.icu.c.a.b(this.y, n2 = (n5 += this.z) < 0 ? 0 : n5 + 1)) {
                throw new ArithmeticException("Decimal part non-zero: " + this.toString());
            }
            if (n5 < 0) {
                return 0L;
            }
            n3 = 0;
        } else {
            if (this.z + this.y.length > 18) {
                throw new ArithmeticException("Conversion overflow: " + this.toString());
            }
            n3 = this.z;
        }
        long l3 = 0L;
        int n6 = n5 + n3;
        for (n4 = 0; n4 <= n6; ++n4) {
            l3 *= 10L;
            if (n4 > n5) continue;
            l3 += (long)this.y[n4];
        }
        if (n5 + n3 == 18 && (l2 = l3 / 1000000000000000000L) != (long)this.y[0]) {
            if (l3 == Long.MIN_VALUE && this.w == -1 && this.y[0] == 9) {
                return l3;
            }
            throw new ArithmeticException("Conversion overflow: " + this.toString());
        }
        if (this.w == 1) {
            return l3;
        }
        return -l3;
    }

    public a a(int n2) {
        a a2 = com.ibm.icu.c.a.k(this);
        a2.z -= n2;
        return a2.a(s, false);
    }

    public a b(int n2) {
        a a2 = com.ibm.icu.c.a.k(this);
        a2.z += n2;
        return a2.a(s, false);
    }

    public int g() {
        if (this.z >= 0) {
            return 0;
        }
        return -this.z;
    }

    public a c(int n2) {
        return this.b(n2, 7);
    }

    public a b(int n2, int n3) {
        int n4 = 0;
        int n5 = 0;
        int n6 = this.g();
        if (n6 == n2 && this.x == 0) {
            return this;
        }
        a a2 = com.ibm.icu.c.a.k(this);
        if (n6 <= n2) {
            n4 = n6 == 0 ? a2.z + n2 : n2 - n6;
            a2.y = com.ibm.icu.c.a.a(a2.y, a2.y.length + n4);
            a2.z = -n2;
        } else {
            if (n2 < 0) {
                throw new ArithmeticException("Negative scale: " + n2);
            }
            n5 = a2.y.length - (n6 - n2);
            a2 = a2.d(n5, n3);
            if (a2.z != -n2) {
                a2.y = com.ibm.icu.c.a.a(a2.y, a2.y.length + 1);
                --a2.z;
            }
        }
        a2.x = 0;
        return a2;
    }

    public short h() {
        int n2 = this.e();
        if (n2 > 32767 | n2 < -32768) {
            throw new ArithmeticException("Conversion overflow: " + this.toString());
        }
        return (short)n2;
    }

    public int i() {
        return this.w;
    }

    public BigDecimal j() {
        return new BigDecimal(this.n(), this.g());
    }

    public BigInteger k() {
        a a2 = null;
        int n2 = 0;
        byte[] arrby = null;
        if (this.z >= 0 & this.x == 0) {
            a2 = this;
        } else if (this.z >= 0) {
            a2 = com.ibm.icu.c.a.k(this);
            a2.x = 0;
        } else if (-this.z >= this.y.length) {
            a2 = a;
        } else {
            a2 = com.ibm.icu.c.a.k(this);
            n2 = a2.y.length + a2.z;
            arrby = new byte[n2];
            System.arraycopy(a2.y, 0, arrby, 0, n2);
            a2.y = arrby;
            a2.x = 0;
            a2.z = 0;
        }
        return new BigInteger(new String(a2.o()));
    }

    public BigInteger l() {
        if (this.z < 0 && !com.ibm.icu.c.a.b(this.y, this.y.length + this.z)) {
            throw new ArithmeticException("Decimal part non-zero: " + this.toString());
        }
        return this.k();
    }

    public char[] m() {
        return this.o();
    }

    public String toString() {
        return new String(this.o());
    }

    public BigInteger n() {
        a a2 = null;
        if (this.z >= 0) {
            a2 = this;
        } else {
            a2 = com.ibm.icu.c.a.k(this);
            a2.z = 0;
        }
        return a2.k();
    }

    public static a a(double d2) {
        return new a(new Double(d2).toString());
    }

    public static a a(long l2) {
        return com.ibm.icu.c.a.a(l2, 0);
    }

    public static a a(long l2, int n2) {
        a a2 = null;
        a2 = l2 == 0L ? a : (l2 == 1L ? b : (l2 == 10L ? c : new a(l2)));
        if (n2 == 0) {
            return a2;
        }
        if (n2 < 0) {
            throw new NumberFormatException("Negative scale: " + n2);
        }
        a2 = com.ibm.icu.c.a.k(a2);
        a2.z = -n2;
        return a2;
    }

    private char[] o() {
        int n2 = 0;
        StringBuilder stringBuilder = null;
        int n3 = 0;
        int n4 = 0;
        char c2 = '\u0000';
        char[] arrc = null;
        int n5 = 0;
        char[] arrc2 = new char[this.y.length];
        int n6 = this.y.length;
        n2 = 0;
        while (n6 > 0) {
            arrc2[n2] = (char)(this.y[n2] + 48);
            --n6;
            ++n2;
        }
        if (this.x != 0) {
            stringBuilder = new StringBuilder(arrc2.length + 15);
            if (this.w == -1) {
                stringBuilder.append('-');
            }
            n3 = this.z + arrc2.length - 1;
            if (this.x == 1) {
                stringBuilder.append(arrc2[0]);
                if (arrc2.length > 1) {
                    stringBuilder.append('.').append(arrc2, 1, arrc2.length - 1);
                }
            } else {
                n4 = n3 % 3;
                if (n4 < 0) {
                    n4 = 3 + n4;
                }
                n3 -= n4;
                if (++n4 >= arrc2.length) {
                    stringBuilder.append(arrc2, 0, arrc2.length);
                    for (n6 = n4 - arrc2.length; n6 > 0; --n6) {
                        stringBuilder.append('0');
                    }
                } else {
                    stringBuilder.append(arrc2, 0, n4).append('.').append(arrc2, n4, arrc2.length - n4);
                }
            }
            if (n3 != 0) {
                if (n3 < 0) {
                    c2 = '-';
                    n3 = -n3;
                } else {
                    c2 = '+';
                }
                stringBuilder.append('E').append(c2).append(n3);
            }
            arrc = new char[stringBuilder.length()];
            n6 = stringBuilder.length();
            if (0 != n6) {
                stringBuilder.getChars(0, n6, arrc, 0);
            }
            return arrc;
        }
        if (this.z == 0) {
            if (this.w >= 0) {
                return arrc2;
            }
            arrc = new char[arrc2.length + 1];
            arrc[0] = 45;
            System.arraycopy(arrc2, 0, arrc, 1, arrc2.length);
            return arrc;
        }
        int n7 = this.w == -1 ? 1 : 0;
        int n8 = this.z + arrc2.length;
        if (n8 < 1) {
            n5 = n7 + 2 - this.z;
            arrc = new char[n5];
            if (n7 != 0) {
                arrc[0] = 45;
            }
            arrc[n7] = 48;
            arrc[n7 + 1] = 46;
            n6 = -n8;
            n2 = n7 + 2;
            while (n6 > 0) {
                arrc[n2] = 48;
                --n6;
                ++n2;
            }
            System.arraycopy(arrc2, 0, arrc, n7 + 2 - n8, arrc2.length);
            return arrc;
        }
        if (n8 > arrc2.length) {
            n5 = n7 + n8;
            arrc = new char[n5];
            if (n7 != 0) {
                arrc[0] = 45;
            }
            System.arraycopy(arrc2, 0, arrc, n7, arrc2.length);
            n6 = n8 - arrc2.length;
            n2 = n7 + arrc2.length;
            while (n6 > 0) {
                arrc[n2] = 48;
                --n6;
                ++n2;
            }
            return arrc;
        }
        n5 = n7 + 1 + arrc2.length;
        arrc = new char[n5];
        if (n7 != 0) {
            arrc[0] = 45;
        }
        System.arraycopy(arrc2, 0, arrc, n7, n8);
        arrc[n7 + n8] = 46;
        System.arraycopy(arrc2, n8, arrc, n7 + n8 + 1, arrc2.length - n8);
        return arrc;
    }

    private int c(int n2, int n3) {
        int n4 = this.e();
        if (n4 < n2 | n4 > n3) {
            throw new ArithmeticException("Conversion overflow: " + n4);
        }
        return n4;
    }

    private a a(char c2, a a2, b b2, int n2) {
        int n3;
        int n4 = 0;
        int n5 = 0;
        byte by2 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        byte[] arrby = null;
        byte by3 = 0;
        int n11 = 0;
        byte[] arrby2 = null;
        if (b2.n) {
            this.b(a2, b2.l);
        }
        a a3 = this;
        if (a2.w == 0) {
            throw new ArithmeticException("Divide by 0");
        }
        if (a3.w == 0) {
            if (b2.m != 0) {
                return a;
            }
            if (n2 == -1) {
                return a3;
            }
            return a3.c(n2);
        }
        int n12 = b2.l;
        if (n12 > 0) {
            if (a3.y.length > n12) {
                a3 = com.ibm.icu.c.a.k(a3).d(b2);
            }
            if (a2.y.length > n12) {
                a2 = com.ibm.icu.c.a.k(a2).d(b2);
            }
        } else {
            if (n2 == -1) {
                n2 = a3.g();
            }
            n12 = a3.y.length;
            if (n2 != -a3.z) {
                n12 = n12 + n2 + a3.z;
            }
            if ((n12 = n12 - (a2.y.length - 1) - a2.z) < a3.y.length) {
                n12 = a3.y.length;
            }
            if (n12 < a2.y.length) {
                n12 = a2.y.length;
            }
        }
        if ((n3 = a3.z - a2.z + a3.y.length - a2.y.length) < 0 && c2 != 'D') {
            if (c2 == 'I') {
                return a;
            }
            return com.ibm.icu.c.a.k(a3).a(b2, false);
        }
        a a4 = new a();
        a4.w = (byte)(a3.w * a2.w);
        a4.z = n3;
        a4.y = new byte[n12 + 1];
        int n13 = n12 + n12 + 1;
        byte[] arrby3 = com.ibm.icu.c.a.a(a3.y, n13);
        int n14 = n13;
        byte[] arrby4 = a2.y;
        int n15 = n13;
        int n16 = arrby4[0] * 10 + 1;
        if (arrby4.length > 1) {
            n16 += arrby4[1];
        }
        int n17 = 0;
        block0: while (true) {
            n4 = 0;
            block1: while (n14 >= n15) {
                int n18;
                if (n14 == n15) {
                    block42: {
                        n18 = n14;
                        n5 = 0;
                        while (n18 > 0) {
                            by2 = n5 < arrby4.length ? arrby4[n5] : (byte)0;
                            if (arrby3[n5] < by2) break block1;
                            if (arrby3[n5] <= by2) {
                                --n18;
                                ++n5;
                                continue;
                            }
                            break block42;
                        }
                        a4.y[n17] = (byte)(++n4);
                        ++n17;
                        arrby3[0] = 0;
                        break block0;
                    }
                    n6 = arrby3[0];
                } else {
                    n6 = arrby3[0] * 10;
                    if (n14 > 1) {
                        n6 += arrby3[1];
                    }
                }
                n7 = n6 * 10 / n16;
                if (n7 == 0) {
                    n7 = 1;
                }
                n4 += n7;
                if ((arrby3 = com.ibm.icu.c.a.a(arrby3, n14, arrby4, n15, -n7, true))[0] != 0) continue;
                n18 = n14 - 2;
                for (n8 = 0; n8 <= n18 && arrby3[n8] == 0; ++n8) {
                    --n14;
                }
                if (n8 == 0) continue;
                System.arraycopy(arrby3, n8, arrby3, 0, n14);
            }
            if (n17 != 0 | n4 != 0) {
                a4.y[n17] = (byte)n4;
                if (++n17 == n12 + 1 || arrby3[0] == 0) break;
            }
            if (n2 >= 0 && -a4.z > n2 || c2 != 'D' && a4.z <= 0) break;
            --a4.z;
            --n15;
        }
        if (n17 == 0) {
            n17 = 1;
        }
        if (c2 == 'I' | c2 == 'R') {
            if (n17 + a4.z > n12) {
                throw new ArithmeticException("Integer overflow");
            }
            if (c2 == 'R') {
                if (a4.y[0] == 0) {
                    return com.ibm.icu.c.a.k(a3).a(b2, false);
                }
                if (arrby3[0] == 0) {
                    return a;
                }
                a4.w = a3.w;
                n9 = n12 + n12 + 1 - a3.y.length;
                a4.z = a4.z - n9 + a3.z;
                n10 = n14;
                for (n5 = n10 - 1; n5 >= 1 && a4.z < a3.z & a4.z < a2.z && arrby3[n5] == 0; --n5) {
                    --n10;
                    ++a4.z;
                }
                if (n10 < arrby3.length) {
                    arrby = new byte[n10];
                    System.arraycopy(arrby3, 0, arrby, 0, n10);
                    arrby3 = arrby;
                }
                a4.y = arrby3;
                return a4.a(b2, false);
            }
        } else if (arrby3[0] != 0 && (by3 = a4.y[n17 - 1]) % 5 == 0) {
            a4.y[n17 - 1] = (byte)(by3 + 1);
        }
        if (n2 >= 0) {
            if (n17 != a4.y.length) {
                a4.z -= a4.y.length - n17;
            }
            n11 = a4.y.length - (-a4.z - n2);
            a4.d(n11, b2.o);
            if (a4.z != -n2) {
                a4.y = com.ibm.icu.c.a.a(a4.y, a4.y.length + 1);
                --a4.z;
            }
            return a4.a(b2, true);
        }
        if (n17 == a4.y.length) {
            a4.d(b2);
            n17 = n12;
        } else {
            if (a4.y[0] == 0) {
                return a;
            }
            arrby2 = new byte[n17];
            System.arraycopy(a4.y, 0, arrby2, 0, n17);
            a4.y = arrby2;
        }
        return a4.a(b2, true);
    }

    private void a(char[] arrc) {
        throw new NumberFormatException("Not a number: " + String.valueOf(arrc));
    }

    private void a(String string, int n2, String string2) {
        throw new IllegalArgumentException("Bad argument " + n2 + " " + "to" + " " + string + ":" + " " + string2);
    }

    private static final byte[] a(byte[] arrby, int n2) {
        if (arrby.length == n2) {
            return arrby;
        }
        byte[] arrby2 = new byte[n2];
        System.arraycopy(arrby, 0, arrby2, 0, arrby.length);
        return arrby2;
    }

    private static final byte[] a(byte[] arrby, int n2, byte[] arrby2, int n3, int n4, boolean bl2) {
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = arrby.length;
        int n9 = arrby2.length;
        int n10 = n3 - 1;
        int n11 = n10;
        int n12 = n2 - 1;
        if (n11 < n12) {
            n11 = n12;
        }
        byte[] arrby3 = null;
        if (bl2 && n11 + 1 == n8) {
            arrby3 = arrby;
        }
        if (arrby3 == null) {
            arrby3 = new byte[n11 + 1];
        }
        boolean bl3 = false;
        if (n4 == 1) {
            bl3 = true;
        } else if (n4 == -1) {
            bl3 = true;
        }
        int n13 = 0;
        for (n5 = n11; n5 >= 0; --n5) {
            if (n12 >= 0) {
                if (n12 < n8) {
                    n13 += arrby[n12];
                }
                --n12;
            }
            if (n10 >= 0) {
                if (n10 < n9) {
                    n13 = bl3 ? (n4 > 0 ? (n13 += arrby2[n10]) : (n13 -= arrby2[n10])) : (n13 += arrby2[n10] * n4);
                }
                --n10;
            }
            if (n13 < 10 && n13 >= 0) {
                arrby3[n5] = (byte)n13;
                n13 = 0;
                continue;
            }
            n6 = n13 + 90;
            arrby3[n5] = v[n6];
            n13 = u[n6];
        }
        if (n13 == 0) {
            return arrby3;
        }
        byte[] arrby4 = null;
        if (bl2 && n11 + 2 == arrby.length) {
            arrby4 = arrby;
        }
        if (arrby4 == null) {
            arrby4 = new byte[n11 + 2];
        }
        arrby4[0] = (byte)n13;
        if (n11 < 10) {
            int n14 = n11 + 1;
            n7 = 0;
            while (n14 > 0) {
                arrby4[n7 + 1] = arrby3[n7];
                --n14;
                ++n7;
            }
        } else {
            System.arraycopy(arrby3, 0, arrby4, 1, n11 + 1);
        }
        return arrby4;
    }

    private static final byte[] p() {
        int n2 = 0;
        int n3 = 0;
        byte[] arrby = new byte[190];
        for (n2 = 0; n2 <= 189; ++n2) {
            n3 = n2 - 90;
            if (n3 >= 0) {
                arrby[n2] = (byte)(n3 % 10);
                com.ibm.icu.c.a.u[n2] = (byte)(n3 / 10);
                continue;
            }
            arrby[n2] = (byte)((n3 += 100) % 10);
            com.ibm.icu.c.a.u[n2] = (byte)(n3 / 10 - 10);
        }
        return arrby;
    }

    private static final a k(a a2) {
        a a3 = new a();
        a3.w = a2.w;
        a3.z = a2.z;
        a3.x = a2.x;
        a3.y = a2.y;
        return a3;
    }

    private void b(a a2, int n2) {
        if (n2 == 0) {
            return;
        }
        if (this.y.length > n2 && !com.ibm.icu.c.a.b(this.y, n2)) {
            throw new ArithmeticException("Too many digits: " + this.toString());
        }
        if (a2 == null) {
            return;
        }
        if (a2.y.length > n2 && !com.ibm.icu.c.a.b(a2.y, n2)) {
            throw new ArithmeticException("Too many digits: " + a2.toString());
        }
    }

    private a d(b b2) {
        return this.d(b2.l, b2.o);
    }

    private a d(int n2, int n3) {
        boolean bl2 = false;
        byte by2 = 0;
        byte[] arrby = null;
        int n4 = this.y.length - n2;
        if (n4 <= 0) {
            return this;
        }
        this.z += n4;
        byte by3 = this.w;
        byte[] arrby2 = this.y;
        if (n2 > 0) {
            this.y = new byte[n2];
            System.arraycopy(arrby2, 0, this.y, 0, n2);
            bl2 = true;
            by2 = arrby2[n2];
        } else {
            this.y = com.ibm.icu.c.a.a.y;
            this.w = 0;
            bl2 = false;
            by2 = n2 == 0 ? arrby2[0] : (byte)0;
        }
        byte by4 = 0;
        if (n3 == 4) {
            if (by2 >= 5) {
                by4 = by3;
            }
        } else if (n3 == 7) {
            if (!com.ibm.icu.c.a.b(arrby2, n2)) {
                throw new ArithmeticException("Rounding necessary");
            }
        } else if (n3 == 5) {
            if (by2 > 5) {
                by4 = by3;
            } else if (by2 == 5 && !com.ibm.icu.c.a.b(arrby2, n2 + 1)) {
                by4 = by3;
            }
        } else if (n3 == 6) {
            if (by2 > 5) {
                by4 = by3;
            } else if (by2 == 5) {
                if (!com.ibm.icu.c.a.b(arrby2, n2 + 1)) {
                    by4 = by3;
                } else if (this.y[this.y.length - 1] % 2 != 0) {
                    by4 = by3;
                }
            }
        } else if (n3 != 1) {
            if (n3 == 0) {
                if (!com.ibm.icu.c.a.b(arrby2, n2)) {
                    by4 = by3;
                }
            } else if (n3 == 2) {
                if (by3 > 0 && !com.ibm.icu.c.a.b(arrby2, n2)) {
                    by4 = by3;
                }
            } else if (n3 == 3) {
                if (by3 < 0 && !com.ibm.icu.c.a.b(arrby2, n2)) {
                    by4 = by3;
                }
            } else {
                throw new IllegalArgumentException("Bad round value: " + n3);
            }
        }
        if (by4 != 0) {
            if (this.w == 0) {
                this.y = com.ibm.icu.c.a.b.y;
                this.w = by4;
            } else {
                if (this.w == -1) {
                    by4 = -by4;
                }
                if ((arrby = com.ibm.icu.c.a.a(this.y, this.y.length, com.ibm.icu.c.a.b.y, 1, by4, bl2)).length > this.y.length) {
                    ++this.z;
                    System.arraycopy(arrby, 0, this.y, 0, this.y.length);
                } else {
                    this.y = arrby;
                }
            }
        }
        if (this.z > 999999999) {
            throw new ArithmeticException("Exponent Overflow: " + this.z);
        }
        return this;
    }

    private static final boolean b(byte[] arrby, int n2) {
        int n3 = 0;
        if (n2 < 0) {
            n2 = 0;
        }
        int n4 = arrby.length - 1;
        for (n3 = n2; n3 <= n4; ++n3) {
            if (arrby[n3] == 0) continue;
            return false;
        }
        return true;
    }

    private a a(b b2, boolean bl2) {
        int n2 = 0;
        int n3 = 0;
        byte[] arrby = null;
        int n4 = 0;
        int n5 = 0;
        if (b2.l != 0 && this.y.length > b2.l) {
            this.d(b2);
        }
        if (bl2 && b2.m != 0) {
            n2 = this.y.length;
            for (n3 = n2 - 1; n3 >= 1 && this.y[n3] == 0; --n3) {
                --n2;
                ++this.z;
            }
            if (n2 < this.y.length) {
                arrby = new byte[n2];
                System.arraycopy(this.y, 0, arrby, 0, n2);
                this.y = arrby;
            }
        }
        this.x = 0;
        int n6 = this.y.length;
        n3 = 0;
        while (n6 > 0) {
            block21: {
                block22: {
                    block23: {
                        if (this.y[n3] == 0) break block21;
                        if (n3 > 0) {
                            arrby = new byte[this.y.length - n3];
                            System.arraycopy(this.y, n3, arrby, 0, this.y.length - n3);
                            this.y = arrby;
                        }
                        if ((n4 = this.z + this.y.length) > 0) {
                            if (n4 > b2.l && b2.l != 0) {
                                this.x = (byte)b2.m;
                            }
                            if (n4 - 1 <= 999999999) {
                                return this;
                            }
                        } else if (n4 < -5) {
                            this.x = (byte)b2.m;
                        }
                        if (!(--n4 < -999999999 | n4 > 999999999)) break block22;
                        if (this.x != 2) break block23;
                        n5 = n4 % 3;
                        if (n5 < 0) {
                            n5 = 3 + n5;
                        }
                        if ((n4 -= n5) >= -999999999 && n4 <= 999999999) break block22;
                    }
                    throw new ArithmeticException("Exponent Overflow: " + n4);
                }
                return this;
            }
            --n6;
            ++n3;
        }
        this.w = 0;
        if (b2.m != 0) {
            this.z = 0;
        } else if (this.z > 0) {
            this.z = 0;
        } else if (this.z < -999999999) {
            throw new ArithmeticException("Exponent Overflow: " + this.z);
        }
        this.y = com.ibm.icu.c.a.a.y;
        return this;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.b((a)object);
    }
}

