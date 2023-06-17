/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util;

import java.io.Serializable;
import org.lwjgl.util.h;
import org.lwjgl.util.i;
import org.lwjgl.util.j;
import org.lwjgl.util.p;
import org.lwjgl.util.q;
import org.lwjgl.util.r;

public final class k
implements Serializable,
j,
r {
    static final long a = 1L;
    private int b;
    private int c;
    private int d;
    private int e;

    public k() {
    }

    public k(int n2, int n3, int n4, int n5) {
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = n5;
    }

    public k(i i2, h h2) {
        this.b = i2.cQ_();
        this.c = i2.cR_();
        this.d = h2.b();
        this.e = h2.a();
    }

    public k(j j2) {
        this.b = j2.cQ_();
        this.c = j2.cR_();
        this.d = j2.b();
        this.e = j2.a();
    }

    public void a(int n2, int n3) {
        this.b = n2;
        this.c = n3;
    }

    public void a(i i2) {
        this.b = i2.cQ_();
        this.c = i2.cR_();
    }

    public void b_(int n2, int n3) {
        this.d = n2;
        this.e = n3;
    }

    public void a(h h2) {
        this.d = h2.b();
        this.e = h2.a();
    }

    public void a(int n2, int n3, int n4, int n5) {
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = n5;
    }

    public void a(i i2, h h2) {
        this.b = i2.cQ_();
        this.c = i2.cR_();
        this.d = h2.b();
        this.e = h2.a();
    }

    public void a(j j2) {
        this.b = j2.cQ_();
        this.c = j2.cR_();
        this.d = j2.b();
        this.e = j2.a();
    }

    public void a(r r2) {
        r2.a(this.b, this.c, this.d, this.e);
    }

    public void a(q q2) {
        q2.a(this.b, this.c);
    }

    public void a(p p2) {
        p2.b_(this.d, this.e);
    }

    public void b(int n2, int n3) {
        this.b += n2;
        this.c += n3;
    }

    public void b(i i2) {
        this.b += i2.cQ_();
        this.c += i2.cR_();
    }

    public void c(i i2) {
        this.b -= i2.cQ_();
        this.c -= i2.cR_();
    }

    public boolean d(i i2) {
        return this.c(i2.cQ_(), i2.cR_());
    }

    public boolean c(int n2, int n3) {
        int n4 = this.d;
        int n5 = this.e;
        if ((n4 | n5) < 0) {
            return false;
        }
        int n6 = this.b;
        int n7 = this.c;
        if (n2 < n6 || n3 < n7) {
            return false;
        }
        n5 += n7;
        return !((n4 += n6) >= n6 && n4 <= n2 || n5 >= n7 && n5 <= n3);
    }

    public boolean b(j j2) {
        return this.b(j2.cQ_(), j2.cR_(), j2.b(), j2.a());
    }

    public boolean b(int n2, int n3, int n4, int n5) {
        int n6 = this.d;
        int n7 = this.e;
        if ((n6 | n7 | n4 | n5) < 0) {
            return false;
        }
        int n8 = this.b;
        int n9 = this.c;
        if (n2 < n8 || n3 < n9) {
            return false;
        }
        n6 += n8;
        if ((n4 += n2) <= n2 ? n6 >= n8 || n4 > n6 : n6 >= n8 && n4 > n6) {
            return false;
        }
        n7 += n9;
        return !((n5 += n3) <= n3 ? n7 >= n9 || n5 > n7 : n7 >= n9 && n5 > n7);
    }

    public boolean c(j j2) {
        int n2 = this.d;
        int n3 = this.e;
        int n4 = j2.b();
        int n5 = j2.a();
        if (n4 <= 0 || n5 <= 0 || n2 <= 0 || n3 <= 0) {
            return false;
        }
        int n6 = this.b;
        int n7 = this.c;
        int n8 = j2.cQ_();
        int n9 = j2.cR_();
        n5 += n9;
        n2 += n6;
        n3 += n7;
        return !((n4 += n8) >= n8 && n4 <= n6 || n5 >= n9 && n5 <= n7 || n2 >= n6 && n2 <= n8 || n3 >= n7 && n3 <= n9);
    }

    public k a(j j2, k k2) {
        int n2 = this.b;
        int n3 = this.c;
        int n4 = j2.cQ_();
        int n5 = j2.cR_();
        long l2 = n2;
        l2 += (long)this.d;
        long l3 = n3;
        l3 += (long)this.e;
        long l4 = n4;
        l4 += (long)j2.b();
        long l5 = n5;
        l5 += (long)j2.a();
        if (n2 < n4) {
            n2 = n4;
        }
        if (n3 < n5) {
            n3 = n5;
        }
        if (l2 > l4) {
            l2 = l4;
        }
        if (l3 > l5) {
            l3 = l5;
        }
        l3 -= (long)n3;
        if ((l2 -= (long)n2) < Integer.MIN_VALUE) {
            l2 = Integer.MIN_VALUE;
        }
        if (l3 < Integer.MIN_VALUE) {
            l3 = Integer.MIN_VALUE;
        }
        if (k2 == null) {
            k2 = new k(n2, n3, (int)l2, (int)l3);
        } else {
            k2.a(n2, n3, (int)l2, (int)l3);
        }
        return k2;
    }

    public r a(j j2, r r2) {
        int n2 = Math.min(this.b, j2.cQ_());
        int n3 = Math.max(this.b + this.d, j2.cQ_() + j2.b());
        int n4 = Math.min(this.c, j2.cR_());
        int n5 = Math.max(this.c + this.e, j2.cR_() + j2.a());
        r2.a(n2, n4, n3 - n2, n5 - n4);
        return r2;
    }

    public void d(int n2, int n3) {
        int n4 = Math.min(this.b, n2);
        int n5 = Math.max(this.b + this.d, n2);
        int n6 = Math.min(this.c, n3);
        int n7 = Math.max(this.c + this.e, n3);
        this.b = n4;
        this.c = n6;
        this.d = n5 - n4;
        this.e = n7 - n6;
    }

    public void e(i i2) {
        this.d(i2.cQ_(), i2.cR_());
    }

    public void d(j j2) {
        int n2 = Math.min(this.b, j2.cQ_());
        int n3 = Math.max(this.b + this.d, j2.cQ_() + j2.b());
        int n4 = Math.min(this.c, j2.cR_());
        int n5 = Math.max(this.c + this.e, j2.cR_() + j2.a());
        this.b = n2;
        this.c = n4;
        this.d = n3 - n2;
        this.e = n5 - n4;
    }

    public void e(int n2, int n3) {
        this.b -= n2;
        this.c -= n3;
        this.d += n2 * 2;
        this.e += n3 * 2;
    }

    public boolean c() {
        return this.d <= 0 || this.e <= 0;
    }

    public boolean equals(Object object) {
        if (object instanceof k) {
            k k2 = (k)object;
            return this.b == k2.b && this.c == k2.c && this.d == k2.d && this.e == k2.e;
        }
        return super.equals(object);
    }

    public String toString() {
        return this.getClass().getName() + "[x=" + this.b + ",y=" + this.c + ",width=" + this.d + ",height=" + this.e + "]";
    }

    public int a() {
        return this.e;
    }

    public void a(int n2) {
        this.e = n2;
    }

    public int b() {
        return this.d;
    }

    public void b(int n2) {
        this.d = n2;
    }

    public int cQ_() {
        return this.b;
    }

    public void i_(int n2) {
        this.b = n2;
    }

    public int cR_() {
        return this.c;
    }

    public void j_(int n2) {
        this.c = n2;
    }
}

