/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.fl;
import com.ibm.icu.d.fm;
import com.ibm.icu.d.fn;
import com.ibm.icu.d.iu;
import java.text.ParsePosition;

class fj
extends fn {
    double a;
    fl b;

    fj(int n2, double d2, fl fl2, fm fm2, iu iu2, String string) {
        super(n2, fm2, iu2, string);
        this.a = d2;
        if (d2 == 0.0) {
            throw new IllegalStateException("Substitution with bad divisor (" + d2 + ") " + string.substring(0, n2) + " | " + string.substring(n2));
        }
        this.b = string.equals(">>>") ? fl2 : null;
    }

    public void a(int n2, int n3) {
        this.a = Math.pow(n2, n3);
        if (this.a == 0.0) {
            throw new IllegalStateException("Substitution with bad divisor");
        }
    }

    public boolean equals(Object object) {
        if (super.equals(object)) {
            fj fj2 = (fj)object;
            return this.a == fj2.a;
        }
        return false;
    }

    public int hashCode() {
        assert (false) : "hashCode not designed";
        return 42;
    }

    public void a(long l2, StringBuffer stringBuffer, int n2) {
        if (this.b == null) {
            super.a(l2, stringBuffer, n2);
        } else {
            long l3 = this.a(l2);
            this.b.a(l3, stringBuffer, n2 + this.d);
        }
    }

    public void a(double d2, StringBuffer stringBuffer, int n2) {
        if (this.b == null) {
            super.a(d2, stringBuffer, n2);
        } else {
            double d3 = this.a(d2);
            this.b.a(d3, stringBuffer, n2 + this.d);
        }
    }

    public long a(long l2) {
        return (long)Math.floor((double)l2 % this.a);
    }

    public double a(double d2) {
        return Math.floor(d2 % this.a);
    }

    public Number a(String string, ParsePosition parsePosition, double d2, double d3, boolean bl2) {
        if (this.b == null) {
            return super.a(string, parsePosition, d2, d3, bl2);
        }
        Number number = this.b.a(string, parsePosition, false, d3);
        if (parsePosition.getIndex() != 0) {
            double d4 = number.doubleValue();
            if ((d4 = this.a(d4, d2)) == (double)((long)d4)) {
                return (long)d4;
            }
            return new Double(d4);
        }
        return number;
    }

    public double a(double d2, double d3) {
        return d3 - d3 % this.a + d2;
    }

    public double b(double d2) {
        return this.a;
    }

    public boolean b() {
        return true;
    }

    char a() {
        return '>';
    }
}

