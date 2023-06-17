/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.bl;
import com.a.a.b.cc;
import java.io.Serializable;

class bp
implements bl,
Serializable {
    private final Object a;
    private static final long b = 0L;

    public bp(Object object) {
        this.a = object;
    }

    @Override
    public Object a(Object object) {
        return this.a;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof bp) {
            bp bp2 = (bp)object;
            return cc.a(this.a, bp2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    public String toString() {
        return "constant(" + this.a + ")";
    }
}

