/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.a;

import io.netty.b.bi;
import io.netty.b.g;
import io.netty.c.a.a.c;

public final class a {
    private static final int a = 76;
    private static final byte b = 61;
    private static final byte c = 10;
    private static final byte d = -5;
    private static final byte e = -1;

    private static byte[] a(c c2) {
        if (c2 == null) {
            throw new NullPointerException("dialect");
        }
        return c2.d;
    }

    private static byte[] b(c c2) {
        if (c2 == null) {
            throw new NullPointerException("dialect");
        }
        return c2.e;
    }

    private static boolean c(c c2) {
        if (c2 == null) {
            throw new NullPointerException("dialect");
        }
        return c2.f;
    }

    public static g a(g g2) {
        return io.netty.c.a.a.a.a(g2, io.netty.c.a.a.c.a);
    }

    public static g a(g g2, c c2) {
        return io.netty.c.a.a.a.a(g2, io.netty.c.a.a.a.c(c2), c2);
    }

    public static g a(g g2, boolean bl2) {
        return io.netty.c.a.a.a.a(g2, bl2, io.netty.c.a.a.c.a);
    }

    public static g a(g g2, boolean bl2, c c2) {
        if (g2 == null) {
            throw new NullPointerException("src");
        }
        g g3 = io.netty.c.a.a.a.a(g2, g2.p(), g2.r(), bl2, c2);
        g2.g(g2.q());
        return g3;
    }

    public static g a(g g2, int n2, int n3) {
        return io.netty.c.a.a.a.a(g2, n2, n3, io.netty.c.a.a.c.a);
    }

    public static g a(g g2, int n2, int n3, c c2) {
        return io.netty.c.a.a.a.a(g2, n2, n3, io.netty.c.a.a.a.c(c2), c2);
    }

    public static g a(g g2, int n2, int n3, boolean bl2) {
        return io.netty.c.a.a.a.a(g2, n2, n3, bl2, io.netty.c.a.a.c.a);
    }

    public static g a(g g2, int n2, int n3, boolean bl2, c c2) {
        if (g2 == null) {
            throw new NullPointerException("src");
        }
        if (c2 == null) {
            throw new NullPointerException("dialect");
        }
        int n4 = n3 * 4 / 3;
        g g3 = bi.a(n4 + (n3 % 3 > 0 ? 4 : 0) + (bl2 ? n4 / 76 : 0)).a(g2.m());
        int n5 = 0;
        int n6 = 0;
        int n7 = n3 - 2;
        int n8 = 0;
        while (n5 < n7) {
            io.netty.c.a.a.a.a(g2, n5 + n2, 3, g3, n6, c2);
            if (bl2 && (n8 += 4) == 76) {
                g3.b(n6 + 4, 10);
                ++n6;
                n8 = 0;
            }
            n5 += 3;
            n6 += 4;
        }
        if (n5 < n3) {
            io.netty.c.a.a.a.a(g2, n5 + n2, n3 - n5, g3, n6, c2);
            n6 += 4;
        }
        return g3.i(0, n6);
    }

    private static void a(g g2, int n2, int n3, g g3, int n4, c c2) {
        byte[] arrby = io.netty.c.a.a.a.a(c2);
        int n5 = (n3 > 0 ? g2.m(n2) << 24 >>> 8 : 0) | (n3 > 1 ? g2.m(n2 + 1) << 24 >>> 16 : 0) | (n3 > 2 ? g2.m(n2 + 2) << 24 >>> 24 : 0);
        switch (n3) {
            case 3: {
                g3.b(n4, (int)arrby[n5 >>> 18]);
                g3.b(n4 + 1, (int)arrby[n5 >>> 12 & 0x3F]);
                g3.b(n4 + 2, (int)arrby[n5 >>> 6 & 0x3F]);
                g3.b(n4 + 3, (int)arrby[n5 & 0x3F]);
                break;
            }
            case 2: {
                g3.b(n4, (int)arrby[n5 >>> 18]);
                g3.b(n4 + 1, (int)arrby[n5 >>> 12 & 0x3F]);
                g3.b(n4 + 2, (int)arrby[n5 >>> 6 & 0x3F]);
                g3.b(n4 + 3, 61);
                break;
            }
            case 1: {
                g3.b(n4, (int)arrby[n5 >>> 18]);
                g3.b(n4 + 1, (int)arrby[n5 >>> 12 & 0x3F]);
                g3.b(n4 + 2, 61);
                g3.b(n4 + 3, 61);
            }
        }
    }

