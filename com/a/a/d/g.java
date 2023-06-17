/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.a;
import com.a.a.d.b;
import com.a.a.d.hi;
import com.a.a.d.sz;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

class g
extends hi {
    final /* synthetic */ a a;

    private g(a a2) {
        this.a = a2;
    }

    @Override
    protected Set bI_() {
        return com.a.a.d.a.b(this.a).keySet();
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public boolean remove(Object object) {
        if (!this.contains(object)) {
            return false;
        }
        com.a.a.d.a.a(this.a, object);
        return true;
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
    public Iterator iterator() {
        return sz.a(this.a.entrySet().iterator());
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.bI_();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.bI_();
    }

    /* synthetic */ g(a a2, b b2) {
        this(a2);
    }
}

