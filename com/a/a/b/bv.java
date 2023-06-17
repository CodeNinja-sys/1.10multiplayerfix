/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.bl;
import com.a.a.b.bo;
import com.a.a.b.cl;
import com.a.a.b.dx;
import java.io.Serializable;

class bv
implements bl,
Serializable {
    private final dx a;
    private static final long b = 0L;

    private bv(dx dx2) {
        this.a = (dx)cl.a(dx2);
    }

    @Override
    public Object a(Object object) {
        return this.a.a();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof bv) {
            bv bv2 = (bv)object;
            return this.a.equals(bv2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "forSupplier(" + this.a + ")";
    }

    /* synthetic */ bv(dx dx2, bo bo2) {
        this(dx2);
    }
}