    public static g b(g g2) {
        return io.netty.c.a.a.a.b(g2, io.netty.c.a.a.c.a);
    }

    public static g b(g g2, c c2) {
        if (g2 == null) {
            throw new NullPointerException("src");
        }
        g g3 = io.netty.c.a.a.a.b(g2, g2.p(), g2.r(), c2);
        g2.g(g2.q());
        return g3;
    }

    public static g b(g g2, int n2, int n3) {
        return io.netty.c.a.a.a.b(g2, n2, n3, io.netty.c.a.a.c.a);
    }

    public static g b(g g2, int n2, int n3, c c2) {
        if (g2 == null) {
            throw new NullPointerException("src");
        }
        if (c2 == null) {
            throw new NullPointerException("dialect");
        }
        byte[] arrby = io.netty.c.a.a.a.b(c2);
        int n4 = n3 * 3 / 4;
        g g3 = g2.l().a(n4).a(g2.m());
        int n5 = 0;
        byte[] arrby2 = new byte[4];
        int n6 = 0;
        for (int i2 = n2; i2 < n2 + n3; ++i2) {
            byte by2 = (byte)(g2.m(i2) & 0x7F);
            byte by3 = arrby[by2];
            if (by3 >= -5) {
                if (by3 < -1) continue;
                arrby2[n6++] = by2;
                if (n6 <= 3) continue;
                n5 += io.netty.c.a.a.a.a(arrby2, 0, g3, n5, c2);
                n6 = 0;
                if (by2 != 61) continue;
                break;
            }
            throw new IllegalArgumentException("bad Base64 input character at " + i2 + ": " + g2.n(i2) + " (decimal)");
        }
        return g3.i(0, n5);
    }

    private static int a(byte[] arrby, int n2, g g2, int n3, c c2) {
        int n4;
        byte[] arrby2 = io.netty.c.a.a.a.b(c2);
        if (arrby[n2 + 2] == 61) {
            int n5 = (arrby2[arrby[n2]] & 0xFF) << 18 | (arrby2[arrby[n2 + 1]] & 0xFF) << 12;
            g2.b(n3, (int)((byte)(n5 >>> 16)));
            return 1;
        }
        if (arrby[n2 + 3] == 61) {
            int n6 = (arrby2[arrby[n2]] & 0xFF) << 18 | (arrby2[arrby[n2 + 1]] & 0xFF) << 12 | (arrby2[arrby[n2 + 2]] & 0xFF) << 6;
            g2.b(n3, (int)((byte)(n6 >>> 16)));
            g2.b(n3 + 1, (int)((byte)(n6 >>> 8)));
            return 2;
        }
        try {
            n4 = (arrby2[arrby[n2]] & 0xFF) << 18 | (arrby2[arrby[n2 + 1]] & 0xFF) << 12 | (arrby2[arrby[n2 + 2]] & 0xFF) << 6 | arrby2[arrby[n2 + 3]] & 0xFF;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new IllegalArgumentException("not encoded in Base64");
        }
        g2.b(n3, (int)((byte)(n4 >> 16)));
        g2.b(n3 + 1, (int)((byte)(n4 >> 8)));
        g2.b(n3 + 2, (int)((byte)n4));
        return 3;
    }

    private a() {
    }
}

