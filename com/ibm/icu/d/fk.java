/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.fm;
import com.ibm.icu.d.fn;
import com.ibm.icu.d.iu;

class fk
extends fn {
    double a;

    fk(int n2, double d2, fm fm2, iu iu2, String string) {
        super(n2, fm2, iu2, string);
        this.a = d2;
        if (d2 == 0.0) {
            throw new IllegalStateException("Substitution with bad divisor (" + d2 + ") " + string.substring(0, n2) + " | " + string.substring(n2));
        }
    }

    public void a(int n2, int n3) {
        this.a = Math.pow(n2, n3);
        if (this.a == 0.0) {
            throw new IllegalStateException("Substitution with divisor 0");
        }
    }

    public boolean equals(Object object) {
        if (super.equals(object)) {
            fk fk2 = (fk)object;
            return this.a == fk2.a;
        }
        return false;
    }

    public int hashCode() {
        assert (false) : "hashCode not designed";
        return 42;
    }

    public long a(long l2) {
        return (long)Math.floor((double)l2 / this.a);
    }

    public double a(double d2) {
        if (this.e == null) {
            return d2 / this.a;
        }
        return Math.floor(d2 / this.a);
    }

    public double a(double d2, double d3) {
        return d2 * this.a;
    }

    public double b(double d2) {
        return this.a;
    }

    char a() {
        return '<';
    }
}

