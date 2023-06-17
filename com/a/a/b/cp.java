/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.cm;
import com.a.a.b.cn;
import com.a.a.b.co;
import java.io.Serializable;
import java.util.List;

class cp
implements cm,
Serializable {
    private final List a;
    private static final long b = 0L;

    private cp(List list) {
        this.a = list;
    }

    @Override
    public boolean a(Object object) {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            if (((cm)this.a.get(i2)).a(object)) continue;
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.a.hashCode() + 306654252;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof cp) {
            cp cp2 = (cp)object;
            return this.a.equals(cp2.a);
        }
        return false;
    }

    public String toString() {
        return "Predicates.and(" + cn.e().a(this.a) + ")";
    }

    /* synthetic */ cp(List list, co co2) {
        this(list);
    }
}

