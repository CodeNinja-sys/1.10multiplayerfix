/*
 * Decompiled with CFR 0.150.
 */
package com.b.b;

import com.b.a.a;
import com.b.b.am;
import com.b.b.ao;
import com.b.b.d;

class c {
    int a;
    int b;
    am c = new am();
    float[] d;
    int[] e;
    d f;
    private int[] g = new int[15];

    c() {
    }

    int a(int n2, a a2) {
        a2.a(this.e[n2], this.c.c[n2]);
        return this.c.c[n2];
    }

    int a(float[] arrf) {
        int n2 = this.a(arrf, 1);
        for (int i2 = 0; i2 < this.a; ++i2) {
            arrf[i2] = this.d[n2 * this.a + i2];
        }
        return n2;
    }

    int a(int n2, float[] arrf, a a2) {
        for (int i2 = 0; i2 < this.a; ++i2) {
            arrf[i2] = this.d[n2 * this.a + i2];
        }
        return this.a(n2, a2);
    }

    int a(float[] arrf, a a2, int n2, int n3) {
        int n4 = this.a(arrf, n2, n3);
        return this.a(n4, a2);
    }

    synchronized int a(float[] arrf, int n2, a a2, int n3) {
        int n4;
        int n5 = n3 / this.a;
        if (this.g.length < n5) {
            this.g = new int[n5];
        }
        for (n4 = 0; n4 < n5; ++n4) {
            int n6 = this.a(a2);
            if (n6 == -1) {
                return -1;
            }
            this.g[n4] = n6 * this.a;
        }
        n4 = 0;
        int n7 = 0;
        while (n4 < this.a) {
            for (int i2 = 0; i2 < n5; ++i2) {
                int n8 = n2 + n7 + i2;
                arrf[n8] = arrf[n8] + this.d[this.g[i2] + n4];
            }
            ++n4;
            n7 += n5;
        }
        return 0;
    }

    int b(float[] arrf, int n2, a a2, int n3) {
        if (this.a > 8) {
            int n4 = 0;
            while (n4 < n3) {
                int n5 = this.a(a2);
                if (n5 == -1) {
                    return -1;
                }
                int n6 = n5 * this.a;
                int n7 = 0;
                while (n7 < this.a) {
                    int n8 = n2 + n4++;
                    arrf[n8] = arrf[n8] + this.d[n6 + n7++];
                }
            }
        } else {
            int n9 = 0;
            while (n9 < n3) {
                int n10 = this.a(a2);
                if (n10 == -1) {
                    return -1;
                }
                int n11 = n10 * this.a;
                int n12 = 0;
                switch (this.a) {
                    case 8: {
                        int n13 = n2 + n9++;
                        arrf[n13] = arrf[n13] + this.d[n11 + n12++];
                    }
                    case 7: {
                        int n14 = n2 + n9++;
                        arrf[n14] = arrf[n14] + this.d[n11 + n12++];
                    }
                    case 6: {
                        int n15 = n2 + n9++;
                        arrf[n15] = arrf[n15] + this.d[n11 + n12++];
                    }
                    case 5: {
                        int n16 = n2 + n9++;
                        arrf[n16] = arrf[n16] + this.d[n11 + n12++];
                    }
                    case 4: {
                        int n17 = n2 + n9++;
                        arrf[n17] = arrf[n17] + this.d[n11 + n12++];
                    }
                    case 3: {
                        int n18 = n2 + n9++;
                        arrf[n18] = arrf[n18] + this.d[n11 + n12++];
                    }
                    case 2: {
                        int n19 = n2 + n9++;
                        arrf[n19] = arrf[n19] + this.d[n11 + n12++];
                    }
                    case 1: {
                        int n20 = n2 + n9++;
                        arrf[n20] = arrf[n20] + this.d[n11 + n12++];
                    }
                }
            }
        }
        return 0;
    }

