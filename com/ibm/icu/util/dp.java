/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

class dp
implements Comparable {
    private double a;
    private double b;

    public dp(double d2, int n2) {
        this.a = d2;
        this.b = n2;
    }

    public int a(dp dp2) {
        if (this.a > dp2.a) {
            return -1;
        }
        if (this.a < dp2.a) {
            return 1;
        }
        if (this.b < dp2.b) {
            return -1;
        }
        if (this.b > dp2.b) {
            return 1;
        }
        return 0;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((dp)object);
    }
}

