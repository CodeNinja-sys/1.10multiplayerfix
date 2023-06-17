/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.aay;
import com.a.a.d.yd;
import java.util.Comparator;
import java.util.SortedSet;

final class aaz {
    private aaz() {
    }

    public static boolean a(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        cl.a(comparator);
        cl.a(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = aaz.a((SortedSet)iterable);
        } else if (iterable instanceof aay) {
            comparator2 = ((aay)iterable).comparator();
        } else {
            return false;
        }
        return comparator.equals(comparator2);
    }

    public static Comparator a(SortedSet sortedSet) {
        yd yd2 = sortedSet.comparator();
        if (yd2 == null) {
            yd2 = yd.d();
        }
        return yd2;
    }
}

