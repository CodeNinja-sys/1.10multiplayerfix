/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.cm;
import com.a.a.d.aad;
import com.a.a.d.ql;
import com.a.a.d.sz;
import com.a.a.d.tv;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

final class yj {
    static Object[] a(Object[] arrobject, int n2) {
        Class<?> class_ = arrobject.getClass().getComponentType();
        Object[] arrobject2 = (Object[])Array.newInstance(class_, n2);
        return arrobject2;
    }

    static Set a(Map map) {
        return Collections.newSetFromMap(map);
    }

    static ql a(ql ql2) {
        return ql2.j();
    }

    static SortedMap a(SortedMap sortedMap, tv tv2) {
        return sortedMap instanceof NavigableMap ? sz.a((NavigableMap)sortedMap, tv2) : sz.b(sortedMap, tv2);
    }

    static SortedMap a(SortedSet sortedSet, bl bl2) {
        return sortedSet instanceof NavigableSet ? sz.a((NavigableSet)sortedSet, bl2) : sz.b(sortedSet, bl2);
    }

    static SortedSet a(SortedSet sortedSet, cm cm2) {
        return sortedSet instanceof NavigableSet ? aad.a((NavigableSet)sortedSet, cm2) : aad.b(sortedSet, cm2);
    }

    static SortedMap a(SortedMap sortedMap, cm cm2) {
        return sortedMap instanceof NavigableMap ? sz.c((NavigableMap)sortedMap, cm2) : sz.d(sortedMap, cm2);
    }

    private yj() {
    }
}

