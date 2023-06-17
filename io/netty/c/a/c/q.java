/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.c;

import io.netty.b.g;
import io.netty.b.w;
import io.netty.c.a.c.b;
import io.netty.c.a.c.c;
import io.netty.c.a.c.s;

class q {
    private static final int a = 16384;
    private static final int b = 15;
    private static final int c = -1;
    private static final int d = -1;
    private static final int e = 0;
    private static final int f = 1;
    private static final int g = 2;
    private static final int h = 3;
    private s i = s.a;
    private byte j;
    private int k;

    q() {
    }

    public void a() {
        this.i = s.a;
        this.j = 0;
        this.k = 0;
    }

    public void a(g g2, g g3, int n2) {
        int n3;
        int n4 = 0;
        while (true) {
            if (((n3 = n2 >>> n4 * 7) & 0xFFFFFF80) == 0) break;
            g3.B(n3 & 0x7F | 0x80);
            ++n4;
        }
        g3.B(n3);
        n3 = n4 = g2.p();
        short[] arrs = q.b(n2);
        int n5 = 32 - (int)Math.floor(Math.log(arrs.length) / Math.log(2.0));
        int n6 = n4;
        if (n2 - n4 >= 15) {
            int n7 = q.b(g2, ++n4, n5);
            block1: while (true) {
                int n8;
                int n9;
                int n10;
                int n11 = 32;
                int n12 = n4;
                do {
                    n4 = n12;
                    n9 = n7;
                    if ((n12 = n4 + (n8 = n11++ >> 5)) > n2 - 4) break block1;
                    n7 = q.b(g2, n12, n5);
                    n10 = n3 + arrs[n9];
                    arrs[n9] = (short)(n4 - n3);
                } while (g2.s(n4) != g2.s(n10));
                q.b(g2, g3, n4 - n6);
                do {
                    n8 = n4;
                    int n13 = 4 + q.a(g2, n10 + 4, n4 + 4, n2);
                    int n14 = n8 - n10;
                    q.d(g3, n14, n13);
                    g2.g(g2.p() + n13);
                    n9 = (n4 += n13) - 1;
                    n6 = n4;
                    if (n4 >= n2 - 4) break block1;
                    int n15 = q.b(g2, n9, n5);
                    arrs[n15] = (short)(n4 - n3 - 1);
                    int n16 = q.b(g2, n9 + 1, n5);
                    n10 = n3 + arrs[n16];
                    arrs[n16] = (short)(n4 - n3);
                } while (g2.s(n9 + 1) == g2.s(n10));
                n7 = q.b(g2, n9 + 2, n5);
                ++n4;
            }
        }
        if (n6 < n2) {
            q.b(g2, g3, n2 - n6);
        }
    }

    private static int b(g g2, int n2, int n3) {
        return g2.s(n2) + 506832829 >>> n3;
    }

    private static short[] b(int n2) {
        int n3;
        for (n3 = 256; n3 < 16384 && n3 < n2; n3 <<= 1) {
        }
        short[] arrs = n3 <= 256 ? new short[256] : new short[16384];
        return arrs;
    }

    private static int a(g g2, int n2, int n3, int n4) {
        int n5 = 0;
        while (n3 <= n4 - 4 && g2.s(n3) == g2.s(n2 + n5)) {
            n3 += 4;
            n5 += 4;
        }
        while (n3 < n4 && g2.m(n2 + n5) == g2.m(n3)) {
            ++n3;
            ++n5;
        }
        return n5;
    }

    private static int c(int n2) {
        int n3 = Integer.highestOneBit(n2);
        int n4 = 0;
        while ((n3 >>= 1) != 0) {
            ++n4;
        }
        return n4;
    }

    private static void b(g g2, g g3, int n2) {
        if (n2 < 61) {
            g3.B(n2 - 1 << 2);
        } else {
            int n3 = q.c(n2 - 1);
            int n4 = 1 + n3 / 8;
            g3.B(59 + n4 << 2);
            for (int i2 = 0; i2 < n4; ++i2) {
                g3.B(n2 - 1 >> i2 * 8 & 0xFF);
            }
        }
        g3.b(g2, n2);
    }

    private static void c(g g2, int n2, int n3) {
        if (n3 < 12 && n2 < 2048) {
            g2.B(1 | n3 - 4 << 2 | n2 >> 8 << 5);
            g2.B(n2 & 0xFF);
        } else {
            g2.B(2 | n3 - 1 << 2);
            g2.B(n2 & 0xFF);
            g2.B(n2 >> 8 & 0xFF);
        }
    }

    private static void d(g g2, int n2, int n3) {
        while (n3 >= 68) {
            q.c(g2, n2, 64);
            n3 -= 64;
        }
        if (n3 > 64) {
            q.c(g2, n2, 60);
            n3 -= 60;
        }
        q.c(g2, n2, n3);
    }

