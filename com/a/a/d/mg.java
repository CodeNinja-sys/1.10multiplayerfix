/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.mf;
import java.io.Serializable;
import java.util.Comparator;

class mg
implements Serializable {
    final Comparator a;
    final Object[] b;
    private static final long c = 0L;

    public mg(Comparator comparator, Object[] arrobject) {
        this.a = comparator;
        this.b = arrobject;
    }

    Object a() {
        return new mf(this.a).c(this.b).c();
    }
}

