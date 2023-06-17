/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.dm;
import com.a.a.d.do;
import com.a.a.d.dp;
import com.a.a.d.dq;
import com.a.a.d.dr;
import com.a.a.d.ds;
import com.a.a.d.dt;
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

final class dn {
    private dn() {
    }

    public static Collection a(Collection collection, dm dm2) {
        return new do(collection, dm2);
    }

    public static Set a(Set set, dm dm2) {
        return new ds(set, dm2);
    }

    public static SortedSet a(SortedSet sortedSet, dm dm2) {
        return new dt(sortedSet, dm2);
    }

    public static List a(List list, dm dm2) {
        return list instanceof RandomAccess ? new dr(list, dm2) : new dp(list, dm2);
    }

    private static ListIterator b(ListIterator listIterator, dm dm2) {
        return new dq(listIterator, dm2);
    }

    static Collection b(Collection collection, dm dm2) {
        if (collection instanceof SortedSet) {
            return dn.a((SortedSet)collection, dm2);
        }
        if (collection instanceof Set) {
            return dn.a((Set)collection, dm2);
        }
        if (collection instanceof List) {
            return dn.a((List)collection, dm2);
        }
        return dn.a(collection, dm2);
    }

    private static Collection d(Collection collection, dm dm2) {
        ArrayList arrayList = ov.a(collection);
        for (Object e2 : arrayList) {
            dm2.a(e2);
        }
        return arrayList;
    }

    static /* synthetic */ Collection c(Collection collection, dm dm2) {
        return dn.d(collection, dm2);
    }

    static /* synthetic */ ListIterator a(ListIterator listIterator, dm dm2) {
        return dn.b(listIterator, dm2);
    }
}

