/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.gx;
import com.ibm.icu.b.b;
import com.ibm.icu.d.f;
import com.ibm.icu.d.g;
import com.ibm.icu.d.h;
import com.ibm.icu.d.i;
import com.ibm.icu.d.j;
import com.ibm.icu.d.k;
import com.ibm.icu.d.kx;
import com.ibm.icu.d.l;
import com.ibm.icu.d.m;
import java.awt.font.NumericShaper;
import java.awt.font.TextAttribute;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.text.AttributedCharacterIterator;
import java.util.Arrays;

public class d {
    public static final byte a = 126;
    public static final byte b = 127;
    public static final byte c = 61;
    public static final byte d = -128;
    public static final int e = -1;
    public static final byte f = 0;
    public static final byte g = 1;
    public static final byte h = 2;
    public static final byte i = 3;
    public static final short j = 1;
    public static final short k = 2;
    public static final short l = 4;
    public static final short m = 8;
    public static final short n = 16;
    public static final short o = 0;
    public static final short p = 1;
    public static final short q = 2;
    public static final short r = 3;
    public static final short s = 4;
    public static final short t = 5;
    public static final short u = 6;
    static final short v = 7;
    static final short w = 1;
    public static final int x = 0;
    public static final int y = 1;
    public static final int z = 2;
    public static final int A = 4;
    static final byte B = 0;
    static final byte C = 1;
    static final byte D = 2;
    static final byte E = 3;
    static final byte F = 4;
    static final byte G = 5;
    static final byte H = 6;
    static final byte I = 7;
    static final byte J = 8;
    static final byte K = 9;
    static final byte L = 10;
    static final byte M = 11;
    static final byte N = 12;
    static final byte O = 13;
    static final byte P = 14;
    static final byte Q = 15;
    static final byte R = 16;
    static final byte S = 17;
    static final byte T = 18;
    static final int U = 8194;
    public static final int V = 19;
    private static final char bk = '\r';
    private static final char bl = '\n';
    static final int W = 1;
    static final int X = 2;
    static final int Y = 4;
    static final int Z = 8;
    d aa;
    final gx ab;
    char[] ac;
    int ad;
    int ae;
    int af;
    boolean ag;
    boolean ah;
    byte[] ai = new byte[1];
    byte[] aj = new byte[1];
    byte[] ak;
    byte[] al;
    boolean am;
    int an;
    int ao;
    boolean ap;
    byte aq;
    byte ar;
    String as;
    String at;
    f au;
    byte av;
    int aw;
    int ax;
    int ay;
    int az;
    int[] aA = new int[1];
    int[] aB;
    int[] aC = new int[]{0};
    int aD;
    l[] aE = new l[0];
    l[] aF;
    l[] aG = new l[]{new l()};
    int[] aH;
    boolean aI;
    j aJ = null;
    g aK = new g();
    int aL;
    static final byte aM = 6;
    static final byte aN = 64;
    static final int aO = com.ibm.icu.d.d.a((byte)31);
    static final int[] aP = new int[]{com.ibm.icu.d.d.a((byte)0), com.ibm.icu.d.d.a((byte)1)};
    static final int[] aQ = new int[]{com.ibm.icu.d.d.a((byte)11), com.ibm.icu.d.d.a((byte)14)};
    static final int[] aR = new int[]{com.ibm.icu.d.d.a((byte)12), com.ibm.icu.d.d.a((byte)15)};
    static final int aS = com.ibm.icu.d.d.a((byte)0) | com.ibm.icu.d.d.a((byte)2) | com.ibm.icu.d.d.a((byte)5) | com.ibm.icu.d.d.a((byte)11) | com.ibm.icu.d.d.a((byte)12);
    static final int aT = com.ibm.icu.d.d.a((byte)1) | com.ibm.icu.d.d.a((byte)13) | com.ibm.icu.d.d.a((byte)14) | com.ibm.icu.d.d.a((byte)15);
    static final int aU = com.ibm.icu.d.d.a((byte)11) | com.ibm.icu.d.d.a((byte)12);
    static final int aV = com.ibm.icu.d.d.a((byte)14) | com.ibm.icu.d.d.a((byte)15);
    static final int aW = com.ibm.icu.d.d.a((byte)12) | com.ibm.icu.d.d.a((byte)15);
    static final int aX = aU | aV | com.ibm.icu.d.d.a((byte)16);
    static final int aY = com.ibm.icu.d.d.a((byte)18) | aX;
    static final int aZ = com.ibm.icu.d.d.a((byte)7) | com.ibm.icu.d.d.a((byte)8);
    static final int ba = aZ | com.ibm.icu.d.d.a((byte)9) | aY;
    static final int bb = com.ibm.icu.d.d.a((byte)10) | ba;
    static final int bc = com.ibm.icu.d.d.a((byte)4) | com.ibm.icu.d.d.a((byte)17) | aY;
    static final int bd = com.ibm.icu.d.d.a((byte)6) | com.ibm.icu.d.d.a((byte)3) | com.ibm.icu.d.d.a((byte)4) | bb;
    static final int be = com.ibm.icu.d.d.a((byte)17) | bd;
    private static final int bm = 14;
    private static final int bn = 13;
    private static final short[] bo = new short[]{0, 1, 2, 7, 8, 3, 9, 6, 5, 4, 4, 10, 10, 12, 10, 10, 10, 11, 10};
    private static final short bp = 0;
    private static final short bq = 1;
    private static final short br = 2;
    private static final short bs = 3;
    private static final short bt = 4;
    private static final short bu = 5;
    private static final short bv = 6;
    private static final short[][] bw = new short[][]{{1, 2, 4, 5, 7, 15, 17, 7, 9, 7, 0, 7, 3, 4}, {1, 34, 36, 37, 39, 47, 49, 39, 41, 39, 1, 1, 35, 0}, {33, 2, 36, 37, 39, 47, 49, 39, 41, 39, 2, 2, 35, 1}, {33, 34, 38, 38, 40, 48, 49, 40, 40, 40, 3, 3, 3, 1}, {33, 34, 4, 37, 39, 47, 49, 74, 11, 74, 4, 4, 35, 2}, {33, 34, 36, 5, 39, 47, 49, 39, 41, 76, 5, 5, 35, 3}, {33, 34, 6, 6, 40, 48, 49, 40, 40, 77, 6, 6, 35, 3}, {33, 34, 36, 37, 7, 47, 49, 7, 78, 7, 7, 7, 35, 4}, {33, 34, 38, 38, 8, 48, 49, 8, 8, 8, 8, 8, 35, 4}, {33, 34, 4, 37, 7, 47, 49, 7, 9, 7, 9, 9, 35, 4}, {97, 98, 4, 101, 135, 111, 113, 135, 142, 135, 10, 135, 99, 2}, {33, 34, 4, 37, 39, 47, 49, 39, 11, 39, 11, 11, 35, 2}, {97, 98, 100, 5, 135, 111, 113, 135, 142, 135, 12, 135, 99, 3}, {97, 98, 6, 6, 136, 112, 113, 136, 136, 136, 13, 136, 99, 3}, {33, 34, 132, 37, 7, 47, 49, 7, 14, 7, 14, 14, 35, 4}, {33, 34, 36, 37, 39, 15, 49, 39, 41, 39, 15, 39, 35, 5}, {33, 34, 38, 38, 40, 16, 49, 40, 40, 40, 16, 40, 35, 5}, {33, 34, 36, 37, 39, 47, 17, 39, 41, 39, 17, 39, 35, 6}};
    private static final int bx = 8;
    private static final int by = 7;
    private static final byte[][] bz = new byte[][]{{0, 1, 0, 2, 0, 0, 0, 0}, {0, 1, 3, 3, 20, 20, 0, 1}, {0, 1, 0, 2, 21, 21, 0, 2}, {0, 1, 3, 3, 20, 20, 0, 2}, {32, 1, 3, 3, 4, 4, 32, 1}, {32, 1, 32, 2, 5, 5, 32, 1}};
    private static final byte[][] bA = new byte[][]{{1, 0, 2, 2, 0, 0, 0, 0}, {1, 0, 1, 3, 20, 20, 0, 1}, {1, 0, 2, 2, 0, 0, 0, 1}, {1, 0, 1, 3, 5, 5, 0, 1}, {33, 0, 33, 3, 4, 4, 0, 0}, {1, 0, 1, 3, 5, 5, 0, 0}};
    private static final short[] bB = new short[]{0, 1, 2, 3, 4, 5, 6};
    private static final f bC = new f(bz, bA, bB, bB);
    private static final byte[][] bD = new byte[][]{{0, 2, 1, 1, 0, 0, 0, 0}, {0, 2, 1, 1, 0, 0, 0, 2}, {0, 2, 4, 4, 19, 0, 0, 1}, {32, 2, 4, 4, 3, 3, 32, 1}, {0, 2, 4, 4, 19, 19, 0, 2}};
    private static final f bE = new f(bD, bA, bB, bB);
    private static final byte[][] bF = new byte[][]{{0, 3, 17, 17, 0, 0, 0, 0}, {32, 3, 1, 1, 2, 32, 32, 2}, {32, 3, 1, 1, 2, 32, 32, 1}, {0, 3, 5, 5, 20, 0, 0, 1}, {32, 3, 5, 5, 4, 32, 32, 1}, {0, 3, 5, 5, 20, 0, 0, 2}};
    private static final byte[][] bG = new byte[][]{{2, 0, 1, 1, 0, 0, 0, 0}, {2, 0, 1, 1, 0, 0, 0, 1}, {2, 0, 20, 20, 19, 0, 0, 1}, {34, 0, 4, 4, 3, 0, 0, 0}, {34, 0, 4, 4, 3, 0, 0, 1}};
    private static final f bH = new f(bF, bG, bB, bB);
    private static final byte[][] bI = new byte[][]{{0, 1, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 20, 20, 0, 1}, {0, 1, 0, 0, 21, 21, 0, 2}, {0, 1, 0, 0, 20, 20, 0, 2}, {32, 1, 32, 32, 4, 4, 32, 1}, {32, 1, 32, 32, 5, 5, 32, 1}};
    private static final byte[][] bJ = new byte[][]{{1, 0, 1, 1, 0, 0, 0, 0}, {1, 0, 1, 1, 20, 20, 0, 1}, {1, 0, 1, 1, 0, 0, 0, 1}, {1, 0, 1, 1, 5, 5, 0, 1}, {33, 0, 33, 33, 4, 4, 0, 0}, {1, 0, 1, 1, 5, 5, 0, 0}};
    private static final f bK = new f(bI, bJ, bB, bB);
    private static final byte[][] bL = new byte[][]{{1, 0, 2, 2, 0, 0, 0, 0}, {1, 0, 1, 2, 19, 19, 0, 1}, {1, 0, 2, 2, 0, 0, 0, 1}, {33, 48, 6, 4, 3, 3, 48, 0}, {33, 48, 6, 4, 5, 5, 48, 3}, {33, 48, 6, 4, 5, 5, 48, 2}, {33, 48, 6, 4, 3, 3, 48, 1}};
    private static final short[] bM = new short[]{0, 1, 11, 12};
    private static final f bN = new f(bz, bL, bB, bM);
    private static final byte[][] bO = new byte[][]{{0, 99, 0, 1, 0, 0, 0, 0}, {0, 99, 0, 1, 18, 48, 0, 4}, {32, 99, 32, 1, 2, 48, 32, 3}, {0, 99, 85, 86, 20, 48, 0, 3}, {48, 67, 85, 86, 4, 48, 48, 3}, {48, 67, 5, 86, 20, 48, 48, 4}, {48, 67, 85, 6, 20, 48, 48, 4}};
    private static final byte[][] bP = new byte[][]{{19, 0, 1, 1, 0, 0, 0, 0}, {35, 0, 1, 1, 2, 64, 0, 1}, {35, 0, 1, 1, 2, 64, 0, 0}, {3, 0, 3, 54, 20, 64, 0, 1}, {83, 64, 5, 54, 4, 64, 64, 0}, {83, 64, 5, 54, 4, 64, 64, 1}, {83, 64, 6, 6, 4, 64, 64, 3}};
    private static final short[] bQ = new short[]{0, 1, 7, 8, 9, 10};
    private static final f bR = new f(bO, bP, bB, bQ);
    private static final f bS = new f(bD, bL, bB, bM);
    private static final byte[][] bT = new byte[][]{{0, 98, 1, 1, 0, 0, 0, 0}, {0, 98, 1, 1, 0, 48, 0, 4}, {0, 98, 84, 84, 19, 48, 0, 3}, {48, 66, 84, 84, 3, 48, 48, 3}, {48, 66, 4, 4, 19, 48, 48, 4}};
    private static final f bU = new f(bT, bP, bB, bQ);
    static final int bf = 10;
    public static final int bg = 0;
    public static final int bh = 1;
    public static final int bi = 126;
    public static final int bj = 127;

