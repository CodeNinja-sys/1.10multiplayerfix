/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.j.g;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.List;

class pb
extends AbstractList {
    final List a;
    final int b;

    pb(List list, int n2) {
        this.a = list;
        this.b = n2;
    }

    public List a(int n2) {
        cl.a(n2, this.size());
        int n3 = n2 * this.b;
        int n4 = Math.min(n3 + this.b, this.a.size());
        return this.a.subList(n3, n4);
    }

    @Override
    public int size() {
        return g.a(this.a.size(), this.b, RoundingMode.CEILING);
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public /* synthetic */ Object get(int n2) {
        return this.a(n2);
    }
}

