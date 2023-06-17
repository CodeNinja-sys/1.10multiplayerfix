/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ag;
import com.ibm.icu.a.am;
import com.ibm.icu.a.gl;
import com.ibm.icu.a.gs;
import com.ibm.icu.a.hl;
import com.ibm.icu.a.hm;
import com.ibm.icu.a.hn;
import com.ibm.icu.a.ho;
import com.ibm.icu.a.hp;
import com.ibm.icu.a.hq;
import com.ibm.icu.a.hr;
import com.ibm.icu.a.hs;
import com.ibm.icu.a.ht;
import com.ibm.icu.a.hu;
import com.ibm.icu.a.hv;
import com.ibm.icu.a.hw;
import com.ibm.icu.a.hx;
import com.ibm.icu.a.hy;
import com.ibm.icu.a.hz;
import com.ibm.icu.a.ia;
import com.ibm.icu.a.ib;
import com.ibm.icu.a.ic;
import com.ibm.icu.a.id;
import com.ibm.icu.a.ie;
import com.ibm.icu.a.if;
import com.ibm.icu.a.ig;
import com.ibm.icu.a.ii;
import com.ibm.icu.a.ij;
import com.ibm.icu.a.il;
import com.ibm.icu.a.im;
import com.ibm.icu.a.in;
import com.ibm.icu.a.io;
import com.ibm.icu.b.b;
import com.ibm.icu.d.lf;
import com.ibm.icu.util.VersionInfo;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.MissingResourceException;

public final class hk {
    public static final hk a;
    public gs b;
    public VersionInfo c;
    public static final char d = '\u0130';
    public static final char e = '\u0131';
    public static final char f = 'i';
    public static final int g = 31;
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;
    public static final int l = 4;
    public static final int m = 5;
    public static final int n = 6;
    public static final int o = 7;
    public static final int p = 8;
    public static final int q = 9;
    public static final int r = 10;
    public static final int s = 11;
    public static final int t = 12;
    static final int u = 30;
    private static final int J;
    private static final int K;
    private static final int L;
    private static final int M;
    private static final int N;
    private static final int O;
    private static final int P;
    ii[] v = new ii[]{new ii(this, 1, 256), new ii(this, 1, 128), new hl(this, 5), new hw(this, 5), new ii(this, 1, 2), new ii(this, 1, 524288), new ii(this, 1, 0x100000), new ii(this, 1, 1024), new ii(this, 1, 2048), new ia(this, 8), new ii(this, 1, 0x4000000), new ii(this, 1, 8192), new ii(this, 1, 16384), new ii(this, 1, 64), new ii(this, 1, 4), new ii(this, 1, 0x2000000), new ii(this, 1, 0x1000000), new ii(this, 1, 512), new ii(this, 1, 32768), new ii(this, 1, 65536), new ib(this, 5), new ii(this, 1, 0x200000), new ij(this, 22), new ii(this, 1, 32), new ii(this, 1, 4096), new ii(this, 1, 8), new ii(this, 1, 131072), new ij(this, 27), new ii(this, 1, 16), new ii(this, 1, 262144), new ij(this, 30), new ii(this, 1, 1), new ii(this, 1, 0x800000), new ii(this, 1, 0x400000), new ij(this, 34), new ii(this, 1, 0x8000000), new ii(this, 1, 0x10000000), new in(this, 8, 37), new in(this, 9, 38), new in(this, 8, 39), new in(this, 9, 40), new ic(this, 11), new ii(this, 1, 0x20000000), new ii(this, 1, 0x40000000), new id(this, 6), new ie(this, 1), new if(this, 1), new ig(this, 1), new hm(this, 1), new ij(this, 49), new ij(this, 50), new ij(this, 51), new ij(this, 52), new ij(this, 53), new hn(this, 7), new ij(this, 55), new ho(this, 10)};
    private static final int[] Q;
    il[] w = new il[]{new hp(this), new il(this, 0, 130816, 8), new hq(this, 8), new il(this, 2, 31, 0), new il(this, 0, 917504, 17), new hr(this, 1), new hs(this), new ht(this), new il(this, 2, 0x3F00000, 20), new hu(this, 1), new hv(this, 0, 255, 0), new hx(this, 2), new io(this, 8, 4108, 1), new io(this, 9, 4109, 1), new io(this, 8, 4110, 2), new io(this, 9, 4111, 2), new hy(this, 8), new hz(this, 8), new il(this, 2, 992, 5), new il(this, 2, 1015808, 15), new il(this, 2, 31744, 10)};
    gs x;
    int[] y;
    int z;
    int A;
    int B;
    public char[] C;
    private static final String R = "data/icudt51b/uprops.icu";
    private static final int S = 25000;
    private static final int T = 10;
    private static final int U = -56613888;
    private static final int V = 6;
    private static final int W = 0;
    private static final int X = 1;
    private static final int Y = 11;
    private static final int Z = 21;
    private static final int aa = 176;
    private static final int ab = 480;
    private static final int ac = 768;
    private static final int ad = 804;
    public static final int D = 0xC000FF;
    private static final int ae = 917504;
    private static final int af = 17;
    private static final int ag = 130816;
    private static final int ah = 8;
    public static final int E = 255;
    public static final int F = 0x400000;
    public static final int G = 0x800000;
    public static final int H = 0xC00000;
    private static final int ai = 0;
    private static final int aj = 1;
    private static final int ak = 2;
    private static final int al = 3;
    private static final int am = 4;
    private static final int an = 5;
    private static final int ao = 6;
    private static final int ap = 7;
    private static final int aq = 8;
    private static final int ar = 9;
    private static final int as = 10;
    private static final int at = 11;
    private static final int au = 12;
    private static final int av = 13;
    private static final int aw = 14;
    private static final int ax = 15;
    private static final int ay = 16;
    private static final int az = 17;
    private static final int aA = 18;
    private static final int aB = 19;
    private static final int aC = 20;
    private static final int aD = 21;
    private static final int aE = 22;
    private static final int aF = 23;
    private static final int aG = 24;
    private static final int aH = 25;
    private static final int aI = 26;
    private static final int aJ = 27;
    private static final int aK = 28;
    private static final int aL = 29;
    private static final int aM = 30;
    private static final int aN = 0x3F00000;
    private static final int aO = 20;
    private static final int aP = 1015808;
    private static final int aQ = 15;
    private static final int aR = 31744;
    private static final int aS = 10;
    private static final int aT = 992;
    private static final int aU = 5;
    private static final int aV = 31;
    private static final int aW = 4;
    private static final int aX = 15;
    private static final int aY = 24;
    private static final byte[] aZ;
    private static final int ba = 9;
    private static final int bb = 13;
    private static final int bc = 65;
    private static final int bd = 70;
    private static final int be = 90;
    private static final int bf = 97;
    private static final int bg = 102;
    private static final int bh = 122;
    private static final int bi = 127;
    private static final int bj = 133;
    private static final int bk = 160;
    private static final int bl = 847;
    private static final int bm = 8199;
    private static final int bn = 8202;
    private static final int bo = 8207;
    private static final int bp = 8239;
    private static final int bq = 8288;
    private static final int br = 8298;
    private static final int bs = 8303;
    private static final int bt = 65313;
    private static final int bu = 65318;
    private static final int bv = 65338;
    private static final int bw = 65345;
    private static final int bx = 65350;
    private static final int by = 65370;
    private static final int bz = 65279;

