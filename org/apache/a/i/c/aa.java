/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.util.concurrent.TimeUnit;

class aa {
    private final long a;
    private final long b;

    aa(long l2, long l3, TimeUnit timeUnit) {
        this.a = l2;
        this.b = l3 > 0L ? l2 + timeUnit.toMillis(l3) : Long.MAX_VALUE;
    }

    static /* synthetic */ long a(aa aa2) {
        return aa2.b;
    }

    static /* synthetic */ long b(aa aa2) {
        return aa2.a;
    }
}

