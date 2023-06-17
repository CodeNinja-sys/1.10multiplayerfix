/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.uc;
import com.a.a.d.uf;
import java.util.Comparator;
import java.util.SortedSet;

class ug
extends uc
implements SortedSet {
    final /* synthetic */ uf b;

    ug(uf uf2) {
        this.b = uf2;
        super(uf2);
    }

    public Comparator comparator() {
        return this.b.c().comparator();
    }

    public SortedSet subSet(Object object, Object object2) {
        return (SortedSet)this.b.subMap(object, object2).keySet();
    }

    public SortedSet headSet(Object object) {
        return (SortedSet)this.b.headMap(object).keySet();
    }

    public SortedSet tailSet(Object object) {
        return (SortedSet)this.b.tailMap(object).keySet();
    }

    public Object first() {
        return this.b.firstKey();
    }

    public Object last() {
        return this.b.lastKey();
    }
}

