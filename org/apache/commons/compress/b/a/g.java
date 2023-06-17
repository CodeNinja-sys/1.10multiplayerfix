/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b.a;

import java.util.BitSet;
import org.apache.commons.compress.b.a.d;

class g {
    private static final int a = 1000;
    private static final int b = 100;
    private static final int c = 1000;
    private int d;
    private int e;
    private boolean f;
    private final int[] g = new int[1000];
    private final int[] h = new int[1000];
    private final int[] i = new int[1000];
    private final int[] j = new int[256];
    private final int[] k = new int[256];
    private final boolean[] l = new boolean[256];
    private final int[] m = new int[65537];
    private final char[] n;
    private static final int o = 10;
    private int[] p;
    private static final int[] q = new int[]{1, 4, 13, 40, 121, 364, 1093, 3280, 9841, 29524, 88573, 265720, 797161, 2391484};
    private static final int r = 20;
    private static final int s = 10;
    private static final int t = 30;
    private static final int u = 0x200000;
    private static final int v = -2097153;

    g(d d2) {
        this.n = d2.s;
    }

    void a(d d2, int n2) {
        this.e = 30 * n2;
        this.d = 0;
        this.f = true;
        if (n2 + 1 < 10000) {
            this.b(d2, n2);
        } else {
            this.c(d2, n2);
            if (this.f && this.d > this.e) {
                this.b(d2, n2);
            }
        }
        int[] arrn = d2.r;
        d2.t = -1;
        for (int i2 = 0; i2 <= n2; ++i2) {
            if (arrn[i2] != 0) continue;
            d2.t = i2;
            break;
        }
    }

    final void b(d d2, int n2) {
        d2.q[0] = d2.q[n2 + 1];
        this.a(d2.r, d2.q, n2 + 1);
        int n3 = 0;
        while (n3 < n2 + 1) {
            int n4 = n3++;
            d2.r[n4] = d2.r[n4] - 1;
        }
        for (n3 = 0; n3 < n2 + 1; ++n3) {
            if (d2.r[n3] != -1) continue;
            d2.r[n3] = n2;
            break;
        }
    }

    private void a(int[] arrn, int[] arrn2, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        if (n2 == n3) {
            return;
        }
        if (n3 - n2 > 3) {
            for (n7 = n3 - 4; n7 >= n2; --n7) {
                n6 = arrn[n7];
                n5 = arrn2[n6];
                for (n4 = n7 + 4; n4 <= n3 && n5 > arrn2[arrn[n4]]; n4 += 4) {
                    arrn[n4 - 4] = arrn[n4];
                }
                arrn[n4 - 4] = n6;
            }
        }
        for (n7 = n3 - 1; n7 >= n2; --n7) {
            n6 = arrn[n7];
            n5 = arrn2[n6];
            for (n4 = n7 + 1; n4 <= n3 && n5 > arrn2[arrn[n4]]; ++n4) {
                arrn[n4 - 1] = arrn[n4];
            }
            arrn[n4 - 1] = n6;
        }
    }

    private void a(int[] arrn, int n2, int n3) {
        int n4 = arrn[n2];
        arrn[n2] = arrn[n3];
        arrn[n3] = n4;
    }

    private void a(int[] arrn, int n2, int n3, int n4) {
        while (n4 > 0) {
            this.a(arrn, n2, n3);
            ++n2;
            ++n3;
            --n4;
        }
    }

    private int a(int n2, int n3) {
        return n2 < n3 ? n2 : n3;
    }

    private void a(int n2, int n3, int n4) {
        this.g[n2] = n3;
        this.h[n2] = n4;
    }

    private int[] a(int n2) {
        return new int[]{this.g[n2], this.h[n2]};
    }

