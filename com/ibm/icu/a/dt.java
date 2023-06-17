/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ag;
import com.ibm.icu.a.am;
import com.ibm.icu.a.du;
import com.ibm.icu.a.dv;
import com.ibm.icu.a.dw;
import com.ibm.icu.a.dx;
import com.ibm.icu.a.dy;
import com.ibm.icu.a.gl;
import com.ibm.icu.a.go;
import com.ibm.icu.a.gq;
import com.ibm.icu.a.gs;
import com.ibm.icu.a.gt;
import com.ibm.icu.d.kx;
import com.ibm.icu.d.lf;
import com.ibm.icu.util.VersionInfo;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

public final class dt {
    private static final dw E = new dw(null);
    private static final byte[] F = new byte[]{78, 114, 109, 50};
    private static final go G = new du();
    public static final int a = 768;
    public static final int b = 65281;
    public static final int c = 65280;
    public static final int d = 65024;
    public static final int e = 1;
    public static final int f = 64;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final int k = 7;
    public static final int l = 8;
    public static final int m = 9;
    public static final int n = 10;
    public static final int o = 11;
    public static final int p = 12;
    public static final int q = 13;
    public static final int r = 14;
    public static final int s = 16;
    public static final int t = 128;
    public static final int u = 64;
    public static final int v = 32;
    public static final int w = 31;
    public static final int x = 32768;
    public static final int y = 1;
    public static final int z = 13312;
    public static final int A = 32766;
    public static final int B = 9;
    public static final int C = 6;
    public static final int D = 65472;
    private VersionInfo H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private gs P;
    private String Q;
    private String R;
    private byte[] S;
    private int[] T;
    private gt U;
    private ArrayList V;
    private static final int W = Integer.MIN_VALUE;
    private static final int X = 0x40000000;
    private static final int Y = 0x200000;
    private static final int Z = 0x1FFFFF;