    public final int a(int n2) {
        return this.b.a(n2);
    }

    public int a(int n2, int n3) {
        assert (n3 >= 0);
        if (n3 >= this.z) {
            return 0;
        }
        return this.y[this.x.a(n2) + n3];
    }

    public VersionInfo b(int n2) {
        int n3 = this.a(n2, 0) >> 24;
        return VersionInfo.a(n3 >> 4 & 0xF, n3 & 0xF, 0, 0);
    }

    private static final boolean o(int n2) {
        return (hk.g(com.ibm.icu.b.b.e(n2)) & (K | L | J | P)) == 0;
    }

    public boolean b(int n2, int n3) {
        if (n3 < 0 || 57 <= n3) {
            return false;
        }
        return this.v[n3].a(n2);
    }

    public int c(int n2) {
        return this.a(n2) & 0x1F;
    }

    public int c(int n2, int n3) {
        if (n3 < 4096) {
            if (0 <= n3 && n3 < 57) {
                return this.v[n3].a(n2) ? 1 : 0;
            }
        } else {
            if (n3 < 4117) {
                return this.w[n3 - 4096].a(n2);
            }
            if (n3 == 8192) {
                return hk.g(this.c(n2));
            }
        }
        return 0;
    }

    public int d(int n2) {
        if (n2 < 4096) {
            if (0 <= n2 && n2 < 57) {
                return 1;
            }
        } else if (n2 < 4117) {
            return this.w[n2 - 4096].b(n2);
        }
        return -1;
    }