    static int a(byte by2) {
        return 1 << by2;
    }

    boolean a(int n2, int n3) {
        return (com.ibm.icu.d.d.a((byte)(this.ak[n3] & 0xFFFFFFBF)) & n2) != 0;
    }

    static byte b(byte by2) {
        return (byte)(by2 & 0xFFFFFFBF);
    }

    static int c(byte by2) {
        return 1 << (by2 & 0xFFFFFFBF);
    }

    static final int d(byte by2) {
        return aP[by2 & 1];
    }

    static final int e(byte by2) {
        return aQ[by2 & 1];
    }

    static final int f(byte by2) {
        return aR[by2 & 1];
    }

    static byte g(byte by2) {
        return (byte)(by2 & 1);
    }

    static boolean h(byte by2) {
        return (by2 & 0x7E) == 126;
    }

    byte a(int n2) {
        return this.ar != 0 ? (byte)(this.ak[n2] >> 6) : this.aq;
    }

    static boolean b(int n2) {
        return (n2 & 0xFFFFFFFC) == 8204 || n2 >= 8234 && n2 <= 8238;
    }

    void a() {
        if (this != this.aa) {
            throw new IllegalStateException();
        }
    }

    void b() {
        d d2 = this.aa;
        if (this == d2) {
            return;
        }
        if (d2 == null || d2 != d2.aa) {
            throw new IllegalStateException();
        }
    }

