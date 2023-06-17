/*
 * Decompiled with CFR 0.150.
 */
package com.b.b;

import com.b.a.a;
import com.b.b.ao;

class am {
    int a;
    int b;
    int[] c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int[] i;
    static final int j = 10;
    static final int k = 21;
    static final int l = 768;

    am() {
    }

    int a(a a2) {
        int n2;
        int n3;
        boolean bl2 = false;
        a2.a(5653314, 24);
        a2.a(this.a, 16);
        a2.a(this.b, 24);
        for (n3 = 1; n3 < this.b && this.c[n3] >= this.c[n3 - 1]; ++n3) {
        }
        if (n3 == this.b) {
            bl2 = true;
        }
        if (bl2) {
            n2 = 0;
            a2.a(1, 1);
            a2.a(this.c[0] - 1, 5);
            for (n3 = 1; n3 < this.b; ++n3) {
                int n4 = this.c[n3];
                int n5 = this.c[n3 - 1];
                if (n4 <= n5) continue;
                for (int i2 = n5; i2 < n4; ++i2) {
                    a2.a(n3 - n2, ao.a(this.b - n2));
                    n2 = n3;
                }
            }
            a2.a(n3 - n2, ao.a(this.b - n2));
        } else {
            a2.a(0, 1);
            for (n3 = 0; n3 < this.b && this.c[n3] != 0; ++n3) {
            }
            if (n3 == this.b) {
                a2.a(0, 1);
                for (n3 = 0; n3 < this.b; ++n3) {
                    a2.a(this.c[n3] - 1, 5);
                }
            } else {
                a2.a(1, 1);
                for (n3 = 0; n3 < this.b; ++n3) {
                    if (this.c[n3] == 0) {
                        a2.a(0, 1);
                        continue;
                    }
                    a2.a(1, 1);
                    a2.a(this.c[n3] - 1, 5);
                }
            }
        }
        a2.a(this.d, 4);
        switch (this.d) {
            case 0: {
                break;
            }
            case 1: 
            case 2: {
                if (this.i == null) {
                    return -1;
                }
                a2.a(this.e, 32);
                a2.a(this.f, 32);
                a2.a(this.g - 1, 4);
                a2.a(this.h, 1);
                n2 = 0;
                switch (this.d) {
                    case 1: {
                        n2 = this.c();
                        break;
                    }
                    case 2: {
                        n2 = this.b * this.a;
                    }
                }
                for (n3 = 0; n3 < n2; ++n3) {
                    a2.a(Math.abs(this.i[n3]), this.g);
                }
                break;
            }
            default: {
                return -1;
            }
        }
        return 0;
    }

    int b(a a2) {
        int n2;
        int n3;
        if (a2.c(24) != 5653314) {
            this.a();
            return -1;
        }
        this.a = a2.c(16);
        this.b = a2.c(24);
        if (this.b == -1) {
            this.a();
            return -1;
        }
        switch (a2.c(1)) {
            case 0: {
                this.c = new int[this.b];
                if (a2.c(1) != 0) {
                    for (n3 = 0; n3 < this.b; ++n3) {
                        if (a2.c(1) != 0) {
                            n2 = a2.c(5);
                            if (n2 == -1) {
                                this.a();
                                return -1;
                            }
                            this.c[n3] = n2 + 1;
                            continue;
                        }
                        this.c[n3] = 0;
                    }
                } else {
                    for (n3 = 0; n3 < this.b; ++n3) {
                        n2 = a2.c(5);
                        if (n2 == -1) {
                            this.a();
                            return -1;
                        }
                        this.c[n3] = n2 + 1;
                    }
                }
                break;
            }
            case 1: {
                n2 = a2.c(5) + 1;
                this.c = new int[this.b];
                n3 = 0;
                while (n3 < this.b) {
                    int n4 = a2.c(ao.a(this.b - n3));
                    if (n4 == -1) {
                        this.a();
                        return -1;
                    }
                    int n5 = 0;
                    while (n5 < n4) {
                        this.c[n3] = n2;
                        ++n5;
                        ++n3;
                    }
                    ++n2;
                }
                break;
            }
            default: {
                return -1;
            }
        }
        this.d = a2.c(4);
        switch (this.d) {
            case 0: {
                break;
            }
            case 1: 
            case 2: {
                this.e = a2.c(32);
                this.f = a2.c(32);
                this.g = a2.c(4) + 1;
                this.h = a2.c(1);
                n2 = 0;
                switch (this.d) {
                    case 1: {
                        n2 = this.c();
                        break;
                    }
                    case 2: {
                        n2 = this.b * this.a;
                    }
                }
                this.i = new int[n2];
                for (n3 = 0; n3 < n2; ++n3) {
                    this.i[n3] = a2.c(this.g);
                }
                if (this.i[n2 - 1] != -1) break;
                this.a();
                return -1;
            }
            default: {
                this.a();
                return -1;
            }
        }
        return 0;
    }

    private int c() {
        int n2 = (int)Math.floor(Math.pow(this.b, 1.0 / (double)this.a));
        while (true) {
            int n3 = 1;
            int n4 = 1;
            for (int i2 = 0; i2 < this.a; ++i2) {
                n3 *= n2;
                n4 *= n2 + 1;
            }
            if (n3 <= this.b && n4 > this.b) {
                return n2;
            }
            if (n3 > this.b) {
                --n2;
                continue;
            }
            ++n2;
        }
    }

    void a() {
    }

    float[] b() {
        if (this.d == 1 || this.d == 2) {
            float f2 = am.a(this.e);
            float f3 = am.a(this.f);
            float[] arrf = new float[this.b * this.a];
            switch (this.d) {
                case 1: {
                    int n2 = this.c();
                    for (int i2 = 0; i2 < this.b; ++i2) {
                        float f4 = 0.0f;
                        int n3 = 1;
                        for (int i3 = 0; i3 < this.a; ++i3) {
                            int n4 = i2 / n3 % n2;
                            float f5 = this.i[n4];
                            f5 = Math.abs(f5) * f3 + f2 + f4;
                            if (this.h != 0) {
                                f4 = f5;
                            }
                            arrf[i2 * this.a + i3] = f5;
                            n3 *= n2;
                        }
                    }
                    break;
                }
                case 2: {
                    for (int i4 = 0; i4 < this.b; ++i4) {
                        float f6 = 0.0f;
                        for (int i5 = 0; i5 < this.a; ++i5) {
                            float f7 = this.i[i4 * this.a + i5];
                            f7 = Math.abs(f7) * f3 + f2 + f6;
                            if (this.h != 0) {
                                f6 = f7;
                            }
                            arrf[i4 * this.a + i5] = f7;
                        }
                    }
                    break;
                }
            }
            return arrf;
        }
        return null;
    }

    static long a(float f2) {
        int n2 = 0;
        if (f2 < 0.0f) {
            n2 = Integer.MIN_VALUE;
            f2 = -f2;
        }
        int n3 = (int)Math.floor(Math.log(f2) / Math.log(2.0));
        int n4 = (int)Math.rint(Math.pow(f2, 20 - n3));
        n3 = n3 + 768 << 21;
        return n2 | n3 | n4;
    }

    static float a(int n2) {
        float f2 = n2 & 0x1FFFFF;
        float f3 = (n2 & 0x7FE00000) >>> 21;
        if ((n2 & Integer.MIN_VALUE) != 0) {
            f2 = -f2;
        }
        return am.a(f2, (int)f3 - 20 - 768);
    }

    static float a(float f2, int n2) {
        return (float)((double)f2 * Math.pow(2.0, n2));
    }
}

