/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.hl;
import com.ibm.icu.d.hq;
import java.io.Serializable;
import java.util.Arrays;

class hp
implements hl,
Serializable {
    private static final long a = 1L;
    private int b;
    private boolean c;
    private boolean d;
    private long e;
    private long f;
    private long[] g;

    hp(int n2, boolean bl2, boolean bl3, long l2, long l3, long[] arrl) {
        this.b = n2;
        this.c = bl2;
        this.d = bl3;
        this.e = l2;
        this.f = l3;
        this.g = arrl;
    }

    public boolean a(double d2) {
        boolean bl2;
        if (this.d && d2 - (double)((long)d2) != 0.0) {
            return !this.c;
        }
        if (this.b != 0) {
            d2 %= (double)this.b;
        }
        boolean bl3 = bl2 = d2 >= (double)this.e && d2 <= (double)this.f;
        if (bl2 && this.g != null) {
            bl2 = false;
            for (int i2 = 0; !bl2 && i2 < this.g.length; i2 += 2) {
                bl2 = d2 >= (double)this.g[i2] && d2 <= (double)this.g[i2 + 1];
            }
        }
        return this.c == bl2;
    }

    public boolean a() {
        return this.d && this.c && this.b == 0;
    }

    public int a(int n2) {
        int n3 = this.b == 0 ? (int)this.f : this.b;
        return Math.max(n3, n2);
    }

    public String toString() {
        hq hq2 = new hq(this);
        if (this.b > 1) {
            hq2.a("mod", this.b);
        }
        if (this.c) {
            hq2.a("in");
        } else {
            hq2.a("except");
        }
        if (this.d) {
            hq2.a("ints");
        }
        if (this.e == this.f) {
            hq2.a(String.valueOf(this.e));
        } else {
            hq2.a(String.valueOf(this.e) + "-" + String.valueOf(this.f));
        }
        if (this.g != null) {
            hq2.a(Arrays.toString(this.g));
        }
        return hq2.toString();
    }
}

