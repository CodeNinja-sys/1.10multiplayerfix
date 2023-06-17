/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

final class as {
    private long a;

    public as(long l2) {
        this.a = l2;
    }

    public double a() {
        this.a = 2862933555777941757L * this.a + 1L;
        return (double)((int)(this.a >>> 33) + 1) / 2.147483648E9;
    }
}

