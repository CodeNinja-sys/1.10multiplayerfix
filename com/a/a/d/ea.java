/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ce;
import com.a.a.d.dw;
import com.a.a.d.ep;
import java.util.NoSuchElementException;

final class ea
extends dw {
    private static final ea b = new ea();
    private static final long c = 0L;

    private ea() {
        super(null);
    }

    @Override
    Comparable c() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override
    boolean a(Comparable comparable) {
        return true;
    }

    @Override
    ce a() {
        throw new IllegalStateException();
    }

    @Override
    ce b() {
        throw new AssertionError((Object)"this statement should be unreachable");
    }

    @Override
    dw a(ce ce2, ep ep2) {
        throw new IllegalStateException();
    }

    @Override
    dw b(ce ce2, ep ep2) {
        throw new AssertionError((Object)"this statement should be unreachable");
    }

    @Override
    void a(StringBuilder stringBuilder) {
        stringBuilder.append("(-\u221e");
    }

    @Override
    void b(StringBuilder stringBuilder) {
        throw new AssertionError();
    }

    @Override
    Comparable a(ep ep2) {
        return ep2.d();
    }

    @Override
    Comparable b(ep ep2) {
        throw new AssertionError();
    }

    @Override
    dw c(ep ep2) {
        try {
            return dw.b(ep2.d());
        }
        catch (NoSuchElementException noSuchElementException) {
            return this;
        }
    }

    @Override
    public int a(dw dw2) {
        return dw2 == this ? 0 : -1;
    }

    public String toString() {
        return "-\u221e";
    }

    private Object g() {
        return b;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((dw)object);
    }

    static /* synthetic */ ea f() {
        return b;
    }
}

