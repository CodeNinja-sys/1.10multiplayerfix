/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.b;

import com.ibm.icu.a.b.a.q;
import com.ibm.icu.a.b.g;
import com.ibm.icu.a.b.h;
import com.ibm.icu.a.b.p;
import com.ibm.icu.a.b.t;
import com.ibm.icu.a.b.x;

class f
implements t {
    private g a;
    private String b;
    private q c;
    private h d;

    f(g g2, String string, q q2, h h2) {
        this.a = g2;
        this.b = string;
        this.c = q2;
        this.d = h2;
    }

    public String a(p p2) {
        if (!p2.f()) {
            throw new IllegalArgumentException("period is not set");
        }
        return this.a(p2.a, p2.b, p2.c);
    }

    public t a(String string) {
        if (!this.b.equals(string)) {
            q q2 = this.a.b(string);
            return new f(this.a, string, q2, this.d);
        }
        return this;
    }

    private String a(int n2, boolean bl2, int[] arrn) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9 = 0;
        for (n8 = 0; n8 < arrn.length; ++n8) {
            if (arrn[n8] <= 0) continue;
            n9 |= 1 << n8;
        }
        if (!this.c.b()) {
            n8 = 0;
            n7 = 1;
            while (n8 < arrn.length) {
                if ((n9 & n7) != 0 && arrn[n8] == 1) {
                    n9 &= ~n7;
                }
                ++n8;
                n7 <<= 1;
            }
            if (n9 == 0) {
                return null;
            }
        }
        n8 = 0;
        if (this.c.d() != 0 && (n9 & 1 << x.j.b) != 0) {
            n7 = x.i.b;
            n6 = x.j.b;
            n5 = 1 << n7;
            n4 = 1 << n6;
            switch (this.c.d()) {
                case 2: {
                    if ((n9 & n5) == 0) break;
                    int n10 = n7;
                    arrn[n10] = arrn[n10] + (arrn[n6] - 1) / 1000;
                    n9 &= ~n4;
                    n8 = 1;
                    break;
                }
                case 1: {
                    if ((n9 & n5) == 0) {
                        n9 |= n5;
                        arrn[n7] = 1;
                    }
                    int n11 = n7;
                    arrn[n11] = arrn[n11] + (arrn[n6] - 1) / 1000;
                    n9 &= ~n4;
                    n8 = 1;
                }
            }
        }
        n6 = arrn.length - 1;
        for (n7 = 0; n7 < arrn.length && (n9 & 1 << n7) == 0; ++n7) {
        }
        while (n6 > n7 && (n9 & 1 << n6) == 0) {
            --n6;
        }
        n5 = 1;
        for (n4 = n7; n4 <= n6; ++n4) {
            if ((n9 & 1 << n4) == 0 || arrn[n4] <= 1) continue;
            n5 = 0;
            break;
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (!this.d.a || n5 != 0) {
            n2 = 0;
        }
        int n12 = !this.d.b || n5 != 0 ? 0 : (bl2 ? 2 : 1);
        boolean bl3 = this.c.a(n2, n12, stringBuffer);
        boolean bl4 = n7 != n6;
        boolean bl5 = true;
        boolean bl6 = false;
        boolean bl7 = this.d.c != 0;
        int n13 = n3 = n7;
        while (n3 <= n6) {
            if (bl6) {
                this.c.a(stringBuffer);
                bl6 = false;
                bl5 = true;
            }
            while (++n13 < n6 && (n9 & 1 << n13) == 0) {
                bl6 = true;
            }
            x x2 = x.k[n3];
            int n14 = arrn[n3] - 1;
            int n15 = this.d.e;
            if (n3 == n6) {
                if (n8 != 0) {
                    n15 = 5;
                }
            } else {
                n15 = 0;
            }
            boolean bl8 = n3 == n6;
            boolean bl9 = this.c.a(x2, n14, n15, this.d.d, bl7, bl3, bl4, bl8, bl5, stringBuffer);
            bl6 |= bl9;
            bl5 = false;
            if (this.d.c != 0 && n13 <= n6) {
                boolean bl10 = n3 == n7;
                boolean bl11 = n13 == n6;
                boolean bl12 = this.d.c == 2;
                bl3 = this.c.a(x2, bl12, bl10, bl11, stringBuffer);
            } else {
                bl3 = false;
            }
            n3 = n13;
        }
        this.c.b(n2, n12, stringBuffer);
        return stringBuffer.toString();
    }
}

