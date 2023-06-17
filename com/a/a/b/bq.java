/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.bl;
import com.a.a.b.cc;
import com.a.a.b.cl;
import java.io.Serializable;
import java.util.Map;

class bq
implements bl,
Serializable {
    final Map a;
    final Object b;
    private static final long c = 0L;

    bq(Map map, Object object) {
        this.a = (Map)cl.a(map);
        this.b = object;
    }

    @Override
    public Object a(Object object) {
        Object v2 = this.a.get(object);
        return v2 != null || this.a.containsKey(object) ? v2 : this.b;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof bq) {
            bq bq2 = (bq)object;
            return this.a.equals(bq2.a) && cc.a(this.b, bq2.b);
        }
        return false;
    }

    public int hashCode() {
        return cc.a(new Object[]{this.a, this.b});
    }

    public String toString() {
        return "forMap(" + this.a + ", defaultValue=" + this.b + ")";
    }
}