    public dt a(InputStream inputStream) {
        try {
            int n2;
            int n3;
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            this.H = ag.b(bufferedInputStream, F, E);
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            int n4 = dataInputStream.readInt() / 4;
            if (n4 <= 13) {
                throw new IOException("Normalizer2 data: not enough indexes");
            }
            int[] arrn = new int[n4];
            arrn[0] = n4 * 4;
            for (n3 = 1; n3 < n4; ++n3) {
                arrn[n3] = dataInputStream.readInt();
            }
            this.I = arrn[8];
            this.J = arrn[9];
            this.K = arrn[10];
            this.L = arrn[14];
            this.M = arrn[11];
            this.N = arrn[12];
            this.O = arrn[13];
            n3 = arrn[0];
            int n5 = arrn[1];
            this.P = gs.b(dataInputStream);
            int n6 = this.P.b();
            if (n6 > n5 - n3) {
                throw new IOException("Normalizer2 data: not enough bytes for normTrie");
            }
            dataInputStream.skipBytes(n5 - n3 - n6);
            n3 = n5;
            n5 = arrn[2];
            int n7 = (n5 - n3) / 2;
            if (n7 != 0) {
                char[] arrc = new char[n7];
                for (n2 = 0; n2 < n7; ++n2) {
                    arrc[n2] = dataInputStream.readChar();
                }
                this.Q = new String(arrc);
                this.R = this.Q.substring(65024 - this.O);
            }
            n3 = n5;
            this.S = new byte[256];
            for (n2 = 0; n2 < 256; ++n2) {
                this.S[n2] = dataInputStream.readByte();
            }
            this.T = new int[384];
            n2 = 0;
            int n8 = 0;
            while (n8 < 384) {
                if ((n8 & 0xFF) == 0) {
                    n2 = this.S[n8 >> 8];
                }
                if ((n2 & 1) != 0) {
                    int n9 = 0;
                    while (n9 < 32) {
                        this.T[n8] = this.j(n8) & 0xFF;
                        ++n9;
                        ++n8;
                    }
                } else {
                    n8 += 32;
                }
                n2 >>= 1;
            }
            inputStream.close();
            return this;
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public dt a(String string) {
        return this.a(am.c(string));
    }

    public void a(lf lf2) {
        for (gl gl2 : this.P) {
            if (gl2.d) break;
            lf2.e(gl2.a);
        }
        for (int i2 = 44032; i2 < 55204; i2 += 28) {
            lf2.e(i2);
            lf2.e(i2 + 1);
        }
        lf2.e(55204);
    }

    public void b(lf lf2) {
        this.b();
        Iterator iterator = this.U.a(G);
        while (iterator.hasNext()) {
            gl gl2 = (gl)iterator.next();
            if (gl2.d) break;
            lf2.e(gl2.a);
        }
    }

    public gs a() {
        return this.P;
    }

    public synchronized dt b() {
        if (this.U == null) {
            gq gq2 = new gq(0, 0);
            this.V = new ArrayList();
            for (gl gl2 : this.P) {
                if (gl2.d) break;
                int n2 = gl2.c;
                if (n2 == 0 || this.K <= n2 && n2 < this.M) continue;
                for (int i2 = gl2.a; i2 <= gl2.b; ++i2) {
                    int n3;
                    int n4 = n3 = gq2.a(i2);
                    if (n2 >= this.O) {
                        n4 |= Integer.MIN_VALUE;
                        if (n2 < 65024) {
                            n4 |= 0x40000000;
                        }
                    } else if (n2 < this.K) {
                        n4 |= 0x40000000;
                    } else {
                        int n5 = i2;
                        int n6 = n2;
                        while (this.N <= n6 && n6 < this.O) {
                            n5 = this.b(n5, n6);
                            n6 = this.a(n5);
                        }
                        if (this.K <= n6 && n6 < this.N) {
                            char c2 = this.R.charAt(n6);
                            int n7 = c2 & 0x1F;
                            if ((c2 & 0x80) != 0 && i2 == n5 && (this.R.charAt(n6 - 1) & 0xFF) != 0) {
                                n4 |= Integer.MIN_VALUE;
                            }
                            if (n7 != 0) {
                                int n8 = ++n6 + n7;
                                n5 = this.R.codePointAt(n6);
                                this.a(gq2, i2, n5);
                                if (n6 >= this.M) {
                                    while ((n6 += Character.charCount(n5)) < n8) {
                                        n5 = this.R.codePointAt(n6);
                                        int n9 = gq2.a(n5);
                                        if ((n9 & Integer.MIN_VALUE) != 0) continue;
                                        gq2.d(n5, n9 | Integer.MIN_VALUE);
                                    }
                                }
                            }
                        } else {
                            this.a(gq2, i2, n5);
                        }
                    }
                    if (n4 == n3) continue;
                    gq2.d(i2, n4);
                }
            }
            this.U = gq2.c();
        }
        return this;
    }

    public int a(int n2) {
        return this.P.a(n2);
    }

    public int b(int n2) {
        if (n2 < this.M || 65281 <= n2) {
            return 1;
        }
        if (this.O <= n2) {
            return 2;
        }
        return 0;
    }

    public boolean c(int n2) {
        return this.M <= n2 && n2 < this.O;
    }

    public boolean d(int n2) {
        return n2 < this.K || this.O <= n2;
    }

    public int e(int n2) {
        if (n2 >= 65024) {
            return n2 & 0xFF;
        }
        if (n2 < this.M || this.N <= n2) {
            return 0;
        }
        return this.C(n2);
    }

    public static int f(int n2) {
        return n2 >= 65024 ? n2 & 0xFF : 0;
    }

    public int g(int n2) {
        if (n2 < 0) {
            return 0;
        }
        if (n2 < 384) {
            return this.T[n2];
        }
        if (n2 <= 65535 && !this.i(n2)) {
            return 0;
        }
        return this.j(n2);
    }

    public int h(int n2) {
        return this.T[n2];
    }

    public boolean i(int n2) {
        byte by2 = this.S[n2 >> 8];
        if (by2 == 0) {
            return false;
        }
        return (by2 >> (n2 >> 5 & 7) & 1) != 0;
    }

    public int j(int n2) {
        int n3;
        while (true) {
            if ((n3 = this.a(n2)) <= this.K) {
                return 0;
            }
            if (n3 >= 65024) {
                return (n3 &= 0xFF) | n3 << 8;
            }
            if (n3 >= this.O) {
                return 0;
            }
            if (!this.B(n3)) break;
            n2 = this.b(n2, n3);
        }
        char c2 = this.R.charAt(n3);
        if ((c2 & 0x1F) == 0) {
            return 511;
        }
        int n4 = c2 >> 8;
        if ((c2 & 0x80) != 0) {
            n4 |= this.R.charAt(n3 - 1) & 0xFF00;
        }
        return n4;
    }

    public String k(int n2) {
        int n3;
        int n4 = -1;
        while (n2 >= this.I && !this.d(n3 = this.a(n2))) {
            if (this.x(n3)) {
                StringBuilder stringBuilder = new StringBuilder();
                dv.a(n2, stringBuilder);
                return stringBuilder.toString();
            }
            if (this.B(n3)) {
                n4 = n2 = this.b(n2, n3);
                continue;
            }
            int n5 = this.R.charAt(n3++) & 0x1F;
            return this.R.substring(n3, n3 + n5);
        }
        if (n4 < 0) {
            return null;
        }
        return kx.d(n4);
    }

    public String l(int n2) {
        int n3;
        if (n2 < this.I || this.d(n3 = this.a(n2))) {
            return null;
        }
        if (this.x(n3)) {
            StringBuilder stringBuilder = new StringBuilder();
            dv.b(n2, stringBuilder);
            return stringBuilder.toString();
        }
        if (this.B(n3)) {
            return kx.d(this.b(n2, n3));
        }
        char c2 = this.R.charAt(n3);
        int n4 = c2 & 0x1F;
        if ((c2 & 0x40) != 0) {
            int n5 = n3 - (c2 >> 7 & 1) - 1;
            char c3 = this.R.charAt(n5);
            if (c3 <= '\u001f') {
                return this.R.substring(n5 - c3, n5);
            }
            StringBuilder stringBuilder = new StringBuilder(n4 - 1).append(c3);
            return stringBuilder.append(this.R, n3 += 3, n3 + n4 - 2).toString();
        }
        return this.R.substring(++n3, n3 + n4);
    }

    public boolean m(int n2) {
        return this.U.a(n2) >= 0;
    }

    public boolean a(int n2, lf lf2) {
        int n3 = this.U.a(n2) & Integer.MAX_VALUE;
        if (n3 == 0) {
            return false;
        }
        lf2.g();
        int n4 = n3 & 0x1FFFFF;
        if ((n3 & 0x200000) != 0) {
            lf2.f((lf)this.V.get(n4));
        } else if (n4 != 0) {
            lf2.e(n4);
        }
        if ((n3 & 0x40000000) != 0) {
            int n5 = this.a(n2);
            if (n5 == 1) {
                int n6 = 44032 + (n2 - 4352) * 588;
                lf2.b(n6, n6 + 588 - 1);
            } else {
                this.b(this.F(n5), lf2);
            }
        }
        return true;
    }

    public int a(CharSequence charSequence, int n2, int n3, dx dx2) {
        block13: {
            int n4 = this.I;
            int n5 = 0;
            int n6 = 0;
            int n7 = n2;
            char c2 = '\u0000';
            while (true) {
                char c3;
                int n8 = n2;
                while (n2 != n3) {
                    n5 = charSequence.charAt(n2);
                    if (n5 < n4 || this.A(n6 = this.P.a((char)n5))) {
                        ++n2;
                        continue;
                    }
                    if (!kx.a((char)n5)) break;
                    if (dy.a(n5)) {
                        if (n2 + 1 != n3) {
                            char c4 = charSequence.charAt(n2 + 1);
                            c3 = c4;
                            if (Character.isLowSurrogate(c4)) {
                                n5 = Character.toCodePoint((char)n5, c3);
                            }
                        }
                    } else if (n8 < n2) {
                        char c5 = charSequence.charAt(n2 - 1);
                        c3 = c5;
                        if (Character.isHighSurrogate(c5)) {
                            --n2;
                            n5 = Character.toCodePoint(c3, (char)n5);
                        }
                    }
                    if (!this.A(n6 = this.a(n5))) break;
                    n2 += Character.charCount(n5);
                }
                if (n2 != n8) {
                    if (dx2 != null) {
                        dx2.c(charSequence, n8, n2);
                    } else {
                        c2 = '\u0000';
                        n7 = n2;
                    }
                }
                if (n2 == n3) break block13;
                n2 += Character.charCount(n5);
                if (dx2 != null) {
                    this.a(n5, n6, dx2);
                    continue;
                }
                if (!this.d(n6) || c2 > (c3 = dt.f(n6)) && c3 != '\u0000') break;
                c2 = c3;
                if (c3 > '\u0001') continue;
                n7 = n2;
            }
            return n7;
        }
        return n2;
    }

    public void a(CharSequence charSequence, boolean bl2, dx dx2) {
        int n2;
        int n3 = charSequence.length();
        if (n3 == 0) {
            return;
        }
        if (bl2) {
            this.a(charSequence, 0, n3, dx2);
            return;
        }
        int n4 = Character.codePointAt(charSequence, 0);
        int n5 = 0;
        int n6 = n2 = this.e(this.a(n4));
        int n7 = n2;
        while (n2 != 0) {
            n6 = n2;
            if ((n5 += Character.charCount(n4)) >= n3) break;
            n4 = Character.codePointAt(charSequence, n5);
            n2 = this.e(this.a(n4));
        }
        dx2.a(charSequence, 0, n5, n7, n6);
        dx2.b(charSequence, n5, n3);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(CharSequence var1_1, int var2_2, int var3_3, boolean var4_4, boolean var5_5, dx var6_6) {
        var7_7 = this.J;
        var8_8 = var2_2;
        var10_9 = 0;
        var11_10 = 0;
        var12_11 = 0;
        while (true) {
            var9_12 = var2_2;
            while (var2_2 != var3_3) {
                var10_9 = var1_1.charAt(var2_2);
                if (var10_9 < var7_7 || this.y(var11_10 = this.P.a((char)var10_9))) {
                    ++var2_2;
                    continue;
                }
                if (!kx.a((char)var10_9)) break;
                if (dy.a(var10_9)) {
                    if (var2_2 + 1 != var3_3) {
                        v0 = var1_1.charAt(var2_2 + 1);
                        var13_13 = v0;
                        if (Character.isLowSurrogate(v0)) {
                            var10_9 = Character.toCodePoint((char)var10_9, (char)var13_13);
                        }
                    }
                } else if (var9_12 < var2_2) {
                    v1 = var1_1.charAt(var2_2 - 1);
                    var13_13 = v1;
                    if (Character.isHighSurrogate(v1)) {
                        --var2_2;
                        var10_9 = Character.toCodePoint((char)var13_13, (char)var10_9);
                    }
                }
                if (!this.y(var11_10 = this.a(var10_9))) break;
                var2_2 += Character.charCount(var10_9);
            }
            if (var2_2 != var9_12) {
                if (var2_2 == var3_3) {
                    if (var5_5 == false) return true;
                    var6_6.c(var1_1, var9_12, var2_2);
                    return true;
                }
                var8_8 = var2_2 - 1;
                if (Character.isLowSurrogate(var1_1.charAt(var8_8)) && var9_12 < var8_8 && Character.isHighSurrogate(var1_1.charAt(var8_8 - 1))) {
                    --var8_8;
                }
                if (var5_5) {
                    var6_6.c(var1_1, var9_12, var8_8);
                    var6_6.b(var1_1, var8_8, var2_2);
                } else {
                    var12_11 = 0;
                }
                var9_12 = var2_2;
            } else if (var2_2 == var3_3) {
                return true;
            }
            var2_2 += Character.charCount(var10_9);
            if (dt.w(var11_10) && var8_8 != var9_12) {
                var13_13 = var1_1.charAt(var9_12 - 1);
                var14_14 = false;
                if (var10_9 < 4519) {
                    if ((var13_13 = (int)((char)(var13_13 - 4352))) < 19) {
                        if (!var5_5) {
                            return false;
                        }
                        var15_15 = (char)(44032 + (var13_13 * 21 + (var10_9 - 4449)) * 28);
                        if (var2_2 != var3_3 && (var16_16 = (char)(var1_1.charAt(var2_2) - 4519)) < '\u001c') {
                            var15_15 = (char)(var15_15 + var16_16);
                            var8_8 = ++var2_2;
                            var6_6.a(var15_15);
                            continue;
                        }
                        var14_14 = true;
                    }
                } else if (dv.a((char)var13_13)) {
                    if (!var5_5) {
                        return false;
                    }
                    var6_6.a((char)(var13_13 + var10_9 - 4519));
                    var8_8 = var2_2;
                    continue;
                }
                if (!var14_14) {
                    if (var5_5) {
                        var6_6.b((char)var10_9);
                        continue;
                    }
                    var12_11 = 0;
                    continue;
                }
            }
            if (var11_10 < 65281) ** GOTO lbl91
            var13_13 = var11_10 & 255;
            if (var4_4 && (var5_5 != false ? var6_6.c() : var12_11) == 0 && var8_8 < var9_12 && this.a(var1_1, var8_8, var9_12) > var13_13) {
                if (!var5_5) {
                    return false;
                }
            } else {
                if (var5_5) {
                    var6_6.a(var10_9, var13_13);
                    continue;
                }
                if (var12_11 > var13_13) return false;
                var12_11 = var13_13;
                continue;
lbl91:
                // 1 sources

                if (!var5_5 && !this.t(var11_10)) {
                    return false;
                }
            }
            if (this.c(var10_9, var11_10)) {
                var8_8 = var9_12;
            } else if (var5_5) {
                var6_6.b(var9_12 - var8_8);
            }
            var2_2 = this.b(var1_1, var2_2, var3_3);
            var13_13 = var6_6.b();
            this.c(var1_1, var8_8, var2_2, var6_6);
            this.a(var6_6, var13_13, var4_4);
            if (!var5_5) {
                if (!var6_6.a(var1_1, var8_8, var2_2)) {
                    return false;
                }
                var6_6.f();
                var12_11 = 0;
            }
            var8_8 = var2_2;
        }
    }

    public int a(CharSequence charSequence, int n2, int n3, boolean bl2, boolean bl3) {
        int n4;
        block10: {
            int n5 = 0;
            int n6 = this.J;
            n4 = n2;
            int n7 = 0;
            int n8 = 0;
            char c2 = '\u0000';
            while (true) {
                char c3;
                int n9 = n2;
                while (true) {
                    if (n2 == n3) {
                        return n2 << 1 | n5;
                    }
                    n7 = charSequence.charAt(n2);
                    if (n7 < n6 || this.y(n8 = this.P.a((char)n7))) {
                        ++n2;
                        continue;
                    }
                    if (!kx.a((char)n7)) break;
                    if (dy.a(n7)) {
                        if (n2 + 1 != n3 && Character.isLowSurrogate(c3 = charSequence.charAt(n2 + 1))) {
                            n7 = Character.toCodePoint((char)n7, c3);
                        }
                    } else if (n9 < n2 && Character.isHighSurrogate(c3 = charSequence.charAt(n2 - 1))) {
                        --n2;
                        n7 = Character.toCodePoint(c3, (char)n7);
                    }
                    if (!this.y(n8 = this.a(n7))) break;
                    n2 += Character.charCount(n7);
                }
                if (n2 != n9) {
                    n4 = n2 - 1;
                    if (Character.isLowSurrogate(charSequence.charAt(n4)) && n9 < n4 && Character.isHighSurrogate(charSequence.charAt(n4 - 1))) {
                        --n4;
                    }
                    c2 = '\u0000';
                    n9 = n2;
                }
                n2 += Character.charCount(n7);
                if (!this.t(n8)) break block10;
                c3 = dt.f(n8);
                if (bl2 && c3 != '\u0000' && c2 == '\u0000' && n4 < n9 && this.a(charSequence, n4, n9) > c3 || c2 > c3 && c3 != '\u0000') break block10;
                c2 = c3;
                if (n8 >= 65281) continue;
                if (bl3) break;
                n5 = 1;
            }
            return n4 << 1;
        }
        return n4 << 1;
    }

    public void a(CharSequence charSequence, boolean bl2, boolean bl3, dx dx2) {
        int n2;
        int n3 = 0;
        int n4 = charSequence.length();
        if (!dx2.a() && 0 != (n2 = this.b(charSequence, 0, n4))) {
            int n5 = this.a(dx2.d(), dx2.b());
            StringBuilder stringBuilder = new StringBuilder(dx2.b() - n5 + n2 + 16);
            stringBuilder.append(dx2.d(), n5, dx2.b());
            dx2.b(dx2.b() - n5);
            stringBuilder.append(charSequence, 0, n2);
            this.a(stringBuilder, 0, stringBuilder.length(), bl3, true, dx2);
            n3 = n2;
        }
        if (bl2) {
            this.a(charSequence, n3, n4, bl3, true, dx2);
        } else {
            dx2.b(charSequence, n3, n4);
        }
    }

    public int b(CharSequence charSequence, int n2, int n3, dx dx2) {
        int n4 = n2;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        while (true) {
            int n8;
            int n9 = n2;
            while (n2 != n3) {
                n5 = charSequence.charAt(n2);
                if (n5 < 768) {
                    n6 = ~n5;
                    ++n2;
                    continue;
                }
                if (!this.i(n5)) {
                    n6 = 0;
                    ++n2;
                    continue;
                }
                if (kx.a((char)n5)) {
                    if (dy.a(n5)) {
                        if (n2 + 1 != n3) {
                            char c2 = charSequence.charAt(n2 + 1);
                            n8 = c2;
                            if (Character.isLowSurrogate(c2)) {
                                n5 = Character.toCodePoint((char)n5, (char)n8);
                            }
                        }
                    } else if (n9 < n2) {
                        char c3 = charSequence.charAt(n2 - 1);
                        n8 = c3;
                        if (Character.isHighSurrogate(c3)) {
                            --n2;
                            n5 = Character.toCodePoint((char)n8, (char)n5);
                        }
                    }
                }
                if ((n7 = this.j(n5)) > 255) break;
                n6 = n7;
                n2 += Character.charCount(n5);
            }
            if (n2 != n9) {
                if (n2 == n3) {
                    if (dx2 == null) break;
                    dx2.c(charSequence, n9, n2);
                    break;
                }
                n4 = n2;
                if (n6 < 0) {
                    n8 = ~n6;
                    int n10 = n6 = n8 < 384 ? this.T[n8] : this.j(n8);
                    if (n6 > 1) {
                        --n4;
                    }
                } else {
                    n8 = n2 - 1;
                    if (Character.isLowSurrogate(charSequence.charAt(n8)) && n9 < n8 && Character.isHighSurrogate(charSequence.charAt(n8 - 1))) {
                        n6 = this.j(Character.toCodePoint(charSequence.charAt(--n8), charSequence.charAt(n8 + '\u0001')));
                    }
                    if (n6 > 1) {
                        n4 = n8;
                    }
                }
                if (dx2 != null) {
                    dx2.c(charSequence, n9, n4);
                    dx2.b(charSequence, n4, n2);
                }
                n9 = n2;
            } else if (n2 == n3) break;
            n2 += Character.charCount(n5);
            if ((n6 & 0xFF) <= n7 >> 8) {
                if ((n7 & 0xFF) <= 1) {
                    n4 = n2;
                }
                if (dx2 != null) {
                    dx2.a(n5);
                }
                n6 = n7;
                continue;
            }
            if (dx2 == null) {
                return n4;
            }
            dx2.b(n9 - n4);
            n2 = this.c(charSequence, n2, n3);
            this.c(charSequence, n4, n2, dx2);
            n4 = n2;
            n6 = 0;
        }
        return n2;
    }

    public void b(CharSequence charSequence, boolean bl2, dx dx2) {
        int n2;
        int n3 = 0;
        int n4 = charSequence.length();
        if (!dx2.a() && 0 != (n2 = this.c(charSequence, 0, n4))) {
            int n5 = this.b(dx2.d(), dx2.b());
            StringBuilder stringBuilder = new StringBuilder(dx2.b() - n5 + n2 + 16);
            stringBuilder.append(dx2.d(), n5, dx2.b());
            dx2.b(dx2.b() - n5);
            stringBuilder.append(charSequence, 0, n2);
            this.b(stringBuilder, 0, stringBuilder.length(), dx2);
            n3 = n2;
        }
        if (bl2) {
            this.b(charSequence, n3, n4, dx2);
        } else {
            dx2.b(charSequence, n3, n4);
        }
    }

    public boolean a(int n2, boolean bl2) {
        int n3;
        while (true) {
            if (n2 < this.I) {
                return true;
            }
            n3 = this.a(n2);
            if (this.x(n3) || this.z(n3)) {
                return true;
            }
            if (n3 > 65024) {
                return false;
            }
            if (!this.B(n3)) break;
            n2 = this.b(n2, n3);
        }
        char c2 = this.R.charAt(n3);
        if ((c2 & 0x1F) == 0) {
            return false;
        }
        if (!bl2) {
            if (c2 > '\u01ff') {
                return false;
            }
            if (c2 <= '\u00ff') {
                return true;
            }
        }
        return (c2 & 0x80) == 0 || (this.R.charAt(n3 - 1) & 0xFF00) == 0;
    }

    public boolean n(int n2) {
        return this.z(this.a(n2));
    }

    public boolean o(int n2) {
        return n2 < this.J || this.c(n2, this.a(n2));
    }

    public boolean a(int n2, boolean bl2, boolean bl3) {
        int n3;
        while (true) {
            if (dt.u(n3 = this.a(n2))) {
                return true;
            }
            if (n3 <= this.K) {
                return this.x(n3) && !dv.a((char)n2);
            }
            if (n3 >= (bl3 ? this.M : this.O)) {
                return false;
            }
            if (!this.B(n3)) break;
            n2 = this.b(n2, n3);
        }
        char c2 = this.R.charAt(n3);
        return (c2 & 0x20) == 0 && (!bl2 || c2 <= '\u01ff');
    }

    public boolean p(int n2) {
        return n2 < 768 || this.g(n2) <= 255;
    }

    public boolean q(int n2) {
        int n3 = this.g(n2);
        return n3 <= 1 || (n3 & 0xFF) == 0;
    }

    public boolean r(int n2) {
        return this.g(n2) <= 1;
    }

    private boolean s(int n2) {
        return this.O <= n2 && n2 <= 65280;
    }

    private boolean t(int n2) {
        return n2 >= this.O;
    }

    private static boolean u(int n2) {
        return n2 == 0;
    }

    private static boolean v(int n2) {
        return n2 == 1;
    }

    private static boolean w(int n2) {
        return n2 == 65280;
    }

    private boolean x(int n2) {
        return n2 == this.K;
    }

    private boolean y(int n2) {
        return n2 < this.M;
    }

    private boolean z(int n2) {
        return n2 < this.K || n2 == 65280 || this.O <= n2 && n2 <= 65024;
    }

    private boolean A(int n2) {
        return n2 < this.K || n2 == 65024 || n2 == 65280;
    }

    private boolean B(int n2) {
        return n2 >= this.N;
    }

    private int C(int n2) {
        if ((this.R.charAt(n2) & 0x80) != 0) {
            return this.R.charAt(n2 - 1) & 0xFF;
        }
        return 0;
    }

    int a(CharSequence charSequence, int n2, int n3) {
        int n4 = n2 == n3 - 1 ? charSequence.charAt(n2) : Character.codePointAt(charSequence, n2);
        int n5 = this.a(n4);
        if (n5 <= this.K) {
            return 0;
        }
        return this.R.charAt(n5) >> 8;
    }

    private int b(int n2, int n3) {
        return n2 + n3 - (this.O - 64 - 1);
    }

    private int D(int n2) {
        if (n2 == 0 || 65024 <= n2) {
            return -1;
        }
        if ((n2 -= this.O) < 0) {
            n2 += 65024;
        }
        return n2;
    }

    private int E(int n2) {
        char c2 = this.R.charAt(n2);
        return 65024 - this.O + n2 + 1 + (c2 & 0x1F);
    }

    private int F(int n2) {
        return this.d(n2) ? this.D(n2) : this.E(n2);
    }

    public void c(CharSequence charSequence, int n2, int n3, dx dx2) {
        while (n2 < n3) {
            int n4 = Character.codePointAt(charSequence, n2);
            n2 += Character.charCount(n4);
            this.a(n4, this.a(n4), dx2);
        }
    }

    private void a(int n2, int n3, dx dx2) {
        block3: {
            while (true) {
                if (this.d(n3)) {
                    dx2.a(n2, dt.f(n3));
                    break block3;
                }
                if (this.x(n3)) {
                    dv.a(n2, dx2);
                    break block3;
                }
                if (!this.B(n3)) break;
                n2 = this.b(n2, n3);
                n3 = this.a(n2);
            }
            char c2 = this.R.charAt(n3);
            int n4 = c2 & 0x1F;
            int n5 = c2 >> 8;
            int n6 = (c2 & 0x80) != 0 ? this.R.charAt(n3 - 1) >> 8 : 0;
            dx2.a(this.R, ++n3, n3 + n4, n6, n5);
        }
    }

    private static int a(String string, int n2, int n3) {
        block9: {
            if (n3 < 13312) {
                char c2;
                int n4 = n3 << 1;
                while (n4 > (c2 = string.charAt(n2))) {
                    n2 += 2 + (c2 & '\u0001');
                }
                if (n4 == (c2 & 0x7FFE)) {
                    if ((c2 & '\u0001') != 0) {
                        return string.charAt(n2 + 1) << 16 | string.charAt(n2 + 2);
                    }
                    return string.charAt(n2 + 1);
                }
            } else {
                char c3;
                int n5 = 13312 + (n3 >> 9 & 0xFFFFFFFE);
                int n6 = n3 << 6 & 0xFFFF;
                while (true) {
                    char c4;
                    if (n5 > (c4 = string.charAt(n2))) {
                        n2 += 2 + (c4 & '\u0001');
                        continue;
                    }
                    if (n5 != (c4 & 0x7FFE)) break block9;
                    c3 = string.charAt(n2 + 1);
                    if (n6 <= c3) break;
                    if ((c4 & 0x8000) == 0) {
                        n2 += 3;
                        continue;
                    }
                    break block9;
                    break;
                }
                if (n6 == (c3 & 0xFFC0)) {
                    return (c3 & 0xFFFF003F) << 16 | string.charAt(n2 + 2);
                }
            }
        }
        return -1;
    }

    private void b(int n2, lf lf2) {
        char c2;
        do {
            int n3;
            if (((c2 = this.Q.charAt(n2)) & '\u0001') == 0) {
                n3 = this.Q.charAt(n2 + 1);
                n2 += 2;
            } else {
                n3 = (this.Q.charAt(n2 + 1) & 0xFFFF003F) << 16 | this.Q.charAt(n2 + 2);
                n2 += 3;
            }
            int n4 = n3 >> 1;
            if ((n3 & '\u0001') != 0) {
                this.b(this.E(this.a(n4)), lf2);
            }
            lf2.e(n4);
        } while ((c2 & 0x8000) == 0);
    }

    private void a(dx dx2, int n2, boolean bl2) {
        int n3 = n2;
        StringBuilder stringBuilder = dx2.d();
        if (n3 == stringBuilder.length()) {
            return;
        }
        int n4 = -1;
        int n5 = -1;
        boolean bl3 = false;
        int n6 = 0;
        while (true) {
            int n7 = stringBuilder.codePointAt(n3);
            n3 += Character.charCount(n7);
            int n8 = this.a(n7);
            int n9 = dt.f(n8);
            if (this.s(n8) && n4 >= 0 && (n6 < n9 || n6 == 0)) {
                int n10;
                int n11;
                if (dt.w(n8)) {
                    if (n7 < 4519 && (n11 = (int)(stringBuilder.charAt(n5) - 4352)) < 19) {
                        char c2;
                        n10 = n3 - 1;
                        char c3 = (char)(44032 + (n11 * 21 + (n7 - 4449)) * 28);
                        if (n3 != stringBuilder.length() && (c2 = (char)(stringBuilder.charAt(n3) - 4519)) < '\u001c') {
                            ++n3;
                            c3 = (char)(c3 + c2);
                        }
                        stringBuilder.setCharAt(n5, c3);
                        stringBuilder.delete(n10, n3);
                        n3 = n10;
                    }
                    if (n3 == stringBuilder.length()) break;
                    n4 = -1;
                    continue;
                }
                int n12 = dt.a(this.Q, n4, n7);
                if (n12 >= 0) {
                    n11 = n12 >> 1;
                    n10 = n3 - Character.charCount(n7);
                    stringBuilder.delete(n10, n3);
                    n3 = n10;
                    if (bl3) {
                        if (n11 > 65535) {
                            stringBuilder.setCharAt(n5, kx.b(n11));
                            stringBuilder.setCharAt(n5 + 1, kx.c(n11));
                        } else {
                            stringBuilder.setCharAt(n5, (char)n7);
                            stringBuilder.deleteCharAt(n5 + 1);
                            bl3 = false;
                            --n3;
                        }
                    } else if (n11 > 65535) {
                        bl3 = true;
                        stringBuilder.setCharAt(n5, kx.b(n11));
                        stringBuilder.insert(n5 + 1, kx.c(n11));
                        ++n3;
                    } else {
                        stringBuilder.setCharAt(n5, (char)n11);
                    }
                    if (n3 == stringBuilder.length()) break;
                    if ((n12 & 1) != 0) {
                        n4 = this.E(this.a(n11));
                        continue;
                    }
                    n4 = -1;
                    continue;
                }
            }
            n6 = n9;
            if (n3 == stringBuilder.length()) break;
            if (n9 == 0) {
                n4 = this.D(n8);
                if (n4 < 0) continue;
                if (n7 <= 65535) {
                    bl3 = false;
                    n5 = n3 - 1;
                    continue;
                }
                bl3 = true;
                n5 = n3 - 2;
                continue;
            }
            if (!bl2) continue;
            n4 = -1;
        }
        dx2.e();
    }

    public int a(int n2, int n3) {
        int n4;
        int n5 = this.a(n2);
        if (dt.u(n5)) {
            return -1;
        }
        if (n5 < this.L) {
            if (dt.v(n5)) {
                if (0 <= (n3 -= 4449) && n3 < 21) {
                    return 44032 + ((n2 - 4352) * 21 + n3) * 28;
                }
                return -1;
            }
            if (this.x(n5)) {
                if (dv.a((char)n2) && 0 < (n3 -= 4519) && n3 < 28) {
                    return n2 + n3;
                }
                return -1;
            }
            n4 = n5;
            if (n5 > this.K) {
                n4 += 1 + (this.R.charAt(n4) & 0x1F);
            }
            n4 += 65024 - this.O;
        } else {
            if (n5 < this.O || 65024 <= n5) {
                return -1;
            }
            n4 = n5 - this.O;
        }
        if (n3 < 0 || 0x10FFFF < n3) {
            return -1;
        }
        return dt.a(this.Q, n4, n3) >> 1;
    }

    private boolean c(int n2, int n3) {
        while (true) {
            if (this.y(n3)) {
                return true;
            }
            if (this.t(n3)) {
                return false;
            }
            if (!this.B(n3)) break;
            n2 = this.b(n2, n3);
            n3 = this.a(n2);
        }
        char c2 = this.R.charAt(n3);
        if ((c2 & 0x1F) == 0) {
            return false;
        }
        if ((c2 & 0x80) != 0 && (this.R.charAt(n3 - 1) & 0xFF00) != 0) {
            return false;
        }
        return this.y(this.a(Character.codePointAt(this.R, n3 + 1)));
    }

    private int a(CharSequence charSequence, int n2) {
        while (n2 > 0) {
            int n3 = Character.codePointBefore(charSequence, n2);
            n2 -= Character.charCount(n3);
            if (!this.o(n3)) continue;
            break;
        }
        return n2;
    }

    private int b(CharSequence charSequence, int n2, int n3) {
        int n4;
        int n5;
        while (n2 < n3 && !this.c(n5 = Character.codePointAt(charSequence, n2), n4 = this.P.a(n5))) {
            n2 += Character.charCount(n5);
        }
        return n2;
    }

    private int b(CharSequence charSequence, int n2) {
        while (n2 > 0) {
            int n3 = Character.codePointBefore(charSequence, n2);
            n2 -= Character.charCount(n3);
            if (n3 >= 768 && this.g(n3) > 255) continue;
            break;
        }
        return n2;
    }

    private int c(CharSequence charSequence, int n2, int n3) {
        int n4;
        while (n2 < n3 && (n4 = Character.codePointAt(charSequence, n2)) >= 768 && this.g(n4) > 255) {
            n2 += Character.charCount(n4);
        }
        return n2;
    }

    private void a(gq gq2, int n2, int n3) {
        int n4 = gq2.a(n3);
        if ((n4 & 0x3FFFFF) == 0 && n2 != 0) {
            gq2.d(n3, n4 | n2);
        } else {
            lf lf2;
            if ((n4 & 0x200000) == 0) {
                int n5 = n4 & 0x1FFFFF;
                n4 = n4 & 0xFFE00000 | 0x200000 | this.V.size();
                gq2.d(n3, n4);
                lf2 = new lf();
                this.V.add(lf2);
                if (n5 != 0) {
                    lf2.e(n5);
                }
            } else {
                lf2 = (lf)this.V.get(n4 & 0x1FFFFF);
            }
            lf2.e(n2);
        }
    }
}

