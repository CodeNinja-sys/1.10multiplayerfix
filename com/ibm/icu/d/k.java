/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.d;
import com.ibm.icu.d.i;
import com.ibm.icu.d.l;
import java.util.Arrays;

final class k {
    k() {
    }

    static void a(d d2) {
        int n2;
        byte[] arrby = d2.ak;
        byte[] arrby2 = d2.al;
        byte by2 = d2.aq;
        if (d.b(arrby[n2 - 1]) == 7) {
            d2.ay = n2;
            return;
        }
        for (n2 = d2.ae; n2 > 0 && (d.c(arrby[n2 - 1]) & d.ba) != 0; --n2) {
        }
        while (n2 > 0 && arrby2[n2 - 1] == by2) {
            --n2;
        }
        d2.ay = n2;
    }

    static d a(d d2, int n2, int n3) {
        d d3 = new d();
        d3.ad = d3.af = n3 - n2;
        d3.ae = d3.af;
        int n4 = d3.af;
        d3.ac = new char[n4];
        System.arraycopy(d2.ac, n2, d3.ac, 0, n4);
        d3.aq = d2.a(n2);
        d3.az = d2.az;
        d3.aF = new l[0];
        d3.an = d2.an;
        d3.ao = d2.ao;
        if (d2.aL > 0) {
            for (int i2 = n2; i2 < n3; ++i2) {
                if (!d.b(d2.ac[i2])) continue;
                ++d3.aL;
            }
            d3.af -= d3.aL;
        }
        d3.c(n4);
        d3.ak = d3.ai;
        System.arraycopy(d2.ak, n2, d3.ak, 0, n4);
        d3.d(n4);
        d3.al = d3.aj;
        System.arraycopy(d2.al, n2, d3.al, 0, n4);
        d3.aD = -1;
        if (d2.av != 2) {
            d3.av = d2.av;
            d3.ay = d2.ay <= n2 ? 0 : (d2.ay < n3 ? d2.ay - n2 : n4);
        } else {
            byte[] arrby = d3.al;
            k.a(d3);
            int n5 = d3.ay;
            if (n5 == 0) {
                d3.av = (byte)(d3.aq & 1);
            } else {
                byte by2 = (byte)(arrby[0] & 1);
                if (n5 < n4 && (d3.aq & 1) != by2) {
                    d3.av = (byte)2;
                } else {
                    int n6 = 1;
                    while (true) {
                        if (n6 == n5) {
                            d3.av = by2;
                            break;
                        }
                        if ((arrby[n6] & 1) != by2) {
                            d3.av = (byte)2;
                            break;
                        }
                        ++n6;
                    }
                }
            }
            switch (d3.av) {
                case 0: {
                    d3.aq = (byte)(d3.aq + 1 & 0xFFFFFFFE);
                    d3.ay = 0;
                    break;
                }
                case 1: {
                    d3.aq = (byte)(d3.aq | 1);
                    d3.ay = 0;
                    break;
                }
            }
        }
        d3.aa = d2;
        return d3;
    }

    static byte a(d d2, int n2) {
        if (d2.av != 2 || n2 >= d2.ay) {
            return d2.a(n2);
        }
        return d2.al[n2];
    }

    static byte[] b(d d2) {
        int n2 = d2.ay;
        int n3 = d2.ae;
        if (n2 != n3) {
            Arrays.fill(d2.al, n2, n3, d2.aq);
            d2.ay = n3;
        }
        if (n3 < d2.al.length) {
            byte[] arrby = new byte[n3];
            System.arraycopy(d2.al, 0, arrby, 0, n3);
            return arrby;
        }
        return d2.al;
    }

