/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.a;
import com.a.a.d.b;
import com.a.a.d.d;
import com.a.a.d.hi;
import com.a.a.d.sz;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class c
extends hi {
    final Set a;
    final /* synthetic */ a b;

    private c(a a2) {
        this.b = a2;
        this.a = com.a.a.d.a.b(this.b).entrySet();
    }

    @Override
    protected Set bI_() {
        return this.a;
    }

    @Override
    public void clear() {
        this.b.clear();
    }

    @Override
    public boolean remove(Object object) {
        if (!this.a.contains(object)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        com.a.a.d.a.b(this.b.a).remove(entry.getValue());
        this.a.remove(entry);
        return true;
    }

    @Override
    public Iterator iterator() {
        Iterator iterator = this.a.iterator();
        return new d(this, iterator);
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

    /* synthetic */ c(a a2, b b2) {
        this(a2);
    }
}

