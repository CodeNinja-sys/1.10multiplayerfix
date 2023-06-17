/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.jl;
import com.a.a.d.yd;
import java.io.Serializable;
import java.util.Comparator;

final class cy
extends yd
implements Serializable {
    final jl a;
    private static final long b = 0L;

    cy(Comparator comparator, Comparator comparator2) {
        this.a = jl.a(comparator, comparator2);
    }

    cy(Iterable iterable) {
        this.a = jl.a(iterable);
    }

    @Override
    public int compare(Object object, Object object2) {
        int n2 = this.a.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = ((Comparator)this.a.get(i2)).compare(object, object2);
            if (n3 == 0) continue;
            return n3;
        }
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof cy) {
            cy cy2 = (cy)object;
            return this.a.equals(cy2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "Ordering.compound(" + this.a + ")";
    }
}

