/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.dl;
import sun.misc.Unsafe;

final class dn {
    volatile long a;
    volatile long b;
    volatile long c;
    volatile long d;
    volatile long e;
    volatile long f;
    volatile long g;
    volatile long h;
    volatile long i;
    volatile long j;
    volatile long k;
    volatile long l;
    volatile long m;
    volatile long n;
    volatile long o;
    private static final Unsafe p;
    private static final long q;

    dn(long l2) {
        this.h = l2;
    }

    final boolean a(long l2, long l3) {
        return p.compareAndSwapLong(this, q, l2, l3);
    }

    static {
        try {
            p = dl.g();
            Class<dn> class_ = dn.class;
            q = p.objectFieldOffset(class_.getDeclaredField("value"));
        }
        catch (Exception exception) {
            throw new Error(exception);
        }
    }
}