    void a(int n2, int n3, int n4) {
        if (n2 < n3 || n2 >= n4) {
            throw new IllegalArgumentException("Value " + n2 + " is out of range " + n3 + " to " + n4);
        }
    }

    public d() {
        this(0, 0);
    }

    public d(int n2, int n3) {
        if (n2 < 0 || n3 < 0) {
            throw new IllegalArgumentException();
        }
        this.ab = gx.a;
        if (n2 > 0) {
            this.v(n2);
            this.w(n2);
        } else {
            this.ag = true;
        }
        if (n3 > 0) {
            if (n3 > 1) {
                this.y(n3);
            }
        } else {
            this.ah = true;
        }
    }

    private Object a(String string, Object object, Class class_, boolean bl2, int n2) {
        int n3 = Array.getLength(object);
        if (n2 == n3) {
            return object;
        }
        if (!bl2) {
            if (n2 <= n3) {
                return object;
            }
            throw new OutOfMemoryError("Failed to allocate memory for " + string);
        }
        try {
            return Array.newInstance(class_, n2);
        }
        catch (Exception exception) {
            throw new OutOfMemoryError("Failed to allocate memory for " + string);
        }
    }

    private void a(boolean bl2, int n2) {
        Object object = this.a("DirProps", this.ai, Byte.TYPE, bl2, n2);
        this.ai = (byte[])object;
    }

    void c(int n2) {
        this.a(this.ag, n2);
    }

    private void b(boolean bl2, int n2) {
        Object object = this.a("Levels", this.aj, Byte.TYPE, bl2, n2);
        this.aj = (byte[])object;
    }

    void d(int n2) {
        this.b(this.ag, n2);
    }

    private void c(boolean bl2, int n2) {
        Object object = this.a("Runs", this.aE, l.class, bl2, n2);
        this.aE = (l[])object;
    }

    void e(int n2) {
        this.c(this.ah, n2);
    }

    private void v(int n2) {
        this.a(true, n2);
    }

    private void w(int n2) {
        this.b(true, n2);
    }

    private void x(int n2) {
        Object object = this.a("Paras", this.aA, Integer.TYPE, true, n2);
        this.aA = (int[])object;
    }

    private void y(int n2) {
        this.c(true, n2);
    }

    public void a(boolean bl2) {
        this.am = bl2;
        this.an = bl2 ? 4 : 0;
    }

    public boolean c() {
        return this.am;
    }

    public void f(int n2) {
        if (n2 < 0 || n2 >= 7) {
            return;
        }
        this.an = n2;
        this.am = n2 == 4;
    }

    public int d() {
        return this.an;
    }

    public void g(int n2) {
        this.ao = (n2 & 2) != 0 ? n2 & 0xFFFFFFFE : n2;
    }

    public int e() {
        return this.ao;
    }

    private byte A() {
        int n2;
        int n3 = 10;
        for (int i2 = 0; i2 < this.as.length(); i2 += Character.charCount(n2)) {
            n2 = this.as.codePointAt(i2);
            int n4 = this.l(n2);
            if (n3 != 10) continue;
            if (n4 != 0 && n4 != 1 && n4 != 13) continue;
            n3 = n4;
        }
        return (byte)n3;
    }

    private void B() {
        int n2;
        int n3;
        int n4;
        int n5 = 0;
        this.aw = 0;
        int n6 = 0;
        boolean bl2 = com.ibm.icu.d.d.h(this.aq);
        boolean bl3 = bl2 && (this.an == 5 || this.an == 6);
        this.ax = -1;
        this.aL = 0;
        boolean bl4 = (this.ao & 2) != 0;
        boolean bl5 = false;
        boolean bl6 = true;
        int n7 = 2;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        if ((this.ao & 4) > 0) {
            this.ae = 0;
            n10 = 0;
        }
        if (bl2) {
            byte by2;
            int n11 = n6 = (this.aq & 1) != 0 ? 64 : 0;
            if (this.as != null && (by2 = this.A()) != 10) {
                n4 = by2 == 0 ? 0 : 64;
                n3 = 2;
            } else {
                n4 = n6;
                n3 = 1;
            }
            n3 = 1;
        } else {
            n3 = 0;
            n4 = 0;
        }
        n5 = 0;
        while (n5 < this.ad) {
            int n12 = n5;
            int n13 = kx.a(this.ac, 0, this.ad, n5);
            n2 = (n5 += kx.a(n13)) - 1;
            byte by3 = (byte)this.l(n13);
            this.aw |= com.ibm.icu.d.d.a(by3);
            this.ak[n2] = (byte)(by3 | n4);
            if (n2 > n12) {
                this.aw |= com.ibm.icu.d.d.a((byte)18);
                do {
                    this.ak[--n2] = (byte)(0x12 | n4);
                } while (n2 > n12);
            }
            if (n3 == 1) {
                if (by3 == 0) {
                    n3 = 2;
                    if (n4 == 0) continue;
                    n4 = 0;
                    n2 = n8;
                    while (n2 < n5) {
                        int n14 = n2++;
                        this.ak[n14] = (byte)(this.ak[n14] & 0xFFFFFFBF);
                    }
                    continue;
                }
                if (by3 == 1 || by3 == 13) {
                    n3 = 2;
                    if (n4 != 0) continue;
                    n4 = 64;
                    n2 = n8;
                    while (n2 < n5) {
                        int n15 = n2++;
                        this.ak[n15] = (byte)(this.ak[n15] | 0x40);
                    }
                    continue;
                }
            }
            if (by3 == 0) {
                n9 = 0;
                n10 = n5;
            } else if (by3 == 1) {
                n9 = 64;
            } else if (by3 == 13) {
                n9 = 64;
                this.ax = n5 - 1;
            } else if (by3 == 7) {
                if ((this.ao & 4) != 0) {
                    this.ae = n5;
                }
                if (bl3 && n9 == 64 && n4 != n9) {
                    while (n8 < n5) {
                        int n16 = n8++;
                        this.ak[n16] = (byte)(this.ak[n16] | 0x40);
                    }
                }
                if (n5 < this.ad) {
                    if (n13 != 13 || this.ac[n5] != '\n') {
                        ++this.az;
                    }
                    if (bl2) {
                        n3 = 1;
                        n8 = n5;
                        n4 = n6;
                        n9 = n6;
                    }
                }
            }
            if (!bl4 || !com.ibm.icu.d.d.b(n13)) continue;
            ++this.aL;
        }
        if (bl3 && n9 == 64 && n4 != n9) {
            n2 = n8;
            while (n2 < this.ad) {
                int n17 = n2++;
                this.ak[n17] = (byte)(this.ak[n17] | 0x40);
            }
        }
        if (bl2) {
            this.aq = this.a(0);
        }
        if ((this.ao & 4) > 0) {
            if (n10 > this.ae && this.a(n10) == 0) {
                this.ae = n10;
            }
            if (this.ae < this.ad) {
                --this.az;
            }
        }
        this.aw |= com.ibm.icu.d.d.d(this.aq);
        if (this.ap && (this.aw & com.ibm.icu.d.d.a((byte)7)) != 0) {
            this.aw |= com.ibm.icu.d.d.a((byte)0);
        }
    }

