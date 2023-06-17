/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.gh;
import com.a.a.d.pn;
import com.a.a.d.py;
import com.a.a.d.sz;
import java.util.Collection;
import java.util.Iterator;

class px
extends gh {
    final pn a;
    final Collection b;

    px(Collection collection, pn pn2) {
        this.b = collection;
        this.a = pn2;
    }

    @Override
    protected Collection b() {
        return this.b;
    }

    @Override
    public Iterator iterator() {
        Iterator iterator = this.b.iterator();
        return new py(this, iterator);
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
        return sz.a(this.b(), object);
    }

    @Override
    public boolean containsAll(Collection collection) {
        return this.a(collection);
    }

    @Override
    public boolean remove(Object object) {
        return sz.b(this.b(), object);
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

