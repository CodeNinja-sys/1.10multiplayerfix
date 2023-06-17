/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cm;
import com.a.a.d.aal;
import java.util.Comparator;
import java.util.SortedSet;

class aam
extends aal
implements SortedSet {
    aam(SortedSet sortedSet, cm cm2) {
        super(sortedSet, cm2);
    }

    public Comparator comparator() {
        return ((SortedSet)this.a).comparator();
    }

    public SortedSet subSet(Object object, Object object2) {
        return new aam(((SortedSet)this.a).subSet(object, object2), this.b);
    }

    public SortedSet headSet(Object object) {
        return new aam(((SortedSet)this.a).headSet(object), this.b);
    }

    public SortedSet tailSet(Object object) {
        return new aam(((SortedSet)this.a).tailSet(object), this.b);
    }

    public Object first() {
        return this.iterator().next();
    }

    public Object last() {
        SortedSet sortedSet = (SortedSet)this.a;
        Object e2;
        while (!this.b.a(e2 = sortedSet.last())) {
            sortedSet = sortedSet.headSet(e2);
        }
        return e2;
    }
}

