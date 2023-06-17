/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.cs;
import com.ibm.icu.util.cv;
import com.ibm.icu.util.da;

final class dc
extends cv {
    private char e;
    private da f;
    private da g;
    static final /* synthetic */ boolean c;

    public dc(char c2, da da2, da da3) {
        this.a = ((206918985 + c2) * 37 + da2.hashCode()) * 37 + da3.hashCode();
        this.e = c2;
        this.f = da2;
        this.g = da3;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!super.equals(object)) {
            return false;
        }
        dc dc2 = (dc)object;
        return this.e == dc2.e && this.f == dc2.f && this.g == dc2.g;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public int a(int n2) {
        if (this.d == 0) {
            this.b = n2;
            n2 = this.g.a(n2);
            this.d = n2 = this.f.a(n2 - 1);
        }
        return n2;
    }

    public void a(cs cs2) {
        this.f.a(this.b, this.g.a(), cs2);
        this.g.a(cs2);
        if (!c && this.f.a() <= 0) {
            throw new AssertionError();
        }
        cs2.b(this.f.a());
        this.d = cs2.a(this.e);
    }

    static {
        c = !cs.class.desiredAssertionStatus();
    }
}

