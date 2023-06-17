/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.dx;
import java.io.Serializable;

class ef
implements dx,
Serializable {
    final dx a;
    private static final long b = 0L;

    ef(dx dx2) {
        this.a = dx2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object a() {
        dx dx2 = this.a;
        synchronized (dx2) {
            return this.a.a();
        }
    }

    public String toString() {
        return "Suppliers.synchronizedSupplier(" + this.a + ")";
    }
}

