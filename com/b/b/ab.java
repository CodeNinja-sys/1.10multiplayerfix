/*
 * Decompiled with CFR 0.150.
 */
package com.b.b;

import com.b.b.a;
import com.b.b.ac;
import com.b.b.ad;
import com.b.b.ae;
import com.b.b.ao;
import com.b.b.h;
import com.b.b.r;
import com.b.b.s;
import com.b.b.t;
import com.b.b.u;
import com.b.b.v;
import com.b.b.w;

class ab
extends s {
    static int b = 0;
    float[][] c = null;
    int[] d = null;
    int[] e = null;
    Object[] f = null;

    ab() {
    }

    void a(Object object) {
    }

    void b(Object object) {
    }

    Object a(h h2, w w2, Object object) {
        v v2 = h2.e;
        ad ad2 = new ad(this);
        ac ac2 = ad2.b = (ac)object;
        ad2.a = w2;
        ad2.c = new Object[ac2.a];
        ad2.d = new Object[ac2.a];
        ad2.f = new Object[ac2.a];
        ad2.h = new u[ac2.a];
        ad2.i = new r[ac2.a];
        ad2.j = new t[ac2.a];
        for (int i2 = 0; i2 < ac2.a; ++i2) {
            int n2 = ac2.c[i2];
            int n3 = ac2.d[i2];
            int n4 = ac2.e[i2];
            ad2.h[i2] = u.a[v2.r[n2]];
            ad2.c[i2] = ad2.h[i2].a(h2, w2, v2.s[n2]);
            ad2.i[i2] = r.c[v2.t[n3]];
            ad2.d[i2] = ad2.i[i2].a(h2, w2, v2.u[n3]);
            ad2.j[i2] = t.a[v2.v[n4]];
            ad2.f[i2] = ad2.j[i2].a(h2, w2, v2.w[n4]);
        }
        if (v2.n == 0 || h2.d != 0) {
            // empty if block
        }
        ad2.k = v2.b;
        return ad2;
    }

    void a(v v2, Object object, com.b.a.a a2) {
        int n2;
        ac ac2 = (ac)object;
        if (ac2.a > 1) {
            a2.a(1, 1);
            a2.a(ac2.a - 1, 4);
        } else {
            a2.a(0, 1);
        }
        if (ac2.g > 0) {
            a2.a(1, 1);
            a2.a(ac2.g - 1, 8);
            for (n2 = 0; n2 < ac2.g; ++n2) {
                a2.a(ac2.h[n2], ao.b(v2.b));
                a2.a(ac2.i[n2], ao.b(v2.b));
            }
        } else {
            a2.a(0, 1);
        }
        a2.a(0, 2);
        if (ac2.a > 1) {
            for (n2 = 0; n2 < v2.b; ++n2) {
                a2.a(ac2.b[n2], 4);
            }
        }
        for (n2 = 0; n2 < ac2.a; ++n2) {
            a2.a(ac2.c[n2], 8);
            a2.a(ac2.d[n2], 8);
            a2.a(ac2.e[n2], 8);
        }
    }

    Object a(v v2, com.b.a.a a2) {
        int n2;
        ac ac2 = new ac(this);
        ac2.a = a2.c(1) != 0 ? a2.c(4) + 1 : 1;
        if (a2.c(1) != 0) {
            ac2.g = a2.c(8) + 1;
            for (n2 = 0; n2 < ac2.g; ++n2) {
                int n3 = ac2.h[n2] = a2.c(ao.b(v2.b));
                int n4 = ac2.i[n2] = a2.c(ao.b(v2.b));
                if (n3 >= 0 && n4 >= 0 && n3 != n4 && n3 < v2.b && n4 < v2.b) continue;
                ac2.a();
                return null;
            }
        }
        if (a2.c(2) > 0) {
            ac2.a();
            return null;
        }
        if (ac2.a > 1) {
            for (n2 = 0; n2 < v2.b; ++n2) {
                ac2.b[n2] = a2.c(4);
                if (ac2.b[n2] < ac2.a) continue;
                ac2.a();
                return null;
            }
        }
        for (n2 = 0; n2 < ac2.a; ++n2) {
            ac2.c[n2] = a2.c(8);
            if (ac2.c[n2] >= v2.j) {
                ac2.a();
                return null;
            }
            ac2.d[n2] = a2.c(8);
            if (ac2.d[n2] >= v2.k) {
                ac2.a();
                return null;
            }
            ac2.e[n2] = a2.c(8);
            if (ac2.e[n2] < v2.l) continue;
            ac2.a();
            return null;
        }
        return ac2;
    }

    synchronized int a(a a2, Object object) {
        int n2;
        int n3;
        int n4;
        h h2 = a2.k;
        v v2 = h2.e;
        ad ad2 = (ad)object;
        ac ac2 = ad2.b;
        w w2 = ad2.a;
        int n5 = a2.f = v2.g[a2.d];
        float[] arrf = h2.y[a2.d][a2.c][a2.e][w2.b];
        if (this.c == null || this.c.length < v2.b) {
            this.c = new float[v2.b][];
            this.e = new int[v2.b];
            this.d = new int[v2.b];
            this.f = new Object[v2.b];
        }
        for (n4 = 0; n4 < v2.b; ++n4) {
            float[] arrf2 = a2.a[n4];
            n3 = ac2.b[n4];
            this.f[n4] = ad2.i[n3].a(a2, ad2.d[n3], this.f[n4]);
            this.e[n4] = this.f[n4] != null ? 1 : 0;
            for (n2 = 0; n2 < n5 / 2; ++n2) {
                arrf2[n2] = 0.0f;
            }
        }
        for (n4 = 0; n4 < ac2.g; ++n4) {
            if (this.e[ac2.h[n4]] == 0 && this.e[ac2.i[n4]] == 0) continue;
            this.e[ac2.h[n4]] = 1;
            this.e[ac2.i[n4]] = 1;
        }
        for (n4 = 0; n4 < ac2.a; ++n4) {
            int n6 = 0;
            for (n3 = 0; n3 < v2.b; ++n3) {
                if (ac2.b[n3] != n4) continue;
                this.d[n6] = this.e[n3] != 0 ? 1 : 0;
                this.c[n6++] = a2.a[n3];
            }
            ad2.j[n4].a(a2, ad2.f[n4], this.c, this.d, n6);
        }
        for (n4 = ac2.g - 1; n4 >= 0; --n4) {
            float[] arrf3 = a2.a[ac2.h[n4]];
            float[] arrf4 = a2.a[ac2.i[n4]];
            for (n2 = 0; n2 < n5 / 2; ++n2) {
                float f2 = arrf3[n2];
                float f3 = arrf4[n2];
                if (f2 > 0.0f) {
                    if (f3 > 0.0f) {
                        arrf3[n2] = f2;
                        arrf4[n2] = f2 - f3;
                        continue;
                    }
                    arrf4[n2] = f2;
                    arrf3[n2] = f2 + f3;
                    continue;
                }
                if (f3 > 0.0f) {
                    arrf3[n2] = f2;
                    arrf4[n2] = f2 + f3;
                    continue;
                }
                arrf4[n2] = f2;
                arrf3[n2] = f2 - f3;
            }
        }
        for (n4 = 0; n4 < v2.b; ++n4) {
            float[] arrf5 = a2.a[n4];
            int n7 = ac2.b[n4];
            ad2.i[n7].a(a2, ad2.d[n7], this.f[n4], arrf5);
        }
        for (n4 = 0; n4 < v2.b; ++n4) {
            float[] arrf6 = a2.a[n4];
            ((ae)h2.z[a2.d][0]).b(arrf6, arrf6);
        }
        for (n4 = 0; n4 < v2.b; ++n4) {
            int n8;
            float[] arrf7 = a2.a[n4];
            if (this.e[n4] != 0) {
                for (n8 = 0; n8 < n5; ++n8) {
                    int n9 = n8;
                    arrf7[n9] = arrf7[n9] * arrf[n8];
                }
                continue;
            }
            for (n8 = 0; n8 < n5; ++n8) {
                arrf7[n8] = 0.0f;
            }
        }
        return 0;
    }
}