    public final int e(int n2) {
        if (n2 < 0) {
            return 0;
        }
        if (n2 < 57) {
            return this.v[n2].a();
        }
        if (n2 < 4096) {
            return 0;
        }
        if (n2 < 4117) {
            return this.w[n2 - 4096].a();
        }
        if (n2 < 16384) {
            switch (n2) {
                case 8192: 
                case 12288: {
                    return 1;
                }
            }
            return 0;
        }
        if (n2 < 16397) {
            switch (n2) {
                case 16384: {
                    return 2;
                }
                case 16385: {
                    return 5;
                }
                case 16386: 
                case 16388: 
                case 16390: 
                case 16391: 
                case 16392: 
                case 16393: 
                case 16394: 
                case 16396: {
                    return 4;
                }
                case 16387: 
                case 16389: 
                case 16395: {
                    return 3;
                }
            }
            return 0;
        }
        switch (n2) {
            case 28672: {
                return 2;
            }
        }
        return 0;
    }

    public static int a(char c2, char c3) {
        return (c2 << 10) + c3 + -56613888;
    }

    public int f(int n2) {
        switch (n2) {
            case 0: {
                return this.A;
            }
            case 2: {
                return this.B;
            }
        }
        return 0;
    }

    public static final int g(int n2) {
        return 1 << n2;
    }

    public static int h(int n2) {
        if (n2 > 122 && n2 < 65313 || n2 < 65 || n2 > 90 && n2 < 97 || n2 > 65370 || n2 > 65338 && n2 < 65345) {
            return -1;
        }
        if (n2 <= 122) {
            return n2 + 10 - (n2 <= 90 ? 65 : 97);
        }
        if (n2 <= 65338) {
            return n2 + 10 - 65313;
        }
        return n2 + 10 - 65345;
    }

    public int i(int n2) {
        int n3 = hk.p(this.a(n2)) - 1;
        if (n3 <= 9) {
            return n3;
        }
        return -1;
    }

    public int j(int n2) {
        int n3 = hk.p(this.a(n2));
        if (n3 == 0) {
            return hk.h(n2);
        }
        if (n3 < 11) {
            return n3 - 1;
        }
        if (n3 < 21) {
            return n3 - 11;
        }
        if (n3 < 176) {
            return n3 - 21;
        }
        if (n3 < 480) {
            return -2;
        }
        if (n3 < 768) {
            int n4 = (n3 >> 5) - 14;
            int n5 = (n3 & 0x1F) + 2;
            if (n5 < 9 || n5 == 9 && n4 <= 2) {
                int n6 = n4;
                do {
                    n6 *= 10;
                } while (--n5 > 0);
                return n6;
            }
            return -2;
        }
        if (n3 < 804) {
            int n7 = (n3 >> 2) - 191;
            int n8 = (n3 & 3) + 1;
            switch (n8) {
                case 4: {
                    n7 *= 12960000;
                    break;
                }
                case 3: {
                    n7 *= 216000;
                    break;
                }
                case 2: {
                    n7 *= 3600;
                    break;
                }
                case 1: {
                    n7 *= 60;
                    break;
                }
            }
            return n7;
        }
        return -2;
    }

    public double k(int n2) {
        int n3 = hk.p(this.a(n2));
        if (n3 == 0) {
            return -1.23456789E8;
        }
        if (n3 < 11) {
            return n3 - 1;
        }
        if (n3 < 21) {
            return n3 - 11;
        }
        if (n3 < 176) {
            return n3 - 21;
        }
        if (n3 < 480) {
            int n4 = (n3 >> 4) - 12;
            int n5 = (n3 & 0xF) + 1;
            return (double)n4 / (double)n5;
        }
        if (n3 < 768) {
            int n6;
            int n7 = (n3 >> 5) - 14;
            double d2 = n7;
            for (n6 = (n3 & 0x1F) + 2; n6 >= 4; n6 -= 4) {
                d2 *= 10000.0;
            }
            switch (n6) {
                case 3: {
                    d2 *= 1000.0;
                    break;
                }
                case 2: {
                    d2 *= 100.0;
                    break;
                }
                case 1: {
                    d2 *= 10.0;
                    break;
                }
            }
            return d2;
        }
        if (n3 < 804) {
            int n8 = (n3 >> 2) - 191;
            int n9 = (n3 & 3) + 1;
            switch (n9) {
                case 4: {
                    n8 *= 12960000;
                    break;
                }
                case 3: {
                    n8 *= 216000;
                    break;
                }
                case 2: {
                    n8 *= 3600;
                    break;
                }
                case 1: {
                    n8 *= 60;
                    break;
                }
            }
            return n8;
        }
        return -1.23456789E8;
    }

    private static final int p(int n2) {
        return n2 >> 6;
    }

    private static final int q(int n2) {
        return n2 == 0 ? 0 : (n2 < 11 ? 1 : (n2 < 21 ? 2 : 3));
    }

