/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.cm;
import com.a.a.b.co;
import java.io.Serializable;

class cw
implements cm,
Serializable {
    private final Object a;
    private static final long b = 0L;

    private cw(Object object) {
        this.a = object;
    }

    @Override
    public boolean a(Object object) {
        return this.a.equals(object);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof cw) {
            cw cw2 = (cw)object;
            return this.a.equals(cw2.a);
        }
        return false;
    }

    public String toString() {
        return "Predicates.equalTo(" + this.a + ")";
    }

    /* synthetic */ cw(Object object, co co2) {
        this(object);
    }
}

