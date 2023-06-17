/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ep;
import java.io.Serializable;

final class er
extends ep
implements Serializable {
    private static final er a = new er();
    private static final long b = 0L;

    private er() {
    }

    public Integer a(Integer n2) {
        int n3 = n2;
        return n3 == Integer.MAX_VALUE ? null : Integer.valueOf(n3 + 1);
    }

    public Integer b(Integer n2) {
        int n3 = n2;
        return n3 == Integer.MIN_VALUE ? null : Integer.valueOf(n3 - 1);
    }

    public long a(Integer n2, Integer n3) {
        return (long)n3.intValue() - (long)n2.intValue();
    }

    public Integer f() {
        return Integer.MIN_VALUE;
    }

    public Integer g() {
        return Integer.MAX_VALUE;
    }

    private Object i() {
        return a;
    }

    public String toString() {
        return "DiscreteDomain.integers()";
    }

    @Override
    public /* synthetic */ Comparable e() {
        return this.g();
    }

    @Override
    public /* synthetic */ Comparable d() {
        return this.f();
    }

    static /* synthetic */ er h() {
        return a;
    }
}

