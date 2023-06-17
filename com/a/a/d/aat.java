/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.aad;
import com.a.a.d.hp;
import com.a.a.d.nj;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

final class aat
extends hp
implements Serializable,
NavigableSet {
    private final NavigableSet a;
    private transient aat b;
    private static final long c = 0L;

    aat(NavigableSet navigableSet) {
        this.a = (NavigableSet)cl.a(navigableSet);
    }

    @Override
    protected SortedSet c() {
        return Collections.unmodifiableSortedSet(this.a);
    }

    public Object lower(Object object) {
        return this.a.lower(object);
    }

    public Object floor(Object object) {
        return this.a.floor(object);
    }

    public Object ceiling(Object object) {
        return this.a.ceiling(object);
    }

    public Object higher(Object object) {
        return this.a.higher(object);
    }

    public Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    public Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public NavigableSet descendingSet() {
        aat aat2 = this.b;
        if (aat2 == null) {
            aat2 = this.b = new aat(this.a.descendingSet());
            aat2.b = this;
        }
        return aat2;
    }

    public Iterator descendingIterator() {
        return nj.a(this.a.descendingIterator());
    }

    public NavigableSet subSet(Object object, boolean bl2, Object object2, boolean bl3) {
        return aad.a(this.a.subSet(object, bl2, object2, bl3));
    }

    public NavigableSet headSet(Object object, boolean bl2) {
        return aad.a(this.a.headSet(object, bl2));
    }

    public NavigableSet tailSet(Object object, boolean bl2) {
        return aad.a(this.a.tailSet(object, bl2));
    }

    @Override
    protected /* synthetic */ Set bI_() {
        return this.c();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.c();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.c();
    }
}

