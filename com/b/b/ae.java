/*
 * Decompiled with CFR 0.150.
 */
package com.b.b;

class ae {
    int a;
    int b;
    float[] c;
    int[] d;
    float e;
    float[] f = new float[1024];
    float[] g = new float[1024];

    ae() {
    }

    void a(int n2) {
        int n3;
        this.d = new int[n2 / 4];
        this.c = new float[n2 + n2 / 4];
        this.b = (int)Math.rint(Math.log(n2) / Math.log(2.0));
        this.a = n2;
        int n4 = 0;
        int n5 = 1;
        int n6 = n4 + n2 / 2;
        int n7 = n6 + 1;
        int n8 = n6 + n2 / 2;
        int n9 = n8 + 1;
        for (n3 = 0; n3 < n2 / 4; ++n3) {
            this.c[n4 + n3 * 2] = (float)Math.cos(Math.PI / (double)n2 * (double)(4 * n3));
            this.c[n5 + n3 * 2] = (float)(-Math.sin(Math.PI / (double)n2 * (double)(4 * n3)));
            this.c[n6 + n3 * 2] = (float)Math.cos(Math.PI / (double)(2 * n2) * (double)(2 * n3 + 1));
            this.c[n7 + n3 * 2] = (float)Math.sin(Math.PI / (double)(2 * n2) * (double)(2 * n3 + 1));
        }
        for (n3 = 0; n3 < n2 / 8; ++n3) {
            this.c[n8 + n3 * 2] = (float)Math.cos(Math.PI / (double)n2 * (double)(4 * n3 + 2));
            this.c[n9 + n3 * 2] = (float)(-Math.sin(Math.PI / (double)n2 * (double)(4 * n3 + 2)));
        }
        n3 = (1 << this.b - 1) - 1;
        int n10 = 1 << this.b - 2;
        for (int i2 = 0; i2 < n2 / 8; ++i2) {
            int n11 = 0;
            int n12 = 0;
            while (n10 >>> n12 != 0) {
                if ((n10 >>> n12 & i2) != 0) {
                    n11 |= 1 << n12;
                }
                ++n12;
            }
            this.d[i2 * 2] = ~n11 & n3;
            this.d[i2 * 2 + 1] = n11;
        }
        this.e = 4.0f / (float)n2;
    }

    void a() {
    }

    void a(float[] arrf, float[] arrf2) {
    }

    synchronized void b(float[] arrf, float[] arrf2) {
        int n2;
        if (this.f.length < this.a / 2) {
            this.f = new float[this.a / 2];
        }
        if (this.g.length < this.a / 2) {
            this.g = new float[this.a / 2];
        }
        float[] arrf3 = this.f;
        float[] arrf4 = this.g;
        int n3 = this.a >>> 1;
        int n4 = this.a >>> 2;
        int n5 = this.a >>> 3;
        int n6 = 1;
        int n7 = 0;
        int n8 = n3;
        for (n2 = 0; n2 < n5; ++n2) {
            arrf3[n7++] = -arrf[n6 + 2] * this.c[(n8 -= 2) + 1] - arrf[n6] * this.c[n8];
            arrf3[n7++] = arrf[n6] * this.c[n8 + 1] - arrf[n6 + 2] * this.c[n8];
            n6 += 4;
        }
        n6 = n3 - 4;
        for (n2 = 0; n2 < n5; ++n2) {
            arrf3[n7++] = arrf[n6] * this.c[(n8 -= 2) + 1] + arrf[n6 + 2] * this.c[n8];
            arrf3[n7++] = arrf[n6] * this.c[n8] - arrf[n6 + 2] * this.c[n8 + 1];
            n6 -= 4;
        }
        float[] arrf5 = this.a(arrf3, arrf4, this.a, n3, n4, n5);
        n7 = 0;
        n8 = n3;
        n2 = n4;
        int n9 = n2 - 1;
        int n10 = n4 + n3;
        int n11 = n10 - 1;
        for (int i2 = 0; i2 < n4; ++i2) {
            float f2 = arrf5[n7] * this.c[n8 + 1] - arrf5[n7 + 1] * this.c[n8];
            float f3 = -(arrf5[n7] * this.c[n8] + arrf5[n7 + 1] * this.c[n8 + 1]);
            arrf2[n2] = -f2;
            arrf2[n9] = f2;
            arrf2[n10] = f3;
            arrf2[n11] = f3;
            ++n2;
            --n9;
            ++n10;
            --n11;
            n7 += 2;
            n8 += 2;
        }
    }

    private float[] a(float[] arrf, float[] arrf2, int n2, int n3, int n4, int n5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10 = n4;
        int n11 = 0;
        int n12 = n4;
        int n13 = n3;
        for (n9 = 0; n9 < n4; ++n9) {
            float f6 = arrf[n10] - arrf[n11];
            arrf2[n12 + n9] = arrf[n10++] + arrf[n11++];
            float f7 = arrf[n10] - arrf[n11];
            arrf2[n9++] = f6 * this.c[n13 -= 4] + f7 * this.c[n13 + 1];
            arrf2[n9] = f7 * this.c[n13] - f6 * this.c[n13 + 1];
            arrf2[n12 + n9] = arrf[n10++] + arrf[n11++];
        }
        for (n9 = 0; n9 < this.b - 3; ++n9) {
            int n14 = n2 >>> n9 + 2;
            int n15 = 1 << n9 + 3;
            n8 = n3 - 2;
            n13 = 0;
            for (n7 = 0; n7 < n14 >>> 2; ++n7) {
                n6 = n8;
                n12 = n6 - (n14 >> 1);
                f5 = this.c[n13];
                f4 = this.c[n13 + 1];
                n8 -= 2;
                ++n14;
                for (int i2 = 0; i2 < 2 << n9; ++i2) {
                    f3 = arrf2[n6] - arrf2[n12];
                    arrf[n6] = arrf2[n6] + arrf2[n12];
                    f2 = arrf2[++n6] - arrf2[++n12];
                    arrf[n6] = arrf2[n6] + arrf2[n12];
                    arrf[n12] = f2 * f5 - f3 * f4;
                    arrf[n12 - 1] = f3 * f5 + f2 * f4;
                    n6 -= n14;
                    n12 -= n14;
                }
                --n14;
                n13 += n15;
            }
            float[] arrf3 = arrf2;
            arrf2 = arrf;
            arrf = arrf3;
        }
        n9 = n2;
        int n16 = 0;
        int n17 = 0;
        n8 = n3 - 1;
        for (int i3 = 0; i3 < n5; ++i3) {
            n7 = this.d[n16++];
            n6 = this.d[n16++];
            f5 = arrf2[n7] - arrf2[n6 + 1];
            f2 = arrf2[n7 - 1] + arrf2[n6];
            f4 = arrf2[n7] + arrf2[n6 + 1];
            f3 = arrf2[n7 - 1] - arrf2[n6];
            float f8 = f5 * this.c[n9];
            float f9 = f2 * this.c[n9++];
            float f10 = f5 * this.c[n9];
            float f11 = f2 * this.c[n9++];
            arrf[n17++] = (f4 + f10 + f9) * 0.5f;
            arrf[n8--] = (-f3 + f11 - f8) * 0.5f;
            arrf[n17++] = (f3 + f11 - f8) * 0.5f;
            arrf[n8--] = (f4 - f10 - f9) * 0.5f;
        }
        return arrf;
    }
}