    private hk() {
        int n2;
        int n3;
        if (this.v.length != 57) {
            throw new RuntimeException("binProps.length!=UProperty.BINARY_LIMIT");
        }
        if (this.w.length != 21) {
            throw new RuntimeException("intProps.length!=(UProperty.INT_LIMIT-UProperty.INT_START)");
        }
        InputStream inputStream = com.ibm.icu.a.am.c(R);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 25000);
        this.c = com.ibm.icu.a.ag.b(bufferedInputStream, aZ, new im(null));
        DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
        int n4 = dataInputStream.readInt();
        dataInputStream.readInt();
        dataInputStream.readInt();
        int n5 = dataInputStream.readInt();
        int n6 = dataInputStream.readInt();
        this.z = dataInputStream.readInt();
        int n7 = dataInputStream.readInt();
        int n8 = dataInputStream.readInt();
        dataInputStream.readInt();
        dataInputStream.readInt();
        this.A = dataInputStream.readInt();
        this.B = dataInputStream.readInt();
        dataInputStream.skipBytes(16);
        this.b = gs.b(dataInputStream);
        int n9 = (n4 - 16) * 4;
        int n10 = this.b.b();
        if (n10 > n9) {
            throw new IOException("uprops.icu: not enough bytes for main trie");
        }
        dataInputStream.skipBytes(n9 - n10);
        dataInputStream.skipBytes((n5 - n4) * 4);
        if (this.z > 0) {
            this.x = gs.b(dataInputStream);
            n9 = (n6 - n5) * 4;
            n10 = this.x.b();
            if (n10 > n9) {
                throw new IOException("uprops.icu: not enough bytes for additional-properties trie");
            }
            dataInputStream.skipBytes(n9 - n10);
            n3 = n7 - n6;
            this.y = new int[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.y[n2] = dataInputStream.readInt();
            }
        }
        if ((n3 = (n8 - n7) * 2) > 0) {
            this.C = new char[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.C[n2] = dataInputStream.readChar();
            }
        }
        inputStream.close();
    }

    public lf a(lf lf2) {
        for (gl gl2 : this.b) {
            if (gl2.d) break;
            lf2.e(gl2.a);
        }
        lf2.e(9);
        lf2.e(10);
        lf2.e(14);
        lf2.e(28);
        lf2.e(32);
        lf2.e(133);
        lf2.e(134);
        lf2.e(127);
        lf2.e(8202);
        lf2.e(8208);
        lf2.e(8298);
        lf2.e(8304);
        lf2.e(65279);
        lf2.e(65280);
        lf2.e(160);
        lf2.e(161);
        lf2.e(8199);
        lf2.e(8200);
        lf2.e(8239);
        lf2.e(8240);
        lf2.e(12295);
        lf2.e(12296);
        lf2.e(19968);
        lf2.e(19969);
        lf2.e(20108);
        lf2.e(20109);
        lf2.e(19977);
        lf2.e(19978);
        lf2.e(22235);
        lf2.e(22236);
        lf2.e(20116);
        lf2.e(20117);
        lf2.e(20845);
        lf2.e(20846);
        lf2.e(19971);
        lf2.e(19972);
        lf2.e(20843);
        lf2.e(20844);
        lf2.e(20061);
        lf2.e(20062);
        lf2.e(97);
        lf2.e(123);
        lf2.e(65);
        lf2.e(91);
        lf2.e(65345);
        lf2.e(65371);
        lf2.e(65313);
        lf2.e(65339);
        lf2.e(103);
        lf2.e(71);
        lf2.e(65351);
        lf2.e(65319);
        lf2.e(8288);
        lf2.e(65520);
        lf2.e(65532);
        lf2.e(917504);
        lf2.e(921600);
        lf2.e(847);
        lf2.e(848);
        return lf2;
    }

    public void b(lf lf2) {
        if (this.z > 0) {
            for (gl gl2 : this.x) {
                if (gl2.d) break;
                lf2.e(gl2.a);
            }
        }
    }

    static /* synthetic */ boolean l(int n2) {
        return hk.o(n2);
    }

    static /* synthetic */ int m(int n2) {
        return hk.p(n2);
    }

    static /* synthetic */ int n(int n2) {
        return hk.q(n2);
    }

    static /* synthetic */ int[] a() {
        return Q;
    }

    static {
        J = hk.g(0);
        K = hk.g(15);
        L = hk.g(18);
        M = hk.g(12);
        N = hk.g(13);
        O = hk.g(14);
        P = M | N | O;
        Q = new int[]{0, 0, 0, 0, 1, 0, 4, 5, 3, 2};
        aZ = new byte[]{85, 80, 114, 111};
        try {
            a = new hk();
        }
        catch (IOException iOException) {
            throw new MissingResourceException(iOException.getMessage(), "", "");
        }
    }
}

