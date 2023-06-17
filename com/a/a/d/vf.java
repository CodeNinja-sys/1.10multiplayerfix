/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.vc;
import com.a.a.d.vg;
import com.a.a.d.yd;

class vf {
    final yd a;
    vf b;
    final /* synthetic */ vc c;

    vf(vc vc2, yd yd2) {
        this.c = vc2;
        this.a = yd2;
    }

    int a(int n2, int n3) {
        return this.a.compare(this.c.c(n2), this.c.c(n3));
    }

    vg a(int n2, int n3, Object object) {
        int n4 = this.d(n3, object);
        if (n4 == n3) {
            return null;
        }
        Object object2 = n4 < n2 ? this.c.c(n2) : this.c.c(this.g(n2));
        if (this.b.b(n4, object) < n2) {
            return new vg(object, object2);
        }
        return null;
    }

    void a(int n2, Object object) {
        vf vf2;
        int n3 = this.c(n2, object);
        if (n3 == n2) {
            vf2 = this;
        } else {
            n2 = n3;
            vf2 = this.b;
        }
        vf2.b(n2, object);
    }

    int b(int n2, Object object) {
        int n3;
        Object object2;
        while (n2 > 2 && this.a.compare(object2 = this.c.c(n3 = this.h(n2)), object) > 0) {
            vc.a((vc)this.c)[n2] = object2;
            n2 = n3;
        }
        vc.a((vc)this.c)[n2] = object;
        return n2;
    }

    int b(int n2, int n3) {
        if (n2 >= vc.b(this.c)) {
            return -1;
        }
        cl.b(n2 > 0);
        int n4 = Math.min(n2, vc.b(this.c) - n3) + n3;
        int n5 = n2;
        for (int i2 = n2 + 1; i2 < n4; ++i2) {
            if (this.a(i2, n5) >= 0) continue;
            n5 = i2;
        }
        return n5;
    }

    int a(int n2) {
        return this.b(this.e(n2), 2);
    }

    int b(int n2) {
        int n3 = this.e(n2);
        if (n3 < 0) {
            return -1;
        }
        return this.b(this.e(n3), 4);
    }

    int c(int n2, Object object) {
        Object object2;
        int n3;
        int n4;
        if (n2 == 0) {
            vc.a((vc)this.c)[0] = object;
            return 0;
        }
        int n5 = this.g(n2);
        Object object3 = this.c.c(n5);
        if (n5 != 0 && (n4 = this.f(n3 = this.g(n5))) != n5 && this.e(n4) >= vc.b(this.c) && this.a.compare(object2 = this.c.c(n4), object3) < 0) {
            n5 = n4;
            object3 = object2;
        }
        if (this.a.compare(object3, object) < 0) {
            vc.a((vc)this.c)[n2] = object3;
            vc.a((vc)this.c)[n5] = object;
            return n5;
        }
        vc.a((vc)this.c)[n2] = object;
        return n2;
    }

    int a(Object object) {
        Object object2;
        int n2;
        int n3;
        int n4 = this.g(vc.b(this.c));
        if (n4 != 0 && (n3 = this.f(n2 = this.g(n4))) != n4 && this.e(n3) >= vc.b(this.c) && this.a.compare(object2 = this.c.c(n3), object) < 0) {
            vc.a((vc)this.c)[n3] = object;
            vc.a((vc)this.c)[vc.b((vc)this.c)] = object2;
            return n3;
        }
        return vc.b(this.c);
    }

    int d(int n2, Object object) {
        int n3 = this.a(n2);
        if (n3 > 0 && this.a.compare(this.c.c(n3), object) < 0) {
            vc.a((vc)this.c)[n2] = this.c.c(n3);
            vc.a((vc)this.c)[n3] = object;
            return n3;
        }
        return this.c(n2, object);
    }

    int c(int n2) {
        int n3;
        while ((n3 = this.b(n2)) > 0) {
            vc.a((vc)this.c)[n2] = this.c.c(n3);
            n2 = n3;
        }
        return n2;
    }

    private boolean d(int n2) {
        if (this.e(n2) < vc.b(this.c) && this.a(n2, this.e(n2)) > 0) {
            return false;
        }
        if (this.f(n2) < vc.b(this.c) && this.a(n2, this.f(n2)) > 0) {
            return false;
        }
        if (n2 > 0 && this.a(n2, this.g(n2)) > 0) {
            return false;
        }
        return n2 <= 2 || this.a(this.h(n2), n2) <= 0;
    }

    private int e(int n2) {
        return n2 * 2 + 1;
    }

    private int f(int n2) {
        return n2 * 2 + 2;
    }

    private int g(int n2) {
        return (n2 - 1) / 2;
    }

    private int h(int n2) {
        return this.g(this.g(n2));
    }

    static /* synthetic */ boolean a(vf vf2, int n2) {
        return vf2.d(n2);
    }
}

