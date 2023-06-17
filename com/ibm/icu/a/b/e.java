/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.b;

import com.ibm.icu.a.b.a.q;
import com.ibm.icu.a.b.d;
import com.ibm.icu.a.b.p;
import com.ibm.icu.a.b.x;

class e {
    boolean a;
    short b = (short)255;
    x c = x.c;
    x d = x.j;
    int e;
    int f;
    boolean g = true;
    boolean h;
    boolean i = true;
    final /* synthetic */ d j;

    e(d d2) {
        this.j = d2;
    }

    e a(int n2) {
        if (this.b == n2) {
            return this;
        }
        e e2 = this.a ? this.d() : this;
        e2.b = (short)n2;
        if ((n2 & 0xFF) == 255) {
            e2.b = (short)255;
            e2.c = x.c;
            e2.d = x.j;
        } else {
            int n3 = -1;
            for (int i2 = 0; i2 < x.k.length; ++i2) {
                if (0 == (n2 & 1 << i2)) continue;
                if (n3 == -1) {
                    e2.c = x.k[i2];
                }
                n3 = i2;
            }
            if (n3 == -1) {
                e2.c = null;
                e2.d = null;
            } else {
                e2.d = x.k[n3];
            }
        }
        return e2;
    }

    short a() {
        if (this.i) {
            return this.b;
        }
        return (short)(this.b & ~(1 << x.j.b));
    }

    x b() {
        if (this.i || this.d != x.j) {
            return this.d;
        }
        int n2 = x.k.length - 1;
        while (--n2 >= 0) {
            if (0 == (this.b & 1 << n2)) continue;
            return x.k[n2];
        }
        return x.i;
    }

    e a(float f2) {
        int n2;
        int n3 = n2 = f2 <= 0.0f ? 0 : (int)(f2 * 1000.0f);
        if (f2 == (float)n2) {
            return this;
        }
        e e2 = this.a ? this.d() : this;
        e2.e = n2;
        return e2;
    }

    e b(float f2) {
        int n2;
        int n3 = n2 = f2 <= 0.0f ? 0 : (int)(f2 * 1000.0f);
        if (f2 == (float)n2) {
            return this;
        }
        e e2 = this.a ? this.d() : this;
        e2.f = n2;
        return e2;
    }

    e a(boolean bl2) {
        if (this.g == bl2) {
            return this;
        }
        e e2 = this.a ? this.d() : this;
        e2.g = bl2;
        return e2;
    }

    e b(boolean bl2) {
        if (this.h == bl2) {
            return this;
        }
        e e2 = this.a ? this.d() : this;
        e2.h = bl2;
        return e2;
    }

    e c(boolean bl2) {
        if (this.i == bl2) {
            return this;
        }
        e e2 = this.a ? this.d() : this;
        e2.i = bl2;
        return e2;
    }

    e a(String string) {
        q q2 = com.ibm.icu.a.b.d.a(this.j).a(string);
        return this.a(q2.b()).b(q2.c()).c(q2.d() != 1);
    }

    e c() {
        this.a = true;
        return this;
    }

    p a(long l2, boolean bl2) {
        long l3;
        if (this.e > 0 && l2 * 1000L > (long)this.e * (l3 = com.ibm.icu.a.b.d.a(this.c))) {
            return p.b((float)this.e / 1000.0f, this.c).b(bl2);
        }
        if (this.f > 0) {
            long l4;
            x x2 = this.b();
            long l5 = com.ibm.icu.a.b.d.a(x2);
            long l6 = l4 = x2 == this.d ? (long)this.f : Math.max(1000L, com.ibm.icu.a.b.d.a(this.d) * (long)this.f / l5);
            if (l2 * 1000L < l4 * l5) {
                return p.c((float)l4 / 1000.0f, x2).b(bl2);
            }
        }
        return null;
    }

    public e d() {
        e e2 = new e(this.j);
        e2.a = this.a;
        e2.b = this.b;
        e2.c = this.c;
        e2.d = this.d;
        e2.e = this.e;
        e2.f = this.f;
        e2.g = this.g;
        e2.h = this.h;
        e2.i = this.i;
        return e2;
    }
}

