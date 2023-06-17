/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.a;

import java.math.BigInteger;
import org.apache.commons.a.a.g;
import org.apache.commons.a.a.h;
import org.apache.commons.a.a.m;

public class d
extends g {
    private static final int i = 6;
    private static final int j = 3;
    private static final int k = 4;
    static final byte[] a = new byte[]{13, 10};
    private static final byte[] l = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] m = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] n = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    private static final int o = 63;
    private final byte[] p;
    private final byte[] q = n;
    private final byte[] r;
    private final int s;
    private final int t;

    public d() {
        this(0);
    }

    public d(boolean bl2) {
        this(76, a, bl2);
    }

    public d(int n2) {
        this(n2, a);
    }

    public d(int n2, byte[] arrby) {
        this(n2, arrby, false);
    }

    public d(int n2, byte[] arrby, boolean bl2) {
        super(3, 4, n2, arrby == null ? 0 : arrby.length);
        if (arrby != null) {
            if (this.n(arrby)) {
                String string = org.apache.commons.a.a.m.f(arrby);
                throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + string + "]");
            }
            if (n2 > 0) {
                this.t = 4 + arrby.length;
                this.r = new byte[arrby.length];
                System.arraycopy(arrby, 0, this.r, 0, arrby.length);
            } else {
                this.t = 4;
                this.r = null;
            }
        } else {
            this.t = 4;
            this.r = null;
        }
        this.s = this.t - 1;
        this.p = bl2 ? m : l;
    }

    public boolean a() {
        return this.p == m;
    }

    @Override
    void b(byte[] arrby, int n2, int n3, h h2) {
        if (h2.f) {
            return;
        }
        if (n3 < 0) {
            h2.f = true;
            if (0 == h2.h && this.h == 0) {
                return;
            }
            byte[] arrby2 = this.a(this.t, h2);
            int n4 = h2.d;
            switch (h2.h) {
                case 0: {
                    break;
                }
                case 1: {
                    arrby2[h2.d++] = this.p[h2.a >> 2 & 0x3F];
                    arrby2[h2.d++] = this.p[h2.a << 4 & 0x3F];
                    if (this.p != l) break;
                    arrby2[h2.d++] = 61;
                    arrby2[h2.d++] = 61;
                    break;
                }
                case 2: {
                    arrby2[h2.d++] = this.p[h2.a >> 10 & 0x3F];
                    arrby2[h2.d++] = this.p[h2.a >> 4 & 0x3F];
                    arrby2[h2.d++] = this.p[h2.a << 2 & 0x3F];
                    if (this.p != l) break;
                    arrby2[h2.d++] = 61;
                    break;
                }
                default: {
                    throw new IllegalStateException("Impossible modulus " + h2.h);
                }
            }
            h2.g += h2.d - n4;
            if (this.h > 0 && h2.g > 0) {
                System.arraycopy(this.r, 0, arrby2, h2.d, this.r.length);
                h2.d += this.r.length;
            }
        } else {
            for (int i2 = 0; i2 < n3; ++i2) {
                int n5;
                byte[] arrby3 = this.a(this.t, h2);
                h2.h = (h2.h + 1) % 3;
                if ((n5 = arrby[n2++]) < 0) {
                    n5 += 256;
                }
                h2.a = (h2.a << 8) + n5;
                if (0 != h2.h) continue;
                arrby3[h2.d++] = this.p[h2.a >> 18 & 0x3F];
                arrby3[h2.d++] = this.p[h2.a >> 12 & 0x3F];
                arrby3[h2.d++] = this.p[h2.a >> 6 & 0x3F];
                arrby3[h2.d++] = this.p[h2.a & 0x3F];
                h2.g += 4;
                if (this.h <= 0 || this.h > h2.g) continue;
                System.arraycopy(this.r, 0, arrby3, h2.d, this.r.length);
                h2.d += this.r.length;
                h2.g = 0;
            }
        }
    }

    @Override
    void a(byte[] arrby, int n2, int n3, h h2) {
        if (h2.f) {
            return;
        }
        if (n3 < 0) {
            h2.f = true;
        }
        for (int i2 = 0; i2 < n3; ++i2) {
            byte by2;
            byte by3;
            byte[] arrby2 = this.a(this.s, h2);
            if ((by3 = arrby[n2++]) == 61) {
                h2.f = true;
                break;
            }
            if (by3 < 0 || by3 >= n.length || (by2 = n[by3]) < 0) continue;
            h2.h = (h2.h + 1) % 4;
            h2.a = (h2.a << 6) + by2;
            if (h2.h != 0) continue;
            arrby2[h2.d++] = (byte)(h2.a >> 16 & 0xFF);
            arrby2[h2.d++] = (byte)(h2.a >> 8 & 0xFF);
            arrby2[h2.d++] = (byte)(h2.a & 0xFF);
        }
        if (h2.f && h2.h != 0) {
            byte[] arrby3 = this.a(this.s, h2);
            switch (h2.h) {
                case 1: {
                    break;
                }
                case 2: {
                    h2.a >>= 4;
                    arrby3[h2.d++] = (byte)(h2.a & 0xFF);
                    break;
                }
                case 3: {
                    h2.a >>= 2;
                    arrby3[h2.d++] = (byte)(h2.a >> 8 & 0xFF);
                    arrby3[h2.d++] = (byte)(h2.a & 0xFF);
                    break;
                }
                default: {
                    throw new IllegalStateException("Impossible modulus " + h2.h);
                }
            }
        }
    }

    public static boolean c(byte[] arrby) {
        return org.apache.commons.a.a.d.d(arrby);
    }

    public static boolean b(byte by2) {
        return by2 == 61 || by2 >= 0 && by2 < n.length && n[by2] != -1;
    }

    public static boolean a(String string) {
        return org.apache.commons.a.a.d.d(org.apache.commons.a.a.m.f(string));
    }

    public static boolean d(byte[] arrby) {
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            if (org.apache.commons.a.a.d.b(arrby[i2]) || org.apache.commons.a.a.d.c(arrby[i2])) continue;
            return false;
        }
        return true;
    }

    public static byte[] e(byte[] arrby) {
        return org.apache.commons.a.a.d.a(arrby, false);
    }

    public static String f(byte[] arrby) {
        return org.apache.commons.a.a.m.f(org.apache.commons.a.a.d.a(arrby, false));
    }

    public static byte[] g(byte[] arrby) {
        return org.apache.commons.a.a.d.a(arrby, false, true);
    }

    public static String h(byte[] arrby) {
        return org.apache.commons.a.a.m.f(org.apache.commons.a.a.d.a(arrby, false, true));
    }

    public static byte[] i(byte[] arrby) {
        return org.apache.commons.a.a.d.a(arrby, true);
    }

    public static byte[] a(byte[] arrby, boolean bl2) {
        return org.apache.commons.a.a.d.a(arrby, bl2, false);
    }

    public static byte[] a(byte[] arrby, boolean bl2, boolean bl3) {
        return org.apache.commons.a.a.d.a(arrby, bl2, bl3, Integer.MAX_VALUE);
    }

    public static byte[] a(byte[] arrby, boolean bl2, boolean bl3, int n2) {
        if (arrby == null || arrby.length == 0) {
            return arrby;
        }
        d d2 = bl2 ? new d(bl3) : new d(0, a, bl3);
        long l2 = d2.o(arrby);
        if (l2 > (long)n2) {
            throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + l2 + ") than the specified maximum size of " + n2);
        }
        return d2.b(arrby);
    }

    public static byte[] b(String string) {
        return new d().c(string);
    }

    public static byte[] j(byte[] arrby) {
        return new d().a(arrby);
    }

    public static BigInteger k(byte[] arrby) {
        return new BigInteger(1, org.apache.commons.a.a.d.j(arrby));
    }

    public static byte[] a(BigInteger bigInteger) {
        if (bigInteger == null) {
            throw new NullPointerException("encodeInteger called with null parameter");
        }
        return org.apache.commons.a.a.d.a(org.apache.commons.a.a.d.b(bigInteger), false);
    }

    static byte[] b(BigInteger bigInteger) {
        int n2 = bigInteger.bitLength();
        n2 = n2 + 7 >> 3 << 3;
        byte[] arrby = bigInteger.toByteArray();
        if (bigInteger.bitLength() % 8 != 0 && bigInteger.bitLength() / 8 + 1 == n2 / 8) {
            return arrby;
        }
        int n3 = 0;
        int n4 = arrby.length;
        if (bigInteger.bitLength() % 8 == 0) {
            n3 = 1;
            --n4;
        }
        int n5 = n2 / 8 - n4;
        byte[] arrby2 = new byte[n2 / 8];
        System.arraycopy(arrby, n3, arrby2, n5, n4);
        return arrby2;
    }

    @Override
    protected boolean a(byte by2) {
        return by2 >= 0 && by2 < this.q.length && this.q[by2] != -1;
    }
}

