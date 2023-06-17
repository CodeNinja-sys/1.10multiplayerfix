/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ep;
import java.io.Serializable;

final class es
extends ep
implements Serializable {
    private static final es a = new es();
    private static final long b = 0L;

    private es() {
    }

    public Long a(Long l2) {
        long l3 = l2;
        return l3 == Long.MAX_VALUE ? null : Long.valueOf(l3 + 1L);
    }

    public Long b(Long l2) {
        long l3 = l2;
        return l3 == Long.MIN_VALUE ? null : Long.valueOf(l3 - 1L);
    }

    public long a(Long l2, Long l3) {
        long l4 = l3 - l2;
        if (l3 > l2 && l4 < 0L) {
            return Long.MAX_VALUE;
        }
        if (l3 < l2 && l4 > 0L) {
            return Long.MIN_VALUE;
        }
        return l4;
    }

    public Long f() {
        return Long.MIN_VALUE;
    }

    public Long g() {
        return Long.MAX_VALUE;
    }

    private Object i() {
        return a;
    }

    public String toString() {
        return "DiscreteDomain.longs()";
    }

    @Override
    public /* synthetic */ Comparable e() {
        return this.g();
    }

    @Override
    public /* synthetic */ Comparable d() {
        return this.f();
    }

    static /* synthetic */ es h() {
        return a;
    }
}

