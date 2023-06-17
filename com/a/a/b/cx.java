/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.cl;
import com.a.a.b.cm;
import java.io.Serializable;

class cx
implements cm,
Serializable {
    final cm a;
    private static final long b = 0L;

    cx(cm cm2) {
        this.a = (cm)cl.a(cm2);
    }

    @Override
    public boolean a(Object object) {
        return !this.a.a(object);
    }

    public int hashCode() {
        return ~this.a.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof cx) {
            cx cx2 = (cx)object;
            return this.a.equals(cx2.a);
        }
        return false;
    }

    public String toString() {
        return "Predicates.not(" + this.a.toString() + ")";
    }
}

