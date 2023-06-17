/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.e;

public final class m {
    public final double a;
    public final double b;

    public m(double d2, double d3) {
        this.a = d2;
        this.b = d3;
    }

    public String toString() {
        return Double.toString(this.a * 57.29577951308232) + "," + this.b * 57.29577951308232;
    }

    public String a() {
        return e.e(this.a) + "," + e.f(this.b);
    }
}

