/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.hi;
import com.a.a.d.pn;
import com.a.a.d.pt;
import com.a.a.d.sz;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

class ps
extends hi {
    private final pn a;
    private final Set b;

    ps(Set set, pn pn2) {
        this.b = set;
        this.a = pn2;
    }

    @Override
    protected Set bI_() {
        return this.b;
    }

    @Override
    public Iterator iterator() {
        Iterator iterator = this.b.iterator();
        return new pt(this, iterator);
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
        return sz.a((Collection)this.bI_(), object);
    }

    @Override
    public boolean containsAll(Collection collection) {
        return this.a(collection);
    }

    @Override
    public boolean equals(Object object) {
        return this.i(object);
    }

    @Override
    public int hashCode() {
        return this.j();
    }

    @Override
    public boolean remove(Object object) {
        return sz.b((Collection)this.bI_(), object);
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
    protected /* synthetic */ Collection b() {
        return this.bI_();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.bI_();
    }

    static /* synthetic */ pn a(ps ps2) {
        return ps2.a;
    }
}