    private byte C() {
        if ((this.aw & aT) == 0 && ((this.aw & com.ibm.icu.d.d.a((byte)5)) == 0 || (this.aw & bd) == 0)) {
            return 0;
        }
        if ((this.aw & aS) == 0) {
            return 1;
        }
        return 2;
    }

    private byte D() {
        int n2 = 0;
        byte by2 = this.a(0);
        int n3 = 0;
        byte by3 = this.C();
        if (by3 == 2 || this.az != 1) {
            if (this.az == 1 && ((this.aw & aX) == 0 || this.an > 1)) {
                for (n2 = 0; n2 < this.ae; ++n2) {
                    this.al[n2] = by2;
                }
            } else {
                byte by4 = by2;
                int n4 = 0;
                byte[] arrby = new byte[61];
                int n5 = 0;
                int n6 = 0;
                this.aw = 0;
                for (n2 = 0; n2 < this.ae; ++n2) {
                    byte by5 = com.ibm.icu.d.d.b(this.ak[n2]);
                    switch (by5) {
                        case 11: 
                        case 12: {
                            byte by6 = (byte)(by4 + 2 & 0x7E);
                            if (by6 <= 61) {
                                arrby[n4] = by4;
                                n4 = (byte)(n4 + 1);
                                by4 = by6;
                                if (by5 == 12) {
                                    by4 = (byte)(by4 | 0xFFFFFF80);
                                }
                            } else if ((by4 & 0x7F) == 61) {
                                ++n6;
                            } else {
                                ++n5;
                            }
                            this.aw |= com.ibm.icu.d.d.a((byte)18);
                            break;
                        }
                        case 14: 
                        case 15: {
                            byte by6 = (byte)((by4 & 0x7F) + 1 | 1);
                            if (by6 <= 61) {
                                arrby[n4] = by4;
                                n4 = (byte)(n4 + 1);
                                by4 = by6;
                                if (by5 == 15) {
                                    by4 = (byte)(by4 | 0xFFFFFF80);
                                }
                            } else {
                                ++n6;
                            }
                            this.aw |= com.ibm.icu.d.d.a((byte)18);
                            break;
                        }
                        case 16: {
                            if (n6 > 0) {
                                --n6;
                            } else if (n5 > 0 && (by4 & 0x7F) != 61) {
                                --n5;
                            } else if (n4 > 0) {
                                n4 = (byte)(n4 - 1);
                                by4 = arrby[n4];
                            }
                            this.aw |= com.ibm.icu.d.d.a((byte)18);
                            break;
                        }
                        case 7: {
                            n4 = 0;
                            n5 = 0;
                            n6 = 0;
                            by2 = this.a(n2);
                            if (n2 + 1 < this.ae) {
                                by4 = this.a(n2 + 1);
                                if (this.ac[n2] != '\r' || this.ac[n2 + 1] != '\n') {
                                    this.aB[n3++] = n2 + 1;
                                }
                            }
                            this.aw |= com.ibm.icu.d.d.a((byte)7);
                            break;
                        }
                        case 18: {
                            this.aw |= com.ibm.icu.d.d.a((byte)18);
                            break;
                        }
                        default: {
                            if (by2 != by4) {
                                by2 = by4;
                                this.aw = (by2 & 0xFFFFFF80) != 0 ? (this.aw |= com.ibm.icu.d.d.f(by2) | aO) : (this.aw |= com.ibm.icu.d.d.e(by2) | aO);
                            }
                            if ((by2 & 0xFFFFFF80) != 0) break;
                            this.aw |= com.ibm.icu.d.d.a(by5);
                        }
                    }
                    this.al[n2] = by2;
                }
                if ((this.aw & be) != 0) {
                    this.aw |= com.ibm.icu.d.d.d(this.aq);
                }
                if (this.ap && (this.aw & com.ibm.icu.d.d.a((byte)7)) != 0) {
                    this.aw |= com.ibm.icu.d.d.a((byte)0);
                }
                by3 = this.C();
            }
        }
        return by3;
    }

    private byte E() {
        this.aw = 0;
        int n2 = 0;
        for (int i2 = 0; i2 < this.ae; ++i2) {
            byte by2 = this.al[i2];
            byte by3 = com.ibm.icu.d.d.b(this.ak[i2]);
            if ((by2 & 0xFFFFFF80) != 0) {
                by2 = (byte)(by2 & 0x7F);
                this.aw |= com.ibm.icu.d.d.f(by2);
            } else {
                this.aw |= com.ibm.icu.d.d.e(by2) | com.ibm.icu.d.d.a(by3);
            }
            if (by2 < this.a(i2) && (0 != by2 || by3 != 7) || 61 < by2) {
                throw new IllegalArgumentException("level " + by2 + " out of bounds at " + i2);
            }
            if (by3 != 7 || i2 + 1 >= this.ae || this.ac[i2] == '\r' && this.ac[i2 + 1] == '\n') continue;
            this.aB[n2++] = i2 + 1;
        }
        if ((this.aw & be) != 0) {
            this.aw |= com.ibm.icu.d.d.d(this.aq);
        }
        return this.C();
    }

    private static short a(short s2) {
        return (short)(s2 & 0x1F);
    }

    private static short b(short s2) {
        return (short)(s2 >> 5);
    }

    private static short i(byte by2) {
        return (short)(by2 & 0xF);
    }

    private static short j(byte by2) {
        return (short)(by2 >> 4);
    }

    private void e(int n2, int n3) {
        i i2 = new i();
        int n4 = this.aK.c.length;
        if (n4 == 0) {
            this.aK.c = new i[10];
            n4 = 10;
        }
        if (this.aK.a >= n4) {
            i[] arri = this.aK.c;
            this.aK.c = new i[n4 * 2];
            System.arraycopy(arri, 0, this.aK.c, 0, n4);
        }
        i2.a = n2;
        i2.b = n3;
        this.aK.c[this.aK.a] = i2;
        ++this.aK.a;
    }