    int c(float[] arrf, int n2, a a2, int n3) {
        int n4 = 0;
        while (n4 < n3) {
            int n5 = this.a(a2);
            if (n5 == -1) {
                return -1;
            }
            int n6 = n5 * this.a;
            int n7 = 0;
            while (n7 < this.a) {
                arrf[n2 + n4++] = this.d[n6 + n7++];
            }
        }
        return 0;
    }

    int a(float[][] arrf, int n2, int n3, a a2, int n4) {
        int n5 = 0;
        int n6 = n2 / n3;
        while (n6 < (n2 + n4) / n3) {
            int n7 = this.a(a2);
            if (n7 == -1) {
                return -1;
            }
            int n8 = n7 * this.a;
            for (int i2 = 0; i2 < this.a; ++i2) {
                float[] arrf2 = arrf[n5++];
                int n9 = n6++;
                arrf2[n9] = arrf2[n9] + this.d[n8 + i2];
                if (n5 != n3) continue;
                n5 = 0;
            }
        }
        return 0;
    }

    int a(a a2) {
        int n2 = 0;
        d d2 = this.f;
        int n3 = a2.a(d2.c);
        if (n3 >= 0) {
            n2 = d2.a[n3];
            a2.b(d2.b[n3]);
            if (n2 <= 0) {
                return -n2;
            }
        }
        do {
            switch (a2.f()) {
                case 0: {
                    n2 = d2.d[n2];
                    break;
                }
                case 1: {
                    n2 = d2.e[n2];
                    break;
                }
                default: {
                    return -1;
                }
            }
        } while (n2 > 0);
        return -n2;
    }

    int a(float[] arrf, int n2, a a2, int n3, int n4) {
        int n5 = this.a(a2);
        if (n5 == -1) {
            return -1;
        }
        switch (n4) {
            case -1: {
                int n6 = 0;
                int n7 = 0;
                while (n6 < this.a) {
                    arrf[n2 + n7] = this.d[n5 * this.a + n6];
                    ++n6;
                    n7 += n3;
                }
                break;
            }
            case 0: {
                int n8 = 0;
                int n9 = 0;
                while (n8 < this.a) {
                    int n10 = n2 + n9;
                    arrf[n10] = arrf[n10] + this.d[n5 * this.a + n8];
                    ++n8;
                    n9 += n3;
                }
                break;
            }
            case 1: {
                int n11 = 0;
                int n12 = 0;
                while (n11 < this.a) {
                    int n13 = n2 + n12;
                    arrf[n13] = arrf[n13] * this.d[n5 * this.a + n11];
                    ++n11;
                    n12 += n3;
                }
                break;
            }
        }
        return n5;
    }

    int a(float[] arrf, int n2) {
        int n3 = -1;
        float f2 = 0.0f;
        int n4 = 0;
        for (int i2 = 0; i2 < this.b; ++i2) {
            if (this.c.c[i2] > 0) {
                float f3 = com.b.b.c.a(this.a, this.d, n4, arrf, n2);
                if (n3 == -1 || f3 < f2) {
                    f2 = f3;
                    n3 = i2;
                }
            }
            n4 += this.a;
        }
        return n3;
    }

    int a(float[] arrf, int n2, int n3) {
        int n4 = this.a(arrf, n2);
        switch (n3) {
            case 0: {
                int n5 = 0;
                int n6 = 0;
                while (n5 < this.a) {
                    int n7 = n6;
                    arrf[n7] = arrf[n7] - this.d[n4 * this.a + n5];
                    ++n5;
                    n6 += n2;
                }
                break;
            }
            case 1: {
                int n8 = 0;
                int n9 = 0;
                while (n8 < this.a) {
                    float f2 = this.d[n4 * this.a + n8];
                    if (f2 == 0.0f) {
                        arrf[n9] = 0.0f;
                    } else {
                        int n10 = n9;
                        arrf[n10] = arrf[n10] / f2;
                    }
                    ++n8;
                    n9 += n2;
                }
                break;
            }
        }
        return n4;
    }

