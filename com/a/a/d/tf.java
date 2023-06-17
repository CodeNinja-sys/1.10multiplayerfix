/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.hp;
import com.a.a.d.sz;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

final class tf
extends hp {
    final /* synthetic */ SortedSet a;

    tf(SortedSet sortedSet) {
        this.a = sortedSet;
    }

    @Override
    protected SortedSet c() {
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

