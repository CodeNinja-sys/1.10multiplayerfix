/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.ak;
import java.io.Serializable;

final class an
extends ak
implements Serializable {
    final ak a;
    final ak b;
    private static final long c = 0L;

    an(ak ak2, ak ak3) {
        this.a = ak2;
        this.b = ak3;
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
        return this.b.e(this.a.e(object));
    }

    @Override
    Object f(Object object) {
        return this.a.f(this.b.f(object));
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof an) {
            an an2 = (an)object;
            return this.a.equals(an2.a) && this.b.equals(an2.b);
        }
        return false;
    }

    public int hashCode() {
        return 31 * this.a.hashCode() + this.b.hashCode();
    }

    public String toString() {
        return this.a + ".andThen(" + this.b + ")";
    }
}