    private void b(int[] arrn, int[] arrn2, int n2, int n3) {
        long l2 = 0L;
        int n4 = 0;
        this.a(n4++, n2, n3);
        while (n4 > 0) {
            int n5;
            int n6;
            int n7;
            int n8;
            int[] arrn3;
            int n9;
            if ((n9 = (arrn3 = this.a(--n4))[1]) - (n8 = arrn3[0]) < 10) {
                this.a(arrn, arrn2, n8, n9);
                continue;
            }
            long l3 = (l2 = (l2 * 7621L + 1L) % 32768L) % 3L;
            long l4 = l3 == 0L ? (long)arrn2[arrn[n8]] : (l3 == 1L ? (long)arrn2[arrn[n8 + n9 >>> 1]] : (long)arrn2[arrn[n9]]);
            int n10 = n7 = n8;
            int n11 = n6 = n9;
            while (true) {
                if (n10 <= n11) {
                    n5 = arrn2[arrn[n10]] - (int)l4;
                    if (n5 == 0) {
                        this.a(arrn, n10, n7);
                        ++n7;
                        ++n10;
                        continue;
                    }
                    if (n5 <= 0) {
                        ++n10;
                        continue;
                    }
                }
                while (n10 <= n11) {
                    n5 = arrn2[arrn[n11]] - (int)l4;
                    if (n5 == 0) {
                        this.a(arrn, n11, n6);
                        --n6;
                        --n11;
                        continue;
                    }
                    if (n5 < 0) break;
                    --n11;
                }
                if (n10 > n11) break;
                this.a(arrn, n10, n11);
                ++n10;
                --n11;
            }
            if (n6 < n7) continue;
            n5 = this.a(n7 - n8, n10 - n7);
            this.a(arrn, n8, n10 - n5, n5);
            int n12 = this.a(n9 - n6, n6 - n11);
            this.a(arrn, n11 + 1, n9 - n12 + 1, n12);
            n5 = n8 + n10 - n7 - 1;
            n12 = n9 - (n6 - n11) + 1;
            if (n5 - n8 > n9 - n12) {
                this.a(n4++, n8, n5);
                this.a(n4++, n12, n9);
                continue;
            }
            this.a(n4++, n12, n9);
            this.a(n4++, n8, n5);
        }
    }

