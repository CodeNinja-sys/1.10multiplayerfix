/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.bl;
import com.a.a.b.cc;
import com.a.a.b.dx;
import java.io.Serializable;

class eb
implements dx,
Serializable {
    final bl a;
    final dx b;
    private static final long c = 0L;

    eb(bl bl2, dx dx2) {
        this.a = bl2;
        this.b = dx2;
    }

    @Override
    public Object a() {
        return this.a.a(this.b.a());
    }

    public boolean equals(Object object) {
        if (object instanceof eb) {
            eb eb2 = (eb)object;
            return this.a.equals(eb2.a) && this.b.equals(eb2.b);
        }
        return false;
    }

    public int hashCode() {
        return cc.a(new Object[]{this.a, this.b});
    }

    public String toString() {
        return "Suppliers.compose(" + this.a + ", " + this.b + ")";
    }
}

