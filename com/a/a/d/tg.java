/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.he;
import com.a.a.d.sz;
import java.util.Collection;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

final class tg
extends he {
    final /* synthetic */ NavigableSet a;

    tg(NavigableSet navigableSet) {
        this.a = navigableSet;
    }

    @Override
    protected NavigableSet d() {
        return this.a;
    }

    @Override
    public boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SortedSet headSet(Object object) {
        return sz.a(super.headSet(object));
    }

    @Override
    public SortedSet subSet(Object object, Object object2) {
        return sz.a(super.subSet(object, object2));
    }

    @Override
    public SortedSet tailSet(Object object) {
        return sz.a(super.tailSet(object));
    }

    @Override
    public NavigableSet headSet(Object object, boolean bl2) {
        return sz.a(super.headSet(object, bl2));
    }

    @Override
    public NavigableSet tailSet(Object object, boolean bl2) {
        return sz.a(super.tailSet(object, bl2));
    }

    @Override
    public NavigableSet subSet(Object object, boolean bl2, Object object2, boolean bl3) {
        return sz.a(super.subSet(object, bl2, object2, bl3));
    }

    @Override
    public NavigableSet descendingSet() {
        return sz.a(super.descendingSet());
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

