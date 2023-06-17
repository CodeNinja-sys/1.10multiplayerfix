/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.bl;
import com.a.a.b.cl;
import java.io.Serializable;
import java.util.Map;

class bs
implements bl,
Serializable {
    final Map a;
    private static final long b = 0L;

    bs(Map map) {
        this.a = (Map)cl.a(map);
    }

    @Override
    public Object a(Object object) {
        Object v2 = this.a.get(object);
        cl.a(v2 != null || this.a.containsKey(object), "Key '%s' not present in map", object);
        return v2;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof bs) {
            bs bs2 = (bs)object;
            return this.a.equals(bs2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "forMap(" + this.a + ")";
    }
}

