/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.cc;
import com.a.a.b.dx;
import java.io.Serializable;

class ee
implements dx,
Serializable {
    final Object a;
    private static final long b = 0L;

    ee(Object object) {
        this.a = object;
    }

    @Override
    public Object a() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object instanceof ee) {
            ee ee2 = (ee)object;
            return cc.a(this.a, ee2.a);
        }
        return false;
    }

    public int hashCode() {
        return cc.a(new Object[]{this.a});
    }

    public String toString() {
        return "Suppliers.ofInstance(" + this.a + ")";
    }
}