    void a() {
    }

    private static float a(int n2, float[] arrf, int n3, float[] arrf2, int n4) {
        float f2 = 0.0f;
        for (int i2 = 0; i2 < n2; ++i2) {
            float f3 = arrf[n3 + i2] - arrf2[i2 * n4];
            f2 += f3 * f3;
        }
        return f2;
    }

    int a(am am2) {
        this.c = am2;
        this.b = am2.b;
        this.a = am2.a;
        this.d = am2.b();
        this.f = this.b();
        if (this.f == null) {
            this.a();
            return -1;
        }
        return 0;
    }

    static int[] a(int[] arrn, int n2) {
        int n3;
        int n4;
        int n5;
        int[] arrn2 = new int[33];
        int[] arrn3 = new int[n2];
        for (n5 = 0; n5 < n2; ++n5) {
            n4 = arrn[n5];
            if (n4 <= 0) continue;
            n3 = arrn2[n4];
            if (n4 < 32 && n3 >>> n4 != 0) {
                return null;
            }
            arrn3[n5] = n3;
            int n6 = n4;
            while (n6 > 0) {
                if ((arrn2[n6] & 1) != 0) {
                    if (n6 == 1) {
                        arrn2[1] = arrn2[1] + 1;
                        break;
                    }
                    arrn2[n6] = arrn2[n6 - 1] << 1;
                    break;
                }
                int n7 = n6--;
                arrn2[n7] = arrn2[n7] + 1;
            }
            for (n6 = n4 + 1; n6 < 33 && arrn2[n6] >>> 1 == n3; ++n6) {
                n3 = arrn2[n6];
                arrn2[n6] = arrn2[n6 - 1] << 1;
            }
        }
        for (n5 = 0; n5 < n2; ++n5) {
            n4 = 0;
            for (n3 = 0; n3 < arrn[n5]; ++n3) {
                n4 <<= 1;
                n4 |= arrn3[n5] >>> n3 & 1;
            }
            arrn3[n5] = n4;
        }
        return arrn3;
    }

    d b() {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6 = 0;
        d d2 = new d(this);
        d2.d = new int[this.b * 2];
        int[] arrn = d2.d;
        d2.e = new int[this.b * 2];
        int[] arrn2 = d2.e;
        int[] arrn3 = com.b.b.c.a(this.c.c, this.c.b);
        if (arrn3 == null) {
            return null;
        }
        d2.f = this.b * 2;
        for (n5 = 0; n5 < this.b; ++n5) {
            if (this.c.c[n5] <= 0) continue;
            n4 = 0;
            for (n3 = 0; n3 < this.c.c[n5] - 1; ++n3) {
                n2 = arrn3[n5] >>> n3 & 1;
                if (n2 == 0) {
                    if (arrn[n4] == 0) {
                        arrn[n4] = ++n6;
                    }
                    n4 = arrn[n4];
                    continue;
                }
                if (arrn2[n4] == 0) {
                    arrn2[n4] = ++n6;
                }
                n4 = arrn2[n4];
            }
            if ((arrn3[n5] >>> n3 & 1) == 0) {
                arrn[n4] = -n5;
                continue;
            }
            arrn2[n4] = -n5;
        }
        d2.c = ao.a(this.b) - 4;
        if (d2.c < 5) {
            d2.c = 5;
        }
        n5 = 1 << d2.c;
        d2.a = new int[n5];
        d2.b = new int[n5];
        for (n4 = 0; n4 < n5; ++n4) {
            n3 = 0;
            n2 = 0;
            for (n2 = 0; n2 < d2.c && (n3 > 0 || n2 == 0); ++n2) {
                n3 = (n4 & 1 << n2) != 0 ? arrn2[n3] : arrn[n3];
            }
            d2.a[n4] = n3;
            d2.b[n4] = n2;
        }
        return d2;
    }
}

