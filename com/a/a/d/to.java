/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.ak;
import com.a.a.b.cl;
import com.a.a.d.bw;
import java.io.Serializable;

final class to
extends ak
implements Serializable {
    private final bw a;
    private static final long b = 0L;

    to(bw bw2) {
        this.a = (bw)cl.a(bw2);
    }

    @Override
    protected Object c(Object object) {
        return to.a(this.a, object);
    }

    @Override
    protected Object b(Object object) {
        return to.a(this.a.aT_(), object);
    }

    private static Object a(bw bw2, Object object) {
        Object v2 = bw2.get(object);
        cl.a(v2 != null, "No non-null mapping present for input: %s", object);
        return v2;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof to) {
            to to2 = (to)object;
            return this.a.equals(to2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "Maps.asConverter(" + this.a + ")";
    }
}

