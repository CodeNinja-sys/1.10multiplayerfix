/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.dx;
import java.io.Serializable;
import java.util.Comparator;
import java.util.TreeMap;

class aeo
implements dx,
Serializable {
    final Comparator a;
    private static final long b = 0L;

    aeo(Comparator comparator) {
        this.a = comparator;
    }

    public TreeMap b() {
        return new TreeMap(this.a);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

