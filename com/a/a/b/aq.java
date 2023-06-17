/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.ak;
import java.io.Serializable;

final class aq
extends ak
implements Serializable {
    final ak a;
    private static final long b = 0L;

    aq(ak ak2) {
        this.a = ak2;
    }

    @Override
    protected Object c(Object object) {
        throw new AssertionError();
    }

    @Override
    protected Object b(Object object) {
        throw new AssertionError();
    }

    @Override
    Object e(Object object) {
        return this.a.f(object);
    }

    @Override
    Object f(Object object) {
        return this.a.e(object);
    }

    @Override
    public ak a() {
        return this.a;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof aq) {
            aq aq2 = (aq)object;
            return this.a.equals(aq2.a);
        }
        return false;
    }

    public int hashCode() {
        return ~this.a.hashCode();
    }

    public String toString() {
        return this.a + ".reverse()";
    }
}