    private void a(h h2, short s2, int n2, int n3) {
        int n4;
        byte by2;
        byte[][] arrby = h2.a;
        short[] arrs = h2.b;
        int n5 = n2;
        short s3 = h2.f;
        byte by3 = arrby[s3][s2];
        h2.f = com.ibm.icu.d.d.i(by3);
        short s4 = arrs[com.ibm.icu.d.d.j(by3)];
        byte by4 = arrby[h2.f][7];
        if (s4 != 0) {
            switch (s4) {
                case 1: {
                    h2.c = n5;
                    break;
                }
                case 2: {
                    n2 = h2.c;
                    break;
                }
                case 3: {
                    if (h2.d >= 0) {
                        this.e(h2.d, 1);
                    }
                    h2.d = -1;
                    if (this.aK.c.length == 0 || this.aK.a <= this.aK.b) {
                        h2.e = -1;
                        by2 = arrby[s3][7];
                        if ((by2 & 1) != 0 && h2.c > 0) {
                            n2 = h2.c;
                        }
                        if (s2 != 5) break;
                        this.e(n5, 1);
                        this.aK.b = this.aK.a;
                        break;
                    }
                    for (n4 = h2.e + 1; n4 < n5; ++n4) {
                        this.al[n4] = (byte)(this.al[n4] - 2 & 0xFFFFFFFE);
                    }
                    this.aK.b = this.aK.a;
                    h2.e = -1;
                    if (s2 != 5) break;
                    this.e(n5, 1);
                    this.aK.b = this.aK.a;
                    break;
                }
                case 4: {
                    if (this.aK.c.length > 0) {
                        this.aK.a = this.aK.b;
                    }
                    h2.c = -1;
                    h2.d = -1;
                    h2.e = n3 - 1;
                    break;
                }
                case 5: {
                    if (s2 == 3 && com.ibm.icu.d.d.b(this.ak[n5]) == 5 && this.an != 6) {
                        if (h2.d == -1) {
                            h2.e = n3 - 1;
                            break;
                        }
                        if (h2.d >= 0) {
                            this.e(h2.d, 1);
                            h2.d = -2;
                        }
                        this.e(n5, 1);
                        break;
                    }
                    if (h2.d != -1) break;
                    h2.d = n5;
                    break;
                }
                case 6: {
                    h2.e = n3 - 1;
                    h2.c = -1;
                    break;
                }
                case 7: {
                    for (n4 = n5 - 1; n4 >= 0 && (this.al[n4] & 1) == 0; --n4) {
                    }
                    if (n4 >= 0) {
                        this.e(n4, 4);
                        this.aK.b = this.aK.a;
                    }
                    h2.c = n5;
                    break;
                }
                case 8: {
                    this.e(n5, 1);
                    this.e(n5, 2);
                    break;
                }
                case 9: {
                    this.aK.a = this.aK.b;
                    if (s2 != 5) break;
                    this.e(n5, 4);
                    this.aK.b = this.aK.a;
                    break;
                }
                case 10: {
                    by2 = (byte)(h2.g + by4);
                    for (n4 = h2.c; n4 < n5; ++n4) {
                        if (this.al[n4] >= by2) continue;
                        this.al[n4] = by2;
                    }
                    this.aK.b = this.aK.a;
                    h2.c = n5;
                    break;
                }
                case 11: {
                    by2 = h2.g;
                    for (n4 = n5 - 1; n4 >= h2.c; --n4) {
                        if (this.al[n4] == by2 + 3) {
                            while (this.al[n4] == by2 + 3) {
                                int n6 = n4--;
                                this.al[n6] = (byte)(this.al[n6] - 2);
                            }
                            while (this.al[n4] == by2) {
                                --n4;
                            }
                        }
                        this.al[n4] = this.al[n4] == by2 + 2 ? by2 : (byte)(by2 + 1);
                    }
                    break;
                }
                case 12: {
                    by2 = (byte)(h2.g + 1);
                    for (n4 = n5 - 1; n4 >= h2.c; --n4) {
                        if (this.al[n4] <= by2) continue;
                        int n7 = n4;
                        this.al[n7] = (byte)(this.al[n7] - 2);
                    }
                    break;
                }
                default: {
                    throw new IllegalStateException("Internal ICU error in processPropertySeq");
                }
            }
        }
        if (by4 != 0 || n2 < n5) {
            by2 = (byte)(h2.g + by4);
            for (n4 = n2; n4 < n3; ++n4) {
                this.al[n4] = by2;
            }
        }
    }

    private byte F() {
        int n2;
        for (int i2 = this.as.length(); i2 > 0; i2 -= Character.charCount(n2)) {
            n2 = this.as.codePointBefore(i2);
            byte by2 = (byte)this.l(n2);
            if (by2 == 0) {
                return 0;
            }
            if (by2 != 1 && by2 != 13) continue;
            return 1;
        }
        return 4;
    }

    private byte G() {
        int n2;
        for (int i2 = 0; i2 < this.at.length(); i2 += Character.charCount(n2)) {
            n2 = this.at.codePointAt(i2);
            byte by2 = (byte)this.l(n2);
            if (by2 == 0) {
                return 0;
            }
            if (by2 == 1 || by2 == 13) {
                return 1;
            }
            if (by2 != 2) continue;
            return 2;
        }
        return 4;
    }

    private void a(int n2, int n3, short s2, short s3) {
        short s4;
        h h2 = new h(null);
        int n4 = 1;
        int n5 = -1;
        boolean bl2 = n2 < this.ax && (this.a(n2) & 1) > 0 && (this.an == 5 || this.an == 6);
        h2.d = -1;
        h2.e = -1;
        h2.f = 0;
        h2.g = this.al[n2];
        h2.a = this.au.a[h2.g & 1];
        h2.b = this.au.b[h2.g & 1];
        if (n2 == 0 && this.as != null && (s4 = this.F()) != 4) {
            s2 = s4;
        }
        this.a(h2, s2, n2, n2);
        short s5 = com.ibm.icu.d.d.b(this.ak[n2]) == 17 ? (short)(1 + s2) : (short)0;
        int n6 = n2;
        int n7 = 0;
        block6: for (int i2 = n2; i2 <= n3; ++i2) {
            short s6;
            if (i2 >= n3) {
                s6 = s3;
            } else {
                s4 = com.ibm.icu.d.d.b(this.ak[i2]);
                if (bl2) {
                    if (s4 == 13) {
                        s4 = 1;
                    } else if (s4 == 2) {
                        if (n5 <= i2) {
                            n4 = 1;
                            n5 = n3;
                            for (int i3 = i2 + 1; i3 < n3; ++i3) {
                                short s7 = com.ibm.icu.d.d.b(this.ak[i3]);
                                if (s7 != 0 && s7 != 1 && s7 != 13) continue;
                                n4 = s7;
                                n5 = i3;
                                break;
                            }
                        }
                        if (n4 == 13) {
                            s4 = (short)5;
                        }
                    }
                }
                s6 = bo[s4];
            }
            short s8 = s5;
            short s9 = bw[s8][s6];
            s5 = com.ibm.icu.d.d.a(s9);
            short s10 = com.ibm.icu.d.d.b(s9);
            if (i2 == n3 && s10 == 0) {
                s10 = 1;
            }
            if (s10 == 0) continue;
            short s11 = bw[s8][13];
            switch (s10) {
                case 1: {
                    this.a(h2, s11, n6, i2);
                    n6 = i2;
                    continue block6;
                }
                case 2: {
                    n7 = i2;
                    continue block6;
                }
                case 3: {
                    this.a(h2, s11, n6, n7);
                    this.a(h2, (short)4, n7, i2);
                    n6 = i2;
                    continue block6;
                }
                case 4: {
                    this.a(h2, s11, n6, n7);
                    n6 = n7;
                    n7 = i2;
                    continue block6;
                }
                default: {
                    throw new IllegalStateException("Internal ICU error in resolveImplicitLevels");
                }
            }
        }
        if (n3 == this.ae && this.at != null && (s4 = (short)this.G()) != 4) {
            s3 = s4;
        }
        this.a(h2, s3, n3, n3);
    }