    public void a(g g2, g g3) {
        while (g2.u()) {
            block0 : switch (this.i) {
                case a: {
                    this.i = s.b;
                }
                case b: {
                    int n2 = q.b(g2);
                    if (n2 == -1) {
                        return;
                    }
                    if (n2 == 0) {
                        this.i = s.a;
                        return;
                    }
                    g3.k(n2);
                    this.i = s.c;
                }
                case c: {
                    if (!g2.u()) {
                        return;
                    }
                    this.j = g2.E();
                    switch (this.j & 3) {
                        case 0: {
                            this.i = s.d;
                            break block0;
                        }
                        case 1: 
                        case 2: 
                        case 3: {
                            this.i = s.e;
                        }
                    }
                    break;
                }
                case d: {
                    int n3 = q.a(this.j, g2, g3);
                    if (n3 != -1) {
                        this.i = s.c;
                        this.k += n3;
                        break;
                    }
                    return;
                }
                case e: {
                    switch (this.j & 3) {
                        case 1: {
                            int n4 = q.a(this.j, g2, g3, this.k);
                            if (n4 != -1) {
                                this.i = s.c;
                                this.k += n4;
                                break block0;
                            }
                            return;
                        }
                        case 2: {
                            int n4 = q.b(this.j, g2, g3, this.k);
                            if (n4 != -1) {
                                this.i = s.c;
                                this.k += n4;
                                break block0;
                            }
                            return;
                        }
                        case 3: {
                            int n4 = q.c(this.j, g2, g3, this.k);
                            if (n4 != -1) {
                                this.i = s.c;
                                this.k += n4;
                                break block0;
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    private static int b(g g2) {
        int n2 = 0;
        int n3 = 0;
        while (g2.u()) {
            short s2 = g2.F();
            n2 |= (s2 & 0x7F) << n3++ * 7;
            if ((s2 & 0x80) == 0) {
                return n2;
            }
            if (n3 < 4) continue;
            throw new c("Preamble is greater than 4 bytes");
        }
        return 0;
    }

    private static int a(byte by2, g g2, g g3) {
        int n2;
        g2.x();
        switch (by2 >> 2 & 0x3F) {
            case 60: {
                if (!g2.u()) {
                    return -1;
                }
                n2 = g2.F();
                break;
            }
            case 61: {
                if (g2.r() < 2) {
                    return -1;
                }
                n2 = w.a(g2.G());
                break;
            }
            case 62: {
                if (g2.r() < 3) {
                    return -1;
                }
                n2 = w.a(g2.J());
                break;
            }
            case 64: {
                if (g2.r() < 4) {
                    return -1;
                }
                n2 = w.b(g2.K());
                break;
            }
            default: {
                n2 = by2 >> 2 & 0x3F;
            }
        }
        if (g2.r() < ++n2) {
            g2.y();
            return -1;
        }
        g3.b(g2, n2);
        return n2;
    }

    private static int a(byte by2, g g2, g g3, int n2) {
        if (!g2.u()) {
            return -1;
        }
        int n3 = g3.q();
        int n4 = 4 + ((by2 & 0x1C) >> 2);
        int n5 = (by2 & 0xE0) << 8 >> 5 | g2.F();
        q.a(n5, n2);
        g3.x();
        if (n5 < n4) {
            for (int i2 = n4 / n5; i2 > 0; --i2) {
                g3.g(n3 - n5);
                g3.a(g3, n5);
            }
            if (n4 % n5 != 0) {
                g3.g(n3 - n5);
                g3.a(g3, n4 % n5);
            }
        } else {
            g3.g(n3 - n5);
            g3.a(g3, n4);
        }
        g3.y();
        return n4;
    }

    private static int b(byte by2, g g2, g g3, int n2) {
        if (g2.r() < 2) {
            return -1;
        }
        int n3 = g3.q();
        int n4 = 1 + (by2 >> 2 & 0x3F);
        short s2 = w.a(g2.G());
        q.a((int)s2, n2);
        g3.x();
        if (s2 < n4) {
            for (int i2 = n4 / s2; i2 > 0; --i2) {
                g3.g(n3 - s2);
                g3.a(g3, (int)s2);
            }
            if (n4 % s2 != 0) {
                g3.g(n3 - s2);
                g3.a(g3, n4 % s2);
            }
        } else {
            g3.g(n3 - s2);
            g3.a(g3, n4);
        }
        g3.y();
        return n4;
    }

    private static int c(byte by2, g g2, g g3, int n2) {
        if (g2.r() < 4) {
            return -1;
        }
        int n3 = g3.q();
        int n4 = 1 + (by2 >> 2 & 0x3F);
        int n5 = w.b(g2.K());
        q.a(n5, n2);
        g3.x();
        if (n5 < n4) {
            for (int i2 = n4 / n5; i2 > 0; --i2) {
                g3.g(n3 - n5);
                g3.a(g3, n5);
            }
            if (n4 % n5 != 0) {
                g3.g(n3 - n5);
                g3.a(g3, n4 % n5);
            }
        } else {
            g3.g(n3 - n5);
            g3.a(g3, n4);
        }
        g3.y();
        return n4;
    }

    private static void a(int n2, int n3) {
        if (n2 > 32767) {
            throw new c("Offset exceeds maximum permissible value");
        }
        if (n2 <= 0) {
            throw new c("Offset is less than minimum permissible value");
        }
        if (n2 > n3) {
            throw new c("Offset exceeds size of chunk");
        }
    }

    public static int a(g g2) {
        return q.a(g2, g2.p(), g2.r());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int a(g g2, int n2, int n3) {
        b b2 = new b();
        try {
            if (g2.W()) {
                b2.update(g2.X(), g2.Y() + n2, n3);
            } else {
                byte[] arrby = new byte[n3];
                g2.a(n2, arrby);
                b2.update(arrby, 0, n3);
            }
            int n4 = q.a((int)b2.getValue());
            return n4;
        }
        finally {
            b2.reset();
        }
    }

    static void a(int n2, g g2) {
        q.a(n2, g2, g2.p(), g2.r());
    }

    static void a(int n2, g g2, int n3, int n4) {
        int n5 = q.a(g2, n3, n4);
        if (n5 != n2) {
            throw new c("mismatching checksum: " + Integer.toHexString(n5) + " (expected: " + Integer.toHexString(n2) + ')');
        }
    }

    static int a(int n2) {
        return (n2 >> 15 | n2 << 17) + -1568478504;
    }
}

