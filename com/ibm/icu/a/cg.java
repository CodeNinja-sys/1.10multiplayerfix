/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.util.dn;
import java.lang.ref.SoftReference;
import java.util.Comparator;
import java.util.SortedMap;

class cg {
    private final dn a;
    private SoftReference b;
    private Comparator c;

    cg(SortedMap sortedMap, dn dn2, Comparator comparator) {
        this.a = dn2;
        this.c = comparator;
        this.b = new SoftReference<SortedMap>(sortedMap);
    }

    SortedMap a(dn dn2, Comparator comparator) {
        SortedMap sortedMap = (SortedMap)this.b.get();
        if (sortedMap != null && this.a.equals(dn2) && (this.c == comparator || this.c != null && ((Object)this.c).equals(comparator))) {
            return sortedMap;
        }
        return null;
    }
}

