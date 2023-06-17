/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.cl;
import com.ibm.icu.a.ea;
import com.ibm.icu.a.ef;
import com.ibm.icu.a.eg;
import com.ibm.icu.a.eh;
import com.ibm.icu.a.ei;
import java.util.Arrays;

public class ee {
    private int[] h;
    private int i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    public static final int a = 0x110000;
    public static final int b = 0x110000;
    public static final int c = 0x110001;
    public static final int d = 0x110001;
    public static final int e = 4096;
    public static final int f = 65536;
    public static final int g = 0x110002;

    private boolean a(int n2, int[] arrn, int n3, int n4) {
        for (int i2 = 0; i2 < n4; ++i2) {
            if (this.h[n2 + i2] == arrn[n3 + i2]) continue;
            return false;
        }
        return true;
    }

    private int d(int n2) {
        int n3 = 0;
        n3 = this.l * this.i;
        if (n2 >= this.h[n3]) {
            if (n2 < this.h[n3 + 1]) {
                return n3;
            }
            if (n2 < this.h[(n3 += this.i) + 1]) {
                ++this.l;
                return n3;
            }
            if (n2 < this.h[(n3 += this.i) + 1]) {
                this.l += 2;
                return n3;
            }
            if (n2 - this.h[n3 + 1] < 10) {
                this.l += 2;
                do {
                    ++this.l;
                } while (n2 >= this.h[(n3 += this.i) + 1]);
                return n3;
            }
        } else if (n2 < this.h[1]) {
            this.l = 0;
            return 0;
        }
        int n4 = 0;
        int n5 = 0;
        int n6 = this.k;
        while (n4 < n6 - 1) {
            n5 = (n4 + n6) / 2;
            n3 = this.i * n5;
            if (n2 < this.h[n3]) {
                n6 = n5;
                continue;
            }
            if (n2 < this.h[n3 + 1]) {
                this.l = n5;
                return n3;
            }
            n4 = n5;
        }
        this.l = n4;
        n3 = n4 * this.i;
        return n3;
    }

    public ee(int n2) {
        if (n2 < 1) {
            throw new IllegalArgumentException("numOfColumns need to be no less than 1; but it is " + n2);
        }
        this.i = n2 + 2;
        this.h = new int[4096 * this.i];
        this.j = 4096;
        this.k = 3;
        this.l = 0;
        this.m = false;
        this.h[0] = 0;
        this.h[1] = 0x110000;
        int n3 = this.i;
        for (int i2 = 0x110000; i2 <= 0x110001; ++i2) {
            this.h[n3] = i2;
            this.h[n3 + 1] = i2 + 1;
            n3 += this.i;
        }
    }

    public void a(int n2, int n3, int n4, int n5, int n6) {
        boolean bl2;
        if (n2 < 0 || n2 > n3 || n3 > 0x110001 || n4 < 0 || n4 >= this.i - 2) {
            throw new IllegalArgumentException();
        }
        if (this.m) {
            throw new IllegalStateException("Shouldn't be called aftercompact()!");
        }
        int n7 = n3 + 1;
        int n8 = this.d(n2);
        int n9 = this.d(n3);
        boolean bl3 = n2 != this.h[n8] && (n5 &= n6) != (this.h[n8 + (n4 += 2)] & n6);
        boolean bl4 = bl2 = n7 != this.h[n9 + 1] && n5 != (this.h[n9 + n4] & n6);
        if (bl3 || bl2) {
            int n10;
            int n11 = 0;
            if (bl3) {
                ++n11;
            }
            if (bl2) {
                ++n11;
            }
            int n12 = 0;
            if (this.k + n11 > this.j) {
                if (this.j < 65536) {
                    n12 = 65536;
                } else if (this.j < 0x110002) {
                    n12 = 0x110002;
                } else {
                    throw new IndexOutOfBoundsException("MAX_ROWS exceeded! Increase it to a higher valuein the implementation");
                }
                int[] arrn = new int[n12 * this.i];
                System.arraycopy(this.h, 0, arrn, 0, this.k * this.i);
                this.h = arrn;
                this.j = n12;
            }
            if ((n10 = this.k * this.i - (n9 + this.i)) > 0) {
                System.arraycopy(this.h, n9 + this.i, this.h, n9 + (1 + n11) * this.i, n10);
            }
            this.k += n11;
            if (bl3) {
                n10 = n9 - n8 + this.i;
                System.arraycopy(this.h, n8, this.h, n8 + this.i, n10);
                n9 += this.i;
                int n13 = n2;
                this.h[n8 + this.i] = n13;
                this.h[n8 + 1] = n13;
                n8 += this.i;
            }
            if (bl2) {
                System.arraycopy(this.h, n9, this.h, n9 + this.i, this.i);
                int n14 = n7;
                this.h[n9 + this.i] = n14;
                this.h[n9 + 1] = n14;
            }
        }
        this.l = n9 / this.i;
        n8 += n4;
        while (true) {
            this.h[n8] = this.h[n8] & (n6 ^= 0xFFFFFFFF) | n5;
            if (n8 == (n9 += n4)) break;
            n8 += this.i;
        }
    }

