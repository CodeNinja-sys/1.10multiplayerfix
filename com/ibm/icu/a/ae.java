/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

public final class ae {
    private int a;
    private int b;
    private Object[] c;
    private Object[] d;
    private Object e = null;
    private Object f = null;
    private int g = 0;
    private int h = 0;
    private int i = 1;
    private int j = 1;
    private int k = 0;
    private int l = 0;
    private int m = 0;

    public ae(int n2, int n3) {
        this.a = n2;
        this.b = n3;
        this.c = new Object[n2 + n3];
        this.d = new Object[n2 + n3];
    }

    public void a(Object object, Object object2) {
        this.a(object);
        this.b(object2);
    }

    public void a(Object object) {
        this.c();
        this.c[this.g++] = object;
    }

    public void b(Object object) {
        this.c();
        this.d[this.h++] = object;
    }

    public int a(int n2) {
        return this.i + this.k + n2;
    }

    public Object b(int n2) {
        if (n2 < 0) {
            return this.e;
        }
        if (n2 > this.l - this.k) {
            return this.f;
        }
        return this.c[n2];
    }

    public int a() {
        return this.l - this.k;
    }

    public int b() {
        return this.m - this.k;
    }

    public int c(int n2) {
        return this.j + this.k + n2;
    }

    public Object d(int n2) {
        if (n2 < 0) {
            return this.e;
        }
        if (n2 > this.m - this.k) {
            return this.f;
        }
        return this.d[n2];
    }

    public void a(boolean bl2) {
        int n2;
        int n3 = this.g;
        if (n3 > this.h) {
            n3 = this.h;
        }
        for (n2 = 0; n2 < n3 && this.c[n2].equals(this.d[n2]); ++n2) {
        }
        this.l = this.m = (this.k = n2);
        if (this.k > 0) {
            this.e = this.c[this.k - 1];
        }
        this.f = null;
        if (bl2) {
            this.l = this.g;
            this.m = this.h;
            this.f = null;
            return;
        }
        if (this.g - this.k < this.b || this.h - this.k < this.b) {
            return;
        }
        int n4 = this.a(this.c, this.g - this.b, this.g, this.d, this.k, this.h);
        if (n4 != -1) {
            this.l = this.g - this.b;
            this.m = n4;
            this.f = this.c[this.l];
            return;
        }
        n4 = this.a(this.d, this.h - this.b, this.h, this.c, this.k, this.g);
        if (n4 != -1) {
            this.m = this.h - this.b;
            this.l = n4;
            this.f = this.d[this.m];
            return;
        }
        if (this.g >= this.a || this.h >= this.a) {
            this.g = (this.g + this.k) / 2;
            this.h = (this.h + this.k) / 2;
            this.f = null;
        }
    }

    public int a(Object[] arrobject, int n2, int n3, Object[] arrobject2, int n4, int n5) {
        int n6 = n3 - n2;
        int n7 = n5 - n6;
        block0: for (int i2 = n4; i2 <= n7; ++i2) {
            for (int i3 = 0; i3 < n6; ++i3) {
                if (!arrobject2[i2 + i3].equals(arrobject[n2 + i3])) continue block0;
            }
            return i2;
        }
        return -1;
    }

    private void c() {
        int n2;
        if (this.l != 0) {
            n2 = this.g - this.l;
            System.arraycopy(this.c, this.l, this.c, 0, n2);
            this.g = n2;
            this.i += this.l;
            this.l = 0;
        }
        if (this.m != 0) {
            n2 = this.h - this.m;
            System.arraycopy(this.d, this.m, this.d, 0, n2);
            this.h = n2;
            this.j += this.m;
            this.m = 0;
        }
    }
}

