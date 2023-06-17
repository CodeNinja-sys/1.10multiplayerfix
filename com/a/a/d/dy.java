/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ce;
import com.a.a.d.dw;
import com.a.a.d.ep;

final class dy
extends dw {
    private static final dy b = new dy();
    private static final long c = 0L;

    private dy() {
        super(null);
    }

    @Override
    Comparable c() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override
    boolean a(Comparable comparable) {
        return false;
    }

    @Override
    ce a() {
        throw new AssertionError((Object)"this statement should be unreachable");
    }

    @Override
    ce b() {
        throw new IllegalStateException();
    }

    @Override
    dw a(ce ce2, ep ep2) {
        throw new AssertionError((Object)"this statement should be unreachable");
    }

    @Override
    dw b(ce ce2, ep ep2) {
        throw new IllegalStateException();
    }

    @Override
    void a(StringBuilder stringBuilder) {
        throw new AssertionError();
    }

    @Override
    void b(StringBuilder stringBuilder) {
        stringBuilder.append("+\u221e)");
    }

    @Override
    Comparable a(ep ep2) {
        throw new AssertionError();
    }

    @Override
    Comparable b(ep ep2) {
        return ep2.e();
    }

    @Override
    public int a(dw dw2) {
        return dw2 == this ? 0 : 1;
    }

    public String toString() {
        return "+\u221e";
    }

    private Object g() {
        return b;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((dw)object);
    }

    static /* synthetic */ dy f() {
        return b;
    }
}

