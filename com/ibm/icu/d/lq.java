/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.kx;
import com.ibm.icu.d.lf;
import java.util.Iterator;

public class lq {
    public static int a = -1;
    public int b;
    public int c;
    public String d;
    private lf g;
    private int h = 0;
    private int i = 0;
    protected int e;
    protected int f;
    private Iterator j = null;

    public lq(lf lf2) {
        this.a(lf2);
    }

    public lq() {
        this.a(new lf());
    }

    public boolean a() {
        if (this.f <= this.e) {
            this.c = this.f++;
            this.b = this.c;
            return true;
        }
        if (this.i < this.h) {
            this.a(++this.i);
            this.c = this.f++;
            this.b = this.c;
            return true;
        }
        if (this.j == null) {
            return false;
        }
        this.b = a;
        this.d = (String)this.j.next();
        if (!this.j.hasNext()) {
            this.j = null;
        }
        return true;
    }

    public boolean b() {
        if (this.f <= this.e) {
            this.c = this.e;
            this.b = this.f;
            this.f = this.e + 1;
            return true;
        }
        if (this.i < this.h) {
            this.a(++this.i);
            this.c = this.e;
            this.b = this.f;
            this.f = this.e + 1;
            return true;
        }
        if (this.j == null) {
            return false;
        }
        this.b = a;
        this.d = (String)this.j.next();
        if (!this.j.hasNext()) {
            this.j = null;
        }
        return true;
    }

    public void a(lf lf2) {
        this.g = lf2;
        this.c();
    }

    public void c() {
        this.h = this.g.h() - 1;
        this.i = 0;
        this.e = -1;
        this.f = 0;
        if (this.h >= 0) {
            this.a(this.i);
        }
        this.j = null;
        if (this.g.i != null) {
            this.j = this.g.i.iterator();
            if (!this.j.hasNext()) {
                this.j = null;
            }
        }
    }

    public String d() {
        if (this.b != a) {
            return kx.d(this.b);
        }
        return this.d;
    }

    public lf e() {
        return this.g;
    }

    protected void a(int n2) {
        this.f = this.g.i(n2);
        this.e = this.g.j(n2);
    }
}