    private int[] a() {
        return this.p == null ? (this.p = new int[this.n.length / 2]) : this.p;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    final void a(int[] var1_1, byte[] var2_2, int var3_3) {
        var4_4 = new int[257];
        var15_5 = this.a();
        for (var6_6 = 0; var6_6 < var3_3; ++var6_6) {
            var15_5[var6_6] = 0;
        }
        for (var6_6 = 0; var6_6 < var3_3; ++var6_6) {
            v0 = var2_2[var6_6] & 255;
            var4_4[v0] = var4_4[v0] + 1;
        }
        for (var6_6 = 1; var6_6 < 257; ++var6_6) {
            v1 = var6_6;
            var4_4[v1] = var4_4[v1] + var4_4[var6_6 - 1];
        }
        var6_6 = 0;
        while (var6_6 < var3_3) {
            var7_7 = var2_2[var6_6] & 255;
            var4_4[var7_7] = var8_8 = var4_4[var7_7] - 1;
            var1_1[var8_8] = var6_6++;
        }
        var14_9 = 64 + var3_3;
        var16_10 = new BitSet(var14_9);
        for (var6_6 = 0; var6_6 < 256; ++var6_6) {
            var16_10.set(var4_4[var6_6]);
        }
        for (var6_6 = 0; var6_6 < 32; ++var6_6) {
            var16_10.set(var3_3 + 2 * var6_6);
            var16_10.clear(var3_3 + 2 * var6_6 + 1);
        }
        var5_11 = 1;
        do {
            var7_7 = 0;
            for (var6_6 = 0; var6_6 < var3_3; ++var6_6) {
                if (var16_10.get(var6_6)) {
                    var7_7 = var6_6;
                }
                if ((var8_8 = var1_1[var6_6] - var5_11) < 0) {
                    var8_8 += var3_3;
                }
                var15_5[var8_8] = var7_7;
            }
            var13_16 = 0;
            var10_13 = -1;
            block8: while (true) lbl-1000:
            // 3 sources

            {
                var8_8 = var10_13 + 1;
                var9_12 = (var8_8 = var16_10.nextClearBit(var8_8)) - 1;
                if (var9_12 >= var3_3 || (var10_13 = (var8_8 = var16_10.nextSetBit(var8_8 + 1)) - 1) >= var3_3) break;
                if (var10_13 <= var9_12) ** GOTO lbl-1000
                var13_16 += var10_13 - var9_12 + 1;
                this.b(var1_1, var15_5, var9_12, var10_13);
                var11_14 = -1;
                var6_6 = var9_12;
                while (true) {
                    if (var6_6 > var10_13) continue block8;
                    var12_15 = var15_5[var1_1[var6_6]];
                    if (var11_14 != var12_15) {
                        var16_10.set(var6_6);
                        var11_14 = var12_15;
                    }
                    ++var6_6;
                }
                break;
            }
            if ((var5_11 *= 2) > var3_3) return;
        } while (var13_16 != 0);
    }

    private boolean a(d d2, int n2, int n3, int n4, int n5) {
        int n6 = n3 - n2 + 1;
        if (n6 < 2) {
            return this.f && this.d > this.e;
        }
        int n7 = 0;
        while (q[n7] < n6) {
            ++n7;
        }
        int[] arrn = d2.r;
        char[] arrc = this.n;
        byte[] arrby = d2.q;
        int n8 = n5 + 1;
        boolean bl2 = this.f;
        int n9 = this.e;
        int n10 = this.d;
        block1: while (--n7 >= 0) {
            int n11 = q[n7];
            int n12 = n2 + n11 - 1;
            int n13 = n2 + n11;
            while (n13 <= n3) {
                int n14 = 3;
                while (n13 <= n3 && --n14 >= 0) {
                    int n15 = arrn[n13];
                    int n16 = n15 + n4;
                    int n17 = n13;
                    boolean bl3 = false;
                    int n18 = 0;
                    block4: while (true) {
                        int n19;
                        int n20;
                        if (bl3) {
                            arrn[n17] = n18;
                            if ((n17 -= n11) <= n12) {
                                break;
                            }
                        } else {
                            bl3 = true;
                        }
                        if (arrby[(n20 = (n18 = arrn[n17 - n11]) + n4) + 1] == arrby[(n19 = n16) + 1]) {
                            if (arrby[n20 + 2] == arrby[n19 + 2]) {
                                if (arrby[n20 + 3] == arrby[n19 + 3]) {
                                    if (arrby[n20 + 4] == arrby[n19 + 4]) {
                                        if (arrby[n20 + 5] == arrby[n19 + 5]) {
                                            if (arrby[n20 += 6] == arrby[n19 += 6]) {
                                                int n21 = n5;
                                                while (n21 > 0) {
                                                    n21 -= 4;
                                                    if (arrby[n20 + 1] == arrby[n19 + 1]) {
                                                        if (arrc[n20] == arrc[n19]) {
                                                            if (arrby[n20 + 2] == arrby[n19 + 2]) {
                                                                if (arrc[n20 + 1] == arrc[n19 + 1]) {
                                                                    if (arrby[n20 + 3] == arrby[n19 + 3]) {
                                                                        if (arrc[n20 + 2] == arrc[n19 + 2]) {
                                                                            if (arrby[n20 + 4] == arrby[n19 + 4]) {
                                                                                if (arrc[n20 + 3] == arrc[n19 + 3]) {
                                                                                    if ((n20 += 4) >= n8) {
                                                                                        n20 -= n8;
                                                                                    }
                                                                                    if ((n19 += 4) >= n8) {
                                                                                        n19 -= n8;
                                                                                    }
                                                                                    ++n10;
                                                                                    continue;
                                                                                }
                                                                                if (arrc[n20 + 3] <= arrc[n19 + 3]) break block4;
                                                                                continue block4;
                                                                            }
                                                                            if ((arrby[n20 + 4] & 0xFF) <= (arrby[n19 + 4] & 0xFF)) break block4;
                                                                            continue block4;
                                                                        }
                                                                        if (arrc[n20 + 2] <= arrc[n19 + 2]) break block4;
                                                                        continue block4;
                                                                    }
                                                                    if ((arrby[n20 + 3] & 0xFF) <= (arrby[n19 + 3] & 0xFF)) break block4;
                                                                    continue block4;
                                                                }
                                                                if (arrc[n20 + 1] <= arrc[n19 + 1]) break block4;
                                                                continue block4;
                                                            }
                                                            if ((arrby[n20 + 2] & 0xFF) <= (arrby[n19 + 2] & 0xFF)) break block4;
                                                            continue block4;
                                                        }
                                                        if (arrc[n20] <= arrc[n19]) break block4;
                                                        continue block4;
                                                    }
                                                    if ((arrby[n20 + 1] & 0xFF) <= (arrby[n19 + 1] & 0xFF)) break block4;
                                                    continue block4;
                                                }
                                                break;
                                            }
                                            if ((arrby[n20] & 0xFF) <= (arrby[n19] & 0xFF)) break;
                                            continue;
                                        }
                                        if ((arrby[n20 + 5] & 0xFF) <= (arrby[n19 + 5] & 0xFF)) break;
                                        continue;
                                    }
                                    if ((arrby[n20 + 4] & 0xFF) <= (arrby[n19 + 4] & 0xFF)) break;
                                    continue;
                                }
                                if ((arrby[n20 + 3] & 0xFF) <= (arrby[n19 + 3] & 0xFF)) break;
                                continue;
                            }
                            if ((arrby[n20 + 2] & 0xFF) <= (arrby[n19 + 2] & 0xFF)) break;
                            continue;
                        }
                        if ((arrby[n20 + 1] & 0xFF) <= (arrby[n19 + 1] & 0xFF)) break;
                    }
                    arrn[n17] = n15;
                    ++n13;
                }
                if (!bl2 || n13 > n3 || n10 <= n9) continue;
                break block1;
            }
        }
        this.d = n10;
        return bl2 && n10 > n9;
    }

    private static void b(int[] arrn, int n2, int n3, int n4) {
        n4 += n2;
        while (n2 < n4) {
            int n5 = arrn[n2];
            arrn[n2++] = arrn[n3];
            arrn[n3++] = n5;
        }
    }

    private static byte a(byte by2, byte by3, byte by4) {
        return by2 < by3 ? (by3 < by4 ? by3 : (by2 < by4 ? by4 : by2)) : (by3 > by4 ? by3 : (by2 > by4 ? by4 : by2));
    }

    private void b(d d2, int n2, int n3, int n4, int n5) {
        int[] arrn = this.g;
        int[] arrn2 = this.h;
        int[] arrn3 = this.i;
        int[] arrn4 = d2.r;
        byte[] arrby = d2.q;
        arrn[0] = n2;
        arrn2[0] = n3;
        arrn3[0] = n4;
        int n6 = 1;
        while (--n6 >= 0) {
            int n7;
            int n8;
            int n9 = arrn[n6];
            int n10 = arrn2[n6];
            int n11 = arrn3[n6];
            if (n10 - n9 < 20 || n11 > 10) {
                if (!this.a(d2, n9, n10, n11, n5)) continue;
                return;
            }
            int n12 = n11 + 1;
            int n13 = org.apache.commons.compress.b.a.g.a(arrby[arrn4[n9] + n12], arrby[arrn4[n10] + n12], arrby[arrn4[n9 + n10 >>> 1] + n12]) & 0xFF;
            int n14 = n9;
            int n15 = n10;
            int n16 = n9;
            int n17 = n10;
            while (true) {
                if (n14 <= n15) {
                    n8 = (arrby[arrn4[n14] + n12] & 0xFF) - n13;
                    if (n8 == 0) {
                        n7 = arrn4[n14];
                        arrn4[n14++] = arrn4[n16];
                        arrn4[n16++] = n7;
                        continue;
                    }
                    if (n8 < 0) {
                        ++n14;
                        continue;
                    }
                }
                while (n14 <= n15) {
                    n8 = (arrby[arrn4[n15] + n12] & 0xFF) - n13;
                    if (n8 == 0) {
                        n7 = arrn4[n15];
                        arrn4[n15--] = arrn4[n17];
                        arrn4[n17--] = n7;
                        continue;
                    }
                    if (n8 <= 0) break;
                    --n15;
                }
                if (n14 > n15) break;
                n8 = arrn4[n14];
                arrn4[n14++] = arrn4[n15];
                arrn4[n15--] = n8;
            }
            if (n17 < n16) {
                arrn[n6] = n9;
                arrn2[n6] = n10;
                arrn3[n6] = n12;
                ++n6;
                continue;
            }
            n8 = n16 - n9 < n14 - n16 ? n16 - n9 : n14 - n16;
            org.apache.commons.compress.b.a.g.b(arrn4, n9, n14 - n8, n8);
            n7 = n10 - n17 < n17 - n15 ? n10 - n17 : n17 - n15;
            org.apache.commons.compress.b.a.g.b(arrn4, n14, n10 - n7 + 1, n7);
            n8 = n9 + n14 - n16 - 1;
            n7 = n10 - (n17 - n15) + 1;
            arrn[n6] = n9;
            arrn2[n6] = n8;
            arrn3[n6] = n11;
            arrn[++n6] = n8 + 1;
            arrn2[n6] = n7 - 1;
            arrn3[n6] = n12;
            arrn[++n6] = n7;
            arrn2[n6] = n10;
            arrn3[n6] = n11;
            ++n6;
        }
    }

    final void c(d d2, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int[] arrn = this.j;
        int[] arrn2 = this.k;
        boolean[] arrbl = this.l;
        int[] arrn3 = this.m;
        byte[] arrby = d2.q;
        int[] arrn4 = d2.r;
        char[] arrc = this.n;
        int n10 = this.e;
        boolean bl2 = this.f;
        int n11 = 65537;
        while (--n11 >= 0) {
            arrn3[n11] = 0;
        }
        for (n11 = 0; n11 < 20; ++n11) {
            arrby[n2 + n11 + 2] = arrby[n11 % (n2 + 1) + 1];
        }
        n11 = n2 + 20 + 1;
        while (--n11 >= 0) {
            arrc[n11] = '\u0000';
        }
        arrby[0] = arrby[n2 + 1];
        n11 = arrby[0] & 0xFF;
        for (n9 = 0; n9 <= n2; ++n9) {
            n8 = arrby[n9 + 1] & 0xFF;
            int n12 = (n11 << 8) + n8;
            arrn3[n12] = arrn3[n12] + 1;
            n11 = n8;
        }
        for (n9 = 1; n9 <= 65536; ++n9) {
            int n13 = n9;
            arrn3[n13] = arrn3[n13] + arrn3[n9 - 1];
        }
        n11 = arrby[1] & 0xFF;
        n9 = 0;
        while (n9 < n2) {
            n8 = arrby[n9 + 2] & 0xFF;
            int n14 = (n11 << 8) + n8;
            int n15 = arrn3[n14] - 1;
            arrn3[n14] = n15;
            arrn4[n15] = n9++;
            n11 = n8;
        }
        int n16 = ((arrby[n2 + 1] & 0xFF) << 8) + (arrby[1] & 0xFF);
        int n17 = arrn3[n16] - 1;
        arrn3[n16] = n17;
        arrn4[n17] = n2;
        n9 = 256;
        while (--n9 >= 0) {
            arrbl[n9] = false;
            arrn[n9] = n9;
        }
        n9 = 364;
        while (n9 != 1) {
            for (n8 = n9 /= 3; n8 <= 255; ++n8) {
                n7 = arrn[n8];
                n6 = arrn3[n7 + 1 << 8] - arrn3[n7 << 8];
                n5 = n9 - 1;
                n4 = n8;
                n3 = arrn[n4 - n9];
                while (arrn3[n3 + 1 << 8] - arrn3[n3 << 8] > n6) {
                    arrn[n4] = n3;
                    if ((n4 -= n9) <= n5) break;
                    n3 = arrn[n4 - n9];
                }
                arrn[n4] = n7;
            }
        }
        for (n9 = 0; n9 <= 255; ++n9) {
            n8 = arrn[n9];
            for (n7 = 0; n7 <= 255; ++n7) {
                n6 = (n8 << 8) + n7;
                n5 = arrn3[n6];
                if ((n5 & 0x200000) == 0x200000) continue;
                n3 = (arrn3[n6 + 1] & 0xFFDFFFFF) - 1;
                n4 = n5 & 0xFFDFFFFF;
                if (n3 > n4) {
                    this.b(d2, n4, n3, 2, n2);
                    if (bl2 && this.d > n10) {
                        return;
                    }
                }
                arrn3[n6] = n5 | 0x200000;
            }
            for (n7 = 0; n7 <= 255; ++n7) {
                arrn2[n7] = arrn3[(n7 << 8) + n8] & 0xFFDFFFFF;
            }
            n6 = arrn3[n8 + 1 << 8] & 0xFFDFFFFF;
            for (n7 = arrn3[n8 << 8] & 0xFFDFFFFF; n7 < n6; ++n7) {
                n5 = arrn4[n7];
                n11 = arrby[n5] & 0xFF;
                if (arrbl[n11]) continue;
                arrn4[arrn2[n11]] = n5 == 0 ? n2 : n5 - 1;
                int n18 = n11;
                arrn2[n18] = arrn2[n18] + 1;
            }
            n7 = 256;
            while (--n7 >= 0) {
                int n19 = (n7 << 8) + n8;
                arrn3[n19] = arrn3[n19] | 0x200000;
            }
            arrbl[n8] = true;
            if (n9 >= 255) continue;
            n7 = arrn3[n8 << 8] & 0xFFDFFFFF;
            n6 = (arrn3[n8 + 1 << 8] & 0xFFDFFFFF) - n7;
            n5 = 0;
            while (n6 >> n5 > 65534) {
                ++n5;
            }
            for (n4 = 0; n4 < n6; ++n4) {
                char c2;
                n3 = arrn4[n7 + n4];
                arrc[n3] = c2 = (char)(n4 >> n5);
                if (n3 >= 20) continue;
                arrc[n3 + n2 + 1] = c2;
            }
        }
    }
}

