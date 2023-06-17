/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.cm;
import com.a.a.b.cn;
import com.a.a.b.co;
import java.io.Serializable;
import java.util.List;

class dd
implements cm,
Serializable {
    private final List a;
    private static final long b = 0L;

    private dd(List list) {
        this.a = list;
    }

    @Override
    public boolean a(Object object) {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            if (!((cm)this.a.get(i2)).a(object)) continue;
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() + 87855567;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof dd) {
            dd dd2 = (dd)object;
            return this.a.equals(dd2.a);
        }
        return false;
    }

    public String toString() {
        return "Predicates.or(" + cn.e().a(this.a) + ")";
    }

    /* synthetic */ dd(List list, co co2) {
        this(list);
    }
}

