/*
 * Decompiled with CFR 0.150.
 */
package com.b.b;

import com.b.b.a;
import com.b.b.ai;
import com.b.b.aj;
import com.b.b.ao;
import com.b.b.c;
import com.b.b.h;
import com.b.b.t;
import com.b.b.v;
import com.b.b.w;

class ah
extends t {
    private static int[][][] c = new int[2][][];
    static int[][] b = null;

    ah() {
    }

    void a(Object object, com.b.a.a a2) {
        int n2;
        ai ai2 = (ai)object;
        int n3 = 0;
        a2.a(ai2.a, 24);
        a2.a(ai2.b, 24);
        a2.a(ai2.c - 1, 24);
        a2.a(ai2.d - 1, 6);
        a2.a(ai2.e, 8);
        for (n2 = 0; n2 < ai2.d; ++n2) {
            int n4 = ai2.f[n2];
            if (ao.a(n4) > 3) {
                a2.a(n4, 3);
                a2.a(1, 1);
                a2.a(n4 >>> 3, 5);
            } else {
                a2.a(n4, 4);
            }
            n3 += ao.c(n4);
        }
        for (n2 = 0; n2 < n3; ++n2) {
            a2.a(ai2.g[n2], 8);
        }
    }

    Object a(v v2, com.b.a.a a2) {
        int n2;
        int n3 = 0;
        ai ai2 = new ai(this);
        ai2.a = a2.c(24);
        ai2.b = a2.c(24);
        ai2.c = a2.c(24) + 1;
        ai2.d = a2.c(6) + 1;
        ai2.e = a2.c(8);
        for (n2 = 0; n2 < ai2.d; ++n2) {
            int n4 = a2.c(3);
            if (a2.c(1) != 0) {
                n4 |= a2.c(5) << 3;
            }
            ai2.f[n2] = n4;
            n3 += ao.c(n4);
        }
        for (n2 = 0; n2 < n3; ++n2) {
            ai2.g[n2] = a2.c(8);
        }
        if (ai2.e >= v2.m) {
            this.a(ai2);
            return null;
        }
        for (n2 = 0; n2 < n3; ++n2) {
            if (ai2.g[n2] < v2.m) continue;
            this.a(ai2);
            return null;
        }
        return ai2;
    }

    Object a(h h2, w w2, Object object) {
        int n2;
        int n3;
        int n4;
        int n5;
        ai ai2 = (ai)object;
        aj aj2 = new aj(this);
        int n6 = 0;
        int n7 = 0;
        aj2.a = ai2;
        aj2.b = w2.d;
        aj2.c = ai2.d;
        aj2.e = h2.A;
        aj2.f = h2.A[ai2.e];
        int n8 = aj2.f.a;
        aj2.g = new int[aj2.c][];
        for (n5 = 0; n5 < aj2.c; ++n5) {
            n4 = ai2.f[n5];
            n3 = ao.a(n4);
            if (n3 == 0) continue;
            if (n3 > n7) {
                n7 = n3;
            }
            aj2.g[n5] = new int[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                if ((n4 & 1 << n2) == 0) continue;
                aj2.g[n5][n2] = ai2.g[n6++];
            }
        }
        aj2.h = (int)Math.rint(Math.pow(aj2.c, n8));
        aj2.d = n7;
        aj2.i = new int[aj2.h][];
        for (n5 = 0; n5 < aj2.h; ++n5) {
            n4 = n5;
            n3 = aj2.h / aj2.c;
            aj2.i[n5] = new int[n8];
            for (n2 = 0; n2 < n8; ++n2) {
                int n9 = n4 / n3;
                n4 -= n9 * n3;
                n3 /= aj2.c;
                aj2.i[n5][n2] = n9;
            }
        }
        return aj2;
    }

    void a(Object object) {
    }

    void b(Object object) {
    }

    static synchronized int a(a a2, Object object, float[][] arrf, int n2, int n3) {
        int n4;
        aj aj2 = (aj)object;
        ai ai2 = aj2.a;
        int n5 = ai2.c;
        int n6 = aj2.f.a;
        int n7 = ai2.b - ai2.a;
        int n8 = n7 / n5;
        int n9 = (n8 + n6 - 1) / n6;
        if (c.length < n2) {
            c = new int[n2][][];
        }
        for (n4 = 0; n4 < n2; ++n4) {
            if (c[n4] != null && c[n4].length >= n9) continue;
            ah.c[n4] = new int[n9][];
        }
        for (int i2 = 0; i2 < aj2.d; ++i2) {
            int n10 = 0;
            int n11 = 0;
            while (n10 < n8) {
                int n12;
                if (i2 == 0) {
                    for (n4 = 0; n4 < n2; ++n4) {
                        n12 = aj2.f.a(a2.b);
                        if (n12 == -1) {
                            return 0;
                        }
                        ah.c[n4][n11] = aj2.i[n12];
                        if (c[n4][n11] != null) continue;
                        return 0;
                    }
                }
                for (int i3 = 0; i3 < n6 && n10 < n8; ++i3, ++n10) {
                    for (n4 = 0; n4 < n2; ++n4) {
                        c c2;
                        n12 = ai2.a + n10 * n5;
                        int n13 = c[n4][n11][i3];
                        if ((ai2.f[n13] & 1 << i2) == 0 || (c2 = aj2.e[aj2.g[n13][i2]]) == null || !(n3 == 0 ? c2.a(arrf[n4], n12, a2.b, n5) == -1 : n3 == 1 && c2.b(arrf[n4], n12, a2.b, n5) == -1)) continue;
                        return 0;
                    }
                }
                ++n11;
            }
        }
        return 0;
    }

    static synchronized int a(a a2, Object object, float[][] arrf, int n2) {
        aj aj2 = (aj)object;
        ai ai2 = aj2.a;
        int n3 = ai2.c;
        int n4 = aj2.f.a;
        int n5 = ai2.b - ai2.a;
        int n6 = n5 / n3;
        int n7 = (n6 + n4 - 1) / n4;
        if (b == null || b.length < n7) {
            b = new int[n7][];
        }
        for (int i2 = 0; i2 < aj2.d; ++i2) {
            int n8 = 0;
            int n9 = 0;
            while (n8 < n6) {
                int n10;
                if (i2 == 0) {
                    n10 = aj2.f.a(a2.b);
                    if (n10 == -1) {
                        return 0;
                    }
                    ah.b[n9] = aj2.i[n10];
                    if (b[n9] == null) {
                        return 0;
                    }
                }
                for (int i3 = 0; i3 < n4 && n8 < n6; ++i3, ++n8) {
                    c c2;
                    n10 = ai2.a + n8 * n3;
                    int n11 = b[n9][i3];
                    if ((ai2.f[n11] & 1 << i2) == 0 || (c2 = aj2.e[aj2.g[n11][i2]]) == null || c2.a(arrf, n10, n2, a2.b, n3) != -1) continue;
                    return 0;
                }
                ++n9;
            }
        }
        return 0;
    }

    int a(a a2, Object object, float[][] arrf, int[] arrn, int n2) {
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (arrn[i2] == 0) continue;
            arrf[n3++] = arrf[i2];
        }
        if (n3 != 0) {
            return ah.a(a2, object, arrf, n3, 0);
        }
        return 0;
    }
}

