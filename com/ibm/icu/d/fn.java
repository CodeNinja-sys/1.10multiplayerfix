/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.a;
import com.ibm.icu.d.dm;
import com.ibm.icu.d.dz;
import com.ibm.icu.d.ef;
import com.ibm.icu.d.fj;
import com.ibm.icu.d.fk;
import com.ibm.icu.d.fl;
import com.ibm.icu.d.fm;
import com.ibm.icu.d.gp;
import com.ibm.icu.d.ha;
import com.ibm.icu.d.iu;
import com.ibm.icu.d.iw;
import java.text.ParsePosition;

abstract class fn {
    int d;
    fm e = null;
    dm f = null;
    iu g = null;

    public static fn a(int n2, fl fl2, fl fl3, fm fm2, iu iu2, String string) {
        if (string.length() == 0) {
            return new gp(n2, fm2, iu2, string);
        }
        switch (string.charAt(0)) {
            case '<': {
                if (fl2.a() == -1L) {
                    throw new IllegalArgumentException("<< not allowed in negative-number rule");
                }
                if (fl2.a() == -2L || fl2.a() == -3L || fl2.a() == -4L) {
                    return new ef(n2, fm2, iu2, string);
                }
                if (fm2.b()) {
                    return new ha(n2, fl2.a(), iu2.i(), iu2, string);
                }
                return new fk(n2, fl2.b(), fm2, iu2, string);
            }
            case '>': {
                if (fl2.a() == -1L) {
                    return new a(n2, fm2, iu2, string);
                }
                if (fl2.a() == -2L || fl2.a() == -3L || fl2.a() == -4L) {
                    return new dz(n2, fm2, iu2, string);
                }
                if (fm2.b()) {
                    throw new IllegalArgumentException(">> not allowed in fraction rule set");
                }
                return new fj(n2, fl2.b(), fl3, fm2, iu2, string);
            }
            case '=': {
                return new iw(n2, fm2, iu2, string);
            }
        }
        throw new IllegalArgumentException("Illegal substitution character");
    }

    fn(int n2, fm fm2, iu iu2, String string) {
        this.d = n2;
        this.g = iu2;
        if (string.length() >= 2 && string.charAt(0) == string.charAt(string.length() - 1)) {
            string = string.substring(1, string.length() - 1);
        } else if (string.length() != 0) {
            throw new IllegalArgumentException("Illegal substitution syntax");
        }
        if (string.length() == 0) {
            this.e = fm2;
        } else if (string.charAt(0) == '%') {
            this.e = iu2.c(string);
        } else if (string.charAt(0) == '#' || string.charAt(0) == '0') {
            this.f = new dm(string);
            this.f.a(iu2.l());
        } else if (string.charAt(0) == '>') {
            this.e = fm2;
            this.f = null;
        } else {
            throw new IllegalArgumentException("Illegal substitution syntax");
        }
    }

    public void a(int n2, int n3) {
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (this.getClass() == object.getClass()) {
            fn fn2 = (fn)object;
            return this.d == fn2.d && (this.e != null || fn2.e == null) && (this.f == null ? fn2.f == null : this.f.equals(fn2.f));
        }
        return false;
    }

    public int hashCode() {
        assert (false) : "hashCode not designed";
        return 42;
    }

    public String toString() {
        if (this.e != null) {
            return this.a() + this.e.c() + this.a();
        }
        return this.a() + this.f.w() + this.a();
    }

    public void a(long l2, StringBuffer stringBuffer, int n2) {
        if (this.e != null) {
            long l3 = this.a(l2);
            this.e.a(l3, stringBuffer, n2 + this.d);
        } else {
            double d2 = this.a((double)l2);
            if (this.f.P() == 0) {
                d2 = Math.floor(d2);
            }
            stringBuffer.insert(n2 + this.d, this.f.d(d2));
        }
    }

    public void a(double d2, StringBuffer stringBuffer, int n2) {
        double d3 = this.a(d2);
        if (d3 == Math.floor(d3) && this.e != null) {
            this.e.a((long)d3, stringBuffer, n2 + this.d);
        } else if (this.e != null) {
            this.e.a(d3, stringBuffer, n2 + this.d);
        } else {
            stringBuffer.insert(n2 + this.d, this.f.d(d3));
        }
    }

    public abstract long a(long var1);

    public abstract double a(double var1);

    public Number a(String string, ParsePosition parsePosition, double d2, double d3, boolean bl2) {
        Number number;
        d3 = this.b(d3);
        if (this.e != null) {
            number = this.e.a(string, parsePosition, d3);
            if (bl2 && !this.e.b() && parsePosition.getIndex() == 0) {
                number = this.g.m().a(string, parsePosition);
            }
        } else {
            number = this.f.a(string, parsePosition);
        }
        if (parsePosition.getIndex() != 0) {
            double d4 = number.doubleValue();
            if ((d4 = this.a(d4, d2)) == (double)((long)d4)) {
                return (long)d4;
            }
            return new Double(d4);
        }
        return number;
    }

    public abstract double a(double var1, double var3);

    public abstract double b(double var1);

    public final int c() {
        return this.d;
    }

    abstract char a();

    public boolean d() {
        return false;
    }

    public boolean b() {
        return false;
    }
}