    private void H() {
        if ((this.aw & ba) != 0) {
            int n2 = this.ay;
            block0: while (n2 > 0) {
                int n3;
                while (n2 > 0 && ((n3 = com.ibm.icu.d.d.c(this.ak[--n2])) & ba) != 0) {
                    if (this.ap && (n3 & com.ibm.icu.d.d.a((byte)7)) != 0) {
                        this.al[n2] = 0;
                        continue;
                    }
                    this.al[n2] = this.a(n2);
                }
                while (n2 > 0) {
                    if (((n3 = com.ibm.icu.d.d.c(this.ak[--n2])) & aY) != 0) {
                        this.al[n2] = this.al[n2 + 1];
                        continue;
                    }
                    if (this.ap && (n3 & com.ibm.icu.d.d.a((byte)7)) != 0) {
                        this.al[n2] = 0;
                        continue block0;
                    }
                    if ((n3 & aZ) == 0) continue;
                    this.al[n2] = this.a(n2);
                    continue block0;
                }
            }
        }
    }

    int b(int n2, int n3) {
        return n2 < n3 ? n2 : n3;
    }

    int h(int n2) {
        return n2 >= 0 ? n2 : -n2;
    }

    void a(char[] arrc, byte by2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        this.an = 0;
        int n7 = arrc.length;
        if (n7 == 0) {
            this.a(arrc, by2, null);
            this.an = 3;
            return;
        }
        int n8 = this.ao;
        if ((n8 & 1) > 0) {
            this.ao &= 0xFFFFFFFE;
            this.ao |= 2;
        }
        by2 = (byte)(by2 & 1);
        this.a(arrc, by2, null);
        byte[] arrby = new byte[this.ae];
        System.arraycopy(this.p(), 0, arrby, 0, this.ae);
        int n9 = this.ay;
        String string = this.u(2);
        int[] arrn = this.s();
        this.ao = n8;
        int n10 = this.ae;
        byte by3 = this.av;
        this.an = 5;
        by2 = (byte)(by2 ^ 1);
        this.a(string, by2, null);
        com.ibm.icu.d.k.c(this);
        int n11 = 0;
        int n12 = this.aD;
        int n13 = 0;
        int n14 = 0;
        while (n14 < n12) {
            n6 = this.aF[n14].b - n13;
            if (n6 >= 2) {
                n5 = this.aF[n14].a;
                for (n4 = n5 + 1; n4 < n5 + n6; ++n4) {
                    n3 = arrn[n4];
                    n2 = arrn[n4 - 1];
                    if (this.h(n3 - n2) == 1 && arrby[n3] == arrby[n2]) continue;
                    ++n11;
                }
            }
            ++n14;
            n13 += n6;
        }
        if (n11 > 0) {
            this.e(n12 + n11);
            if (this.aD == 1) {
                this.aE[0] = this.aF[0];
            } else {
                System.arraycopy(this.aF, 0, this.aE, 0, this.aD);
            }
            this.aF = this.aE;
            this.aD += n11;
            for (n14 = n12; n14 < this.aD; ++n14) {
                if (this.aF[n14] != null) continue;
                this.aF[n14] = new l(0, 0, 0);
            }
        }
        for (n14 = n12 - 1; n14 >= 0; --n14) {
            int n15;
            int n16;
            int n17;
            int n18;
            int n19 = n14 + n11;
            n6 = n14 == 0 ? this.aF[0].b : this.aF[n14].b - this.aF[n14 - 1].b;
            n5 = this.aF[n14].a;
            int n20 = this.aF[n14].d & 1;
            if (n6 < 2) {
                if (n11 > 0) {
                    this.aF[n19].a(this.aF[n14]);
                }
                this.aF[n19].a = n18 = arrn[n5];
                this.aF[n19].d = (byte)(arrby[n18] ^ n20);
                continue;
            }
            if (n20 > 0) {
                n17 = n5;
                n16 = n5 + n6 - 1;
                n15 = 1;
            } else {
                n17 = n5 + n6 - 1;
                n16 = n5;
                n15 = -1;
            }
            for (n4 = n17; n4 != n16; n4 += n15) {
                int n21;
                n3 = arrn[n4];
                n2 = arrn[n4 + n15];
                if (this.h(n3 - n2) == 1 && arrby[n3] == arrby[n2]) continue;
                this.aF[n19].a = n18 = this.b(arrn[n17], n3);
                this.aF[n19].d = (byte)(arrby[n18] ^ n20);
                this.aF[n19].b = this.aF[n14].b;
                this.aF[n14].b -= this.h(n4 - n17) + 1;
                this.aF[n19].c = n21 = this.aF[n14].c & 0xA;
                this.aF[n14].c &= ~n21;
                n17 = n4 + n15;
                --n11;
                --n19;
            }
            if (n11 > 0) {
                this.aF[n19].a(this.aF[n14]);
            }
            this.aF[n19].a = n18 = this.b(arrn[n17], arrn[n16]);
            this.aF[n19].d = (byte)(arrby[n18] ^ n20);
        }
        this.aq = (byte)(this.aq ^ 1);
        this.ac = arrc;
        this.ae = n10;
        this.ad = n7;
        this.av = by3;
        this.al = arrby;
        this.ay = n9;
        if (this.aD > 1) {
            this.av = (byte)2;
        }
        this.an = 3;
    }

    private void I() {
        this.as = null;
        this.at = null;
        this.aa = this;
    }

    public void a(String string, String string2) {
        this.as = string != null && string.length() > 0 ? string : null;
        this.at = string2 != null && string2.length() > 0 ? string2 : null;
    }

    public void a(String string, byte by2, byte[] arrby) {
        if (string == null) {
            this.a(new char[0], by2, arrby);
        } else {
            this.a(string.toCharArray(), by2, arrby);
        }
    }