    public int a(int n2, int n3) {
        if (this.m || n2 < 0 || n2 > 0x110001 || n3 < 0 || n3 >= this.i - 2) {
            return 0;
        }
        int n4 = this.d(n2);
        return this.h[n4 + 2 + n3];
    }

    public int[] a(int n2) {
        if (this.m) {
            throw new IllegalStateException("Illegal Invocation of the method after compact()");
        }
        if (n2 < 0 || n2 > this.k) {
            throw new IllegalArgumentException("rowIndex out of bound!");
        }
        int[] arrn = new int[this.i - 2];
        System.arraycopy(this.h, n2 * this.i + 2, arrn, 0, this.i - 2);
        return arrn;
    }

    public int b(int n2) {
        if (this.m) {
            throw new IllegalStateException("Illegal Invocation of the method after compact()");
        }
        if (n2 < 0 || n2 > this.k) {
            throw new IllegalArgumentException("rowIndex out of bound!");
        }
        return this.h[n2 * this.i];
    }

    public int c(int n2) {
        if (this.m) {
            throw new IllegalStateException("Illegal Invocation of the method after compact()");
        }
        if (n2 < 0 || n2 > this.k) {
            throw new IllegalArgumentException("rowIndex out of bound!");
        }
        return this.h[n2 * this.i + 1] - 1;
    }

    public void a(eg eg2) {
        int n2;
        int n3;
        if (this.m) {
            return;
        }
        this.m = true;
        int n4 = this.i - 2;
        Integer[] arrinteger = new Integer[this.k];
        for (n3 = 0; n3 < this.k; ++n3) {
            arrinteger[n3] = this.i * n3;
        }
        Arrays.sort(arrinteger, new ef(this));
        n3 = -n4;
        for (int i2 = 0; i2 < this.k; ++i2) {
            n2 = this.h[arrinteger[i2]];
            if (n3 < 0 || !this.a(arrinteger[i2] + 2, this.h, arrinteger[i2 - 1] + 2, n4)) {
                n3 += n4;
            }
            if (n2 == 0x110000) {
                eg2.b(n3);
                continue;
            }
            if (n2 != 0x110001) continue;
            eg2.a(n3);
        }
        eg2.c(n3 += n4);
        int[] arrn = new int[n3];
        n3 = -n4;
        for (n2 = 0; n2 < this.k; ++n2) {
            int n5 = this.h[arrinteger[n2]];
            int n6 = this.h[arrinteger[n2] + 1];
            if (n3 < 0 || !this.a(arrinteger[n2] + 2, arrn, n3, n4)) {
                System.arraycopy(this.h, arrinteger[n2] + 2, arrn, n3 += n4, n4);
            }
            if (n5 >= 0x110000) continue;
            eg2.a(n5, n6 - 1, n3);
        }
        this.h = arrn;
        this.k = n3 / n4 + 1;
    }

    public int[] a() {
        if (!this.m) {
            throw new IllegalStateException("Illegal Invocation of the method before compact()");
        }
        return this.h;
    }

    public int b() {
        if (!this.m) {
            throw new IllegalStateException("Illegal Invocation of the method before compact()");
        }
        return this.k;
    }

    public int c() {
        if (!this.m) {
            throw new IllegalStateException("Illegal Invocation of the method before compact()");
        }
        return this.i - 2;
    }

    public cl d() {
        ea ea2 = new ea();
        this.a(ea2);
        return ea2.a.a(new eh(ea2.a), new ei(null));
    }

    static /* synthetic */ int a(ee ee2) {
        return ee2.i;
    }

    static /* synthetic */ int[] b(ee ee2) {
        return ee2.h;
    }
}

