/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.a.a;

import org.lwjgl.util.a.a.n;
import org.lwjgl.util.a.a.o;
import org.lwjgl.util.a.a.r;
import org.lwjgl.util.a.a.u;

class s
extends n {
    r b;
    Object[] c;
    int[] d;
    int e;
    int f;
    boolean g;
    o h;

    s(o o2) {
        this.b = new r(o2);
        this.c = new Object[32];
        this.e = 0;
        this.f = 32;
        this.g = false;
        this.h = o2;
    }

    void a() {
        if (this.b != null) {
            this.b.a();
        }
        this.d = null;
        this.c = null;
    }

    private static boolean b(o o2, Object object, Object object2) {
        return !r.a(o2, object2, object);
    }

    private static boolean c(o o2, Object object, Object object2) {
        return !r.a(o2, object, object2);
    }

    private static void a(int[] arrn, int n2, int n3) {
        int n4 = arrn[n2];
        arrn[n2] = arrn[n3];
        arrn[n3] = n4;
    }

    boolean b() {
        int n2;
        int n3;
        u[] arru = new u[50];
        for (n3 = 0; n3 < arru.length; ++n3) {
            arru[n3] = new u(null);
        }
        n3 = 0;
        int n4 = 2016473283;
        this.d = new int[this.e + 1];
        int n5 = 0;
        int n6 = this.e - 1;
        int n7 = 0;
        for (n2 = n5; n2 <= n6; ++n2) {
            this.d[n2] = n7++;
        }
        arru[n3].a = n5;
        arru[n3].b = n6;
        ++n3;
        while (--n3 >= 0) {
            int n8;
            n5 = arru[n3].a;
            n6 = arru[n3].b;
            while (n6 > n5 + 10) {
                n4 = Math.abs(n4 * 1539415821 + 1);
                n2 = n5 + n4 % (n6 - n5 + 1);
                n7 = this.d[n2];
                this.d[n2] = this.d[n5];
                this.d[n5] = n7;
                n2 = n5 - 1;
                n8 = n6 + 1;
                while (true) {
                    if (s.c(this.h, this.c[this.d[++n2]], this.c[n7])) {
                        continue;
                    }
                    while (s.b(this.h, this.c[this.d[--n8]], this.c[n7])) {
                    }
                    s.a(this.d, n2, n8);
                    if (n2 >= n8) break;
                }
                s.a(this.d, n2, n8);
                if (n2 - n5 < n6 - n8) {
                    arru[n3].a = n8 + 1;
                    arru[n3].b = n6;
                    ++n3;
                    n6 = n2 - 1;
                    continue;
                }
                arru[n3].a = n5;
                arru[n3].b = n2 - 1;
                ++n3;
                n5 = n8 + 1;
            }
            for (n2 = n5 + 1; n2 <= n6; ++n2) {
                n7 = this.d[n2];
                for (n8 = n2; n8 > n5 && s.b(this.h, this.c[this.d[n8 - 1]], this.c[n7]); --n8) {
                    this.d[n8] = this.d[n8 - 1];
                }
                this.d[n8] = n7;
            }
        }
        this.f = this.e;
        this.g = true;
        this.b.b();
        return true;
    }

    int a(Object object) {
        if (this.g) {
            return this.b.a(object);
        }
        int n2 = this.e++;
        if (this.e >= this.f) {
            Object[] arrobject = this.c;
            this.f <<= 1;
            Object[] arrobject2 = new Object[this.f];
            System.arraycopy(this.c, 0, arrobject2, 0, this.c.length);
            this.c = arrobject2;
            if (this.c == null) {
                this.c = arrobject;
                return Integer.MAX_VALUE;
            }
        }
        assert (n2 != Integer.MAX_VALUE);
        this.c[n2] = object;
        return -(n2 + 1);
    }

    Object c() {
        Object object;
        if (this.e == 0) {
            return this.b.c();
        }
        Object object2 = this.c[this.d[this.e - 1]];
        if (!this.b.e() && s.a(this.h, object = this.b.d(), object2)) {
            return this.b.c();
        }
        do {
            --this.e;
        } while (this.e > 0 && this.c[this.d[this.e - 1]] == null);
        return object2;
    }

    Object d() {
        Object object;
        if (this.e == 0) {
            return this.b.d();
        }
        Object object2 = this.c[this.d[this.e - 1]];
        if (!this.b.e() && r.a(this.h, object = this.b.d(), object2)) {
            return object;
        }
        return object2;
    }

    boolean e() {
        return this.e == 0 && this.b.e();
    }

    void a(int n2) {
        if (n2 >= 0) {
            this.b.a(n2);
            return;
        }
        n2 = -(n2 + 1);
        assert (n2 < this.f && this.c[n2] != null);
        this.c[n2] = null;
        while (this.e > 0 && this.c[this.d[this.e - 1]] == null) {
            --this.e;
        }
    }
}

