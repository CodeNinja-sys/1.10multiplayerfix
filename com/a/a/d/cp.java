/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cm;
import com.a.a.d.cq;
import com.a.a.d.jl;
import com.a.a.d.yd;
import com.a.a.j.i;
import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

final class cp
extends AbstractCollection {
    final jl a;
    final Comparator b;
    final int c;

    cp(Iterable iterable, Comparator comparator) {
        this.a = yd.a(comparator).b(iterable);
        this.b = comparator;
        this.c = cp.a(this.a, comparator);
    }

    private static int a(List list, Comparator comparator) {
        long l2 = 1L;
        int n2 = 1;
        int n3 = 1;
        while (n2 < list.size()) {
            int n4 = comparator.compare(list.get(n2 - 1), list.get(n2));
            if (n4 < 0) {
                l2 *= i.a(n2, n3);
                n3 = 0;
                if (!cm.a(l2)) {
                    return Integer.MAX_VALUE;
                }
            }
            ++n2;
            ++n3;
        }
        if (!cm.a(l2 *= i.a(n2, n3))) {
            return Integer.MAX_VALUE;
        }
        return (int)l2;
    }

    @Override
    public int size() {
        return this.c;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator iterator() {
        return new cq(this.a, this.b);
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof List) {
            List list = (List)object;
            return cm.a(this.a, list);
        }
        return false;
    }

    @Override
    public String toString() {
        return "orderedPermutationCollection(" + this.a + ")";
    }
}

