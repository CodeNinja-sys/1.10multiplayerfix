/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.cl;
import com.a.a.b.cm;
import com.a.a.b.co;
import java.io.Serializable;
import java.util.Collection;

class cu
implements cm,
Serializable {
    private final Collection a;
    private static final long b = 0L;

    private cu(Collection collection) {
        this.a = (Collection)cl.a(collection);
    }

    @Override
    public boolean a(Object object) {
        try {
            return this.a.contains(object);
        }
        catch (NullPointerException nullPointerException) {
            return false;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    @Override
    public boolean equals(Object object) {
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
        return "Predicates.in(" + this.a + ")";
    }

    /* synthetic */ cu(Collection collection, co co2) {
        this(collection);
    }
}

