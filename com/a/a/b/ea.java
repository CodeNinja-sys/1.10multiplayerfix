/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.dx;
import java.io.Serializable;

class ea
implements dx,
Serializable {
    final dx a;
    volatile transient boolean b;
    transient Object c;
    private static final long d = 0L;

    ea(dx dx2) {
        this.a = dx2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object a() {
        if (!this.b) {
            ea ea2 = this;
            synchronized (ea2) {
                if (!this.b) {
                    Object object;
                    this.c = object = this.a.a();
                    this.b = true;
                    return object;
                }
            }
        }
        return this.c;
    }

    public String toString() {
        return "Suppliers.memoize(" + this.a + ")";
    }
}

