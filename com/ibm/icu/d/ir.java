/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.hc;
import com.ibm.icu.d.iq;
import com.ibm.icu.d.kx;

class ir
implements hc {
    protected iq a = null;
    protected int b = 0;
    protected int c = 0;
    protected int d = 0;
    protected int e = 0;
    protected int f = 0;
    protected int g = 0;
    protected int h = 0;
    protected boolean i = false;

    ir() {
    }

    public void a(iq iq2) {
        this.a = iq2;
        this.c = this.g = iq2.a();
        this.f = 0;
        this.b = 0;
        this.e = 0;
        this.d = 0;
        this.h = 0;
        this.i = false;
    }

    public void b(int n2) {
        this.d = this.e = n2;
        this.b = 0;
        this.h = 0;
        this.i = false;
    }

    public int b() {
        return this.d;
    }

    public void c(int n2) {
        this.c = 0 <= n2 && n2 <= this.a.a() ? n2 : this.a.a();
        this.i = false;
    }

    public void a(int n2, int n3) {
        this.f = n2 < 0 ? 0 : (n2 <= this.a.a() ? n2 : this.a.a());
        this.g = n3 < this.f ? this.f : (n3 <= this.a.a() ? n3 : this.a.a());
        this.i = false;
    }

    public int c() {
        if (this.e < this.c) {
            this.d = this.e;
            int n2 = this.a.b(this.e);
            this.e += kx.a(n2);
            return n2;
        }
        return -1;
    }

    public int a(String string) {
        int n2 = string.length() - (this.e - this.d);
        this.a.a(this.d, this.e, string);
        this.e += n2;
        this.c += n2;
        this.g += n2;
        return n2;
    }

    public boolean d() {
        return this.i;
    }

    public void a(int n2) {
        if (n2 > 0) {
            this.h = 1;
            this.b = this.e;
        } else if (n2 < 0) {
            this.h = -1;
            this.b = this.d;
        } else {
            this.h = 0;
            this.b = 0;
        }
        this.i = false;
    }

    public int a() {
        if (this.h > 0) {
            if (this.b < this.g) {
                int n2 = this.a.b(this.b);
                this.b += kx.a(n2);
                return n2;
            }
            this.i = true;
        } else if (this.h < 0 && this.b > this.f) {
            int n3 = this.a.b(this.b - 1);
            this.b -= kx.a(n3);
            return n3;
        }
        return -1;
    }
}

