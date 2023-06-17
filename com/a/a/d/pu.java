/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.gh;
import com.a.a.d.pv;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

class pu
extends gh {
    final Collection a;
    final Set b;

    pu(Collection collection, Set set) {
        this.a = collection;
        this.b = set;
    }

    @Override
    protected Collection b() {
        return this.a;
    }

    @Override
    public Iterator iterator() {
        Iterator iterator = this.b.iterator();
        return new pv(this, iterator);
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
    public boolean contains(Object object) {
        return this.b(object);
    }

    @Override
    public boolean containsAll(Collection collection) {
        return this.a(collection);
    }

    @Override
    public boolean remove(Object object) {
        return this.c(object);
    }

    @Override
    public boolean removeAll(Collection collection) {
        return this.c(collection);
    }

    @Override
    public boolean retainAll(Collection collection) {
        return this.d(collection);
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.b();
    }
}

