/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.fm;
import com.ibm.icu.d.fn;
import com.ibm.icu.d.iu;
import java.text.ParsePosition;

class gp
extends fn {
    gp(int n2, fm fm2, iu iu2, String string) {
        super(n2, fm2, iu2, string);
    }

    public boolean equals(Object object) {
        return super.equals(object);
    }

    public int hashCode() {
        assert (false) : "hashCode not designed";
        return 42;
    }

    public String toString() {
        return "";
    }

    public void a(long l2, StringBuffer stringBuffer, int n2) {
    }

    public void a(double d2, StringBuffer stringBuffer, int n2) {
    }

    public long a(long l2) {
        return 0L;
    }

    public double a(double d2) {
        return 0.0;
    }

    public Number a(String string, ParsePosition parsePosition, double d2, double d3, boolean bl2) {
        if (d2 == (double)((long)d2)) {
            return (long)d2;
        }
        return new Double(d2);
    }

    public double a(double d2, double d3) {
        return 0.0;
    }

    public double b(double d2) {
        return 0.0;
    }

    public boolean d() {
        return true;
    }

    char a() {
        return ' ';
    }
}

