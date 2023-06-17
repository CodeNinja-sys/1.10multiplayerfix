/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.b;

import com.a.a.b.cc;
import net.minecraft.u.b.n;

public class t
implements Comparable {
    public static final t e = new t(0, 0, 0);
    private final int a;
    private final int b;
    private final int c;

    public t(int n2, int n3, int n4) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
    }

    public t(double d2, double d3, double d4) {
        this(n.c(d2), n.c(d3), n.c(d4));
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof t)) {
            return false;
        }
        t t2 = (t)object;
        return this.cy_() != t2.cy_() ? false : (this.k() != t2.k() ? false : this.l() == t2.l());
    }

    public int hashCode() {
        return (this.k() + this.l() * 31) * 31 + this.cy_();
    }

    public int h(t t2) {
        return this.k() == t2.k() ? (this.l() == t2.l() ? this.cy_() - t2.cy_() : this.l() - t2.l()) : this.k() - t2.k();
    }

    public int cy_() {
        return this.a;
    }

    public int k() {
        return this.b;
    }

    public int l() {
        return this.c;
    }

    public t d(t t2) {
        return new t(this.k() * t2.l() - this.l() * t2.k(), this.l() * t2.cy_() - this.cy_() * t2.l(), this.cy_() * t2.k() - this.k() * t2.cy_());
    }

    public double e(int n2, int n3, int n4) {
        double d2 = this.cy_() - n2;
        double d3 = this.k() - n3;
        double d4 = this.l() - n4;
        return Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
    }

    public double e(double d2, double d3, double d4) {
        double d5 = (double)this.cy_() - d2;
        double d6 = (double)this.k() - d3;
        double d7 = (double)this.l() - d4;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public double f(double d2, double d3, double d4) {
        double d5 = (double)this.cy_() + 0.5 - d2;
        double d6 = (double)this.k() + 0.5 - d3;
        double d7 = (double)this.l() + 0.5 - d4;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public double i(t t2) {
        return this.e((double)t2.cy_(), (double)t2.k(), (double)t2.l());
    }

    public String toString() {
        return cc.a((Object)this).a("x", this.cy_()).a("y", this.k()).a("z", this.l()).toString();
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.h((t)object);
    }
}