    public void a(char[] arrc, byte by2, byte[] arrby) {
        int n2;
        int n3;
        byte by3;
        byte by4;
        int n4;
        if (by2 < 126) {
            this.a(by2, 0, 62);
        }
        if (arrc == null) {
            arrc = new char[]{};
        }
        if (this.an == 3) {
            this.a(arrc, by2);
            return;
        }
        this.aa = null;
        this.ac = arrc;
        this.ad = this.af = this.ac.length;
        this.ae = this.af;
        this.aq = by2;
        this.av = 0;
        this.az = 1;
        this.ak = new byte[0];
        this.al = new byte[0];
        this.aF = new l[0];
        this.aI = false;
        this.aK.a = 0;
        this.aK.b = 0;
        this.ar = com.ibm.icu.d.d.h(by2) ? by2 : (byte)0;
        if (this.ae == 0) {
            if (com.ibm.icu.d.d.h(by2)) {
                this.aq = (byte)(this.aq & 1);
                this.ar = 0;
            }
            if ((this.aq & 1) != 0) {
                this.aw = com.ibm.icu.d.d.a((byte)1);
                this.av = 1;
            } else {
                this.aw = com.ibm.icu.d.d.a((byte)0);
                this.av = 0;
            }
            this.aD = 0;
            this.az = 0;
            this.I();
            return;
        }
        this.aD = -1;
        this.c(this.ae);
        this.ak = this.ai;
        this.B();
        this.ay = this.ae;
        if (this.az > 1) {
            this.x(this.az);
            this.aB = this.aA;
            this.aB[this.az - 1] = this.ae;
        } else {
            this.aB = this.aC;
            this.aC[0] = this.ae;
        }
        if (arrby == null) {
            this.d(this.ae);
            this.al = this.aj;
            this.av = this.D();
        } else {
            this.al = arrby;
            this.av = this.E();
        }
        switch (this.av) {
            case 0: {
                by2 = (byte)(by2 + 1 & 0xFFFFFFFE);
                this.ay = 0;
                break;
            }
            case 1: {
                by2 = (byte)(by2 | 1);
                this.ay = 0;
                break;
            }
            default: {
                switch (this.an) {
                    case 0: {
                        this.au = bC;
                        break;
                    }
                    case 1: {
                        this.au = bE;
                        break;
                    }
                    case 2: {
                        this.au = bH;
                        break;
                    }
                    case 3: {
                        throw new InternalError("Internal ICU error in setPara");
                    }
                    case 4: {
                        this.au = bK;
                        break;
                    }
                    case 5: {
                        if ((this.ao & 1) != 0) {
                            this.au = bR;
                            break;
                        }
                        this.au = bN;
                        break;
                    }
                    case 6: {
                        this.au = (this.ao & 1) != 0 ? bU : bS;
                    }
                }
                if (arrby == null && this.az <= 1 && (this.aw & aO) == 0) {
                    this.a(0, this.ae, com.ibm.icu.d.d.g(this.a(0)), com.ibm.icu.d.d.g(this.a(this.ae - 1)));
                } else {
                    n4 = 0;
                    by4 = this.a(0);
                    int n5 = by4 < (by3 = this.al[0]) ? (int)com.ibm.icu.d.d.g(by3) : (short)com.ibm.icu.d.d.g(by4);
                    do {
                        n3 = n4;
                        by4 = by3;
                        n2 = n3 > 0 && com.ibm.icu.d.d.b(this.ak[n3 - 1]) == 7 ? (int)com.ibm.icu.d.d.g(this.a(n3)) : n5;
                        while (++n4 < this.ae && this.al[n4] == by4) {
                        }
                        by3 = n4 < this.ae ? this.al[n4] : (byte)this.a(this.ae - 1);
                        n5 = (by4 & 0x7F) < (by3 & 0x7F) ? (int)com.ibm.icu.d.d.g(by3) : (int)com.ibm.icu.d.d.g(by4);
                        if ((by4 & 0xFFFFFF80) == 0) {
                            this.a(n3, n4, (short)n2, (short)n5);
                            continue;
                        }
                        do {
                            int n6 = n3++;
                            this.al[n6] = (byte)(this.al[n6] & 0x7F);
                        } while (n3 < n4);
                    } while (n4 < this.ae);
                }
                this.H();
            }
        }
        if (this.ar > 0 && (this.ao & 1) != 0 && (this.an == 5 || this.an == 6)) {
            block16: for (by3 = 0; by3 < this.az; ++by3) {
                n4 = this.aB[by3] - 1;
                if ((this.ak[n4] & 0x40) == 0) continue;
                n3 = by3 == 0 ? 0 : this.aB[by3 - 1];
                for (n2 = n4; n2 >= n3; --n2) {
                    by4 = com.ibm.icu.d.d.b(this.ak[n2]);
                    if (by4 == 0) {
                        if (n2 < n4) {
                            while (com.ibm.icu.d.d.b(this.ak[n4]) == 7) {
                                --n4;
                            }
                        }
                        this.e(n4, 4);
                        continue block16;
                    }
                    if ((com.ibm.icu.d.d.a(by4) & 0x2002) != 0) continue block16;
                }
            }
        }
        this.af = (this.ao & 2) != 0 ? (this.af -= this.aL) : (this.af += this.aK.a);
        this.I();
    }

    public void a(AttributedCharacterIterator attributedCharacterIterator) {
        Serializable serializable;
        Boolean bl2 = (Boolean)attributedCharacterIterator.getAttribute(TextAttribute.RUN_DIRECTION);
        byte by2 = bl2 == null ? (byte)126 : (bl2.equals(TextAttribute.RUN_DIRECTION_LTR) ? (byte)0 : 1);
        byte[] arrby = null;
        int n2 = attributedCharacterIterator.getEndIndex() - attributedCharacterIterator.getBeginIndex();
        byte[] arrby2 = new byte[n2];
        char[] arrc = new char[n2];
        int n3 = 0;
        char c2 = attributedCharacterIterator.first();
        while (c2 != '\uffff') {
            byte by3;
            arrc[n3] = c2;
            serializable = (Integer)attributedCharacterIterator.getAttribute(TextAttribute.BIDI_EMBEDDING);
            if (serializable != null && (by3 = ((Integer)serializable).byteValue()) != 0) {
                if (by3 < 0) {
                    arrby = arrby2;
                    arrby2[n3] = (byte)(0 - by3 | 0xFFFFFF80);
                } else {
                    arrby = arrby2;
                    arrby2[n3] = by3;
                }
            }
            c2 = attributedCharacterIterator.next();
            ++n3;
        }
        serializable = (NumericShaper)attributedCharacterIterator.getAttribute(TextAttribute.NUMERIC_SHAPING);
        if (serializable != null) {
            ((NumericShaper)serializable).shape(arrc, 0, n2);
        }
        this.a(arrc, by2, arrby);
    }

    public void b(boolean bl2) {
        this.ap = bl2;
    }

    public boolean f() {
        return this.ap;
    }

    public byte g() {
        this.b();
        return this.av;
    }

    public String h() {
        this.b();
        return new String(this.ac);
    }

    public char[] i() {
        this.b();
        return this.ac;
    }

    public int j() {
        this.b();
        return this.ad;
    }

    public int k() {
        this.b();
        return this.ae;
    }

    public int l() {
        this.b();
        return this.af;
    }

    public byte m() {
        this.b();
        return this.aq;
    }

    public int n() {
        this.b();
        return this.az;
    }

    public l i(int n2) {
        this.b();
        this.a(n2, 0, this.az);
        d d2 = this.aa;
        int n3 = n2 == 0 ? 0 : d2.aB[n2 - 1];
        l l2 = new l();
        l2.a = n3;
        l2.b = d2.aB[n2];
        l2.d = this.a(n3);
        return l2;
    }

    public l j(int n2) {
        this.b();
        d d2 = this.aa;
        this.a(n2, 0, d2.ae);
        int n3 = 0;
        while (n2 >= d2.aB[n3]) {
            ++n3;
        }
        return this.i(n3);
    }

    public int k(int n2) {
        this.b();
        d d2 = this.aa;
        this.a(n2, 0, d2.ae);
        int n3 = 0;
        while (n2 >= d2.aB[n3]) {
            ++n3;
        }
        return n3;
    }

    public void a(j j2) {
        this.aJ = j2;
    }

    public j o() {
        return this.aJ;
    }

    public int l(int n2) {
        int n3;
        if (this.aJ == null || (n3 = this.aJ.a(n2)) == 19) {
            return this.ab.b(n2);
        }
        return n3;
    }