    static l b(d d2, int n2) {
        l l2 = new l();
        k.c(d2);
        int n3 = d2.aD;
        int n4 = 0;
        int n5 = 0;
        l l3 = d2.aF[0];
        for (int i2 = 0; i2 < n3; ++i2) {
            l3 = d2.aF[i2];
            n5 = l3.a + l3.b - n4;
            if (n2 >= l3.a && n2 < n5) break;
            n4 = l3.b;
        }
        l2.a = l3.a;
        l2.b = n5;
        l2.d = l3.d;
        return l2;
    }

    static l c(d d2, int n2) {
        int n3 = d2.aF[n2].a;
        byte by2 = d2.aF[n2].d;
        int n4 = n2 > 0 ? n3 + d2.aF[n2].b - d2.aF[n2 - 1].b : n3 + d2.aF[0].b;
        return new l(n3, n4, by2);
    }

    static void a(d d2, byte by2) {
        d2.aF = d2.aG;
        d2.aD = 1;
        d2.aF[0] = new l(0, d2.ae, by2);
    }

    private static void a(d d2, byte by2, byte by3) {
        l l2;
        int n2;
        if (by3 <= (by2 | 1)) {
            return;
        }
        by2 = (byte)(by2 + 1);
        l[] arrl = d2.aF;
        byte[] arrby = d2.al;
        int n3 = d2.aD;
        if (d2.ay < d2.ae) {
            --n3;
        }
        block0: while ((by3 = (byte)(by3 - 1)) >= by2) {
            n2 = 0;
            while (true) {
                if (n2 < n3 && arrby[arrl[n2].a] < by3) {
                    ++n2;
                    continue;
                }
                if (n2 >= n3) continue block0;
                int n4 = n2;
                while (++n4 < n3 && arrby[arrl[n4].a] >= by3) {
                }
                for (int i2 = n4 - 1; n2 < i2; ++n2, --i2) {
                    l2 = arrl[n2];
                    arrl[n2] = arrl[i2];
                    arrl[i2] = l2;
                }
                if (n4 == n3) continue block0;
                n2 = n4 + 1;
            }
        }
        if ((by2 & 1) == 0) {
            n2 = 0;
            if (d2.ay == d2.ae) {
                --n3;
            }
            while (n2 < n3) {
                l2 = arrl[n2];
                arrl[n2] = arrl[n3];
                arrl[n3] = l2;
                ++n2;
                --n3;
            }
        }
    }

