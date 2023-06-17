/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.yd;
import java.io.Serializable;
import java.util.Comparator;

final class cu
extends yd
implements Serializable {
    final Comparator a;
    private static final long b = 0L;

    cu(Comparator comparator) {
        this.a = (Comparator)cl.a(comparator);
    }

    @Override
    public int compare(Object object, Object object2) {
        return this.a.compare(object, object2);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof cu) {
            cu cu2 = (cu)object;
            return this.a.equals(cu2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}

