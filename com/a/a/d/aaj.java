/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.he;
import com.a.a.d.yd;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

class aaj
extends he {
    private final NavigableSet a;

    aaj(NavigableSet navigableSet) {
        this.a = navigableSet;
    }

    @Override
    protected NavigableSet d() {
        return this.a;
    }

    @Override
    public Object lower(Object object) {
        return this.a.higher(object);
    }

    @Override
    public Object floor(Object object) {
        return this.a.ceiling(object);
    }

    @Override
    public Object ceiling(Object object) {
        return this.a.floor(object);
    }

    @Override
    public Object higher(Object object) {
        return this.a.lower(object);
    }

    @Override
    public Object pollFirst() {
        return this.a.pollLast();
    }

    @Override
    public Object pollLast() {
        return this.a.pollFirst();
    }

    @Override
    public NavigableSet descendingSet() {
        return this.a;
    }

    @Override
    public Iterator descendingIterator() {
        return this.a.iterator();
    }

    @Override
    public NavigableSet subSet(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.a.subSet(object2, bl3, object, bl2).descendingSet();
    }

    @Override
    public NavigableSet headSet(Object object, boolean bl2) {
        return this.a.tailSet(object, bl2).descendingSet();
    }

    @Override
    public NavigableSet tailSet(Object object, boolean bl2) {
        return this.a.headSet(object, bl2).descendingSet();
    }

    @Override
    public Comparator comparator() {
        Comparator comparator = this.a.comparator();
        if (comparator == null) {
            return yd.d().a();
        }
        return aaj.a(comparator);
    }

    private static yd a(Comparator comparator) {
        return yd.a(comparator).a();
    }

    @Override
    public Object first() {
        return this.a.last();
    }

    @Override
    public SortedSet headSet(Object object) {
        return this.g(object);
    }

    @Override
    public Object last() {
        return this.a.first();
    }

    @Override
    public SortedSet subSet(Object object, Object object2) {
        return this.a(object, object2);
    }

    @Override
    public SortedSet tailSet(Object object) {
        return this.h(object);
    }

    @Override
    public Iterator iterator() {
        return this.a.descendingIterator();
    }

    @Override
    public Object[] toArray() {
        return this.r();
    }

    @Override
    public Object[] toArray(Object[] arrobject) {
        return this.a(arrobject);
    }

    @Override
    public String toString() {
        return this.p();
    }

    @Override
    protected /* synthetic */ SortedSet c() {
        return this.d();
    }

    @Override
    protected /* synthetic */ Set bI_() {
        return this.d();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.d();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.d();
    }
}

