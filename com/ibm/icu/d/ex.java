/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.et;
import com.ibm.icu.d.eu;
import com.ibm.icu.d.ew;
import com.ibm.icu.d.ey;

public final class ex {
    private static final int a = 65535;
    private static final int b = 32767;
    private final ey c;
    private final int d;
    private final char e;
    private short f;
    private int g;

    private ex(ey ey2, int n2, int n3, int n4) {
        this.c = ey2;
        this.d = n2;
        this.e = (char)n3;
        this.f = (short)n4;
    }

    public ey a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public int d() {
        return this.d + this.e;
    }

    public int e() {
        return this.f;
    }

    public ew f() {
        ey ey2 = this.a();
        if (ey2 == ey.f || ey2 == ey.g) {
            return et.n()[this.f];
        }
        return ew.a;
    }

    public String toString() {
        String string = this.c == ey.f || this.c == ey.g ? this.f().name() : Integer.toString(this.f);
        return this.c.name() + "(" + string + ")@" + this.d;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        ex ex2 = (ex)object;
        return this.c.equals((Object)ex2.c) && this.d == ex2.d && this.e == ex2.e && this.f == ex2.f && this.g == ex2.g;
    }

    public int hashCode() {
        return ((this.c.hashCode() * 37 + this.d) * 37 + this.e) * 37 + this.f;
    }

    static /* synthetic */ int a(ex ex2) {
        return ex2.d;
    }

    static /* synthetic */ short b(ex ex2) {
        return ex2.f;
    }

    static /* synthetic */ ey c(ex ex2) {
        return ex2.c;
    }

    static /* synthetic */ char d(ex ex2) {
        return ex2.e;
    }

    static /* synthetic */ int e(ex ex2) {
        return ex2.g;
    }

    static /* synthetic */ short a(ex ex2, short s2) {
        ex2.f = s2;
        return ex2.f;
    }

    /* synthetic */ ex(ey ey2, int n2, int n3, int n4, eu eu2) {
        this(ey2, n2, n3, n4);
    }

    static /* synthetic */ int a(ex ex2, int n2) {
        ex2.g = n2;
        return ex2.g;
    }
}

