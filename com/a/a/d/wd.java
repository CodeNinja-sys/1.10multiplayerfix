/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.b.dx;
import java.io.Serializable;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

final class wd
implements dx,
Serializable {
    private final Comparator a;

    wd(Comparator comparator) {
        this.a = (Comparator)cl.a(comparator);
    }

    public SortedSet b() {
        return new TreeSet(this.a);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

