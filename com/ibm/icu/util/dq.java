/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.c.h;
import com.ibm.icu.a.c.k;
import com.ibm.icu.a.c.o;
import com.ibm.icu.a.c.p;
import com.ibm.icu.util.bj;
import com.ibm.icu.util.dn;

public final class dq {
    private final h a = new h();

    public dq a(dn dn2) {
        try {
            this.a.a(dn.l(dn2), dn.m(dn2));
        }
        catch (o o2) {
            throw new bj(o2.getMessage(), o2.a());
        }
        return this;
    }

    public dq a(String string) {
        p p2 = new p();
        k k2 = k.a(string, p2);
        if (p2.b()) {
            throw new bj(p2.e(), p2.c());
        }
        this.a.a(k2);
        return this;
    }

    public dq b(String string) {
        try {
            this.a.a(string);
        }
        catch (o o2) {
            throw new bj(o2.getMessage(), o2.a());
        }
        return this;
    }

    public dq c(String string) {
        try {
            this.a.b(string);
        }
        catch (o o2) {
            throw new bj(o2.getMessage(), o2.a());
        }
        return this;
    }

    public dq d(String string) {
        try {
            this.a.c(string);
        }
        catch (o o2) {
            throw new bj(o2.getMessage(), o2.a());
        }
        return this;
    }

    public dq e(String string) {
        try {
            this.a.d(string);
        }
        catch (o o2) {
            throw new bj(o2.getMessage(), o2.a());
        }
        return this;
    }

    public dq a(char c2, String string) {
        try {
            this.a.a(c2, string);
        }
        catch (o o2) {
            throw new bj(o2.getMessage(), o2.a());
        }
        return this;
    }

    public dq a(String string, String string2) {
        try {
            this.a.a(string, string2);
        }
        catch (o o2) {
            throw new bj(o2.getMessage(), o2.a());
        }
        return this;
    }

    public dq f(String string) {
        try {
            this.a.e(string);
        }
        catch (o o2) {
            throw new bj(o2.getMessage(), o2.a());
        }
        return this;
    }

    public dq g(String string) {
        try {
            this.a.f(string);
        }
        catch (o o2) {
            throw new bj(o2.getMessage(), o2.a());
        }
        return this;
    }

    public dq a() {
        this.a.a();
        return this;
    }

    public dq b() {
        this.a.b();
        return this;
    }

    public dn c() {
        return dn.a(this.a.c(), this.a.d());
    }
}

