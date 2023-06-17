/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.cl;
import com.a.a.b.cm;
import com.a.a.b.co;
import java.io.Serializable;

class cq
implements cm,
Serializable {
    private final Class a;
    private static final long b = 0L;

    private cq(Class class_) {
        this.a = (Class)cl.a(class_);
    }

    public boolean a(Class class_) {
        return this.a.isAssignableFrom(class_);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof cq) {
            cq cq2 = (cq)object;
            return this.a == cq2.a;
        }
        return false;
    }

    public String toString() {
        return "Predicates.assignableFrom(" + this.a.getName() + ")";
    }

    /* synthetic */ cq(Class class_, co co2) {
        this(class_);
    }
}

