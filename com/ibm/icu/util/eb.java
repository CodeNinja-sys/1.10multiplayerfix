/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

final class eb {
    long a;
    long b;
    long c;
    long d;
    long e;
    long f;
    long g;
    long h;
    long i;
    long j;
    long k;

    eb(long l2, long l3, long l4, long l5, long l6, long l7) {
        this.a = l2;
        this.i = l2 / 2L;
        this.j = Long.MIN_VALUE + this.i;
        this.k = Long.MAX_VALUE - this.i;
        this.b = l3 / l2;
        if (l2 == 1L) {
            this.g = this.h = this.b;
        } else {
            this.g = this.b + 1L;
            this.h = this.b - 1L;
        }
        this.e = l4;
        this.f = l5;
        this.c = l6;
        this.d = l7;
    }
}

