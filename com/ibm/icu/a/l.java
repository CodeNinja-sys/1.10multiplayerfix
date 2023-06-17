/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

public final class l {
    public final double a;
    public final double b;

    public l(double d2, double d3) {
        this.a = d2;
        this.b = d3;
    }

    public String toString() {
        return Double.toString(this.b * 57.29577951308232) + "," + this.a * 57.29577951308232;
    }
}

