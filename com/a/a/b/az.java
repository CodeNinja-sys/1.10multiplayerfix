/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.aw;
import com.a.a.b.cc;
import com.a.a.b.cl;
import com.a.a.b.cm;
import java.io.Serializable;

final class az
implements cm,
Serializable {
    private final aw a;
    private final Object b;
    private static final long c = 0L;

    az(aw aw2, Object object) {
        this.a = (aw)cl.a(aw2);
        this.b = object;
    }

    @Override
    public boolean a(Object object) {
        return this.a.a(object, this.b);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof az) {
            az az2 = (az)object;
            return this.a.equals(az2.a) && cc.a(this.b, az2.b);
        }
        return false;
    }

    public int hashCode() {
        return cc.a(new Object[]{this.a, this.b});
    }

    public String toString() {
        return this.a + ".equivalentTo(" + this.b + ")";
    }
}

