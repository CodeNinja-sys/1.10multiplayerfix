/*
 * Decompiled with CFR 0.150.
 */
package com.b.b;

import com.b.b.a;
import com.b.b.ao;
import com.b.b.c;
import com.b.b.h;
import com.b.b.o;
import com.b.b.p;
import com.b.b.r;
import com.b.b.v;
import com.b.b.w;

class m
extends r {
    static final int a = 140;
    static final int b = 63;
    private static float[] d = new float[]{1.0649863E-7f, 1.1341951E-7f, 1.2079015E-7f, 1.2863978E-7f, 1.369995E-7f, 1.459025E-7f, 1.5538409E-7f, 1.6548181E-7f, 1.7623574E-7f, 1.8768856E-7f, 1.998856E-7f, 2.128753E-7f, 2.2670913E-7f, 2.4144197E-7f, 2.5713223E-7f, 2.7384212E-7f, 2.9163792E-7f, 3.1059022E-7f, 3.307741E-7f, 3.5226967E-7f, 3.7516213E-7f, 3.995423E-7f, 4.255068E-7f, 4.5315863E-7f, 4.8260745E-7f, 5.1397E-7f, 5.4737063E-7f, 5.829419E-7f, 6.208247E-7f, 6.611694E-7f, 7.041359E-7f, 7.4989464E-7f, 7.98627E-7f, 8.505263E-7f, 9.057983E-7f, 9.646621E-7f, 1.0273513E-6f, 1.0941144E-6f, 1.1652161E-6f, 1.2409384E-6f, 1.3215816E-6f, 1.4074654E-6f, 1.4989305E-6f, 1.5963394E-6f, 1.7000785E-6f, 1.8105592E-6f, 1.9282195E-6f, 2.053526E-6f, 2.1869757E-6f, 2.3290977E-6f, 2.4804558E-6f, 2.6416496E-6f, 2.813319E-6f, 2.9961443E-6f, 3.1908505E-6f, 3.39821E-6f, 3.619045E-6f, 3.8542307E-6f, 4.1047006E-6f, 4.371447E-6f, 4.6555283E-6f, 4.958071E-6f, 5.280274E-6f, 5.623416E-6f, 5.988857E-6f, 6.3780467E-6f, 6.7925284E-6f, 7.2339453E-6f, 7.704048E-6f, 8.2047E-6f, 8.737888E-6f, 9.305725E-6f, 9.910464E-6f, 1.0554501E-5f, 1.1240392E-5f, 1.1970856E-5f, 1.2748789E-5f, 1.3577278E-5f, 1.4459606E-5f, 1.5399271E-5f, 1.6400005E-5f, 1.7465769E-5f, 1.8600793E-5f, 1.9809577E-5f, 2.1096914E-5f, 2.2467912E-5f, 2.3928002E-5f, 2.5482977E-5f, 2.7139005E-5f, 2.890265E-5f, 3.078091E-5f, 3.2781227E-5f, 3.4911533E-5f, 3.718028E-5f, 3.9596467E-5f, 4.2169668E-5f, 4.491009E-5f, 4.7828602E-5f, 5.0936775E-5f, 5.424693E-5f, 5.7772202E-5f, 6.152657E-5f, 6.552491E-5f, 6.9783084E-5f, 7.4317984E-5f, 7.914758E-5f, 8.429104E-5f, 8.976875E-5f, 9.560242E-5f, 1.0181521E-4f, 1.0843174E-4f, 1.1547824E-4f, 1.2298267E-4f, 1.3097477E-4f, 1.3948625E-4f, 1.4855085E-4f, 1.5820454E-4f, 1.6848555E-4f, 1.7943469E-4f, 1.9109536E-4f, 2.0351382E-4f, 2.167393E-4f, 2.3082423E-4f, 2.4582449E-4f, 2.6179955E-4f, 2.7881275E-4f, 2.9693157E-4f, 3.1622787E-4f, 3.3677815E-4f, 3.5866388E-4f, 3.8197188E-4f, 4.0679457E-4f, 4.3323037E-4f, 4.613841E-4f, 4.913675E-4f, 5.2329927E-4f, 5.573062E-4f, 5.935231E-4f, 6.320936E-4f, 6.731706E-4f, 7.16917E-4f, 7.635063E-4f, 8.1312325E-4f, 8.6596457E-4f, 9.2223985E-4f, 9.821722E-4f, 0.0010459992f, 0.0011139743f, 0.0011863665f, 0.0012634633f, 0.0013455702f, 0.0014330129f, 0.0015261382f, 0.0016253153f, 0.0017309374f, 0.0018434235f, 0.0019632196f, 0.0020908006f, 0.0022266726f, 0.0023713743f, 0.0025254795f, 0.0026895993f, 0.0028643848f, 0.0030505287f, 0.003248769f, 0.0034598925f, 0.0036847359f, 0.0039241905f, 0.0041792067f, 0.004450795f, 0.004740033f, 0.005048067f, 0.0053761187f, 0.005725489f, 0.0060975635f, 0.0064938175f, 0.0069158226f, 0.0073652514f, 0.007843887f, 0.008353627f, 0.008896492f, 0.009474637f, 0.010090352f, 0.01074608f, 0.011444421f, 0.012188144f, 0.012980198f, 0.013823725f, 0.014722068f, 0.015678791f, 0.016697686f, 0.017782796f, 0.018938422f, 0.020169148f, 0.021479854f, 0.022875736f, 0.02436233f, 0.025945531f, 0.027631618f, 0.029427277f, 0.031339627f, 0.03337625f, 0.035545226f, 0.037855156f, 0.0403152f, 0.042935107f, 0.045725275f, 0.048696756f, 0.05186135f, 0.05523159f, 0.05882085f, 0.062643364f, 0.06671428f, 0.07104975f, 0.075666964f, 0.08058423f, 0.08582105f, 0.09139818f, 0.097337745f, 0.1036633f, 0.11039993f, 0.11757434f, 0.12521498f, 0.13335215f, 0.14201812f, 0.15124726f, 0.16107617f, 0.1715438f, 0.18269168f, 0.19456401f, 0.20720787f, 0.22067343f, 0.23501402f, 0.25028655f, 0.26655158f, 0.28387362f, 0.3023213f, 0.32196787f, 0.34289113f, 0.36517414f, 0.3889052f, 0.41417846f, 0.44109413f, 0.4697589f, 0.50028646f, 0.53279793f, 0.5674221f, 0.6042964f, 0.64356697f, 0.6853896f, 0.72993004f, 0.777365f, 0.8278826f, 0.88168305f, 0.9389798f, 1.0f};

    m() {
    }

    void a(Object object, com.b.a.a a2) {
        int n2;
        int n3;
        o o2 = (o)object;
        int n4 = 0;
        int n5 = o2.k[1];
        int n6 = -1;
        a2.a(o2.d, 5);
        for (n3 = 0; n3 < o2.d; ++n3) {
            a2.a(o2.e[n3], 4);
            if (n6 >= o2.e[n3]) continue;
            n6 = o2.e[n3];
        }
        for (n3 = 0; n3 < n6 + 1; ++n3) {
            a2.a(o2.f[n3] - 1, 3);
            a2.a(o2.g[n3], 2);
            if (o2.g[n3] != 0) {
                a2.a(o2.h[n3], 8);
            }
            for (n2 = 0; n2 < 1 << o2.g[n3]; ++n2) {
                a2.a(o2.i[n3][n2] + 1, 8);
            }
        }
        a2.a(o2.j - 1, 2);
        a2.a(ao.b(n5), 4);
        int n7 = ao.b(n5);
        n2 = 0;
        for (n3 = 0; n3 < o2.d; ++n3) {
            while (n2 < (n4 += o2.f[o2.e[n3]])) {
                a2.a(o2.k[n2 + 2], n7);
                ++n2;
            }
        }
    }

    Object a(v v2, com.b.a.a a2) {
        int n2;
        int n3;
        int n4 = 0;
        int n5 = -1;
        o o2 = new o(this);
        o2.d = a2.c(5);
        for (n3 = 0; n3 < o2.d; ++n3) {
            o2.e[n3] = a2.c(4);
            if (n5 >= o2.e[n3]) continue;
            n5 = o2.e[n3];
        }
        for (n3 = 0; n3 < n5 + 1; ++n3) {
            o2.f[n3] = a2.c(3) + 1;
            o2.g[n3] = a2.c(2);
            if (o2.g[n3] < 0) {
                o2.a();
                return null;
            }
            if (o2.g[n3] != 0) {
                o2.h[n3] = a2.c(8);
            }
            if (o2.h[n3] < 0 || o2.h[n3] >= v2.m) {
                o2.a();
                return null;
            }
            for (n2 = 0; n2 < 1 << o2.g[n3]; ++n2) {
                o2.i[n3][n2] = a2.c(8) - 1;
                if (o2.i[n3][n2] >= -1 && o2.i[n3][n2] < v2.m) continue;
                o2.a();
                return null;
            }
        }
        o2.j = a2.c(2) + 1;
        int n6 = a2.c(4);
        n2 = 0;
        for (n3 = 0; n3 < o2.d; ++n3) {
            while (n2 < (n4 += o2.f[o2.e[n3]])) {
                o2.k[n2 + 2] = a2.c(n6);
                int n7 = o2.k[n2 + 2];
                if (n7 < 0 || n7 >= 1 << n6) {
                    o2.a();
                    return null;
                }
                ++n2;
            }
        }
        o2.k[0] = 0;
        o2.k[1] = 1 << n6;
        return o2;
    }

    Object a(h h2, w w2, Object object) {
        int n2;
        int n3;
        int n4;
        int n5 = 0;
        int[] arrn = new int[65];
        o o2 = (o)object;
        p p2 = new p(this);
        p2.j = o2;
        p2.h = o2.k[1];
        for (n4 = 0; n4 < o2.d; ++n4) {
            n5 += o2.f[o2.e[n4]];
        }
        p2.g = n5 += 2;
        for (n4 = 0; n4 < n5; ++n4) {
            arrn[n4] = n4;
        }
        for (n3 = 0; n3 < n5 - 1; ++n3) {
            for (n2 = n3; n2 < n5; ++n2) {
                if (o2.k[arrn[n3]] <= o2.k[arrn[n2]]) continue;
                n4 = arrn[n2];
                arrn[n2] = arrn[n3];
                arrn[n3] = n4;
            }
        }
        for (n3 = 0; n3 < n5; ++n3) {
            p2.c[n3] = arrn[n3];
        }
        for (n3 = 0; n3 < n5; ++n3) {
            p2.d[p2.c[n3]] = n3;
        }
        for (n3 = 0; n3 < n5; ++n3) {
            p2.b[n3] = o2.k[p2.c[n3]];
        }
        switch (o2.j) {
            case 1: {
                p2.i = 256;
                break;
            }
            case 2: {
                p2.i = 128;
                break;
            }
            case 3: {
                p2.i = 86;
                break;
            }
            case 4: {
                p2.i = 64;
                break;
            }
            default: {
                p2.i = -1;
            }
        }
        for (n3 = 0; n3 < n5 - 2; ++n3) {
            n2 = 0;
            int n6 = 1;
            int n7 = 0;
            int n8 = p2.h;
            int n9 = o2.k[n3 + 2];
            for (int i2 = 0; i2 < n3 + 2; ++i2) {
                int n10 = o2.k[i2];
                if (n10 > n7 && n10 < n9) {
                    n2 = i2;
                    n7 = n10;
                }
                if (n10 >= n8 || n10 <= n9) continue;
                n6 = i2;
                n8 = n10;
            }
            p2.f[n3] = n2;
            p2.e[n3] = n6;
        }
        return p2;
    }

    void b(Object object) {
    }

    void c(Object object) {
    }

    void d(Object object) {
    }

    int a(a a2, Object object, float[] arrf, float[] arrf2, Object object2) {
        return 0;
    }

    Object a(a a2, Object object, Object object2) {
        p p2 = (p)object;
        o o2 = p2.j;
        c[] arrc = a2.k.A;
        if (a2.b.c(1) == 1) {
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int[] arrn = null;
            if (object2 instanceof int[]) {
                arrn = (int[])object2;
            }
            if (arrn == null || arrn.length < p2.g) {
                arrn = new int[p2.g];
            } else {
                for (n6 = 0; n6 < arrn.length; ++n6) {
                    arrn[n6] = 0;
                }
            }
            arrn[0] = a2.b.c(ao.a(p2.i - 1));
            arrn[1] = a2.b.c(ao.a(p2.i - 1));
            int n7 = 2;
            for (n6 = 0; n6 < o2.d; ++n6) {
                n5 = o2.e[n6];
                n4 = o2.f[n5];
                n3 = o2.g[n5];
                n2 = 1 << n3;
                int n8 = 0;
                if (n3 != 0 && (n8 = arrc[o2.h[n5]].a(a2.b)) == -1) {
                    return null;
                }
                for (int i2 = 0; i2 < n4; ++i2) {
                    int n9 = o2.i[n5][n8 & n2 - 1];
                    n8 >>>= n3;
                    if (n9 >= 0) {
                        arrn[n7 + i2] = arrc[n9].a(a2.b);
                        if (arrn[n7 + i2] != -1) continue;
                        return null;
                    }
                    arrn[n7 + i2] = 0;
                }
                n7 += n4;
            }
            for (n6 = 2; n6 < p2.g; ++n6) {
                n7 = m.a(o2.k[p2.f[n6 - 2]], o2.k[p2.e[n6 - 2]], arrn[p2.f[n6 - 2]], arrn[p2.e[n6 - 2]], o2.k[n6]);
                n5 = p2.i - n7;
                n3 = (n5 < (n4 = n7) ? n5 : n4) << 1;
                n2 = arrn[n6];
                if (n2 != 0) {
                    n2 = n2 >= n3 ? (n5 > n4 ? (n2 -= n4) : -1 - (n2 - n5)) : ((n2 & 1) != 0 ? -(n2 + 1 >>> 1) : (n2 >>= 1));
                    arrn[n6] = n2 + n7;
                    int n10 = p2.f[n6 - 2];
                    arrn[n10] = arrn[n10] & 0x7FFF;
                    int n11 = p2.e[n6 - 2];
                    arrn[n11] = arrn[n11] & 0x7FFF;
                    continue;
                }
                arrn[n6] = n7 | 0x8000;
            }
            return arrn;
        }
        return null;
    }

    private static int a(int n2, int n3, int n4, int n5, int n6) {
        int n7 = (n5 &= 0x7FFF) - (n4 &= 0x7FFF);
        int n8 = n3 - n2;
        int n9 = Math.abs(n7);
        int n10 = n9 * (n6 - n2);
        int n11 = n10 / n8;
        if (n7 < 0) {
            return n4 - n11;
        }
        return n4 + n11;
    }

    int a(a a2, Object object, Object object2, float[] arrf) {
        p p2 = (p)object;
        o o2 = p2.j;
        int n2 = a2.k.e.g[a2.g] / 2;
        if (object2 != null) {
            int n3;
            int[] arrn = (int[])object2;
            int n4 = 0;
            int n5 = 0;
            int n6 = arrn[0] * o2.j;
            for (n3 = 1; n3 < p2.g; ++n3) {
                int n7 = p2.c[n3];
                int n8 = arrn[n7] & 0x7FFF;
                if (n8 != arrn[n7]) continue;
                n4 = o2.k[n7];
                m.a(n5, n4, n6, n8 *= o2.j, arrf);
                n5 = n4;
                n6 = n8;
            }
            for (n3 = n4; n3 < n2; ++n3) {
                int n9 = n3;
                arrf[n9] = arrf[n9] * arrf[n3 - 1];
            }
            return 1;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            arrf[i2] = 0.0f;
        }
        return 0;
    }

    private static void a(int n2, int n3, int n4, int n5, float[] arrf) {
        int n6 = n5 - n4;
        int n7 = n3 - n2;
        int n8 = Math.abs(n6);
        int n9 = n6 / n7;
        int n10 = n6 < 0 ? n9 - 1 : n9 + 1;
        int n11 = n2;
        int n12 = n4;
        int n13 = 0;
        n8 -= Math.abs(n9 * n7);
        int n14 = n11;
        arrf[n14] = arrf[n14] * d[n12];
        while (++n11 < n3) {
            if ((n13 += n8) >= n7) {
                n13 -= n7;
                n12 += n10;
            } else {
                n12 += n9;
            }
            int n15 = n11;
            arrf[n15] = arrf[n15] * d[n12];
        }
    }
}