    public d c(int n2, int n3) {
        this.a();
        this.a(n2, 0, n3);
        this.a(n3, 0, this.ae + 1);
        if (this.k(n2) != this.k(n3 - 1)) {
            throw new IllegalArgumentException();
        }
        return com.ibm.icu.d.k.a(this, n2, n3);
    }

    public byte m(int n2) {
        this.b();
        this.a(n2, 0, this.ae);
        return com.ibm.icu.d.k.a(this, n2);
    }

    public byte[] p() {
        this.b();
        if (this.ae <= 0) {
            return new byte[0];
        }
        return com.ibm.icu.d.k.b(this);
    }

    public l n(int n2) {
        this.b();
        this.a(n2, 0, this.ae);
        return com.ibm.icu.d.k.b(this, n2);
    }

    public int q() {
        this.b();
        com.ibm.icu.d.k.c(this);
        return this.aD;
    }

    public l o(int n2) {
        this.b();
        com.ibm.icu.d.k.c(this);
        this.a(n2, 0, this.aD);
        return com.ibm.icu.d.k.c(this, n2);
    }

    public int p(int n2) {
        this.b();
        this.a(n2, 0, this.ae);
        return com.ibm.icu.d.k.e(this, n2);
    }

    public int q(int n2) {
        this.b();
        this.a(n2, 0, this.af);
        if (this.aK.a == 0 && this.aL == 0) {
            if (this.av == 0) {
                return n2;
            }
            if (this.av == 1) {
                return this.ae - n2 - 1;
            }
        }
        com.ibm.icu.d.k.c(this);
        return com.ibm.icu.d.k.f(this, n2);
    }

    public int[] r() {
        this.q();
        if (this.ae <= 0) {
            return new int[0];
        }
        return com.ibm.icu.d.k.d(this);
    }

    public int[] s() {
        this.q();
        if (this.af <= 0) {
            return new int[0];
        }
        return com.ibm.icu.d.k.e(this);
    }

    public static int[] a(byte[] arrby) {
        return com.ibm.icu.d.k.a(arrby);
    }

    public static int[] b(byte[] arrby) {
        return com.ibm.icu.d.k.b(arrby);
    }

    public static int[] a(int[] arrn) {
        if (arrn == null) {
            return null;
        }
        return com.ibm.icu.d.k.a(arrn);
    }

    public d(String string, int n2) {
        this(string.toCharArray(), 0, null, 0, string.length(), n2);
    }

    public d(AttributedCharacterIterator attributedCharacterIterator) {
        this();
        this.a(attributedCharacterIterator);
    }

    public d(char[] arrc, int n2, byte[] arrby, int n3, int n4, int n5) {
        this();
        byte[] arrby2;
        byte by2;
        switch (n5) {
            default: {
                by2 = 0;
                break;
            }
            case 1: {
                by2 = 1;
                break;
            }
            case 126: {
                by2 = 126;
                break;
            }
            case 127: {
                by2 = 127;
            }
        }
        if (arrby == null) {
            arrby2 = null;
        } else {
            arrby2 = new byte[n4];
            for (int i2 = 0; i2 < n4; ++i2) {
                byte by3 = arrby[i2 + n3];
                if (by3 < 0) {
                    by3 = (byte)(-by3 | 0xFFFFFF80);
                } else if (by3 == 0) {
                    by3 = by2;
                    if (by2 > 61) {
                        by3 = (byte)(by3 & 1);
                    }
                }
                arrby2[i2] = by3;
            }
        }
        if (n2 == 0 && n3 == 0 && n4 == arrc.length) {
            this.a(arrc, by2, arrby2);
        } else {
            char[] arrc2 = new char[n4];
            System.arraycopy(arrc, n2, arrc2, 0, n4);
            this.a(arrc2, by2, arrby2);
        }
    }

    public d d(int n2, int n3) {
        return this.c(n2, n3);
    }

    public boolean t() {
        return !this.u() && !this.v();
    }

    public boolean u() {
        return this.g() == 0 && (this.aq & 1) == 0;
    }

    public boolean v() {
        return this.g() == 1 && (this.aq & 1) == 1;
    }

    public boolean w() {
        return this.m() == 0;
    }

    public int x() {
        return this.m();
    }

    public int y() {
        return this.q();
    }

    void z() {
        int n2;
        if (this.aI) {
            return;
        }
        int n3 = this.q();
        if (this.aH == null || this.aH.length < n3) {
            this.aH = new int[n3];
        }
        long[] arrl = new long[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            arrl[n2] = ((long)this.aF[n2].a << 32) + (long)n2;
        }
        Arrays.sort(arrl);
        for (n2 = 0; n2 < n3; ++n2) {
            this.aH[n2] = (int)(arrl[n2] & 0xFFFFFFFFFFFFFFFFL);
        }
        this.aI = true;
    }

    public int r(int n2) {
        this.b();
        com.ibm.icu.d.k.c(this);
        this.a(n2, 0, this.aD);
        this.z();
        return this.aF[this.aH[n2]].d;
    }

    public int s(int n2) {
        this.b();
        com.ibm.icu.d.k.c(this);
        this.a(n2, 0, this.aD);
        this.z();
        return this.aF[this.aH[n2]].a;
    }

    public int t(int n2) {
        this.b();
        com.ibm.icu.d.k.c(this);
        this.a(n2, 0, this.aD);
        this.z();
        int n3 = this.aH[n2];
        int n4 = n3 == 0 ? this.aF[n3].b : this.aF[n3].b - this.aF[n3 - 1].b;
        return this.aF[n3].a + n4;
    }

    public static boolean a(char[] arrc, int n2, int n3) {
        int n4 = 57378;
        for (int i2 = n2; i2 < n3; ++i2) {
            if ((1 << com.ibm.icu.b.b.E(arrc[i2]) & 0xE022) == 0) continue;
            return true;
        }
        return false;
    }

    public static void a(byte[] arrby, int n2, Object[] arrobject, int n3, int n4) {
        byte[] arrby2 = new byte[n4];
        System.arraycopy(arrby, n2, arrby2, 0, n4);
        int[] arrn = com.ibm.icu.d.d.b(arrby2);
        Object[] arrobject2 = new Object[n4];
        System.arraycopy(arrobject, n3, arrobject2, 0, n4);
        for (int i2 = 0; i2 < n4; ++i2) {
            arrobject[n3 + i2] = arrobject2[arrn[i2]];
        }
    }

    public String u(int n2) {
        this.b();
        if (this.ae == 0) {
            return "";
        }
        return com.ibm.icu.d.m.a(this, n2);
    }

    public static String a(String string, int n2) {
        if (string == null) {
            throw new IllegalArgumentException();
        }
        if (string.length() > 0) {
            return com.ibm.icu.d.m.a(string, n2);
        }
        return "";
    }

    public static byte a(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return 3;
        }
        int n2 = charSequence.length();
        int n3 = 0;
        while (n3 < n2) {
            int n4 = com.ibm.icu.b.b.a(charSequence, n3);
            byte by2 = com.ibm.icu.b.b.aa(n4);
            if (by2 == 0) {
                return 0;
            }
            if (by2 == 1 || by2 == 13) {
                return 1;
            }
            n3 = com.ibm.icu.b.b.b(charSequence, n3, 1);
        }
        return 3;
    }
}

