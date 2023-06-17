/*
 * Decompiled with CFR 0.150.
 */
package com.b.b;

import com.b.b.a;
import com.b.b.aa;
import com.b.b.ao;
import com.b.b.c;
import com.b.b.h;
import com.b.b.j;
import com.b.b.k;
import com.b.b.l;
import com.b.b.r;
import com.b.b.v;
import com.b.b.w;

class i
extends r {
    float[] a = null;

    i() {
    }

    void a(Object object, com.b.a.a a2) {
        k k2 = (k)object;
        a2.a(k2.a, 8);
        a2.a(k2.b, 16);
        a2.a(k2.c, 16);
        a2.a(k2.d, 6);
        a2.a(k2.e, 8);
        a2.a(k2.f - 1, 4);
        for (int i2 = 0; i2 < k2.f; ++i2) {
            a2.a(k2.g[i2], 8);
        }
    }

    Object a(v v2, com.b.a.a a2) {
        k k2 = new k(this);
        k2.a = a2.c(8);
        k2.b = a2.c(16);
        k2.c = a2.c(16);
        k2.d = a2.c(6);
        k2.e = a2.c(8);
        k2.f = a2.c(4) + 1;
        if (k2.a < 1 || k2.b < 1 || k2.c < 1 || k2.f < 1) {
            return null;
        }
        for (int i2 = 0; i2 < k2.f; ++i2) {
            k2.g[i2] = a2.c(8);
            if (k2.g[i2] >= 0 && k2.g[i2] < v2.m) continue;
            return null;
        }
        return k2;
    }

    Object a(h h2, w w2, Object object) {
        v v2 = h2.e;
        k k2 = (k)object;
        l l2 = new l(this);
        l2.c = k2.a;
        l2.a = v2.g[w2.a] / 2;
        l2.b = k2.c;
        l2.e = k2;
        l2.f.a(l2.b, l2.c);
        float f2 = (float)l2.b / i.a((float)((double)k2.b / 2.0));
        l2.d = new int[l2.a];
        for (int i2 = 0; i2 < l2.a; ++i2) {
            int n2 = (int)Math.floor(i.a((float)((double)k2.b / 2.0 / (double)l2.a * (double)i2)) * f2);
            if (n2 >= l2.b) {
                n2 = l2.b;
            }
            l2.d[i2] = n2;
        }
        return l2;
    }

    static float a(float f2) {
        return (float)(13.1 * Math.atan(7.4E-4 * (double)f2) + 2.24 * Math.atan((double)(f2 * f2) * 1.85E-8) + 1.0E-4 * (double)f2);
    }

    Object a(Object object) {
        j j2 = new j(this);
        k k2 = (k)object;
        j2.a = new int[k2.a];
        j2.b = new float[k2.c];
        j2.c = -1L;
        return j2;
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

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    int a(a a2, Object object, float[] arrf) {
        l l2 = (l)object;
        k k2 = l2.e;
        int n2 = a2.b.c(k2.d);
        if (n2 > 0) {
            int n3 = (1 << k2.d) - 1;
            float f2 = (float)n2 / (float)n3 * (float)k2.e;
            int n4 = a2.b.c(ao.a(k2.f));
            if (n4 != -1 && n4 < k2.f) {
                i i2 = this;
                synchronized (i2) {
                    int n5;
                    if (this.a == null || this.a.length < l2.c) {
                        this.a = new float[l2.c];
                    } else {
                        for (int i3 = 0; i3 < l2.c; ++i3) {
                            this.a[i3] = 0.0f;
                        }
                    }
                    c c2 = a2.k.A[k2.g[n4]];
                    float f3 = 0.0f;
                    for (n5 = 0; n5 < l2.c; ++n5) {
                        arrf[n5] = 0.0f;
                    }
                    for (n5 = 0; n5 < l2.c; n5 += c2.a) {
                        if (c2.a(this.a, n5, a2.b, 1, -1) != -1) continue;
                        for (int i4 = 0; i4 < l2.a; ++i4) {
                            arrf[i4] = 0.0f;
                        }
                        return 0;
                    }
                    n5 = 0;
                    while (n5 < l2.c) {
                        for (int i5 = 0; i5 < c2.a; ++i5) {
                            int n6 = n5++;
                            this.a[n6] = this.a[n6] + f3;
                        }
                        f3 = this.a[n5 - 1];
                    }
                    aa.a(arrf, l2.d, l2.a, l2.b, this.a, l2.c, f2, k2.e);
                    return 1;
                }
            }
        }
        return 0;
    }

    Object a(a a2, Object object, Object object2) {
        int n2;
        l l2 = (l)object;
        k k2 = l2.e;
        float[] arrf = null;
        if (object2 instanceof float[]) {
            arrf = (float[])object2;
        }
        if ((n2 = a2.b.c(k2.d)) > 0) {
            int n3 = (1 << k2.d) - 1;
            float f2 = (float)n2 / (float)n3 * (float)k2.e;
            int n4 = a2.b.c(ao.a(k2.f));
            if (n4 != -1 && n4 < k2.f) {
                int n5;
                c c2 = a2.k.A[k2.g[n4]];
                float f3 = 0.0f;
                if (arrf == null || arrf.length < l2.c + 1) {
                    arrf = new float[l2.c + 1];
                } else {
                    for (n5 = 0; n5 < arrf.length; ++n5) {
                        arrf[n5] = 0.0f;
                    }
                }
                for (n5 = 0; n5 < l2.c; n5 += c2.a) {
                    if (c2.c(arrf, n5, a2.b, c2.a) != -1) continue;
                    return null;
                }
                n5 = 0;
                while (n5 < l2.c) {
                    for (int i2 = 0; i2 < c2.a; ++i2) {
                        int n6 = n5++;
                        arrf[n6] = arrf[n6] + f3;
                    }
                    f3 = arrf[n5 - 1];
                }
                arrf[l2.c] = f2;
                return arrf;
            }
        }
        return null;
    }

    int a(a a2, Object object, Object object2, float[] arrf) {
        l l2 = (l)object;
        k k2 = l2.e;
        if (object2 != null) {
            float[] arrf2 = (float[])object2;
            float f2 = arrf2[l2.c];
            aa.a(arrf, l2.d, l2.a, l2.b, arrf2, l2.c, f2, k2.e);
            return 1;
        }
        for (int i2 = 0; i2 < l2.a; ++i2) {
            arrf[i2] = 0.0f;
        }
        return 0;
    }

    static float b(float f2) {
        return (float)Math.exp((double)f2 * 0.11512925);
    }

    static void a(float[] arrf, float[] arrf2, int n2) {
        int n3;
        int n4;
        int n5 = n2 / 2;
        float[] arrf3 = new float[n5];
        float[] arrf4 = new float[n5];
        float[] arrf5 = new float[n5 + 1];
        float[] arrf6 = new float[n5 + 1];
        float[] arrf7 = new float[n5];
        float[] arrf8 = new float[n5];
        for (n4 = 0; n4 < n5; ++n4) {
            arrf3[n4] = (float)(-2.0 * Math.cos(arrf[n4 * 2]));
            arrf4[n4] = (float)(-2.0 * Math.cos(arrf[n4 * 2 + 1]));
        }
        for (n3 = 0; n3 < n5; ++n3) {
            arrf5[n3] = 0.0f;
            arrf6[n3] = 1.0f;
            arrf7[n3] = 0.0f;
            arrf8[n3] = 1.0f;
        }
        arrf6[n3] = 1.0f;
        arrf5[n3] = 1.0f;
        for (n4 = 1; n4 < n2 + 1; ++n4) {
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (n3 = 0; n3 < n5; ++n3) {
                float f4 = arrf3[n3] * arrf6[n3] + arrf5[n3];
                arrf5[n3] = arrf6[n3];
                arrf6[n3] = f3;
                f3 += f4;
                f4 = arrf4[n3] * arrf8[n3] + arrf7[n3];
                arrf7[n3] = arrf8[n3];
                arrf8[n3] = f2;
                f2 += f4;
            }
            arrf2[n4 - 1] = (f3 + arrf6[n3] + f2 - arrf5[n3]) / 2.0f;
            arrf6[n3] = f3;
            arrf5[n3] = f2;
        }
    }

    static void a(float[] arrf, float[] arrf2, float f2, l l2, String string, int n2) {
        float[] arrf3 = new float[Math.max(l2.b * 2, l2.c * 2 + 2)];
        if (f2 == 0.0f) {
            for (int i2 = 0; i2 < l2.a; ++i2) {
                arrf[i2] = 0.0f;
            }
            return;
        }
        l2.f.a(arrf3, arrf2, f2);
        for (int i3 = 0; i3 < l2.a; ++i3) {
            arrf[i3] = arrf3[l2.d[i3]];
        }
    }
}

