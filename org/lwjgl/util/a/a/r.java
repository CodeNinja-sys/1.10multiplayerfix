/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.a.a;

import org.lwjgl.util.a.a.n;
import org.lwjgl.util.a.a.o;
import org.lwjgl.util.a.a.p;
import org.lwjgl.util.a.a.q;

class r
extends n {
    q[] b = new q[33];
    p[] c;
    int d = 0;
    int e = 32;
    int f;
    boolean g;
    o h;

    r(o o2) {
        int n2;
        for (n2 = 0; n2 < this.b.length; ++n2) {
            this.b[n2] = new q();
        }
        this.c = new p[33];
        for (n2 = 0; n2 < this.c.length; ++n2) {
            this.c[n2] = new p();
        }
        this.g = false;
        this.f = 0;
        this.h = o2;
        this.b[1].a = 1;
        this.c[1].a = null;
    }

    void a() {
        this.c = null;
        this.b = null;
    }

    void b(int n2) {
        q[] arrq = this.b;
        p[] arrp = this.c;
        int n3 = arrq[n2].a;
        while (true) {
            int n4;
            if ((n4 = n2 << 1) < this.d && r.a(this.h, arrp[arrq[n4 + 1].a].a, arrp[arrq[n4].a].a)) {
                ++n4;
            }
            assert (n4 <= this.e);
            int n5 = arrq[n4].a;
            if (n4 > this.d || r.a(this.h, arrp[n3].a, arrp[n5].a)) break;
            arrq[n2].a = n5;
            arrp[n5].b = n2;
            n2 = n4;
        }
        arrq[n2].a = n3;
        arrp[n3].b = n2;
    }

    void c(int n2) {
        q[] arrq = this.b;
        p[] arrp = this.c;
        int n3 = arrq[n2].a;
        while (true) {
            int n4 = n2 >> 1;
            int n5 = arrq[n4].a;
            if (n4 == 0 || r.a(this.h, arrp[n5].a, arrp[n3].a)) break;
            arrq[n2].a = n5;
            arrp[n5].b = n2;
            n2 = n4;
        }
        arrq[n2].a = n3;
        arrp[n3].b = n2;
    }

    boolean b() {
        for (int i2 = this.d; i2 >= 1; --i2) {
            this.b(i2);
        }
        this.g = true;
        return true;
    }

    int a(Object object) {
        int n2;
        int n3;
        if ((n3 = ++this.d) * 2 > this.e) {
            q[] arrq = this.b;
            p[] arrp = this.c;
            this.e <<= 1;
            q[] arrq2 = new q[this.e + 1];
            System.arraycopy(this.b, 0, arrq2, 0, this.b.length);
            for (int i2 = this.b.length; i2 < arrq2.length; ++i2) {
                arrq2[i2] = new q();
            }
            this.b = arrq2;
            if (this.b == null) {
                this.b = arrq;
                return Integer.MAX_VALUE;
            }
            p[] arrp2 = new p[this.e + 1];
            System.arraycopy(this.c, 0, arrp2, 0, this.c.length);
            for (int i3 = this.c.length; i3 < arrp2.length; ++i3) {
                arrp2[i3] = new p();
            }
            this.c = arrp2;
            if (this.c == null) {
                this.c = arrp;
                return Integer.MAX_VALUE;
            }
        }
        if (this.f == 0) {
            n2 = n3;
        } else {
            n2 = this.f;
            this.f = this.c[n2].b;
        }
        this.b[n3].a = n2;
        this.c[n2].b = n3;
        this.c[n2].a = object;
        if (this.g) {
            this.c(n3);
        }
        assert (n2 != Integer.MAX_VALUE);
        return n2;
    }

    Object c() {
        q[] arrq = this.b;
        p[] arrp = this.c;
        int n2 = arrq[1].a;
        Object object = arrp[n2].a;
        if (this.d > 0) {
            arrq[1].a = arrq[this.d].a;
            arrp[arrq[1].a].b = 1;
            arrp[n2].a = null;
            arrp[n2].b = this.f;
            this.f = n2;
            if (--this.d > 0) {
                this.b(1);
            }
        }
        return object;
    }

    void a(int n2) {
        q[] arrq = this.b;
        p[] arrp = this.c;
        assert (n2 >= 1 && n2 <= this.e && arrp[n2].a != null);
        int n3 = arrp[n2].b;
        arrq[n3].a = arrq[this.d].a;
        arrp[arrq[n3].a].b = n3;
        if (n3 <= --this.d) {
            if (n3 <= 1 || r.a(this.h, arrp[arrq[n3 >> 1].a].a, arrp[arrq[n3].a].a)) {
                this.b(n3);
            } else {
                this.c(n3);
            }
        }
        arrp[n2].a = null;
        arrp[n2].b = this.f;
        this.f = n2;
    }

    Object d() {
        return this.c[this.b[1].a].a;
    }

    boolean e() {
        return this.d == 0;
    }
}

