/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.cc;

public abstract class cb {
    private Number a;
    private cc b;

    protected cb(Number number, cc cc2) {
        if (number == null || cc2 == null) {
            throw new NullPointerException();
        }
        this.a = number;
        this.b = cc2;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        try {
            cb cb2 = (cb)object;
            return this.b.equals(cb2.b) && cb.a(this.a, cb2.a);
        }
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    private static boolean a(Number number, Number number2) {
        if (number.equals(number2)) {
            return true;
        }
        return number.doubleValue() == number2.doubleValue();
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public String toString() {
        return this.a.toString() + ' ' + this.b.toString();
    }

    public Number b() {
        return this.a;
    }

    public cc c() {
        return this.b;
    }
}

