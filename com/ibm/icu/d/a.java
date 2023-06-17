/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.fm;
import com.ibm.icu.d.fn;
import com.ibm.icu.d.iu;

class a
extends fn {
    a(int n2, fm fm2, iu iu2, String string) {
        super(n2, fm2, iu2, string);
    }

    public long a(long l2) {
        return Math.abs(l2);
    }

    public double a(double d2) {
        return Math.abs(d2);
    }

    public double a(double d2, double d3) {
        return -d2;
    }

    public double b(double d2) {
        return Double.MAX_VALUE;
    }

    char a() {
        return '>';
    }
}