    static int d(d d2, int n2) {
        l[] arrl = d2.aF;
        int n3 = d2.aD;
        int n4 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n5 = arrl[i2].b - n4;
            int n6 = arrl[i2].a;
            if (n2 >= n6 && n2 < n6 + n5) {
                return i2;
            }
            n4 += n5;
        }
        throw new IllegalStateException("Internal ICU error in getRunFromLogicalIndex");
    }

    static void c(d d2) {
        int n2;
        int n3;
        if (d2.aD >= 0) {
            return;
        }
        if (d2.av != 2) {
            k.a(d2, d2.aq);
        } else {
            int n4;
            n3 = d2.ae;
            byte[] arrby = d2.al;
            byte by2 = 126;
            n2 = d2.ay;
            int n5 = 0;
            for (n4 = 0; n4 < n2; ++n4) {
                if (arrby[n4] == by2) continue;
                ++n5;
                by2 = arrby[n4];
            }
            if (n5 == 1 && n2 == n3) {
                k.a(d2, arrby[0]);
            } else {
                byte by3 = 62;
                byte by4 = 0;
                if (n2 < n3) {
                    ++n5;
                }
                d2.e(n5);
                l[] arrl = d2.aE;
                int n6 = 0;
                n4 = 0;
                do {
                    int n7 = n4;
                    by2 = arrby[n4];
                    if (by2 < by3) {
                        by3 = by2;
                    }
                    if (by2 > by4) {
                        by4 = by2;
                    }
                    while (++n4 < n2 && arrby[n4] == by2) {
                    }
                    arrl[n6] = new l(n7, n4 - n7, by2);
                    ++n6;
                } while (n4 < n2);
                if (n2 < n3) {
                    arrl[n6] = new l(n2, n3 - n2, d2.aq);
                    if (d2.aq < by3) {
                        by3 = d2.aq;
                    }
                }
                d2.aF = arrl;
                d2.aD = n5;
                k.a(d2, by3, by4);
                n2 = 0;
                for (n4 = 0; n4 < n5; ++n4) {
                    arrl[n4].d = arrby[arrl[n4].a];
                    n2 = arrl[n4].b += n2;
                }
                if (n6 < n5) {
                    int n8 = (d2.aq & 1) != 0 ? 0 : n6;
                    arrl[n8].d = d2.aq;
                }
            }
        }
        if (d2.aK.a > 0) {
            for (int i2 = 0; i2 < d2.aK.a; ++i2) {
                i i3 = d2.aK.c[i2];
                n2 = k.d(d2, i3.a);
                d2.aF[n2].c |= i3.b;
            }
        }
        if (d2.aL > 0) {
            for (n2 = 0; n2 < d2.ae; ++n2) {
                char c2 = d2.ac[n2];
                if (!d.b(c2)) continue;
                n3 = k.d(d2, n2);
                --d2.aF[n3].c;
            }
        }
    }

    static int[] a(byte[] arrby, byte[] arrby2, byte[] arrby3) {
        if (arrby == null || arrby.length <= 0) {
            return null;
        }
        byte by2 = 62;
        byte by3 = 0;
        int n2 = arrby.length;
        while (n2 > 0) {
            byte by4;
            if ((by4 = arrby[--n2]) > 62) {
                return null;
            }
            if (by4 < by2) {
                by2 = by4;
            }
            if (by4 <= by3) continue;
            by3 = by4;
        }
        arrby2[0] = by2;
        arrby3[0] = by3;
        int[] arrn = new int[arrby.length];
        n2 = arrby.length;
        while (n2 > 0) {
            arrn[--n2] = n2;
        }
        return arrn;
    }

    static int[] a(byte[] arrby) {
        byte[] arrby2 = new byte[1];
        byte[] arrby3 = new byte[1];
        int[] arrn = k.a(arrby, arrby2, arrby3);
        if (arrn == null) {
            return null;
        }
        byte by2 = arrby2[0];
        byte by3 = arrby3[0];
        if (by2 == by3 && (by2 & 1) == 0) {
            return arrn;
        }
        by2 = (byte)(by2 | 1);
        block0: do {
            int n2 = 0;
            while (true) {
                if (n2 < arrby.length && arrby[n2] < by3) {
                    ++n2;
                    continue;
                }
                if (n2 >= arrby.length) continue block0;
                int n3 = n2;
                while (++n3 < arrby.length && arrby[n3] >= by3) {
                }
                int n4 = n2 + n3 - 1;
                do {
                    arrn[n2] = n4 - arrn[n2];
                } while (++n2 < n3);
                if (n3 == arrby.length) continue block0;
                n2 = n3 + 1;
            }
        } while ((by3 = (byte)(by3 - 1)) >= by2);
        return arrn;
    }

    static int[] b(byte[] arrby) {
        byte[] arrby2 = new byte[1];
        byte[] arrby3 = new byte[1];
        int[] arrn = k.a(arrby, arrby2, arrby3);
        if (arrn == null) {
            return null;
        }
        byte by2 = arrby2[0];
        byte by3 = arrby3[0];
        if (by2 == by3 && (by2 & 1) == 0) {
            return arrn;
        }
        by2 = (byte)(by2 | 1);
        block0: do {
            int n2 = 0;
            while (true) {
                if (n2 < arrby.length && arrby[n2] < by3) {
                    ++n2;
                    continue;
                }
                if (n2 >= arrby.length) continue block0;
                int n3 = n2;
                while (++n3 < arrby.length && arrby[n3] >= by3) {
                }
                for (int i2 = n3 - 1; n2 < i2; ++n2, --i2) {
                    int n4 = arrn[n2];
                    arrn[n2] = arrn[i2];
                    arrn[i2] = n4;
                }
                if (n3 == arrby.length) continue block0;
                n2 = n3 + 1;
            }
        } while ((by3 = (byte)(by3 - 1)) >= by2);
        return arrn;
    }

    static int e(d d2, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        l[] arrl;
        int n7 = -1;
        switch (d2.av) {
            case 0: {
                n7 = n2;
                break;
            }
            case 1: {
                n7 = d2.ae - n2 - 1;
                break;
            }
            default: {
                k.c(d2);
                arrl = d2.aF;
                n6 = 0;
                for (n5 = 0; n5 < d2.aD; ++n5) {
                    n4 = arrl[n5].b - n6;
                    n3 = n2 - arrl[n5].a;
                    if (n3 >= 0 && n3 < n4) {
                        if (arrl[n5].f()) {
                            n7 = n6 + n3;
                            break;
                        }
                        n7 = n6 + n4 - n3 - 1;
                        break;
                    }
                    n6 += n4;
                }
                if (n5 < d2.aD) break;
                return -1;
            }
        }
        if (d2.aK.a > 0) {
            arrl = d2.aF;
            n4 = 0;
            int n8 = 0;
            n5 = 0;
            while (true) {
                n6 = arrl[n5].b - n4;
                n3 = arrl[n5].c;
                if ((n3 & 5) > 0) {
                    ++n8;
                }
                if (n7 < arrl[n5].b) {
                    return n7 + n8;
                }
                if ((n3 & 0xA) > 0) {
                    ++n8;
                }
                ++n5;
                n4 += n6;
            }
        }
        if (d2.aL > 0) {
            arrl = d2.aF;
            int n9 = 0;
            int n10 = 0;
            char c2 = d2.ac[n2];
            if (d.b(c2)) {
                return -1;
            }
            n5 = 0;
            while (true) {
                int n11 = arrl[n5].b - n9;
                int n12 = arrl[n5].c;
                if (n7 >= arrl[n5].b) {
                    n10 -= n12;
                } else {
                    if (n12 == 0) {
                        return n7 - n10;
                    }
                    if (arrl[n5].f()) {
                        n3 = arrl[n5].a;
                        n4 = n2;
                    } else {
                        n3 = n2 + 1;
                        n4 = arrl[n5].a + n11;
                    }
                    for (n6 = n3; n6 < n4; ++n6) {
                        c2 = d2.ac[n6];
                        if (!d.b(c2)) continue;
                        ++n10;
                    }
                    return n7 - n10;
                }
                ++n5;
                n9 += n11;
            }
        }
        return n7;
    }

    static int f(d d2, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        l[] arrl;
        block21: {
            int n7;
            int n8;
            arrl = d2.aF;
            n6 = d2.aD;
            if (d2.aK.a > 0) {
                n5 = 0;
                n8 = 0;
                n4 = 0;
                while (true) {
                    n7 = arrl[n4].b - n8;
                    n3 = arrl[n4].c;
                    if ((n3 & 5) > 0) {
                        if (n2 <= n8 + n5) {
                            return -1;
                        }
                        ++n5;
                    }
                    if (n2 < arrl[n4].b + n5) {
                        n2 -= n5;
                        break block21;
                    }
                    if ((n3 & 0xA) > 0) {
                        if (n2 == n8 + n7 + n5) {
                            return -1;
                        }
                        ++n5;
                    }
                    ++n4;
                    n8 += n7;
                }
            }
            if (d2.aL > 0) {
                n5 = 0;
                int n9 = 0;
                n4 = 0;
                while (true) {
                    n8 = arrl[n4].b - n9;
                    n3 = arrl[n4].c;
                    if (n2 >= arrl[n4].b - n5 + n3) {
                        n5 -= n3;
                    } else {
                        if (n3 == 0) {
                            n2 += n5;
                            break;
                        }
                        n7 = arrl[n4].a;
                        boolean bl2 = arrl[n4].f();
                        int n10 = n7 + n8 - 1;
                        for (int i2 = 0; i2 < n8; ++i2) {
                            int n11 = bl2 ? n7 + i2 : n10 - i2;
                            char c2 = d2.ac[n11];
                            if (d.b(c2)) {
                                ++n5;
                            }
                            if (n2 + n5 == n9 + i2) break;
                        }
                        n2 += n5;
                        break;
                    }
                    ++n4;
                    n9 += n8;
                }
            }
        }
        if (n6 <= 10) {
            n4 = 0;
            while (n2 >= arrl[n4].b) {
                ++n4;
            }
        } else {
            n5 = 0;
            n3 = n6;
            while (true) {
                n4 = n5 + n3 >>> 1;
                if (n2 >= arrl[n4].b) {
                    n5 = n4 + 1;
                    continue;
                }
                if (n4 == 0 || n2 >= arrl[n4 - 1].b) break;
                n3 = n4;
            }
        }
        int n12 = arrl[n4].a;
        if (arrl[n4].f()) {
            if (n4 > 0) {
                n2 -= arrl[n4 - 1].b;
            }
            return n12 + n2;
        }
        return n12 + arrl[n4].b - n2 - 1;
    }

    static int[] d(d d2) {
        int[] arrn;
        block18: {
            int n2;
            int n3;
            int n4;
            l[] arrl;
            block17: {
                arrl = d2.aF;
                arrn = new int[d2.ae];
                if (d2.ae > d2.af) {
                    Arrays.fill(arrn, -1);
                }
                n4 = 0;
                for (n3 = 0; n3 < d2.aD; ++n3) {
                    n2 = arrl[n3].a;
                    int n5 = arrl[n3].b;
                    if (arrl[n3].f()) {
                        do {
                            arrn[n2++] = n4++;
                        } while (n4 < n5);
                        continue;
                    }
                    n2 += n5 - n4;
                    do {
                        arrn[--n2] = n4++;
                    } while (n4 < n5);
                }
                if (d2.aK.a <= 0) break block17;
                n3 = 0;
                int n6 = d2.aD;
                arrl = d2.aF;
                n4 = 0;
                int n7 = 0;
                while (n7 < n6) {
                    int n8 = arrl[n7].b - n4;
                    int n9 = arrl[n7].c;
                    if ((n9 & 5) > 0) {
                        ++n3;
                    }
                    if (n3 > 0) {
                        n2 = arrl[n7].a;
                        int n10 = n2 + n8;
                        int n11 = n2;
                        while (n11 < n10) {
                            int n12 = n11++;
                            arrn[n12] = arrn[n12] + n3;
                        }
                    }
                    if ((n9 & 0xA) > 0) {
                        ++n3;
                    }
                    ++n7;
                    n4 += n8;
                }
                break block18;
            }
            if (d2.aL <= 0) break block18;
            n3 = 0;
            int n13 = d2.aD;
            arrl = d2.aF;
            n4 = 0;
            int n14 = 0;
            while (n14 < n13) {
                int n15 = arrl[n14].b - n4;
                int n16 = arrl[n14].c;
                if (n3 - n16 != 0) {
                    int n17;
                    n2 = arrl[n14].a;
                    boolean bl2 = arrl[n14].f();
                    int n18 = n2 + n15;
                    if (n16 == 0) {
                        n17 = n2;
                        while (n17 < n18) {
                            int n19 = n17++;
                            arrn[n19] = arrn[n19] - n3;
                        }
                    } else {
                        for (n17 = 0; n17 < n15; ++n17) {
                            int n20 = bl2 ? n2 + n17 : n18 - n17 - 1;
                            char c2 = d2.ac[n20];
                            if (d.b(c2)) {
                                ++n3;
                                arrn[n20] = -1;
                                continue;
                            }
                            int n21 = n20;
                            arrn[n21] = arrn[n21] - n3;
                        }
                    }
                }
                ++n14;
                n4 += n15;
            }
        }
        return arrn;
    }

    static int[] e(d d2) {
        int n2;
        int n3;
        int n4;
        l[] arrl = d2.aF;
        int n5 = d2.ae > d2.af ? d2.ae : d2.af;
        int[] arrn = new int[n5];
        int n6 = 0;
        int n7 = 0;
        for (n4 = 0; n4 < d2.aD; ++n4) {
            n3 = arrl[n4].a;
            n2 = arrl[n4].b;
            if (arrl[n4].f()) {
                do {
                    arrn[n7++] = n3++;
                } while (++n6 < n2);
                continue;
            }
            n3 += n2 - n6;
            do {
                arrn[n7++] = --n3;
            } while (++n6 < n2);
        }
        if (d2.aK.a > 0) {
            int n8;
            int n9;
            n4 = 0;
            int n10 = d2.aD;
            arrl = d2.aF;
            for (n9 = 0; n9 < n10; ++n9) {
                n8 = arrl[n9].c;
                if ((n8 & 5) > 0) {
                    ++n4;
                }
                if ((n8 & 0xA) <= 0) continue;
                ++n4;
            }
            int n11 = d2.af;
            for (n9 = n10 - 1; n9 >= 0 && n4 > 0; --n9) {
                n8 = arrl[n9].c;
                if ((n8 & 0xA) > 0) {
                    arrn[--n11] = -1;
                    --n4;
                }
                n6 = n9 > 0 ? arrl[n9 - 1].b : 0;
                for (int i2 = arrl[n9].b - 1; i2 >= n6 && n4 > 0; --i2) {
                    arrn[--n11] = arrn[i2];
                }
                if ((n8 & 5) <= 0) continue;
                arrn[--n11] = -1;
                --n4;
            }
        } else if (d2.aL > 0) {
            n4 = d2.aD;
            arrl = d2.aF;
            n6 = 0;
            int n12 = 0;
            int n13 = 0;
            while (n13 < n4) {
                int n14;
                int n15 = arrl[n13].b - n6;
                int n16 = arrl[n13].c;
                if (n16 == 0 && n12 == n6) {
                    n12 += n15;
                } else if (n16 == 0) {
                    n2 = arrl[n13].b;
                    for (n14 = n6; n14 < n2; ++n14) {
                        arrn[n12++] = arrn[n14];
                    }
                } else {
                    n3 = arrl[n13].a;
                    boolean bl2 = arrl[n13].f();
                    int n17 = n3 + n15 - 1;
                    for (n14 = 0; n14 < n15; ++n14) {
                        int n18 = bl2 ? n3 + n14 : n17 - n14;
                        char c2 = d2.ac[n18];
                        if (d.b(c2)) continue;
                        arrn[n12++] = n18;
                    }
                }
                ++n13;
                n6 += n15;
            }
        }
        if (n5 == d2.af) {
            return arrn;
        }
        int[] arrn2 = new int[d2.af];
        System.arraycopy(arrn, 0, arrn2, 0, d2.af);
        return arrn2;
    }

    static int[] a(int[] arrn) {
        int n2;
        int n3;
        int n4 = arrn.length;
        int n5 = -1;
        int n6 = 0;
        for (n3 = 0; n3 < n4; ++n3) {
            n2 = arrn[n3];
            if (n2 > n5) {
                n5 = n2;
            }
            if (n2 < 0) continue;
            ++n6;
        }
        int[] arrn2 = new int[++n5];
        if (n6 < n5) {
            Arrays.fill(arrn2, -1);
        }
        for (n3 = 0; n3 < n4; ++n3) {
            n2 = arrn[n3];
            if (n2 < 0) continue;
            arrn2[n2] = n3;
        }
        return arrn2;
    }
}

