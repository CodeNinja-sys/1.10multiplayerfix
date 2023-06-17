/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.ck;
import com.a.a.b.cl;
import com.a.a.b.dx;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

class dz
implements dx,
Serializable {
    final dx a;
    final long b;
    volatile transient Object c;
    volatile transient long d;
    private static final long e = 0L;

    dz(dx dx2, long l2, TimeUnit timeUnit) {
        this.a = (dx)cl.a(dx2);
        this.b = timeUnit.toNanos(l2);
        cl.a(l2 > 0L);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object a() {
        long l2 = this.d;
        long l3 = ck.a();
        if (l2 == 0L || l3 - l2 >= 0L) {
            dz dz2 = this;
            synchronized (dz2) {
                if (l2 == this.d) {
                    Object object;
                    this.c = object = this.a.a();
                    l2 = l3 + this.b;
                    this.d = l2 == 0L ? 1L : l2;
                    return object;
                }
            }
        }
        return this.c;
    }

    public String toString() {
        return "Suppliers.memoizeWithExpiration(" + this.a + ", " + this.b + ", NANOS)";
    }
}

